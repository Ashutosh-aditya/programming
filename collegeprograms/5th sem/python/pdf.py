import PyPDF2

# Create a new PDF
pdf_writer = PyPDF2.PdfFileWriter()

# Add a page to the PDF
pdf_writer.addPage(PyPDF2.PdfFileReader(open("source.pdf", "rb")).getPage(0))

# Save the PDF
with open("new.pdf", "wb") as pdf_file:
    pdf_writer.write(pdf_file)
