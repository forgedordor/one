package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwo;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CallingCardFullScreenImageData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallingCardFullScreenImageData> CREATOR = new ddwo();
    public final float a;
    public final float b;
    public final float c;

    public CallingCardFullScreenImageData(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallingCardFullScreenImageData) {
            CallingCardFullScreenImageData callingCardFullScreenImageData = (CallingCardFullScreenImageData) obj;
            if (this.a == callingCardFullScreenImageData.a && this.b == callingCardFullScreenImageData.b && this.c == callingCardFullScreenImageData.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int iA = dclw.a(parcel);
        dclw.h(parcel, 1, f);
        dclw.h(parcel, 2, this.b);
        dclw.h(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
