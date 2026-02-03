package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sju extends AbstractSafeParcelable {
    public static final Parcelable.Creator<sju> CREATOR = new sjv();
    public final String a;
    public final int b;
    public final int c;
    public final float d;

    public sju(String str, int i, int i2, float f) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sju)) {
            return false;
        }
        sju sjuVar = (sju) obj;
        return this.b == sjuVar.b && this.c == sjuVar.c && Objects.equals(this.a, sjuVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "Rewrite{text='" + this.a + "', tone=" + this.b + ", safetyClassificationResult=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.h(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
