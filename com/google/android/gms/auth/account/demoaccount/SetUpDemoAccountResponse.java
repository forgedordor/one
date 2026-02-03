package com.google.android.gms.auth.account.demoaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbny;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetUpDemoAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetUpDemoAccountResponse> CREATOR = new dbny();
    public final int a;
    public final String b;
    public final int c;

    public SetUpDemoAccountResponse(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.m(parcel, 2, this.b, false);
        dclw.i(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
