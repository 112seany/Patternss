package creational.singelton;

    public class ProgramLogger {
        private static ProgramLogger PROGRAMM_LOGGER;
        private static String LOG_FILE = "This is log file. \n\n";

        public static synchronized ProgramLogger getProgramLogger() {
            if(PROGRAMM_LOGGER == null) {
                PROGRAMM_LOGGER = new ProgramLogger();
            }
            return PROGRAMM_LOGGER;
        }
        private ProgramLogger() {

        }

        public void addLogInfo(String logInfo) {
            LOG_FILE += logInfo + "\n";
         }

         public void showLogFile() {
             System.out.println(LOG_FILE);
         }
}
