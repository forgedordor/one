package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbou;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new dbou();
    final int a;
    public final boolean b;
    public final String[] c;
    public final CredentialPickerConfig d;
    public final CredentialPickerConfig e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.a = i;
        this.b = z;
        dclh.m(strArr);
        this.c = strArr;
        this.d = credentialPickerConfig == null ? new CredentialPickerConfig() : credentialPickerConfig;
        this.e = credentialPickerConfig2 == null ? new CredentialPickerConfig() : credentialPickerConfig2;
        if (i < 3) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z2;
            this.g = str;
            this.h = str2;
        }
        this.i = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, z);
        dclw.C(parcel, 2, this.c);
        dclw.k(parcel, 3, this.d, i, false);
        dclw.k(parcel, 4, this.e, i, false);
        dclw.d(parcel, 5, this.f);
        dclw.m(parcel, 6, this.g, false);
        dclw.m(parcel, 7, this.h, false);
        dclw.d(parcel, 8, this.i);
        dclw.i(parcel, 1000, this.a);
        dclw.c(parcel, iA);
    }
}
