package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acy {
    private static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static /* synthetic */ void a(abi abiVar, fdat fdatVar) {
        View childAt = ((ViewGroup) abiVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.i(null);
            composeView.a(fdatVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(abiVar, null, 0, 6, null);
        composeView2.i(null);
        composeView2.a(fdatVar);
        View decorView = abiVar.getWindow().getDecorView();
        if (lxr.a(decorView) == null) {
            lxr.b(decorView, abiVar);
        }
        if (lxs.a(decorView) == null) {
            lxs.b(decorView, abiVar);
        }
        if (pje.a(decorView) == null) {
            pje.b(decorView, abiVar);
        }
        abiVar.setContentView(composeView2, a);
    }
}
