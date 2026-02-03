package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddsz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncResult> CREATOR = new ddsz();
    public final byte[] a;

    public SyncResult(byte[] bArr) {
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
