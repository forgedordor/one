package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egj {
    public float a;
    public boolean b;
    public edx c;
    private eej d;

    public egj() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egj)) {
            return false;
        }
        egj egjVar = (egj) obj;
        if (Float.compare(this.a, egjVar.a) != 0 || this.b != egjVar.b || !fdbq.f(this.c, egjVar.c)) {
            return false;
        }
        eej eejVar = egjVar.d;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        int i = true != this.b ? 1237 : 1231;
        edx edxVar = this.c;
        return (((iFloatToIntBits + i) * 31) + (edxVar == null ? 0 : edxVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }

    public /* synthetic */ egj(byte[] bArr) {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
        this.d = null;
    }
}
