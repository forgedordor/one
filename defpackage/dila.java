package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dila implements dilc {
    public final String a;
    public final String b;
    public final dkpc c;
    public final boolean d;
    public final dike e;
    public final int f;
    private final String g;

    public /* synthetic */ dila(int i, String str, String str2, String str3, dkpc dkpcVar, boolean z, dike dikeVar, int i2) {
        str.getClass();
        str3.getClass();
        this.f = i;
        this.a = str;
        this.b = str2;
        this.g = str3;
        this.c = (i2 & 16) != 0 ? null : dkpcVar;
        this.d = ((i2 & 32) == 0) & z;
        this.e = (i2 & 64) != 0 ? null : dikeVar;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dila)) {
            return false;
        }
        dila dilaVar = (dila) obj;
        return this.f == dilaVar.f && fdbq.f(this.a, dilaVar.a) && fdbq.f(this.b, dilaVar.b) && fdbq.f(this.g, dilaVar.g) && fdbq.f(this.c, dilaVar.c) && this.d == dilaVar.d && fdbq.f(this.e, dilaVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f * 31) + this.a.hashCode();
        String str = this.b;
        int iHashCode2 = ((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.g.hashCode()) * 31;
        dkpc dkpcVar = this.c;
        int iHashCode3 = (((iHashCode2 + (dkpcVar == null ? 0 : dkpcVar.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31;
        dike dikeVar = this.e;
        return iHashCode3 + (dikeVar != null ? dikeVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loaded(fileType=");
        int i = this.f;
        sb.append((Object) (i != 1 ? i != 2 ? "GENERIC_FILE" : "CALENDAR" : "PDF"));
        sb.append(", title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", contentDescription=");
        sb.append(this.g);
        sb.append(", statusUiData=");
        sb.append(this.c);
        sb.append(", disableNewTimestampsForTalkback=");
        sb.append(this.d);
        sb.append(", renderListener=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
