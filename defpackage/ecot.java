package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecot extends ecpg {
    public final ContentValues a;
    public final ekgb b;
    public final ekgb c;
    public final String d;
    public final ecpe e;

    public ecot(ContentValues contentValues, ekgb ekgbVar, ekgb ekgbVar2, String str, ecpe ecpeVar) {
        this.a = contentValues;
        this.b = ekgbVar;
        this.c = ekgbVar2;
        this.d = str;
        this.e = ecpeVar;
    }

    @Override // defpackage.ecpg
    public final ContentValues a() {
        return this.a;
    }

    @Override // defpackage.ecpg
    public final ecpe b() {
        return this.e;
    }

    @Override // defpackage.ecpg
    public final ekgb c() {
        return this.b;
    }

    @Override // defpackage.ecpg
    public final ekgb d() {
        return this.c;
    }

    @Override // defpackage.ecpg
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        ecpe ecpeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecpg) {
            ecpg ecpgVar = (ecpg) obj;
            if (this.a.equals(ecpgVar.a()) && ekjz.h(this.b, ecpgVar.c()) && ekjz.h(this.c, ecpgVar.d()) && ((str = this.d) != null ? str.equals(ecpgVar.e()) : ecpgVar.e() == null) && ((ecpeVar = this.e) != null ? ecpeVar.equals(ecpgVar.b()) : ecpgVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        String str = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ecpe ecpeVar = this.e;
        return iHashCode2 ^ (ecpeVar != null ? ecpeVar.hashCode() : 0);
    }

    public final String toString() {
        ecpe ecpeVar = this.e;
        ekgb ekgbVar = this.c;
        ekgb ekgbVar2 = this.b;
        return "Mms{values=" + this.a.toString() + ", addresses=" + ekgbVar2.toString() + ", attachments=" + ekgbVar.toString() + ", smil=" + this.d + ", body=" + String.valueOf(ecpeVar) + "}";
    }
}
