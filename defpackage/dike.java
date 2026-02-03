package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dike {
    public final Object a;
    public final fdae b;
    public final fdae c;

    public dike(Object obj, fdae fdaeVar, fdae fdaeVar2) {
        this.a = obj;
        this.b = fdaeVar;
        this.c = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dike)) {
            return false;
        }
        dike dikeVar = (dike) obj;
        return fdbq.f(this.a, dikeVar.a) && fdbq.f(this.b, dikeVar.b) && fdbq.f(this.c, dikeVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AttachmentRenderListener(key=" + this.a + ", onRenderSucceeded=" + this.b + ", onRenderFailed=" + this.c + ")";
    }
}
