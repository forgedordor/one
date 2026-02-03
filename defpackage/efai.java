package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efai implements ServiceConnection {
    final /* synthetic */ efaj a;

    public efai(efaj efajVar) {
        this.a = efajVar;
    }

    public final void a(ComponentName componentName) {
        cqca.n("RcsClientLib", "Binding to " + componentName.getClassName() + " has died.");
        efaj efajVar = this.a;
        efajVar.g(efajVar.getServiceNameLoggingEnum(), 5);
    }

    public final void b(ComponentName componentName) {
        cqca.n("RcsClientLib", "Null IBinder returned for ".concat(String.valueOf(componentName.getClassName())));
        if (((Boolean) efaj.a.e()).booleanValue()) {
            this.a.c(efap.NULL_BINDING);
        }
        efaj efajVar = this.a;
        efajVar.g(efajVar.getServiceNameLoggingEnum(), 6);
    }

    public final void c(IBinder iBinder) {
        Object objInvoke;
        efaj efajVar = this.a;
        synchronized (efajVar.d) {
            Class<?>[] declaredClasses = efajVar.c.getDeclaredClasses();
            int i = 0;
            while (true) {
                objInvoke = null;
                if (i >= declaredClasses.length) {
                    break;
                }
                if (declaredClasses[i].getName().endsWith("Stub")) {
                    try {
                        objInvoke = declaredClasses[i].getMethod("asInterface", IBinder.class).invoke(null, iBinder);
                        break;
                    } catch (Exception e) {
                        cqca.h("RcsClientLib", e, "Error while getting stub: ".concat(String.valueOf(e.getMessage())));
                    }
                }
                i++;
            }
            efajVar.f = objInvoke;
        }
        if (efajVar.f != null) {
            efajVar.d(efajVar.getClass().getName());
        } else {
            efajVar.c(efap.INTERNAL_ERROR);
        }
        if (!((Boolean) efaj.b.e()).booleanValue()) {
            Object obj = this.a.d;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
        efaj efajVar2 = this.a;
        efajVar2.g(efajVar2.getServiceNameLoggingEnum(), 3);
    }

    public final void d() {
        efaj efajVar = this.a;
        synchronized (efajVar.d) {
            efajVar.f = null;
        }
        efaj efajVar2 = this.a;
        efajVar2.e(efajVar2.getClass().getName());
        efajVar2.g(efajVar2.getServiceNameLoggingEnum(), 4);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(final ComponentName componentName) {
        fcsu fcsuVar = this.a.g;
        if (fcsuVar != null) {
            ((Executor) fcsuVar.b()).execute(eiid.k(new Runnable() { // from class: efaf
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(componentName);
                }
            }));
        } else {
            a(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(final ComponentName componentName) {
        fcsu fcsuVar = this.a.g;
        if (fcsuVar != null) {
            ((Executor) fcsuVar.b()).execute(eiid.k(new Runnable() { // from class: efag
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(componentName);
                }
            }));
        } else {
            b(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        fcsu fcsuVar = this.a.g;
        if (fcsuVar != null) {
            ((Executor) fcsuVar.b()).execute(eiid.k(new Runnable() { // from class: efah
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c(iBinder);
                }
            }));
        } else {
            c(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        fcsu fcsuVar = this.a.g;
        if (fcsuVar != null) {
            ((Executor) fcsuVar.b()).execute(eiid.k(new Runnable() { // from class: efae
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d();
                }
            }));
        } else {
            d();
        }
    }
}
