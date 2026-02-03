package com.google.android.gms.mobstore;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddts;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OpenFileDescriptorResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OpenFileDescriptorResponse> CREATOR = new ddts();
    public final ParcelFileDescriptor a;

    public OpenFileDescriptorResponse(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i | 1, false);
        dclw.c(parcel, iA);
    }
}
