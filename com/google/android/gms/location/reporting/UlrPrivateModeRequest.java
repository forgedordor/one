package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddpz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UlrPrivateModeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UlrPrivateModeRequest> CREATOR = new ddpz();
    public final String a;
    public final boolean b;

    public UlrPrivateModeRequest(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        return "UlrPrivateModeRequest{Tag='" + this.a + ", privateMode=" + this.b + "}";
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
