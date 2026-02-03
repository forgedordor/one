package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.IWearableListener;
import defpackage.dclw;
import defpackage.dete;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoveListenerRequest> CREATOR = new dete();
    final int a;
    public final IWearableListener b;

    public RemoveListenerRequest(int i, IBinder iBinder) {
        this.a = i;
        this.b = iBinder != null ? IWearableListener.Stub.asInterface(iBinder) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        IWearableListener iWearableListener = this.b;
        dclw.u(parcel, 2, iWearableListener == null ? null : iWearableListener.asBinder());
        dclw.c(parcel, iA);
    }
}
