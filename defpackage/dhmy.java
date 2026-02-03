package defpackage;

import j$.util.Objects;
import java.io.IOException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmy extends dhmw implements dhmq {
    public dhna a;
    public String b = "urn:ogc:def:crs:EPSG::4326";

    @Override // defpackage.dhmq, defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/gml", "Point");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        dhna dhnaVar = this.a;
        if (dhnaVar != null) {
            dhnaVar.c(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/gml", "Point");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dhmy) {
            return this.a.equals(((dhmy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
