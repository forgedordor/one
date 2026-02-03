package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vsy implements dnhn {
    public final vvl a;

    public vsy(vvl vvlVar) {
        this.a = vvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsy) && fdbq.f(this.a, ((vsy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddPacket(attachmentId=" + this.a + ")";
    }
}
