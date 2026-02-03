package com.google.android.gms.contactkeys;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcoz;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class E2eeSelfKeyParcelable extends AbstractSafeParcelable implements Parcelable {
    public static final Parcelable.Creator<E2eeSelfKeyParcelable> CREATOR = new dcoz();
    public String a;
    public String b;
    public String c;
    public long d;
    public byte[] e;
    public int f;

    private E2eeSelfKeyParcelable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E2eeSelfKeyParcelable) {
            E2eeSelfKeyParcelable e2eeSelfKeyParcelable = (E2eeSelfKeyParcelable) obj;
            if (dclc.a(this.a, e2eeSelfKeyParcelable.a) && dclc.a(this.b, e2eeSelfKeyParcelable.b) && dclc.a(this.c, e2eeSelfKeyParcelable.c) && dclc.a(Long.valueOf(this.d), Long.valueOf(e2eeSelfKeyParcelable.d)) && Arrays.equals(this.e, e2eeSelfKeyParcelable.e) && dclc.a(Integer.valueOf(this.f), Integer.valueOf(e2eeSelfKeyParcelable.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, this.a, false);
        dclw.m(parcel, 2, this.b, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.j(parcel, 4, this.d);
        dclw.f(parcel, 5, this.e, false);
        dclw.i(parcel, 6, this.f);
        dclw.c(parcel, iA);
    }

    public E2eeSelfKeyParcelable(String str, String str2, String str3, long j, byte[] bArr, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = bArr;
        this.f = i;
    }
}
