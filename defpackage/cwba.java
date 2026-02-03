package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwba {
    public final dkpf a;
    public final fdae b;
    private final cwaz c;

    public cwba(dkpf dkpfVar, fdae fdaeVar, cwaz cwazVar) {
        this.a = dkpfVar;
        this.b = fdaeVar;
        this.c = cwazVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwba)) {
            return false;
        }
        cwba cwbaVar = (cwba) obj;
        return fdbq.f(this.a, cwbaVar.a) && fdbq.f(this.b, cwbaVar.b) && fdbq.f(this.c, cwbaVar.c);
    }

    public final int hashCode() {
        dkpf dkpfVar = this.a;
        return ((((dkpfVar == null ? 0 : dkpfVar.hashCode()) * 31) + this.b.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "AvatarUiData(avatar=" + this.a + ", onAvatarClick=" + this.b + ", flags=" + this.c + ")";
    }
}
