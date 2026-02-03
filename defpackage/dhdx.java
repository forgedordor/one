package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.DOMException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhdx implements dhle {
    public dhdz a;
    public String b;
    public final fcsu c;
    public final fcsu d;
    private List e;

    public dhdx(fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    public final dhdz a() {
        if (this.a == null) {
            this.a = (dhdz) this.d.b();
        }
        return this.a;
    }

    public final List b() {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        return this.e;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, DOMException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("", "entity", str);
        }
        dhdz dhdzVar = this.a;
        if (dhdzVar != null) {
            xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcspushlocation");
            xmlSerializer.attribute("", "id", dhdzVar.a);
            String str2 = dhdzVar.b;
            if (str2 != null) {
                xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, str2);
            }
            dhmn dhmnVar = dhdzVar.d;
            if (dhmnVar != null) {
                dhmnVar.c(xmlSerializer);
            }
            xmlSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "timestamp");
            xmlSerializer.text(dhlf.a(new Date(dhdzVar.c)));
            xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "timestamp");
            xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcspushlocation");
        }
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dhlq) this.c.b()).b(it.next(), xmlSerializer);
            }
        }
        xmlSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
    }
}
