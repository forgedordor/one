package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dsuz {
    private final eohw d;
    public dsvk b = dsvd.a;
    public dsvd c = null;
    public final dsvp a = (dsvp) dsvq.a.createBuilder();

    protected dsuz(dsvc dsvcVar) {
        this.d = dsvcVar.a;
        a(((eohx) dsvcVar.a.instance).d);
    }

    private final void a(int i) {
        dsvp dsvpVar = this.a;
        long j = ((dsvq) dsvpVar.instance).g + i;
        dsvpVar.copyOnWrite();
        dsvq dsvqVar = (dsvq) dsvpVar.instance;
        dsvqVar.b |= 8;
        dsvqVar.g = j;
    }

    private final void b(int i) {
        dsvp dsvpVar = this.a;
        long j = ((dsvq) dsvpVar.instance).h + i;
        dsvpVar.copyOnWrite();
        dsvq dsvqVar = (dsvq) dsvpVar.instance;
        dsvqVar.b |= 16;
        dsvqVar.h = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dsvd e(dsxb dsxbVar) {
        ejwl.m(this.c == null, "Cannot create CVE twice.");
        dsvp dsvpVar = this.a;
        dsvpVar.copyOnWrite();
        dsvq dsvqVar = (dsvq) dsvpVar.instance;
        eohx eohxVar = (eohx) this.d.build();
        dsvq dsvqVar2 = dsvq.a;
        eohxVar.getClass();
        dsvqVar.d = eohxVar;
        dsvqVar.b = 1 | dsvqVar.b;
        dsvd dsvdVar = new dsvd((dsvp) ((dsvq) dsvpVar.build()).toBuilder(), this.b, dsxbVar);
        this.c = dsvdVar;
        Set set = dsvdVar.e.a;
        if (!set.isEmpty()) {
            if (Log.isLoggable("GIL", 2)) {
                Log.v("GIL", "Instrumented: ".concat(String.valueOf(String.valueOf(dsvdVar))));
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((dswy) it.next()).e();
            }
        }
        return this.c;
    }

    public final void f(dsva dsvaVar) {
        dsvd dsvdVar = this.c;
        ejwl.p(dsvdVar == null, "CVE %s has already been built.", dsvdVar);
        dsvp dsvpVar = this.a;
        eohx eohxVar = ((dsvq) dsvpVar.instance).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        ejwl.l(!((eohxVar.b & 2048) != 0));
        evrp evrpVar = dsvaVar.a;
        if (!dsvpVar.c(evrpVar)) {
            int iA = evrpVar.a();
            dsvpVar.copyOnWrite();
            dsvq dsvqVar = (dsvq) dsvpVar.instance;
            evsx evsxVar = dsvqVar.c;
            if (!evsxVar.c()) {
                dsvqVar.c = evsn.mutableCopy(evsxVar);
            }
            dsvqVar.c.h(iA);
        }
        Object obj = dsvaVar.b;
        dsvpVar.e(evrpVar, obj);
        a(evrpVar.a());
        a(evrpVar.hashCode());
        a(obj.hashCode());
    }

    public final void g(dsvb dsvbVar) {
        dsvd dsvdVar = this.c;
        ejwl.p(dsvdVar == null, "CVE %s has already been built.", dsvdVar);
        evrp evrpVar = dsvbVar.a;
        Object obj = dsvbVar.b;
        this.a.e(evrpVar, obj);
        b(evrpVar.a());
        b(evrpVar.hashCode());
        b(obj.hashCode());
    }
}
