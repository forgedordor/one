package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddcm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ND4CSettings extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ND4CSettings> CREATOR = new ddcm();
    boolean a;
    String b;

    public ND4CSettings(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.d(parcel, 2, this.a);
        dclw.m(parcel, 3, this.b, false);
        dclw.c(parcel, iA);
    }

    public ND4CSettings() {
        this(true, "");
    }
}
