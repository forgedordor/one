package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnyn extends dnys {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/emotify/ui/screen/EmotifyScreen");
    public dnyx ag;
    public fdjx ah;
    public dnuy ai;
    public Optional aj;
    public Optional ak;
    public Optional al;
    public dneq am;
    public dnyw an;
    public ReactiveGridLayoutManager ao;
    public final fduf ap;
    public final dnxw aq;
    private ViewStub ar;
    private ComposeView as;
    private RecyclerView at;
    private final fctc au;
    private final dpxe av;
    public Context b;
    public dnvi c;
    public dqav d;
    public dner e;

    public dnyn() {
        super(Integer.valueOf(R.layout.emotify_screen_layout), new dnxj(null));
        this.ap = fdvf.a(dnxu.a);
        this.au = fctd.a(new fdae() { // from class: dnxt
            @Override // defpackage.fdae
            public final Object invoke() {
                dnyn dnynVar = this.a;
                TabLayout tabLayout = (TabLayout) dnynVar.N().findViewById(R.id.emotify_tabs);
                tabLayout.w();
                eeve eeveVarE = tabLayout.e();
                eeveVarE.h(R.string.emotify_category_all);
                eeveVarE.a = dnxu.a;
                tabLayout.g(eeveVarE);
                eeve eeveVarE2 = tabLayout.e();
                eeveVarE2.h(R.string.emotify_category_yours);
                eeveVarE2.a = dnxu.b;
                tabLayout.g(eeveVarE2);
                eeve eeveVarE3 = tabLayout.e();
                eeveVarE3.h(R.string.emotify_category_others);
                eeveVarE3.a = dnxu.c;
                tabLayout.g(eeveVarE3);
                tabLayout.f(dnynVar.aq);
                if (dnynVar.bJ()) {
                    tabLayout.y();
                }
                return tabLayout;
            }
        });
        this.av = dpxe.i;
        this.aq = new dnxw(this);
    }

    public final Context a() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        fdbq.c("context");
        return null;
    }

    @Override // defpackage.dpxo
    protected final void aZ(final dpgl dpglVar) {
        ((ekrd) a.e().h("com/google/android/libraries/compose/emotify/ui/screen/EmotifyScreen", "applyHugoColors", 185, "EmotifyScreen.kt")).t("Applying HugoColors: %s", dpglVar);
        e().setBackgroundColor(dpglVar.d);
        e().t(bJ() ? dpglVar.j : dpglVar.i);
        if (bJ()) {
            e().q(dpglVar.g);
            dnyw dnywVar = this.an;
            if (dnywVar == null) {
                fdbq.c("recentStickersAdapter");
                dnywVar = null;
            }
            dnywVar.g = new fdap() { // from class: dnxo
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    View view = (View) obj;
                    ekrg ekrgVar = dnyn.a;
                    view.getClass();
                    Drawable background = view.getBackground();
                    background.getClass();
                    GradientDrawable gradientDrawable = (GradientDrawable) background;
                    gradientDrawable.mutate();
                    int i = (int) Resources.getSystem().getDisplayMetrics().density;
                    dpgn dpgnVar = dpglVar.p;
                    gradientDrawable.setStroke(i, dpgnVar.a);
                    gradientDrawable.setColor(dpgnVar.b);
                    return fctx.a;
                }
            };
            dnywVar.q(0);
        }
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) throws Resources.NotFoundException {
        view.getClass();
        fdil.d(p(), null, null, new dnyc(this, null), 3);
        Resources resources = A().getResources();
        int i = ((dnxj) bC()).a;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.sticker_item_min_size);
        dqav dqavVar = this.d;
        if (dqavVar == null) {
            fdbq.c("gridLayoutManagerFactory");
            dqavVar = null;
        }
        this.ao = dqavVar.a(new dqay(new dqbg(dimensionPixelSize, 3)));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.emotify_gallery_recycler_view);
        this.at = recyclerView;
        if (recyclerView == null) {
            fdbq.c("recyclerView");
            recyclerView = null;
        }
        ReactiveGridLayoutManager reactiveGridLayoutManager = this.ao;
        if (reactiveGridLayoutManager == null) {
            fdbq.c("stickerListLayoutManager");
            reactiveGridLayoutManager = null;
        }
        recyclerView.ao(reactiveGridLayoutManager);
        dnyx dnyxVar = this.ag;
        if (dnyxVar == null) {
            fdbq.c("recentStickersAdapterFactory");
            dnyxVar = null;
        }
        fctc fctcVar = dofn.a;
        dons donsVar = new dons(dofm.a(), ImageView.ScaleType.FIT_CENTER, 4);
        doik doikVar = new doik(dnyd.a);
        this.an = new dnyw((dnxf) dnyxVar.a.b(), (dnxc) dnyxVar.b.b(), (Optional) dnyxVar.c.b(), donsVar, doikVar, new fdae() { // from class: dnxk
            @Override // defpackage.fdae
            public final Object invoke() {
                return (dnhl) this.a.bG().invoke();
            }
        }, new dnye(this), new dnyf(this));
        RecyclerView recyclerView2 = this.at;
        if (recyclerView2 == null) {
            fdbq.c("recyclerView");
            recyclerView2 = null;
        }
        dnyw dnywVar = this.an;
        if (dnywVar == null) {
            fdbq.c("recentStickersAdapter");
            dnywVar = null;
        }
        recyclerView2.al(dnywVar);
        this.ar = (ViewStub) ley.b(N(), R.id.zero_state_image);
        fdil.d(bH(), null, null, new dnym(this, null), 3);
        bS();
    }

    public final dnvi b() {
        dnvi dnviVar = this.c;
        if (dnviVar != null) {
            return dnviVar;
        }
        fdbq.c("stickerStore");
        return null;
    }

    public final TabLayout e() {
        return (TabLayout) this.au.a();
    }

    public final Optional f() {
        Optional optional = this.aj;
        if (optional != null) {
            return optional;
        }
        fdbq.c("emotifySendEventTracker");
        return null;
    }

    @Override // defpackage.dnys, defpackage.dpil, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        Optional optionalF = f();
        final fdap fdapVar = new fdap() { // from class: dnxl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                abvh abvhVar = (abvh) obj;
                ekrg ekrgVar = dnyn.a;
                abvhVar.getClass();
                abvhVar.a++;
                return fctx.a;
            }
        };
        optionalF.ifPresent(new Consumer() { // from class: dnxm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ekrg ekrgVar = dnyn.a;
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dner dnerVar = this.e;
        if (dnerVar == null) {
            fdbq.c("usageProcessorFactory");
            dnerVar = null;
        }
        this.am = dnerVar.a(new dnfv(31));
        bA().d("EmotifyScreen#onAttach", new fdae() { // from class: dnxn
            @Override // defpackage.fdae
            public final Object invoke() {
                dneq dneqVar = this.a.am;
                if (dneqVar == null) {
                    fdbq.c("usageProcessor");
                    dneqVar = null;
                }
                return Boolean.valueOf(dneqVar.d());
            }
        });
    }

    public final fdjx p() {
        fdjx fdjxVar = this.ah;
        if (fdjxVar != null) {
            return fdjxVar;
        }
        fdbq.c("cpuBoundScope");
        return null;
    }

    public final void q(dnxu dnxuVar) {
        this.ap.f(dnxuVar);
    }

    public final void r(boolean z) {
        if (this.Q != null) {
            if (z && this.as == null) {
                ViewStub viewStub = this.ar;
                ComposeView composeView = null;
                if (viewStub == null) {
                    fdbq.c("zeroStateViewStub");
                    viewStub = null;
                }
                View viewInflate = viewStub.inflate();
                viewInflate.getClass();
                ComposeView composeView2 = (ComposeView) viewInflate;
                this.as = composeView2;
                if (composeView2 == null) {
                    fdbq.c("zeroStateView");
                    composeView2 = null;
                }
                composeView2.a(dnxi.b);
                fdap fdapVar = eebq.a;
                ComposeView composeView3 = this.as;
                if (composeView3 == null) {
                    fdbq.c("zeroStateView");
                } else {
                    composeView = composeView3;
                }
                fdapVar.invoke(composeView);
            }
            ComposeView composeView4 = this.as;
            if (composeView4 != null) {
                composeView4.setVisibility(true != z ? 8 : 0);
            }
        }
    }

    @Override // defpackage.dpvx
    public final dpvw s() {
        RecyclerView recyclerView;
        View view = this.Q;
        if (view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.emotify_gallery_recycler_view)) == null) {
            return null;
        }
        return new dnxv(this, dpvu.a(recyclerView));
    }

    @Override // defpackage.dpxo
    public final dpxe t() {
        return this.av;
    }
}
