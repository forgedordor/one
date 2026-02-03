package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.IAiCoreServiceProvider;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sok implements ServiceConnection {
    public SettableFuture b;
    final /* synthetic */ sol d;
    public final Object a = new Object();
    protected sor c = new sor();

    public sok(sol solVar) {
        this.d = solVar;
        c();
    }

    public final void a(IAICoreService iAICoreService) {
        synchronized (this.a) {
            this.b.set(new smt(iAICoreService, this.c));
        }
    }

    public final void b(smo smoVar) {
        synchronized (this.a) {
            this.b.setException(smoVar);
        }
        this.d.j();
    }

    final void c() {
        synchronized (this.a) {
            this.b = SettableFuture.create();
            this.c = new sor();
        }
    }

    public final boolean d(Intent intent) {
        sol solVar = this.d;
        return solVar.d.bindService(intent, this, true == solVar.f ? 65 : 1);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        b(new smo(4, 603, "AiCore service binding died.", null));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        b(new smo(4, 605, "AiCore service returns null on binding.", null));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (!ejwh.a(componentName, sol.b)) {
            if (ejwh.a(componentName, sol.c)) {
                a(IAICoreService.Stub.asInterface(iBinder));
                return;
            } else {
                b(new smo(4, 0, "AiCore service is not connected. Unknown component ".concat(String.valueOf(String.valueOf(componentName))), null));
                return;
            }
        }
        try {
            IAiCoreServiceProvider.Stub.asInterface(iBinder).get(new soj(this));
        } catch (RemoteException | RuntimeException e) {
            b(new smo(4, 6, "AiCore service is not connected.", e));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a) {
            this.c.c();
            this.b.setException(new smo(4, 602, "AiCore service disconnected.", null));
            c();
        }
    }
}
