interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Word file opened");
    }
}
class PdfDocument implements Document {
    public void open() {
        System.out.println("PDF file opened");
    }
}
class ExcelDocument implements Document {
    public void open() {
        System.out.println("Excel sheet opened");
    }
}
class TextDocument implements Document {
    public void open() {
        System.out.println("Text file opened");
    }
}

// Factory class
abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
class TextFactory extends DocumentFactory {
    public Document createDocument() {
        return new TextDocument();
    }
}

public class FactoryMethodPatternExample {

    public static void main(String[] args) {

        System.out.println("Document System\n");

        DocumentFactory wordFactory = new WordFactory();
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new ExcelFactory();
        Document excel = excelFactory.createDocument();
        excel.open();

        DocumentFactory textFactory = new TextFactory();
        Document text = textFactory.createDocument();
        text.open();
    }
}
