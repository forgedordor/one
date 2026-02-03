package defpackage;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnj {
    private String a;
    private String b;

    public final void a(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "display-name");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("http://www.w3.org/XML/1998/namespace", "lang", str);
        }
        xmlSerializer.text(this.a);
        xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "display-name");
    }

    public final void b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/XML/1998/namespace", "lang");
        if (attributeValue != null) {
            this.b = attributeValue;
        }
        this.a = xmlPullParser.nextText();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhnj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        dhnj dhnjVar = (dhnj) obj;
        String str = this.b;
        if (str == null) {
            if (dhnjVar.b != null) {
                return false;
            }
        } else if (!str.equals(dhnjVar.b)) {
            return false;
        }
        String str2 = this.a;
        if (str2 != null || dhnjVar.a == null) {
            return str2.equals(dhnjVar.a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        return ((iHashCode + 31) * 31) + (str2 != null ? str2.hashCode() : 0);
    }
}
