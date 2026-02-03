package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzi implements ahwe {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/impl/RestoreAnytimeCompatibleRestoreWorkflowSteps");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcyh g;
    public final fcsu h;
    public final fcsu i;
    public final fdjx j;
    public final ahtq k;
    public final fcsu l;
    public final arjj m;
    public final fcsu n;
    public final ahzu o;
    public final awgs p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final arjq t;
    private final fcsu u;
    private final feav v;

    public ahzi(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcyh fcyhVar, fcsu fcsuVar7, fcsu fcsuVar8, fdjx fdjxVar, ahtq ahtqVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, awgt awgtVar, fcsu fcsuVar12, arjq arjqVar, arjj arjjVar, fcsu fcsuVar13, fcsu fcsuVar14, ahzv ahzvVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcyhVar.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fdjxVar.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        ahzvVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.q = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fcyhVar;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.j = fdjxVar;
        this.k = ahtqVar;
        this.r = fcsuVar9;
        this.l = fcsuVar10;
        this.s = fcsuVar11;
        this.t = arjqVar;
        this.m = arjjVar;
        this.n = fcsuVar13;
        this.u = fcsuVar14;
        this.v = new feaz();
        this.o = ahzvVar.a(a, null, null);
        long j = fdhi.a;
        Object objB = fcsuVar12.b();
        objB.getClass();
        Duration durationOfSeconds = Duration.ofSeconds(fdhi.h(fdhk.g(((Number) objB).longValue(), fdhl.d)), fdhi.d(r1));
        durationOfSeconds.getClass();
        cogw cogwVar = (cogw) awgtVar.a.b();
        cogwVar.getClass();
        this.p = new awgs(cogwVar, durationOfSeconds);
    }

    static /* synthetic */ Object r(ahzi ahziVar, enzp enzpVar, UUID uuid, fcxy fcxyVar) {
        return ahziVar.w(enzpVar, uuid, true, fcxyVar);
    }

    private static final int t(List list, String str, Long l) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ahyo ahyoVar = (ahyo) obj;
            if (fdbq.f(ahyoVar.a, str) && (l == null || ahyoVar.b == l.longValue())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((ahyo) it.next()).c));
        }
        Iterator it2 = arrayList2.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue += ((Number) it2.next()).longValue();
        }
        return (int) jLongValue;
    }

    private static final ahwk u(List list, Long l) {
        return new ahwk(t(list, azvt.c.a, l), t(list, azvt.a.a, l), t(list, azvt.b.a, l), t(list, azvt.d.a, l));
    }

    private final Object v(long j, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.g), new ahyr(null, j), fcxyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.enzp r8, java.util.UUID r9, boolean r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.ahyz
            if (r0 == 0) goto L13
            r0 = r11
            ahyz r0 = (defpackage.ahyz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahyz r0 = new ahyz
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.util.UUID r8 = r0.e
            enzp r9 = r0.d
            defpackage.fctl.b(r11)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L48
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.fctl.b(r11)
            if (r10 == 0) goto L4f
            r0.d = r8
            r0.e = r9
            r0.c = r3
            java.lang.Object r11 = r7.m(r9, r0)
            if (r11 != r1) goto L48
            return r1
        L48:
            java.lang.Number r11 = (java.lang.Number) r11
            int r10 = r11.intValue()
            goto L50
        L4f:
            r10 = 5
        L50:
            r1 = r8
            r2 = r9
            fcsu r8 = r7.i
            java.lang.Object r8 = r8.b()
            r0 = r8
            ahwi r0 = (defpackage.ahwi) r0
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r10)
            r4 = 0
            r5 = 20
            j$.time.Duration r8 = defpackage.ahwi.c(r0, r1, r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.w(enzp, java.util.UUID, boolean, fcxy):java.lang.Object");
    }

    private final void x(enzp enzpVar, UUID uuid) {
        ahwi.d((ahwi) this.i.b(), enzpVar, 3, uuid, null, 0, 56);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i, enze enzeVar) {
        ahwi.d((ahwi) this.i.b(), enzp.REQUEST_RESTORE_AFTER_APP_UPDATE, i, null, enzeVar, 0, 44);
    }

    @Override // defpackage.ahwe
    public final int a() {
        return 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (j(r2, r8, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (j(r7, r8, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [ahzi] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r7v6, types: [fctx, java.lang.Object] */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.UUID r7, defpackage.aiaf r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ahyb
            if (r0 == 0) goto L13
            r0 = r9
            ahyb r0 = (defpackage.ahyb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ahyb r0 = new ahyb
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r9)
            goto L8f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.a
            feav r7 = (defpackage.feav) r7
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L7c
        L3d:
            r8 = move-exception
            goto L82
        L3f:
            feaz r7 = r0.f
            aiaf r8 = r0.e
            java.lang.Object r2 = r0.a
            java.util.UUID r2 = (java.util.UUID) r2
            defpackage.fctl.b(r9)
            goto L6c
        L4b:
            defpackage.fctl.b(r9)
            arjq r9 = r6.t
            boolean r9 = r9.a()
            if (r9 == 0) goto L86
            feav r9 = r6.v
            r0.a = r7
            r0.e = r8
            r2 = r9
            feaz r2 = (defpackage.feaz) r2
            r0.f = r2
            r0.d = r5
            java.lang.Object r2 = r9.b(r0)
            if (r2 != r1) goto L6a
            goto L8e
        L6a:
            r2 = r7
            r7 = r9
        L6c:
            r0.a = r7     // Catch: java.lang.Throwable -> L3d
            r9 = 0
            r0.e = r9     // Catch: java.lang.Throwable -> L3d
            r0.f = r9     // Catch: java.lang.Throwable -> L3d
            r0.d = r4     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r8 = r6.j(r2, r8, r0)     // Catch: java.lang.Throwable -> L3d
            if (r8 != r1) goto L7c
            goto L8e
        L7c:
            r7.d()
            fctx r7 = defpackage.fctx.a
            return r7
        L82:
            r7.d()
            throw r8
        L86:
            r0.d = r3
            java.lang.Object r7 = r6.j(r7, r8, r0)
            if (r7 != r1) goto L8f
        L8e:
            return r1
        L8f:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.b(java.util.UUID, aiaf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.UUID r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ahye
            if (r0 == 0) goto L13
            r0 = r10
            ahye r0 = (defpackage.ahye) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ahye r0 = new ahye
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r9 = r0.a
            java.io.Closeable r9 = (java.io.Closeable) r9
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L87
        L2f:
            r10 = move-exception
            goto L96
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            fdcg r9 = r0.e
            eieu r2 = r0.f
            java.lang.Object r4 = r0.a
            java.util.UUID r4 = (java.util.UUID) r4
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L49
            r10 = r2
            r2 = r9
            r9 = r4
            goto L6b
        L49:
            r10 = move-exception
            r9 = r2
            goto L96
        L4c:
            defpackage.fctl.b(r10)
            java.lang.String r10 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#doAttachmentRestore"
            eieu r10 = defpackage.eiiy.a(r10)
            fdcg r2 = new fdcg     // Catch: java.lang.Throwable -> L92
            r2.<init>()     // Catch: java.lang.Throwable -> L92
            enzp r6 = defpackage.enzp.DO_ATTACHMENTS_RESTORE     // Catch: java.lang.Throwable -> L92
            r0.a = r9     // Catch: java.lang.Throwable -> L92
            r0.f = r10     // Catch: java.lang.Throwable -> L92
            r0.e = r2     // Catch: java.lang.Throwable -> L92
            r0.d = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r4 = r(r8, r6, r9, r0)     // Catch: java.lang.Throwable -> L92
            if (r4 != r1) goto L6b
            goto L91
        L6b:
            fcyh r4 = r8.g     // Catch: java.lang.Throwable -> L92
            fcyh r4 = defpackage.eicg.a(r4)     // Catch: java.lang.Throwable -> L92
            ahyg r6 = new ahyg     // Catch: java.lang.Throwable -> L92
            r6.<init>(r5, r8, r9, r2)     // Catch: java.lang.Throwable -> L92
            r0.a = r10     // Catch: java.lang.Throwable -> L92
            r0.f = r5     // Catch: java.lang.Throwable -> L92
            r0.e = r5     // Catch: java.lang.Throwable -> L92
            r0.d = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r9 = defpackage.fdin.a(r4, r6, r0)     // Catch: java.lang.Throwable -> L92
            if (r9 == r1) goto L91
            r7 = r10
            r10 = r9
            r9 = r7
        L87:
            fdhi r10 = (defpackage.fdhi) r10     // Catch: java.lang.Throwable -> L2f
            long r0 = r10.c     // Catch: java.lang.Throwable -> L2f
            defpackage.fczl.a(r9, r5)
            fctx r9 = defpackage.fctx.a
            return r9
        L91:
            return r1
        L92:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L96:
            throw r10     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            defpackage.fczl.a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.c(java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.Closeable] */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.UUID r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ahyh
            if (r0 == 0) goto L13
            r0 = r9
            ahyh r0 = (defpackage.ahyh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ahyh r0 = new ahyh
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.a
            java.io.Closeable r8 = (java.io.Closeable) r8
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L45
            goto L7b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            eieu r8 = r0.e
            java.lang.Object r2 = r0.a
            java.util.UUID r2 = (java.util.UUID) r2
            defpackage.fctl.b(r9)     // Catch: java.lang.Throwable -> L45
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L5f
        L45:
            r9 = move-exception
            goto L8a
        L47:
            defpackage.fctl.b(r9)
            java.lang.String r9 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#doBugleDbRestore"
            eieu r9 = defpackage.eiiy.a(r9)
            enzp r2 = defpackage.enzp.DO_BUGLE_DATABASE_RESTORE     // Catch: java.lang.Throwable -> L86
            r0.a = r8     // Catch: java.lang.Throwable -> L86
            r0.e = r9     // Catch: java.lang.Throwable -> L86
            r0.d = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r(r7, r2, r8, r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L5f
            goto L85
        L5f:
            j$.time.Duration r2 = (j$.time.Duration) r2     // Catch: java.lang.Throwable -> L86
            fcyh r2 = r7.g     // Catch: java.lang.Throwable -> L86
            fcyh r2 = defpackage.eicg.a(r2)     // Catch: java.lang.Throwable -> L86
            ahyk r4 = new ahyk     // Catch: java.lang.Throwable -> L86
            r4.<init>(r5, r7, r8)     // Catch: java.lang.Throwable -> L86
            r0.a = r9     // Catch: java.lang.Throwable -> L86
            r0.e = r5     // Catch: java.lang.Throwable -> L86
            r0.d = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r8 = defpackage.fdin.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L86
            if (r8 == r1) goto L85
            r6 = r9
            r9 = r8
            r8 = r6
        L7b:
            fdhi r9 = (defpackage.fdhi) r9     // Catch: java.lang.Throwable -> L45
            long r0 = r9.c     // Catch: java.lang.Throwable -> L45
            defpackage.fczl.a(r8, r5)
            fctx r8 = defpackage.fctx.a
            return r8
        L85:
            return r1
        L86:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L8a:
            throw r9     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            defpackage.fczl.a(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.d(java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.UUID r19, defpackage.aiaf r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            boolean r3 = r2 instanceof defpackage.ahyl
            if (r3 == 0) goto L19
            r3 = r2
            ahyl r3 = (defpackage.ahyl) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            ahyl r3 = new ahyl
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.a
            fcyl r4 = defpackage.fcyl.a
            int r5 = r3.c
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            java.util.UUID r1 = r3.d
            defpackage.fctl.b(r2)
            goto L51
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            defpackage.fctl.b(r2)
            ayrq r2 = defpackage.ayrq.a
            ahym r5 = new ahym
            r7 = 0
            r8 = r20
            r5.<init>(r0, r1, r8, r7)
            r3.d = r1
            r3.c = r6
            java.lang.String r6 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#doCompleteRestore"
            java.lang.Object r2 = r2.a(r6, r5, r3)
            if (r2 != r4) goto L51
            return r4
        L51:
            r7 = r1
            fdhi r2 = (defpackage.fdhi) r2
            long r1 = r2.c
            fcsu r3 = r0.i
            java.lang.Object r3 = r3.b()
            r5 = r3
            ahwi r5 = (defpackage.ahwi) r5
            enzp r6 = defpackage.enzp.DO_COMPLETE_RESTORE
            long r3 = defpackage.fdhi.h(r1)
            int r1 = defpackage.fdhi.d(r1)
            long r1 = (long) r1
            j$.time.Duration r13 = j$.time.Duration.ofSeconds(r3, r1)
            r13.getClass()
            r16 = 0
            r17 = 1916(0x77c, float:2.685E-42)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            defpackage.ahwi.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.e(java.util.UUID, aiaf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.UUID r20, defpackage.aiba r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            boolean r4 = r3 instanceof defpackage.ahyw
            if (r4 == 0) goto L1b
            r4 = r3
            ahyw r4 = (defpackage.ahyw) r4
            int r5 = r4.c
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.c = r5
            goto L20
        L1b:
            ahyw r4 = new ahyw
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.a
            fcyl r5 = defpackage.fcyl.a
            int r6 = r4.c
            r7 = 1
            if (r6 == 0) goto L3d
            if (r6 != r7) goto L35
            aiba r1 = r4.e
            java.util.UUID r2 = r4.d
            defpackage.fctl.b(r3)
            r13 = r1
            r8 = r2
            goto L59
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            defpackage.fctl.b(r3)
            ayrq r3 = defpackage.ayrq.a
            ahyx r6 = new ahyx
            r8 = 0
            r6.<init>(r0, r1, r2, r8)
            r4.d = r1
            r4.e = r2
            r4.c = r7
            java.lang.String r7 = "RestoreAnytimeCompatibleRestoreWorkflowSteps#initializeRestore"
            java.lang.Object r3 = r3.a(r7, r6, r4)
            if (r3 != r5) goto L57
            return r5
        L57:
            r8 = r1
            r13 = r2
        L59:
            fdhi r3 = (defpackage.fdhi) r3
            long r1 = r3.c
            fcsu r3 = r0.i
            java.lang.Object r3 = r3.b()
            r6 = r3
            ahwi r6 = (defpackage.ahwi) r6
            enzp r7 = defpackage.enzp.INITIALIZE_RESTORE_WORKFLOW
            long r3 = defpackage.fdhi.h(r1)
            int r1 = defpackage.fdhi.d(r1)
            long r1 = (long) r1
            j$.time.Duration r14 = j$.time.Duration.ofSeconds(r3, r1)
            r14.getClass()
            r17 = 0
            r18 = 1852(0x73c, float:2.595E-42)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            defpackage.ahwi.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.f(java.util.UUID, aiba, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.UUID r19, java.io.File r20, defpackage.szf r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.g(java.util.UUID, java.io.File, szf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (o(r2, r8, r9, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (o(r7, r8, r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [ahzi] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v1, types: [feav] */
    /* JADX WARN: Type inference failed for: r7v6, types: [fctx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.UUID r7, java.io.File r8, defpackage.szu r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.ahzc
            if (r0 == 0) goto L13
            r0 = r10
            ahzc r0 = (defpackage.ahzc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ahzc r0 = new ahzc
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r10)
            goto L97
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.a
            feav r7 = (defpackage.feav) r7
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L3d
            goto L84
        L3d:
            r8 = move-exception
            goto L8a
        L3f:
            feaz r7 = r0.g
            szu r9 = r0.f
            java.lang.Object r8 = r0.b
            java.lang.Object r2 = r0.a
            java.util.UUID r2 = (java.util.UUID) r2
            defpackage.fctl.b(r10)
            goto L70
        L4d:
            defpackage.fctl.b(r10)
            arjq r10 = r6.t
            boolean r10 = r10.a()
            if (r10 == 0) goto L8e
            feav r10 = r6.v
            r0.a = r7
            r0.b = r8
            r0.f = r9
            r2 = r10
            feaz r2 = (defpackage.feaz) r2
            r0.g = r2
            r0.e = r5
            java.lang.Object r2 = r10.b(r0)
            if (r2 != r1) goto L6e
            goto L96
        L6e:
            r2 = r7
            r7 = r10
        L70:
            r0.a = r7     // Catch: java.lang.Throwable -> L3d
            r10 = 0
            r0.b = r10     // Catch: java.lang.Throwable -> L3d
            r0.f = r10     // Catch: java.lang.Throwable -> L3d
            r0.g = r10     // Catch: java.lang.Throwable -> L3d
            r0.e = r4     // Catch: java.lang.Throwable -> L3d
            java.io.File r8 = (java.io.File) r8     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r8 = r6.o(r2, r8, r9, r0)     // Catch: java.lang.Throwable -> L3d
            if (r8 != r1) goto L84
            goto L96
        L84:
            r7.d()
            fctx r7 = defpackage.fctx.a
            return r7
        L8a:
            r7.d()
            throw r8
        L8e:
            r0.e = r3
            java.lang.Object r7 = r6.o(r7, r8, r9, r0)
            if (r7 != r1) goto L97
        L96:
            return r1
        L97:
            fctx r7 = defpackage.fctx.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.h(java.util.UUID, java.io.File, szu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:13:0x0036, B:35:0x009f, B:37:0x00a5, B:39:0x00b1, B:40:0x00be, B:43:0x00d5, B:19:0x0050, B:24:0x0061, B:26:0x006f, B:29:0x007f, B:31:0x008c, B:34:0x009b), top: B:63:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb A[Catch: all -> 0x0152, TryCatch #0 {all -> 0x0152, blocks: (B:46:0x00f3, B:48:0x00fb, B:49:0x0115), top: B:61:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #0 {all -> 0x0152, blocks: (B:46:0x00f3, B:48:0x00fb, B:49:0x0115), top: B:61:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ef -> B:15:0x003a). Please report as a decompilation issue!!! */
    @Override // defpackage.ahwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.i(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:53:0x010f, B:55:0x0113, B:60:0x011d, B:61:0x012b, B:66:0x0154, B:71:0x018b, B:62:0x013e, B:63:0x0150, B:28:0x007a, B:47:0x00d3, B:49:0x00ed, B:32:0x008b), top: B:82:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:53:0x010f, B:55:0x0113, B:60:0x011d, B:61:0x012b, B:66:0x0154, B:71:0x018b, B:62:0x013e, B:63:0x0150, B:28:0x007a, B:47:0x00d3, B:49:0x00ed, B:32:0x008b), top: B:82:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:53:0x010f, B:55:0x0113, B:60:0x011d, B:61:0x012b, B:66:0x0154, B:71:0x018b, B:62:0x013e, B:63:0x0150, B:28:0x007a, B:47:0x00d3, B:49:0x00ed, B:32:0x008b), top: B:82:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151 A[PHI: r0 r2 r5 r6 r9 r12
      0x0151: PHI (r0v10 j$.time.Duration) = (r0v8 j$.time.Duration), (r0v19 j$.time.Duration) binds: [B:48:0x00eb, B:61:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r2v12 fdci) = (r2v10 fdci), (r2v23 fdci) binds: [B:48:0x00eb, B:61:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r5v8 java.io.Closeable) = (r5v7 java.io.Closeable), (r5v9 java.io.Closeable) binds: [B:48:0x00eb, B:61:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r6v1 boolean) = (r6v0 boolean), (r6v3 boolean) binds: [B:48:0x00eb, B:61:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r9v3 aiaf) = (r9v2 aiaf), (r9v4 aiaf) binds: [B:48:0x00eb, B:61:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x0151: PHI (r12v6 java.util.UUID) = (r12v5 java.util.UUID), (r12v9 java.util.UUID) binds: [B:48:0x00eb, B:61:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:53:0x010f, B:55:0x0113, B:60:0x011d, B:61:0x012b, B:66:0x0154, B:71:0x018b, B:62:0x013e, B:63:0x0150, B:28:0x007a, B:47:0x00d3, B:49:0x00ed, B:32:0x008b), top: B:82:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:53:0x010f, B:55:0x0113, B:60:0x011d, B:61:0x012b, B:66:0x0154, B:71:0x018b, B:62:0x013e, B:63:0x0150, B:28:0x007a, B:47:0x00d3, B:49:0x00ed, B:32:0x008b), top: B:82:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.UUID r24, defpackage.aiaf r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.j(java.util.UUID, aiaf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.UUID r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ahyp
            if (r0 == 0) goto L13
            r0 = r6
            ahyp r0 = (defpackage.ahyp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahyp r0 = new ahyp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.UUID r5 = r0.d
            defpackage.fctl.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.b
            java.lang.Object r6 = r6.b()
            ahwd r6 = (defpackage.ahwd) r6
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = r6.n(r5, r0)
            if (r6 == r1) goto L67
        L46:
            aiad r6 = (defpackage.aiad) r6
            if (r6 == 0) goto L54
            java.lang.String r6 = r6.e
            if (r6 == 0) goto L54
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            return r5
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No ActiveRestoreExecution found for sessionId ["
            java.lang.String r1 = "]"
            java.lang.String r0 = defpackage.a.h(r5, r0, r1)
            r6.<init>(r0)
            enzp r0 = defpackage.enzp.DO_BUGLE_DATABASE_RESTORE
            r4.x(r0, r5)
            throw r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.k(java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.util.UUID r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ahyq
            if (r0 == 0) goto L13
            r0 = r6
            ahyq r0 = (defpackage.ahyq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahyq r0 = new ahyq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.b
            java.lang.Object r6 = r6.b()
            ahwd r6 = (defpackage.ahwd) r6
            r0.c = r3
            java.lang.Object r6 = r6.o(r5, r0)
            if (r6 == r1) goto L55
        L42:
            r6.getClass()
            ahto r6 = (defpackage.ahto) r6
            aiaa r5 = r6.f
            if (r5 == 0) goto L53
            long r5 = r5.c
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            return r0
        L53:
            r5 = 0
            return r5
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.l(java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.UUID r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ahyv
            if (r0 == 0) goto L13
            r0 = r6
            ahyv r0 = (defpackage.ahyv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahyv r0 = new ahyv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            fcsu r6 = r4.l
            java.lang.Object r6 = r6.b()
            ahtt r6 = (defpackage.ahtt) r6
            r0.c = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 == r1) goto L53
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r3 == r5) goto L4c
            r5 = 5
            goto L4d
        L4c:
            r5 = 6
        L4d:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.m(java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:7))(0)|8|(5:(1:(1:(1:(9:14|97|15|16|95|65|66|89|90)(2:20|21))(6:22|93|23|24|52|(3:54|89|90)(10:55|(3:58|59|56)|115|60|111|61|113|62|(6:64|95|65|66|89|90)|78)))(9:28|103|29|30|31|109|50|(2:52|(0)(0))|78))(4:34|91|35|36)|39|88|89|90)(11:40|99|41|42|105|43|44|107|45|(1:47)|78)|101|48|49|31|109|50|(0)|78|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x023a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x023b, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x023e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x023f, code lost:
    
        r2 = null;
        r15 = r1;
        r14 = null;
        r30 = r11;
        r11 = r6;
        r12 = r8;
        r8 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d A[Catch: Exception -> 0x023a, PHI: r0 r6 r8 r11 r12 r13 r20
      0x012d: PHI (r0v20 java.lang.Object) = (r0v15 java.lang.Object), (r0v1 java.lang.Object) binds: [B:51:0x012b, B:24:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r6v12 long) = (r6v7 long), (r6v22 long) binds: [B:51:0x012b, B:24:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r8v12 int) = (r8v7 int), (r8v24 int) binds: [B:51:0x012b, B:24:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r11v11 java.util.UUID) = (r11v6 java.util.UUID), (r11v21 java.util.UUID) binds: [B:51:0x012b, B:24:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r12v9 int) = (r12v4 int), (r12v20 int) binds: [B:51:0x012b, B:24:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r13v9 ahzi) = (r13v4 ahzi), (r13v20 ahzi) binds: [B:51:0x012b, B:24:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x012d: PHI (r20v1 long) = (r20v0 long), (r20v3 long) binds: [B:51:0x012b, B:24:0x0073] A[DONT_GENERATE, DONT_INLINE], TryCatch #9 {Exception -> 0x023a, blocks: (B:52:0x012d, B:55:0x014f, B:56:0x01a4, B:58:0x01aa, B:50:0x0114), top: B:109:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f A[Catch: Exception -> 0x023a, TryCatch #9 {Exception -> 0x023a, blocks: (B:52:0x012d, B:55:0x014f, B:56:0x01a4, B:58:0x01aa, B:50:0x0114), top: B:109:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.ahzi r34, java.util.UUID r35, long r36, defpackage.fcxy r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.n(ahzi, java.util.UUID, long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.util.UUID r19, java.io.File r20, defpackage.szu r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.o(java.util.UUID, java.io.File, szu, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.io.File r12, java.util.UUID r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzi.p(java.io.File, java.util.UUID, fcxy):java.lang.Object");
    }
}
