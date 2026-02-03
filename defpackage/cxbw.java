package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxbw extends cxtd {
    public eigp a;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.a.c("DebugReceiver Receive broadcast", "com/google/android/apps/messaging/ui/debug/DebugReceiver", "beginRootTrace", 28);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }

    @Override // defpackage.clca
    protected final String f() {
        return null;
    }

    @Override // defpackage.clca
    public final void g(Context context, Intent intent) {
        q("debug future", SettableFuture.create());
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }
}
