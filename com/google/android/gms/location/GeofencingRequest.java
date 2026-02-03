package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddno;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new ddno();
    public final List a;
    public final int b;
    public final String c;

    public GeofencingRequest(List list, int i, String str) {
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        return "GeofencingRequest[geofences=" + String.valueOf(this.a) + ", initialTrigger=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.i(parcel, 2, this.b);
        dclw.m(parcel, 4, this.c, false);
        dclw.c(parcel, iA);
    }
}
