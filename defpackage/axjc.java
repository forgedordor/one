package defpackage;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axjc implements Executor {
    public final int a;
    private final Executor e;
    public final Object b = new Object();
    public int d = 0;
    public final Deque c = new ConcurrentLinkedDeque();

    public axjc(Executor executor, int i) {
        this.e = executor;
        this.a = i;
    }

    public final void a() {
        ejwl.l(!Thread.holdsLock(this.b));
        auvh.h(eijx.f(new Runnable() { // from class: axjb
            /* JADX WARN: Code restructure failed: missing block: B:100:0x00fa, code lost:
            
                if (r1 == false) goto L101;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x00fc, code lost:
            
                r0.a();
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
            
                defpackage.ejwl.l(!java.lang.Thread.holdsLock(r0.b));
                r4.run();
                r4 = (java.lang.Runnable) r0.c.pollFirst();
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
            
                if (r4 != null) goto L122;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
            
                r3 = r0.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
            
                monitor-enter(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
            
                if (r0.d <= 0) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x007a, code lost:
            
                r4 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x007c, code lost:
            
                r4 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x007d, code lost:
            
                defpackage.ejwl.l(r4);
                r4 = r0.d;
                r5 = r0.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
            
                if (r4 > r5) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
            
                r4 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0088, code lost:
            
                r4 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
            
                defpackage.ejwl.l(r4);
                r4 = r0.d - 1;
                r0.d = r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0092, code lost:
            
                if (r4 < 0) goto L54;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0094, code lost:
            
                r4 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0096, code lost:
            
                r4 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0097, code lost:
            
                defpackage.ejwl.l(r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
            
                if (r0.d >= r5) goto L58;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x009e, code lost:
            
                r1 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x009f, code lost:
            
                defpackage.ejwl.l(r1);
                r1 = r0.c.isEmpty();
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x00a8, code lost:
            
                monitor-exit(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x00a9, code lost:
            
                if (r1 != false) goto L124;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
            
                r0.a();
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x00ae, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x00b2, code lost:
            
                r3 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x00b3, code lost:
            
                r5 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x00c6, code lost:
            
                monitor-enter(r0.b);
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x00c9, code lost:
            
                if (r0.d > 0) goto L85;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x00cb, code lost:
            
                r5 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x00cd, code lost:
            
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x00ce, code lost:
            
                defpackage.ejwl.l(r5);
                r5 = r0.d;
                r6 = r0.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x00d5, code lost:
            
                if (r5 <= r6) goto L89;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x00d7, code lost:
            
                r5 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x00d9, code lost:
            
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x00da, code lost:
            
                defpackage.ejwl.l(r5);
                r5 = r0.d - 1;
                r0.d = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x00e3, code lost:
            
                if (r5 >= 0) goto L93;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x00e5, code lost:
            
                r5 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x00e7, code lost:
            
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x00e8, code lost:
            
                defpackage.ejwl.l(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x00ed, code lost:
            
                if (r0.d < r6) goto L97;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x00ef, code lost:
            
                r1 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:98:0x00f0, code lost:
            
                defpackage.ejwl.l(r1);
                r1 = r0.c.isEmpty();
             */
            /* JADX WARN: Removed duplicated region for block: B:81:0x00c4  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 260
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.axjb.run():void");
            }
        }, this.e));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i;
        int i2;
        this.c.addLast(runnable);
        synchronized (this.b) {
            boolean z = true;
            ejwl.l(this.d >= 0);
            int i3 = this.d;
            i = this.a;
            if (i3 > i) {
                z = false;
            }
            ejwl.l(z);
            i2 = this.d;
        }
        if (i2 < i) {
            a();
        }
    }
}
