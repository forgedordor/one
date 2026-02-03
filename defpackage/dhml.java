package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhml implements dhmq {
    public dhna a;
    public dhmo b;
    public dhmo c;
    public dhmh d;
    public String e = "urn:ogc:def:crs:EPSG::4326";

    @Override // defpackage.dhmq, defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Ellipse");
        xmlSerializer.attribute("", "srsName", String.valueOf(this.e));
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
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Ellipse");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhml)) {
            return false;
        }
        dhml dhmlVar = (dhml) obj;
        return this.d.equals(dhmlVar.d) && this.a.equals(dhmlVar.a) && this.b.equals(dhmlVar.b) && this.c.equals(dhmlVar.c) && Objects.equals(this.e, dhmlVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b, this.c, Objects.toString(this.e, "")});
    }
}
