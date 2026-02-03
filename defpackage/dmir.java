package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmir extends dmiu {
    public final dofn a;

    public dmir() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmir) && fdbq.f(this.a, ((dmir) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Full(aspectRatio=" + this.a + ")";
    }

    public /* synthetic */ dmir(byte[] bArr) {
        dofn dofnVar = new dofn(3, 4);
        super(true);
        this.a = dofnVar;
    }
}
