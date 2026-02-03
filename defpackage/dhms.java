package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhms implements dhmq {
    public String a = "urn:ogc:def:crs:EPSG::4979";
    public dhmj b;
    public dhmo c;

    @Override // defpackage.dhmq, defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Prism");
        String str = this.a;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        dhmj dhmjVar = this.b;
        if (dhmjVar != null) {
            dhmjVar.a(xmlSerializer);
        }
        dhmo dhmoVar = this.c;
        if (dhmoVar != null) {
            dhmoVar.a(xmlSerializer);
        }
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Prism");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhms)) {
            return false;
        }
        dhms dhmsVar = (dhms) obj;
        return this.b.equals(dhmsVar.b) && this.c.equals(dhmsVar.c) && Objects.equals(this.a, dhmsVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Objects.toString(this.a, "")});
    }
}
