package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhlj implements dhle {
    public final List a = new ArrayList(1);

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "external-list");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            String str = ((dhli) it.next()).a;
            xmlSerializer.startTag("urn:oma:xml:xdm:common-policy", "entry");
            xmlSerializer.attribute("", "anc", str);
            xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "entry");
        }
        xmlSerializer.endTag("urn:oma:xml:xdm:common-policy", "external-list");
    }
}
