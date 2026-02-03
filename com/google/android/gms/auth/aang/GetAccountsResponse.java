package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbnj;
import defpackage.dclw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetAccountsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAccountsResponse> CREATOR = new dbnj();
    public final List a;
    public final List b;

    public GetAccountsResponse(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.n(parcel, 2, this.b, false);
        dclw.c(parcel, iA);
    }
}
