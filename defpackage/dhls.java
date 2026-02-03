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
public final class dhls implements dhld {
    private static final ekhx a = new ekph(new QName("urn:ietf:params:xml:ns:pidf:cipid", "display-name"));
    private static final ekhx b = new ekph(dhlt.class);

    @Override // defpackage.dhld
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) throws XmlPullParserException {
        if (!"display-name".equals(qName.getLocalPart())) {
            throw new XmlPullParserException("Unknown local part: ".concat(String.valueOf(qName.getLocalPart())));
        }
        dhlt dhltVar = new dhlt();
        dhltVar.a = xmlPullParser.nextText();
        return dhltVar;
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
        if (obj instanceof dhlt) {
            ((dhlt) obj).c(xmlSerializer);
        }
    }
}
