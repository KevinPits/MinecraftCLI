package org.example;

import net.querz.nbt.io.snbt.ParseException;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import net.querz.nbt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@Command(name = "mc-cli", version = "Minecraft CLI tool 0.1", mixinStandardHelpOptions = true)
public class MinecraftCLI implements Runnable {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new MinecraftCLI()).execute(args);
        System.exit(exitCode);
    }

    @Option(names = {"-s", "--font-size"}, description = "Font size")
    int fontSize = 19;

    @Parameters(paramLabel = "<word>", defaultValue = "Hello, picocli",
            description = "Words to be translated into ASCII art.")
    private String[] words = {"Hello,", "picocli"};

    @Override
    public void run() {
        // Do the stuff
        try {
            Tag tag = NBTUtil.fromSNBT("hi");
        } catch(Exception e) {
            // What do you want from me???
            System.out.println(e.toString());
        }
    }


}