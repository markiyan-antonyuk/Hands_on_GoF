package com.markantoni.gofinandroid.patterns.behavioral.mediator;

import com.markantoni.gofinandroid.interfaces.IPatternModel;
import com.markantoni.gofinandroid.patterns.PatternPresenter;

/**
 * Created by mark on 11/21/16.
 */

public class MediatorPresenter extends PatternPresenter {
    @Override
    protected IPatternModel generateModel() {
        return new MediatorModel();
    }

    @Override
    public void patternUsage() {
        MediatorExample.Client client = new MediatorExample.Client();
        MediatorExample.Server server = new MediatorExample.Server();
        MediatorExample.Protocol protocol = new MediatorExample.Protocol();

        client.setProtocol(protocol);
        server.setProtocol(protocol);

        client.sendRequest(); //it returns response from server, however client doesn't know anything about server
    }
}
