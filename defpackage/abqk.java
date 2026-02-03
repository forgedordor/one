package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqk implements abqj {
    public static final cczv a = cdag.q(182938103, "ditto_satellite_use_messageport_transport_switch_2");
    private final abqz b;
    private final abqd c;

    public abqk(cqtp cqtpVar, abqz abqzVar, abre abreVar, eosc eoscVar) {
        this.b = abqzVar;
        this.c = new abqd(cqtpVar, eoscVar, abreVar);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        return ((Boolean) a.e()).booleanValue() ? this.b : this.c;
    }
}
