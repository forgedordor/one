package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxoq {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/datamodel/resizing/v3/ResizingManagerV3");
    public final coua a;
    public final cqsu b;
    private final Context d;
    private final fcyh e;
    private final bxng f;
    private final bxoj g;
    private final fcsu h;
    private final cqtc i;

    public bxoq(Context context, fcyh fcyhVar, bxng bxngVar, bxoj bxojVar, fcsu fcsuVar, coua couaVar, cqsu cqsuVar, cqtc cqtcVar) {
        context.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        couaVar.getClass();
        cqsuVar.getClass();
        cqtcVar.getClass();
        this.d = context;
        this.e = fcyhVar;
        this.f = bxngVar;
        this.g = bxojVar;
        this.h = fcsuVar;
        this.a = couaVar;
        this.b = cqsuVar;
        this.i = cqtcVar;
    }

    private static final boolean e(ContentType contentType) {
        return le.n(contentType.toString(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.athh r13, android.net.Uri r14, com.google.android.rcs.client.messaging.data.ContentType r15, long r16, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r18
            boolean r1 = r0 instanceof defpackage.bxol
            if (r1 == 0) goto L15
            r1 = r0
            bxol r1 = (defpackage.bxol) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            bxol r1 = new bxol
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            athh r13 = r1.d
            defpackage.fctl.b(r0)
            goto L51
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            defpackage.fctl.b(r0)
            fcyh r0 = r12.e
            fcyh r0 = defpackage.eicg.a(r0)
            bxok r5 = new bxok
            r6 = 0
            r7 = r12
            r8 = r14
            r9 = r15
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10)
            r1.d = r13
            r1.c = r4
            java.lang.Object r0 = defpackage.fdin.a(r0, r5, r1)
            if (r0 == r2) goto Lc0
        L51:
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L90
            ekrg r14 = defpackage.bxoq.c
            ekrw r14 = r14.j()
            ekrz r15 = defpackage.eksq.a
            java.lang.String r0 = "BugleFileTransfer"
            r14.X(r15, r0)
            ekrd r14 = (defpackage.ekrd) r14
            ekrz r15 = defpackage.coie.j
            r14.X(r15, r13)
            r13 = 158(0x9e, float:2.21E-43)
            java.lang.String r15 = "ResizingManagerV3.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/datamodel/resizing/v3/ResizingManagerV3"
            java.lang.String r1 = "createThumbnail"
            ekrw r13 = r14.h(r0, r1, r13, r15)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.String r14 = "Could not generate preview."
            r13.q(r14)
            bxnx r13 = defpackage.bxnx.a
            evsf r13 = r13.createBuilder()
            bxnv r13 = (defpackage.bxnv) r13
            r13.getClass()
            r14 = 7
            defpackage.bxny.d(r14, r13)
            bxnx r13 = defpackage.bxny.a(r13)
            return r13
        L90:
            bxnx r13 = defpackage.bxnx.a
            evsf r13 = r13.createBuilder()
            bxnv r13 = (defpackage.bxnv) r13
            r13.getClass()
            r14 = 3
            defpackage.bxny.d(r14, r13)
            java.lang.String r14 = "image/jpeg"
            aubx r14 = defpackage.auby.c(r14)
            defpackage.bxny.b(r14, r13)
            evqs r14 = defpackage.evqs.x(r0)
            r13.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r15 = r13.instance
            bxnx r15 = (defpackage.bxnx) r15
            int r0 = r15.b
            r0 = r0 | 2
            r15.b = r0
            r15.f = r14
            bxnx r13 = defpackage.bxny.a(r13)
            return r13
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxoq.a(athh, android.net.Uri, com.google.android.rcs.client.messaging.data.ContentType, long, fcxy):java.lang.Object");
    }

    public final Object b(athh athhVar, Uri uri, ContentType contentType, long j, String str, fcxy fcxyVar) {
        try {
            return c(athhVar, uri, contentType, j, this.i.a(j), str, fcxyVar);
        } catch (evtj e) {
            ekrw ekrwVarJ = c.j();
            ekrwVarJ.X(eksq.a, "BugleFileTransfer");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(coie.j, athhVar);
            ((ekrd) ekrdVar.g(e).h("com/google/android/apps/messaging/shared/datamodel/resizing/v3/ResizingManagerV3", "resize", 72, "ResizingManagerV3.kt")).t("Unable to get image compression long dimension from setting for input uri: %s", uri);
            bxnv bxnvVar = (bxnv) bxnx.a.createBuilder();
            bxnvVar.getClass();
            bxny.d(4, bxnvVar);
            emke emkeVar = (emke) emki.a.createBuilder();
            emkeVar.getClass();
            emkeVar.copyOnWrite();
            emki emkiVar = (emki) emkeVar.instance;
            emkiVar.v = emkd.a(20);
            emkiVar.b |= 524288;
            evsn evsnVarBuild = emkeVar.build();
            evsnVarBuild.getClass();
            bxny.c((emki) evsnVarBuild, bxnvVar);
            return bxny.a(bxnvVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.athh r18, android.net.Uri r19, com.google.android.rcs.client.messaging.data.ContentType r20, long r21, int r23, java.lang.String r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxoq.c(athh, android.net.Uri, com.google.android.rcs.client.messaging.data.ContentType, long, int, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.net.Uri r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.bxop
            if (r0 == 0) goto L13
            r0 = r9
            bxop r0 = (defpackage.bxop) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bxop r0 = new bxop
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            bxnf r8 = r0.d
            defpackage.fctl.b(r9)
            goto L6f
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.fctl.b(r9)
            bxnt r9 = defpackage.bxnt.a
            evsf r9 = r9.createBuilder()
            bxns r9 = (defpackage.bxns) r9
            r9.getClass()
            java.lang.String r8 = r8.toString()
            r8.getClass()
            defpackage.bxnu.b(r8, r9)
            r5 = 1048576(0x100000, double:5.180654E-318)
            defpackage.bxnu.c(r5, r9)
            bxng r8 = r7.f
            bxnt r9 = defpackage.bxnu.a(r9)
            bxnf r8 = r8.a(r9, r4)
            fcyh r9 = r7.e
            fcyh r9 = defpackage.eicg.a(r9)
            bxoo r2 = new bxoo
            r2.<init>(r4, r8)
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.fdin.a(r9, r2, r0)
            if (r9 == r1) goto L9b
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L98
            ekrg r8 = defpackage.bxoq.c
            ekrw r8 = r8.j()
            ekrz r9 = defpackage.eksq.a
            java.lang.String r0 = "BugleFileTransfer"
            r8.X(r9, r0)
            r9 = 181(0xb5, float:2.54E-43)
            java.lang.String r0 = "ResizingManagerV3.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/datamodel/resizing/v3/ResizingManagerV3"
            java.lang.String r2 = "resizeGroupIcon"
            ekrw r8 = r8.h(r1, r2, r9, r0)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r9 = "Failed to resize group icon."
            r8.q(r9)
            return r4
        L98:
            android.net.Uri r8 = r8.b
            return r8
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxoq.d(android.net.Uri, fcxy):java.lang.Object");
    }
}
