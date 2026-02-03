package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffas {
    public final fexe a;
    public final ffap b;
    public List c;
    public int d;
    public List e;
    public final List f;

    public ffas(fexe fexeVar, ffap ffapVar) {
        List listO;
        this.a = fexeVar;
        this.b = ffapVar;
        fcvo fcvoVar = fcvo.a;
        this.c = fcvoVar;
        this.e = fcvoVar;
        this.f = new ArrayList();
        feyq feyqVar = fexeVar.i;
        Proxy proxy = fexeVar.g;
        if (proxy != null) {
            listO = fcva.b(proxy);
        } else {
            URI uriF = feyqVar.f();
            if (uriF.getHost() == null) {
                listO = fezr.o(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = fexeVar.h.select(uriF);
                listO = (listSelect == null || listSelect.isEmpty()) ? fezr.o(Proxy.NO_PROXY) : fezr.p(listSelect);
            }
        }
        this.c = listO;
        this.d = 0;
        listO.getClass();
    }

    public final boolean a() {
        return b() || !this.f.isEmpty();
    }

    public final boolean b() {
        return this.d < this.c.size();
    }
}
