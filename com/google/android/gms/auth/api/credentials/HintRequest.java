package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbov;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new dbov();
    final int a;
    public final CredentialPickerConfig b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final String g;
    public final String h;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.a = i;
        dclh.m(credentialPickerConfig);
        this.b = credentialPickerConfig;
        this.c = z;
        this.d = z2;
        dclh.m(strArr);
        this.e = strArr;
        if (i < 2) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z3;
            this.g = str;
            this.h = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CredentialPickerConfig credentialPickerConfig = this.b;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, credentialPickerConfig, i, false);
        dclw.d(parcel, 2, this.c);
        dclw.d(parcel, 3, this.d);
        dclw.C(parcel, 4, this.e);
        dclw.d(parcel, 5, this.f);
        dclw.m(parcel, 6, this.g, false);
        dclw.m(parcel, 7, this.h, false);
        dclw.i(parcel, 1000, this.a);
        dclw.c(parcel, iA);
    }
}
