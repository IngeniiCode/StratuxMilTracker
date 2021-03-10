package com.daviddemartini.stratux.miltracker.comms.stratux;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MilContactFeed {

    private int feedSocketPort = 9103;


    /**
     * Constructor
     *
     * Expects a port to be passed, but will use the pre-configured
     * default if it is not
     *
     * @param port - integer port number to bind
     */
    public MilContactFeed(int port) throws IOException {
        // save the port
        this.feedSocketPort = port;

    }
    public MilContactFeed() throws IOException {
        new InRangeMilContactFeed(feedSocketPort);
    }

}