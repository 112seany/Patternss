package main.java.creational.singelton;

    public class ProgramRunner {
        public static void main(String[] args) {
            ProgramLogger.getProgramLogger().addLogInfo("Dimidroll");
            ProgramLogger.getProgramLogger().addLogInfo("Sexgay");
            ProgramLogger.getProgramLogger().addLogInfo("Test");

            ProgramLogger.getProgramLogger().showLogFile();

    }
}
