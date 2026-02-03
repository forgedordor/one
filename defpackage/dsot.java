package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsot {
    public final String a;
    private final String b;
    private final String c;
    private final dsou d;
    private final dsou e;
    private final boolean f;
    private final dsos g;
    private final int h = 1;
    private final int i = 3;
    private final int j;

    public dsot(String str, String str2, String str3, dsou dsouVar, dsou dsouVar2, boolean z, int i, dsos dsosVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dsouVar;
        this.e = dsouVar2;
        this.f = z;
        this.j = i;
        this.g = dsosVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsot)) {
            return false;
        }
        dsot dsotVar = (dsot) obj;
        int i = dsotVar.h;
        if (!fdbq.f(this.a, dsotVar.a) || !fdbq.f(this.b, dsotVar.b) || !fdbq.f(this.c, dsotVar.c) || !fdbq.f(this.d, dsotVar.d) || !fdbq.f(this.e, dsotVar.e)) {
            return false;
        }
        int i2 = dsotVar.i;
        return this.f == dsotVar.f && this.j == dsotVar.j && fdbq.f(this.g, dsotVar.g);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() + 31) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        dsos dsosVar = this.g;
        return (((((((iHashCode * 31) + 3) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.j) * 31) + (dsosVar == null ? 0 : dsosVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionData(type=TOOLTIP, key=");
        sb.append(this.a);
        sb.append(", body=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", lightColors=");
        sb.append(this.d);
        sb.append(", darkColors=");
        sb.append(this.e);
        sb.append(", theme=AUTO, useCustomColors=");
        sb.append(this.f);
        sb.append(", placement=");
        int i = this.j;
        sb.append((Object) (i != 1 ? i != 2 ? "BELOW" : "ABOVE" : "UNKNOWN"));
        sb.append(", action=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
