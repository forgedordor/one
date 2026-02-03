package defpackage;

import com.google.android.apps.messaging.home.toolbar.StatusBarScrimView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addr extends fdcy {
    final /* synthetic */ StatusBarScrimView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addr(Object obj, StatusBarScrimView statusBarScrimView) {
        super(obj);
        this.a = statusBarScrimView;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        if (((Number) obj).intValue() != ((Number) obj2).intValue()) {
            this.a.requestLayout();
        }
    }
}
