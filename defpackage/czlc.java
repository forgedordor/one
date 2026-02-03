package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czlc extends ul {
    private vc c;
    private vc d;

    private static View h(wb wbVar, vc vcVar) {
        int iAbs;
        int iAs = wbVar.as();
        View view = null;
        if (iAs == 0) {
            return null;
        }
        int iJ = wbVar.bj() ? vcVar.j() + (vcVar.k() / 2) : vcVar.e() / 2;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < iAs; i2++) {
            View viewAE = wbVar.aE(i2);
            if (viewAE != null && (iAbs = Math.abs((viewAE.getLeft() + (viewAE.getWidth() / 2)) - iJ)) < i) {
                view = viewAE;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // defpackage.ul, defpackage.yc
    public final View b(wb wbVar) {
        if (wbVar.af()) {
            vc vcVar = this.c;
            if (vcVar == null || vcVar.a != wbVar) {
                this.c = new vb(wbVar);
            }
            return h(wbVar, this.c);
        }
        if (!wbVar.ae()) {
            return null;
        }
        vc vcVar2 = this.d;
        if (vcVar2 == null || vcVar2.a != wbVar) {
            this.d = new va(wbVar);
        }
        return h(wbVar, this.d);
    }

    @Override // defpackage.ul, defpackage.yc
    public final int[] c(wb wbVar, View view) {
        int[] iArrC = super.c(wbVar, view);
        int iAv = wbVar.av();
        int marginEnd = ((wc) view.getLayoutParams()).getMarginEnd() - ((wc) view.getLayoutParams()).getMarginStart();
        if (iAv == 1) {
            iArrC[0] = iArrC[0] + (marginEnd / 2);
            return iArrC;
        }
        iArrC[0] = iArrC[0] - (marginEnd / 2);
        return iArrC;
    }
}
