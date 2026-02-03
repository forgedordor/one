package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzhv implements dzhw {
    private final fejw a;
    private final boolean b;
    private final Instant c;

    private dzhv(fejw fejwVar, boolean z, Instant instant) {
        this.a = fejwVar;
        this.b = z;
        this.c = instant;
    }

    public static dzhv b(fejw fejwVar) {
        Instant instant = Instant.EPOCH;
        evvp evvpVar = fejwVar.e;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        Instant instantD = evwz.d(evvpVar);
        boolean z = false;
        for (fejt fejtVar : fejwVar.d) {
            evrj evrjVar = fejtVar.f;
            if (evrjVar == null) {
                evrjVar = evrj.a;
            }
            Instant instantPlus = instantD.plus(evwz.c(evrjVar));
            evrj evrjVar2 = fejtVar.g;
            if (evrjVar2 == null) {
                evrjVar2 = evrj.a;
            }
            Instant instantPlus2 = instantPlus.plus(evwz.c(evrjVar2));
            if (true == instantPlus2.isAfter(instant)) {
                instant = instantPlus2;
            }
            z |= !((fejtVar.b & 16) != 0);
        }
        return new dzhv(fejwVar, z, instant);
    }

    @Override // defpackage.dzhw
    public final long a() {
        return this.a.getSerializedSize();
    }

    @Override // defpackage.dzhw
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dzhv dzhvVar = (dzhv) obj;
        boolean z = dzhvVar.b;
        boolean z2 = this.b;
        return z2 != z ? !z2 ? 1 : -1 : dzhvVar.c.compareTo(this.c);
    }
}
