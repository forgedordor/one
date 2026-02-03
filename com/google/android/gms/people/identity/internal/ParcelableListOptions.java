package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclb;
import defpackage.dclw;
import defpackage.ddwy;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ParcelableListOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableListOptions> CREATOR = new ddwy();
    final boolean a;
    final boolean b;
    final String c;
    final boolean d;
    final Bundle e;

    public ParcelableListOptions(boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = bundle == null ? new Bundle() : bundle;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dclb.b("useOfflineDatabase", Boolean.valueOf(this.a), arrayList);
        dclb.b("useWebData", Boolean.valueOf(this.b), arrayList);
        dclb.b("useCP2", Boolean.valueOf(this.d), arrayList);
        dclb.b("endpoint", this.c, arrayList);
        return dclb.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, this.a);
        dclw.d(parcel, 2, this.b);
        dclw.m(parcel, 3, this.c, false);
        dclw.d(parcel, 4, this.d);
        dclw.p(parcel, 5, this.e);
        dclw.c(parcel, iA);
    }
}
