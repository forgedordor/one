package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<sgx> CREATOR = new sgy();
    public final String a;
    public final float b;

    public sgx(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sgx) {
            sgx sgxVar = (sgx) obj;
            if (Objects.equals(this.a, sgxVar.a) && Float.compare(this.b, sgxVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Float.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.h(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
