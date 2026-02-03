package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmi implements dhmq, dhmj {
    private dhna a;
    private dhmo b;
    private dhmo c;
    private dhmh d;
    private dhmh e;
    private String f = "urn:ogc:def:crs:EPSG::4326";

    @Override // defpackage.dhmj
    public final void a(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "base");
        this.f = null;
        c(xmlSerializer);
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "base");
    }

    @Override // defpackage.dhmj
    public final void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f = xmlPullParser.getAttributeValue("", "srsName");
        int iNextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        while (true) {
            if ((iNextTag == 3) && name.equalsIgnoreCase("ArcBand")) {
                return;
            }
            if ("http://www.opengis.net/pidflo/1.0".equals(namespace)) {
                if (name.equalsIgnoreCase("outerRadius")) {
                    dhmo dhmoVar = new dhmo("outerRadius");
                    this.c = dhmoVar;
                    dhmoVar.b(xmlPullParser);
                }
                if (name.equalsIgnoreCase("innerRadius")) {
                    dhmo dhmoVar2 = new dhmo("innerRadius");
                    this.b = dhmoVar2;
                    dhmoVar2.b(xmlPullParser);
                }
                if (name.equalsIgnoreCase("startAngle")) {
                    dhmh dhmhVar = new dhmh("startAngle");
                    this.d = dhmhVar;
                    dhmhVar.b(xmlPullParser);
                }
                if (name.equalsIgnoreCase("openingAngle")) {
                    dhmh dhmhVar2 = new dhmh("openingAngle");
                    this.e = dhmhVar2;
                    dhmhVar2.b(xmlPullParser);
                }
            } else if ("http://www.opengis.net/gml".equals(namespace) && name.equalsIgnoreCase("pos")) {
                dhna dhnaVar = new dhna();
                this.a = dhnaVar;
                dhnaVar.d(xmlPullParser);
            }
            iNextTag = xmlPullParser.nextTag();
            name = xmlPullParser.getName();
            namespace = xmlPullParser.getNamespace();
        }
    }

    @Override // defpackage.dhmq, defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "ArcBand");
        String str = this.f;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        dhna dhnaVar = this.a;
        if (dhnaVar != null) {
            dhnaVar.c(xmlSerializer);
        }
        dhmo dhmoVar = this.b;
        if (dhmoVar != null) {
            dhmoVar.a(xmlSerializer);
        }
        dhmo dhmoVar2 = this.c;
        if (dhmoVar2 != null) {
            dhmoVar2.a(xmlSerializer);
        }
        dhmh dhmhVar = this.d;
        if (dhmhVar != null) {
            dhmhVar.a(xmlSerializer);
        }
        dhmh dhmhVar2 = this.e;
        if (dhmhVar2 != null) {
            dhmhVar2.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "ArcBand");
    }

    @Override // defpackage.dhmj
    public final boolean equals(Object obj) {
        if (!(obj instanceof dhmi)) {
            return false;
        }
        dhmi dhmiVar = (dhmi) obj;
        return Objects.equals(this.b, dhmiVar.b) && Objects.equals(this.e, dhmiVar.e) && Objects.equals(this.c, dhmiVar.c) && this.a.equals(dhmiVar.a) && Objects.equals(this.d, dhmiVar.d) && Objects.equals(this.f, dhmiVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Objects.toString(this.b, ""), Objects.toString(this.e, ""), Objects.toString(this.c, ""), this.a, Objects.toString(this.d, ""), Objects.toString(this.f, "")});
    }
}
