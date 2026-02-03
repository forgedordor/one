package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efam implements ServiceConnection {
    private static final cczv a = cdag.p(146527691);
    private final eigp b;
    private final Class c;
    private final ServiceConnection d;

    public efam(eigp eigpVar, Class cls, ServiceConnection serviceConnection) {
        this.b = eigpVar;
        this.c = cls;
        this.d = serviceConnection;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        if (!((Boolean) a.e()).booleanValue()) {
            this.d.onBindingDied(componentName);
            return;
        }
        eieh eiehVarB = this.b.b("com/google/android/rcs/client/JibeServiceConnectionTraced", "onBindingDied", 67, this.c, "onBindingDied");
        try {
            this.d.onBindingDied(componentName);
            eiehVarB.close();
        } finally {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        if (!((Boolean) a.e()).booleanValue()) {
            this.d.onNullBinding(componentName);
            return;
        }
        eieh eiehVarB = this.b.b("com/google/android/rcs/client/JibeServiceConnectionTraced", "onNullBinding", 80, this.c, "onNullBinding");
        try {
            this.d.onNullBinding(componentName);
            eiehVarB.close();
        } finally {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (!((Boolean) a.e()).booleanValue()) {
            this.d.onServiceConnected(componentName, iBinder);
            return;
        }
        eieh eiehVarB = this.b.b("com/google/android/rcs/client/JibeServiceConnectionTraced", "onServiceConnected", 55, this.c, "onServiceConnected");
        try {
            this.d.onServiceConnected(componentName, iBinder);
            eiehVarB.close();
        } finally {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (!((Boolean) a.e()).booleanValue()) {
            this.d.onServiceDisconnected(componentName);
            return;
        }
        eieh eiehVarB = this.b.b("com/google/android/rcs/client/JibeServiceConnectionTraced", "onServiceDisconnected", 43, this.c, "onServiceDisconnected");
        try {
            this.d.onServiceDisconnected(componentName);
            eiehVarB.close();
        } finally {
        }
    }
}
