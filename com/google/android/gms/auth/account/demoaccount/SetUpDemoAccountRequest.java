package com.google.android.gms.auth.account.demoaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnx;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetUpDemoAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetUpDemoAccountRequest> CREATOR = new dbnx();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclw.c(parcel, dclw.a(parcel));
    }
}
