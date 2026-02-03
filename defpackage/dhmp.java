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
public final class dhmp implements dhle {
    public List a;
    public final fcsu b;
    private List c;

    public dhmp(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    public final List a() {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        return this.c;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, DOMException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dhmq) it.next()).c(xmlSerializer);
            }
        }
        List list2 = this.a;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((dhlq) this.b.b()).b(it2.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhmp)) {
            return false;
        }
        dhmp dhmpVar = (dhmp) obj;
        if (a().size() != dhmpVar.a().size()) {
            return false;
        }
        for (int i = 0; i < a().size(); i++) {
            if (!Objects.equals((dhmq) a().get(i), (dhmq) dhmpVar.a().get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int size = a().size() * 37;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            size += ((dhmq) it.next()).hashCode() * 37;
        }
        return size;
    }
}
