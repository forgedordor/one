package defpackage;

import android.content.ContentValues;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqou extends dqtw {
    public dqsb a;
    public ejxr b;
    public dqsy c;
    public ejxr d;
    public AtomicInteger e;
    public AtomicLong f;
    public AtomicLong g;
    public AtomicBoolean h;
    public String i;
    public ContentValues j;
    public dqwl k;
    public ejxr l;
    private dqus m;
    private boolean n;
    private byte o;

    @Override // defpackage.dqtw
    public final dqtx a() {
        dqsb dqsbVar;
        dqus dqusVar;
        dqsy dqsyVar;
        ejxr ejxrVar;
        AtomicInteger atomicInteger;
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        AtomicBoolean atomicBoolean;
        ejxr ejxrVar2;
        if (this.o == 1 && (dqsbVar = this.a) != null && (dqusVar = this.m) != null && (dqsyVar = this.c) != null && (ejxrVar = this.d) != null && (atomicInteger = this.e) != null && (atomicLong = this.f) != null && (atomicLong2 = this.g) != null && (atomicBoolean = this.h) != null && (ejxrVar2 = this.l) != null) {
            return new dqov(dqsbVar, dqusVar, this.b, dqsyVar, this.n, ejxrVar, atomicInteger, atomicLong, atomicLong2, atomicBoolean, this.i, this.j, this.k, ejxrVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" loggingTag");
        }
        if (this.m == null) {
            sb.append(" operationCategory");
        }
        if (this.c == null) {
            sb.append(" database");
        }
        if (this.o == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if (this.d == null) {
            sb.append(" sqlAndArgs");
        }
        if (this.e == null) {
            sb.append(" resultCount");
        }
        if (this.f == null) {
            sb.append(" threadTimeMillis");
        }
        if (this.g == null) {
            sb.append(" elapsedTimeMillis");
        }
        if (this.h == null) {
            sb.append(" isInFlight");
        }
        if (this.l == null) {
            sb.append(" isOnInitializationThreadSupplier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dqtw
    public final void b(dqsy dqsyVar) {
        if (dqsyVar == null) {
            throw new NullPointerException("Null database");
        }
        this.c = dqsyVar;
    }

    @Override // defpackage.dqtw
    public final void c(boolean z) {
        this.n = z;
        this.o = (byte) 1;
    }

    @Override // defpackage.dqtw
    public final void d(dqus dqusVar) {
        if (dqusVar == null) {
            throw new NullPointerException("Null operationCategory");
        }
        this.m = dqusVar;
    }
}
