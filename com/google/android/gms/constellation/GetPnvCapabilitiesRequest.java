package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcog;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GetPnvCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPnvCapabilitiesRequest> CREATOR = new dcog();
    public final String a;
    public final List b;
    public final List c;

    public GetPnvCapabilitiesRequest(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 1, str, false);
        dclw.w(parcel, 2, this.b);
        dclw.w(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
