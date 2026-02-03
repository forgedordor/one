package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.denf;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new denf();
    public final byte[] a;
    public final String b;
    public final ParcelFileDescriptor c;
    public final Uri d;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.a = bArr;
        this.b = str;
        this.c = parcelFileDescriptor;
        this.d = uri;
    }

    public static Asset a(ParcelFileDescriptor parcelFileDescriptor) {
        dclh.m(parcelFileDescriptor);
        return new Asset(null, null, parcelFileDescriptor, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.a, asset.a) && dclc.a(this.b, asset.b) && dclc.a(this.c, asset.c) && dclc.a(this.d, asset.d);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.b;
        if (str == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(str);
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            sb.append(", size=");
            sb.append(bArr.length);
        }
        ParcelFileDescriptor parcelFileDescriptor = this.c;
        if (parcelFileDescriptor != null) {
            sb.append(", fd=");
            sb.append(parcelFileDescriptor);
        }
        Uri uri = this.d;
        if (uri != null) {
            sb.append(", uri=");
            sb.append(uri);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclh.m(parcel);
        byte[] bArr = this.a;
        int iA = dclw.a(parcel);
        dclw.f(parcel, 2, bArr, false);
        dclw.m(parcel, 3, this.b, false);
        int i2 = i | 1;
        dclw.k(parcel, 4, this.c, i2, false);
        dclw.k(parcel, 5, this.d, i2, false);
        dclw.c(parcel, iA);
    }
}
