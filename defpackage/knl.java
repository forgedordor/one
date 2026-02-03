package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knl {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;

    public knl() {
        this(false, false, 0, false, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knl)) {
            return false;
        }
        knl knlVar = (knl) obj;
        return this.a == knlVar.a && this.b == knlVar.b && this.f == knlVar.f && this.c == knlVar.c && this.d == knlVar.d;
    }

    public final int hashCode() {
        kod.a(this.f);
        return (((((((knk.a(this.a) * 31) + knk.a(this.b)) * 31) + 1) * 31) + knk.a(this.c)) * 31) + knk.a(this.d);
    }

    public /* synthetic */ knl(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2) {
        this.a = 1 == ((z ? 1 : 0) | (i2 & 1));
        this.b = (!((i2 & 2) == 0)) | z2;
        this.f = (((i2 & 4) != 0 ? 0 : 1) ^ 1) | i;
        this.c = (!((i2 & 8) == 0)) | z3;
        this.d = (!((i2 & 16) == 0)) | z4;
        this.e = "";
    }

    public /* synthetic */ knl(boolean z, int i) {
        this(1 == (i & 1), (i & 2) != 0, 1, (!((i & 4) == 0)) | z, true, 32);
    }
}
