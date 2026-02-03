package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edmi {
    exwf a;
    final Map b = DesugarCollections.synchronizedMap(new HashMap());
    final List c = DesugarCollections.synchronizedList(new ArrayList());
    final /* synthetic */ edmj d;

    public edmi(edmj edmjVar) {
        this.d = edmjVar;
    }

    public final ekgb a() {
        return ekgb.n(this.c);
    }

    public final void b(exwf exwfVar, Throwable th) {
        this.c.add(((edhi) this.b.remove(exwfVar)).e(true != this.d.f.a() ? 15 : 3, th));
    }

    public final void c(exwf exwfVar) {
        edhi edhiVarA = this.d.h.a(exwfVar);
        edhiVarA.d();
        this.b.put(exwfVar, edhiVarA);
    }

    public final void d(exwf exwfVar) {
        this.c.add(((edhi) this.b.remove(exwfVar)).a());
    }
}
