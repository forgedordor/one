package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbsg;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CheckRealNameRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CheckRealNameRequest> CREATOR = new dbsg();
    final int a;
    AppDescription b;
    String c;
    String d;

    public CheckRealNameRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.k(parcel, 2, this.b, i, false);
        dclw.m(parcel, 3, this.c, false);
        dclw.m(parcel, 4, this.d, false);
        dclw.c(parcel, iA);
    }

    public CheckRealNameRequest(int i, AppDescription appDescription, String str, String str2) {
        this.a = i;
        this.b = appDescription;
        this.c = str;
        this.d = str2;
    }
}
