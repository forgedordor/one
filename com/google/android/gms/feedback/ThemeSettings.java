package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcwr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ThemeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ThemeSettings> CREATOR = new dcwr();
    public int a;
    int b;

    public ThemeSettings(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.i(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }

    public ThemeSettings() {
        this(3, 0);
    }
}
