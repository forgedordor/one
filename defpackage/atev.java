package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.communication.synapse.security.scytale.MediaEncryptor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atev implements athk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/EncryptionStep");
    private final Context b;
    private final eygg c;
    private final cqmz d;
    private final atjz e;
    private final cbtl f;
    private final aqvb g;
    private final atjr h;
    private final int i;

    public atev(Context context, eygg eyggVar, cqmz cqmzVar, atjz atjzVar, cbtl cbtlVar, aqvb aqvbVar, int i) {
        this.b = context;
        this.c = eyggVar;
        this.d = cqmzVar;
        this.e = atjzVar;
        this.f = cbtlVar;
        this.g = aqvbVar;
        this.i = i;
        this.h = i == 1 ? atjr.f : atjr.e;
    }

    private static final eyfn m(MediaEncryptor mediaEncryptor, ContentType contentType) {
        eyfl eyflVarA = eyfk.a((eyfm) eyfn.a.createBuilder());
        eyflVarA.d(evqs.x(mediaEncryptor.getKeyMaterial()));
        eyflVarA.b(evqs.x(mediaEncryptor.getDigest()));
        eyflVarA.e(mediaEncryptor.getVersion());
        Object objFM = new atal().fH().fM(contentType);
        objFM.getClass();
        eyflVarA.c((aubx) objFM);
        return eyflVarA.a();
    }

    @Override // defpackage.athk
    public final atjr a() {
        return this.h;
    }

    @Override // defpackage.athk
    public final Object b(fcxy fcxyVar) {
        return fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cbtk r18, defpackage.atii r19, defpackage.atha r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atev.c(cbtk, atii, atha, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.athh r19, com.google.communication.synapse.security.scytale.MediaEncryptor r20, android.net.Uri r21, com.google.android.rcs.client.messaging.data.ContentType r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atev.d(athh, com.google.communication.synapse.security.scytale.MediaEncryptor, android.net.Uri, com.google.android.rcs.client.messaging.data.ContentType, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cbtk r19, defpackage.atii r20, defpackage.atha r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            boolean r4 = r3 instanceof defpackage.ates
            if (r4 == 0) goto L1b
            r4 = r3
            ates r4 = (defpackage.ates) r4
            int r5 = r4.c
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.c = r5
            goto L20
        L1b:
            ates r4 = new ates
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.a
            fcyl r5 = defpackage.fcyl.a
            int r6 = r4.c
            r7 = 1
            if (r6 == 0) goto L3d
            if (r6 != r7) goto L35
            cbti r1 = r4.e
            atii r2 = r4.d
            defpackage.fctl.b(r3)
            r3 = r1
            r1 = r2
            goto La7
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            defpackage.fctl.b(r3)
            ekrg r3 = defpackage.atev.a
            ekrw r3 = r3.h()
            ekrz r6 = defpackage.eksq.a
            java.lang.String r8 = "BugleFileTransfer"
            r3.X(r6, r8)
            ekrd r3 = (defpackage.ekrd) r3
            athh r6 = r2.b
            ekrz r8 = defpackage.coie.j
            r3.X(r8, r6)
            r8 = 147(0x93, float:2.06E-43)
            java.lang.String r9 = "EncryptionStep.kt"
            java.lang.String r10 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/EncryptionStep"
            java.lang.String r11 = "encryptThumbnail"
            ekrw r3 = r3.h(r10, r11, r8, r9)
            ekrd r3 = (defpackage.ekrd) r3
            java.lang.String r8 = "Encrypting thumbnail."
            r3.q(r8)
            evqs r3 = r1.f
            if (r3 == 0) goto Lc8
            byte[] r3 = r3.I()
            r3.getClass()
            com.google.android.rcs.client.messaging.data.ContentType r8 = r1.b
            r8.getClass()
            java.lang.String r8 = r8.toString()
            r9 = r19
            cbti r3 = r9.a(r3, r8)
            cbtf r8 = r3.b
            boolean r9 = r8 instanceof defpackage.cbte
            if (r9 == 0) goto L99
            atjp r2 = r2.e
            r9 = r8
            cbte r9 = (defpackage.cbte) r9
            eyfn r9 = r9.a
            int r9 = r9.e
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            r2.i = r10
        L99:
            atjz r2 = r0.e
            r4.d = r1
            r4.e = r3
            r4.c = r7
            java.lang.Object r2 = r2.p(r6, r8, r4)
            if (r2 == r5) goto Lc7
        La7:
            atii r4 = new atii
            cbqz r2 = r1.k
            com.google.android.rcs.client.messaging.data.ContentType r6 = defpackage.atep.a(r2)
            java.lang.String r7 = defpackage.atep.b(r2)
            evqs r12 = r1.f
            evqs r10 = r3.a
            com.google.android.rcs.client.messaging.data.ContentType r8 = r1.b
            r16 = 0
            r17 = 3921(0xf51, float:5.494E-42)
            r5 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r4
        Lc7:
            return r5
        Lc8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Thumbnail bytes must be present."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atev.e(cbtk, atii, atha, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.athh r19, com.google.communication.synapse.security.scytale.MediaEncryptor r20, defpackage.evqs r21, com.google.android.rcs.client.messaging.data.ContentType r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r23
            boolean r5 = r4 instanceof defpackage.atet
            if (r5 == 0) goto L1d
            r5 = r4
            atet r5 = (defpackage.atet) r5
            int r6 = r5.e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1d
            int r6 = r6 - r7
            r5.e = r6
            goto L22
        L1d:
            atet r5 = new atet
            r5.<init>(r0, r4)
        L22:
            java.lang.Object r4 = r5.c
            fcyl r6 = defpackage.fcyl.a
            int r7 = r5.e
            r8 = 1
            if (r7 == 0) goto L3f
            if (r7 != r8) goto L37
            byte[] r1 = r5.f
            java.lang.Object r2 = r5.b
            java.lang.Object r3 = r5.a
            defpackage.fctl.b(r4)
            goto L90
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3f:
            defpackage.fctl.b(r4)
            ekrg r4 = defpackage.atev.a
            ekrw r4 = r4.h()
            ekrz r7 = defpackage.eksq.a
            java.lang.String r9 = "BugleFileTransfer"
            r4.X(r7, r9)
            ekrd r4 = (defpackage.ekrd) r4
            ekrz r7 = defpackage.coie.j
            r4.X(r7, r1)
            r7 = 221(0xdd, float:3.1E-43)
            java.lang.String r9 = "EncryptionStep.kt"
            java.lang.String r10 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/EncryptionStep"
            java.lang.String r11 = "encryptThumbnailOld"
            ekrw r4 = r4.h(r10, r11, r7, r9)
            ekrd r4 = (defpackage.ekrd) r4
            java.lang.String r7 = "Encrypting thumbnail."
            r4.q(r7)
            byte[] r4 = r21.I()
            com.google.media.webrtc.common.StatusOr r4 = r2.encrypt(r4, r8)
            java.lang.Object r4 = defpackage.bwlb.a(r4)
            byte[] r4 = (byte[]) r4
            atjz r7 = r0.e
            eyfn r2 = m(r2, r3)
            r9 = r21
            r5.a = r9
            r5.b = r3
            r5.f = r4
            r5.e = r8
            java.lang.Object r1 = r7.q(r1, r2, r5)
            if (r1 == r6) goto Lbb
            r2 = r3
            r1 = r4
            r3 = r9
        L90:
            atii r4 = new atii
            cbqz r5 = defpackage.cbqz.b
            com.google.android.rcs.client.messaging.data.ContentType r6 = defpackage.atep.a(r5)
            java.lang.String r7 = defpackage.atep.b(r5)
            evqs r10 = defpackage.evqs.x(r1)
            evqs r3 = (defpackage.evqs) r3
            byte[] r1 = r3.I()
            evqs r12 = defpackage.evqs.x(r1)
            r8 = r2
            com.google.android.rcs.client.messaging.data.ContentType r8 = (com.google.android.rcs.client.messaging.data.ContentType) r8
            r16 = 0
            r17 = 3921(0xf51, float:5.494E-42)
            r5 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r4
        Lbb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atev.f(athh, com.google.communication.synapse.security.scytale.MediaEncryptor, evqs, com.google.android.rcs.client.messaging.data.ContentType, fcxy):java.lang.Object");
    }

    @Override // defpackage.athk
    public final Object g(fcxy fcxyVar) {
        return fctx.a;
    }

    @Override // defpackage.athk
    public final Object h(atha athaVar, atii atiiVar, fcxy fcxyVar) {
        cbqz cbqzVarQ;
        int i = this.i;
        if ((i != 2 || atiiVar.a == null || atiiVar.b == null) && (i != 1 || atiiVar.f == null || atiiVar.b == null)) {
            throw new IllegalArgumentException("Invalid input in EncryptionStep.");
        }
        if (atiiVar.b == null) {
            throw new IllegalArgumentException("Content type must be present.");
        }
        if (!this.g.a()) {
            return i(athaVar, atiiVar, fcxyVar);
        }
        MessageCoreData messageCoreDataA = athaVar.a();
        if (messageCoreDataA == null || (cbqzVarQ = messageCoreDataA.Q()) == null) {
            cbqzVarQ = atiiVar.k;
        }
        if (!cbqzVarQ.e()) {
            if (!cbqzVarQ.f()) {
                ekrw ekrwVarH = a.h();
                ekrwVarH.X(eksq.a, "BugleFileTransfer");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrdVar.X(coie.j, athaVar.b);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/EncryptionStep", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 77, "EncryptionStep.kt")).q("not configured to support encryption, falling back to Scytale");
            }
            cbqzVarQ = cbqz.b;
        }
        cbtk cbtkVarA = this.f.a(cbqzVarQ);
        return i == 1 ? e(cbtkVarA, atiiVar, athaVar, fcxyVar) : c(cbtkVarA, atiiVar, athaVar, fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r10 != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.atha r8, defpackage.atii r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ateu
            if (r0 == 0) goto L13
            r0 = r10
            ateu r0 = (defpackage.ateu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ateu r0 = new ateu
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            atii r9 = r6.d
            defpackage.fctl.b(r10)
            goto L9b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.fctl.b(r10)
            return r10
        L3a:
            defpackage.fctl.b(r10)
            eygg r10 = r7.c
            r10.b()
            com.google.media.webrtc.common.StatusOr r10 = com.google.communication.synapse.security.scytale.MediaEncryptor.createEncryptorInstance()
            java.lang.Object r10 = defpackage.bwlb.a(r10)
            com.google.communication.synapse.security.scytale.MediaEncryptor r10 = (com.google.communication.synapse.security.scytale.MediaEncryptor) r10
            atjp r1 = r8.e
            int r4 = r10.getVersion()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            r1.i = r5
            int r1 = r7.i
            if (r1 != r3) goto L7f
            evqs r4 = r9.f
            if (r4 == 0) goto L77
            athh r2 = r8.b
            r10.getClass()
            com.google.android.rcs.client.messaging.data.ContentType r5 = r9.b
            r5.getClass()
            r6.c = r3
            r1 = r7
            r3 = r10
            java.lang.Object r8 = r1.f(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L76
            goto Lb6
        L76:
            return r8
        L77:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Thumbnail bytes must be present."
            r8.<init>(r9)
            throw r8
        L7f:
            r3 = r10
            athh r8 = r8.b
            r3.getClass()
            android.net.Uri r4 = r9.a
            r4.getClass()
            com.google.android.rcs.client.messaging.data.ContentType r5 = r9.b
            r5.getClass()
            r6.d = r9
            r6.c = r2
            r1 = r7
            r2 = r8
            java.lang.Object r10 = r1.d(r2, r3, r4, r5, r6)
            if (r10 == r0) goto Lb6
        L9b:
            atim r10 = (defpackage.atim) r10
            boolean r8 = r10 instanceof defpackage.atii
            if (r8 == 0) goto Lb5
            r0 = r10
            atii r0 = (defpackage.atii) r0
            evqs r1 = r9.f
            evqs r3 = r9.h
            com.google.android.rcs.client.messaging.data.ContentType r2 = r9.g
            com.google.android.rcs.client.messaging.data.ContentType r4 = r9.i
            cbqz r5 = r9.k
            r6 = 2591(0xa1f, float:3.631E-42)
            atii r8 = defpackage.atii.b(r0, r1, r2, r3, r4, r5, r6)
            return r8
        Lb5:
            return r10
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atev.i(atha, atii, fcxy):java.lang.Object");
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean l() {
        return false;
    }
}
