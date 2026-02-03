package defpackage;

import java.io.IOException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhlz implements dhle {
    public Double a;
    public String b;

    public dhlz() {
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "contact");
        Double d = this.a;
        if (d != null) {
            xmlSerializer.attribute("", "priority", d.toString());
        }
        xmlSerializer.text(this.b);
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "contact");
    }

    public dhlz(String str) {
        this.b = str;
    }
}
