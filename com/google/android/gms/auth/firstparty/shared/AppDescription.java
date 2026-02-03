package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbtk;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppDescription extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppDescription> CREATOR = new dbtk();
    private static final String g = "[AppDescription]";
    final int a;
    final int b;
    final String c;
    final String d;
    final String e;
    final boolean f;

    public AppDescription(int i, int i2, String str, String str2, String str3, boolean z) {
        getClass().getSimpleName();
        this.a = i;
        this.c = str;
        this.d = str2;
        dclh.l(str3, String.valueOf(g).concat(" callingPkg cannot be null or empty!"));
        this.e = str3;
        dclh.b(i2 != 0, "Invalid callingUid! Cannot be 0!");
        this.b = i2;
        this.f = z;
    }

    public final String toString() {
        return getClass().getSimpleName() + "<" + this.e + ", " + this.b + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.i(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.m(parcel, 5, this.e, false);
        dclw.d(parcel, 6, this.f);
        dclw.c(parcel, iA);
    }
}
