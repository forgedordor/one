package defpackage;

import android.content.Context;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dput implements dpje {
    static final /* synthetic */ fdeh[] a;
    public static final ekrg b;
    public final dpux c;
    public final dpir d;
    public final fdap e;
    public final dpwq f;
    public final Map g;
    private final eony h;
    private final dpwz i;
    private final dpww j;
    private final fr k;
    private final fdae l;
    private final dpxq m;
    private final dpuq n;
    private final fdcz o;
    private final fdcz p;

    static {
        fdbv fdbvVar = new fdbv(dput.class, "currentScreen", "getCurrentScreen()Lcom/google/android/libraries/compose/ui/screen/HugoScreen;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar, new fdbv(dput.class, "currentState", "getCurrentState()Lcom/google/android/libraries/compose/ui/rendering/RenderingState;", 0)};
        b = ekrg.c("com/google/android/libraries/compose/ui/rendering/RenderingManager");
    }

    public dput(eony eonyVar, dpwz dpwzVar, dpww dpwwVar, fr frVar, fdae fdaeVar, dpux dpuxVar, dpir dpirVar, dpxq dpxqVar, fdap fdapVar) {
        dpwq dpwvVar;
        this.h = eonyVar;
        this.i = dpwzVar;
        this.j = dpwwVar;
        this.k = frVar;
        this.l = fdaeVar;
        this.c = dpuxVar;
        this.d = dpirVar;
        this.m = dpxqVar;
        this.e = fdapVar;
        if (dpuxVar.a) {
            Context context = (Context) dpwzVar.a.b();
            context.getClass();
            dpvi dpviVar = (dpvi) dpwzVar.b.b();
            dpviVar.getClass();
            Optional optional = (Optional) dpwzVar.c.b();
            optional.getClass();
            dpwvVar = new dpwy(context, dpviVar, optional, frVar, dpuxVar, dpirVar);
        } else {
            Context context2 = (Context) dpwwVar.a.b();
            context2.getClass();
            dpvi dpviVar2 = (dpvi) dpwwVar.b.b();
            dpviVar2.getClass();
            Optional optional2 = (Optional) dpwwVar.c.b();
            optional2.getClass();
            dpwvVar = new dpwv(context2, dpviVar2, optional2, frVar, dpuxVar, dpirVar);
        }
        this.f = dpwvVar;
        this.n = new dpuq(this);
        this.o = new dpur(this);
        this.p = new dpus(dpuv.d, this);
        this.g = new LinkedHashMap();
    }

    public static /* synthetic */ boolean p(dput dputVar) {
        dpuv dpuvVarD = dputVar.d();
        dpuvVarD.getClass();
        return dpuvVarD != dpuv.d;
    }

    private final Object q(fdap fdapVar, Object obj) {
        try {
            return fdapVar.invoke(this.l.invoke());
        } catch (fctw unused) {
            ((ekrd) b.h().h("com/google/android/libraries/compose/ui/rendering/RenderingManager", "safelyRunWithDraftController", 373, "RenderingManager.kt")).t("DraftController not initialized. Returning default value %s.", obj);
            return obj;
        }
    }

    @Override // defpackage.dpje
    public final void a(int i) {
        int iOrdinal = d().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            dpwq.m(this.f, i, 2);
        } else {
            dpwq dpwqVar = this.f;
            if (i > dpwqVar.b()) {
                dpwqVar.i(i, false);
            }
        }
    }

    @Override // defpackage.dpje
    public final void b(dpjd dpjdVar) {
        dpjdVar.getClass();
        int iOrdinal = dpjdVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 3 && !this.c.a && d().ordinal() == 1) {
                i();
                return;
            }
            return;
        }
        int iOrdinal2 = d().ordinal();
        if (iOrdinal2 == 0) {
            i();
            return;
        }
        if (iOrdinal2 != 1) {
            return;
        }
        dpir dpirVar = this.d;
        dpwq dpwqVar = this.f;
        dpux dpuxVar = this.c;
        int iD = dpirVar.d();
        dpwqVar.k(iD, dpuxVar.a() - iD);
    }

    public final int c(dpuv dpuvVar) {
        dpuvVar.getClass();
        return this.f.b();
    }

    public final dpuv d() {
        return (dpuv) this.p.c(a[1]);
    }

    public final dpxo e(dpxe dpxeVar) {
        dpxeVar.getClass();
        return this.f.d(dpxeVar);
    }

    public final dpxo f() {
        return (dpxo) this.o.c(a[0]);
    }

    public final void g() {
        dpwq dpwqVar = this.f;
        dpvz dpvzVar = dpwqVar.h;
        dpux dpuxVar = dpvzVar.a;
        if (dpuxVar.h) {
            dpvzVar.c(dpvzVar.b);
        }
        dpuxVar.c.setOnHierarchyChangeListener(dpvzVar.e);
        dpwqVar.h();
    }

    public final void h(dpxo dpxoVar) {
        dpxoVar.gz(this.c, this.n);
        dpxoVar.gA(this.l);
    }

    public final void i() {
        int iOrdinal = d().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            o(dpuv.d);
            k(f());
        }
        j();
    }

    public final void j() {
        this.f.f();
    }

    public final void k(dpxo dpxoVar) {
        Instant instantA = this.h.a();
        instantA.getClass();
        if (dpxoVar != null) {
            dpxoVar.bf();
            dpxq dpxqVar = this.m;
            dpxe dpxeVarT = dpxoVar.t();
            int iIntValue = ((Number) q(new fdap() { // from class: dpun
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ekrg ekrgVar = dput.b;
                    ((dnhl) obj).getClass();
                    return 0;
                }
            }, 0)).intValue();
            Duration durationBetween = Duration.between(dpxoVar.aT, instantA);
            durationBetween.getClass();
            dpxqVar.a(dpxeVarT, iIntValue, durationBetween);
            Instant instant = Instant.EPOCH;
            instant.getClass();
            dpxoVar.aT = instant;
        }
    }

    public final void l() {
        Duration durationBF;
        dpxo dpxoVarF = f();
        if (dpxoVarF != null) {
            if (true != dpxoVarF.bK()) {
                dpxoVarF = null;
            }
            if (dpxoVarF != null) {
                h(dpxoVarF);
                if (d() == dpuv.a) {
                    dpir dpirVar = this.d;
                    if (dpirVar.f() == dpjd.a) {
                        dpirVar.j();
                    }
                }
                if (d() != dpuv.d) {
                    if (fdbq.f(dpxoVarF.aT, Instant.EPOCH)) {
                        Instant instantA = this.h.a();
                        instantA.getClass();
                        dpxoVarF.aT = instantA;
                        durationBF = Duration.ZERO;
                    } else {
                        durationBF = dpxoVarF.bF();
                    }
                    durationBF.getClass();
                    dpxoVarF.bg();
                    this.m.b(dpxoVarF.t(), ((Number) q(new fdap() { // from class: dpup
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            ekrg ekrgVar = dput.b;
                            ((dnhl) obj).getClass();
                            return 0;
                        }
                    }, 0)).intValue(), durationBF);
                }
            }
        }
    }

    public final void m(dpxo dpxoVar) {
        dpxoVar.getClass();
        g();
        if (!fdbq.f(dpxoVar, f())) {
            n(dpxoVar);
        }
        if (d().ordinal() != 3) {
            return;
        }
        o(dpuv.a);
        l();
    }

    public final void n(dpxo dpxoVar) {
        this.o.d(a[0], dpxoVar);
    }

    public final void o(dpuv dpuvVar) {
        this.p.d(a[1], dpuvVar);
    }
}
