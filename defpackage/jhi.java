package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhi extends fdbr implements fdae {
    final /* synthetic */ AndroidComposeView a;
    final /* synthetic */ KeyEvent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhi(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        super(0);
        this.a = androidComposeView;
        this.b = keyEvent;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent(this.b));
    }
}
