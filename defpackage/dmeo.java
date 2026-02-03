package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmeo implements hnx {
    final /* synthetic */ Activity a;
    final /* synthetic */ int b;

    public dmeo(Activity activity, int i) {
        this.a = activity;
        this.b = i;
    }

    @Override // defpackage.hnx
    public final void a() {
        this.a.setRequestedOrientation(this.b);
    }
}
