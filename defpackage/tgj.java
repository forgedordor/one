package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tgj implements fdat {
    final /* synthetic */ tgp a;

    public tgj(tgp tgpVar) {
        this.a = tgpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            tgp tgpVar = this.a;
            fcww fcwwVar = new fcww((byte[]) null);
            fcsu fcsuVar = tgpVar.a;
            hpt hptVar = djrx.a;
            Object objB = fcsuVar.b();
            objB.getClass();
            fcwwVar.add(hptVar.c(objB));
            hpu[] hpuVarArr = (hpu[]) fcva.a(fcwwVar).toArray(new hpu[0]);
            hnj.b((hpu[]) Arrays.copyOf(hpuVarArr, hpuVarArr.length), hxe.d(221768952, new tgi(tgpVar), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}
