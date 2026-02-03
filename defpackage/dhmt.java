package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.DOMException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmt implements dhle {
    public final fcsu a;
    private List b;

    public dhmt(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final List a() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, DOMException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "provided-by");
        List list = this.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dhlq) this.a.b()).b(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "provided-by");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dhmt) && a().size() == ((dhmt) obj).a().size();
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(a().size()));
    }
}
