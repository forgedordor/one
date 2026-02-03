package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drgd implements Parcelable, res {
    public static final Parcelable.Creator<drgd> CREATOR = new drgc();
    public final String b;

    public drgd(Parcel parcel) {
        this.b = parcel.readString();
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof drgd) {
            return this.b.equals(((drgd) obj).b);
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ProvidedFifeUrl{baseUrl='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public drgd(String str) {
        if (!ebuj.a(str)) {
            throw new IllegalArgumentException("baseUrl is not a fife Url: ".concat(String.valueOf(str)));
        }
        this.b = str;
    }
}
