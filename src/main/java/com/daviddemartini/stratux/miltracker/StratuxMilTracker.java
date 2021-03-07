package com.daviddemartini.stratux.miltracker;

import com.daviddemartini.stratux.miltracker.comms.stratux.TrafficWebSocket;
import com.daviddemartini.stratux.miltracker.util.Args;

public class StratuxMilTracker {

    public static void main (String[] args){
        // process the CL args..
        try {
            // Process args from commandline
            Args clArgs = new Args(args);
            System.out.println("\tWebsocket = " + clArgs.getSocketUrl());
            // Setup stream reader
            TrafficWebSocket socket = new TrafficWebSocket(clArgs.getSocketUrl());



        }
        catch (Exception e) {
            System.err.printf("\n** Fatal Error -- %s\n",e.toString());
            System.exit(9);
        }

    }
}
