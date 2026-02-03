package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndm extends dndq {
    private final int a;
    private final int b;
    private final Object c;

    public dndm(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }

    @Override // defpackage.dndq
    public final void a(vo voVar) {
        voVar.v(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dndm)) {
            return false;
        }
        dndm dndmVar = (dndm) obj;
        return this.a == dndmVar.a && this.b == dndmVar.b && fdbq.f(this.c, dndmVar.c);
    }

    public final int hashCode() {
        Object obj = this.c;
        return (((this.a * 31) + this.b) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Changed(position=" + this.a + ", count=" + this.b + ", payload=" + this.c + ")";
    }
}
