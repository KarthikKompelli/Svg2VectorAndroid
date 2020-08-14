package com.vector.svg2vectorandroid;

/**
 * Created by ravi on 19/12/17.
 */
public class Runner {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println(" Provide source directory as first arguement for svg files to be converted\n example: java -jar Svg2VectorAndroid-1.0.jar <SourceDirectoryPath> ");
            return;
        }

        SvgFilesProcessor processor;
        switch (args.length) {
            case 1:
                processor = new SvgFilesProcessor(args[0]);
                break;
            case 2:
                processor = new SvgFilesProcessor(args[0], args[1]);
                break;
            case 3:
                processor = new SvgFilesProcessor(args[0], args[1], args[2]);
                break;
            default:
                processor = new SvgFilesProcessor(args[0], args[1], args[2], args[3]);
        }
        processor.process();
    }
}
