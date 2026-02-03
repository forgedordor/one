package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsw {
    public final eve a;
    public final eve b;
    public final eve c;

    public fsw() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsw)) {
            return false;
        }
        fsw fswVar = (fsw) obj;
        return fdbq.f(this.a, fswVar.a) && fdbq.f(this.b, fswVar.b) && fdbq.f(this.c, fswVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }

    public /* synthetic */ fsw(byte[] bArr) {
        evm evmVarB = evn.b(4.0f);
        evm evmVarB2 = evn.b(4.0f);
        evm evmVarB3 = evn.b(0.0f);
        this.a = evmVarB;
        this.b = evmVarB2;
        this.c = evmVarB3;
    }
}
