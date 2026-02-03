package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.desf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetLocalNodeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetLocalNodeResponse> CREATOR = new desf();
    public final int a;
    public final NodeParcelable b;

    public GetLocalNodeResponse(int i, NodeParcelable nodeParcelable) {
        this.a = i;
        this.b = nodeParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 2, this.a);
        dclw.k(parcel, 3, this.b, i, false);
        dclw.c(parcel, iA);
    }
}
