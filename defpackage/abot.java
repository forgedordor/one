package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class abot implements abpy {
    protected final abou a;
    final /* synthetic */ abpk b;

    public abot(abpk abpkVar, abou abouVar) {
        this.b = abpkVar;
        this.a = abouVar;
    }

    private final void c(String str, abto abtoVar) {
        abpg abpgVar;
        synchronized (abpk.b) {
            abpgVar = (abpg) this.b.i.get(this.a);
        }
        if (abpgVar == null || abpgVar.g() || !abpgVar.d().equals(abtoVar)) {
            abpk.a.p("Ignoring message from paused or closed JsBridgeChannel");
            return;
        }
        cqbd cqbdVarC = abpk.a.c();
        cqbdVarC.I("Received message from Ditto");
        cqbdVarC.y("length", str != null ? str.length() : 0);
        cqbdVarC.r();
        a(str, abpgVar);
    }

    public abstract void a(String str, abpg abpgVar);

    @Override // defpackage.abpy
    public final void b(String str, abto abtoVar) {
        if (!((Boolean) ((cczi) abpk.c.get()).e()).booleanValue()) {
            c(str, abtoVar);
            return;
        }
        eieh eiehVarC = this.b.h.c("JsBridgeManager onMessage", "com/google/android/apps/messaging/dittosatellite/jsbridge/JsBridgeManager$BaseJsBridgeTransportListener", "onMessage", 583);
        try {
            c(str, abtoVar);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
