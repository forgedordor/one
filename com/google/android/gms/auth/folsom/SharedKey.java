package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbub;
import defpackage.dclh;
import defpackage.dclw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SharedKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SharedKey> CREATOR = new dbub();
    public final int a;
    public final byte[] b;

    public SharedKey(int i, byte[] bArr) {
        dclh.n(bArr, "keyMaterial cannot be null");
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SharedKey) {
            SharedKey sharedKey = (SharedKey) obj;
            if (this.a == sharedKey.a && Arrays.equals(this.b, sharedKey.b)) {
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
