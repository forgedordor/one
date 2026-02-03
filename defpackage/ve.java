package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ve extends yc {
    private vc c;
    private vc d;

    private final vc h(wb wbVar) {
        vc vcVar = this.d;
        if (vcVar == null || vcVar.a != wbVar) {
            this.d = new va(wbVar);
        }
        return this.d;
    }

    private final vc i(wb wbVar) {
        vc vcVar = this.c;
        if (vcVar == null || vcVar.a != wbVar) {
            this.c = new vb(wbVar);
        }
        return this.c;
    }

    private static final int j(View view, vc vcVar) {
        return (vcVar.d(view) + (vcVar.b(view) / 2)) - (vcVar.j() + (vcVar.k() / 2));
    }

    private static final View k(wb wbVar, vc vcVar) {
        int iAs = wbVar.as();
        View view = null;
        if (iAs == 0) {
            return null;
        }
        int iJ = vcVar.j() + (vcVar.k() / 2);
        int i = 0;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        while (i < iAs) {
            View viewAE = wbVar.aE(i);
            int iAbs = Math.abs((vcVar.d(viewAE) + (vcVar.b(viewAE) / 2)) - iJ);
            int i3 = iAbs < i2 ? iAbs : i2;
            if (iAbs < i2) {
                view = viewAE;
            }
            i++;
            i2 = i3;
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yc
    public final int a(wb wbVar, int i, int i2) {
        PointF pointFP;
        int iAu = wbVar.au();
        if (iAu != 0) {
            View view = null;
            vc vcVarI = wbVar.af() ? i(wbVar) : wbVar.ae() ? h(wbVar) : null;
            if (vcVarI != null) {
                int iAs = wbVar.as();
                boolean z = false;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MAX_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < iAs; i5++) {
                    View viewAE = wbVar.aE(i5);
                    if (viewAE != null) {
                        int iJ = j(viewAE, vcVarI);
                        if (iJ <= 0 && iJ > i3) {
                            view2 = viewAE;
                            i3 = iJ;
                        }
                        if (iJ >= 0 && iJ < i4) {
                            view = viewAE;
                            i4 = iJ;
                        }
                    }
                }
                if (true != wbVar.ae()) {
                    i = i2;
                }
                boolean z2 = i > 0;
                if (z2 && view != null) {
                    return wb.bu(view);
                }
                if (!z2 && view2 != null) {
                    return wb.bu(view2);
                }
                if (true == z2) {
                    view = view2;
                }
                if (view != null) {
                    int iBu = wb.bu(view);
                    int iAu2 = wbVar.au();
                    if ((wbVar instanceof wq) && (pointFP = ((wq) wbVar).P(iAu2 - 1)) != null && (pointFP.x < 0.0f || pointFP.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = iBu + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < iAu) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.yc
    public final View b(wb wbVar) {
        if (wbVar.af()) {
            return k(wbVar, i(wbVar));
        }
        if (wbVar.ae()) {
            return k(wbVar, h(wbVar));
        }
        return null;
    }

    @Override // defpackage.yc
    public final int[] c(wb wbVar, View view) {
        int[] iArr = new int[2];
        if (wbVar.ae()) {
            iArr[0] = j(view, h(wbVar));
        } else {
            iArr[0] = 0;
        }
        if (wbVar.af()) {
            iArr[1] = j(view, i(wbVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // defpackage.yc
    protected final wr d(wb wbVar) {
        if (wbVar instanceof wq) {
            return new vd(this, this.a.getContext());
        }
        return null;
    }
}
