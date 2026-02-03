package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doju implements dojv, dohp {
    public static final Parcelable.Creator<doju> CREATOR = new dojt();
    public final dojm a;
    public final String b;
    public final int c;
    public final int d;
    public final Instant e;
    public final dltc f;
    public final Duration g;
    private final Map h;
    private final String i;
    private final long j;

    public doju(dojm dojmVar, String str, Map map, String str2, int i, int i2, long j, Instant instant, dltc dltcVar, Duration duration) {
        dojmVar.getClass();
        str.getClass();
        instant.getClass();
        dltcVar.getClass();
        duration.getClass();
        this.a = dojmVar;
        this.b = str;
        this.h = map;
        this.i = str2;
        this.c = i;
        this.d = i2;
        this.j = j;
        this.e = instant;
        this.f = dltcVar;
        this.g = duration;
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final long a() {
        return this.j;
    }

    @Override // defpackage.dojw, defpackage.dohq, defpackage.dltn
    public final /* synthetic */ doig b() {
        return dojn.a(this);
    }

    @Override // defpackage.dltn
    public final Instant c() {
        return this.e;
    }

    @Override // defpackage.dltn
    public final String d() {
        return this.i;
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
        if (!(obj instanceof doju)) {
            return false;
        }
        doju dojuVar = (doju) obj;
        return fdbq.f(this.a, dojuVar.a) && fdbq.f(this.b, dojuVar.b) && fdbq.f(this.h, dojuVar.h) && fdbq.f(this.i, dojuVar.i) && this.c == dojuVar.c && this.d == dojuVar.d && this.j == dojuVar.j && fdbq.f(this.e, dojuVar.e) && fdbq.f(this.f, dojuVar.f) && fdbq.f(this.g, dojuVar.g);
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dltd
    public final dltc fo() {
        return this.f;
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
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Map map = this.h;
        int iHashCode2 = ((iHashCode * 31) + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.i;
        int iHashCode3 = (((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31;
        long j = this.j;
        return ((((((iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    @Override // defpackage.dohp
    public final int j() {
        return this.c;
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
        return "Video(format=" + this.a + ", url=" + this.b + ", headers=" + this.h + ", displayName=" + this.i + ", widthPx=" + this.c + ", heightPx=" + this.d + ", sizeBytes=" + this.j + ", dateModified=" + this.e + ", source=" + this.f + ", duration=" + this.g + ")";
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
        parcel.writeString(this.i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.j);
        parcel.writeSerializable(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeSerializable(this.g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ doju(dojm dojmVar, String str, Map map, String str2, int i, int i2, long j, Instant instant, dltc dltcVar, Duration duration, int i3) {
        Duration duration2;
        dltc dltcVar2;
        Instant instant2;
        long j2;
        int i4;
        int i5;
        String str3;
        map = (i3 & 4) != 0 ? null : map;
        if ((i3 & 8) != 0) {
            duration2 = duration;
            dltcVar2 = dltcVar;
            instant2 = instant;
            j2 = j;
            i4 = i2;
            i5 = i;
            str3 = null;
        } else {
            duration2 = duration;
            dltcVar2 = dltcVar;
            instant2 = instant;
            j2 = j;
            i4 = i2;
            i5 = i;
            str3 = str2;
        }
        this(dojmVar, str, map, str3, i5, i4, j2, instant2, dltcVar2, duration2);
    }
}
