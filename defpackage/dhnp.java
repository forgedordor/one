package defpackage;

import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnp implements dhle {
    public String a;
    public dhnu b;
    public String c;
    public String d;
    public List e;
    public final fcsu f;

    public dhnp(fcsu fcsuVar) {
        this.f = fcsuVar;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:rlmi", "instance");
        xmlSerializer.attribute("", "id", this.a);
        xmlSerializer.attribute("", "state", this.b.d);
        String str = this.c;
        if (str != null) {
            xmlSerializer.attribute("", "reason", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            xmlSerializer.attribute("", "cid", str2);
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:rlmi", "instance");
    }
}
