package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahes {
    public final String a;
    public final dkpf b;

    public ahes(String str, dkpf dkpfVar) {
        this.a = str;
        this.b = dkpfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahes)) {
            return false;
        }
        ahes ahesVar = (ahes) obj;
        return fdbq.f(this.a, ahesVar.a) && fdbq.f(this.b, ahesVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SendingAsUiData(name=" + this.a + ", photoMonogram=" + this.b + ")";
    }
}
