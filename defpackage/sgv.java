package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgv implements SafeParcelable {
    public static final Parcelable.Creator<sgv> CREATOR = new sgw();
    public final String a;
    public final shu b;

    public sgv(String str, shu shuVar) {
        this.a = str;
        this.b = shuVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgv)) {
            return false;
        }
        sgv sgvVar = (sgv) obj;
        return Objects.equals(this.a, sgvVar.a) && Objects.equals(this.b, sgvVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
