package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ske extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ske> CREATOR = new skf();
    public final String a;
    public final int b;
    public final float c;

    public ske(String str, int i, float f) {
        this.a = str;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ske)) {
            return false;
        }
        ske skeVar = (ske) obj;
        return this.b == skeVar.b && Float.compare(skeVar.c, this.c) == 0 && Objects.equals(this.a, skeVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public final String toString() {
        return "SmartReplyReplyEntry{text='" + this.a + "', safetyClassificationResult=" + this.b + ", score=" + this.c + "}";
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
