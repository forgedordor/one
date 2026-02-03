package defpackage;

import android.app.Notification;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxk extends caxz {
    public pzj a;
    public Notification b;
    public elgm c;
    public Duration d;
    public Optional e = Optional.empty();
    private caze f;
    private int g;
    private int h;
    private long i;
    private pza j;
    private boolean k;
    private byte l;

    @Override // defpackage.caxz
    public final caya a() {
        if (this.l == 15 && this.f != null && this.j != null) {
            return new caxl(this.a, this.f, this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.k, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" keepAliveStrategy");
        }
        if ((this.l & 1) == 0) {
            sb.append(" maxRowsPerBatch");
        }
        if ((this.l & 2) == 0) {
            sb.append(" maxAttemptsPerItem");
        }
        if ((this.l & 4) == 0) {
            sb.append(" retryDelayMillis");
        }
        if (this.j == null) {
            sb.append(" retryBackoffPolicy");
        }
        if ((this.l & 8) == 0) {
            sb.append(" optInForSchedulerMigration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.caxz
    public final void b(caze cazeVar) {
        if (cazeVar == null) {
            throw new NullPointerException("Null keepAliveStrategy");
        }
        this.f = cazeVar;
    }

    @Override // defpackage.caxz
    public final void c(int i) {
        this.h = i;
        this.l = (byte) (this.l | 2);
    }

    @Override // defpackage.caxz
    public final void d(int i) {
        this.g = i;
        this.l = (byte) (this.l | 1);
    }

    @Override // defpackage.caxz
    public final void e(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 8);
    }

    @Override // defpackage.caxz
    public final void f(pza pzaVar) {
        if (pzaVar == null) {
            throw new NullPointerException("Null retryBackoffPolicy");
        }
        this.j = pzaVar;
    }

    @Override // defpackage.caxz
    public final void g(long j) {
        this.i = j;
        this.l = (byte) (this.l | 4);
    }
}
