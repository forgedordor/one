package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcoh;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetPnvCapabilitiesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPnvCapabilitiesResponse> CREATOR = new dcoh();
    public final List a;

    public GetPnvCapabilitiesResponse(List list) {
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.c(parcel, iA);
    }
}
