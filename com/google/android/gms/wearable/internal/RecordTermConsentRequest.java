package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.detc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RecordTermConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecordTermConsentRequest> CREATOR = new detc();
    public final int a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public RecordTermConsentRequest(int i, int i2, boolean z, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 2, this.b);
        dclw.d(parcel, 3, this.c);
        dclw.m(parcel, 4, this.d, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.m(parcel, 6, this.f, false);
        dclw.c(parcel, iA);
    }
}
