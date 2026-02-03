package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnd implements dhle {
    private List a;
    private List b;
    private dhma c;
    private Date d;
    private Date e;
    private final fcsu f;

    public dhnd(fcsu fcsuVar) {
        this.f = fcsuVar;
    }

    public final String a() {
        dhma dhmaVar = this.c;
        if (dhmaVar == null) {
            return null;
        }
        return dhmaVar.a;
    }

    public final List b() {
        if (this.a == null) {
            this.a = new ArrayList(3);
        }
        return this.a;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:rpid", "place-type");
        Date date = this.e;
        if (date != null && this.d != null) {
            xmlSerializer.attribute("urn:ietf:params:xml:ns:pidf:rpid", "from", dhlf.a(date));
            xmlSerializer.attribute("urn:ietf:params:xml:ns:pidf:rpid", "until", dhlf.a(this.d));
        }
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dhma) it.next()).a(xmlSerializer, "urn:ietf:params:xml:ns:pidf:rpid");
            }
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:rpid", "other");
            xmlSerializer.text(this.c.a);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:rpid", "other");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:rpid", "place-type");
    }

    public final List d() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    public final void e(Document document, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue("urn:ietf:params:xml:ns:pidf:rpid", "from");
        if (attributeValue != null) {
            this.e = dhlf.b(attributeValue);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("urn:ietf:params:xml:ns:pidf:rpid", "until");
        if (attributeValue2 != null) {
            this.d = dhlf.b(attributeValue2);
        }
        int iNextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        while (true) {
            if ((iNextTag == 3) && name.equals("place-type")) {
                return;
            }
            if (!"urn:ietf:params:xml:ns:pidf:rpid".equals(namespace)) {
                b().add(((dhlq) this.f.b()).a(document, new QName(namespace, name), xmlPullParser));
            } else if ("note".equals(name)) {
                dhma dhmaVar = new dhma();
                dhmaVar.b(xmlPullParser);
                d().add(dhmaVar);
            } else if ("other".equals(name)) {
                this.c = new dhma(xmlPullParser.nextText());
            } else {
                b().add(((dhlq) this.f.b()).a(document, new QName(namespace, name), xmlPullParser));
            }
            iNextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name = xmlPullParser.getName();
        }
    }

    public final boolean equals(Object obj) {
        long seconds;
        if (!(obj instanceof dhnd)) {
            return false;
        }
        dhnd dhndVar = (dhnd) obj;
        if (this.b != null && dhndVar.d() != null && this.b.size() != dhndVar.d().size()) {
            return false;
        }
        long seconds2 = 0;
        if (this.d == null || dhndVar.d == null) {
            seconds = 0;
        } else {
            seconds2 = TimeUnit.MILLISECONDS.toSeconds(this.d.getTime());
            seconds = TimeUnit.MILLISECONDS.toSeconds(dhndVar.d.getTime());
        }
        return seconds2 == seconds && Objects.equals(a(), dhndVar.a());
    }
}
