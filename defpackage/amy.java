package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amy implements bpu {
    final /* synthetic */ aqm a;
    final /* synthetic */ anm b;

    public amy(anm anmVar, aqm aqmVar) {
        this.b = anmVar;
        this.a = aqmVar;
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        anm anmVar = this.b;
        anmVar.n.remove(this.a);
        int i = anmVar.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 1 && i2 != 5) {
            if (i2 != 6 && (i2 != 7 || anmVar.i == 0)) {
                return;
            } else {
                anmVar.q("Camera reopen required. Checking if the current camera can be closed safely.");
            }
        }
        if (!anmVar.J() || anmVar.h == null) {
            return;
        }
        anmVar.q("closing camera");
        anmVar.h.close();
        anmVar.h = null;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
    }
}
