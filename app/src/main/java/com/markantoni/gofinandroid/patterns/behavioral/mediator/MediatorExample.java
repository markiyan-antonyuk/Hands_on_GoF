package com.markantoni.gofinandroid.patterns.behavioral.mediator;

public class MediatorExample {
    public static class Client {
        private Protocol mProtocol;

        public void setProtocol(Protocol protocol) {
            mProtocol = protocol;
            mProtocol.setClient(this);
        }

        public String sendRequest() {
            return mProtocol.getServer().sendResponse();
        }
    }

    public static class Server {
        private Protocol mProtocol;

        public void setProtocol(Protocol protocol) {
            mProtocol = protocol;
            mProtocol.setServer(this);
        }

        public String sendResponse() {
            return "This is response";
        }
    }

    //mediator
    public static class Protocol {
        private Client mClient;
        private Server mServer;

        public void setClient(Client client) {
            mClient = client;
        }

        public void setServer(Server server) {
            mServer = server;
        }

        public Client getClient() {
            return mClient;
        }

        public Server getServer() {
            return mServer;
        }
    }
}
