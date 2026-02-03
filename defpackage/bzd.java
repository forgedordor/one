package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzd {
    public final bdp a;
    public final int b;
    public boolean c = false;
    public int d = 0;
    public ScheduledFuture e = null;
    final /* synthetic */ bzf f;
    public final int g;

    public bzd(bzf bzfVar, bdp bdpVar, int i, boolean z, int i2) {
        this.f = bzfVar;
        this.a = bdpVar;
        this.g = i;
        bzfVar.aa = z;
        this.b = i2;
    }

    final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.e = null;
        }
    }

    public final void b(final bdp bdpVar, final int i) {
        bzf bzfVar = this.f;
        bzfVar.g().b(new Runnable() { // from class: bza
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
            
                if (r4.e == r2) goto L41;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 349
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bza.run():void");
            }
        }, bzfVar.h);
    }
}
