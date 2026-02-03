package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvvx extends dvwh {
    public final Uri a;
    public final ekgb b;
    public final String c;
    public final ekgb d;
    public final String e;
    public final int f;

    public dvvx(Uri uri, ekgb ekgbVar, String str, ekgb ekgbVar2, String str2, int i) {
        this.a = uri;
        this.b = ekgbVar;
        this.c = str;
        this.d = ekgbVar2;
        this.e = str2;
        this.f = i;
    }

    @Override // defpackage.dvwh
    public final int a() {
        return this.f;
    }

    @Override // defpackage.dvwh
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.dvwh
    public final ekgb c() {
        return this.b;
    }

    @Override // defpackage.dvwh
    public final ekgb d() {
        return this.d;
    }

    @Override // defpackage.dvwh
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ekgb ekgbVar;
        String str;
        ekgb ekgbVar2;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvwh) {
            dvwh dvwhVar = (dvwh) obj;
            if (this.a.equals(dvwhVar.b()) && ((ekgbVar = this.b) != null ? ekjz.h(ekgbVar, dvwhVar.c()) : dvwhVar.c() == null) && ((str = this.c) != null ? str.equals(dvwhVar.f()) : dvwhVar.f() == null) && ((ekgbVar2 = this.d) != null ? ekjz.h(ekgbVar2, dvwhVar.d()) : dvwhVar.d() == null) && ((str2 = this.e) != null ? str2.equals(dvwhVar.e()) : dvwhVar.e() == null)) {
                dvwhVar.h();
                if (this.f == dvwhVar.a()) {
                    dvwhVar.i();
                    dvwhVar.g();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dvwh
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        ekgb ekgbVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (ekgbVar == null ? 0 : ekgbVar.hashCode())) * 1000003;
        String str = this.c;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ekgb ekgbVar2 = this.d;
        int iHashCode4 = (iHashCode3 ^ (ekgbVar2 == null ? 0 : ekgbVar2.hashCode())) * 1000003;
        String str2 = this.e;
        return (((iHashCode4 ^ (str2 != null ? str2.hashCode() : 0)) * (-721379959)) ^ this.f) * (-721379959);
    }

    public final String toString() {
        ekgb ekgbVar = this.d;
        ekgb ekgbVar2 = this.b;
        return "QueryParams{tableUri=" + this.a.toString() + ", projection=" + String.valueOf(ekgbVar2) + ", selection=" + this.c + ", selectionArgs=" + String.valueOf(ekgbVar) + ", orderBy=" + this.e + ", groupBy=null, limit=" + this.f + ", offset=0, filterPredicate=null}";
    }

    @Override // defpackage.dvwh
    public final void g() {
    }

    @Override // defpackage.dvwh
    public final void h() {
    }

    @Override // defpackage.dvwh
    public final void i() {
    }
}
