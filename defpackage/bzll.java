package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzll {
    public static final List a;
    private static final cczv d = cdag.j(cdag.b, "cms_batch_backup_post_process_dropper_page_size_per_type", 40);
    public final bzbb b;
    public final bzbb c;
    private final byik e;
    private final cpsl f;
    private final cpqb g;
    private final dqsn h;

    static {
        fcva.g(cpyi.FAILED_VIA_BATCH_BACKUP, cpyi.SKIPPED_VIA_BATCH_BACKUP);
        a = fcva.g(cpyi.EXCLUDED, cpyi.FAILED_VIA_BATCH_BACKUP, cpyi.SKIPPED_VIA_BATCH_BACKUP);
    }

    public bzll(byik byikVar, cpsl cpslVar, cpqb cpqbVar, bzbb bzbbVar, bzbb bzbbVar2, bykk bykkVar, dqsn dqsnVar) {
        byikVar.getClass();
        bykkVar.getClass();
        dqsnVar.getClass();
        this.e = byikVar;
        this.f = cpslVar;
        this.g = cpqbVar;
        this.b = bzbbVar;
        this.c = bzbbVar2;
        this.h = dqsnVar;
    }

    private final Object d(byiv byivVar, ekgb ekgbVar, fcxy fcxyVar) {
        ekgb ekgbVarA = bykk.a(byivVar, ekgbVar);
        new cpyx("Dependency missing for batch backup", ekgbVar);
        Object objC = fdxs.c(this.e.c(byivVar, ekgbVarA, true, 0), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    private static final byiv e(int i, String str, int i2) {
        byiu byiuVar = (byiu) byiv.a.createBuilder();
        byiuVar.getClass();
        byin.b(i, byiuVar);
        byin.f(i2, byiuVar);
        byin.e(str, byiuVar);
        byin.c(bzas.a(17), byiuVar);
        byin.d(true, byiuVar);
        return byin.a(byiuVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        r5 = r13;
        r13 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [bzll] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r12, defpackage.bzlh r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.bzli
            if (r0 == 0) goto L13
            r0 = r14
            bzli r0 = (defpackage.bzli) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bzli r0 = new bzli
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r12 = r0.a
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r13 = r0.g
            ekfx r2 = r0.h
            java.lang.Object r4 = r0.b
            bzlh r5 = r0.f
            defpackage.fctl.b(r14)
            goto Lc2
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            defpackage.fctl.b(r14)
            java.util.List r14 = r13.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ekgb r14 = (defpackage.ekgb) r14
            ekqh r14 = r14.iterator()
            r4 = r2
            r2 = r14
        L4c:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto Lca
            java.lang.Object r14 = r2.next()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r14 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r14
            cpqb r5 = r11.g
            j$.util.Optional r5 = r5.c(r14)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L68
            r14 = 0
        L65:
            r5 = r13
            r13 = r14
            goto Lc2
        L68:
            java.lang.Object r5 = r5.get()
            cppb r5 = (defpackage.cppb) r5
            int r6 = defpackage.ekgb.d
            ekfw r6 = new ekfw
            r6.<init>()
            ekgb r7 = r5.e()
            int r8 = r7.size()
            r9 = 0
        L7e:
            if (r9 >= r8) goto L8c
            java.lang.Object r10 = r7.get(r9)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r10 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r10
            defpackage.cpre.a(r10, r6)
            int r9 = r9 + 1
            goto L7e
        L8c:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r5 = r5.d()
            if (r5 == 0) goto L95
            defpackage.cpre.a(r5, r6)
        L95:
            ekgb r5 = r6.g()
            java.lang.String r6 = r14.a()
            r6.getClass()
            r7 = 2
            byiv r6 = e(r12, r6, r7)
            r5.getClass()
            ekgb r5 = defpackage.ekfv.a(r5)
            r0.f = r13
            r0.b = r4
            r7 = r2
            ekfx r7 = (defpackage.ekfx) r7
            r0.h = r7
            r0.g = r14
            r0.a = r12
            r0.e = r3
            java.lang.Object r5 = r11.d(r6, r5, r0)
            if (r5 == r1) goto Lc9
            goto L65
        Lc2:
            if (r13 == 0) goto Lc7
            r4.add(r13)
        Lc7:
            r13 = r5
            goto L4c
        Lc9:
            return r1
        Lca:
            java.util.List r12 = r13.b
            ekoe r12 = (defpackage.ekoe) r12
            int r12 = r12.c
            fcti r13 = new fcti
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r12)
            r13.<init>(r14, r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzll.a(int, bzlh, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r9, final defpackage.aumf r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzll.b(int, aumf, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0063 -> B:25:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0097 -> B:24:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r9, defpackage.bzlh r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.bzlk
            if (r0 == 0) goto L13
            r0 = r11
            bzlk r0 = (defpackage.bzlk) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bzlk r0 = new bzlk
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r9 = r0.a
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r10 = r0.g
            ekfx r2 = r0.h
            java.lang.Object r4 = r0.b
            bzlh r5 = r0.f
            defpackage.fctl.b(r11)
            goto L99
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.fctl.b(r11)
            java.util.List r11 = r10.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ekgb r11 = (defpackage.ekgb) r11
            ekqh r11 = r11.iterator()
            r4 = r2
            r2 = r11
        L4b:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto La4
            java.lang.Object r11 = r2.next()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r11 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType) r11
            cpsl r5 = r8.f
            j$.util.Optional r5 = r5.f(r11)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L65
            r11 = 0
            goto L9e
        L65:
            java.lang.Object r5 = r5.get()
            cprt r5 = (defpackage.cprt) r5
            ekgb r5 = defpackage.cpsl.g(r5)
            java.lang.String r6 = r11.b()
            r6.getClass()
            byiv r6 = e(r9, r6, r3)
            r5.getClass()
            ekgb r5 = defpackage.ekfv.a(r5)
            r0.f = r10
            r0.b = r4
            r7 = r2
            ekfx r7 = (defpackage.ekfx) r7
            r0.h = r7
            r0.g = r11
            r0.a = r9
            r0.e = r3
            java.lang.Object r5 = r8.d(r6, r5, r0)
            if (r5 != r1) goto L97
            return r1
        L97:
            r5 = r10
            r10 = r11
        L99:
            java.lang.String r11 = r10.b()
            r10 = r5
        L9e:
            if (r11 == 0) goto L4b
            r4.add(r11)
            goto L4b
        La4:
            java.util.List r9 = r10.a
            ekoe r9 = (defpackage.ekoe) r9
            int r9 = r9.c
            fcti r10 = new fcti
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r9)
            r10.<init>(r11, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzll.c(int, bzlh, fcxy):java.lang.Object");
    }
}
