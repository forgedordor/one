package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kll extends fdbr implements fdap {
    final /* synthetic */ klm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kll(klm klmVar) {
        super(1);
        this.a = klmVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        klm klmVar = this.a;
        ifn ifnVar = (ifn) obj;
        View viewB = klj.b(klmVar);
        if (viewB.hasFocus()) {
            ige igeVar = ((AndroidComposeView) jbg.f(klmVar)).i;
            View viewA = jbh.a(klmVar);
            if (viewB instanceof ViewGroup) {
                Rect rectA = klj.a(igeVar, viewA, viewB);
                Integer numD = ifw.d(ifnVar.a);
                int iIntValue = numD != null ? numD.intValue() : 130;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View view = klmVar.a;
                View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewA, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectA, iIntValue);
                if (viewFindNextFocus != null && klj.c(viewB, viewFindNextFocus)) {
                    viewFindNextFocus.requestFocus(iIntValue, rectA);
                    ifnVar.a();
                } else if (!viewA.requestFocus()) {
                    throw new IllegalStateException("host view did not take focus");
                }
            } else if (!viewA.requestFocus()) {
                throw new IllegalStateException("host view did not take focus");
            }
        }
        return fctx.a;
    }
}
