package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sow extends spd {
    private final String a;
    private final int b;
    private final float c;

    public sow(String str, int i, float f) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
        this.b = i;
        this.c = f;
    }

    @Override // defpackage.spd
    public final float a() {
        return this.c;
    }

    @Override // defpackage.spd
    public final int b() {
        return this.b;
    }

    @Override // defpackage.spd
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spd) {
            spd spdVar = (spd) obj;
            if (this.a.equals(spdVar.c()) && this.b == spdVar.b() && Float.floatToIntBits(this.c) == Float.floatToIntBits(spdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "Rewrite{text=" + this.a + ", tone=" + this.b + ", score=" + this.c + "}";
    }
}
