package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdvb implements fdus {
    public final long a;
    private final long b = Long.MAX_VALUE;

    public fdvb(long j) {
        this.a = j;
    }

    @Override // defpackage.fdus
    public final fdpl a(fdvc fdvcVar) {
        fduz fduzVar = new fduz(this, null);
        int i = fdsn.a;
        return fdqq.a(new fdrn(new fdwg(fduzVar, fdvcVar), new fdva(null)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fdvb)) {
            return false;
        }
        fdvb fdvbVar = (fdvb) obj;
        if (this.a != fdvbVar.a) {
            return false;
        }
        long j = fdvbVar.b;
        return true;
    }

    public final int hashCode() {
        return (fduy.a(this.a) * 31) + fduy.a(Long.MAX_VALUE);
    }

    public final String toString() {
        fcww fcwwVar = new fcww(2);
        long j = this.a;
        if (j > 0) {
            fcwwVar.add(a.A(j, "stopTimeout=", "ms"));
        }
        return "SharingStarted.WhileSubscribed(" + fcva.aF(fcva.a(fcwwVar), null, null, null, null, 63) + ")";
    }
}
