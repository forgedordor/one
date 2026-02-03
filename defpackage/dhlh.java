package defpackage;

import java.io.IOException;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhlh implements dhld {
    private static final ekhx a = ekhx.s(new QName("urn:oma:xml:xdm:common-policy", "external-list"), new QName("urn:oma:xml:xdm:common-policy", "anonymous-request"), new QName("urn:oma:xml:xdm:common-policy", "other-identity"));
    private static final ekhx b = ekhx.s(dhlg.class, dhlj.class, dhlk.class);

    @Override // defpackage.dhld
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        if (!"external-list".equals(qName.getLocalPart())) {
            if ("other-identity".equals(qName.getLocalPart())) {
                return new dhlk();
            }
            if ("anonymous-request".equals(qName.getLocalPart())) {
                return new dhlg();
            }
            throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
        }
        dhlj dhljVar = new dhlj();
        String name = xmlPullParser.getName();
        int iNextTag = xmlPullParser.nextTag();
        String name2 = xmlPullParser.getName();
        while (true) {
            if ((iNextTag == 3) && name2.equals(name)) {
                return dhljVar;
            }
            if (name2.equals("entry") && (attributeValue = xmlPullParser.getAttributeValue("", "anc")) != null) {
                dhljVar.a.add(new dhli(attributeValue));
            }
            iNextTag = xmlPullParser.nextTag();
            name2 = xmlPullParser.getName();
        }
    }

    @Override // defpackage.dhld
    public final Set b() {
        return a;
    }

    @Override // defpackage.dhld
    public final Set c() {
        return b;
    }

    @Override // defpackage.dhld
    public final void d(Object obj, XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        if (obj instanceof dhlj) {
            ((dhlj) obj).c(xmlSerializer);
            return;
        }
        if (obj instanceof dhlk) {
            xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "other-identity");
            xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "other-identity");
        } else if (obj instanceof dhlg) {
            xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "anonymous-request");
            xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "anonymous-request");
        }
    }
}
