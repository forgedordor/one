package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddwr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CallingCardRequestStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallingCardRequestStatus> CREATOR = new ddwr();
    public final int a;

    public CallingCardRequestStatus(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallingCardRequestStatus) && this.a == ((CallingCardRequestStatus) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.c(parcel, iA);
    }
}
