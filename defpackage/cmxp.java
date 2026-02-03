package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmxp {
    public static final cczv a;
    public static final cczv b;
    public static final cczv c;
    public static final cczv d;

    static {
        ejxx.a(new ejxr() { // from class: cmxo
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = cmxp.a;
                return cdag.b("bypass_message_queueing_v2", false);
            }
        });
        a = cdag.h(cdag.b, "attach_to_service_after_pull", false);
        b = cdag.h(cdag.b, "attach_to_service_v2_after_pull", false);
        c = cdag.h(cdag.b, "attach_to_wakelock_v2_after_pull", false);
        d = cdag.m(cdag.b, "enable_tachygram_arrived_to_message_delivered_logging", true);
    }
}
