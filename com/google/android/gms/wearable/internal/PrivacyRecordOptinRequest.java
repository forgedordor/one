package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deta;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PrivacyRecordOptinRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PrivacyRecordOptinRequest> CREATOR = new deta();
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;

    public PrivacyRecordOptinRequest(String str, int i, boolean z, String str2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.i(parcel, 2, this.b);
        dclw.d(parcel, 3, this.c);
        dclw.m(parcel, 4, this.d, false);
        dclw.c(parcel, iA);
    }
}
