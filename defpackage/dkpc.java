package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkpc {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    public dkpc(int i, int i2, boolean z, boolean z2) {
        this.c = i;
        this.d = i2;
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkpc)) {
            return false;
        }
        dkpc dkpcVar = (dkpc) obj;
        return this.c == dkpcVar.c && this.d == dkpcVar.d && this.a == dkpcVar.a && this.b == dkpcVar.b;
    }

    public final int hashCode() {
        int i = this.c * 31;
        boolean z = this.b;
        return ((((i + this.d) * 31) + dkpb.a(this.a)) * 31) + dkpb.a(z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusUiData(state=");
        sb.append((Object) dkom.a(this.c));
        sb.append(", style=");
        int i = this.d;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "VOICE_MOOD" : "ON_BUBBLE" : "NO_CONTAINER" : "MEDIA"));
        sb.append(", isGemini=");
        sb.append(this.a);
        sb.append(", isAnimated=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
