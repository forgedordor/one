package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clfl {
    public final ecjh a;
    public final egzh b;
    private final egyt c;
    private final eosc d;

    public clfl(ecjh ecjhVar, eosc eoscVar, egyt egytVar, egzh egzhVar) {
        this.a = ecjhVar;
        this.d = eoscVar;
        this.c = egytVar;
        this.b = egzhVar;
    }

    public final egyi a() {
        return new egys(this.c, new eopk() { // from class: clfh
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                return new eopy(this.a.b());
            }
        }, "reminder_settings_data_service");
    }

    public final eiju b() {
        return eiju.g(this.a.a()).h(new ejvr() { // from class: clfk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                clfg clfgVar = (clfg) obj;
                return Boolean.valueOf(clfgVar.c ? clfgVar.d : ((Boolean) czwc.e.e()).booleanValue());
            }
        }, this.d);
    }
}
