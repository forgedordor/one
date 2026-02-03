package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;
import com.google.android.material.tabs.TabLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpao extends dozd {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/sticker/ui/screen/StickerScreen");
    public fdjx aB;
    public fdjx aC;
    public dqav aD;
    public dpaw aE;
    public doyo aF;
    public doam aG;
    public volatile int aH;
    public doco ag;
    public GridLayoutManager b;
    private final dpxe bb;
    private GridLayoutManager bc;
    private docn bd;
    private final AtomicBoolean be;
    private final AtomicBoolean bf;
    private fdkf bg;
    private fdkf bh;
    private final fdap bi;
    private final dozp bj;
    public dpaz c;
    public GridLayoutManager d;
    public dpav e;

    public dpao() {
        super(new docs(dozm.a), new doze(false, false, 2047));
        this.bb = dpxe.f;
        this.be = new AtomicBoolean();
        this.bf = new AtomicBoolean();
        this.aH = 1;
        this.bi = new fdap() { // from class: dozg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dpgl dpglVar;
                View view = (View) obj;
                view.getClass();
                dpao dpaoVar = this.a;
                if (dpaoVar.aX != null && (dpglVar = dpaoVar.bM().k) != null) {
                    dpao.bl(dpglVar, view);
                }
                return fctx.a;
            }
        };
        this.bj = new dozp(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bV(boolean z, fcxy fcxyVar) {
        fdkf fdkfVar;
        fdkf fdkfVar2 = null;
        if (z || (fdkfVar = this.bh) == null || fdkfVar.x()) {
            fdkf fdkfVar3 = this.bh;
            if (fdkfVar3 != null && fdkfVar3.v()) {
                fdkf fdkfVar4 = this.bh;
                if (fdkfVar4 == null) {
                    fdbq.c("_favoritePacksDeferred");
                    fdkfVar4 = null;
                }
                fdkfVar4.t(null);
            }
            this.bh = fdil.c(bs(), null, new dozq(this, null), 3);
        }
        fdkf fdkfVar5 = this.bh;
        if (fdkfVar5 == null) {
            fdbq.c("_favoritePacksDeferred");
        } else {
            fdkfVar2 = fdkfVar5;
        }
        return fdkfVar2.c(fcxyVar);
    }

    public static final /* synthetic */ doze bo(dpao dpaoVar) {
        return (doze) dpaoVar.bC();
    }

    static /* synthetic */ Object bw(dpao dpaoVar, fcxy fcxyVar) {
        return dpaoVar.bV(false, fcxyVar);
    }

    static /* synthetic */ Object by(dpao dpaoVar, fcxy fcxyVar) {
        fdkf fdkfVar = dpaoVar.bg;
        fdkf fdkfVar2 = null;
        if (fdkfVar == null || fdkfVar.x()) {
            fdkf fdkfVar3 = dpaoVar.bg;
            if (fdkfVar3 != null && fdkfVar3.v()) {
                fdkf fdkfVar4 = dpaoVar.bg;
                if (fdkfVar4 == null) {
                    fdbq.c("_stickerPacksDeferred");
                    fdkfVar4 = null;
                }
                fdkfVar4.t(null);
            }
            dpaoVar.bg = fdil.c(dpaoVar.bs(), null, new dpan(dpaoVar, null), 3);
        }
        fdkf fdkfVar5 = dpaoVar.bg;
        if (fdkfVar5 == null) {
            fdbq.c("_stickerPacksDeferred");
        } else {
            fdkfVar2 = fdkfVar5;
        }
        return fdkfVar2.c(fcxyVar);
    }

    public static final void bz(TabLayout tabLayout, dozn doznVar) {
        tabLayout.getClass();
        doznVar.getClass();
        int iB = tabLayout.b();
        if (iB < 0) {
            return;
        }
        int i = 0;
        while (true) {
            eeve eeveVarD = tabLayout.d(i);
            if ((eeveVarD != null ? eeveVarD.a : null) == doznVar) {
                tabLayout.l(tabLayout.d(i));
                return;
            } else if (i == iB) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.docj, defpackage.ea
    public final void ap(View view, Bundle bundle) throws Resources.NotFoundException {
        view.getClass();
        super.ap(view, bundle);
        int dimensionPixelSize = A().getResources().getDimensionPixelSize(((doze) bC()).c);
        dqav dqavVarBp = bp();
        this.bc = dqavVarBp.a(new dqay(new dqbf(dimensionPixelSize)));
        doco docoVar = this.ag;
        if (docoVar == null) {
            fdbq.c("recentStickersAdapterFactory");
            docoVar = null;
        }
        fctc fctcVar = dofn.a;
        this.bd = docoVar.a(new dons(dofm.a(), ImageView.ScaleType.FIT_CENTER, ((doze) bC()).e), new doik(dpaa.a), new dpab(this), new dpac(this));
        dpaw dpawVar = this.aE;
        if (dpawVar == null) {
            fdbq.c("stickerPackAdapterFactory");
            dpawVar = null;
        }
        this.e = new dpav((dobl) dpawVar.a.b(), new fdap() { // from class: dozh
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dpao dpaoVar = this.a;
                fdil.d(dpaoVar.bH(), null, null, new dpad(dpaoVar, (doyt) obj, null), 3);
                return fctx.a;
            }
        }, new dpae(this), new fdap() { // from class: dozi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                this.a.bx();
                return fctx.a;
            }
        }, new fdat() { // from class: dozj
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                dpao dpaoVar = this.a;
                fdil.d(dpaoVar.bH(), null, null, new dpaf(dpaoVar, (doyu) obj, (Boolean) obj2, null), 3);
                return fctx.a;
            }
        });
        dqav dqavVarBp2 = bp();
        final ReactiveGridLayoutManager reactiveGridLayoutManagerA = dqavVarBp2.a(new dqay(new dqbf(dimensionPixelSize)));
        dpav dpavVar = this.e;
        if (dpavVar == null) {
            fdbq.c("stickerPackAdapter");
            dpavVar = null;
        }
        reactiveGridLayoutManagerA.g = new dozo(dpavVar, new fdae() { // from class: dozk
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(((GridLayoutManager) reactiveGridLayoutManagerA).b);
            }
        });
        this.d = reactiveGridLayoutManagerA;
        this.b = bp().a(new dqay(new dqbg(A().getResources().getDimensionPixelSize(R.dimen.gifsticker_category_min_width), ((doze) bC()).a)));
        dpaz dpazVar = new dpaz(new fdap() { // from class: dozl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                doyu doyuVar = (doyu) obj;
                doyuVar.getClass();
                dpao dpaoVar = this.a;
                fdil.d(dpaoVar.bH(), null, null, new dozt(dpaoVar, doyuVar, null), 3);
                return fctx.a;
            }
        });
        this.c = dpazVar;
        dpazVar.F(this.bi);
        ((doyn) bn()).a.j(new dozw(this));
        if (((doze) bC()).d) {
            TabLayout tabLayout = this.ao;
            tabLayout.getClass();
            tabLayout.w();
            eeve eeveVarE = tabLayout.e();
            eeveVarE.h(R.string.sticker_tab_recents);
            eeveVarE.g(R.drawable.quantum_gm_ic_schedule_vd_theme_24);
            eeveVarE.a = dozn.a;
            tabLayout.g(eeveVarE);
            eeve eeveVarE2 = tabLayout.e();
            eeveVarE2.h(R.string.sticker_tab_favorites);
            eeveVarE2.g(R.drawable.quantum_gm_ic_favorite_vd_theme_24);
            eeveVarE2.a = dozn.b;
            tabLayout.g(eeveVarE2);
            eeve eeveVarE3 = tabLayout.e();
            eeveVarE3.h(R.string.sticker_tab_all_packs);
            eeveVarE3.g(R.drawable.quantum_gm_ic_sticker_vd_theme_24);
            eeveVarE3.a = dozn.c;
            tabLayout.g(eeveVarE3);
            tabLayout.f(this.bj);
            if (bJ()) {
                tabLayout.y();
            }
        }
        fdil.d(lvk.a(Q()), null, null, new dozz(this, null), 3);
    }

    public final doam bm() {
        doam doamVar = this.aG;
        if (doamVar != null) {
            return doamVar;
        }
        fdbq.c("tenorApi");
        return null;
    }

    public final doyo bn() {
        doyo doyoVar = this.aF;
        if (doyoVar != null) {
            return doyoVar;
        }
        fdbq.c("stickerPacksApi");
        return null;
    }

    public final dqav bp() {
        dqav dqavVar = this.aD;
        if (dqavVar != null) {
            return dqavVar;
        }
        fdbq.c("gridLayoutManagerFactory");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bq(java.util.List r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.dozr
            if (r0 == 0) goto L13
            r0 = r12
            dozr r0 = (defpackage.dozr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dozr r0 = new dozr
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r12)
            goto Lc9
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.fctl.b(r12)
            docn r12 = r10.bd
            r2 = 0
            if (r12 != 0) goto L3e
            java.lang.String r12 = "recentStickersAdapter"
            defpackage.fdbq.c(r12)
            r12 = r2
        L3e:
            java.util.List r4 = r12.f
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.fcva.p(r11, r6)
            r5.<init>(r6)
            java.util.Iterator r11 = r11.iterator()
        L4f:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L93
            java.lang.Object r6 = r11.next()
            dobg r6 = (defpackage.dobg) r6
            java.util.Iterator r7 = r4.iterator()
        L5f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L73
            java.lang.Object r8 = r7.next()
            r9 = r8
            dobg r9 = (defpackage.dobg) r9
            boolean r9 = defpackage.fdbq.f(r9, r6)
            if (r9 == 0) goto L5f
            goto L74
        L73:
            r8 = r2
        L74:
            dobg r8 = (defpackage.dobg) r8
            if (r8 != 0) goto L8e
            dozs r7 = new dozs
            r7.<init>(r10, r6, r2)
            dohu r8 = new dohu
            r8.<init>(r7)
            dobh r7 = new dobh
            r7.<init>(r8)
            fdap r7 = defpackage.dngp.a(r7)
            r6.d = r7
            goto L8f
        L8e:
            r6 = r8
        L8f:
            r5.add(r6)
            goto L4f
        L93:
            r8 = 0
            r9 = 60
            r6 = 0
            r7 = 0
            java.util.List r11 = defpackage.dndw.a(r4, r5, r6, r7, r8, r9)
            r12.f = r5
            android.support.v7.widget.GridLayoutManager r4 = r10.bc
            if (r4 != 0) goto La8
            java.lang.String r4 = "recentStickersLayoutManager"
            defpackage.fdbq.c(r4)
            goto La9
        La8:
            r2 = r4
        La9:
            int r2 = r2.b
            int r2 = r2 * 6
            defpackage.dndw.b(r11, r2, r12)
            int r11 = r10.aH
            r12 = 2
            if (r11 != r12) goto Lcc
            dpim r11 = r10.bC()
            doze r11 = (defpackage.doze) r11
            boolean r11 = r11.d
            if (r11 == 0) goto Lc9
            r0.c = r3
            java.lang.Object r11 = r10.br(r0)
            if (r11 == r1) goto Lc8
            goto Lc9
        Lc8:
            return r1
        Lc9:
            r10.bx()
        Lcc:
            r11 = 3
            r10.aH = r11
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpao.bq(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:28:0x0064, B:30:0x006c, B:32:0x0075), top: B:49:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #1 {Exception -> 0x002b, blocks: (B:12:0x0027, B:28:0x0064, B:30:0x006c, B:32:0x0075), top: B:49:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object br(defpackage.fcxy r7) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dpah
            if (r0 == 0) goto L13
            r0 = r7
            dpah r0 = (defpackage.dpah) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dpah r0 = new dpah
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r1 = r0.b
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r7)     // Catch: java.lang.Exception -> L2b
            goto L64
        L2b:
            r7 = move-exception
            goto L83
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.fctl.b(r7)
            com.google.android.material.tabs.TabLayout r7 = r6.ao
            r7.getClass()
            docn r2 = r6.bd
            if (r2 != 0) goto L47
            java.lang.String r2 = "recentStickersAdapter"
            defpackage.fdbq.c(r2)
            r2 = 0
        L47:
            java.util.List r2 = r2.f
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L55
            dozn r0 = defpackage.dozn.a
            bz(r7, r0)
            return r7
        L55:
            r0.a = r7     // Catch: java.lang.Exception -> L7f
            r0.b = r7     // Catch: java.lang.Exception -> L7f
            r0.e = r3     // Catch: java.lang.Exception -> L7f
            java.lang.Object r0 = bw(r6, r0)     // Catch: java.lang.Exception -> L7f
            if (r0 == r1) goto L7e
            r1 = r7
            r7 = r0
            r0 = r1
        L64:
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Exception -> L2b
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Exception -> L2b
            if (r7 != 0) goto L75
            dozn r7 = defpackage.dozn.b     // Catch: java.lang.Exception -> L2b
            r2 = r1
            com.google.android.material.tabs.TabLayout r2 = (com.google.android.material.tabs.TabLayout) r2     // Catch: java.lang.Exception -> L2b
            bz(r2, r7)     // Catch: java.lang.Exception -> L2b
            return r0
        L75:
            dozn r7 = defpackage.dozn.c     // Catch: java.lang.Exception -> L2b
            r2 = r1
            com.google.android.material.tabs.TabLayout r2 = (com.google.android.material.tabs.TabLayout) r2     // Catch: java.lang.Exception -> L2b
            bz(r2, r7)     // Catch: java.lang.Exception -> L2b
            return r0
        L7e:
            return r1
        L7f:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r0 = r1
        L83:
            boolean r2 = r7 instanceof java.lang.RuntimeException
            if (r2 != 0) goto L97
            boolean r2 = r7 instanceof java.io.IOException
            if (r2 == 0) goto L96
            dpim r2 = r6.bC()
            doze r2 = (defpackage.doze) r2
            boolean r2 = r2.b
            if (r2 == 0) goto L96
            goto L97
        L96:
            throw r7
        L97:
            ekrg r2 = defpackage.dpao.a
            ekrw r2 = r2.i()
            ekrd r2 = (defpackage.ekrd) r2
            ekrw r7 = r2.g(r7)
            r2 = 295(0x127, float:4.13E-43)
            java.lang.String r3 = "StickerScreen.kt"
            java.lang.String r4 = "com/google/android/libraries/compose/sticker/ui/screen/StickerScreen"
            java.lang.String r5 = "selectInitialCategory"
            ekrw r7 = r7.h(r4, r5, r2, r3)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r2 = "Unable to fetch favorite packs for initial tab."
            r7.q(r2)
            dozn r7 = defpackage.dozn.c
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            bz(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpao.br(fcxy):java.lang.Object");
    }

    public final fdjx bs() {
        fdjx fdjxVar = this.aB;
        if (fdjxVar != null) {
            return fdjxVar;
        }
        fdbq.c("cpuBoundScope");
        return null;
    }

    public final void bt(dozn doznVar) {
        int iOrdinal = doznVar.ordinal();
        docn docnVar = null;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                fdil.d(bH(), null, null, new dpak(this, null), 3);
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new fctg();
                }
                fdil.d(bH(), null, null, new dpai(this, null), 3);
                return;
            }
        }
        docn docnVar2 = this.bd;
        if (docnVar2 == null) {
            fdbq.c("recentStickersAdapter");
            docnVar2 = null;
        }
        if (docnVar2.f.isEmpty()) {
            docj.bk(this, null, Integer.valueOf(R.string.sticker_empty_recents_message), null, Integer.valueOf(R.string.sticker_empty_state_show_all_packs_button), new View.OnClickListener() { // from class: dozf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TabLayout tabLayout = this.a.ao;
                    tabLayout.getClass();
                    dpao.bz(tabLayout, dozn.c);
                }
            }, 5);
            return;
        }
        GridLayoutManager gridLayoutManager = this.bc;
        if (gridLayoutManager == null) {
            fdbq.c("recentStickersLayoutManager");
            gridLayoutManager = null;
        }
        docn docnVar3 = this.bd;
        if (docnVar3 == null) {
            fdbq.c("recentStickersAdapter");
        } else {
            docnVar = docnVar3;
        }
        bi(gridLayoutManager, docnVar);
    }

    public final void bu() {
        docj.bk(this, null, null, this.bf.compareAndSet(false, true) ? Integer.valueOf(R.string.sticker_unable_to_show_packs_message) : null, null, null, 27);
    }

    public final void bx() {
        fdil.d(bH(), null, null, new dpam(this, null), 3);
    }

    @Override // defpackage.docj
    public final /* bridge */ /* synthetic */ void e(doav doavVar, String str) {
        doyt doytVar = (doyt) doavVar;
        bh(new dobg(doytVar.a, doytVar.b), str);
        fdjx fdjxVar = this.aC;
        if (fdjxVar == null) {
            fdbq.c("remoteIoScope");
            fdjxVar = null;
        }
        fdil.d(fdjxVar, null, null, new dpag(doytVar, this, null), 3);
    }

    @Override // defpackage.docj
    public final void f() {
        bn();
        if (ebve.e(A())) {
            fdil.d(bH(), null, null, new dpal(this, null), 3);
            return;
        }
        if (this.be.compareAndSet(false, true)) {
            docj.bk(this, null, null, Integer.valueOf(R.string.sticker_no_connection_message), null, null, 27);
        }
        if (((doze) bC()).d) {
            bc();
        }
    }

    @Override // defpackage.dpil
    public final boolean gD() {
        dpav dpavVar = this.e;
        if (dpavVar == null) {
            fdbq.c("stickerPackAdapter");
            dpavVar = null;
        }
        dpavVar.getClass();
        vo voVar = this.aj;
        if (voVar == null || !fdbq.f(voVar, dpavVar)) {
            return false;
        }
        f();
        return true;
    }

    @Override // defpackage.dpxo
    public final dpxe t() {
        return this.bb;
    }
}
