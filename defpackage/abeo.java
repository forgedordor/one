package defpackage;

import android.content.Intent;
import android.content.ServiceConnection;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abeo implements Closeable {
    final /* synthetic */ abes a;
    private final ServiceConnection b;

    public abeo(abes abesVar, Intent intent, ServiceConnection serviceConnection) {
        this.a = abesVar;
        this.b = serviceConnection;
        abesVar.b.bindService(intent, serviceConnection, 20);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b.unbindService(this.b);
    }
}
