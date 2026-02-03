package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqk {
    public final boolean a;
    public final zqx b;
    public final zqy c;
    public final boolean d;

    public zqk() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqk)) {
            return false;
        }
        zqk zqkVar = (zqk) obj;
        return this.a == zqkVar.a && this.b == zqkVar.b && fdbq.f(this.c, zqkVar.c) && this.d == zqkVar.d;
    }

    public final int hashCode() {
        int iA = (zqj.a(this.a) * 31) + this.b.hashCode();
        zqy zqyVar = this.c;
        return (((iA * 31) + (zqyVar == null ? 0 : zqyVar.hashCode())) * 31) + zqj.a(this.d);
    }

    public final String toString() {
        return "MessageSelectionData(isSelected=" + this.a + ", selectionMode=" + this.b + ", offset=" + this.c + ", isOnFirstSelection=" + this.d + ")";
    }

    public zqk(boolean z, zqx zqxVar, zqy zqyVar, boolean z2) {
        zqxVar.getClass();
        this.a = z;
        this.b = zqxVar;
        this.c = zqyVar;
        this.d = z2;
    }

    public /* synthetic */ zqk(byte[] bArr) {
        this(false, zqx.a, null, false);
    }
}
