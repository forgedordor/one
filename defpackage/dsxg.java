package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsxg implements dswy {
    final /* synthetic */ dsxh a;

    public dsxg(dsxh dsxhVar) {
        this.a = dsxhVar;
    }

    @Override // defpackage.dswy
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dsxh dsxhVar = this.a;
        long jA = dsxhVar.d.a();
        if (jA != -1) {
            dsvp dsvpVar = ((dsvd) obj).c;
            dsvpVar.copyOnWrite();
            dsvq dsvqVar = (dsvq) dsvpVar.instance;
            dsvq dsvqVar2 = dsvq.a;
            dsvqVar.b |= 4;
            dsvqVar.f = jA * 1000;
        }
        dsxk dsxkVar = dsxhVar.c;
        boolean z = dsxkVar.h;
        Map map = dsxkVar.f;
        Collection collection = (Collection) map.remove(obj);
        if (collection != null) {
            collection.clear();
            dsxkVar.g = collection;
        }
        dsvd dsvdVar = (dsvd) obj;
        if (dsvdVar.f()) {
            Object objD = dsvdVar.f.d();
            if (dsvdVar.f.p() || (objD != null && ((dsvd) objD).f())) {
                Collection collection2 = (Collection) map.get(objD);
                if (collection2 != null) {
                    collection2.add(dsvdVar.a());
                } else {
                    Collection arrayList = dsxkVar.g;
                    if (arrayList != null) {
                        dsxkVar.g = null;
                    } else {
                        if (Log.isLoggable("GIL", 2)) {
                            Log.v("GIL", "Array Alloc for Removal");
                        }
                        arrayList = new ArrayList();
                    }
                    arrayList.add(dsvdVar.a());
                    map.put(objD, arrayList);
                }
            }
        }
        dsxkVar.a.remove(obj);
        dsxkVar.b.remove(obj);
        if (map.isEmpty()) {
            return;
        }
        dsxhVar.b();
    }

    @Override // defpackage.dswy
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dsxh dsxhVar = this.a;
        long jA = dsxhVar.d.a();
        if (jA != -1) {
            dsvp dsvpVar = ((dsvd) obj).c;
            dsvpVar.copyOnWrite();
            dsvq dsvqVar = (dsvq) dsvpVar.instance;
            dsvq dsvqVar2 = dsvq.a;
            dsvqVar.b |= 4;
            dsvqVar.f = jA * 1000;
        }
        dsvd dsvdVar = (dsvd) obj;
        dsxa dsxaVar = dsvdVar.f;
        if (dsxaVar instanceof dsvu) {
            dsvu dsvuVar = (dsvu) dsxaVar;
            if (!dsvdVar.c.c(dtaf.a)) {
                dsvuVar.r(false);
            } else if (!dsxaVar.p()) {
                dsvuVar.r(true);
            }
        }
        dsxk dsxkVar = dsxhVar.c;
        dsxa dsxaVar2 = dsvdVar.f;
        dsvp dsvpVar2 = dsvdVar.c;
        eohx eohxVar = ((dsvq) dsvpVar2.instance).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        if ((eohxVar.b & 2048) != 0) {
            int iT = dsxaVar2.t();
            int iB = emmy.b(((dsvq) dsvpVar2.instance).e);
            if ((iB != 0 ? iB : 1) == iT || !dsxkVar.c(dsvdVar, iT)) {
                return;
            }
        } else {
            dsxkVar.a.add(obj);
        }
        dsxhVar.b();
    }

    @Override // defpackage.dswy
    public final /* synthetic */ void c(Object obj) {
        ((dsvd) obj).g();
    }

    @Override // defpackage.dswy
    public final /* bridge */ /* synthetic */ void e() {
        ecem.c();
    }

    @Override // defpackage.dswy
    public final /* bridge */ /* synthetic */ void f() {
        ecem.c();
        final dsxh dsxhVar = this.a;
        Runnable runnable = dsxhVar.g;
        if (runnable != null) {
            ecem.f(runnable);
            dsxhVar.b.a(new Runnable() { // from class: dsxf
                @Override // java.lang.Runnable
                public final void run() {
                    dsxhVar.a();
                }
            }).run();
        }
    }

    @Override // defpackage.dswy
    public final /* bridge */ /* synthetic */ void g(Object obj, int i) {
        dsxh dsxhVar = this.a;
        long jA = dsxhVar.d.a();
        if (jA != -1) {
            dsvp dsvpVar = ((dsvd) obj).c;
            dsvpVar.copyOnWrite();
            dsvq dsvqVar = (dsvq) dsvpVar.instance;
            dsvq dsvqVar2 = dsvq.a;
            dsvqVar.b |= 4;
            dsvqVar.f = jA * 1000;
        }
        if (dsxhVar.c.c((dsvd) obj, i)) {
            dsxhVar.b();
        }
    }

    @Override // defpackage.dswy
    public final /* synthetic */ void d() {
    }
}
