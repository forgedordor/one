package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbe implements dbzv {
    public static final dzzf a;
    public static final ConcurrentHashMap b;
    static Boolean c;
    static Long d;
    public final Context e;

    static {
        dcfe dcfeVar = ddys.a;
        dzzf dzzfVar = new dzzf(dzyc.a("com.google.android.gms.clearcut.public"));
        if (dzzfVar.e) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        a = new dzzf(dzzfVar.a, dzzfVar.b, "gms:playlog:service:samplingrules_", dzzfVar.d, false, dzzfVar.f, dzzfVar.g).d("LogSamplingRulesV2__");
        b = new ConcurrentHashMap();
        c = null;
        d = null;
    }

    public dcbe(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext != null) {
            dzzh.f(applicationContext);
        }
    }
}
