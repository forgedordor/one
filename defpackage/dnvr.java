package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvr implements dojs {
    public static final Parcelable.Creator<dnvr> CREATOR = new dnvq();
    public static final dnvr a;
    public static final dnvr b;
    public final dokj c;

    static {
        dokg dokgVar = (dokg) dokj.a.createBuilder();
        dokgVar.getClass();
        dokh dokhVar = (dokh) doki.a.createBuilder();
        dokhVar.getClass();
        dokz.c(dola.a(dokhVar), dokgVar);
        a = new dnvr(dokz.a(dokgVar));
        dokg dokgVar2 = (dokg) dokj.a.createBuilder();
        dokgVar2.getClass();
        doke dokeVar = (doke) dokf.a.createBuilder();
        dokeVar.getClass();
        dokz.b(doky.a(dokeVar), dokgVar2);
        b = new dnvr(dokz.a(dokgVar2));
    }

    public dnvr(dokj dokjVar) {
        dokjVar.getClass();
        this.c = dokjVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnvr) && fdbq.f(this.c, ((dnvr) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "EmotifySource(customStickerSource=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeByteArray(this.c.toByteArray());
    }
}
