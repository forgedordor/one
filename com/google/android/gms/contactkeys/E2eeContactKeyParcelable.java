package com.google.android.gms.contactkeys;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcox;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class E2eeContactKeyParcelable extends AbstractSafeParcelable implements Parcelable {
    public static final Parcelable.Creator<E2eeContactKeyParcelable> CREATOR = new dcox();
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public byte[] f;
    public int g;
    public int h;
    public String i;
    public String j;
    public String k;

    public E2eeContactKeyParcelable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E2eeContactKeyParcelable) {
            E2eeContactKeyParcelable e2eeContactKeyParcelable = (E2eeContactKeyParcelable) obj;
            if (dclc.a(this.a, e2eeContactKeyParcelable.a) && dclc.a(this.b, e2eeContactKeyParcelable.b) && dclc.a(this.c, e2eeContactKeyParcelable.c) && dclc.a(this.d, e2eeContactKeyParcelable.d) && dclc.a(Long.valueOf(this.e), Long.valueOf(e2eeContactKeyParcelable.e)) && Arrays.equals(this.f, e2eeContactKeyParcelable.f) && dclc.a(Integer.valueOf(this.g), Integer.valueOf(e2eeContactKeyParcelable.g)) && dclc.a(Integer.valueOf(this.h), Integer.valueOf(e2eeContactKeyParcelable.h)) && dclc.a(this.i, e2eeContactKeyParcelable.i) && dclc.a(this.j, e2eeContactKeyParcelable.j) && dclc.a(this.k, e2eeContactKeyParcelable.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, this.j, this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.j(parcel, 5, this.e);
        dclw.f(parcel, 6, this.f, false);
        dclw.i(parcel, 7, this.g);
        dclw.i(parcel, 8, this.h);
        dclw.m(parcel, 9, this.i, false);
        dclw.m(parcel, 10, this.j, false);
        dclw.m(parcel, 11, this.k, false);
        dclw.c(parcel, iA);
    }

    public E2eeContactKeyParcelable(String str, String str2, String str3, String str4, long j, byte[] bArr, int i, int i2, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = str5;
        this.j = str6;
        this.k = str7;
    }
}
