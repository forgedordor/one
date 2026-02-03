package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktf implements ksk {
    final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public ktf(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean c(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    @Override // defpackage.ksk
    public final void a() {
        ConstraintLayout constraintLayout = this.a;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt instanceof ktr) {
                throw null;
            }
        }
        ArrayList arrayList = constraintLayout.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
            }
        }
    }

    @Override // defpackage.ksk
    public final void b(krz krzVar, ksj ksjVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        int i;
        int i2;
        if (krzVar == null) {
            return;
        }
        if (krzVar.ar == 8) {
            ksjVar.c = 0;
            ksjVar.d = 0;
            ksjVar.e = 0;
            return;
        }
        if (krzVar.ae != null) {
            int i3 = ksjVar.i;
            int i4 = ksjVar.j;
            int i5 = ksjVar.a;
            int i6 = ksjVar.b;
            int i7 = this.b + this.c;
            int i8 = this.d;
            View view = (View) krzVar.aq;
            int i9 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i9 == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i9 == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            } else if (i9 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
                int i10 = krzVar.C;
                int i11 = ksjVar.h;
                if (i11 == 1 || i11 == 2) {
                    int measuredHeight = view.getMeasuredHeight();
                    int iH = krzVar.h();
                    if (ksjVar.h == 2 || i10 != 1 || measuredHeight == iH || (view instanceof ktr) || krzVar.e()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(krzVar.j(), 1073741824);
                    }
                }
            } else if (i9 != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i12 = this.f;
                kry kryVar = krzVar.T;
                int i13 = kryVar != null ? kryVar.f : 0;
                kry kryVar2 = krzVar.V;
                if (kryVar2 != null) {
                    i13 += kryVar2.f;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i8 + i13, -1);
            }
            int i14 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i14 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i14 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
            } else if (i14 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
                int i15 = krzVar.D;
                int i16 = ksjVar.h;
                if (i16 == 1 || i16 == 2) {
                    int measuredWidth = view.getMeasuredWidth();
                    int iJ = krzVar.j();
                    if (ksjVar.h == 2 || i15 != 1 || measuredWidth == iJ || (view instanceof ktr) || krzVar.f()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(krzVar.h(), 1073741824);
                    }
                }
            } else if (i14 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i17 = this.g;
                int i18 = krzVar.T != null ? krzVar.U.f : 0;
                if (krzVar.V != null) {
                    i18 += krzVar.W.f;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i7 + i18, -1);
            }
            ksa ksaVar = (ksa) krzVar.ae;
            if (ksaVar != null && ksf.b(this.h.f, 256) && view.getMeasuredWidth() == krzVar.j() && view.getMeasuredWidth() < ksaVar.j() && view.getMeasuredHeight() == krzVar.h() && view.getMeasuredHeight() < ksaVar.h() && view.getBaseline() == krzVar.al && !krzVar.U() && c(krzVar.R, iMakeMeasureSpec, krzVar.j()) && c(krzVar.S, iMakeMeasureSpec2, krzVar.h())) {
                ksjVar.c = krzVar.j();
                ksjVar.d = krzVar.h();
                ksjVar.e = krzVar.al;
                return;
            }
            boolean z = i3 == 3;
            boolean z2 = i4 == 3;
            boolean z3 = i4 == 4 || i4 == 1;
            boolean z4 = i3 == 4 || i3 == 1;
            boolean z5 = z && krzVar.ah > 0.0f;
            boolean z6 = z2 && krzVar.ah > 0.0f;
            if (view != null) {
                kte kteVar = (kte) view.getLayoutParams();
                int i19 = ksjVar.h;
                if (i19 != 1 && i19 != 2 && z && krzVar.C == 0 && z2 && krzVar.D == 0) {
                    i = -1;
                    baseline = 0;
                    iMax = 0;
                    iMax2 = 0;
                } else {
                    if ((view instanceof ktu) && (krzVar instanceof ksg)) {
                        ((ktu) view).b((ksg) krzVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    krzVar.G(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    int i20 = krzVar.F;
                    iMax = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
                    int i21 = krzVar.G;
                    if (i21 > 0) {
                        iMax = Math.min(i21, iMax);
                    }
                    int i22 = krzVar.I;
                    iMax2 = i22 > 0 ? Math.max(i22, measuredHeight2) : measuredHeight2;
                    boolean z7 = z4;
                    int i23 = krzVar.J;
                    if (i23 > 0) {
                        iMax2 = Math.min(i23, iMax2);
                    }
                    if (!ksf.b(this.h.f, 1)) {
                        if (z5 && z3) {
                            iMax = (int) ((iMax2 * krzVar.ah) + 0.5f);
                        } else if (z6 && z7) {
                            iMax2 = (int) ((iMax / krzVar.ah) + 0.5f);
                        }
                    }
                    if (measuredWidth2 != iMax || measuredHeight2 != iMax2) {
                        if (measuredWidth2 != iMax) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        }
                        if (measuredHeight2 != iMax2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        krzVar.G(iMakeMeasureSpec, iMakeMeasureSpec2);
                        iMax = view.getMeasuredWidth();
                        iMax2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i = -1;
                }
                boolean z8 = baseline != i;
                ksjVar.g = (iMax == ksjVar.a && iMax2 == ksjVar.b) ? false : true;
                boolean z9 = z8 | kteVar.ag;
                if (!z9) {
                    i2 = baseline;
                } else if (baseline != -1) {
                    if (krzVar.al != baseline) {
                        ksjVar.g = true;
                    }
                    i2 = baseline;
                } else {
                    i2 = -1;
                }
                ksjVar.c = iMax;
                ksjVar.d = iMax2;
                ksjVar.f = z9;
                ksjVar.e = i2;
            }
        }
    }
}
