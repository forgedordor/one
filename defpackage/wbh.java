package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wbh implements hnx {
    final /* synthetic */ Activity a;
    final /* synthetic */ int b;

    public wbh(Activity activity, int i) {
        this.a = activity;
        this.b = i;
    }

    @Override // defpackage.hnx
    public final void a() {
        this.a.setRequestedOrientation(this.b);
    }
}
