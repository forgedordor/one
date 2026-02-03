package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.derm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FastPairAccountKeyParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FastPairAccountKeyParcelable> CREATOR = new derm();
    private final byte[] a;

    public FastPairAccountKeyParcelable(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 1, (byte[]) bArr.clone(), false);
        dclw.c(parcel, iA);
    }
}
