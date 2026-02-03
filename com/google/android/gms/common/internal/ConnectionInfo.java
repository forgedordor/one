package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dckg;
import defpackage.dclw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionInfo> CREATOR = new dckg();
    Bundle a;
    Feature[] b;
    int c;
    public ConnectionTelemetryConfiguration d;

    public ConnectionInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.p(parcel, 1, this.a);
        dclw.E(parcel, 2, this.b, i);
        dclw.i(parcel, 3, this.c);
        dclw.k(parcel, 4, this.d, i, false);
        dclw.c(parcel, iA);
    }

    public ConnectionInfo(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.a = bundle;
        this.b = featureArr;
        this.c = i;
        this.d = connectionTelemetryConfiguration;
    }
}
