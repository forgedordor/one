package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpm implements ehwh {
    public static final ejxr a;
    public static final cczv b;
    public static final ekrg c;
    private static final ejxr f;
    public final cmqj d;
    public final fcsu e;
    private final fdjx g;

    static {
        ejxr ejxrVarV = cdag.v("enable_dangling_parts_metrics");
        ejxrVarV.getClass();
        f = ejxrVarV;
        ejxr ejxrVarV2 = cdag.v("enable_dangling_parts_log_zero");
        ejxrVarV2.getClass();
        a = ejxrVarV2;
        b = cdag.e(cdag.b, "dangling_parts_metrics_interval_days", 7);
        c = ekrg.c("com/google/android/apps/messaging/shared/telephony/analytics/DanglingPartsSynclet");
    }

    public cnpm(cmqj cmqjVar, fcsu fcsuVar, fdjx fdjxVar) {
        cmqjVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.d = cmqjVar;
        this.e = fcsuVar;
        this.g = fdjxVar;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        if (((Boolean) ((cczi) f.get()).e()).booleanValue() && craf.h) {
            return auvw.c(this.g, fcyi.a, fdjz.a, new cnpl(this, null));
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
