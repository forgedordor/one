package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbvd;
import defpackage.dclw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class UnlockForWearResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnlockForWearResponse> CREATOR = new dbvd();
    public final int a;

    public UnlockForWearResponse(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.c(parcel, iA);
    }
}
