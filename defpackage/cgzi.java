package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgzi implements cgxw {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager");
    public final cgyb b;
    public final cgzo c;
    public final chaw d;
    public final cgxu e;
    public final chbf f;
    public final fcyh g;
    public final fdjx h;
    public final fdjx i;
    private final Map j;
    private final cogw k;
    private final chab l;
    private final arrm m;
    private final aryk n;
    private final cgxi o;

    public cgzi(Map map, cgyb cgybVar, cgzo cgzoVar, chaw chawVar, cgxi cgxiVar, cgxu cgxuVar, chbf chbfVar, cogw cogwVar, chab chabVar, arrm arrmVar, fcyh fcyhVar, fdjx fdjxVar, fdjx fdjxVar2, aryk arykVar) {
        cogwVar.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        arykVar.getClass();
        this.j = map;
        this.b = cgybVar;
        this.c = cgzoVar;
        this.d = chawVar;
        this.o = cgxiVar;
        this.e = cgxuVar;
        this.f = chbfVar;
        this.k = cogwVar;
        this.l = chabVar;
        this.m = arrmVar;
        this.g = fcyhVar;
        this.h = fdjxVar;
        this.i = fdjxVar2;
        this.n = arykVar;
    }

    public static final cgyh r(cgxv cgxvVar, cgxy cgxyVar) {
        cgyh cgyhVarG = cgxvVar.g();
        if (cgyhVarG != null) {
            return cgyhVarG;
        }
        throw new IllegalStateException("Pipeline " + cgxyVar.name() + " does not have a serializer.");
    }

    static /* synthetic */ Object s(cgzi cgziVar, fcxy fcxyVar) {
        long j = fdhi.a;
        return cgziVar.t(fdhk.f(0, fdhl.d), fcxyVar);
    }

    private final Object t(long j, fcxy fcxyVar) {
        Object objA = eicj.a(this.g, new cgzc(this, j, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    private final boolean u(cgxy cgxyVar) {
        return this.n.a() && cgxyVar == cgxy.e;
    }

    @Override // defpackage.cgxw
    public final Object a(cgxy cgxyVar, Object obj, fcxy fcxyVar) {
        cgxv cgxvVar = (cgxv) this.j.get(cgxyVar);
        if (cgxvVar != null) {
            return p(cgzw.b(), cgxyVar, new cgyl(this, cgxyVar, cgxvVar, obj, null), fcxyVar);
        }
        this.e.c(cgxyVar, 3);
        Objects.toString(cgxyVar);
        throw new IllegalStateException("No pipeline found for type ".concat(String.valueOf(cgxyVar)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (defpackage.fdii.c((java.util.Collection) r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cgxw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cgym
            if (r0 == 0) goto L13
            r0 = r6
            cgym r0 = (defpackage.cgym) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgym r0 = new cgym
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L4c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L41
        L36:
            defpackage.fctl.b(r6)
            r0.c = r4
            java.lang.Object r6 = r5.i(r0)
            if (r6 == r1) goto L4f
        L41:
            java.util.Collection r6 = (java.util.Collection) r6
            r0.c = r3
            java.lang.Object r6 = defpackage.fdii.c(r6, r0)
            if (r6 != r1) goto L4c
            goto L4f
        L4c:
            fctx r6 = defpackage.fctx.a
            return r6
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cgxw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cgxy r9, java.lang.Object r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.cgyq
            if (r0 == 0) goto L13
            r0 = r11
            cgyq r0 = (defpackage.cgyq) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cgyq r0 = new cgyq
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            cgxy r0 = r0.f
            defpackage.fctl.b(r11)     // Catch: java.lang.ClassCastException -> L31
            r7 = r11
            r11 = r9
            r9 = r0
            r0 = r7
            goto L69
        L31:
            r11 = move-exception
            r7 = r11
            r11 = r9
            r9 = r0
            r0 = r7
            goto L7c
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            defpackage.fctl.b(r11)
            cgxv r11 = r8.f(r9)
            if (r11 == 0) goto Lac
            cgxk r2 = r11.a()     // Catch: java.lang.ClassCastException -> L79
            cgxu r4 = r8.e     // Catch: java.lang.ClassCastException -> L79
            r9.getClass()     // Catch: java.lang.ClassCastException -> L79
            ains r4 = r4.a     // Catch: java.lang.ClassCastException -> L79
            java.lang.String r5 = defpackage.cgxu.b(r9)     // Catch: java.lang.ClassCastException -> L79
            r6 = 2
            r4.e(r5, r6)     // Catch: java.lang.ClassCastException -> L79
            r0.f = r9     // Catch: java.lang.ClassCastException -> L79
            r0.a = r10     // Catch: java.lang.ClassCastException -> L79
            r0.b = r11     // Catch: java.lang.ClassCastException -> L79
            r0.e = r3     // Catch: java.lang.ClassCastException -> L79
            java.lang.Object r0 = r2.c(r10, r0)     // Catch: java.lang.ClassCastException -> L79
            if (r0 == r1) goto L7b
        L69:
            cgxu r1 = r8.e     // Catch: java.lang.ClassCastException -> L79
            r9.getClass()     // Catch: java.lang.ClassCastException -> L79
            ains r1 = r1.a     // Catch: java.lang.ClassCastException -> L79
            java.lang.String r2 = defpackage.cgxu.b(r9)     // Catch: java.lang.ClassCastException -> L79
            r4 = 3
            r1.e(r2, r4)     // Catch: java.lang.ClassCastException -> L79
            return r0
        L79:
            r0 = move-exception
            goto L7c
        L7b:
            return r1
        L7c:
            cgxu r1 = r8.e
            r1.c(r9, r3)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.Class r10 = r10.getClass()
            int r1 = defpackage.fdcj.a
            fdbi r1 = new fdbi
            r1.<init>(r10)
            fddy r10 = r11.f()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "Type mismatch. Provided subject is "
            r11.<init>(r2)
            r11.append(r1)
            java.lang.String r1 = " but the pipeline requires a "
            r11.append(r1)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10, r0)
            throw r9
        Lac:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.c(cgxy, java.lang.Object, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cgxw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cgzx r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.d(cgzx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107 A[PHI: r0 r3
      0x0107: PHI (r0v16 cgzx) = (r0v15 cgzx), (r0v20 cgzx) binds: [B:48:0x0105, B:21:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r3v9 cgxy) = (r3v8 cgxy), (r3v15 cgxy) binds: [B:48:0x0105, B:21:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.cgxw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cgxy r17, java.lang.Object r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.e(cgxy, java.lang.Object, fcxy):java.lang.Object");
    }

    public final cgxv f(cgxy cgxyVar) {
        cgxv cgxvVar = (cgxv) this.j.get(cgxyVar);
        if (cgxvVar == null) {
            this.e.c(cgxyVar, 3);
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BuglePipeline");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrz ekrzVar = cgxx.a;
            ekrdVar.X(cgxx.b, cgxyVar);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager", "getEntry", 479, "PwqBackedPipelineManager.kt")).q("No pipeline entry found");
        }
        return cgxvVar;
    }

    public final cgyg g(cgyg cgygVar, int i, cgxy cgxyVar) {
        if (cgygVar.c != 2) {
            return cgygVar;
        }
        cgxi cgxiVar = this.o;
        Integer num = (Integer) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((cgxr) cgxiVar.a.b()).b), cgxyVar.name(), Integer.valueOf(cgxiVar.a()));
        num.getClass();
        if (i < Math.min(num.intValue(), cgxiVar.a())) {
            return cgygVar;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BuglePipeline");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager", "enforceRetryLimit", 456, "PwqBackedPipelineManager.kt")).q("Retries exhausted.");
        cgxu cgxuVar = this.e;
        cgxuVar.a.e(cgxu.b(cgxyVar), 9);
        Throwable th = cgygVar.a;
        chhl chhlVar = cgygVar.b;
        return new cgyg(3, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cgyj
            if (r0 == 0) goto L13
            r0 = r7
            cgyj r0 = (defpackage.cgyj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgyj r0 = new cgyj
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L3c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.fctl.b(r7)
            chbf r7 = r6.f
            r0.c = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto La5
        L3c:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L4a
            r7 = 0
            goto L69
        L4a:
            java.lang.Object r0 = r7.next()
            chbd r0 = (defpackage.chbd) r0
            j$.time.Instant r0 = r0.f
        L52:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r7.next()
            chbd r1 = (defpackage.chbd) r1
            j$.time.Instant r1 = r1.f
            int r2 = r0.compareTo(r1)
            if (r2 <= 0) goto L52
            r0 = r1
            goto L52
        L68:
            r7 = r0
        L69:
            r0 = 0
            if (r7 == 0) goto L93
            cogw r2 = r6.k
            j$.time.Instant r2 = r2.f()
            r2.getClass()
            j$.time.Duration r7 = defpackage.eooc.a(r7, r2)
            long r2 = r7.getSeconds()
            fdhl r4 = defpackage.fdhl.d
            long r2 = defpackage.fdhk.g(r2, r4)
            int r7 = r7.getNano()
            fdhl r4 = defpackage.fdhl.a
            long r4 = defpackage.fdhk.f(r7, r4)
            long r2 = defpackage.fdhi.j(r2, r4)
            goto L96
        L93:
            long r2 = defpackage.fdhi.a
            r2 = r0
        L96:
            fdhi r7 = new fdhi
            r7.<init>(r2)
            fdhi r2 = new fdhi
            r2.<init>(r0)
            java.lang.Comparable r7 = defpackage.fcxl.c(r7, r2)
            return r7
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.h(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [cgzi] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:24:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.cgyn
            if (r0 == 0) goto L13
            r0 = r10
            cgyn r0 = (defpackage.cgyn) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            cgyn r0 = new cgyn
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r10)
            goto L80
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            defpackage.fctl.b(r10)
            goto L49
        L3c:
            defpackage.fctl.b(r10)
            chbf r10 = r9.f
            r0.f = r4
            java.lang.Object r10 = r10.b(r0)
            if (r10 == r1) goto L88
        L49:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.fcva.p(r10, r4)
            r2.<init>(r4)
            java.util.Iterator r10 = r10.iterator()
            r4 = r10
        L5b:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L87
            java.lang.Object r10 = r4.next()
            chbd r10 = (defpackage.chbd) r10
            cgzx r5 = r10.a
            cgxy r6 = r10.b
            cgyo r7 = new cgyo
            r8 = 0
            r7.<init>(r9, r10, r8)
            r0.a = r2
            r0.b = r4
            r0.c = r2
            r0.f = r3
            java.lang.Object r10 = r9.p(r5, r6, r7, r0)
            if (r10 == r1) goto L88
            r5 = r2
        L80:
            fdlr r10 = (defpackage.fdlr) r10
            r2.add(r10)
            r2 = r5
            goto L5b
        L87:
            return r2
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.i(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.cgxy r10, defpackage.cgxv r11, java.lang.Object r12, defpackage.fcxy r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.cgyp
            if (r0 == 0) goto L13
            r0 = r13
            cgyp r0 = (defpackage.cgyp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cgyp r0 = new cgyp
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 4
            java.lang.String r4 = "executeInternal"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager"
            java.lang.String r6 = "BuglePipeline"
            r7 = 1
            java.lang.String r8 = "PwqBackedPipelineManager.kt"
            if (r2 == 0) goto L3e
            if (r2 != r7) goto L36
            java.lang.Object r11 = r0.a
            cgxy r10 = r0.e
            defpackage.fctl.b(r13)     // Catch: java.lang.Throwable -> L34
            goto L65
        L34:
            r11 = move-exception
            goto L6f
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            defpackage.fctl.b(r13)
            ekrg r13 = defpackage.cgzi.a
            ekrw r13 = r13.h()
            ekrz r2 = defpackage.eksq.a
            r13.X(r2, r6)
            r2 = 170(0xaa, float:2.38E-43)
            ekrw r13 = r13.h(r5, r4, r2, r8)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r2 = "Starting pipeline execution"
            r13.q(r2)
            r0.e = r10     // Catch: java.lang.Throwable -> L34
            r0.a = r11     // Catch: java.lang.Throwable -> L34
            r0.d = r7     // Catch: java.lang.Throwable -> L34
            java.lang.Object r13 = r9.c(r10, r12, r0)     // Catch: java.lang.Throwable -> L34
            if (r13 == r1) goto L6e
        L65:
            cgzu r11 = r11.c()     // Catch: java.lang.Throwable -> L34
            cgyg r11 = r11.a(r13)     // Catch: java.lang.Throwable -> L34
            goto L9b
        L6e:
            return r1
        L6f:
            ekrg r12 = defpackage.cgzi.a
            ekrw r12 = r12.i()
            ekrz r13 = defpackage.eksq.a
            r12.X(r13, r6)
            ekrd r12 = (defpackage.ekrd) r12
            ekrw r12 = r12.g(r11)
            r13 = 178(0xb2, float:2.5E-43)
            ekrw r12 = r12.h(r5, r4, r13, r8)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r13 = "Pipeline execution failed"
            r12.q(r13)
            cgxu r12 = r9.e
            r13 = 9
            r12.c(r10, r13)
            cgyg r12 = new cgyg
            r13 = 3
            r12.<init>(r13, r11, r3)
            r11 = r12
        L9b:
            ekrg r12 = defpackage.cgzi.a
            ekrw r12 = r12.h()
            ekrz r13 = defpackage.eksq.a
            r12.X(r13, r6)
            r13 = 183(0xb7, float:2.56E-43)
            ekrw r12 = r12.h(r5, r4, r13, r8)
            ekrd r12 = (defpackage.ekrd) r12
            int r13 = r11.c
            java.lang.String r0 = "Finished pipeline execution. Result: %s"
            java.lang.String r1 = defpackage.cgyf.a(r13)
            r12.t(r0, r1)
            cgxu r12 = r9.e
            r10.getClass()
            cgxy r0 = defpackage.cgxy.a
            int r13 = r13 + (-1)
            if (r13 == 0) goto Lc9
            if (r13 == r7) goto Lc8
            r3 = 6
            goto Lc9
        Lc8:
            r3 = 5
        Lc9:
            ains r12 = r12.a
            java.lang.String r10 = defpackage.cgxu.b(r10)
            r12.e(r10, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.j(cgxy, cgxv, java.lang.Object, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.chbe r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cgyu
            if (r0 == 0) goto L13
            r0 = r10
            cgyu r0 = (defpackage.cgyu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgyu r0 = new cgyu
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            chbe r9 = r0.d
            defpackage.fctl.b(r10)
            goto Lad
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            defpackage.fctl.b(r10)
            cgxy r10 = r9.b
            cgxv r2 = r8.f(r10)
            r4 = 6
            r5 = 0
            r6 = 3
            if (r2 != 0) goto L41
            goto L5a
        L41:
            boolean r7 = r8.u(r10)
            if (r7 == 0) goto L60
            cgyh r10 = r(r2, r10)     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r10 = move-exception
            java.lang.Object r10 = defpackage.fctl.a(r10)
        L51:
            java.lang.Throwable r7 = defpackage.fctk.c(r10)
            if (r7 != 0) goto L5a
            cgyh r10 = (defpackage.cgyh) r10
            goto L94
        L5a:
            cgyg r9 = new cgyg
            r9.<init>(r6, r5, r4)
            return r9
        L60:
            cgyh r10 = r2.g()
            if (r10 != 0) goto L94
            ekrg r10 = defpackage.cgzi.a
            ekrw r10 = r10.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "BuglePipeline"
            r10.X(r0, r1)
            r0 = 145(0x91, float:2.03E-43)
            java.lang.String r1 = "PwqBackedPipelineManager.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager"
            java.lang.String r3 = "executeWorkItem"
            ekrw r10 = r10.h(r2, r3, r0, r1)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Cannot run pipeline work without corresponding serializer."
            r10.q(r0)
            cgxu r10 = r8.e
            cgxy r9 = r9.b
            r0 = 5
            r10.c(r9, r0)
            cgyg r9 = new cgyg
            r9.<init>(r6, r5, r4)
            return r9
        L94:
            byte[] r4 = r9.c
            cgxy r5 = r9.b
            java.lang.Object r10 = r8.q(r10, r4, r5)
            java.lang.Throwable r4 = defpackage.fctk.c(r10)
            if (r4 != 0) goto Lb8
            r0.d = r9
            r0.c = r3
            java.lang.Object r10 = r8.j(r5, r2, r10, r0)
            if (r10 != r1) goto Lad
            return r1
        Lad:
            cgyg r10 = (defpackage.cgyg) r10
            int r0 = r9.f
            cgxy r9 = r9.b
            cgyg r9 = r8.g(r10, r0, r9)
            return r9
        Lb8:
            cgyg r9 = new cgyg
            r10 = 4
            r9.<init>(r6, r4, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.k(chbe, fcxy):java.lang.Object");
    }

    public final Object l(fcxy fcxyVar) {
        Object objA = fdjy.a(new cgyx(this, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (r11.t(r12, r0) != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.chbd r11, defpackage.cgxv r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.cgzd
            if (r0 == 0) goto L13
            r0 = r13
            cgzd r0 = (defpackage.cgzd) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cgzd r0 = new cgzd
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L50
            if (r2 == r6) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            defpackage.fctl.b(r13)
            goto Lb8
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            java.lang.Object r11 = r0.a
            cgzi r11 = (defpackage.cgzi) r11
            defpackage.fctl.b(r13)
            goto La9
        L42:
            defpackage.fctl.b(r13)
            goto L9e
        L46:
            java.lang.Object r12 = r0.b
            java.lang.Object r11 = r0.a
            chbd r11 = (defpackage.chbd) r11
            defpackage.fctl.b(r13)
            goto L63
        L50:
            defpackage.fctl.b(r13)
            chbf r13 = r10.f
            cgzx r2 = r11.a
            r0.a = r11
            r0.b = r12
            r0.e = r6
            java.lang.Object r13 = r13.e(r2, r0)
            if (r13 == r1) goto Lbb
        L63:
            chhp r12 = r12.e()
            chho r13 = r12.b
            long r8 = r12.a
            int r12 = r11.g
            long r12 = r13.a(r8, r12)
            chbf r2 = r10.f
            cogw r6 = r10.k
            j$.time.Instant r6 = r6.f()
            long r8 = defpackage.fdhi.h(r12)
            int r12 = defpackage.fdhi.d(r12)
            long r12 = (long) r12
            j$.time.Duration r12 = j$.time.Duration.ofSeconds(r8, r12)
            r12.getClass()
            j$.time.Instant r12 = r6.plus(r12)
            r12.getClass()
            r0.a = r7
            r0.b = r7
            r0.e = r5
            cgzx r11 = r11.a
            java.lang.Object r11 = r2.g(r11, r12, r0)
            if (r11 == r1) goto Lbb
        L9e:
            r0.a = r10
            r0.e = r4
            java.lang.Object r13 = r10.h(r0)
            if (r13 == r1) goto Lbb
            r11 = r10
        La9:
            fdhi r13 = (defpackage.fdhi) r13
            long r12 = r13.c
            r0.a = r7
            r0.e = r3
            java.lang.Object r11 = r11.t(r12, r0)
            if (r11 != r1) goto Lb8
            goto Lbb
        Lb8:
            fctx r11 = defpackage.fctx.a
            return r11
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.m(chbd, cgxv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r10.t(r11, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.chbd r10, defpackage.cgxv r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.cgze
            if (r0 == 0) goto L13
            r0 = r12
            cgze r0 = (defpackage.cgze) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgze r0 = new cgze
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r12)
            goto L94
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            cgzi r10 = r0.d
            defpackage.fctl.b(r12)
            goto L84
        L3b:
            defpackage.fctl.b(r12)
            goto L79
        L3f:
            defpackage.fctl.b(r12)
            chhp r11 = r11.e()
            chho r12 = r11.b
            long r6 = r11.a
            int r11 = r10.g
            long r11 = r12.a(r6, r11)
            chbf r2 = r9.f
            cgzx r10 = r10.a
            cogw r6 = r9.k
            j$.time.Instant r6 = r6.f()
            long r7 = defpackage.fdhi.h(r11)
            int r11 = defpackage.fdhi.d(r11)
            long r11 = (long) r11
            j$.time.Duration r11 = j$.time.Duration.ofSeconds(r7, r11)
            r11.getClass()
            j$.time.Instant r11 = r6.plus(r11)
            r11.getClass()
            r0.c = r5
            java.lang.Object r10 = r2.h(r10, r11, r0)
            if (r10 == r1) goto L97
        L79:
            r0.d = r9
            r0.c = r4
            java.lang.Object r12 = r9.h(r0)
            if (r12 == r1) goto L97
            r10 = r9
        L84:
            fdhi r12 = (defpackage.fdhi) r12
            long r11 = r12.c
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r10 = r10.t(r11, r0)
            if (r10 != r1) goto L94
            goto L97
        L94:
            fctx r10 = defpackage.fctx.a
            return r10
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.n(chbd, cgxv, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r6, defpackage.cgxv r7, defpackage.chbd r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.cgzf
            if (r0 == 0) goto L13
            r0 = r9
            cgzf r0 = (defpackage.cgzf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgzf r0 = new cgzf
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L27
            goto L62
        L27:
            r6 = move-exception
            goto L65
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r9)
            r9 = 2
            chai[] r9 = new defpackage.chai[r9]     // Catch: java.lang.Throwable -> L27
            chab r2 = r5.l     // Catch: java.lang.Throwable -> L27
            r8.getClass()     // Catch: java.lang.Throwable -> L27
            chaa r4 = new chaa     // Catch: java.lang.Throwable -> L27
            r4.<init>(r8, r2)     // Catch: java.lang.Throwable -> L27
            r8 = 0
            r9[r8] = r4     // Catch: java.lang.Throwable -> L27
            chai r7 = r7.d()     // Catch: java.lang.Throwable -> L27
            r9[r3] = r7     // Catch: java.lang.Throwable -> L27
            chaf r7 = new chaf     // Catch: java.lang.Throwable -> L27
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L27
            fdpl r6 = r7.a(r6)     // Catch: java.lang.Throwable -> L27
            cgzg r7 = new cgzg     // Catch: java.lang.Throwable -> L27
            r8 = 0
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = defpackage.fdtc.b(r6, r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r9 != r1) goto L62
            return r1
        L62:
            chah r9 = (defpackage.chah) r9     // Catch: java.lang.Throwable -> L27
            goto L69
        L65:
            java.lang.Object r9 = defpackage.fctl.a(r6)
        L69:
            java.lang.Throwable r6 = defpackage.fctk.c(r9)
            if (r6 != 0) goto L70
            return r9
        L70:
            boolean r7 = r6 instanceof java.util.NoSuchElementException
            if (r7 == 0) goto L9d
            ekrg r7 = defpackage.cgzi.a
            ekrw r7 = r7.j()
            ekrz r8 = defpackage.eksq.a
            java.lang.String r9 = "BuglePipeline"
            r7.X(r8, r9)
            ekrd r7 = (defpackage.ekrd) r7
            ekrw r6 = r7.g(r6)
            r7 = 348(0x15c, float:4.88E-43)
            java.lang.String r8 = "PwqBackedPipelineManager.kt"
            java.lang.String r9 = "com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager"
            java.lang.String r0 = "waitForConstraints"
            ekrw r6 = r6.h(r9, r0, r7, r8)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r7 = "Pipeline execution constraints were not met."
            r6.q(r7)
            chah r6 = defpackage.chah.a
            return r6
        L9d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.o(java.lang.Object, cgxv, chbd, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [cgzx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.cgzx r5, defpackage.cgxy r6, defpackage.fdap r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.cgzh
            if (r0 == 0) goto L13
            r0 = r8
            cgzh r0 = (defpackage.cgzh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cgzh r0 = new cgzh
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r6 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r8)
            ekvr r8 = defpackage.ekvw.a()
            ekrz r2 = defpackage.cgxx.a
            ekrz r2 = defpackage.cgxx.a
            r8.b(r2, r5)
            ekrz r5 = defpackage.cgxx.b
            r8.b(r5, r6)
            ekvt r5 = r8.a()
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L29
            if (r8 == r1) goto L59
        L54:
            r6 = 0
            defpackage.fczl.a(r5, r6)
            return r8
        L59:
            return r1
        L5a:
            throw r6     // Catch: java.lang.Throwable -> L5b
        L5b:
            r7 = move-exception
            defpackage.fczl.a(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgzi.p(cgzx, cgxy, fdap, fcxy):java.lang.Object");
    }

    public final Object q(cgyh cgyhVar, byte[] bArr, cgxy cgxyVar) {
        try {
            try {
                evuo evuoVar = (evuo) cgyhVar.b.b();
                if (bArr == null) {
                    bArr = new byte[0];
                }
                Object objH = evuoVar.h(bArr);
                ejvj ejvjVarFH = ((ejvj) cgyhVar.a.b()).fH();
                objH.getClass();
                return ejvk.a(ejvjVarFH, objH);
            } catch (evtj e) {
                throw new cgzr(e);
            }
        } catch (cgzs e2) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BuglePipeline");
            ((ekrd) ((ekrd) ekrwVarJ).g(e2).h("com/google/android/apps/messaging/shared/pipeline/PwqBackedPipelineManager", "attemptDeserialize-0E7RQCE", 378, "PwqBackedPipelineManager.kt")).q("Unable to deserialize pipeline subject.");
            this.e.c(cgxyVar, 8);
            return fctl.a(e2);
        }
    }
}
