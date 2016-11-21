package com.markantoni.gofinandroid.patterns.behavioral.mediator;

import com.markantoni.gofinandroid.R;
import com.markantoni.gofinandroid.interfaces.IPatternModel;

/**
 * Created by mark on 11/21/16.
 */

public class MediatorModel implements IPatternModel {
    @Override
    public String getLinkToDiagram() {
        return "http://www.dofactory.com/images/diagrams/net/mediator.gif";
    }

    @Override
    public String getDescription() {
        return "Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.";
    }

    @Override
    public String getCodeSample() {
        return "public static class Client {\n" +
                "    private Protocol mProtocol;\n" +
                "\n" +
                "    public void setProtocol(Protocol protocol) {\n" +
                "        mProtocol = protocol;\n" +
                "        mProtocol.setClient(this);\n" +
                "    }\n" +
                "\n" +
                "    public String sendRequest() {\n" +
                "        return mProtocol.getServer().sendResponse();\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public static class Server {\n" +
                "    private Protocol mProtocol;\n" +
                "\n" +
                "    public void setProtocol(Protocol protocol) {\n" +
                "        mProtocol = protocol;\n" +
                "        mProtocol.setServer(this);\n" +
                "    }\n" +
                "\n" +
                "    public String sendResponse() {\n" +
                "        return \"This is response\";\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "//mediator\n" +
                "public static class Protocol {\n" +
                "    private Client mClient;\n" +
                "    private Server mServer;\n" +
                "\n" +
                "    public void setClient(Client client) {\n" +
                "        mClient = client;\n" +
                "    }\n" +
                "\n" +
                "    public void setServer(Server server) {\n" +
                "        mServer = server;\n" +
                "    }\n" +
                "\n" +
                "    public Client getClient() {\n" +
                "        return mClient;\n" +
                "    }\n" +
                "\n" +
                "    public Server getServer() {\n" +
                "        return mServer;\n" +
                "    }\n" +
                "}\n";
    }

    @Override
    public int getTitleRes() {
        return R.string.mediator;
    }
}
