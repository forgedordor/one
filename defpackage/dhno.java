package defpackage;

import com.android.vcard.VCardBuilder;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhno implements dhle {
    private ArrayList a;
    private ArrayList b;

    public static dhno a(Reader reader) throws XmlPullParserException, DOMException, IOException {
        dhno dhnoVar = new dhno();
        try {
            Document documentC = dhlf.c();
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(reader);
            int iNextTag = xmlPullParserNewPullParser.nextTag();
            String namespace = xmlPullParserNewPullParser.getNamespace();
            String name = xmlPullParserNewPullParser.getName();
            while (true) {
                if ((iNextTag == 3) && name.equals("resource-lists")) {
                    return dhnoVar;
                }
                if (!"urn:ietf:params:xml:ns:resource-lists".equals(namespace)) {
                    Element elementD = dhlf.d(documentC, xmlPullParserNewPullParser);
                    if (dhnoVar.b == null) {
                        dhnoVar.b = new ArrayList(1);
                    }
                    dhnoVar.b.add(elementD);
                } else if (name.equals("list")) {
                    dhnn dhnnVar = new dhnn();
                    dhnnVar.a(documentC, xmlPullParserNewPullParser);
                    dhnoVar.b().add(dhnnVar);
                }
                iNextTag = xmlPullParserNewPullParser.nextTag();
                namespace = xmlPullParserNewPullParser.getNamespace();
                name = xmlPullParserNewPullParser.getName();
            }
        } catch (ParserConfigurationException e) {
            throw new IOException(e.getMessage());
        } catch (XmlPullParserException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static void d(dhno dhnoVar, OutputStream outputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        try {
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            xmlSerializerNewSerializer.setOutput(outputStream, "utf-8");
            xmlSerializerNewSerializer.setPrefix("", "urn:ietf:params:xml:ns:resource-lists");
            xmlSerializerNewSerializer.setPrefix("cc", "urn:ietf:params:xml:ns:copycontrol");
            xmlSerializerNewSerializer.startDocument("utf-8", false);
            xmlSerializerNewSerializer.flush();
            outputStream.write(VCardBuilder.VCARD_END_OF_LINE.getBytes());
            outputStream.flush();
            dhnoVar.c(xmlSerializerNewSerializer);
            xmlSerializerNewSerializer.endDocument();
            xmlSerializerNewSerializer.flush();
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static byte[] e(dhno dhnoVar) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(BasePaymentResult.ERROR_REQUEST_FAILED);
        d(dhnoVar, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final List b() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "resource-lists");
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dhnn dhnnVar = (dhnn) arrayList.get(i);
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "list");
                dhnnVar.b(xmlSerializer);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "list");
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "resource-lists");
    }
}
