package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dboz;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SaveRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SaveRequest> CREATOR = new dboz();
    public final Credential a;

    public SaveRequest(Credential credential) {
        this.a = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Credential credential = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, credential, i, false);
        dclw.c(parcel, iA);
    }
}
