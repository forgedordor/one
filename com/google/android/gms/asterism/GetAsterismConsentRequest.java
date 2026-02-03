package com.google.android.gms.asterism;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dblh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetAsterismConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAsterismConsentRequest> CREATOR = new dblh();
    public final int a;
    public final int b;

    public GetAsterismConsentRequest(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.i(parcel, 2, this.b);
        dclw.c(parcel, iA);
    }
}
