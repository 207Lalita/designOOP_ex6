public class ServerWOFacade {
    public static void main(String[] args) {
		ServerManage serverManage = new ServerManage();
		serverManage.serverStart();
		serverManage.serverShutdown();
    }
    
}
