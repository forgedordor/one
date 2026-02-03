package defpackage;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhns implements dhle {
    private String a;
    private String b;

    public final void a(XmlPullParser xmlPullParser) {
        this.b = xmlPullParser.getAttributeValue("http://www.w3.org/XML/1998/namespace", "lang");
        this.a = xmlPullParser.nextText();
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:rlmi", "name");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("http://www.w3.org/XML/1998/namespace", "lang", str);
        }
        xmlSerializer.text(this.a);
        xmlSerializer.endTag("urn:ietf:params:xml:ns:rlmi", "name");
    }
}
