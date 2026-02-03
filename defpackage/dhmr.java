package defpackage;

import java.io.IOException;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmr implements dhld {
    public static final ekhx a = new ekph(new QName("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv"));
    public static final ekhx b = new ekph(dhmn.class);
    private final fcsu c;

    public dhmr(fcsu fcsuVar) {
        this.c = fcsuVar;
    }

    @Override // defpackage.dhld
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (!qName.getLocalPart().equals("geopriv")) {
            throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
        }
        dhmn dhmnVar = (dhmn) this.c.b();
        dhmnVar.b(document, xmlPullParser);
        return dhmnVar;
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
    public final void d(Object obj, XmlSerializer xmlSerializer) throws IllegalStateException, DOMException, IOException, IllegalArgumentException {
        if (obj instanceof dhmn) {
            ((dhmn) obj).c(xmlSerializer);
        }
    }
}
