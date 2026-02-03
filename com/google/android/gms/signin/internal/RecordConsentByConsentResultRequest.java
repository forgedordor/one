package com.google.android.gms.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dedr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RecordConsentByConsentResultRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecordConsentByConsentResultRequest> CREATOR = new dedr();
    public final Bundle a;

    public RecordConsentByConsentResultRequest(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int iA = dclw.a(parcel);
        dclw.p(parcel, 1, bundle);
        dclw.c(parcel, iA);
    }
}
