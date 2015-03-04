package com.grapeshot.halfnes;

//HalfNES, Copyright Andrew Hoffman, October 2010
import java.io.*;

import javax.swing.*;

import org.threadly.util.debug.Profiler;

public class halfNES {
	public static final Profiler p = new Profiler();

    private static final long serialVersionUID = -7269569171056445433L;

    public static void main(String[] args) throws IOException {
    	p.start();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Could not set system look and feel. Meh.");
        }
        com.grapeshot.halfnes.NES thing = new com.grapeshot.halfnes.NES();
        if (args == null || args.length < 1 || args[0] == null) {
            thing.run("/mnt/raid6/sync/luke/games.roms/NES/USA/1943 (U).nes");
        } else {
            thing.run(args[0]);
        }


    }
}