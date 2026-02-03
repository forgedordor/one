package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddiy;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class ExampleStoreResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExampleStoreResult> CREATOR = new ddiy();
    public final Example a;
    private final byte[] b;

    public ExampleStoreResult(Example example, byte[] bArr) {
        this.a = example;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Example example = this.a;
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, example, i, false);
        byte[] bArr = this.b;
        dclw.f(parcel, 2, Arrays.copyOf(bArr, bArr.length), false);
        dclw.c(parcel, iA);
    }
}
