package defpackage;

import com.google.android.libraries.compose.ui.views.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqaa extends fdcy {
    final /* synthetic */ RoundedImageView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqaa(RoundedImageView roundedImageView) {
        super(null);
        this.a = roundedImageView;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        this.a.requestLayout();
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
