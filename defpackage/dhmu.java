package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmu implements dhmq {
    public dhna a;
    public dhmo b;
    public String c = "urn:ogc:def:crs:EPSG::4979";

    @Override // defpackage.dhmq, defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Sphere");
        xmlSerializer.attribute("", "srsName", Objects.toString(this.c, ""));
        dhna dhnaVar = this.a;
        if (dhnaVar != null) {
            dhnaVar.c(xmlSerializer);
        }
        dhmo dhmoVar = this.b;
        if (dhmoVar != null) {
            dhmoVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Sphere");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhmu)) {
            return false;
        }
        dhmu dhmuVar = (dhmu) obj;
        dhna dhnaVar = this.a;
        if (dhnaVar == null && dhmuVar.a != null) {
            return false;
        }
        if (dhnaVar != null && !dhnaVar.equals(dhmuVar.a)) {
            return false;
        }
        dhmo dhmoVar = this.b;
        if (dhmoVar != null || dhmuVar.a == null) {
            return (dhmoVar == null || dhmoVar.equals(dhmuVar.b)) && Objects.equals(this.c, dhmuVar.c);
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        dhna dhnaVar = this.a;
        if (dhnaVar != null) {
            arrayList.add(dhnaVar);
        }
        dhmo dhmoVar = this.b;
        if (dhmoVar != null) {
            arrayList.add(dhmoVar);
        }
        String str = this.c;
        if (str != null) {
            arrayList.add(str);
        }
        return Arrays.hashCode(arrayList.toArray());
    }
}
