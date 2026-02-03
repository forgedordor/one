package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmv implements dhle {
    public Boolean a;
    public String b;
    public String c;
    public Date d;
    public String e;

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "usage-rules");
        if (this.a != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "retransmission-allowed");
            if (this.a.booleanValue()) {
                xmlSerializer.text("yes");
            } else {
                xmlSerializer.text("no");
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "retransmission-allowed");
        }
        if (this.b != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "note-well");
            String str = this.e;
            if (str != null) {
                xmlSerializer.attribute("urn:ietf:params:xml:ns:pidf:geopriv10", "xml:lang", str);
            }
            xmlSerializer.text(this.b);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "note-well");
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "ruleset-reference");
            xmlSerializer.text(this.c);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "ruleset-reference");
        }
        if (this.d != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "retention-expiry");
            xmlSerializer.text(dhlf.a(this.d));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "retention-expiry");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "usage-rules");
    }

    public final boolean equals(Object obj) {
        long seconds;
        if (!(obj instanceof dhmv)) {
            return false;
        }
        dhmv dhmvVar = (dhmv) obj;
        long seconds2 = 0;
        if (this.d == null || dhmvVar.d == null) {
            seconds = 0;
        } else {
            seconds2 = TimeUnit.MILLISECONDS.toSeconds(this.d.getTime());
            seconds = TimeUnit.MILLISECONDS.toSeconds(dhmvVar.d.getTime());
        }
        return seconds2 == seconds;
    }

    public final int hashCode() {
        return Objects.hashCode(this.d);
    }
}
