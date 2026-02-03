package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzag {
    private final aukz a;
    private final cogw b;

    public bzag(aukz aukzVar, cogw cogwVar) {
        this.a = aukzVar;
        this.b = cogwVar;
    }

    public final cani a(cani caniVar) {
        canh canhVar = (canh) caniVar.toBuilder();
        evvp evvpVarC = evxc.c(this.b.f().toEpochMilli());
        canhVar.copyOnWrite();
        cani caniVar2 = (cani) canhVar.instance;
        evvpVarC.getClass();
        caniVar2.g = evvpVarC;
        caniVar2.b |= 32;
        return (cani) canhVar.build();
    }

    public final void b(cbcw cbcwVar, emdn emdnVar, cani caniVar) {
        if ((caniVar.b & 32) != 0) {
            evvp evvpVar = caniVar.g;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            evvp evvpVarC = evxc.c(this.b.f().toEpochMilli());
            if (cbcwVar.e() && cbcwVar.c() == null) {
                this.a.v(emdnVar, evvpVar, evvpVarC, 2);
            } else {
                if (cbcwVar.e() || cbcwVar.f()) {
                    return;
                }
                this.a.v(emdnVar, evvpVar, evvpVarC, 3);
            }
        }
    }

    public final void c(emdn emdnVar, cani caniVar, int i) {
        if ((caniVar.b & 32) != 0) {
            aukz aukzVar = this.a;
            evvp evvpVar = caniVar.g;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            aukzVar.v(emdnVar, evvpVar, evxc.c(this.b.f().toEpochMilli()), i);
        }
    }
}
