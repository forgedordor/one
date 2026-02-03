package defpackage;

import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmk implements dhmq {
    public dhna a;
    public dhmo b;
    private final String c = "urn:ogc:def:crs:EPSG::4326";

    public dhmk() {
    }

    @Override // defpackage.dhmq, defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Circle");
        xmlSerializer.attribute("", "srsName", this.c);
        dhna dhnaVar = this.a;
        if (dhnaVar != null) {
            dhnaVar.c(xmlSerializer);
        }
        dhmo dhmoVar = this.b;
        if (dhmoVar != null) {
            dhmoVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Circle");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhmk)) {
            return false;
        }
        dhmk dhmkVar = (dhmk) obj;
        return this.a.equals(dhmkVar.a) && this.b.equals(dhmkVar.b) && this.c.equals(dhmkVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return String.valueOf(String.valueOf(this.a)).concat(String.valueOf(String.valueOf(this.b)));
    }

    public dhmk(dhna dhnaVar, Double d) {
        this.a = dhnaVar;
        this.b = new dhmo(d);
    }
}
