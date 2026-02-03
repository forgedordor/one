package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dneq {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/core/data/usage/EntityUsageProcessor");
    public final fdjx b;
    public final dnga c;
    public final eony d;
    public final dngc e;
    public final dnfa f;
    private final dnfb h;
    private final fctc i = fctd.a(new fdae() { // from class: dnee
        @Override // defpackage.fdae
        public final Object invoke() {
            dneq dneqVar = this.a;
            return fdil.c(dneqVar.b, null, new dneo(dneqVar, null), 3);
        }
    });
    public final fctc g = fctd.a(new fdae() { // from class: dnef
        @Override // defpackage.fdae
        public final Object invoke() {
            dneq dneqVar = this.a;
            return fdil.c(dneqVar.b, null, new dnep(dneqVar, null), 3);
        }
    });

    public dneq(dnfb dnfbVar, fdjx fdjxVar, dnga dngaVar, eony eonyVar, dngc dngcVar, dnfv dnfvVar) {
        this.h = dnfbVar;
        this.b = fdjxVar;
        this.c = dngaVar;
        this.d = eonyVar;
        this.e = dngcVar;
        this.f = dnfbVar.a(dnfvVar, new fdap() { // from class: dned
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ((dneb) obj).a;
            }
        });
    }

    public static /* synthetic */ Object e(dneq dneqVar, Object obj, dnce dnceVar, String str, fcxy fcxyVar, int i) {
        Instant instantA = (i & 4) != 0 ? dneqVar.d.a() : null;
        if ((i & 8) != 0) {
            str = null;
        }
        Object objA = dneqVar.c.a(new dneb(obj, dnceVar, instantA, str), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objA != fcylVar) {
            objA = fctx.a;
        }
        return objA == fcylVar ? objA : fctx.a;
    }

    public final fdkf a() {
        return (fdkf) this.i.a();
    }

    public final fdpl b(final dnce dnceVar) {
        return (fdpl) this.e.d("EntityUsageProcessor#observeFrecency", new fdae() { // from class: dneh
            @Override // defpackage.fdae
            public final Object invoke() {
                return new fdui(new dnek(this.a, dnceVar, null));
            }
        });
    }

    public final fdvc c(final dnce dnceVar) {
        dnceVar.getClass();
        return (fdvc) this.e.d("EntityUsageProcessor#observeFrecency", new fdae() { // from class: dnec
            @Override // defpackage.fdae
            public final Object invoke() {
                dneq dneqVar = this.a;
                return fdtg.b(dneqVar.b(dnceVar), dneqVar.b, fdur.b, fdeo.a);
            }
        });
    }

    public final boolean d() {
        return a().z();
    }
}
