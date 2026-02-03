package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.depu;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BooleanResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BooleanResponse> CREATOR = new depu();
    public final int a;
    public final boolean b;

    public BooleanResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanResponse)) {
            return false;
        }
        BooleanResponse booleanResponse = (BooleanResponse) obj;
        return this.a == booleanResponse.a && this.b == booleanResponse.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.d(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
