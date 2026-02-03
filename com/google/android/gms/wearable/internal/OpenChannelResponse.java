package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.desx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OpenChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OpenChannelResponse> CREATOR = new desx();
    public final int a;
    public final ChannelImpl b;

    public OpenChannelResponse(int i, ChannelImpl channelImpl) {
        this.a = i;
        this.b = channelImpl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
