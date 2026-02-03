package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzr implements vzv {
    public final waa a;

    public vzr() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzr) && fdbq.f(this.a, ((vzr) obj).a);
    }

    public final int hashCode() {
        waa waaVar = this.a;
        if (waaVar == null) {
            return 0;
        }
        return waaVar.hashCode();
    }

    public final String toString() {
        return "SATELLITE(textCounterData=" + this.a + ")";
    }

    public vzr(waa waaVar) {
        this.a = waaVar;
    }

    public /* synthetic */ vzr(byte[] bArr) {
        this((waa) null);
    }
}
