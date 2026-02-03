package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wug implements fdpm {
    final /* synthetic */ wul a;

    public wug(wul wulVar) {
        this.a = wulVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(defpackage.wtz r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.wuf
            if (r0 == 0) goto L13
            r0 = r13
            wuf r0 = (defpackage.wuf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wuf r0 = new wuf
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            java.lang.String r4 = "emit"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/encryption/DraftEncryptor$start$1$4"
            java.lang.String r6 = "BugleComposeRow2"
            java.lang.String r7 = "DraftEncryptor.kt"
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            defpackage.fctl.b(r13)
            goto L8e
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.fctl.b(r13)
            boolean r13 = r12.a
            boolean r12 = r12.b
            ekrg r2 = defpackage.wul.a
            ekrw r8 = r2.e()
            ekrz r9 = defpackage.eksq.a
            r8.X(r9, r6)
            r10 = 45
            ekrw r8 = r8.h(r5, r4, r10, r7)
            ekrd r8 = (defpackage.ekrd) r8
            java.lang.String r10 = "DraftEncryptor isModified %b, isEncrypted %b"
            r8.H(r10, r13, r12)
            if (r13 != 0) goto L7b
            if (r12 == 0) goto Lb4
            ekrw r12 = r2.h()
            r12.X(r9, r6)
            r13 = 48
            ekrw r12 = r12.h(r5, r4, r13, r7)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r13 = "Draft isn't modified but is encrypted: removing encryption"
            r12.q(r13)
            wul r12 = r11.a
            wua r13 = new wua
            r13.<init>()
            wre r12 = r12.c
            r12.c(r13)
            goto Lb4
        L7b:
            if (r12 != 0) goto Lb4
            wul r12 = r11.a
            wue r13 = new wue
            fduj r12 = r12.d
            r13.<init>(r12)
            r0.c = r3
            java.lang.Object r12 = defpackage.fdtc.a(r13, r0)
            if (r12 == r1) goto Lb3
        L8e:
            ekrg r12 = defpackage.wul.a
            ekrw r12 = r12.h()
            ekrz r13 = defpackage.eksq.a
            r12.X(r13, r6)
            r13 = 57
            ekrw r12 = r12.h(r5, r4, r13, r7)
            ekrd r12 = (defpackage.ekrd) r12
            java.lang.String r13 = "Draft is modified, not encrypted, and encryption is supported: adding encryption"
            r12.q(r13)
            wul r12 = r11.a
            wub r13 = new wub
            r13.<init>()
            wre r12 = r12.c
            r12.c(r13)
            goto Lb4
        Lb3:
            return r1
        Lb4:
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wug.fO(wtz, fcxy):java.lang.Object");
    }
}
