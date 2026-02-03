package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxm implements ServiceConnection {
    final /* synthetic */ qxn a;
    private final aize b;

    public qxm(qxn qxnVar, aize aizeVar) {
        this.a = qxnVar;
        this.b = aizeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qxp.a("Install Referrer service connected.");
        qxn qxnVar = this.a;
        qxnVar.b = IGetInstallReferrerService.Stub.asInterface(iBinder);
        qxnVar.a = 2;
        this.b.a(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qxp.b("Install Referrer service disconnected.");
        qxn qxnVar = this.a;
        qxnVar.b = null;
        qxnVar.a = 0;
    }
}
