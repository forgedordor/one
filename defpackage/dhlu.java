package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhlu implements dhld {
    private static final ekhx a = new ekph(new QName("urn:oma:xml:prs:pidf:oma-pres", "overriding-willingness"));
    private static final ekhx b = new ekph(dhlv.class);
    private final fcsu c;

    public dhlu(fcsu fcsuVar) {
        this.c = fcsuVar;
    }

    @Override // defpackage.dhld
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (!"overriding-willingness".equals(qName.getLocalPart())) {
            throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
        }
        dhlv dhlvVar = (dhlv) this.c.b();
        int iNextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        if (xmlPullParser.getAttributeValue("urn:oma:xml:pde:pidf:ext", "until") != null) {
            String attributeValue = xmlPullParser.getAttributeValue("urn:oma:xml:pde:pidf:ext", "until");
            if (!Objects.isNull(attributeValue)) {
                dhlvVar.c = dhlf.b(attributeValue);
            }
        }
        while (true) {
            if ((iNextTag == 3) && name.equals("overriding-willingness")) {
                return dhlvVar;
            }
            if (!"urn:oma:xml:pde:pidf:ext".equals(namespace) && !"urn:oma:params:xml:ns:pidf:oma-pres".equals(namespace)) {
                if (dhlvVar.a == null) {
                    dhlvVar.a = new ArrayList();
                }
                dhlvVar.a.add(((dhlq) dhlvVar.d.b()).a(document, new QName(namespace, name), xmlPullParser));
            } else if (name.equals("basic")) {
                dhlvVar.b = dhly.a(xmlPullParser.nextText());
            }
            iNextTag = xmlPullParser.nextTag();
            name = xmlPullParser.getName();
            namespace = xmlPullParser.getNamespace();
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
    public final void d(Object obj, XmlSerializer xmlSerializer) throws IllegalStateException, DOMException, IOException, IllegalArgumentException {
        if (obj instanceof dhlv) {
            ((dhlv) obj).c(xmlSerializer);
        }
    }
}
