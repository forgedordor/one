package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.car.app.model.Alert;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.dcno;
import defpackage.ddnp;
import defpackage.ddnw;
import defpackage.ddoe;
import defpackage.ddog;
import defpackage.ddqd;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new ddnw();
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public int f;
    public float g;
    public boolean h;
    public long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final WorkSource m;
    public final ClientIdentity n;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Alert.DURATION_SHOW_INDEFINITELY, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String c(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb = ddqd.b;
        synchronized (sb) {
            sb.setLength(0);
            ddqd.a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public final boolean a() {
        long j = this.d;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final boolean b() {
        return this.a == 105;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            boolean zA = a();
            if (this.a == locationRequest.a && ((b() || this.b == locationRequest.b) && this.c == locationRequest.c && zA == locationRequest.a() && ((!zA || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.j == locationRequest.j && this.k == locationRequest.k && this.l == locationRequest.l && this.m.equals(locationRequest.m) && dclc.a(this.n, locationRequest.n)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.m});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (b()) {
            sb.append(ddoe.a(this.a));
            if (this.d > 0) {
                sb.append("/");
                ddqd.a(this.d, sb);
            }
        } else {
            sb.append("@");
            if (a()) {
                ddqd.a(this.b, sb);
                sb.append("/");
                ddqd.a(this.d, sb);
            } else {
                ddqd.a(this.b, sb);
            }
            sb.append(" ");
            sb.append(ddoe.a(this.a));
        }
        if (b() || this.c != this.b) {
            sb.append(", minUpdateInterval=");
            sb.append(c(this.c));
        }
        if (this.g > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.g);
        }
        if (!b() ? this.i != this.b : this.i != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(c(this.i));
        }
        if (this.e != Long.MAX_VALUE) {
            sb.append(", duration=");
            ddqd.a(this.e, sb);
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f);
        }
        int i = this.k;
        if (i != 0) {
            sb.append(", ");
            sb.append(ddog.a(i));
        }
        int i2 = this.j;
        if (i2 != 0) {
            sb.append(", ");
            sb.append(ddnp.a(i2));
        }
        if (this.h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.l) {
            sb.append(", bypass");
        }
        WorkSource workSource = this.m;
        if (!dcno.c(workSource)) {
            sb.append(", ");
            sb.append(workSource);
        }
        ClientIdentity clientIdentity = this.n;
        if (clientIdentity != null) {
            sb.append(", impersonation=");
            sb.append(clientIdentity);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.a);
        dclw.j(parcel, 2, this.b);
        dclw.j(parcel, 3, this.c);
        dclw.i(parcel, 6, this.f);
        dclw.h(parcel, 7, this.g);
        dclw.j(parcel, 8, this.d);
        dclw.d(parcel, 9, this.h);
        dclw.j(parcel, 10, this.e);
        dclw.j(parcel, 11, this.i);
        dclw.i(parcel, 12, this.j);
        dclw.i(parcel, 13, this.k);
        dclw.d(parcel, 15, this.l);
        dclw.k(parcel, 16, this.m, i, false);
        dclw.k(parcel, 17, this.n, i, false);
        dclw.c(parcel, iA);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = i;
        if (i == 105) {
            this.b = Long.MAX_VALUE;
        } else {
            this.b = j;
        }
        this.c = j2;
        this.d = j3;
        this.e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f = i2;
        this.g = f;
        this.h = z;
        this.i = j6 != -1 ? j6 : j;
        this.j = i3;
        this.k = i4;
        this.l = z2;
        this.m = workSource;
        this.n = clientIdentity;
    }
}
