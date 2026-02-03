package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.debz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetGlobalSearchSourcesCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalSearchSourcesCall$Request> CREATOR = new debz();
    public boolean a;

    public GetGlobalSearchSourcesCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, this.a);
        dclw.c(parcel, iA);
    }

    public GetGlobalSearchSourcesCall$Request(boolean z) {
        this.a = z;
    }
}
