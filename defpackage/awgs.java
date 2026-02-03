package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgs {
    public final cogw a;
    public final Duration b;
    public Instant c;
    private final feav d = new feaz();
    private final AtomicReference e = new AtomicReference();

    public awgs(cogw cogwVar, Duration duration) {
        this.a = cogwVar;
        this.b = duration;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.c = instant;
    }

    public final Object a() {
        return DesugarAtomicReference.updateAndGet(this.e, new UnaryOperator() { // from class: awgq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                awgs awgsVar = this.a;
                if (Duration.between(awgsVar.c, awgsVar.a.f()).compareTo(awgsVar.b) > 0) {
                    return null;
                }
                return obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [fdap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fdap r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.awgr
            if (r0 == 0) goto L13
            r0 = r7
            awgr r0 = (defpackage.awgr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            awgr r0 = new awgr
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.a
            feav r6 = (defpackage.feav) r6
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L6b
        L2e:
            r7 = move-exception
            goto L79
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            feaz r6 = r0.e
            java.lang.Object r2 = r0.a
            fdap r2 = (defpackage.fdap) r2
            defpackage.fctl.b(r7)
            goto L58
        L42:
            defpackage.fctl.b(r7)
            feav r7 = r5.d
            r0.a = r6
            r2 = r7
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.d = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L7d
            r2 = r6
            r6 = r7
        L58:
            java.lang.Object r7 = r5.a()     // Catch: java.lang.Throwable -> L2e
            if (r7 != 0) goto L75
            r0.a = r6     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r0.e = r7     // Catch: java.lang.Throwable -> L2e
            r0.d = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r7 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L2e
            if (r7 == r1) goto L7d
        L6b:
            java.util.concurrent.atomic.AtomicReference r0 = r5.e     // Catch: java.lang.Throwable -> L2e
            awgp r1 = new awgp     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(r0, r1)     // Catch: java.lang.Throwable -> L2e
        L75:
            r6.d()
            return r7
        L79:
            r6.d()
            throw r7
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awgs.b(fdap, fcxy):java.lang.Object");
    }
}
