package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsf;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CheckFactoryResetPolicyComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CheckFactoryResetPolicyComplianceResponse> CREATOR = new dbsf();
    final int a;
    public final int b;

    public CheckFactoryResetPolicyComplianceResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }
}
