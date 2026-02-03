package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dblx;
import defpackage.dclh;
import defpackage.dclw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new dblx();
    final int a;
    final List b;

    public AccountChangeEventsResponse(int i, List list) {
        this.a = i;
        dclh.m(list);
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.n(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
