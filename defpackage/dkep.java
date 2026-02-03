package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkep implements djvp {
    public final String a;
    public final String b;
    public final fdae c;
    public final fdap d;
    public final int e;

    public dkep(String str, String str2, fdae fdaeVar, fdap fdapVar, int i) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = fdaeVar;
        this.d = fdapVar;
        this.e = i;
    }

    public static /* synthetic */ dkep a(dkep dkepVar, String str, fdae fdaeVar, fdap fdapVar, int i) {
        String str2 = (i & 1) != 0 ? dkepVar.a : null;
        if ((i & 2) != 0) {
            str = dkepVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            fdaeVar = dkepVar.c;
        }
        fdae fdaeVar2 = fdaeVar;
        if ((i & 8) != 0) {
            fdapVar = dkepVar.d;
        }
        fdap fdapVar2 = fdapVar;
        int i2 = dkepVar.e;
        str2.getClass();
        str3.getClass();
        fdapVar2.getClass();
        return new dkep(str2, str3, fdaeVar2, fdapVar2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkep)) {
            return false;
        }
        dkep dkepVar = (dkep) obj;
        return fdbq.f(this.a, dkepVar.a) && fdbq.f(this.b, dkepVar.b) && fdbq.f(this.c, dkepVar.c) && fdbq.f(this.d, dkepVar.d) && this.e == dkepVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        fdae fdaeVar = this.c;
        return (((((iHashCode * 31) + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldListItemUiData(hint=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", onTextCleared=");
        sb.append(this.c);
        sb.append(", onTextChange=");
        sb.append(this.d);
        sb.append(", keyboardType=");
        sb.append((Object) (this.e != 1 ? "TEXT" : "PHONE"));
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dkep(String str, String str2, fdae fdaeVar, fdap fdapVar) {
        this(str, str2, fdaeVar, fdapVar, 2);
    }
}
