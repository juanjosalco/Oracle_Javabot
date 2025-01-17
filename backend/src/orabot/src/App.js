import { useEffect } from "react";
import "./App.css";
import { LoginScreen } from "./features/Authentication/Views/LoginScreen";
import { RecoverScreen } from "./features/Authentication/Views/RecoverScreen";
import { TicketScreen } from "./features/Authentication/Views/TicketScreen";
import { DashboardScreen } from "./features/Dashboard/Views/DashboardScreen";
import { RouterProvider, Route, createBrowserRouter } from "react-router-dom";
import { TaskInformationScreen } from "./features/TasksManagment/Views/TaskInformationScreen";

import { UserProvider } from "./providers/user/UserProvider";

const tele = window.Telegram.WebApp;

function App() {

  useEffect(() => {
    tele.ready();
  }, []);

  const router = createBrowserRouter([
    {
      path: "/",
      element: <LoginScreen />,
    },
    {
      path: "/recover",
      element: <RecoverScreen />,
    },
    {
      path: "/ticket",
      element: <TicketScreen />,
    },
    {
      path: "/dashboard",
      element: <DashboardScreen />,
    },
    {
      path: "/task/:id",
      element: <TaskInformationScreen />,
    },
    {
      path: "/task/add",
      element: <TaskInformationScreen isNewTask={true} />,
    },
  ]);

  return (
    <div className="App">
      <UserProvider>
        <RouterProvider router={router}>
          <Route />
        </RouterProvider>
      </UserProvider>
    </div>
  );
}

export default App;
