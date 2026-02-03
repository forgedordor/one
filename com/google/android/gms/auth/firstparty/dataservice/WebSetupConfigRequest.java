package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbtb;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WebSetupConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebSetupConfigRequest> CREATOR = new dbtb();
    final int a;
    public final AppDescription b;

    public WebSetupConfigRequest(int i, AppDescription appDescription) {
        this.a = i;
        dclh.m(appDescription);
        this.b = appDescription;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
