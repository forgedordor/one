package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diim implements diip {
    public final String a;
    public final String b;
    public final fdap c;
    private final int d;
    private final String e;
    private final int f;
    private final int g;

    public diim(String str, String str2, int i, fdap fdapVar) {
        this.a = str;
        this.b = str2;
        this.d = i;
        this.e = null;
        this.c = fdapVar;
        this.f = i;
        this.g = i;
    }

    @Override // defpackage.diip
    public final int a() {
        return this.g;
    }

    @Override // defpackage.diip
    public final int b() {
        return this.f;
    }

    @Override // defpackage.diip
    public final /* bridge */ /* synthetic */ diip c(int i, int i2) {
        return new diim(this.a, this.b, i, this.c);
    }

    @Override // defpackage.diip
    public final String d() {
        return null;
    }

    @Override // defpackage.diip
    public final fdap e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diim)) {
            return false;
        }
        diim diimVar = (diim) obj;
        if (!fdbq.f(this.a, diimVar.a) || !fdbq.f(this.b, diimVar.b) || this.d != diimVar.d) {
            return false;
        }
        String str = diimVar.e;
        return fdbq.f(null, null) && fdbq.f(this.c, diimVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.d;
        fdap fdapVar = this.c;
        return ((iHashCode2 + i) * 961) + (fdapVar != null ? fdapVar.hashCode() : 0);
    }

    public final String toString() {
        return "Image(url=" + this.a + ", contentDescription=" + this.b + ", position=" + this.d + ", onClickLabel=null, onClick=" + this.c + ")";
    }

    public /* synthetic */ diim(String str, String str2, int i, fdap fdapVar, int i2) {
        this(str, str2, i, (i2 & 16) != 0 ? null : fdapVar);
    }
}
