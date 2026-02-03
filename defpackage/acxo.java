package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.CancellationSignal;
import android.os.Parcelable;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxo extends lxd implements acxm {
    public static final cqce a = cqce.g("BugleSuperSort", "ConversationListViewModelImpl");
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl");
    public acwx b;
    private final acwy e;
    private final eosc f;
    private final int g;
    private List h;
    private final fcsu i;
    private Parcelable j;
    private lvv k;
    private Snackbar l;
    private final aczb q;
    private acxn r;
    private final Object d = new Object();
    private Boolean m = true;
    private Boolean n = true;
    private Boolean o = false;
    private Boolean p = false;

    public acxo(acwy acwyVar, Context context, eosc eoscVar, fcsu fcsuVar, aczb aczbVar) {
        int dimensionPixelSize;
        this.e = acwyVar;
        this.f = eoscVar;
        this.q = aczbVar;
        try {
            dimensionPixelSize = (context.getResources().getDisplayMetrics().heightPixels / context.getResources().getDimensionPixelSize(R.dimen.conversation_list_item_view_min_height_m2)) + 1;
        } catch (Resources.NotFoundException unused) {
            dimensionPixelSize = 20;
        }
        this.g = dimensionPixelSize;
        this.i = fcsuVar;
    }

    @Override // defpackage.acxm
    public final int a() {
        return this.g;
    }

    @Override // defpackage.acxm
    public final Parcelable b() {
        return this.j;
    }

    @Override // defpackage.acxm
    public final lvv c(cdpg cdpgVar, acwb acwbVar) {
        orl orlVar;
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("ConversationListViewModelImpl getConversationList called");
        cqbdVarC.A("instance", "0x".concat(String.valueOf(Integer.toHexString(hashCode()))));
        cqbdVarC.r();
        if (this.k != null) {
            ekrg ekrgVar = c;
            ekrw ekrwVarE = ekrgVar.e();
            ekrz ekrzVar = eksq.a;
            ekrwVarE.X(ekrzVar, "ConversationListViewModelImpl");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl", "getConversationList", 148, "ConversationListViewModelImpl.java")).q("Reuse livePagedList");
            if (this.b != null) {
                ekrw ekrwVarH = ekrgVar.h();
                ekrwVarH.X(ekrzVar, "ConversationListViewModelImpl");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl", "getConversationList", 150, "ConversationListViewModelImpl.java")).q("getConversationList invalidate data source");
                this.b.c();
            }
            return this.k;
        }
        synchronized (this.d) {
            if (this.b == null) {
                this.b = this.e.a(cdpgVar, this.g);
            }
            List list = this.h;
            if (list != null) {
                this.b.d(list);
                this.h = null;
            }
            final acwx acwxVar = this.b;
            int i = this.g;
            int i2 = i + i;
            if (i2 <= 0) {
                throw new IllegalArgumentException("Page size must be a positive number");
            }
            ouj oujVar = new ouj(i2, i2, i2 * 3);
            acwxVar.getClass();
            fdlj fdljVar = fdlj.a;
            fdli.b(akj.b);
            eosc eoscVar = this.f;
            eoscVar.getClass();
            final fdjq fdjqVarB = fdli.b(eoscVar);
            orlVar = new orl(fdljVar, acwbVar, oujVar, new oxc(fdjqVarB, new fdae() { // from class: opm
                @Override // defpackage.fdae
                public final Object invoke() {
                    acwx.a.p("Creating a new instance of ConversationListDataSource.");
                    acwx acwxVar2 = (acwx) acwxVar;
                    acwxVar2.s = new acwu(acwxVar2);
                    return new orh(fdjqVarB, acwxVar2.s);
                }
            }), fdli.b(akj.a), fdjqVarB);
            this.k = orlVar;
        }
        return orlVar;
    }

    @Override // defpackage.acxm
    public final aczb d() {
        return this.q;
    }

    @Override // defpackage.acxm
    public final Snackbar e() {
        return this.l;
    }

    @Override // defpackage.acxm
    public final Boolean f() {
        return this.m;
    }

    @Override // defpackage.acxm
    public final Boolean g() {
        return this.p;
    }

    @Override // defpackage.acxm
    public final Boolean h() {
        return this.n;
    }

    @Override // defpackage.acxm
    public final Boolean i() {
        return this.o;
    }

    @Override // defpackage.acxm
    public final void j(cdpg cdpgVar) {
        cqbd cqbdVarD = a.d();
        cqbdVarD.v("Fetching conversation list");
        cqbdVarD.A("ConversationListDataSource", this.b);
        cqbdVarD.y("instance", hashCode());
        cqbdVarD.r();
        synchronized (this.d) {
            if (this.b == null) {
                this.b = this.e.a(cdpgVar, this.g);
            }
        }
        final acwx acwxVar = this.b;
        eieu eieuVarK = eiiy.k("ConversationListDataSources#getFirstLoadList");
        try {
            ((dzuc) acwxVar.o.b()).e(acxg.b);
            acwxVar.u = true;
            acwxVar.w = acww.NOT_STARTED;
            eieu eieuVarK2 = eiiy.k("ConversationListDataSources#getNudgeSettings");
            try {
                acwxVar.z = eijx.e(crku.a);
                eieuVarK2.close();
                eiju eijuVarH = acwxVar.z.h(new ejvr() { // from class: acwn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        acwx acwxVar2 = acwxVar;
                        crku crkuVar = (crku) obj;
                        SuperSortLabel superSortLabel = (SuperSortLabel) acwxVar2.m.get();
                        eieu eieuVarK3 = eiiy.k("ConversationListDataSources#prefetchInitialQuery");
                        try {
                            acwxVar2.e();
                            adms admsVar = acwxVar2.n;
                            cdpg cdpgVar2 = acwxVar2.l;
                            int i = acwxVar2.x;
                            Map map = acwxVar2.A;
                            acwp acwpVar = new acwp(acwxVar2);
                            eieu eieuVarK4 = eiiy.k("ConversationListDataSources#buildFirstPageQuery");
                            try {
                                adms.d("prefetchFirstPage", cdpgVar2, superSortLabel);
                                ejwl.l(admsVar.d == null);
                                aewb aewbVarB = admsVar.b(cdpgVar2, superSortLabel);
                                afcy afcyVarG = afcz.g();
                                afcyVarG.d(i);
                                afcyVarG.e(crkuVar);
                                admsVar.d = aewbVarB.i(afcyVarG.a(), admsVar.b);
                                admsVar.e = acwpVar;
                                eieuVarK4.close();
                                try {
                                    CancellationSignal cancellationSignal = new CancellationSignal();
                                    aeum aeumVar = admsVar.d;
                                    aeumVar.getClass();
                                    dqpi dqpiVar = admsVar.e;
                                    dqpiVar.getClass();
                                    aeum aeumVarA = admsVar.a(aeumVar, dqpiVar, cancellationSignal);
                                    aeumVarA.getClass();
                                    List listC = admsVar.c(aeumVarA, map, cancellationSignal);
                                    int size = listC.size();
                                    ((dzuc) acwxVar2.o.b()).g(acxg.b, null, null, dzua.SUCCESS);
                                    acwxVar2.e.a(adaw.a);
                                    acvt acvtVar = new acvt(listC, 0, size, false);
                                    eieuVarK3.close();
                                    return acvtVar;
                                } catch (dqwt e) {
                                    throw new IllegalStateException("This should never happen, prefetch is never cancelled.", e);
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                eieuVarK3.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, acwxVar.g);
                eieuVarK.b(eijuVarH);
                acwxVar.y = eijuVarH;
                eieuVarK.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.acxm
    public final void k() {
        if (this.b == null) {
            a.r("Cannot init reminder trigger listener because the data source is still null.");
            return;
        }
        if (czwc.b()) {
            fcsu fcsuVar = this.i;
            if (((Optional) fcsuVar.b()).isPresent()) {
                this.r = new acxn(this);
                ((clfb) ((Optional) fcsuVar.b()).get()).j(this.r);
            }
        }
    }

    @Override // defpackage.acxm
    public final void l(String str) {
        acwx acwxVar = this.b;
        if (acwxVar == null || !acwxVar.v) {
            ekrw ekrwVarE = c.e();
            ekrwVarE.X(eksq.a, "ConversationListViewModelImpl");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl", "onConversationListAggregatorUpdate", 301, "ConversationListViewModelImpl.java")).t("list not loaded, suppress %s invalidate data source", str);
        } else {
            ekrw ekrwVarH = c.h();
            ekrwVarH.X(eksq.a, "ConversationListViewModelImpl");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl", "onConversationListAggregatorUpdate", 296, "ConversationListViewModelImpl.java")).t("%s invalidate data source", str);
            acwx acwxVar2 = this.b;
            acwxVar2.n.g = this.q.a;
            acwxVar2.c();
        }
    }

    @Override // defpackage.acxm
    public final void m() {
        dqpi dqpiVar;
        if (this.r != null && czwc.b()) {
            fcsu fcsuVar = this.i;
            if (((Optional) fcsuVar.b()).isPresent()) {
                ((clfb) ((Optional) fcsuVar.b()).get()).o(this.r);
            }
        }
        acwx acwxVar = this.b;
        if (acwxVar != null) {
            adms admsVar = acwxVar.n;
            aeum aeumVar = admsVar.d;
            if (aeumVar != null && (dqpiVar = admsVar.e) != null) {
                aeumVar.Q(dqpiVar);
            }
            if (((arfq) acwxVar.p.b()).a()) {
                acwxVar.C.set(false);
            }
        }
    }

    @Override // defpackage.acxm
    public final void n() {
        adms admsVar;
        aeum aeumVar;
        dqpi dqpiVar;
        acwx acwxVar = this.b;
        if (acwxVar == null || (aeumVar = (admsVar = acwxVar.n).d) == null || (dqpiVar = admsVar.e) == null) {
            return;
        }
        aeumVar.M(dqpiVar);
    }

    @Override // defpackage.acxm
    public final void o(List list) {
        acwx acwxVar = this.b;
        if (acwxVar == null) {
            this.h = list;
        } else {
            acwxVar.d(list);
        }
    }

    @Override // defpackage.acxm
    public final void p(Snackbar snackbar) {
        this.l = snackbar;
    }

    @Override // defpackage.acxm
    public final void q(Boolean bool) {
        this.m = bool;
    }

    @Override // defpackage.acxm
    public final void r(Boolean bool) {
        this.p = bool;
    }

    @Override // defpackage.acxm
    public final void s(Boolean bool) {
        this.n = bool;
    }

    @Override // defpackage.acxm
    public final void t(Boolean bool) {
        this.o = bool;
    }

    @Override // defpackage.acxm
    public final void u(Parcelable parcelable) {
        this.j = parcelable;
    }

    @Override // defpackage.acxm
    public final boolean v() {
        acwx acwxVar = this.b;
        if (acwxVar == null) {
            return false;
        }
        acww acwwVar = acwxVar.w;
        return acwwVar == acww.REFRESHING || acwwVar == acww.FINISHED;
    }

    @Override // defpackage.acxm
    public final boolean w() {
        acwx acwxVar = this.b;
        return acwxVar != null && acwxVar.w == acww.FINISHED;
    }

    @Override // defpackage.acxm
    public final boolean x() {
        return this.j == null;
    }
}
