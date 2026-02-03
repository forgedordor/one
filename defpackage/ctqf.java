package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctqf implements ctqg {
    public final String a;
    public final fdae b;
    public final ctrb c;

    public ctqf(String str, fdae fdaeVar, ctrb ctrbVar) {
        this.a = str;
        this.b = fdaeVar;
        this.c = ctrbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctqf)) {
            return false;
        }
        ctqf ctqfVar = (ctqf) obj;
        return fdbq.f(this.a, ctqfVar.a) && fdbq.f(this.b, ctqfVar.b) && fdbq.f(this.c, ctqfVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ButtonEmergencyRowUiData(text=" + this.a + ", onClick=" + this.b + ", flags=" + this.c + ")";
    }
}
