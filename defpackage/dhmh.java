package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmh {
    private final String a;
    private Double b;
    private String c;

    public dhmh(String str) {
        this.a = str;
    }

    public final void a(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        String str = this.a;
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", str);
        xmlSerializer.attribute("", "uom", String.valueOf(this.c));
        if (!Objects.isNull(this.b)) {
            xmlSerializer.text(String.valueOf(this.b));
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", str);
    }

    public final void b(XmlPullParser xmlPullParser) {
        this.c = xmlPullParser.getAttributeValue("", "uom");
        this.b = Double.valueOf(xmlPullParser.nextText());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhmh)) {
            return false;
        }
        dhmh dhmhVar = (dhmh) obj;
        return this.a.equals(dhmhVar.a) && eolk.b(this.b.doubleValue(), dhmhVar.b.doubleValue(), 1.0E-5d) && Objects.equals(this.c, dhmhVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, String.valueOf(this.c)});
    }
}
