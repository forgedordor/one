package defpackage;

import android.os.WorkSource;
import androidx.car.app.model.Alert;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnv {
    public boolean a;
    public boolean b;
    public WorkSource c;
    private int d;
    private long e;
    private long f;
    private long g;
    private long h;
    private int i;
    private float j;
    private long k;
    private int l;
    private int m;
    private ClientIdentity n;

    public ddnv(int i, long j) {
        this(j);
        f(i);
    }

    public final LocationRequest a() {
        int i = this.d;
        long j = this.e;
        long jMin = this.f;
        if (jMin == -1) {
            jMin = j;
        } else if (i != 105) {
            jMin = Math.min(jMin, j);
        }
        long jMax = Math.max(this.g, this.e);
        long j2 = this.h;
        int i2 = this.i;
        float f = this.j;
        boolean z = this.a;
        long j3 = this.k;
        if (j3 == -1) {
            j3 = this.e;
        }
        return new LocationRequest(i, j, jMin, jMax, Long.MAX_VALUE, j2, i2, f, z, j3, this.l, this.m, this.b, new WorkSource(this.c), this.n);
    }

    public final void b(long j) {
        dclh.b(j > 0, "durationMillis must be greater than 0");
        this.h = j;
    }

    public final void c(int i) {
        ddnp.b(i);
        this.l = i;
    }

    public final void d(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        dclh.b(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        this.k = j;
    }

    public final void e(long j) {
        boolean z = true;
        if (j != -1 && j < 0) {
            z = false;
        }
        dclh.b(z, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
        this.f = j;
    }

    public final void f(int i) {
        ddoe.b(i);
        this.d = i;
    }

    public final void g(int i) {
        int i2;
        boolean z;
        if (i == 0 || i == 1) {
            i2 = i;
            z = true;
        } else {
            i2 = 2;
            if (i == 2) {
                z = true;
                i = 2;
            } else {
                i2 = i;
                z = false;
            }
        }
        dclh.c(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
        this.m = i2;
    }

    public ddnv(long j) {
        this.d = 102;
        this.f = -1L;
        this.g = 0L;
        this.h = Long.MAX_VALUE;
        this.i = Alert.DURATION_SHOW_INDEFINITELY;
        this.j = 0.0f;
        this.a = true;
        this.k = -1L;
        this.l = 0;
        this.m = 0;
        this.b = false;
        this.c = null;
        this.n = null;
        dclh.b(j >= 0, "intervalMillis must be greater than or equal to 0");
        this.e = j;
    }

    public ddnv(LocationRequest locationRequest) {
        this(locationRequest.a, locationRequest.b);
        e(locationRequest.c);
        long j = locationRequest.d;
        dclh.b(j >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
        this.g = j;
        b(locationRequest.e);
        int i = locationRequest.f;
        dclh.b(i > 0, "maxUpdates must be greater than 0");
        this.i = i;
        float f = locationRequest.g;
        dclh.b(f >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
        this.j = f;
        this.a = locationRequest.h;
        d(locationRequest.i);
        c(locationRequest.j);
        g(locationRequest.k);
        this.b = locationRequest.l;
        this.c = locationRequest.m;
        ClientIdentity clientIdentity = locationRequest.n;
        dclh.a(clientIdentity == null || !clientIdentity.a());
        this.n = clientIdentity;
    }
}
