package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doau implements dohp {
    public static final Parcelable.Creator<doau> CREATOR = new doat();
    public final dohm a;
    public final String b;
    public final int c;
    public final int d;
    public final doas e;
    private final doin f;
    private final long g;
    private final doid h;

    public doau(doin doinVar, dohm dohmVar, String str, int i, int i2, long j, doas doasVar) {
        doinVar.getClass();
        dohmVar.getClass();
        str.getClass();
        doasVar.getClass();
        this.f = doinVar;
        this.a = dohmVar;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.g = j;
        this.e = doasVar;
        this.h = dohm.d;
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final long a() {
        return this.g;
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final /* synthetic */ doig b() {
        return dohn.b(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doau)) {
            return false;
        }
        doau doauVar = (doau) obj;
        return this.f == doauVar.f && fdbq.f(this.a, doauVar.a) && fdbq.f(this.b, doauVar.b) && this.c == doauVar.c && this.d == doauVar.d && this.g == doauVar.g && fdbq.f(this.e, doauVar.e);
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dltd
    public final /* synthetic */ dltc fo() {
        return this.e;
    }

    @Override // defpackage.dltd
    public final String fq() {
        Uri uri = Uri.parse(this.b);
        uri.getClass();
        return "Variation(quality=" + this.f + ", format=" + this.a + ", url='" + dngu.a(uri) + "', widthPx=" + this.c + ", heightPx=" + this.d + ", sizeBytes=" + this.g + ", source=" + this.e + ")";
    }

    @Override // defpackage.dohp
    public final int h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        long j = this.g;
        return (((((((iHashCode * 31) + this.c) * 31) + this.d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.e.hashCode();
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
        return this.h;
    }

    @Override // defpackage.dohq
    public final doin n() {
        return this.f;
    }

    @Override // defpackage.dohq
    public final Map o() {
        return null;
    }

    public final String toString() {
        return "Variation(quality=" + this.f + ", format=" + this.a + ", url=" + this.b + ", widthPx=" + this.c + ", heightPx=" + this.d + ", sizeBytes=" + this.g + ", source=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f.name());
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.g);
        parcel.writeParcelable(this.e, i);
    }

    @Override // defpackage.dlti
    public final /* synthetic */ Object fp() {
        return this;
    }
}
