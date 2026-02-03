package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbta;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WebSetupConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebSetupConfig> CREATOR = new dbta();
    final int a;
    public final String b;

    public WebSetupConfig(int i, String str) {
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
