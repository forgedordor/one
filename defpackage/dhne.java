package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhne implements dhld {
    public static final ekhx a = ekhx.s(new QName("urn:ietf:params:xml:ns:pidf:rpid", "status-icon"), new QName("urn:ietf:params:xml:ns:pidf:rpid", "class"), new QName("urn:ietf:params:xml:ns:pidf:rpid", "place-type"));
    public static final ekhx b = ekhx.s(dhnf.class, dhnc.class, dhnd.class);
    private final fcsu c;

    public dhne(fcsu fcsuVar) {
        this.c = fcsuVar;
    }

    @Override // defpackage.dhld
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (!qName.getLocalPart().equals("status-icon")) {
            if (qName.getLocalPart().equals("class")) {
                dhnc dhncVar = new dhnc();
                dhncVar.a = xmlPullParser.nextText();
                return dhncVar;
            }
            if (!qName.getLocalPart().equals("place-type")) {
                throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
            }
            dhnd dhndVar = (dhnd) this.c.b();
            dhndVar.e(document, xmlPullParser);
            return dhndVar;
        }
        dhnf dhnfVar = new dhnf();
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeNamespace = xmlPullParser.getAttributeNamespace(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName.equals("id")) {
                dhnfVar.c = attributeValue;
            } else if (attributeName.equals("from")) {
                dhnfVar.a = dhlf.b(attributeValue);
            } else if (attributeName.equals("until")) {
                dhnfVar.b = dhlf.b(attributeValue);
            } else {
                if (dhnfVar.e == null) {
                    dhnfVar.e = new HashMap();
                }
                dhnfVar.e.put(new QName(attributeNamespace, attributeName), attributeValue);
            }
        }
        dhnfVar.d = xmlPullParser.nextText();
        return dhnfVar;
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
        if (obj instanceof dhnf) {
            ((dhnf) obj).c(xmlSerializer);
        } else if (obj instanceof dhnc) {
            ((dhnc) obj).c(xmlSerializer);
        } else if (obj instanceof dhnd) {
            ((dhnd) obj).c(xmlSerializer);
        }
    }
}
