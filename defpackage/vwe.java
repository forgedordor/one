package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwe implements vwf {
    public final xhh a;

    public vwe() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwe) && fdbq.f(this.a, ((vwe) obj).a);
    }

    public final int hashCode() {
        return this.a == null ? 0 : -1654225729;
    }

    public final String toString() {
        return "Shortcuts(selected=" + this.a + ")";
    }

    public vwe(xhh xhhVar) {
        this.a = xhhVar;
    }

    public /* synthetic */ vwe(byte[] bArr) {
        this((xhh) null);
    }
}
