package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dboo;
import defpackage.dclh;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NotifyCompletionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotifyCompletionRequest> CREATOR = new dboo();
    public final String a;
    public final int b;

    public NotifyCompletionRequest(String str, int i) {
        dclh.m(str);
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, 1);
        dclw.m(parcel, 2, this.a, false);
        dclw.i(parcel, 3, this.b);
        dclw.c(parcel, iA);
    }
}
