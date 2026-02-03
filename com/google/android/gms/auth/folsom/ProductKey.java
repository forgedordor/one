package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbtx;
import defpackage.dclh;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProductKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProductKey> CREATOR = new dbtx();
    public final int a;
    public final byte[] b;

    public ProductKey(int i, byte[] bArr) {
        dclh.n(bArr, "keyMaterial cannot be null");
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductKey) {
            ProductKey productKey = (ProductKey) obj;
            if (this.a == productKey.a && Arrays.equals(this.b, productKey.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.f(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
