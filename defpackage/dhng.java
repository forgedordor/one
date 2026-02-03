package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Date;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhng implements dhle {
    public String a;
    public Date b;
    public long c;

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:rpid", "time-offset");
        if (!Objects.isNull(this.b)) {
            xmlSerializer.attribute("urn:ietf:params:xml:ns:pidf:rpid", "until", dhlf.a(this.b));
        }
        if (!Objects.isNull(this.a)) {
            xmlSerializer.attribute("", "id", this.a);
        }
        xmlSerializer.text(String.valueOf(this.c));
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:rpid", "time-offset");
    }
}
