package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espu extends espz {
    private final String a;
    private final int b;
    private final int c;

    public espu(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("Null host");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.espz
    public final int a() {
        return this.c;
    }

    @Override // defpackage.espz
    public final int b() {
        return this.b;
    }

    @Override // defpackage.espz
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof espz) {
            espz espzVar = (espz) obj;
            if (this.a.equals(espzVar.c()) && this.b == espzVar.b() && this.c == espzVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "QuicHint{host=" + this.a + ", port=" + this.b + ", alternatePort=" + this.c + "}";
    }
}
