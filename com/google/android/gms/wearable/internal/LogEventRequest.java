package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deso;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LogEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogEventRequest> CREATOR = new deso();
    public final byte[] a;

    public LogEventRequest(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 1, bArr, false);
        dclw.c(parcel, iA);
    }
}
