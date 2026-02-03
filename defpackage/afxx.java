package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afxx extends aivg {
    public final fcsu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxx(fcsu fcsuVar, afxr afxrVar, Executor executor, fcsu fcsuVar2) {
        super(fcsuVar, afxrVar, executor);
        fcsuVar.getClass();
        executor.getClass();
        this.a = fcsuVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[PHI: r4
      0x002c: PHI (r4v6 int) = (r4v0 int), (r4v1 int), (r4v2 int), (r4v3 int) binds: [B:11:0x002a, B:16:0x0033, B:22:0x003c, B:28:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[PHI: r5
      0x0039: PHI (r5v4 int) = (r5v0 int), (r5v1 int), (r5v2 int) binds: [B:19:0x0037, B:25:0x0041, B:31:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void d(defpackage.afxx r6, int r7, int r8, int r9, int r10) {
        /*
            enuy r0 = defpackage.enuy.a
            evsf r0 = r0.createBuilder()
            enux r0 = (defpackage.enux) r0
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            enuy r1 = (defpackage.enuy) r1
            r2 = -1
            int r7 = r7 + r2
            r1.c = r7
            int r7 = r1.b
            r3 = 1
            r7 = r7 | r3
            r1.b = r7
            r7 = r10 & 2
            if (r7 == 0) goto L1e
            r8 = r2
        L1e:
            r7 = 4
            r1 = 2
            if (r8 != 0) goto L25
            r3 = 15
            goto L6d
        L25:
            if (r8 != r3) goto L29
            r3 = r1
            goto L6d
        L29:
            r4 = 3
            if (r8 != r1) goto L2e
        L2c:
            r3 = r4
            goto L6d
        L2e:
            if (r8 != r4) goto L32
            r3 = r7
            goto L6d
        L32:
            r4 = 5
            if (r8 != r7) goto L36
            goto L2c
        L36:
            r5 = 6
            if (r8 != r4) goto L3b
        L39:
            r3 = r5
            goto L6d
        L3b:
            r4 = 7
            if (r8 != r5) goto L3f
            goto L2c
        L3f:
            r5 = 8
            if (r8 != r4) goto L44
            goto L39
        L44:
            r4 = 9
            if (r8 != r5) goto L49
            goto L2c
        L49:
            r5 = 10
            if (r8 != r4) goto L4e
            goto L39
        L4e:
            r4 = 20
            if (r8 < r5) goto L57
            if (r8 >= r4) goto L57
            r3 = 11
            goto L6d
        L57:
            r5 = 50
            if (r8 < r4) goto L60
            if (r8 >= r5) goto L60
            r3 = 12
            goto L6d
        L60:
            r4 = 100
            if (r8 < r5) goto L69
            if (r8 >= r4) goto L69
            r3 = 13
            goto L6d
        L69:
            if (r8 < r4) goto L6d
            r3 = 14
        L6d:
            r8 = r10 & 4
            if (r8 == 0) goto L72
            r9 = r2
        L72:
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r0.instance
            enuy r8 = (defpackage.enuy) r8
            int r3 = r3 + r2
            r8.d = r3
            int r10 = r8.b
            r10 = r10 | r1
            r8.b = r10
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r0.instance
            enuy r8 = (defpackage.enuy) r8
            int r10 = r8.b
            r7 = r7 | r10
            r8.b = r7
            r8.e = r9
            evsn r7 = r0.build()
            r7.getClass()
            enuy r7 = (defpackage.enuy) r7
            afxt r8 = new afxt
            r8.<init>()
            r6.e(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxx.d(afxx, int, int, int, int):void");
    }

    private final void e(final fdap fdapVar) {
        k(new Supplier() { // from class: afxs
            @Override // java.util.function.Supplier
            public final Object get() {
                enuw enuwVar = (enuw) envf.a.createBuilder();
                enuwVar.getClass();
                envg envgVar = new envg(enuwVar);
                fdapVar.invoke(envgVar);
                evsn evsnVarBuild = envgVar.a.build();
                evsnVarBuild.getClass();
                return (envf) evsnVarBuild;
            }
        });
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new afxw(afxv.a);
    }

    public final void b(int i) {
        d(this, 8, 0, i, 2);
    }

    public final void c(int i, envd envdVar) {
        enuz enuzVar = (enuz) enva.a.createBuilder();
        enuzVar.copyOnWrite();
        enva envaVar = (enva) enuzVar.instance;
        envaVar.d = i - 1;
        envaVar.b |= 2;
        enuzVar.copyOnWrite();
        enva envaVar2 = (enva) enuzVar.instance;
        envaVar2.c = envdVar.e;
        envaVar2.b |= 1;
        evsn evsnVarBuild = enuzVar.build();
        evsnVarBuild.getClass();
        final enva envaVar3 = (enva) evsnVarBuild;
        e(new fdap() { // from class: afxu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                envg envgVar = (envg) obj;
                envgVar.getClass();
                enuw enuwVar = envgVar.a;
                enuwVar.copyOnWrite();
                envf envfVar = (envf) enuwVar.instance;
                envf envfVar2 = envf.a;
                envfVar.c = envaVar3;
                envfVar.b = 2;
                return fctx.a;
            }
        });
    }
}
