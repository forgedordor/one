package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbig;
import defpackage.dcfx;
import defpackage.dclw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetRecentContextCall$Response extends AbstractSafeParcelable implements dcfx {
    public static final Parcelable.Creator<GetRecentContextCall$Response> CREATOR = new dbig();
    public Status a;
    public List b;

    @Deprecated
    public String[] c;

    public GetRecentContextCall$Response() {
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.k(parcel, 1, this.a, i, false);
        dclw.n(parcel, 2, this.b, false);
        dclw.C(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }

    public GetRecentContextCall$Response(Status status, List list, String[] strArr) {
        this.a = status;
        this.b = list;
        this.c = strArr;
    }
}
