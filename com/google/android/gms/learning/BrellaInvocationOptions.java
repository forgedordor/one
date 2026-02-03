package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dclw;
import defpackage.ddit;
import defpackage.ejwh;
import defpackage.ejwl;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BrellaInvocationOptions extends BaseOptions {
    public static final Parcelable.Creator<BrellaInvocationOptions> CREATOR = new ddit();
    public final String a;
    public final String b;
    public final int c;
    public final InAppTrainingConstraints d;
    private final byte[] e;

    public BrellaInvocationOptions(String str, String str2, int i, InAppTrainingConstraints inAppTrainingConstraints, byte[] bArr) {
        ejwl.a(!str.isEmpty());
        ejwl.a(!str2.isEmpty());
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = inAppTrainingConstraints;
        this.e = bArr == null ? new byte[0] : bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrellaInvocationOptions)) {
            return false;
        }
        BrellaInvocationOptions brellaInvocationOptions = (BrellaInvocationOptions) obj;
        return ejwh.a(this.a, brellaInvocationOptions.a) && ejwh.a(this.b, brellaInvocationOptions.b) && this.c == brellaInvocationOptions.c && ejwh.a(this.d, brellaInvocationOptions.d) && Arrays.equals(this.e, brellaInvocationOptions.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.k(parcel, 4, this.d, i, false);
        byte[] bArr = this.e;
        dclw.f(parcel, 5, Arrays.copyOf(bArr, bArr.length), false);
        dclw.c(parcel, iA);
    }
}
