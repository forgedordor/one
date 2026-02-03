package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MenuInflater;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eeoc extends FrameLayout {
    public final eenq a;
    public final eenu b;
    public final eenx c;
    public onm d;
    private MenuInflater e;

    public eeoc(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(eexh.a(context, attributeSet, i, i2), attributeSet, i);
        eenx eenxVar = new eenx();
        this.c = eenxVar;
        Context context2 = getContext();
        yx yxVarB = eemh.b(context2, attributeSet, eeod.b, i, i2, 17, 15);
        eenq eenqVar = new eenq(context2, getClass());
        this.a = eenqVar;
        eenu eenuVarA = a(context2);
        this.b = eenuVarA;
        eenuVarA.setMinimumHeight(getSuggestedMinimumHeight());
        eenuVarA.K = 6;
        eenxVar.a = eenuVarA;
        eenxVar.c = 1;
        eenuVarA.F = eenxVar;
        eenqVar.g(eenxVar);
        eenxVar.c(getContext(), eenqVar);
        if (yxVarB.q(11)) {
            eenuVarA.g(yxVarB.g(11));
        } else {
            eenuVarA.g(eenuVarA.i());
        }
        int iB = yxVarB.b(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size));
        eenuVarA.h = iB;
        eens[] eensVarArr = eenuVarA.e;
        if (eensVarArr != null) {
            for (eens eensVar : eensVarArr) {
                if (eensVar instanceof eenp) {
                    ((eenp) eensVar).u(iB);
                }
            }
        }
        if (yxVarB.q(17)) {
            int iF = yxVarB.f(17, 0);
            eenu eenuVar = this.b;
            eenuVar.j = iF;
            eens[] eensVarArr2 = eenuVar.e;
            if (eensVarArr2 != null) {
                for (eens eensVar2 : eensVarArr2) {
                    if (eensVar2 instanceof eenp) {
                        ((eenp) eensVar2).J(iF);
                    }
                }
            }
        }
        if (yxVarB.q(15)) {
            int iF2 = yxVarB.f(15, 0);
            eenu eenuVar2 = this.b;
            eenuVar2.k = iF2;
            eens[] eensVarArr3 = eenuVar2.e;
            if (eensVarArr3 != null) {
                for (eens eensVar3 : eensVarArr3) {
                    if (eensVar3 instanceof eenp) {
                        ((eenp) eensVar3).H(iF2);
                    }
                }
            }
        }
        if (yxVarB.q(4)) {
            int iF3 = yxVarB.f(4, 0);
            eenu eenuVar3 = this.b;
            eenuVar3.l = iF3;
            eens[] eensVarArr4 = eenuVar3.e;
            if (eensVarArr4 != null) {
                for (eens eensVar4 : eensVarArr4) {
                    if (eensVar4 instanceof eenp) {
                        ((eenp) eensVar4).s(iF3);
                    }
                }
            }
        }
        if (yxVarB.q(3)) {
            int iF4 = yxVarB.f(3, 0);
            eenu eenuVar4 = this.b;
            eenuVar4.m = iF4;
            eens[] eensVarArr5 = eenuVar4.e;
            if (eensVarArr5 != null) {
                for (eens eensVar5 : eensVarArr5) {
                    if (eensVar5 instanceof eenp) {
                        ((eenp) eensVar5).r(iF4);
                    }
                }
            }
        }
        boolean zP = yxVarB.p(16, true);
        eenu eenuVar5 = this.b;
        eenuVar5.n = zP;
        eens[] eensVarArr6 = eenuVar5.e;
        if (eensVarArr6 != null) {
            for (eens eensVar6 : eensVarArr6) {
                if (eensVar6 instanceof eenp) {
                    ((eenp) eensVar6).I(zP);
                }
            }
        }
        if (yxVarB.q(18)) {
            ColorStateList colorStateListG = yxVarB.g(18);
            eenu eenuVar6 = this.b;
            eenuVar6.i = colorStateListG;
            eens[] eensVarArr7 = eenuVar6.e;
            if (eensVarArr7 != null) {
                for (eens eensVar7 : eensVarArr7) {
                    if (eensVar7 instanceof eenp) {
                        ((eenp) eensVar7).K(colorStateListG);
                    }
                }
            }
        }
        Drawable background = getBackground();
        ColorStateList colorStateListA = eejo.a(background);
        if (background == null || colorStateListA != null) {
            eesc eescVar = new eesc(new eesj(eesj.h(context2, attributeSet, i, i2)));
            if (colorStateListA != null) {
                eescVar.P(colorStateListA);
            }
            eescVar.L(context2);
            setBackground(eescVar);
        }
        if (yxVarB.q(13)) {
            int iB2 = yxVarB.b(13, 0);
            eenu eenuVar7 = this.b;
            eenuVar7.r = iB2;
            eens[] eensVarArr8 = eenuVar7.e;
            if (eensVarArr8 != null) {
                for (eens eensVar8 : eensVarArr8) {
                    if (eensVar8 instanceof eenp) {
                        ((eenp) eensVar8).A(iB2);
                    }
                }
            }
        }
        if (yxVarB.q(12)) {
            int iB3 = yxVarB.b(12, 0);
            eenu eenuVar8 = this.b;
            eenuVar8.s = iB3;
            eens[] eensVarArr9 = eenuVar8.e;
            if (eensVarArr9 != null) {
                for (eens eensVar9 : eensVarArr9) {
                    if (eensVar9 instanceof eenp) {
                        ((eenp) eensVar9).z(eenuVar8.s);
                    }
                }
            }
        }
        if (yxVarB.q(0)) {
            int iB4 = yxVarB.b(0, 0);
            eenu eenuVar9 = this.b;
            eenuVar9.t = iB4;
            eens[] eensVarArr10 = eenuVar9.e;
            if (eensVarArr10 != null) {
                for (eens eensVar10 : eensVarArr10) {
                    if (eensVar10 instanceof eenp) {
                        ((eenp) eensVar10).l(iB4);
                    }
                }
            }
        }
        if (yxVarB.q(5)) {
            int iB5 = yxVarB.b(5, 0);
            eenu eenuVar10 = this.b;
            eenuVar10.u = iB5;
            eens[] eensVarArr11 = eenuVar10.e;
            if (eensVarArr11 != null) {
                for (eens eensVar11 : eensVarArr11) {
                    if (eensVar11 instanceof eenp) {
                        ((eenp) eensVar11).t(iB5);
                    }
                }
            }
        }
        if (yxVarB.q(2)) {
            setElevation(yxVarB.b(2, 0));
        }
        getBackground().mutate().setTintList(eepy.d(context2, yxVarB, 1));
        int iD = yxVarB.d(21, -1);
        eenu eenuVar11 = this.b;
        if (eenuVar11.c != iD) {
            eenuVar11.c = iD;
            this.c.f(false);
        }
        int iD2 = yxVarB.d(9, 0);
        eenu eenuVar12 = this.b;
        if (eenuVar12.d != iD2) {
            eenuVar12.d = iD2;
            eens[] eensVarArr12 = eenuVar12.e;
            if (eensVarArr12 != null) {
                for (eens eensVar12 : eensVarArr12) {
                    if (eensVar12 instanceof eenp) {
                        ((eenp) eensVar12).y(iD2);
                    }
                }
            }
            this.c.f(false);
        }
        int iD3 = yxVarB.d(8, 49);
        eenu eenuVar13 = this.b;
        if (eenuVar13.C != iD3) {
            eenuVar13.C = iD3;
            eens[] eensVarArr13 = eenuVar13.e;
            if (eensVarArr13 != null) {
                for (eens eensVar13 : eensVarArr13) {
                    if (eensVar13 instanceof eenp) {
                        ((eenp) eensVar13).x(iD3);
                    }
                }
            }
            this.c.f(false);
        }
        int iF5 = yxVarB.f(7, 0);
        if (iF5 != 0) {
            eenu eenuVar14 = this.b;
            eenuVar14.p = iF5;
            eens[] eensVarArr14 = eenuVar14.e;
            if (eensVarArr14 != null) {
                for (eens eensVar14 : eensVarArr14) {
                    if (eensVar14 instanceof eenp) {
                        ((eenp) eensVar14).w(iF5);
                    }
                }
            }
        } else {
            ColorStateList colorStateListD = eepy.d(context2, yxVarB, 14);
            eenu eenuVar15 = this.b;
            eenuVar15.o = colorStateListD;
            eens[] eensVarArr15 = eenuVar15.e;
            if (eensVarArr15 != null) {
                for (eens eensVar15 : eensVarArr15) {
                    if (eensVar15 instanceof eenp) {
                        ((eenp) eensVar15).B(colorStateListD);
                    }
                }
            }
        }
        boolean zP2 = yxVarB.p(22, true);
        eenu eenuVar16 = this.b;
        eenuVar16.H = zP2;
        eens[] eensVarArr16 = eenuVar16.e;
        if (eensVarArr16 != null) {
            for (eens eensVar16 : eensVarArr16) {
                if (eensVar16 instanceof eenp) {
                    ((eenp) eensVar16).F(zP2);
                }
            }
        }
        boolean zP3 = yxVarB.p(19, false);
        eenu eenuVar17 = this.b;
        eenuVar17.I = zP3;
        eens[] eensVarArr17 = eenuVar17.e;
        if (eensVarArr17 != null) {
            for (eens eensVar17 : eensVarArr17) {
                if (eensVar17 instanceof eenp) {
                    ((eenp) eensVar17).C(zP3);
                }
            }
        }
        int iD4 = yxVarB.d(20, 1);
        eenu eenuVar18 = this.b;
        eenuVar18.J = iD4;
        eens[] eensVarArr18 = eenuVar18.e;
        if (eensVarArr18 != null) {
            for (eens eensVar18 : eensVarArr18) {
                if (eensVar18 instanceof eenp) {
                    ((eenp) eensVar18).D(iD4);
                }
            }
        }
        int iF6 = yxVarB.f(6, 0);
        if (iF6 != 0) {
            eenu eenuVar19 = this.b;
            eenuVar19.v = true;
            eens[] eensVarArr19 = eenuVar19.e;
            if (eensVarArr19 != null) {
                for (eens eensVar19 : eensVarArr19) {
                    if (eensVar19 instanceof eenp) {
                        ((eenp) eensVar19).g(true);
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iF6, eeod.a);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            eenu eenuVar20 = this.b;
            eenuVar20.w = dimensionPixelSize;
            eens[] eensVarArr20 = eenuVar20.e;
            if (eensVarArr20 != null) {
                for (eens eensVar20 : eensVarArr20) {
                    if (eensVar20 instanceof eenp) {
                        ((eenp) eensVar20).o(dimensionPixelSize);
                    }
                }
            }
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            eenu eenuVar21 = this.b;
            eenuVar21.x = dimensionPixelSize2;
            eens[] eensVarArr21 = eenuVar21.e;
            if (eensVarArr21 != null) {
                for (eens eensVar21 : eensVarArr21) {
                    if (eensVar21 instanceof eenp) {
                        ((eenp) eensVar21).k(dimensionPixelSize2);
                    }
                }
            }
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            eenu eenuVar22 = this.b;
            eenuVar22.A = dimensionPixelOffset;
            eens[] eensVarArr22 = eenuVar22.e;
            if (eensVarArr22 != null) {
                for (eens eensVar22 : eensVarArr22) {
                    if (eensVar22 instanceof eenp) {
                        ((eenp) eensVar22).m(dimensionPixelOffset);
                    }
                }
            }
            String string = typedArrayObtainStyledAttributes.getString(9);
            int dimensionPixelSize3 = -2;
            if (string != null) {
                if ("-1".equals(string)) {
                    dimensionPixelSize3 = -1;
                } else if (!"-2".equals(string)) {
                    dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            eenu eenuVar23 = this.b;
            eenuVar23.y = dimensionPixelSize3;
            eens[] eensVarArr23 = eenuVar23.e;
            if (eensVarArr23 != null) {
                for (eens eensVar23 : eensVarArr23) {
                    if (eensVar23 instanceof eenp) {
                        ((eenp) eensVar23).j(dimensionPixelSize3);
                    }
                }
            }
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize);
            eenu eenuVar24 = this.b;
            eenuVar24.z = dimensionPixelSize4;
            eens[] eensVarArr24 = eenuVar24.e;
            if (eensVarArr24 != null) {
                for (eens eensVar24 : eensVarArr24) {
                    if (eensVar24 instanceof eenp) {
                        ((eenp) eensVar24).h(dimensionPixelSize4);
                    }
                }
            }
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset);
            eenu eenuVar25 = this.b;
            eenuVar25.B = dimensionPixelOffset2;
            eens[] eensVarArr25 = eenuVar25.e;
            if (eensVarArr25 != null) {
                for (eens eensVar25 : eensVarArr25) {
                    if (eensVar25 instanceof eenp) {
                        ((eenp) eensVar25).i(dimensionPixelOffset2);
                    }
                }
            }
            int dimensionPixelSize5 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize5);
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize5);
            int i3 = getLayoutDirection() == 1 ? dimensionPixelOffset4 : dimensionPixelOffset3;
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset3 = getLayoutDirection() != 1 ? dimensionPixelOffset4 : dimensionPixelOffset3;
            int dimensionPixelOffset6 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            eenu eenuVar26 = this.b;
            eenuVar26.L.left = i3;
            eenuVar26.L.top = dimensionPixelOffset5;
            eenuVar26.L.right = dimensionPixelOffset3;
            eenuVar26.L.bottom = dimensionPixelOffset6;
            eens[] eensVarArr26 = eenuVar26.e;
            if (eensVarArr26 != null) {
                for (eens eensVar26 : eensVarArr26) {
                    if (eensVar26 instanceof eenp) {
                        ((eenp) eensVar26).n = eenuVar26.L;
                    }
                }
            }
            ColorStateList colorStateListC = eepy.c(context2, typedArrayObtainStyledAttributes, 2);
            eenu eenuVar27 = this.b;
            eenuVar27.E = colorStateListC;
            eens[] eensVarArr27 = eenuVar27.e;
            if (eensVarArr27 != null) {
                for (eens eensVar27 : eensVarArr27) {
                    if (eensVar27 instanceof eenp) {
                        ((eenp) eensVar27).d(eenuVar27.d());
                    }
                }
            }
            eesj eesjVar = new eesj(eesj.b(context2, typedArrayObtainStyledAttributes.getResourceId(11, 0), 0));
            eenu eenuVar28 = this.b;
            eenuVar28.D = eesjVar;
            eens[] eensVarArr28 = eenuVar28.e;
            if (eensVarArr28 != null) {
                for (eens eensVar28 : eensVarArr28) {
                    if (eensVar28 instanceof eenp) {
                        ((eenp) eensVar28).d(eenuVar28.d());
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (yxVarB.q(23)) {
            int iF7 = yxVarB.f(23, 0);
            this.c.b = true;
            if (this.e == null) {
                this.e = new ni(getContext());
            }
            this.e.inflate(iF7, this.a);
            eenx eenxVar2 = this.c;
            eenxVar2.b = false;
            eenxVar2.f(true);
        }
        yxVarB.o();
        addView(this.b);
        this.a.b = new eenz(this);
    }

    protected abstract eenu a(Context context);

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eesd.c(this);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof eeob)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eeob eeobVar = (eeob) parcelable;
        super.onRestoreInstanceState(eeobVar.d);
        eenq eenqVar = this.a;
        SparseArray sparseParcelableArray = eeobVar.a.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = eenqVar.i;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                op opVar = (op) weakReference.get();
                if (opVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int iA = opVar.a();
                    if (iA > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(iA)) != null) {
                        opVar.n(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableDG;
        eeob eeobVar = new eeob(super.onSaveInstanceState());
        eeobVar.a = new Bundle();
        Bundle bundle = eeobVar.a;
        CopyOnWriteArrayList copyOnWriteArrayList = this.a.i;
        if (copyOnWriteArrayList.isEmpty()) {
            return eeobVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            op opVar = (op) weakReference.get();
            if (opVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int iA = opVar.a();
                if (iA > 0 && (parcelableDG = opVar.dG()) != null) {
                    sparseArray.put(iA, parcelableDG);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return eeobVar;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        eesd.b(this, f);
    }
}
