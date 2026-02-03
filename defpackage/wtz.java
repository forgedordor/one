package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wtz {
    public final boolean a;
    public final boolean b;

    public wtz(vvw vvwVar) {
        vvwVar.getClass();
        boolean zA = vvwVar.a();
        boolean z = vvwVar.h;
        this.a = zA;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtz)) {
            return false;
        }
        wtz wtzVar = (wtz) obj;
        return this.a == wtzVar.a && this.b == wtzVar.b;
    }

    public final int hashCode() {
        return (wty.a(this.a) * 31) + wty.a(this.b);
    }

    public final String toString() {
        return "DraftInfo(isModified=" + this.a + ", isEncrypted=" + this.b + ")";
    }
}
