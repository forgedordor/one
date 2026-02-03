package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjx implements ServiceConnection {
    final /* synthetic */ BaseGmsClient a;
    private final int b;

    public dcjx(BaseGmsClient baseGmsClient, int i) {
        this.a = baseGmsClient;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder != null) {
            BaseGmsClient baseGmsClient = this.a;
            synchronized (baseGmsClient.g) {
                baseGmsClient.h = IGmsServiceBroker.Stub.asInterface(iBinder);
            }
            this.a.D(0, null, this.b);
            return;
        }
        BaseGmsClient baseGmsClient2 = this.a;
        synchronized (baseGmsClient2.f) {
            i = baseGmsClient2.k;
        }
        if (i == 3) {
            baseGmsClient2.p = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = baseGmsClient2.e;
        handler.sendMessage(handler.obtainMessage(i2, baseGmsClient2.r.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.a;
        synchronized (baseGmsClient.g) {
            baseGmsClient.h = null;
        }
        BaseGmsClient baseGmsClient2 = this.a;
        int i = this.b;
        Handler handler = baseGmsClient2.e;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
