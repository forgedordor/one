package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.DOMException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhlv implements dhle {
    public List a;
    public dhly b;
    public Date c;
    public final fcsu d;

    public dhlv(fcsu fcsuVar) {
        this.d = fcsuVar;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, DOMException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:oma:xml:prs:pidf:oma-pres", "overriding-willingness");
        Date date = this.c;
        if (date != null) {
            xmlSerializer.attribute("urn:oma:xml:pde:pidf:ext", "until", dhlf.a(date));
        }
        if (!Objects.isNull(this.b)) {
            String str = this.b.c;
            xmlSerializer.startTag("urn:oma:xml:pde:pidf:ext", "basic");
            xmlSerializer.text(str);
            xmlSerializer.endTag("urn:oma:xml:pde:pidf:ext", "basic");
        }
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dhlq) this.d.b()).b(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:oma:xml:prs:pidf:oma-pres", "overriding-willingness");
    }
}
