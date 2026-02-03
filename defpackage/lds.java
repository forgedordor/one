package defpackage;

import android.view.ScrollFeedbackProvider;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lds implements ldu {
    private final ScrollFeedbackProvider a;

    public lds(View view) {
        this.a = ScrollFeedbackProvider.createProvider(view);
    }

    @Override // defpackage.ldu
    public final void a(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.ldu
    public final void b(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
