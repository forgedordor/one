package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbni;
import defpackage.dclw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAccountsRequest> CREATOR = new dbni();
    public final String a;
    public final List b;
    public final List c;
    public final boolean d;

    public GetAccountsRequest(String str, List list, List list2, boolean z) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.D(parcel, 2, this.b);
        dclw.D(parcel, 3, this.c);
        dclw.d(parcel, 4, this.d);
        dclw.c(parcel, iA);
    }
}
