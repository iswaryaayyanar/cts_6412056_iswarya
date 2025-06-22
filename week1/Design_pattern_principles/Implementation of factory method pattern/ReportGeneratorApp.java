public class ReportGeneratorApp {
    public static void main(String[] args) {
        ReportCreator textCreator = new TextReportCreator();
        Report textReport = textCreator.generateReport();
        textReport.view();
        textReport.export();

        ReportCreator csvCreator = new CsvReportCreator();
        Report csvReport = csvCreator.generateReport();
        csvReport.view();
        csvReport.export();

        ReportCreator slideCreator = new SlideReportCreator();
        Report slideReport = slideCreator.generateReport();
        slideReport.view();
        slideReport.export();
    }
}

interface Report {
    void view();
    void export();
}

class TextReport implements Report {
    public void view() {
        System.out.println("Viewing Text Report");
    }

    public void export() {
        System.out.println("Exporting Text Report");
    }
}

class CsvReport implements Report {
    public void view() {
        System.out.println("Viewing CSV Report");
    }

    public void export() {
        System.out.println("Exporting CSV Report");
    }
}

class SlideReport implements Report {
    public void view() {
        System.out.println("Viewing Slide Report");
    }

    public void export() {
        System.out.println("Exporting Slide Report");
    }
}

abstract class ReportCreator {
    public abstract Report generateReport();
}

class TextReportCreator extends ReportCreator {
    public Report generateReport() {
        return new TextReport();
    }
}

class CsvReportCreator extends ReportCreator {
    public Report generateReport() {
        return new CsvReport();
    }
}

class SlideReportCreator extends ReportCreator {
    public Report generateReport() {
        return new SlideReport();
    }
}
