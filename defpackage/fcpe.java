package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpe implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ CyclicBarrier b;
    final /* synthetic */ fcom c;
    final /* synthetic */ CountDownLatch d;
    final /* synthetic */ fcpj e;

    public fcpe(fcpj fcpjVar, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, fcom fcomVar, CountDownLatch countDownLatch2) {
        this.a = countDownLatch;
        this.b = cyclicBarrier;
        this.c = fcomVar;
        this.d = countDownLatch2;
        this.e = fcpjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
    
        r8 = new defpackage.ffez();
        r8.V(r14, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        if (r7 >= r15) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        r2 = r14.codePointAt(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
    
        if (r2 != r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e7, code lost:
    
        r2 = r7 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
    
        if (r2 >= r15) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        r6 = defpackage.fcre.a(r14.charAt(r7 + 1));
        r2 = defpackage.fcre.a(r14.charAt(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0102, code lost:
    
        if (r6 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
    
        if (r2 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0109, code lost:
    
        r8.P((r6 << 4) + r2);
        r7 = r2;
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0114, code lost:
    
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
    
        r8.W(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011b, code lost:
    
        r7 = r7 + java.lang.Character.charCount(r2);
        r3 = r20;
        r6 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0126, code lost:
    
        r2 = r8.n();
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0577 A[Catch: all -> 0x0579, DONT_GENERATE, TryCatch #13 {, blocks: (B:229:0x0535, B:231:0x0540, B:233:0x0549, B:236:0x0550, B:238:0x0556, B:242:0x055b, B:243:0x0577), top: B:324:0x0535, inners: #9 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcpe.run():void");
    }
}
