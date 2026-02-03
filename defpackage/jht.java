package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jht extends fdbr implements fdap {
    final /* synthetic */ AndroidComposeView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jht(AndroidComposeView androidComposeView) {
        super(1);
        this.a = androidComposeView;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        ifq ifqVar;
        KeyEvent keyEvent = ((iqh) obj).a;
        long jB = iqj.b(keyEvent);
        if (iqg.a(jB, iqg.b)) {
            ifqVar = new ifq(2);
        } else if (iqg.a(jB, iqg.c)) {
            ifqVar = new ifq(1);
        } else if (iqg.a(jB, iqg.k)) {
            ifqVar = new ifq(true != keyEvent.isShiftPressed() ? 1 : 2);
        } else {
            ifqVar = iqg.a(jB, iqg.g) ? new ifq(4) : iqg.a(jB, iqg.f) ? new ifq(3) : (iqg.a(jB, iqg.d) || iqg.a(jB, iqg.r)) ? new ifq(5) : (iqg.a(jB, iqg.e) || iqg.a(jB, iqg.s)) ? new ifq(6) : (iqg.a(jB, iqg.h) || iqg.a(jB, iqg.m) || iqg.a(jB, iqg.t)) ? new ifq(7) : (iqg.a(jB, iqg.a) || iqg.a(jB, iqg.o)) ? new ifq(8) : null;
        }
        if (ifqVar == null || !iqi.a(iqj.a(keyEvent), 2)) {
            return false;
        }
        AndroidComposeView androidComposeView = this.a;
        int i = ifqVar.a;
        Integer numD = ifw.d(i);
        ihu ihuVarD = androidComposeView.D();
        jhs jhsVar = new jhs(ifqVar);
        ige igeVar = androidComposeView.i;
        Boolean boolD = igeVar.d(i, ihuVarD, jhsVar);
        if (boolD == null || boolD.booleanValue()) {
            return true;
        }
        if (!igk.a(i)) {
            return false;
        }
        if (numD != null) {
            int iIntValue = numD.intValue();
            jmr jmrVar = jmu.a;
            jmu jmuVarA = jms.a();
            View viewA = androidComposeView;
            loop0: while (true) {
                if (viewA == null) {
                    viewA = null;
                    break;
                }
                View rootView = androidComposeView.getRootView();
                rootView.getClass();
                viewA = jmuVarA.a((ViewGroup) rootView, viewA, iIntValue);
                if (viewA != null) {
                    if (!fdbq.f(viewA, androidComposeView)) {
                        for (ViewParent parent = viewA.getParent(); parent != null; parent = parent.getParent()) {
                            if (parent == androidComposeView) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
            }
            if (true == fdbq.f(viewA, androidComposeView)) {
                viewA = null;
            }
            if (viewA != null) {
                Rect rectA = ihuVarD != null ? ikh.a(ihuVarD) : null;
                if (rectA == null) {
                    throw new IllegalStateException("Invalid rect");
                }
                View rootView2 = androidComposeView.getRootView();
                rootView2.getClass();
                ViewGroup viewGroup = (ViewGroup) rootView2;
                viewGroup.offsetDescendantRectToMyCoords(androidComposeView, rectA);
                viewGroup.offsetRectIntoDescendantCoords(viewA, rectA);
                if (ifw.e(viewA, numD, rectA)) {
                    return true;
                }
            }
        }
        if (!igeVar.g(false, false, i)) {
            return true;
        }
        Boolean boolD2 = igeVar.d(i, null, new jhr(ifqVar));
        return Boolean.valueOf(boolD2 != null ? boolD2.booleanValue() : true);
    }
}
