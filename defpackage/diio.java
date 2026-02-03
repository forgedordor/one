package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diio implements diip {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    private final String e;
    private final fdap f;

    public diio(String str, int i, int i2, String str2, boolean z, fdap fdapVar) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.e = str2;
        this.d = z;
        this.f = fdapVar;
    }

    @Override // defpackage.diip
    public final int a() {
        return this.c;
    }

    @Override // defpackage.diip
    public final int b() {
        return this.b;
    }

    @Override // defpackage.diip
    public final /* bridge */ /* synthetic */ diip c(int i, int i2) {
        return new diio(this.a, i, i2, this.e, this.d, this.f);
    }

    @Override // defpackage.diip
    public final String d() {
        return this.e;
    }

    @Override // defpackage.diip
    public final fdap e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diio)) {
            return false;
        }
        diio diioVar = (diio) obj;
        return fdbq.f(this.a, diioVar.a) && this.b == diioVar.b && this.c == diioVar.c && fdbq.f(this.e, diioVar.e) && this.d == diioVar.d && fdbq.f(this.f, diioVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = (((((((iHashCode + this.b) * 31) + this.c) * 31) + (str == null ? 0 : str.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31;
        fdap fdapVar = this.f;
        return iHashCode2 + (fdapVar != null ? fdapVar.hashCode() : 0);
    }

    public final String toString() {
        return "Url(url=" + this.a + ", start=" + this.b + ", end=" + this.c + ", onClickLabel=" + this.e + ", usePrimaryColor=" + this.d + ", onClick=" + this.f + ")";
    }

    public /* synthetic */ diio(String str, int i, int i2, fdap fdapVar, int i3) {
        this(str, i, i2, null, (i3 & 16) != 0, (i3 & 32) != 0 ? null : fdapVar);
    }
}
