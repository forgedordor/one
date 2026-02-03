package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.depk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AddAccountToConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddAccountToConsentRequest> CREATOR = new depk();
    public final String a;
    public final boolean b;

    public AddAccountToConsentRequest(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.d(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
