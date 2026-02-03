package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dims implements fdau {
    final /* synthetic */ long a;

    public dims(long j) {
        this.a = j;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ego egoVar = (ego) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        egoVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(egoVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            egd egdVar = ((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() ? new egd(4.0f, 8.0f, 12.0f, 8.0f) : new egd(6.0f, 6.0f, 6.0f, 6.0f);
            float f = true != ((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() ? 48.0f : 56.0f;
            ico icoVar = ics.e;
            ics icsVarC = efy.c(egq.k(icoVar, f), egdVar);
            long j = this.a;
            ixm ixmVarA = ecz.a(ibw.e, false);
            long jB = hmg.b(hmlVar);
            long j2 = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i = (int) j2;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            egt.a(dkto.d(iex.a(edf.a.b(icoVar), evn.a), new ije(j), 6), hmlVar);
            dtfn.a(djrs.b(djrr.dg, hmlVar), jqu.b(R.string.audiobubble_loading_text, hmlVar), djrq.a(icoVar, (kji) hmlVar.e(jmh.j)), glz.a(hmlVar).n, hmlVar, 0, 0);
            hmlVar.n();
            ecz.b(dkto.d(iex.a(egq.e(efy.j(egoVar.a(icoVar, 1.0f, true), true != ((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() ? 8.0f : 2.0f, 0.0f, 0.0f, 0.0f, 14), true != ((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() ? 14.0f : 16.0f), glz.c(hmlVar).f), new ije(j), 6), hmlVar, 0);
        }
        return fctx.a;
    }
}
