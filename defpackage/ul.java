package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ul extends yc {
    private vc c;
    private vc d;

    private final int h(wb wbVar, vc vcVar, int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int iAs = wbVar.as();
        float f = 1.0f;
        if (iAs != 0) {
            View view = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iAs; i5++) {
                View viewAE = wbVar.aE(i5);
                int iBu = wb.bu(viewAE);
                if (iBu != -1) {
                    int i6 = iBu < i3 ? iBu : i3;
                    if (iBu < i3) {
                        view = viewAE;
                    }
                    if (iBu > i4) {
                        view2 = viewAE;
                        i4 = iBu;
                    }
                    i3 = i6;
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(vcVar.a(view), vcVar.a(view2)) - Math.min(vcVar.d(view), vcVar.d(view2));
                if (iMax != 0) {
                    f = iMax / ((i4 - i3) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(iArr[Math.abs(iArr[0]) > Math.abs(iArr[1]) ? (char) 0 : (char) 1] / f);
    }

    private final vc i(wb wbVar) {
        vc vcVar = this.d;
        if (vcVar == null || vcVar.a != wbVar) {
            this.d = new va(wbVar);
        }
        return this.d;
    }

    private final vc j(wb wbVar) {
        vc vcVar = this.c;
        if (vcVar == null || vcVar.a != wbVar) {
            this.c = new vb(wbVar);
        }
        return this.c;
    }

    private static final int k(View view, vc vcVar) {
        return (vcVar.d(view) + (vcVar.b(view) / 2)) - (vcVar.j() + (vcVar.k() / 2));
    }

    private static View l(wb wbVar, vc vcVar) {
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
        int iAu;
        View viewB;
        int iBu;
        int i3;
        PointF pointFP;
        int iH;
        int iH2;
        if (!(wbVar instanceof wq) || (iAu = wbVar.au()) == 0 || (viewB = b(wbVar)) == null || (iBu = wb.bu(viewB)) == -1 || (pointFP = ((wq) wbVar).P(iAu - 1)) == null) {
            return -1;
        }
        if (wbVar.ae()) {
            iH = h(wbVar, i(wbVar), i, 0);
            if (pointFP.x < 0.0f) {
                iH = -iH;
            }
        } else {
            iH = 0;
        }
        if (wbVar.af()) {
            iH2 = h(wbVar, j(wbVar), 0, i2);
            if (pointFP.y < 0.0f) {
                iH2 = -iH2;
            }
        } else {
            iH2 = 0;
        }
        if (true == wbVar.af()) {
            iH = iH2;
        }
        if (iH == 0) {
            return -1;
        }
        int i4 = iBu + iH;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= iAu ? i3 : i5;
    }

    @Override // defpackage.yc
    public View b(wb wbVar) {
        if (wbVar.af()) {
            return l(wbVar, j(wbVar));
        }
        if (wbVar.ae()) {
            return l(wbVar, i(wbVar));
        }
        return null;
    }

    @Override // defpackage.yc
    public int[] c(wb wbVar, View view) {
        int[] iArr = new int[2];
        if (wbVar.ae()) {
            iArr[0] = k(view, i(wbVar));
        } else {
            iArr[0] = 0;
        }
        if (wbVar.af()) {
            iArr[1] = k(view, j(wbVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }
}
