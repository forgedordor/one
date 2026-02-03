package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.demb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetUpBiometricAuthenticationKeysRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetUpBiometricAuthenticationKeysRequest> CREATOR = new demb();
    byte[] a;

    public SetUpBiometricAuthenticationKeysRequest(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.f(parcel, 1, this.a, false);
        dclw.c(parcel, iA);
    }

    public SetUpBiometricAuthenticationKeysRequest() {
        this(null);
    }
}
