package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.deno;
import defpackage.ejwf;
import defpackage.ejwg;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionRestrictions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionRestrictions> CREATOR = new deno();
    public final List a;
    public final List b;
    public final List c;

    public ConnectionRestrictions(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("allowedDataItemFilters", this.a);
        ejwfVarB.b("allowedCapabilities", this.b);
        ejwfVarB.b("allowedPackages", this.c);
        return ejwfVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.D(parcel, 2, this.b);
        dclw.D(parcel, 3, this.c);
        dclw.c(parcel, iA);
    }
}
