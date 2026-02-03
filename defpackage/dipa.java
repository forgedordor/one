package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipa {
    public final dihd a;
    public final fdae b;
    public final fdae c;
    public final boolean d;

    public dipa(dihd dihdVar, fdae fdaeVar, fdae fdaeVar2, boolean z) {
        fdaeVar.getClass();
        fdaeVar2.getClass();
        this.a = dihdVar;
        this.b = fdaeVar;
        this.c = fdaeVar2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dipa)) {
            return false;
        }
        dipa dipaVar = (dipa) obj;
        return fdbq.f(this.a, dipaVar.a) && fdbq.f(this.b, dipaVar.b) && fdbq.f(this.c, dipaVar.c) && this.d == dipaVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "ComposeAttachmentBubbleUiData(onRemoveCallback=" + this.a + ", onClick=" + this.b + ", onMagicEdit=" + this.c + ", useMagicEdit=" + this.d + ")";
    }
}
