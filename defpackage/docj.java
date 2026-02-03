package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveStaggeredGridLayoutManager;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class docj extends dpxs {
    private static final ekrg a = ekrg.c("com/google/android/libraries/compose/gifsticker/ui/screen/GifStickerScreen");
    public static final /* synthetic */ int aA = 0;
    private final fctc aB;
    private final docs aC;
    private View ag;
    public final int ah;
    protected RecyclerView ai;
    protected vo aj;
    public sp ak;
    public dqaf al;
    public docn am;
    public wb an;
    public TabLayout ao;
    public final AtomicBoolean ap;
    public fdjx aq;
    public doco ar;
    public dqav as;
    public fcsu at;
    public dqbe au;
    public dodf av;
    public dner aw;
    public Optional ax;
    public Optional ay;
    protected dneq az;
    private final int b;
    private final fctc c;
    private dpyb d;
    private docr e;

    public docj(int i, int i2, docs docsVar, dobm dobmVar) {
        super(R.layout.gifsticker_screen_layout, dobmVar);
        this.b = i;
        this.ah = i2;
        this.aC = docsVar;
        this.c = fctd.a(new fdae() { // from class: dobp
            @Override // defpackage.fdae
            public final Object invoke() {
                return new dpxm(this.a.N());
            }
        });
        this.ap = new AtomicBoolean();
        this.aB = fctd.a(new fdae() { // from class: dobq
            @Override // defpackage.fdae
            public final Object invoke() {
                fcsu fcsuVar = this.a.at;
                if (fcsuVar == null) {
                    fdbq.c("gifStickerContextMenuProvider");
                    fcsuVar = null;
                }
                return (dobn) fcsuVar.b();
            }
        });
    }

    private final dobn a() {
        return (dobn) this.aB.a();
    }

    private final dpxm b() {
        return (dpxm) this.c.a();
    }

    public static /* synthetic */ void bk(docj docjVar, Integer num, Integer num2, Integer num3, Integer num4, View.OnClickListener onClickListener, int i) {
        if ((i & 16) != 0) {
            onClickListener = new View.OnClickListener() { // from class: dobu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = docj.aA;
                }
            };
        }
        View.OnClickListener onClickListener2 = onClickListener;
        int i2 = i & 8;
        int i3 = i & 4;
        int i4 = i & 2;
        int i5 = i & 1;
        Integer num5 = i2 != 0 ? null : num4;
        if (i3 != 0) {
            num3 = null;
        }
        if (i4 != 0) {
            num2 = null;
        }
        Integer num6 = 1 == i5 ? null : num;
        onClickListener2.getClass();
        dpxm.c(docjVar.b(), num6, num2, null, num5, onClickListener2, 4);
        if (num3 != null) {
            num3.intValue();
            fdil.d(docjVar.bH(), null, null, new doch(docjVar, num3, null), 3);
        }
        docjVar.r().setVisibility(8);
    }

    public static final void bl(dpgl dpglVar, View view) {
        view.getBackground().setColorFilter(new PorterDuffColorFilter(ijg.b(dpglVar.a.I), PorterDuff.Mode.SRC_IN));
    }

    @Override // defpackage.ea
    public final boolean aL(MenuItem menuItem) {
        menuItem.getClass();
        if (!((dobm) bC()).d()) {
            return false;
        }
        dobn dobnVarA = a();
        if (menuItem.getItemId() != R.id.report_item) {
            throw new IllegalArgumentException("Unrecognized menu option, id: " + menuItem.getItemId());
        }
        doav doavVar = dobnVarA.b;
        if (doavVar == null) {
            fdbq.c("selectedMedia");
            doavVar = null;
        }
        if (!fcva.ay(doavVar.c())) {
            throw new IllegalArgumentException("Media should have at least one variation.");
        }
        doaj doajVar = dobnVarA.a;
        Intent intent = new Intent("android.intent.action.VIEW", doajVar.b.a(((doau) fcva.M(doavVar.c())).b));
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        doajVar.a.startActivity(intent);
        return false;
    }

    @Override // defpackage.dpxs
    public final dpyb aV() {
        dpyb dpybVar = this.d;
        if (dpybVar != null) {
            return dpybVar;
        }
        dodf dodfVar = this.av;
        if (dodfVar != null) {
            dobm dobmVar = (dobm) bC();
            int i = this.b;
            docs docsVar = this.aC;
            dobx dobxVar = new dobx(this);
            doby dobyVar = new doby(this);
            dobz dobzVar = new dobz(this);
            doca docaVar = new doca(this);
            fdjx fdjxVar = (fdjx) dodfVar.a.b();
            fdjxVar.getClass();
            ((Context) dodfVar.b.b()).getClass();
            doam doamVar = (doam) dodfVar.c.b();
            doamVar.getClass();
            dobmVar.getClass();
            docsVar.getClass();
            this.d = new dode(fdjxVar, doamVar, dodfVar.d, dobmVar, i, docsVar, dobxVar, dobyVar, dobzVar, docaVar);
        }
        return this.d;
    }

    public final dneq aW() {
        dneq dneqVar = this.az;
        if (dneqVar != null) {
            return dneqVar;
        }
        fdbq.c("usageProcessor");
        return null;
    }

    public final fdjx aY() {
        fdjx fdjxVar = this.aq;
        if (fdjxVar != null) {
            return fdjxVar;
        }
        fdbq.c("cpuBoundScope");
        return null;
    }

    @Override // defpackage.dpxo
    protected final void aZ(final dpgl dpglVar) {
        ((ekrd) a.e().h("com/google/android/libraries/compose/gifsticker/ui/screen/GifStickerScreen", "applyHugoColors", 225, "GifStickerScreen.kt")).t("Applying HugoColors: %s", dpglVar);
        TabLayout tabLayout = this.ao;
        if (tabLayout != null) {
            tabLayout.setBackgroundColor(dpglVar.d);
            ColorStateList colorStateList = bJ() ? dpglVar.j : dpglVar.i;
            tabLayout.t(colorStateList);
            tabLayout.r(colorStateList);
            if (bJ()) {
                tabLayout.q(dpglVar.g);
            }
        }
        View view = this.ag;
        if (view != null) {
            view.setVisibility(0);
            view.setBackgroundColor(ijg.b(dpglVar.a.r));
        }
        vo voVar = r().n;
        dpaz dpazVar = voVar instanceof dpaz ? (dpaz) voVar : null;
        if (dpazVar != null) {
            dpazVar.F(new fdap() { // from class: dobo
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    View view2 = (View) obj;
                    view2.getClass();
                    docj.bl(dpglVar, view2);
                    return fctx.a;
                }
            });
            dpazVar.p();
        }
        b().b(dpglVar.l, dpglVar.m);
    }

    @Override // defpackage.ea
    public void ap(View view, Bundle bundle) throws Resources.NotFoundException {
        wb reactiveStaggeredGridLayoutManager;
        Resources resources;
        view.getClass();
        RecyclerView recyclerView = (RecyclerView) ley.b(N(), R.id.gifsticker_screen_recycler_view);
        recyclerView.getClass();
        this.ai = recyclerView;
        dphw.f(r(), R.id.proxy_screen_header);
        Optional optional = this.ay;
        dqbe dqbeVar = null;
        dqav dqavVar = null;
        if (optional == null) {
            fdbq.c("enableEdgeToEdge");
            optional = null;
        }
        if (((Boolean) fdct.a(optional, false)).booleanValue() && dpxf.a(t())) {
            RecyclerView recyclerViewR = r();
            View decorView = fg().getWindow().getDecorView();
            decorView.getClass();
            dphw.e(recyclerViewR, decorView);
        }
        Context contextZ = z();
        this.al = new dqaf((contextZ == null || (resources = contextZ.getResources()) == null) ? null : Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.standard_corner_radius)), new fdap() { // from class: dobr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dqac dqacVar = (dqac) obj;
                dqacVar.getClass();
                this.a.bT().m(dqacVar.a);
                return fctx.a;
            }
        });
        z();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        dqaf dqafVar = this.al;
        if (dqafVar == null) {
            fdbq.c("relatedSearchesAdapter");
            dqafVar = null;
        }
        this.e = new docr(linearLayoutManager, dqafVar, A().getResources().getDimensionPixelOffset(R.dimen.standard_view_padding));
        doco docoVar = this.ar;
        if (docoVar == null) {
            fdbq.c("gifStickerMediaAdapterFactory");
            docoVar = null;
        }
        this.am = docoVar.a(new dons(((dobm) bC()).b(), ImageView.ScaleType.FIT_CENTER, ((dobm) bC()).d()), new doil(), new doce(this), new docf(this));
        vo[] voVarArr = new vo[2];
        docr docrVar = this.e;
        if (docrVar == null) {
            fdbq.c("nestedRecyclerViewAdapter");
            docrVar = null;
        }
        voVarArr[0] = docrVar;
        docn docnVar = this.am;
        if (docnVar == null) {
            fdbq.c("searchResultsAdapter");
            docnVar = null;
        }
        voVarArr[1] = docnVar;
        this.ak = new sp(so.a, voVarArr);
        int dimensionPixelSize = A().getResources().getDimensionPixelSize(((dobm) bC()).a());
        ((dobm) bC()).h();
        dqbf dqbfVar = new dqbf(dimensionPixelSize);
        if (((dobm) bC()).b() != null) {
            dqav dqavVar2 = this.as;
            if (dqavVar2 == null) {
                fdbq.c("gridLayoutManagerFactory");
            } else {
                dqavVar = dqavVar2;
            }
            reactiveStaggeredGridLayoutManager = dqavVar.a(new dqay(dqbfVar, new dqat() { // from class: dobs
                @Override // defpackage.dqat
                public final int a(int i, int i2, int i3) {
                    int i4 = docj.aA;
                    if (i == 0) {
                        return i3;
                    }
                    return 1;
                }
            }));
        } else {
            dqbe dqbeVar2 = this.au;
            if (dqbeVar2 == null) {
                fdbq.c("staggeredGridLayoutManagerFactory");
            } else {
                dqbeVar = dqbeVar2;
            }
            dqay dqayVar = new dqay(dqbfVar, new dobt(this));
            Context context = (Context) dqbeVar.a.b();
            context.getClass();
            reactiveStaggeredGridLayoutManager = new ReactiveStaggeredGridLayoutManager((dqao) dqbeVar.b.b(), context.getResources().getDimensionPixelSize(R.dimen.standard_view_padding), dqayVar);
        }
        this.an = reactiveStaggeredGridLayoutManager;
        if (((dobm) bC()).g()) {
            View viewB = ley.b(N(), R.id.gifsticker_categories_tab_layout);
            viewB.getClass();
            View viewInflate = ((ViewStub) viewB).inflate();
            viewInflate.getClass();
            TabLayout tabLayout = (TabLayout) viewInflate;
            dphw.f(tabLayout, R.id.proxy_screen_tabs);
            this.ao = tabLayout;
            this.ag = view.findViewById(R.id.gifsticker_categories_tab_top_border);
        }
        if (((dobm) bC()).d()) {
            r().setOnCreateContextMenuListener(this);
        }
        bS();
    }

    public final void bc() {
        TabLayout tabLayout = this.ao;
        tabLayout.getClass();
        RecyclerView recyclerViewR = r();
        recyclerViewR.setPadding(recyclerViewR.getPaddingLeft(), recyclerViewR.getPaddingTop(), recyclerViewR.getPaddingRight(), 0);
        tabLayout.setVisibility(8);
    }

    public final void bd(doav doavVar, String str) {
        doavVar.getClass();
        Optional optional = this.ax;
        if (optional == null) {
            fdbq.c("draftAttachmentsInteractionListener");
            optional = null;
        }
        dnhr dnhrVar = (dnhr) fdct.b(optional);
        fdil.d(bH(), null, null, new docb(this, doavVar, dnhrVar != null ? dnhrVar.l(doavVar.a(), doavVar.b()) : null, str, null), 3);
    }

    protected final void bh(dobi dobiVar, String str) {
        fdil.d(bH(), null, null, new docg(this, dobiVar, str, null), 3);
    }

    public final void bi(wb wbVar, vo voVar) {
        wbVar.getClass();
        voVar.getClass();
        RecyclerView recyclerViewR = r();
        if (!fdbq.f(recyclerViewR.o, wbVar)) {
            recyclerViewR.ao(wbVar);
        }
        if (!fdbq.f(recyclerViewR.n, voVar)) {
            recyclerViewR.al(voVar);
            this.aj = voVar;
        }
        recyclerViewR.setVisibility(0);
        recyclerViewR.aj(0);
        b().a();
    }

    public final boolean bj(doav doavVar, View view, PointF pointF) {
        doavVar.getClass();
        if (!((dobm) bC()).d() || doavVar.h() != 1) {
            return false;
        }
        dobn dobnVarA = a();
        if (pointF == null) {
            pointF = new PointF();
        }
        dobnVarA.b = doavVar;
        view.showContextMenu(pointF.x, pointF.y);
        return true;
    }

    public abstract void e(doav doavVar, String str);

    public abstract void f();

    @Override // defpackage.dpil, defpackage.ea
    public void g(Context context) {
        super.g(context);
        dner dnerVar = this.aw;
        if (dnerVar == null) {
            fdbq.c("usageProcessorFactory");
            dnerVar = null;
        }
        this.az = dnerVar.a(new dnfv(31));
        aW().d();
    }

    @Override // defpackage.dpxo, defpackage.ea
    public final void l() {
        dpxz dpxzVar;
        super.l();
        String strBU = bU();
        if (strBU != null) {
            dpyb dpybVarAV = aV();
            fctx fctxVar = null;
            if (dpybVarAV != null && (dpxzVar = ((dode) dpybVarAV).k) != null) {
                dpxzVar.c(strBU);
                fctxVar = fctx.a;
            }
            if (fctxVar != null) {
                return;
            }
        }
        f();
    }

    @Override // defpackage.ea, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.getClass();
        view.getClass();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        if (((dobm) bC()).d()) {
            a();
            MenuInflater menuInflater = fg().getMenuInflater();
            menuInflater.getClass();
            menuInflater.inflate(R.menu.gifsticker_context_menu, contextMenu);
        }
    }

    public final RecyclerView r() {
        RecyclerView recyclerView = this.ai;
        if (recyclerView != null) {
            return recyclerView;
        }
        fdbq.c("recyclerView");
        return null;
    }

    @Override // defpackage.dpvx
    public final dpvw s() {
        RecyclerView recyclerView;
        View view = this.Q;
        if (view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.gifsticker_screen_recycler_view)) == null) {
            return null;
        }
        return dpvu.a(recyclerView);
    }
}
