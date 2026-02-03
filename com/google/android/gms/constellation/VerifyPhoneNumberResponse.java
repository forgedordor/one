package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VerifyPhoneNumberResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VerifyPhoneNumberResponse> CREATOR = new dcor();
    public final PhoneNumberVerification[] a;
    public final Bundle b;

    public VerifyPhoneNumberResponse(PhoneNumberVerification[] phoneNumberVerificationArr, Bundle bundle) {
        this.a = phoneNumberVerificationArr;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PhoneNumberVerification[] phoneNumberVerificationArr = this.a;
        int iA = dclw.a(parcel);
        dclw.E(parcel, 1, phoneNumberVerificationArr, i);
        dclw.p(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
