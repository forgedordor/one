package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epj {
    public final fdap a;
    public final eqx b;
    public eqw c;
    public int d;
    public int e;
    public int f;

    public epj() {
        this(null);
    }

    public final epi a(int i, long j, boolean z, fdap fdapVar) {
        eqw eqwVar = this.c;
        if (eqwVar == null) {
            return emw.a;
        }
        eqx eqxVar = this.b;
        eqz eqzVar = eqwVar.c;
        boolean z2 = eqzVar instanceof erc;
        eqv eqvVar = new eqv(eqwVar, i, j, eqxVar, z2 ? (erc) eqzVar : null, fdapVar);
        if (!z2) {
            eqzVar.c(eqvVar);
        } else if (z) {
            ((erc) eqzVar).a(eqvVar);
        } else {
            ((erc) eqzVar).b(eqvVar);
        }
        kjv.a("compose:lazy:schedule_prefetch:index", i);
        return eqvVar;
    }

    public epj(fdap fdapVar) {
        this.a = fdapVar;
        this.b = new eqx();
        this.d = -1;
        this.e = -1;
    }
}
