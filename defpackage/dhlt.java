package defpackage;

import java.io.IOException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhlt implements dhle {
    public String a;

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:cipid", "display-name");
        xmlSerializer.text(this.a);
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:cipid", "display-name");
    }
}
