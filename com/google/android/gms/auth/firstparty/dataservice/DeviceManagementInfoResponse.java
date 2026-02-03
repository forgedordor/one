package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsl;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeviceManagementInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceManagementInfoResponse> CREATOR = new dbsl();
    final int a;
    public final String b;
    public final boolean c;

    public DeviceManagementInfoResponse(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.d(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
