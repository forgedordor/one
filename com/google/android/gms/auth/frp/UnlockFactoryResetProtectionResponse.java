package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbvb;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UnlockFactoryResetProtectionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UnlockFactoryResetProtectionResponse> CREATOR = new dbvb();
    final int a;
    public final int b;

    public UnlockFactoryResetProtectionResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
