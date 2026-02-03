package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dojr implements dojv, dohp {
    public static final Parcelable.Creator<dojr> CREATOR = new dojq();
    public final dohm a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final Instant f;
    public final dltc g;
    private final Map h;
    private final long i;

    public dojr(dohm dohmVar, String str, Map map, String str2, int i, int i2, long j, Instant instant, dltc dltcVar) {
        dohmVar.getClass();
        str.getClass();
        instant.getClass();
        dltcVar.getClass();
        this.a = dohmVar;
        this.b = str;
        this.h = map;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.i = j;
        this.f = instant;
        this.g = dltcVar;
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final long a() {
        return this.i;
    }

    @Override // defpackage.dojw, defpackage.dohq, defpackage.dltn
    public final /* synthetic */ doig b() {
        return dojn.a(this);
    }

    @Override // defpackage.dltn
    public final Instant c() {
        return this.f;
    }

    @Override // defpackage.dltn
    public final String d() {
        return this.c;
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
        if (!(obj instanceof dojr)) {
            return false;
        }
        dojr dojrVar = (dojr) obj;
        return fdbq.f(this.a, dojrVar.a) && fdbq.f(this.b, dojrVar.b) && fdbq.f(this.h, dojrVar.h) && fdbq.f(this.c, dojrVar.c) && this.d == dojrVar.d && this.e == dojrVar.e && this.i == dojrVar.i && fdbq.f(this.f, dojrVar.f) && fdbq.f(this.g, dojrVar.g);
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dltd
    public final dltc fo() {
        return this.g;
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
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Map map = this.h;
        int iHashCode2 = ((iHashCode * 31) + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31;
        long j = this.i;
        return ((((iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    @Override // defpackage.dohp
    public final int j() {
        return this.d;
    }

    @Override // defpackage.dohq
    public final /* synthetic */ dogj l() {
        return this.a;
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
        return this.h;
    }

    public final String toString() {
        return "Image(format=" + this.a + ", url=" + this.b + ", headers=" + this.h + ", displayName=" + this.c + ", widthPx=" + this.d + ", heightPx=" + this.e + ", sizeBytes=" + this.i + ", dateModified=" + this.f + ", source=" + this.g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        Map map = this.h;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.i);
        parcel.writeSerializable(this.f);
        parcel.writeParcelable(this.g, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dojr(dohm dohmVar, String str, Map map, String str2, int i, int i2, long j, Instant instant, dltc dltcVar, int i3) {
        dltc dltcVar2;
        Instant instant2;
        long j2;
        int i4;
        int i5;
        String str3;
        map = (i3 & 4) != 0 ? null : map;
        if ((i3 & 8) != 0) {
            dltcVar2 = dltcVar;
            instant2 = instant;
            j2 = j;
            i4 = i2;
            i5 = i;
            str3 = null;
        } else {
            dltcVar2 = dltcVar;
            instant2 = instant;
            j2 = j;
            i4 = i2;
            i5 = i;
            str3 = str2;
        }
        this(dohmVar, str, map, str3, i5, i4, j2, instant2, dltcVar2);
    }
}
