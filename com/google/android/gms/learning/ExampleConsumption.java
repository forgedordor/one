package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ddiv;
import defpackage.ejwk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExampleConsumption extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExampleConsumption> CREATOR = new ddiv();
    public final String a;
    public final byte[] b;
    public final int c;
    public final byte[] d;
    public final byte[] e;

    public ExampleConsumption(String str, byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        boolean z = false;
        if (!ejwk.c(str) && bArr != null) {
            z = true;
        }
        dclh.b(z, "Collection name cannot be null or empty. Selection criteria cannot be null.");
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = bArr2;
        this.e = bArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExampleConsumption)) {
            return false;
        }
        ExampleConsumption exampleConsumption = (ExampleConsumption) obj;
        return this.a.equals(exampleConsumption.a) && Arrays.equals(this.b, exampleConsumption.b) && this.c == exampleConsumption.c && Arrays.equals(this.d, exampleConsumption.d) && Arrays.equals(this.e, exampleConsumption.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.f(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.f(parcel, 4, this.d, false);
        dclw.f(parcel, 5, this.e, false);
        dclw.c(parcel, iA);
    }
}
