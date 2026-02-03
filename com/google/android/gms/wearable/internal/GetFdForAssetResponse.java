package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dese;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetFdForAssetResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetFdForAssetResponse> CREATOR = new dese();
    public final int a;
    public final ParcelFileDescriptor b;

    public GetFdForAssetResponse(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.k(parcel, 3, this.b, i | 1, false);
        dclw.c(parcel, iA);
    }
}
