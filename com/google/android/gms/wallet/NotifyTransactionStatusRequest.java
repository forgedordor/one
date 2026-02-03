package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.delf;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class NotifyTransactionStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotifyTransactionStatusRequest> CREATOR = new delf();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
