package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcno;
import defpackage.ddni;
import defpackage.ddnp;
import defpackage.ddoe;
import defpackage.ddog;
import defpackage.ddqd;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new ddni();
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;
    public final WorkSource g;
    public final ClientIdentity h;

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = z;
        this.f = i3;
        this.g = workSource;
        this.h = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.a == currentLocationRequest.a && this.b == currentLocationRequest.b && this.c == currentLocationRequest.c && this.d == currentLocationRequest.d && this.e == currentLocationRequest.e && this.f == currentLocationRequest.f && dclc.a(this.g, currentLocationRequest.g) && dclc.a(this.h, currentLocationRequest.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentLocationRequest[");
        sb.append(ddoe.a(this.c));
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            ddqd.a(j, sb);
        }
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(j2);
            sb.append("ms");
        }
        int i = this.b;
        if (i != 0) {
            sb.append(", ");
            sb.append(ddnp.a(i));
        }
        if (this.e) {
            sb.append(", bypass");
        }
        int i2 = this.f;
        if (i2 != 0) {
            sb.append(", ");
            sb.append(ddog.a(i2));
        }
        WorkSource workSource = this.g;
        if (!dcno.c(workSource)) {
            sb.append(", workSource=");
            sb.append(workSource);
        }
        ClientIdentity clientIdentity = this.h;
        if (clientIdentity != null) {
            sb.append(", impersonation=");
            sb.append(clientIdentity);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iA = dclw.a(parcel);
        dclw.j(parcel, 1, j);
        dclw.i(parcel, 2, this.b);
        dclw.i(parcel, 3, this.c);
        dclw.j(parcel, 4, this.d);
        dclw.d(parcel, 5, this.e);
        dclw.k(parcel, 6, this.g, i, false);
        dclw.i(parcel, 7, this.f);
        dclw.k(parcel, 9, this.h, i, false);
        dclw.c(parcel, iA);
    }
}
