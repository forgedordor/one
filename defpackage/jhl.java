package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jhl extends fdbo implements fdap {
    public jhl(Object obj) {
        super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        View viewB;
        int i = ((ifq) obj).a;
        AndroidComposeView androidComposeView = (AndroidComposeView) this.g;
        Class cls = AndroidComposeView.a;
        boolean zE = false;
        if (!ifq.b(i, 7) && !ifq.b(i, 8)) {
            Integer numD = ifw.d(i);
            if (numD == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue = numD.intValue();
            ihu ihuVarD = androidComposeView.D();
            Rect rectA = ihuVarD != null ? ikh.a(ihuVarD) : null;
            jmr jmrVar = jmu.a;
            jmu jmuVarA = jms.a();
            if (rectA == null) {
                viewB = jmuVarA.a(androidComposeView, androidComposeView.findFocus(), iIntValue);
            } else {
                Rect rect = jmuVarA.b;
                rect.set(rectA);
                ViewGroup viewGroupC = jmu.c(androidComposeView, null);
                ArrayList arrayList = jmuVarA.c;
                try {
                    arrayList.clear();
                    jmx.c(viewGroupC, arrayList, iIntValue);
                    viewB = arrayList.isEmpty() ? null : jmuVarA.b(viewGroupC, null, rect, iIntValue, arrayList);
                } finally {
                    arrayList.clear();
                }
            }
            if (viewB != null) {
                zE = ifw.e(viewB, Integer.valueOf(iIntValue), rectA);
            }
        }
        return Boolean.valueOf(zE);
    }
}
