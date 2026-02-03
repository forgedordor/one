package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjp implements hnx {
    final /* synthetic */ Context a;
    final /* synthetic */ jjr b;

    public jjp(Context context, jjr jjrVar) {
        this.a = context;
        this.b = jjrVar;
    }

    @Override // defpackage.hnx
    public final void a() {
        this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
    }
}
