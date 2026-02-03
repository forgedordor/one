package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deqg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ChannelReceiveFileResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelReceiveFileResponse> CREATOR = new deqg();
    public final int a;

    public ChannelReceiveFileResponse(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.c(parcel, iA);
    }
}
