package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.dend;
import defpackage.ejxq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppRecommendationsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppRecommendationsRequest> CREATOR = new dend();
    public final String a;
    public final int b;
    public final int c;

    public AppRecommendationsRequest(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        return "AppRecommendationsRequest{androidId='" + this.a + "', searchFlags=" + ejxq.c(Integer.toBinaryString(this.b), 8) + ", limit=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        dclh.n(str, "Android id is required");
        int i2 = this.b;
        if ((i2 & 3) == 0) {
            throw new IllegalArgumentException("Recommendation type is required");
        }
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.i(parcel, 2, i2);
        dclw.i(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
