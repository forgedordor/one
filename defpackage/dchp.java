package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.vcard.VCardConfig;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchp implements Handler.Callback {
    public static dchp d;
    public final Context g;
    public final dcdt h;
    public final dckx i;
    public final Handler o;
    public volatile boolean p;
    private TelemetryData r;
    private dclr s;
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    private static volatile boolean q = false;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public dchc m = null;
    public final Set n = new css();
    private final Set t = new css();

    private dchp(Context context, Looper looper, dcdt dcdtVar) {
        this.p = true;
        this.g = context;
        ddmy ddmyVar = new ddmy(looper, this);
        this.o = ddmyVar;
        this.h = dcdtVar;
        this.i = new dckx(dcdtVar);
        if (dcmz.a(context)) {
            this.p = false;
        }
        ddmyVar.sendMessage(ddmyVar.obtainMessage(6));
    }

    public static Status a(dcgl dcglVar, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + dcglVar.a.c + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    public static dchp c(Context context) {
        dchp dchpVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (d == null) {
                synchronized (dckq.b) {
                    handlerThread = dckq.c;
                    if (handlerThread == null) {
                        dckq.c = new HandlerThread("GoogleApiHandler", 9);
                        dckq.c.start();
                        handlerThread = dckq.c;
                    }
                }
                d = new dchp(context.getApplicationContext(), handlerThread.getLooper(), dcdt.a);
            }
            dchpVar = d;
        }
        return dchpVar;
    }

    private final dchl j(dcfm dcfmVar) {
        Map map = this.l;
        dcgl dcglVar = dcfmVar.h;
        dchl dchlVar = (dchl) map.get(dcglVar);
        if (dchlVar == null) {
            dchlVar = new dchl(this, dcfmVar);
            map.put(dcglVar, dchlVar);
        }
        if (dchlVar.l()) {
            this.t.add(dcglVar);
        }
        dchlVar.b();
        return dchlVar;
    }

    private final dclr k() {
        if (this.s == null) {
            this.s = new dcma(this.g, dcls.a);
        }
        return this.s;
    }

    private final void l() {
        TelemetryData telemetryData = this.r;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || h()) {
                k().a(telemetryData);
            }
            this.r = null;
        }
    }

    final dchl b(dcgl dcglVar) {
        return (dchl) this.l.get(dcglVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.defr r9, int r10, defpackage.dcfm r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L74
            dcgl r3 = r11.h
            boolean r11 = r8.h()
            r0 = 0
            if (r11 != 0) goto Ld
        Lb:
            r1 = r8
            goto L62
        Ld:
            dcll r11 = defpackage.dcll.a()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r11 = r11.a
            r1 = 1
            if (r11 == 0) goto L48
            boolean r2 = r11.b
            if (r2 != 0) goto L1b
            goto Lb
        L1b:
            boolean r11 = r11.c
            dchl r2 = r8.b(r3)
            if (r2 == 0) goto L47
            dcfc r4 = r2.b
            boolean r5 = r4 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r5 != 0) goto L2a
            goto Lb
        L2a:
            com.google.android.gms.common.internal.BaseGmsClient r4 = (com.google.android.gms.common.internal.BaseGmsClient) r4
            boolean r5 = r4.G()
            if (r5 == 0) goto L47
            boolean r5 = r4.q()
            if (r5 != 0) goto L47
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = defpackage.dcid.b(r2, r4, r10)
            if (r11 != 0) goto L3f
            goto Lb
        L3f:
            int r0 = r2.h
            int r0 = r0 + r1
            r2.h = r0
            boolean r1 = r11.c
            goto L48
        L47:
            r1 = r11
        L48:
            dcid r0 = new dcid
            r4 = 0
            if (r1 == 0) goto L53
            long r6 = java.lang.System.currentTimeMillis()
            goto L54
        L53:
            r6 = r4
        L54:
            if (r1 == 0) goto L5a
            long r4 = android.os.SystemClock.elapsedRealtime()
        L5a:
            r1 = r6
            r6 = r4
            r4 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
        L62:
            if (r0 == 0) goto L75
            defv r9 = r9.a
            android.os.Handler r10 = r1.o
            r10.getClass()
            dchf r11 = new dchf
            r11.<init>()
            r9.o(r11, r0)
            return
        L74:
            r1 = r8
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dchp.d(defr, int, dcfm):void");
    }

    public final void e(ConnectionResult connectionResult, int i) {
        if (i(connectionResult, i)) {
            return;
        }
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void f() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void g(dchc dchcVar) {
        synchronized (c) {
            if (this.m != dchcVar) {
                this.m = dchcVar;
                this.n.clear();
            }
            this.n.addAll(dchcVar.e);
        }
    }

    final boolean h() {
        if (this.f) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = dcll.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int iB = this.i.b(203400000);
        return iB == -1 || iB == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0289  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dchp.handleMessage(android.os.Message):boolean");
    }

    final boolean i(ConnectionResult connectionResult, int i) {
        Context context = this.g;
        if (dcnt.a(context)) {
            return false;
        }
        dcdt dcdtVar = this.h;
        PendingIntent pendingIntentJ = connectionResult.b() ? connectionResult.d : dcdtVar.j(context, connectionResult.c, null);
        if (pendingIntentJ == null) {
            return false;
        }
        dcdtVar.f(context, connectionResult.c, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentJ, i, true), ddmt.a | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        return true;
    }
}
