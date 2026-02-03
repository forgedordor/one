package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.detk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SendMessageResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SendMessageResponse> CREATOR = new detk();
    public final int a;
    public final int b;

    public SendMessageResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.i(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }
}
