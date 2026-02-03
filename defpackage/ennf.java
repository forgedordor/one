package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ennf {
    public final ennc a;

    public ennf(ennc enncVar) {
        this.a = enncVar;
    }

    public final /* synthetic */ ennd a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (ennd) evsnVarBuild;
    }

    public final void b(int i) {
        ennc enncVar = this.a;
        enncVar.copyOnWrite();
        ennd enndVar = (ennd) enncVar.instance;
        ennd enndVar2 = ennd.a;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        enndVar.g = i - 2;
        enndVar.b |= 1;
    }
}
