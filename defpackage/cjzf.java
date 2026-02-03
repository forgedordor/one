package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjzf implements cjyi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcsdata/carriertos/CarrierTosDataServiceImpl");
    public static final egyj b = new egyb("explicit_carrier_tos_data_source_key");
    public final cmfo c;
    public final fdjx d;
    public final fcyh e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    private final Context i;
    private final fcsu j;
    private final fcsu k;

    public cjzf(Context context, cmfo cmfoVar, fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        context.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.i = context;
        this.c = cmfoVar;
        this.d = fdjxVar;
        this.e = fcyhVar;
        this.f = fcsuVar;
        this.j = fcsuVar2;
        this.g = fcsuVar3;
        this.k = fcsuVar4;
        this.h = fcsuVar5;
    }

    @Override // defpackage.cjyi
    public final ehaw a(String str) {
        str.getClass();
        return new cjyu(this, str);
    }

    @Override // defpackage.cjyi
    public final eiju b() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cjyq(this, null));
    }

    @Override // defpackage.cjyi
    public final eiju c() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cjyr(this, null));
    }

    @Override // defpackage.cjyi
    public final eiju d() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cjyz(this, null));
    }

    @Override // defpackage.cjyi
    public final eiju e(dggn dggnVar) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cjza(dggnVar, this, null));
    }

    @Override // defpackage.cjyi
    public final void f(dggn dggnVar) {
        auvw.k(this.d, null, null, new cjzc(this, dggnVar, null), 3);
    }

    @Override // defpackage.cjyi
    public final void g(dggn dggnVar, dfir dfirVar) {
        dfirVar.getClass();
        auvw.k(this.d, null, null, new cjze(this, dggnVar, dfirVar, null), 3);
    }

    @Override // defpackage.cjyi
    public final void h(final dggn dggnVar, final dfir dfirVar) {
        dfirVar.getClass();
        final fdap fdapVar = new fdap() { // from class: cjyl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cjzi cjziVar = (cjzi) ((cjzm) obj).toBuilder();
                cjziVar.a(dggo.a(dggnVar).a, dfirVar);
                return (cjzm) cjziVar.build();
            }
        };
        this.c.m(new ejvr() { // from class: cjym
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        });
    }

    @Override // defpackage.cjyi
    public final void i(final dggn dggnVar, final boolean z) {
        final fdap fdapVar = new fdap() { // from class: cjyj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cjzi cjziVar = (cjzi) ((cjzm) obj).toBuilder();
                cjziVar.b(dggo.a(dggnVar).a, z);
                return (cjzm) cjziVar.build();
            }
        };
        this.c.m(new ejvr() { // from class: cjyk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        });
    }

    @Override // defpackage.cjyi
    public final boolean j(dggn dggnVar) {
        return p((cjzm) this.c.l()).containsKey(dggnVar);
    }

    @Override // defpackage.cjyi
    public final int k(dggn dggnVar) {
        dggnVar.getClass();
        int i = ((cjxl) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((cjuu) ((cjxi) this.k.b()).d.l()).n), dggo.a(dggnVar).a, cjxl.a)).b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.dggn r9, java.lang.String r10, defpackage.fcxy r11) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjzf.l(dggn, java.lang.String, fcxy):java.lang.Object");
    }

    public final Object m(fcxy fcxyVar) {
        return this.c.c(fcxyVar);
    }

    public final Object n(dggn dggnVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new cjyx(null, this, dggnVar), fcxyVar);
    }

    public final Object o(dggn dggnVar, fcxy fcxyVar) {
        Object objC = fdxs.c(((cjxi) this.k.b()).k(dggo.a(dggnVar).a, 2), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    public final java.util.Map p(cjzm cjzmVar) {
        java.util.Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(cjzmVar.d);
        mapUnmodifiableMap.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(mapUnmodifiableMap.size()));
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            linkedHashMap.put(new dggp((String) key), entry.getValue());
        }
        return linkedHashMap;
    }
}
