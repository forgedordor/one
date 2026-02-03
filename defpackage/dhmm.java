package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmm implements dhmq {
    public String a = "urn:ogc:def:crs:EPSG::4979";
    public dhna b;
    public dhmo c;
    public dhmo d;
    public dhmo e;
    public dhmh f;

    @Override // defpackage.dhmq, defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Ellipsoid");
        String str = this.a;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        dhna dhnaVar = this.b;
        if (dhnaVar != null) {
            dhnaVar.c(xmlSerializer);
        }
        dhmo dhmoVar = this.c;
        if (dhmoVar != null) {
            dhmoVar.a(xmlSerializer);
        }
        dhmo dhmoVar2 = this.d;
        if (dhmoVar2 != null) {
            dhmoVar2.a(xmlSerializer);
        }
        dhmo dhmoVar3 = this.e;
        if (dhmoVar3 != null) {
            dhmoVar3.a(xmlSerializer);
        }
        dhmh dhmhVar = this.f;
        if (dhmhVar != null) {
            dhmhVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Ellipsoid");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhmm)) {
            return false;
        }
        dhmm dhmmVar = (dhmm) obj;
        return this.f.equals(dhmmVar.f) && this.b.equals(dhmmVar.b) && this.c.equals(dhmmVar.c) && this.d.equals(dhmmVar.d) && this.e.equals(dhmmVar.e) && Objects.equals(this.a, dhmmVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.b, this.c, this.d, this.e, Objects.toString(this.a, "")});
    }
}
