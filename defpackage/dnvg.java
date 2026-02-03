package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvg implements dojv, dohp {
    public static final Parcelable.Creator<dnvg> CREATOR = new dnvf();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final dohm e;
    public final String f;
    public final int g;
    public final int h;
    public final dltc i;
    private final Map j;
    private final long k;
    private final Instant l;

    public /* synthetic */ dnvg(String str, String str2, String str3, boolean z, dohm dohmVar, Map map, String str4, int i, int i2, long j, Instant instant, dltc dltcVar, int i3) {
        dltc dnvrVar;
        dohm dohmVar2 = (i3 & 16) != 0 ? dohd.a : dohmVar;
        Map map2 = (i3 & 32) != 0 ? null : map;
        String str5 = (i3 & 64) != 0 ? null : str4;
        int i4 = (i3 & 128) != 0 ? 512 : i;
        int i5 = (i3 & 256) == 0 ? i2 : 512;
        long j2 = (i3 & 512) != 0 ? 0L : j;
        Instant instant2 = (i3 & 1024) != 0 ? Instant.EPOCH : instant;
        boolean z2 = ((i3 & 8) == 0) & z;
        if ((i3 & 2048) != 0) {
            dokg dokgVar = (dokg) dokj.a.createBuilder();
            dokgVar.getClass();
            if (z2) {
                dokh dokhVar = (dokh) doki.a.createBuilder();
                dokhVar.getClass();
                dokz.c(dola.a(dokhVar), dokgVar);
            } else {
                doke dokeVar = (doke) dokf.a.createBuilder();
                dokeVar.getClass();
                dokz.b(doky.a(dokeVar), dokgVar);
            }
            dnvrVar = new dnvr(dokz.a(dokgVar));
        } else {
            dnvrVar = dltcVar;
        }
        String str6 = (i3 & 4) == 0 ? str3 : null;
        str.getClass();
        str2.getClass();
        dohmVar2.getClass();
        instant2.getClass();
        dnvrVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str6;
        this.d = z2;
        this.e = dohmVar2;
        this.j = map2;
        this.f = str5;
        this.g = i4;
        this.h = i5;
        this.k = j2;
        this.l = instant2;
        this.i = dnvrVar;
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final long a() {
        return this.k;
    }

    @Override // defpackage.dojw, defpackage.dohq, defpackage.dltn
    public final /* synthetic */ doig b() {
        return dojn.a(this);
    }

    @Override // defpackage.dltn
    public final Instant c() {
        return this.l;
    }

    @Override // defpackage.dltn
    public final String d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.dltn
    public final /* synthetic */ String e() {
        return dltj.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnvg)) {
            return false;
        }
        dnvg dnvgVar = (dnvg) obj;
        return fdbq.f(this.a, dnvgVar.a) && fdbq.f(this.b, dnvgVar.b) && fdbq.f(this.c, dnvgVar.c) && this.d == dnvgVar.d && fdbq.f(this.e, dnvgVar.e) && fdbq.f(this.j, dnvgVar.j) && fdbq.f(this.f, dnvgVar.f) && this.g == dnvgVar.g && this.h == dnvgVar.h && this.k == dnvgVar.k && fdbq.f(this.l, dnvgVar.l) && fdbq.f(this.i, dnvgVar.i);
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dltd
    public final dltc fo() {
        return this.i;
    }

    @Override // defpackage.dlti
    public final /* bridge */ /* synthetic */ Object fp() {
        return e();
    }

    @Override // defpackage.dltd
    public final /* synthetic */ String fq() {
        return toString();
    }

    @Override // defpackage.dohp
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode()) * 31;
        Map map = this.j;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode4 = (((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        long j = this.k;
        return ((((iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31) + this.l.hashCode()) * 31) + this.i.hashCode();
    }

    @Override // defpackage.dohp
    public final int j() {
        return this.g;
    }

    @Override // defpackage.dohq
    public final /* synthetic */ dogj l() {
        return this.e;
    }

    @Override // defpackage.dohq, defpackage.dohs
    public final /* synthetic */ doif m() {
        return dohn.a(this);
    }

    @Override // defpackage.dohq
    public final /* synthetic */ doin n() {
        return doin.d;
    }

    @Override // defpackage.dohq
    public final Map o() {
        return this.j;
    }

    public final String toString() {
        return "CustomSticker(id=" + this.a + ", url=" + this.b + ", originId=" + this.c + ", selfOwned=" + this.d + ", format=" + this.e + ", headers=" + this.j + ", displayName=" + this.f + ", widthPx=" + this.g + ", heightPx=" + this.h + ", sizeBytes=" + this.k + ", dateModified=" + this.l + ", source=" + this.i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
}
