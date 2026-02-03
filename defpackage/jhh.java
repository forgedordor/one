package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhh extends fdbr implements fdae {
    final /* synthetic */ AndroidComposeView a;
    final /* synthetic */ MotionEvent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhh(AndroidComposeView androidComposeView, MotionEvent motionEvent) {
        super(0);
        this.a = androidComposeView;
        this.b = motionEvent;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchGenericMotionEvent(this.b));
    }
}
