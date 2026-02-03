package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dege;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LookupSpamSettingsOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LookupSpamSettingsOptions> CREATOR = new dege();
    public final int a;
    public final String b;

    public LookupSpamSettingsOptions(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.m(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
