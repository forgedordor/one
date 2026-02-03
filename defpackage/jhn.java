package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jhn extends fdbo implements fdae {
    public jhn(Object obj) {
        super(0, obj, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        AndroidComposeView androidComposeView = (AndroidComposeView) this.g;
        Class cls = AndroidComposeView.a;
        return androidComposeView.D();
    }
}
