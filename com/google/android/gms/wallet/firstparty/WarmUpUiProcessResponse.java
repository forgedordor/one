package com.google.android.gms.wallet.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WarmUpUiProcessResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WarmUpUiProcessResponse> CREATOR = new demf();
    final PendingIntent a;

    public WarmUpUiProcessResponse(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.c(parcel, iA);
    }
}
