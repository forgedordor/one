package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyjr implements cfsb {
    public static final ejxr a = cdag.v("propagate_registration_debugging_state");
    private final egzh b;

    public cyjr(egzh egzhVar) {
        this.b = egzhVar;
    }

    @Override // defpackage.cfsb
    public final eiju l(String str, cevq cevqVar, cevq cevqVar2, int i) {
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            this.b.a(eork.i(null), new egyb("debug_tachyon_state_data_source"));
        }
        return eijx.e(null);
    }
}
