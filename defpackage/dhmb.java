package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.DOMException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmb implements dhle {
    public String a;
    public List b;
    public List c;
    public final fcsu d;
    public final fcsu e;
    private List f;

    public dhmb(fcsu fcsuVar, fcsu fcsuVar2) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
    }

    public final List a() {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        return this.f;
    }

    public final List b() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, DOMException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "presence");
        String str = this.a;
        if (str != null) {
            xmlSerializer.attribute("", "entity", str);
        }
        List<dhmg> list = this.b;
        if (list != null) {
            for (dhmg dhmgVar : list) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "tuple");
                dhmgVar.c(xmlSerializer);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "tuple");
            }
        }
        List list2 = this.c;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((dhma) it.next()).a(xmlSerializer, "urn:ietf:params:xml:ns:pidf");
            }
        }
        List list3 = this.f;
        if (list3 != null) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                ((dhlq) this.d.b()).b(it2.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "presence");
    }

    public final String toString() {
        return "Presence{entity='" + this.a + "', tuples=" + String.valueOf(this.b) + "}";
    }
}
