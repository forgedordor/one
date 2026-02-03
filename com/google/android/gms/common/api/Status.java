package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dcfi;
import defpackage.dcfx;
import defpackage.dcga;
import defpackage.dclb;
import defpackage.dclc;
import defpackage.dclw;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, dcfx {
    public final int g;
    public final String h;
    public final PendingIntent i;
    public final ConnectionResult j;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Status f = new Status(17);
    public static final Parcelable.Creator<Status> CREATOR = new dcga();

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.g = i;
        this.h = str;
        this.i = pendingIntent;
        this.j = connectionResult;
    }

    public final String b() {
        String str = this.h;
        return str != null ? str : dcfi.a(this.g);
    }

    public final boolean c() {
        return this.i != null;
    }

    public final boolean d() {
        return this.g <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.g == status.g && dclc.a(this.h, status.h) && dclc.a(this.i, status.i) && dclc.a(this.j, status.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dclb.b("statusCode", b(), arrayList);
        dclb.b("resolution", this.i, arrayList);
        return dclb.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.g;
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, i2);
        dclw.m(parcel, 2, this.h, false);
        dclw.k(parcel, 3, this.i, i, false);
        dclw.k(parcel, 4, this.j, i, false);
        dclw.c(parcel, iA);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(17, str, connectionResult.d, connectionResult);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }

    @Override // defpackage.dcfx
    public final Status a() {
        return this;
    }
}
