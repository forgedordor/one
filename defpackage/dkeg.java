package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkeg implements djvp {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final Integer e;
    public final dkdm f;
    public final dkdm g;
    public final fdae h;

    public /* synthetic */ dkeg(String str, String str2, String str3, List list, Integer num, dkdm dkdmVar, dkdm dkdmVar2, fdae fdaeVar, int i) {
        list = (i & 8) != 0 ? fcvo.a : list;
        int i2 = i & 2;
        str3 = (i & 4) != 0 ? null : str3;
        str2 = i2 != 0 ? null : str2;
        num = (i & 16) != 0 ? null : num;
        dkdmVar = (i & 32) != 0 ? null : dkdmVar;
        dkdmVar2 = (i & 64) != 0 ? null : dkdmVar2;
        fdaeVar = (i & 128) != 0 ? null : fdaeVar;
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = num;
        this.f = dkdmVar;
        this.g = dkdmVar2;
        this.h = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkeg)) {
            return false;
        }
        dkeg dkegVar = (dkeg) obj;
        return fdbq.f(this.a, dkegVar.a) && fdbq.f(this.b, dkegVar.b) && fdbq.f(this.c, dkegVar.c) && fdbq.f(this.d, dkegVar.d) && fdbq.f(this.e, dkegVar.e) && fdbq.f(this.f, dkegVar.f) && fdbq.f(this.g, dkegVar.g) && fdbq.f(this.h, dkegVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d.hashCode()) * 31;
        Integer num = this.e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        dkdm dkdmVar = this.f;
        int iHashCode5 = (iHashCode4 + (dkdmVar == null ? 0 : dkdmVar.hashCode())) * 31;
        dkdm dkdmVar2 = this.g;
        int iHashCode6 = (iHashCode5 + (dkdmVar2 == null ? 0 : dkdmVar2.hashCode())) * 31;
        fdae fdaeVar = this.h;
        return iHashCode6 + (fdaeVar != null ? fdaeVar.hashCode() : 0);
    }

    public final String toString() {
        return "TextListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", overline=" + this.c + ", annotations=" + this.d + ", count=" + this.e + ", startDecoration=" + this.f + ", endDecoration=" + this.g + ", onClick=" + this.h + ")";
    }
}
