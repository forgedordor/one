package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddyf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DogfoodsToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DogfoodsToken> CREATOR = new ddyf();
    public final byte[] a;

    public DogfoodsToken(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, bArr, false);
        dclw.c(parcel, iA);
    }
}
