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
public final class dhmg implements dhle {
    public dhmf b;
    public dhlw c;
    public dhlz d;
    public List e;
    public dhie f;
    public final dhlx h;
    public final fcsu i;
    public final fcsu j;
    private List k;
    public List g = new ArrayList();
    public String a = "i".concat(ebmh.a());

    public dhmg(dhlx dhlxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.h = dhlxVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
    }

    public final List a() {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        return this.k;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, DOMException, IOException, IllegalArgumentException {
        xmlSerializer.attribute("", "id", String.valueOf(this.a));
        dhmf dhmfVar = this.b;
        if (dhmfVar != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "status");
            if (!Objects.isNull(dhmfVar.a)) {
                String str = dhmfVar.a.c;
                xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "basic");
                xmlSerializer.text(str);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "basic");
            }
            List list = dhmfVar.b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((dhlq) dhmfVar.c.b()).b(it.next(), xmlSerializer);
                }
            }
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "status");
        }
        dhlw dhlwVar = this.c;
        if (dhlwVar != null) {
            dhlwVar.c(xmlSerializer);
        }
        List list2 = this.k;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((dhlq) this.j.b()).b(it2.next(), xmlSerializer);
            }
        }
        dhlz dhlzVar = this.d;
        if (dhlzVar != null) {
            dhlzVar.c(xmlSerializer);
        }
        List list3 = this.e;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((dhma) it3.next()).a(xmlSerializer, "urn:ietf:params:xml:ns:pidf");
            }
        }
        if (this.f != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf", "timestamp");
            xmlSerializer.text(this.f.toString());
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf", "timestamp");
        }
    }

    public final String toString() {
        return "TupleType{id='" + this.a + "', status=" + String.valueOf(this.b) + ", serviceDescription=" + String.valueOf(this.c) + "}";
    }
}
