package defpackage;

import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jim extends fdbr implements fdap {
    final /* synthetic */ jir a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jim(jir jirVar) {
        super(1);
        this.a = jirVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AndroidComposeView androidComposeView = this.a.b;
        return Boolean.valueOf(androidComposeView.getParent().requestSendAccessibilityEvent(androidComposeView, (AccessibilityEvent) obj));
    }
}
