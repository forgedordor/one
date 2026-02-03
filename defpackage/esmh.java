package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esmh extends esoe {
    public Context a;
    public URI b;
    public Executor c;
    public Executor d;
    public Executor e;
    public ScheduledExecutorService f;
    public String g;
    public ejxr h;
    public esmv i;
    public Integer j;
    public Integer k;
    public long l;
    public int m;
    public long n;
    public long o;
    public byte p;

    @Override // defpackage.esoe
    public final void a(long j) {
        this.n = j;
        this.p = (byte) (this.p | 4);
    }

    @Override // defpackage.esoe
    public final void b(long j) {
        this.o = j;
        this.p = (byte) (this.p | 8);
    }

    @Override // defpackage.esoe
    public final void c(int i) {
        this.m = i;
        this.p = (byte) (this.p | 2);
    }
}
