package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dota extends dosj {
    static final /* synthetic */ fdeh[] a;
    public static final /* synthetic */ int am = 0;
    private static final ekrg an;
    public fduf ag;
    public dotv ah;
    public dott ai;
    public dovs aj;
    public Optional ak;
    public Optional al;
    private final dpxe ao;
    private final fdcz ap;
    private final fctc aq;
    public dotc b;
    public dotu c;
    public dovr d;
    public dots e;

    static {
        fdbv fdbvVar = new fdbv(dota.class, "scrollableInterface", "getScrollableInterface()Lcom/google/android/libraries/compose/ui/rendering/container/ScrollableInterface;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
        an = ekrg.c("com/google/android/libraries/compose/proxy/ui/ProxyScreen");
    }

    public dota() {
        super(Integer.valueOf(R.layout.proxy_screen_layout), new dote(false, false, false, false, 0.0f, false, 2047));
        this.ao = dpxe.d;
        this.ap = new dosz(this);
        this.aq = fctd.a(new fdae() { // from class: dosk
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional = this.a.ak;
                if (optional == null) {
                    fdbq.c("emotifyButtonControllerOptional");
                    optional = null;
                }
                final fdap fdapVar = new fdap() { // from class: dosp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dpcl dpclVar = (dpcl) obj;
                        int i = dota.am;
                        dpclVar.getClass();
                        return Boolean.valueOf(dpclVar.e());
                    }
                };
                Optional optionalFilter = optional.filter(new Predicate() { // from class: dosq
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int i = dota.am;
                        return ((Boolean) fdapVar.invoke(obj)).booleanValue();
                    }
                });
                optionalFilter.getClass();
                return (dpcl) fdct.b(optionalFilter);
            }
        });
    }

    private static final void bh(View view) {
        Drawable foreground = view.getForeground();
        RippleDrawable rippleDrawable = foreground instanceof RippleDrawable ? (RippleDrawable) foreground : null;
        if (rippleDrawable != null) {
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new dosx(view, rippleDrawable, view));
            } else {
                rippleDrawable.setHotspotBounds(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom());
            }
        }
    }

    public static final /* synthetic */ dote e(dota dotaVar) {
        return (dote) dotaVar.bC();
    }

    @Override // defpackage.dpil, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int paddingTop;
        layoutInflater.getClass();
        View viewM = super.M(layoutInflater, viewGroup, bundle);
        dotc dotcVar = new dotc(viewM, bJ());
        this.b = dotcVar;
        ConstraintLayout constraintLayout = dotcVar.d;
        int paddingLeft = constraintLayout.getPaddingLeft();
        Integer num = ((dote) bC()).c;
        if (num != null) {
            paddingTop = constraintLayout.getContext().getResources().getDimensionPixelSize(num.intValue());
        } else {
            paddingTop = constraintLayout.getPaddingTop();
        }
        constraintLayout.setPadding(paddingLeft, paddingTop, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer num2 = ((dote) bC()).d;
        if (num2 != null) {
            marginLayoutParams.bottomMargin = constraintLayout.getContext().getResources().getDimensionPixelSize(num2.intValue());
        }
        constraintLayout.setLayoutParams(marginLayoutParams);
        dotc dotcVar2 = null;
        if (!bJ()) {
            dotc dotcVar3 = this.b;
            if (dotcVar3 == null) {
                fdbq.c("views");
                dotcVar3 = null;
            }
            dotc dotcVar4 = this.b;
            if (dotcVar4 == null) {
                fdbq.c("views");
                dotcVar4 = null;
            }
            dotc dotcVar5 = this.b;
            if (dotcVar5 == null) {
                fdbq.c("views");
                dotcVar5 = null;
            }
            ConstraintLayout constraintLayout2 = dotcVar4.d;
            RecyclerView recyclerView = dotcVar3.n;
            ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
            layoutParams2.getClass();
            ViewGroup viewGroup2 = dotcVar5.g;
            viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(new dosy(viewGroup2, recyclerView, (ViewGroup.MarginLayoutParams) layoutParams2));
        }
        dotc dotcVar6 = this.b;
        if (dotcVar6 == null) {
            fdbq.c("views");
            dotcVar6 = null;
        }
        bh(dotcVar6.e);
        dotc dotcVar7 = this.b;
        if (dotcVar7 == null) {
            fdbq.c("views");
        } else {
            dotcVar2 = dotcVar7;
        }
        bh(dotcVar2.f);
        return viewM;
    }

    public final void aW(dpvw dpvwVar) {
        this.ap.d(a[0], dpvwVar);
    }

    @Override // defpackage.dpxo
    protected final void aZ(dpgl dpglVar) {
        ((ekrd) an.e().h("com/google/android/libraries/compose/proxy/ui/ProxyScreen", "applyHugoColors", 145, "ProxyScreen.kt")).t("Applying HugoColors: %s", dpglVar);
        dots dotsVar = this.e;
        dotu dotuVar = null;
        if (dotsVar == null) {
            fdbq.c("screensController");
            dotsVar = null;
        }
        dpxo dpxoVarC = dotsVar.c();
        if (dpxoVarC != null) {
            dpxoVarC.bO(dpglVar);
        }
        gda gdaVar = dpglVar.a;
        long j = gdaVar.s;
        int iB = ijg.b(j);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(ijg.b(j));
        colorStateListValueOf.getClass();
        dotc dotcVar = this.b;
        if (dotcVar == null) {
            fdbq.c("views");
            dotcVar = null;
        }
        dotcVar.d.setBackgroundColor(dpglVar.d);
        dotcVar.e.setImageTintList(colorStateListValueOf);
        dotcVar.f.setImageTintList(colorStateListValueOf);
        EditText editText = dotcVar.h;
        editText.getBackground().setColorFilter(new PorterDuffColorFilter(dpglVar.k, PorterDuff.Mode.SRC_ATOP));
        editText.setTextColor(iB);
        editText.setHintTextColor(iB);
        boolean z = dotcVar.b;
        if (!z) {
            dotcVar.j.t(dpglVar.i);
        }
        dotcVar.j.q(dpglVar.h);
        if (z) {
            dotu dotuVar2 = this.c;
            if (dotuVar2 == null) {
                fdbq.c("headerController");
            } else {
                dotuVar = dotuVar2;
            }
            doua douaVar = new doua(dpglVar.f, dpglVar.e, dpglVar.i);
            douf doufVar = dotuVar.a;
            doufVar.g = douaVar;
            doufVar.d(doufVar.d.j);
        }
        View view = dotcVar.k;
        if (view != null) {
            view.setVisibility(0);
        }
        if (view != null) {
            view.setBackgroundColor(ijg.b(gdaVar.r));
        }
        View view2 = dotcVar.l;
        if (view2 != null) {
            view2.setBackgroundColor(ijg.b(gdaVar.H));
        }
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        dovr dovrVar = this.d;
        if (dovrVar != null) {
            dovrVar.h.m.setOnHierarchyChangeListener(null);
            dovrVar.q();
            dovrVar.m = false;
        }
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        dotu dotuVar;
        dotc dotcVar;
        dotb dotbVar;
        dotc dotcVar2;
        dotu dotuVar2;
        dovr dovrVar;
        view.getClass();
        dotv dotvVar = this.ah;
        dots dotsVar = null;
        if (dotvVar == null) {
            fdbq.c("headerControllerFactory");
            dotvVar = null;
        }
        dote doteVar = (dote) bC();
        dotc dotcVar3 = this.b;
        if (dotcVar3 == null) {
            fdbq.c("views");
            dotcVar3 = null;
        }
        fdae fdaeVar = new fdae() { // from class: dosm
            @Override // defpackage.fdae
            public final Object invoke() {
                dots dotsVar2 = this.a.e;
                if (dotsVar2 != null) {
                    dots.i(dotsVar2, 0, null, 7);
                }
                return fctx.a;
            }
        };
        doun dounVar = (doun) dotvVar.a.b();
        doug dougVar = (doug) dotvVar.b.b();
        doteVar.getClass();
        dotcVar3.getClass();
        this.c = new dotu(dounVar, dougVar, dotcVar3, fdaeVar);
        dovs dovsVar = this.aj;
        if (dovsVar == null) {
            fdbq.c("searchControllerFactory");
            dovsVar = null;
        }
        dotu dotuVar3 = this.c;
        if (dotuVar3 == null) {
            fdbq.c("headerController");
            dotuVar = null;
        } else {
            dotuVar = dotuVar3;
        }
        fdbt fdbtVar = new fdbt(this) { // from class: dosr
            @Override // defpackage.fdbt, defpackage.fdee
            public final Object a() {
                dota dotaVar = (dota) this.g;
                int i = dota.am;
                return dotaVar.bP();
            }
        };
        dotc dotcVar4 = this.b;
        if (dotcVar4 == null) {
            fdbq.c("views");
            dotcVar = null;
        } else {
            dotcVar = dotcVar4;
        }
        boolean z = ((dote) bC()).h;
        boolean z2 = ((dote) bC()).i;
        Activity activity = (Activity) dovsVar.a.b();
        activity.getClass();
        fdjx fdjxVar = (fdjx) dovsVar.b.b();
        fdjxVar.getClass();
        fdjx fdjxVar2 = (fdjx) dovsVar.c.b();
        fdjxVar2.getClass();
        fdjx fdjxVar3 = (fdjx) dovsVar.d.b();
        fdjxVar3.getClass();
        dpir dpirVar = (dpir) dovsVar.e.b();
        dpirVar.getClass();
        Optional optional = (Optional) dovsVar.f.b();
        dowi dowiVar = (dowi) dovsVar.g.b();
        Optional optional2 = (Optional) dovsVar.h.b();
        dotuVar.getClass();
        dotcVar.getClass();
        dovr dovrVar2 = new dovr(activity, fdjxVar, fdjxVar2, fdjxVar3, dpirVar, optional, dowiVar, optional2, dotuVar, fdbtVar, dotcVar, z, z2);
        this.d = dovrVar2;
        dovrVar2.j(dovrVar2.c());
        dovrVar2.h.m.setOnHierarchyChangeListener(dovrVar2.k);
        dovrVar2.m = true;
        if (!((dote) bC()).h) {
            dovr dovrVar3 = this.d;
            if (dovrVar3 == null) {
                fdbq.c("searchController");
                dovrVar3 = null;
            }
            dovrVar3.e();
        }
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("categories");
            if (stringArrayList != null) {
                dpxe[] dpxeVarArrValues = dpxe.values();
                ArrayList arrayList = new ArrayList(fcva.p(stringArrayList, 10));
                Iterator<T> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(dpxe.a((String) it.next()));
                }
                Integer numValueOf = Integer.valueOf(bundle2.getInt("initial_screen", -1));
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                dotbVar = new dotb(arrayList, numValueOf != null ? dpxeVarArrValues[numValueOf.intValue()] : null, bundle2.getString("initial_search_term"));
            } else {
                dotbVar = null;
            }
            if (dotbVar != null) {
                Optional optional3 = this.al;
                if (optional3 == null) {
                    fdbq.c("emotifyController");
                    optional3 = null;
                }
                final List list = dotbVar.a;
                final fdap fdapVar = new fdap() { // from class: dosn
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dnuy dnuyVar = (dnuy) obj;
                        dnuyVar.getClass();
                        dota dotaVar = this.a;
                        fdil.d(lvk.a(dotaVar.Q()), null, null, new dosv(dnuyVar, dotaVar, list, null), 3);
                        return fctx.a;
                    }
                };
                optional3.ifPresent(new Consumer() { // from class: doso
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        int i = dota.am;
                        fdapVar.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                dott dottVar = this.ai;
                if (dottVar == null) {
                    fdbq.c("screensControllerFactory");
                    dottVar = null;
                }
                dotc dotcVar5 = this.b;
                if (dotcVar5 == null) {
                    fdbq.c("views");
                    dotcVar2 = null;
                } else {
                    dotcVar2 = dotcVar5;
                }
                dotu dotuVar4 = this.c;
                if (dotuVar4 == null) {
                    fdbq.c("headerController");
                    dotuVar2 = null;
                } else {
                    dotuVar2 = dotuVar4;
                }
                dovr dovrVar4 = this.d;
                if (dovrVar4 == null) {
                    fdbq.c("searchController");
                    dovrVar = null;
                } else {
                    dovrVar = dovrVar4;
                }
                dosw doswVar = new dosw(this);
                Map map = ((dote) bC()).a;
                Map map2 = (Map) dottVar.a.b();
                Optional optional4 = (Optional) dottVar.b.b();
                dotcVar2.getClass();
                dotuVar2.getClass();
                dovrVar.getClass();
                this.e = new dots(map2, optional4, dotcVar2, dotuVar2, list, this, dovrVar, doswVar, map);
                bS();
                dpxe dpxeVar = dotbVar.b;
                if (dpxeVar != null) {
                    r(dpxeVar);
                }
                String str = dotbVar.c;
                if (str != null) {
                    dovr dovrVar5 = this.d;
                    if (dovrVar5 == null) {
                        fdbq.c("searchController");
                        dovrVar5 = null;
                    }
                    dovrVar5.m(str);
                }
                dots dotsVar2 = this.e;
                if (dotsVar2 == null) {
                    fdbq.c("screensController");
                    dotsVar2 = null;
                }
                dotsVar2.e(bG());
                dots dotsVar3 = this.e;
                if (dotsVar3 == null) {
                    fdbq.c("screensController");
                } else {
                    dotsVar = dotsVar3;
                }
                dotsVar.h(bM(), bP());
                bL();
                return;
            }
        }
        throw new IllegalStateException("ProxyScreen must be created with category arguments.");
    }

    @Override // defpackage.dpxo
    public final void bf() {
        dpxo dpxoVarC;
        dots dotsVar = this.e;
        if (dotsVar == null || (dpxoVarC = dotsVar.c()) == null) {
            return;
        }
        dpxoVarC.bf();
    }

    @Override // defpackage.dpxo
    public final void bg() {
        dpxo dpxoVarC;
        dots dotsVar = this.e;
        if (dotsVar != null && (dpxoVarC = dotsVar.c()) != null) {
            dpxoVarC.bg();
        }
        dpcl dpclVarF = f();
        if (dpclVarF != null) {
            dpclVarF.d();
        }
    }

    public final dpcl f() {
        return (dpcl) this.aq.a();
    }

    @Override // defpackage.dpil
    public final void gA(fdae fdaeVar) {
        this.aU = fdaeVar;
        dots dotsVar = this.e;
        if (dotsVar != null) {
            dotsVar.e(fdaeVar);
        }
    }

    @Override // defpackage.dpil
    public final boolean gD() {
        dpxo dpxoVarC;
        dots dotsVar = this.e;
        if (dotsVar != null && (dpxoVarC = dotsVar.c()) != null && dpxoVarC.gD()) {
            return true;
        }
        dovr dovrVar = this.d;
        if (dovrVar == null) {
            return false;
        }
        if ((dovrVar.j && !dovrVar.n) || dovrVar.a() != dovh.b) {
            return false;
        }
        dovrVar.g();
        return true;
    }

    @Override // defpackage.dpil
    public final View gE(int i, ViewGroup viewGroup) {
        return K().inflate(true != bJ() ? R.layout.proxy_screen_layout : R.layout.proxy_screen_layout_coolranch, viewGroup, false);
    }

    @Override // defpackage.dpxo
    public final dpvw gw() {
        dots dotsVar = this.e;
        if (dotsVar == null) {
            return null;
        }
        aW((dpvw) dotsVar.h.a());
        return (dpvw) this.ap.c(a[0]);
    }

    @Override // defpackage.dpxo
    public final void gx(dpuv dpuvVar) {
        dpxo dpxoVarC;
        dpuvVar.getClass();
        dots dotsVar = this.e;
        if (dotsVar == null || (dpxoVarC = dotsVar.c()) == null) {
            return;
        }
        dpxoVarC.gx(dpuvVar);
    }

    @Override // defpackage.dpxo
    public final void gy() {
        dpxo dpxoVarC;
        dovr dovrVar = this.d;
        if (dovrVar != null) {
            dovrVar.f(true);
        }
        dots dotsVar = this.e;
        if (dotsVar != null && (dpxoVarC = dotsVar.c()) != null) {
            dpxoVarC.gy();
        }
        aW(null);
    }

    @Override // defpackage.dpxo
    public final void gz(dpux dpuxVar, dpuq dpuqVar) {
        dpuxVar.getClass();
        dpuqVar.getClass();
        super.gz(dpuxVar, dpuqVar);
        dots dotsVar = this.e;
        if (dotsVar != null) {
            dotsVar.h(dpuxVar, dpuqVar);
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        dots dotsVar = this.e;
        if (dotsVar == null) {
            fdbq.c("screensController");
            dotsVar = null;
        }
        dpxo dpxoVarC = dotsVar.c();
        if (dpxoVarC != null) {
            bundle.putSerializable("ACTIVE_SCREEN_CATEGORY", dpxoVarC.t());
        }
    }

    @Override // defpackage.ea
    public final void n(Bundle bundle) {
        Serializable serializable;
        super.n(bundle);
        if (bundle == null || (serializable = bundle.getSerializable("ACTIVE_SCREEN_CATEGORY")) == null) {
            return;
        }
        dotu dotuVar = this.c;
        dotu dotuVar2 = null;
        if (dotuVar == null) {
            fdbq.c("headerController");
            dotuVar = null;
        }
        if (dotuVar.a.e()) {
            dots dotsVar = this.e;
            if (dotsVar == null) {
                fdbq.c("screensController");
                dotsVar = null;
            }
            for (dpxj dpxjVar : dotsVar.b.values()) {
                fr frVarI = dotsVar.e.I();
                frVarI.getClass();
                dpux dpuxVar = dotsVar.i;
                if (dpuxVar == null) {
                    fdbq.c("renderingStrategy");
                    dpuxVar = null;
                }
                dpuxVar.getClass();
                final dpxo dpxoVarC = dpxjVar.c(frVarI);
                if (dpxoVarC != null) {
                    dpuy.a(dpuxVar, frVarI, true, new fdap() { // from class: dpxg
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            gg ggVar = (gg) obj;
                            ggVar.getClass();
                            ggVar.l(dpxoVarC);
                            return fctx.a;
                        }
                    });
                }
            }
            dotsVar.g(null);
            dotu dotuVar3 = this.c;
            if (dotuVar3 == null) {
                fdbq.c("headerController");
            } else {
                dotuVar2 = dotuVar3;
            }
            dotuVar2.a.c((dpxe) serializable);
        }
    }

    public final void r(dpxe dpxeVar) {
        dotu dotuVar = this.c;
        if (dotuVar == null) {
            fdbq.c("headerController");
            dotuVar = null;
        }
        douf doufVar = dotuVar.a;
        douf doufVar2 = true == doufVar.e() ? doufVar : null;
        if (doufVar2 != null) {
            doufVar2.c(dpxeVar);
        }
    }

    @Override // defpackage.dpvx
    public final dpvw s() {
        return null;
    }

    @Override // defpackage.dpxo
    public final dpxe t() {
        return this.ao;
    }
}
