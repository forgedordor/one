package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhbb implements dfzi, dgft {
    private final ewfq a;
    private final dfyj b;
    private final dfyd c;
    private final dgfs d;

    public dhbb(ewfq ewfqVar, dfyj dfyjVar, dfyd dfydVar, dgfs dgfsVar) {
        this.a = ewfqVar;
        this.b = dfyjVar;
        this.c = dfydVar;
        this.d = dgfsVar;
    }

    private final void d(int i) {
        this.b.t.remove(this);
        ewfn ewfnVar = (ewfn) this.a.toBuilder();
        ewfnVar.copyOnWrite();
        ((ewfq) ewfnVar.instance).g = ewfo.a(i);
        ewfq ewfqVar = (ewfq) ewfnVar.build();
        dhja.o("FCM tickle processed. Reporting uptime", new Object[0]);
        dfyd dfydVar = this.c;
        dfydVar.d.g(dfydVar.c, ewfqVar, (ewfu) dfydVar.a().build());
        this.d.g(this);
    }

    @Override // defpackage.dgft
    public final void a() {
        dhja.c("Keep alive response received after processing FCM tickle. Logging client state and cleaning up listeners", new Object[0]);
        d(6);
    }

    @Override // defpackage.dgft
    public final void b() {
        dhja.c("Keep alive response timeout after processing FCM tickle. Cleaning up FcmTickleKeepAliveListener.", new Object[0]);
        this.d.g(this);
    }

    @Override // defpackage.dgft
    public final void c() {
        dhja.c("Failed to send keep alive after processing FCM tickle. Cleaning up FcmTickleKeepAliveListener", new Object[0]);
        this.d.g(this);
    }

    @Override // defpackage.dfzi
    public final void g(dezf dezfVar) {
        dhja.c("Registration failed after processing FCM tickle. Logging client state and cleaning up listeners", new Object[0]);
        d(5);
    }

    @Override // defpackage.dfzi
    public final void h() {
        dhja.c("Registration successful after processing FCM tickle. Logging client state and cleaning up listeners", new Object[0]);
        d(4);
    }

    @Override // defpackage.dfzi
    public final void i(dezf dezfVar) {
        dhja.c("Registration terminated after processing FCM tickle", new Object[0]);
    }
}
