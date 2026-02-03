package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjs implements hnx {
    final /* synthetic */ Context a;
    final /* synthetic */ jju b;

    public jjs(Context context, jju jjuVar) {
        this.a = context;
        this.b = jjuVar;
    }

    @Override // defpackage.hnx
    public final void a() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}
