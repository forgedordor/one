package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diin implements diip {
    public final dijs a;
    public final int b;
    public final int c;
    private final String d;
    private final fdap e;

    public diin(dijs dijsVar, int i, int i2, String str, fdap fdapVar) {
        dijsVar.getClass();
        this.a = dijsVar;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = fdapVar;
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
        return new diin(this.a, i, i2, this.d, this.e);
    }

    @Override // defpackage.diip
    public final String d() {
        return this.d;
    }

    @Override // defpackage.diip
    public final fdap e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diin)) {
            return false;
        }
        diin diinVar = (diin) obj;
        return this.a == diinVar.a && this.b == diinVar.b && this.c == diinVar.c && fdbq.f(this.d, diinVar.d) && fdbq.f(this.e, diinVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.d;
        int iHashCode2 = (((((iHashCode + this.b) * 31) + this.c) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        fdap fdapVar = this.e;
        return iHashCode2 + (fdapVar != null ? fdapVar.hashCode() : 0);
    }

    public final String toString() {
        return "Standard(type=" + this.a + ", start=" + this.b + ", end=" + this.c + ", onClickLabel=" + this.d + ", onClick=" + this.e + ")";
    }

    public /* synthetic */ diin(dijs dijsVar, int i, int i2, fdap fdapVar, int i3) {
        this(dijsVar, i, i2, (String) null, (i3 & 16) != 0 ? null : fdapVar);
    }
}
