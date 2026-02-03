package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jhk extends fdbo implements fdat {
    public jhk(Object obj) {
        super(2, obj, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        AndroidComposeView androidComposeView = (AndroidComposeView) this.g;
        Class cls = AndroidComposeView.a;
        return Boolean.valueOf(androidComposeView.Q((ifq) obj, (ihu) obj2));
    }
}
