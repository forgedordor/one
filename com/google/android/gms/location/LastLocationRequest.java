package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddnp;
import defpackage.ddnq;
import defpackage.ddqd;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new ddnq();
    public final long a;
    public final int b;
    public final boolean c;
    public final ClientIdentity d;

    public LastLocationRequest(long j, int i, boolean z, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.a == lastLocationRequest.a && this.b == lastLocationRequest.b && this.c == lastLocationRequest.c && dclc.a(this.d, lastLocationRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sb.append("maxAge=");
            ddqd.a(j, sb);
        }
        int i = this.b;
        if (i != 0) {
            sb.append(", ");
            sb.append(ddnp.a(i));
        }
        if (this.c) {
            sb.append(", bypass");
        }
        ClientIdentity clientIdentity = this.d;
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
        dclw.d(parcel, 3, this.c);
        dclw.k(parcel, 5, this.d, i, false);
        dclw.c(parcel, iA);
    }
}
