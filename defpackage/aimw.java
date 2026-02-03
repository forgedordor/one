package defpackage;

import android.telephony.TelephonyManager;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aimw {
    public final crny a;
    public final dhes b;
    public final TelephonyManager c;
    public final cmlb d;
    public final fcsu e;
    private final ejyq f = new ejyk().b(new aimv(this));

    public aimw(crny crnyVar, dhes dhesVar, TelephonyManager telephonyManager, cmlb cmlbVar, fcsu fcsuVar) {
        this.a = crnyVar;
        this.b = dhesVar;
        this.c = telephonyManager;
        this.d = cmlbVar;
        this.e = fcsuVar;
    }

    public final elpy a(int i) {
        try {
            return (elpy) this.f.a(Integer.valueOf(i));
        } catch (ExecutionException e) {
            throw new RuntimeException(a.g(i, "Failed to create BugleMobileCode for subId: "), e.getCause());
        }
    }
}
