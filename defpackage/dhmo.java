package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmo {
    public Double a;
    private final String b;
    private String c;

    public dhmo(Double d) {
        this.c = "urn:ogc:def:uom:EPSG::9001";
        this.b = "radius";
        this.a = d;
    }

    public final void a(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        String str = this.b;
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", str);
        xmlSerializer.attribute("", "uom", String.valueOf(this.c));
        Double d = this.a;
        if (d != null) {
            xmlSerializer.text(d.toString());
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", str);
    }

    public final void b(XmlPullParser xmlPullParser) {
        this.c = xmlPullParser.getAttributeValue("", "uom");
        this.a = Double.valueOf(xmlPullParser.nextText());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhmo)) {
            return false;
        }
        dhmo dhmoVar = (dhmo) obj;
        return this.b.equals(dhmoVar.b) && eolk.b(this.a.doubleValue(), dhmoVar.a.doubleValue(), 1.0E-5d) && Objects.equals(this.c, dhmoVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, Objects.toString(this.c, "")});
    }

    public dhmo(String str) {
        this.c = "urn:ogc:def:uom:EPSG::9001";
        this.b = str;
    }
}
