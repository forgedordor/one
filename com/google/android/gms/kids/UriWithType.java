package com.google.android.gms.kids;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddhy;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UriWithType extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UriWithType> CREATOR = new ddhy();
    public Uri a;
    public int b;
    public String c;

    public UriWithType() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UriWithType) {
            UriWithType uriWithType = (UriWithType) obj;
            if (dclc.a(this.a, uriWithType.a) && dclc.a(Integer.valueOf(this.b), Integer.valueOf(uriWithType.b)) && dclc.a(this.c, uriWithType.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.i(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.c(parcel, iA);
    }

    public UriWithType(Uri uri, int i, String str) {
        this.a = uri;
        this.b = i;
        this.c = str;
    }
}
