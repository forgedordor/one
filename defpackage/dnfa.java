package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnfa {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/core/data/usage/FrecencyProcessor");
    public final eony b;
    public final dngc c;
    public final fdap d;
    public final feav e = new feaz();
    public Map f;
    private final dnfv g;

    public dnfa(eony eonyVar, dngc dngcVar, dnfv dnfvVar, fdap fdapVar) {
        this.b = eonyVar;
        this.c = dngcVar;
        this.g = dnfvVar;
        this.d = fdapVar;
    }

    public static /* synthetic */ Object f(dnfa dnfaVar, Iterable iterable, Instant instant, dnce dnceVar, int i, fcxy fcxyVar, int i2) {
        if ((i2 & 2) != 0) {
            instant = dnfaVar.b.a();
        }
        Instant instant2 = instant;
        if ((i2 & 8) != 0) {
            i = 50;
        }
        return dnfaVar.b(iterable, instant2, dnceVar, i, fcxyVar);
    }

    public final double a(dnft dnftVar, Instant instant, dnce dnceVar) {
        double d = fdbq.f(dnftVar.a(), dnceVar) ? this.g.a : this.g.b;
        Duration.between(dnftVar.b(), instant).getClass();
        return d * Math.pow(0.95d, Math.sqrt(r5.toMillis() / this.g.c.toMillis()) + 1.0d) * 5.0d;
    }

    public final Object b(Iterable iterable, Instant instant, dnce dnceVar, int i, fcxy fcxyVar) {
        return this.c.c("FrecencyProcessor#computeFrecent", new dnew(this, iterable, instant, dnceVar, i, null), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #0 {all -> 0x0099, blocks: (B:27:0x007a, B:30:0x0081, B:31:0x0085, B:33:0x008c, B:35:0x0091), top: B:41:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:27:0x007a, B:30:0x0081, B:31:0x0085, B:33:0x008c, B:35:0x0091), top: B:41:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r9, defpackage.dnce r10, j$.time.Instant r11, int r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.dney
            if (r0 == 0) goto L13
            r0 = r13
            dney r0 = (defpackage.dney) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dney r0 = new dney
            r0.<init>(r8, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.c
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L45
            if (r1 == r2) goto L3a
            if (r1 != r7) goto L32
            int r9 = r6.b
            feaz r10 = r6.f
            java.lang.Object r11 = r6.a
            defpackage.fctl.b(r13)
            r1 = r8
            goto L7a
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            int r9 = r6.b
            java.lang.Object r10 = r6.a
            defpackage.fctl.b(r13)
            r1 = r8
            r12 = r9
            r9 = r10
            goto L64
        L45:
            defpackage.fctl.b(r13)
            java.util.Map r13 = r8.f
            if (r13 != 0) goto L62
            r13 = r2
            fcvo r2 = defpackage.fcvo.a
            r6.a = r9
            r6.b = r12
            r6.e = r13
            r1 = r8
            r4 = r10
            r3 = r11
            r5 = r12
            java.lang.Object r10 = r1.b(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L60
            goto L77
        L60:
            r12 = r5
            goto L64
        L62:
            r1 = r8
            r5 = r12
        L64:
            feav r10 = r1.e
            r6.a = r9
            r11 = r10
            feaz r11 = (defpackage.feaz) r11
            r6.f = r11
            r6.b = r12
            r6.e = r7
            java.lang.Object r11 = r10.b(r6)
            if (r11 != r0) goto L78
        L77:
            return r0
        L78:
            r11 = r9
            r9 = r12
        L7a:
            java.util.Map r12 = r1.f     // Catch: java.lang.Throwable -> L99
            r13 = 0
            java.lang.String r0 = "scores"
            if (r12 != 0) goto L85
            defpackage.fdbq.c(r0)     // Catch: java.lang.Throwable -> L99
            r12 = r13
        L85:
            r12.remove(r11)     // Catch: java.lang.Throwable -> L99
            java.util.Map r11 = r1.f     // Catch: java.lang.Throwable -> L99
            if (r11 != 0) goto L90
            defpackage.fdbq.c(r0)     // Catch: java.lang.Throwable -> L99
            goto L91
        L90:
            r13 = r11
        L91:
            fdev r9 = r8.e(r13, r9)     // Catch: java.lang.Throwable -> L99
            r10.d()
            return r9
        L99:
            r0 = move-exception
            r9 = r0
            r10.d()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnfa.c(java.lang.Object, dnce, j$.time.Instant, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r12.b(r6) != r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dnft r9, j$.time.Instant r10, defpackage.dnce r11, int r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.dnez
            if (r0 == 0) goto L13
            r0 = r13
            dnez r0 = (defpackage.dnez) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dnez r0 = new dnez
            r0.<init>(r8, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.c
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 == r3) goto L40
            if (r1 != r2) goto L38
            double r9 = r6.b
            int r12 = r6.a
            feaz r11 = r6.g
            dneb r0 = r6.f
            defpackage.fctl.b(r13)
            r1 = r8
            r5 = r12
            r12 = r11
            r10 = r9
            r9 = r0
            goto L7d
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            defpackage.fctl.b(r13)
            return r13
        L44:
            defpackage.fctl.b(r13)
            java.util.Map r13 = r8.f
            if (r13 != 0) goto L5d
            java.util.List r2 = defpackage.fcva.b(r9)
            r6.e = r3
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r9 = r1.b(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L5c
            goto Lbc
        L5c:
            return r9
        L5d:
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            double r10 = r8.a(r9, r3, r4)
            feav r12 = r1.e
            r13 = r9
            dneb r13 = (defpackage.dneb) r13
            r6.f = r13
            r13 = r12
            feaz r13 = (defpackage.feaz) r13
            r6.g = r13
            r6.a = r5
            r6.b = r10
            r6.e = r2
            java.lang.Object r13 = r12.b(r6)
            if (r13 == r0) goto Lbc
        L7d:
            fdap r13 = r1.d     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r9 = r13.invoke(r9)     // Catch: java.lang.Throwable -> Lb6
            java.util.Map r13 = r1.f     // Catch: java.lang.Throwable -> Lb6
            r0 = 0
            java.lang.String r2 = "scores"
            if (r13 != 0) goto L8e
            defpackage.fdbq.c(r2)     // Catch: java.lang.Throwable -> Lb6
            r13 = r0
        L8e:
            java.lang.Object r3 = r13.get(r9)     // Catch: java.lang.Throwable -> Lb6
            if (r3 != 0) goto L9e
            dnes r3 = new dnes     // Catch: java.lang.Throwable -> Lb6
            r6 = 0
            r3.<init>(r9, r6)     // Catch: java.lang.Throwable -> Lb6
            r13.put(r9, r3)     // Catch: java.lang.Throwable -> Lb6
        L9e:
            dnes r3 = (defpackage.dnes) r3     // Catch: java.lang.Throwable -> Lb6
            double r6 = r3.b     // Catch: java.lang.Throwable -> Lb6
            double r6 = r6 + r10
            r3.b = r6     // Catch: java.lang.Throwable -> Lb6
            java.util.Map r9 = r1.f     // Catch: java.lang.Throwable -> Lb6
            if (r9 != 0) goto Lad
            defpackage.fdbq.c(r2)     // Catch: java.lang.Throwable -> Lb6
            goto Lae
        Lad:
            r0 = r9
        Lae:
            fdev r9 = r8.e(r0, r5)     // Catch: java.lang.Throwable -> Lb6
            r12.d()
            return r9
        Lb6:
            r0 = move-exception
            r9 = r0
            r12.d()
            throw r9
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnfa.d(dnft, j$.time.Instant, dnce, int, fcxy):java.lang.Object");
    }

    public final fdev e(final Map map, final int i) {
        return (fdev) this.c.d("FrecencyProcessor#topEntityFrecencies", new fdae() { // from class: dnet
            @Override // defpackage.fdae
            public final Object invoke() {
                int i2 = i;
                return i2 == 0 ? fdeo.a : fdey.l(new fdfl(new fdeq(fcva.ax(map.values()), true, new fdap() { // from class: dnev
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        dnes dnesVar = (dnes) obj;
                        dnesVar.getClass();
                        return Boolean.valueOf(dnesVar.b > 0.0d);
                    }
                }), new dnex()), i2);
            }
        });
    }
}
