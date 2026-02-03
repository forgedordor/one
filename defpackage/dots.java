package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dots implements dpvx {
    static final /* synthetic */ fdeh[] a;
    public static final /* synthetic */ int k = 0;
    public final Map b;
    public final dotc c;
    public final dotu d;
    public final ea e;
    public final fdap f;
    public final boolean g;
    public final dngn h;
    public dpux i;
    public final int j;
    private final dpxr l;
    private final Map m;
    private final List n;
    private final fctc o;
    private final fctc p;
    private final View.OnLayoutChangeListener q;
    private final fdcz r;
    private final fdcz s;
    private dpxe t;
    private Bundle u;
    private dpuq v;

    static {
        fdbv fdbvVar = new fdbv(dots.class, "activeScreen", "getActiveScreen()Lcom/google/android/libraries/compose/ui/screen/HugoScreen;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar, new fdbv(dots.class, "draftController", "getDraftController()Lkotlin/jvm/functions/Function0;", 0)};
    }

    public dots(Map map, Optional optional, dotc dotcVar, dotu dotuVar, List list, ea eaVar, dpxr dpxrVar, fdap fdapVar, Map map2) {
        this.b = map;
        this.c = dotcVar;
        this.d = dotuVar;
        this.e = eaVar;
        this.l = dpxrVar;
        this.f = fdapVar;
        this.m = map2;
        ArrayList<dpxe> arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.b.containsKey((dpxe) obj)) {
                arrayList.add(obj);
            }
        }
        this.n = arrayList;
        int size = arrayList.size();
        this.j = size != 0 ? size != 1 ? 3 : 2 : 1;
        this.g = ((Boolean) fdct.a(optional, false)).booleanValue();
        this.o = fctd.a(new fdae() { // from class: doti
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.c.d;
            }
        });
        this.p = fctd.a(new fdae() { // from class: dotj
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.c.h;
            }
        });
        this.q = new View.OnLayoutChangeListener() { // from class: dotk
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i4 == i8 && i2 == i6) {
                    return;
                }
                dots dotsVar = this.a;
                ViewGroup.LayoutParams layoutParams = dotsVar.b().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i9 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                int i10 = i4 - i2;
                ViewGroup.LayoutParams layoutParams2 = dotsVar.b().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                dots.i(dotsVar, i10 + i9 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0), null, 6);
            }
        };
        this.h = new dngn(new fdae() { // from class: dotl
            @Override // defpackage.fdae
            public final Object invoke() {
                dpxo dpxoVarC = this.a.c();
                if (dpxoVarC != null) {
                    return dpxoVarC.gw();
                }
                return null;
            }
        }, new fdap() { // from class: dotm
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                dpvw dpvwVar = (dpvw) obj2;
                if (dpvwVar == null) {
                    return null;
                }
                dots dotsVar = this.a;
                dotr dotrVar = new dotr(dpvwVar, dotsVar);
                dotrVar.c().a(dotsVar.d.b.f);
                if (!dotsVar.g) {
                    return dotrVar;
                }
                dotrVar.c().a(new dotn(dotrVar, dotsVar));
                return dotrVar;
            }
        });
        this.r = new dotp(this);
        this.s = new dotq(this);
        dpxo dpxoVarC = c();
        if (dpxoVarC != null) {
            f(dpxoVarC);
        }
        douf doufVar = this.d.a;
        doto dotoVar = new doto(this);
        doufVar.e = arrayList;
        if (arrayList.size() <= 1) {
            doufVar.d.j.setVisibility(8);
            doufVar.d.d.setBackground(null);
        } else {
            dotc dotcVar2 = doufVar.d;
            dotcVar2.d.setBackground(dotcVar2.a.getContext().getDrawable(R.drawable.compose_screen_top_bar_background));
            TabLayout tabLayout = doufVar.d.j;
            doufVar.f.d(douf.a[0], new doub(dotoVar, arrayList, doufVar));
            for (dpxe dpxeVar : arrayList) {
                eeve eeveVarE = tabLayout.e();
                eeveVarE.h(dpxeVar.k);
                if (!((Boolean) fdct.a(doufVar.c, false)).booleanValue()) {
                    fdil.d(doufVar.b, null, null, new doud(eeveVarE, doufVar, null), 3);
                }
                tabLayout.g(eeveVarE);
            }
        }
        if (this.j == 2) {
            if (this.n.size() == 1) {
                g(d((dpxe) fcva.N(this.n), a()));
                return;
            }
            throw new IllegalStateException("Cannot set up single layout with " + this.n.size() + " screen(s)");
        }
    }

    public static /* synthetic */ void i(dots dotsVar, int i, dpxo dpxoVar, int i2) {
        if ((i2 & 1) != 0) {
            int height = dotsVar.b().getHeight();
            ViewGroup.LayoutParams layoutParams = dotsVar.b().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i3 = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams2 = dotsVar.b().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i = i3 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        }
        int translationY = (i2 & 2) != 0 ? (int) dotsVar.b().getTranslationY() : 0;
        if ((i2 & 4) != 0) {
            dpxoVar = null;
        }
        if (dpxoVar == null) {
            dpxoVar = dotsVar.c();
        }
        if (dpxoVar != null) {
            int i4 = i + translationY;
            dpvw dpvwVarGw = dpxoVar.gw();
            if (dpvwVarGw == null) {
                dpxoVar.aY = i4;
            } else {
                dpxo.bQ(dpvwVarGw, i4);
            }
        }
    }

    private final EditText j() {
        return (EditText) this.p.a();
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Editable text = j().getText();
        text.getClass();
        if (text.length() > 0) {
            bundle.putString("search", text.toString());
        }
        return bundle;
    }

    public final ConstraintLayout b() {
        return (ConstraintLayout) this.o.a();
    }

    public final dpxo c() {
        return (dpxo) this.r.c(a[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [dpil] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dpxo d(defpackage.dpxe r7, android.os.Bundle r8) {
        /*
            r6 = this;
            dpux r0 = r6.i
            r1 = 0
            if (r0 == 0) goto L73
            java.util.Map r0 = r6.b
            java.lang.Object r0 = r0.get(r7)
            dpxj r0 = (defpackage.dpxj) r0
            if (r0 == 0) goto L60
            ea r2 = r6.e
            fr r2 = r2.I()
            r2.getClass()
            dpux r3 = r6.i
            if (r3 != 0) goto L22
            java.lang.String r3 = "renderingStrategy"
            defpackage.fdbq.c(r3)
            r3 = r1
        L22:
            dpuq r4 = r6.v
            if (r4 != 0) goto L2c
            java.lang.String r4 = "renderingStateHandler"
            defpackage.fdbq.c(r4)
            r4 = r1
        L2c:
            r3.getClass()
            r4.getClass()
            dpxo r5 = r0.c(r2)
            if (r5 == 0) goto L3c
            r5.at(r8)
            r1 = r5
        L3c:
            if (r1 == 0) goto L47
            dpxh r8 = new dpxh
            r8.<init>()
            defpackage.dpuy.b(r3, r2, r8)
            goto L57
        L47:
            dpil r8 = r0.b(r8)
            dpxi r1 = new dpxi
            r5 = r8
            dpxo r5 = (defpackage.dpxo) r5
            r1.<init>()
            defpackage.dpuy.b(r3, r2, r1)
            r1 = r8
        L57:
            r8 = r1
            dpxo r8 = (defpackage.dpxo) r8
            r8.gz(r3, r4)
            if (r1 == 0) goto L60
            goto L77
        L60:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.util.Objects.toString(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "Cannot find a factory for screen category "
            java.lang.String r7 = r0.concat(r7)
            r8.<init>(r7)
            throw r8
        L73:
            r6.t = r7
            r6.u = r8
        L77:
            dpxo r1 = (defpackage.dpxo) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dots.d(dpxe, android.os.Bundle):dpxo");
    }

    public final void e(fdae fdaeVar) {
        fdaeVar.getClass();
        this.s.d(a[1], fdaeVar);
    }

    public final void f(dpxo dpxoVar) {
        dpxz dpxzVarD;
        Object obj = this.m.get(dpxoVar.t());
        Editable editable = null;
        dpxoVar.bI(obj instanceof dpxp ? (dpxp) obj : null);
        i(this, 0, dpxoVar, 3);
        b().addOnLayoutChangeListener(this.q);
        fdae fdaeVar = (fdae) this.s.c(a[1]);
        if (fdaeVar != null) {
            dpxoVar.gA(fdaeVar);
        }
        dpux dpuxVar = this.i;
        if (dpuxVar == null) {
            fdbq.c("renderingStrategy");
            dpuxVar = null;
        }
        dpuq dpuqVar = this.v;
        if (dpuqVar == null) {
            fdbq.c("renderingStateHandler");
            dpuqVar = null;
        }
        dpxoVar.gz(dpuxVar, dpuqVar);
        if (dpxoVar instanceof dpxs) {
            dpxs dpxsVar = (dpxs) dpxoVar;
            dpxsVar.ba = this.l;
            Editable text = j().getText();
            if (true == fdgn.H(text)) {
                text = null;
            }
            if (text != null) {
                dpyb dpybVarAV = dpxsVar.aV();
                if (dpybVarAV != null && (dpxzVarD = dpybVarAV.d()) != null) {
                    dpxzVarD.c(text.toString());
                }
                editable = text;
            }
            if (editable == null) {
                dpxsVar.gy();
            }
        }
        dpxoVar.bg();
    }

    public final void g(dpxo dpxoVar) {
        this.r.d(a[0], dpxoVar);
    }

    public final void h(dpux dpuxVar, dpuq dpuqVar) {
        dpuxVar.getClass();
        dpuqVar.getClass();
        this.i = dpuxVar;
        this.v = dpuqVar;
        dpxe dpxeVar = this.t;
        dpuq dpuqVar2 = null;
        if (dpxeVar != null) {
            Bundle bundle = this.u;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            bundle.getClass();
            g(d(dpxeVar, bundle));
            this.t = null;
            this.u = null;
            return;
        }
        dpxo dpxoVarC = c();
        if (dpxoVarC != null) {
            dpux dpuxVar2 = this.i;
            if (dpuxVar2 == null) {
                fdbq.c("renderingStrategy");
                dpuxVar2 = null;
            }
            dpuq dpuqVar3 = this.v;
            if (dpuqVar3 == null) {
                fdbq.c("renderingStateHandler");
            } else {
                dpuqVar2 = dpuqVar3;
            }
            dpxoVarC.gz(dpuxVar2, dpuqVar2);
        }
    }

    @Override // defpackage.dpvx
    public final dpvw s() {
        throw null;
    }
}
