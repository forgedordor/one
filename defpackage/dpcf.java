package defpackage;

import android.app.Activity;
import android.os.Bundle;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpcf implements dpbq, dpxq {
    static final /* synthetic */ fdeh[] a;
    public static final ekrg b;
    public final dpir c;
    public final fdjx d;
    public final dpux e;
    public final fduf f;
    public final fduf g;
    public final fduf h;
    public final fduf i;
    public final dput j;
    public final fdpl k;
    public final fdcz l;
    private final dpuu m;
    private final dnhb n;
    private final dpxq o;
    private final fdae p;
    private final fctc q;
    private final fduf r;
    private final fduf s;
    private final fdpl t;
    private final dpca u;

    static {
        fdbv fdbvVar = new fdbv(dpcf.class, "activeEntryPoint", "getActiveEntryPoint()Lcom/google/android/libraries/compose/ui/entrypoint/ComposeEntryPoint;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
        b = ekrg.c("com/google/android/libraries/compose/ui/HugoManagerImpl");
    }

    public dpcf(Activity activity, dpir dpirVar, dpuu dpuuVar, final eygg eyggVar, final eygg eyggVar2, fdjx fdjxVar, dnhb dnhbVar, dpxq dpxqVar, fr frVar, fdae fdaeVar, dpux dpuxVar) {
        this.c = dpirVar;
        this.m = dpuuVar;
        this.d = fdjxVar;
        this.n = dnhbVar;
        this.o = dpxqVar;
        this.p = fdaeVar;
        this.e = dpuxVar;
        fctd.a(new fdae() { // from class: dpbs
            @Override // defpackage.fdae
            public final Object invoke() {
                ekrg ekrgVar = dpcf.b;
                return (Map) eyggVar.b();
            }
        });
        this.q = fctd.a(new fdae() { // from class: dpbt
            @Override // defpackage.fdae
            public final Object invoke() {
                ekrg ekrgVar = dpcf.b;
                return (Map) eyggVar2.b();
            }
        });
        fduf fdufVarA = fdvf.a(dpuv.d);
        this.f = fdufVarA;
        fduf fdufVarA2 = fdvf.a(dpjd.d);
        this.g = fdufVarA2;
        fduf fdufVarA3 = fdvf.a(dpyw.a);
        this.h = fdufVarA3;
        fduf fdufVarA4 = fdvf.a(dpyp.a);
        this.r = fdufVarA4;
        fduf fdufVarA5 = fdvf.a(0);
        this.i = fdufVarA5;
        fduf fdufVarA6 = fdvf.a(null);
        this.s = fdufVarA6;
        fdua fduaVar = new fdua(fdufVarA3, fdufVarA6, new dpce(null));
        this.t = fduaVar;
        this.k = fdud.c(fdufVarA, fdufVarA2, fduaVar, fdufVarA4, fdufVarA5, new dpcd(this, null));
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("HugoManager requires " + activity.getLocalClassName() + " to extend FragmentActivity.");
        }
        eg egVar = (eg) activity;
        egVar.P().c(new dpbv());
        fr frVarA = frVar == null ? egVar.a() : frVar;
        dpux dpuxVar2 = new dpux(dpuxVar.a, dpuxVar.b, dpuxVar.c, new Consumer() { // from class: dpbu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                dpcf.r(this.a, 0, ((Integer) obj).intValue(), 1);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, dpuxVar.e, dpuxVar.f, dpuxVar.g, dpuxVar.h, dpuxVar.j, dpuxVar.k, dpuxVar.m, dpuxVar.n);
        dpbw dpbwVar = new dpbw(this);
        eony eonyVar = (eony) dpuuVar.a.b();
        eonyVar.getClass();
        dpwz dpwzVar = (dpwz) dpuuVar.b.b();
        dpwzVar.getClass();
        dpww dpwwVar = (dpww) dpuuVar.c.b();
        dpwwVar.getClass();
        this.j = new dput(eonyVar, dpwzVar, dpwwVar, frVarA, fdaeVar, dpuxVar2, dpirVar, this, dpbwVar);
        fdil.d(fdjxVar, null, null, new dpby(this, null), 3);
        this.l = new dpcc(this);
        this.u = new dpca(this);
    }

    static /* synthetic */ void r(dpcf dpcfVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = dpcfVar.c.e((dpjd) dpcfVar.g.c());
        }
        if ((i3 & 2) != 0) {
            i2 = dpcfVar.j.c((dpuv) dpcfVar.f.c());
        }
        fduf fdufVar = dpcfVar.i;
        int iOrdinal = ((dpuv) dpcfVar.f.c()).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i2 += i;
            } else if (iOrdinal == 2) {
                i2 = Math.max(i, i2);
            } else {
                if (iOrdinal != 3) {
                    throw new fctg();
                }
                i2 = dpcfVar.c.d();
            }
        }
        fdufVar.f(Integer.valueOf(i2));
    }

    private final dpxo s(dpxe dpxeVar, Bundle bundle) {
        dpil dpilVarE = this.j.e(dpxeVar);
        if (dpilVarE != null) {
            dpilVarE.at(bundle);
        } else {
            dpxj dpxjVar = (dpxj) ((Map) this.q.a()).get(dpxeVar);
            if (dpxjVar == null) {
                Objects.toString(dpxeVar);
                throw new IllegalStateException("Cannot find a factory for screen category ".concat(String.valueOf(dpxeVar)));
            }
            dpilVarE = dpxjVar.b(bundle);
        }
        return (dpxo) dpilVarE;
    }

    @Override // defpackage.dpxq
    public final void a(dpxe dpxeVar, int i, Duration duration) {
        dpxeVar.getClass();
        dpxq dpxqVar = this.o;
        if (dpxqVar != null) {
            dpxqVar.a(dpxeVar, i, duration);
        }
        this.r.f(new dpyn(i, duration));
    }

    @Override // defpackage.dpxq
    public final void b(dpxe dpxeVar, int i, Duration duration) {
        dpxeVar.getClass();
        dpyo dpyoVar = new dpyo(i, duration);
        fduf fdufVar = this.r;
        fdufVar.f(dpyoVar);
        dpxq dpxqVar = this.o;
        if (dpxqVar != null) {
            dpxqVar.b(dpxeVar, i, duration);
        }
        fdufVar.f(new dpyq(i));
    }

    @Override // defpackage.dpbq
    public final dpuv c() {
        return (dpuv) this.f.c();
    }

    @Override // defpackage.dpbq
    public final void d(dpgl dpglVar) {
        ((ekrd) dput.b.h().h("com/google/android/libraries/compose/ui/rendering/RenderingManager", "onHugoColorsChanged", 91, "RenderingManager.kt")).q("HugoColors changed");
        dput dputVar = this.j;
        dpxo dpxoVarF = dputVar.f();
        if (dpxoVarF != null) {
            dpxoVarF.bO(dpglVar);
        }
        dputVar.c.k = dpglVar;
    }

    @Override // defpackage.dpbq
    public final void e() {
        this.c.l(this.u);
        this.j.g();
    }

    @Override // defpackage.dpbq
    public final void f() {
        this.c.m(this.u);
        this.j.j();
    }

    @Override // defpackage.dpbq
    public final void g() {
        this.c.i();
        dput dputVar = this.j;
        if (dput.p(dputVar)) {
            dpux dpuxVar = dputVar.c;
            dpir dpirVar = dputVar.d;
            dpwq dpwqVar = dputVar.f;
            int iA = dpuxVar.a();
            int iC = dpirVar.c();
            dpwqVar.j(fddu.f(fddu.i(dpwqVar.b(), iC, fddu.f(iA, iC)), ((Number) dpwqVar.j.a()).intValue()));
        }
    }

    @Override // defpackage.dpbq
    public final void h(Bundle bundle) {
        dput dputVar;
        dpxo dpxoVarE;
        fcue fcueVar = new fcue((fcuh) dpxe.j);
        while (true) {
            dputVar = this.j;
            if (!fcueVar.hasNext()) {
                break;
            }
            dpxo dpxoVarE2 = dputVar.e((dpxe) fcueVar.next());
            if (dpxoVarE2 != null) {
                dputVar.h(dpxoVarE2);
                if (dputVar.c.n) {
                    dputVar.f.g(dpxoVarE2);
                }
            }
        }
        dpux dpuxVar = dputVar.c;
        if (dpuxVar.j) {
            Object obj = bundle.get("current_screen_category");
            if (obj != null && (dpxoVarE = dputVar.e((dpxe) obj)) != null) {
                dputVar.n(dpxoVarE);
            }
            Object obj2 = bundle.get("current_screen_state");
            dpuv dpuvVar = obj2 instanceof dpuv ? (dpuv) obj2 : null;
            if (dpuvVar != null) {
                dputVar.o(dpuvVar);
            }
            Integer numValueOf = Integer.valueOf(bundle.getInt("current_rendered_height", 0));
            Integer num = (dpuxVar.h || numValueOf.intValue() > 0) ? numValueOf : null;
            if (num != null) {
                dputVar.f.i(fddu.g(num.intValue(), dpuxVar.a()), false);
            }
        }
    }

    @Override // defpackage.dpbq
    public final void i(Bundle bundle) {
        dput dputVar = this.j;
        dpxo dpxoVarF = dputVar.f();
        bundle.putSerializable("current_screen_category", dpxoVarF != null ? dpxoVarF.t() : null);
        bundle.putSerializable("current_screen_state", dputVar.d());
        bundle.putInt("current_rendered_height", dputVar.f.b());
    }

    @Override // defpackage.dpbq
    public final void j(dpxe dpxeVar) {
        dpxeVar.getClass();
        ((ekrd) b.h().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "open", 347, "HugoManagerImpl.kt")).t("Opening directly %s", dpxeVar);
        this.r.f(dpyp.a);
        this.j.m(s(dpxeVar, new Bundle()));
    }

    @Override // defpackage.dpbq
    public final /* synthetic */ void k(Iterable iterable, dpxe dpxeVar) {
        l(iterable, dpxeVar, null);
    }

    @Override // defpackage.dpbq
    public final void l(Iterable iterable, dpxe dpxeVar, String str) {
        ((ekrd) b.h().h("com/google/android/libraries/compose/ui/HugoManagerImpl", "openWithSearch", 373, "HugoManagerImpl.kt")).t("Opening directly with search %s", iterable);
        dpxe dpxeVar2 = dpxe.d;
        dotb dotbVar = new dotb(fcva.ao(iterable), dpxeVar, str);
        Bundle bundle = new Bundle();
        List list = dotbVar.a;
        ArrayList<String> arrayList = new ArrayList<>(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((dpxe) it.next()).name());
        }
        bundle.putStringArrayList("categories", arrayList);
        bundle.putString("initial_search_term", dotbVar.c);
        dpxe dpxeVar3 = dotbVar.b;
        if (dpxeVar3 != null) {
            bundle.putInt("initial_screen", dpxeVar3.ordinal());
        }
        dpxo dpxoVarS = s(dpxeVar2, bundle);
        dpxoVarS.getClass();
        fduf fdufVar = this.s;
        dota dotaVar = (dota) dpxoVarS;
        dotaVar.ag = fdufVar;
        this.j.m(dotaVar);
        if (dpxeVar == null || !dotaVar.bK()) {
            return;
        }
        if (!this.e.m || fdufVar.c() != dpxeVar) {
            dotaVar.r(dpxeVar);
        }
        if (((dote) dotaVar.bC()).g && str != null) {
            dovr dovrVar = dotaVar.d;
            if (dovrVar == null) {
                fdbq.c("searchController");
                dovrVar = null;
            }
            dovrVar.m(str);
        }
    }

    @Override // defpackage.dpbq
    public final void m(dpxe dpxeVar, dpxp dpxpVar) {
        dpxeVar.getClass();
        this.j.g.put(dpxeVar, dpxpVar);
    }

    @Override // defpackage.dpbq
    public final boolean n() {
        dput dputVar = this.j;
        if (dputVar.d().ordinal() == 3) {
            return false;
        }
        dpxo dpxoVarF = dputVar.f();
        if (dpxoVarF != null && dpxoVarF.gD()) {
            return true;
        }
        dputVar.i();
        return true;
    }

    public final dplk o(dpjd dpjdVar) {
        dpir dpirVar = this.c;
        int iE = dpirVar.e(dpjdVar);
        int iOrdinal = dpjdVar.ordinal();
        if (iOrdinal == 0) {
            return new dplh(iE);
        }
        if (iOrdinal == 1) {
            return new dpli(iE, dpirVar.c());
        }
        if (iOrdinal == 2) {
            return new dplg(iE);
        }
        if (iOrdinal == 3) {
            return dplf.a;
        }
        throw new fctg();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.doxa r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dpcb
            if (r0 == 0) goto L13
            r0 = r6
            dpcb r0 = (defpackage.dpcb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpcb r0 = new dpcb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            doxa r5 = r0.d
            defpackage.fctl.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            dnhb r6 = r4.n
            java.util.List r2 = r5.c
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.b(r2, r0)
            if (r6 == r1) goto L53
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L50
            fdap r5 = r5.d
            r6 = 0
            r5.invoke(r6)
        L50:
            fctx r5 = defpackage.fctx.a
            return r5
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpcf.p(doxa, fcxy):java.lang.Object");
    }

    public final void q() {
        this.j.i();
    }
}
