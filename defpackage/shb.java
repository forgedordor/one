package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<shb> CREATOR = new shc();
    public final String a;
    public final int b;
    public final float c;

    public shb(String str, int i, float f) {
        this.a = str;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shb)) {
            return false;
        }
        shb shbVar = (shb) obj;
        return this.a.equals(shbVar.a) && this.b == shbVar.b && this.c == shbVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public final String toString() {
        return "Category{categoryName='" + this.a + "', index=" + this.b + ", score=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.i(parcel, 2, this.b);
        dclw.h(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
