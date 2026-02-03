package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcih implements ServiceConnection, dcfc {
    public final dcgy a;
    public IBinder b;
    private final String d;
    private final String e;
    private final ComponentName f;
    private final Context g;
    private final Handler h;
    private final dcii i;
    public boolean c = false;
    private String j = null;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dcih(android.content.Context r2, android.os.Looper r3, java.lang.String r4, java.lang.String r5, android.content.ComponentName r6, defpackage.dcgy r7, defpackage.dcii r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r0 = 0
            r1.j = r0
            r1.g = r2
            ddmy r2 = new ddmy
            r2.<init>(r3)
            r1.h = r2
            r1.a = r7
            r1.i = r8
            if (r4 == 0) goto L1e
            if (r5 == 0) goto L1e
            if (r6 != 0) goto L27
            r6 = r0
            goto L20
        L1e:
            if (r6 == 0) goto L27
        L20:
            r1.d = r4
            r1.e = r5
            r1.f = r6
            return
        L27:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcih.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, dcgy, dcii):void");
    }

    private final void d() {
        if (Thread.currentThread() != this.h.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // defpackage.dcfc
    public final int a() {
        return 0;
    }

    public final IBinder b() {
        d();
        return this.b;
    }

    public final void c() {
        String.valueOf(this.b);
    }

    @Override // defpackage.dcfc
    public final boolean h() {
        return false;
    }

    @Override // defpackage.dcfc
    public final String j() {
        return this.j;
    }

    @Override // defpackage.dcfc
    public final Set k() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.dcfc
    public final void l(dcjw dcjwVar) {
        d();
        c();
        if (p()) {
            try {
                n("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.d).setAction(this.e);
            }
            boolean zBindService = this.g.bindService(intent, this, dckq.a);
            this.c = zBindService;
            if (!zBindService) {
                this.b = null;
                this.i.onConnectionFailed(new ConnectionResult(16));
            }
            c();
        } catch (SecurityException e) {
            this.c = false;
            this.b = null;
            throw e;
        }
    }

    @Override // defpackage.dcfc
    public final void m() {
        throw null;
    }

    @Override // defpackage.dcfc
    public final void n(String str) {
        d();
        this.j = str;
        d();
        c();
        try {
            this.g.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.c = false;
        this.b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.h.post(new Runnable() { // from class: dcig
            @Override // java.lang.Runnable
            public final void run() {
                dcih dcihVar = this.a;
                dcihVar.c = false;
                dcihVar.b = iBinder;
                dcihVar.c();
                dcihVar.a.onConnected(new Bundle());
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.h.post(new Runnable() { // from class: dcif
            @Override // java.lang.Runnable
            public final void run() {
                dcih dcihVar = this.a;
                dcihVar.c = false;
                dcihVar.b = null;
                dcihVar.c();
                dcihVar.a.onConnectionSuspended(1);
            }
        });
    }

    @Override // defpackage.dcfc
    public final boolean p() {
        d();
        return this.b != null;
    }

    @Override // defpackage.dcfc
    public final boolean q() {
        d();
        return this.c;
    }

    @Override // defpackage.dcfc
    public final boolean r() {
        return false;
    }

    @Override // defpackage.dcfc
    public final Feature[] s() {
        return new Feature[0];
    }

    @Override // defpackage.dcfc
    public final void u() {
        if (this.d != null) {
            return;
        }
        ComponentName componentName = this.f;
        dclh.m(componentName);
        componentName.getPackageName();
    }

    @Override // defpackage.dcfc
    public final void t(dchk dchkVar) {
    }

    @Override // defpackage.dcfc
    public final void o(IAccountAccessor iAccountAccessor, Set set) {
    }
}
