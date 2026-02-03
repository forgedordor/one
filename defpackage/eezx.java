package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eezx implements ServiceConnection {
    final /* synthetic */ eezy a;

    public eezx(eezy eezyVar) {
        this.a = eezyVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object[] objArr = {componentName};
        eezy eezyVar = this.a;
        eezyVar.b.d("ServiceConnectionImpl.onServiceConnected(%s)", objArr);
        eezyVar.d(new eezv(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object[] objArr = {componentName};
        eezy eezyVar = this.a;
        eezyVar.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", objArr);
        eezyVar.d(new eezw(this));
    }
}
