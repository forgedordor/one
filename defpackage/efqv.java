package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efqv extends efoz {
    @Override // defpackage.efoz
    public final void b(MessagingResult messagingResult, cjiy cjiyVar) {
        switch (messagingResult.a()) {
            case 0:
                cjiyVar.copyOnWrite();
                cjjb cjjbVar = (cjjb) cjiyVar.instance;
                cjjb cjjbVar2 = cjjb.a;
                cjjbVar.d = 0;
                cjjbVar.b |= 2;
                return;
            case 1:
                cjiyVar.copyOnWrite();
                cjjb cjjbVar3 = (cjjb) cjiyVar.instance;
                cjjb cjjbVar4 = cjjb.a;
                cjjbVar3.d = 1;
                cjjbVar3.b |= 2;
                return;
            case 2:
                cjiyVar.copyOnWrite();
                cjjb cjjbVar5 = (cjjb) cjiyVar.instance;
                cjjb cjjbVar6 = cjjb.a;
                cjjbVar5.d = 2;
                cjjbVar5.b |= 2;
                return;
            case 3:
                cjiyVar.copyOnWrite();
                cjjb cjjbVar7 = (cjjb) cjiyVar.instance;
                cjjb cjjbVar8 = cjjb.a;
                cjjbVar7.d = 3;
                cjjbVar7.b |= 2;
                return;
            case 4:
                cjiyVar.copyOnWrite();
                cjjb cjjbVar9 = (cjjb) cjiyVar.instance;
                cjjb cjjbVar10 = cjjb.a;
                cjjbVar9.d = 4;
                cjjbVar9.b |= 2;
                return;
            case 5:
                cjiyVar.copyOnWrite();
                cjjb cjjbVar11 = (cjjb) cjiyVar.instance;
                cjjb cjjbVar12 = cjjb.a;
                cjjbVar11.d = 5;
                cjjbVar11.b |= 2;
                return;
            case 6:
                cjiyVar.copyOnWrite();
                cjjb cjjbVar13 = (cjjb) cjiyVar.instance;
                cjjb cjjbVar14 = cjjb.a;
                cjjbVar13.d = 6;
                cjjbVar13.b |= 2;
                return;
            case 7:
                cjiyVar.copyOnWrite();
                cjjb cjjbVar15 = (cjjb) cjiyVar.instance;
                cjjb cjjbVar16 = cjjb.a;
                cjjbVar15.d = 7;
                cjjbVar15.b |= 2;
                return;
            default:
                throw new AssertionError("unexpected state: " + messagingResult.a());
        }
    }

    @Override // defpackage.efoz
    public final void c(MessagingResult messagingResult, cjiy cjiyVar) {
        int iB = messagingResult.b();
        if (iB == 0) {
            cjiyVar.copyOnWrite();
            cjjb cjjbVar = (cjjb) cjiyVar.instance;
            cjjb cjjbVar2 = cjjb.a;
            cjjbVar.c = 1;
            cjjbVar.b |= 1;
            return;
        }
        if (iB != 1 && iB != 2 && iB != 3) {
            switch (iB) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                case 14:
                case 15:
                case 16:
                    cjiyVar.copyOnWrite();
                    cjjb cjjbVar3 = (cjjb) cjiyVar.instance;
                    cjjb cjjbVar4 = cjjb.a;
                    cjjbVar3.c = 2;
                    cjjbVar3.b |= 1;
                    return;
                default:
                    throw new AssertionError("unexpected state: " + messagingResult.b());
            }
        }
        cjiyVar.copyOnWrite();
        cjjb cjjbVar5 = (cjjb) cjiyVar.instance;
        cjjb cjjbVar6 = cjjb.a;
        cjjbVar5.c = 0;
        cjjbVar5.b |= 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    @Override // defpackage.efoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.android.rcs.client.messaging.MessagingResult r7, defpackage.cjiy r8) {
        /*
            r6 = this;
            int r0 = r7.b()
            r1 = 2
            if (r0 < r1) goto L80
            cjkk r0 = defpackage.cjkk.a
            evsf r0 = r0.createBuilder()
            cjkh r0 = (defpackage.cjkh) r0
            int r2 = r7.b()
            r3 = 4
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L3d
            if (r2 == r1) goto L3d
            r5 = 3
            if (r2 == r5) goto L3d
            switch(r2) {
                case 10: goto L3d;
                case 11: goto L3d;
                case 12: goto L3d;
                case 13: goto L3d;
                case 14: goto L3e;
                case 15: goto L3b;
                case 16: goto L39;
                default: goto L21;
            }
        L21:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            int r7 = r7.b()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L39:
            r5 = r1
            goto L3e
        L3b:
            r5 = r3
            goto L3e
        L3d:
            r5 = r4
        L3e:
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r0.instance
            cjkk r2 = (defpackage.cjkk) r2
            int r5 = r5 + (-1)
            r2.c = r5
            int r5 = r2.b
            r4 = r4 | r5
            r2.b = r4
            j$.time.Duration r7 = r7.c()
            evrj r7 = defpackage.evwz.a(r7)
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r2 = r0.instance
            cjkk r2 = (defpackage.cjkk) r2
            r7.getClass()
            r2.d = r7
            int r7 = r2.b
            r7 = r7 | r1
            r2.b = r7
            evsn r7 = r0.build()
            cjkk r7 = (defpackage.cjkk) r7
            r8.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r8.instance
            cjjb r8 = (defpackage.cjjb) r8
            cjjb r0 = defpackage.cjjb.a
            r7.getClass()
            r8.e = r7
            int r7 = r8.b
            r7 = r7 | r3
            r8.b = r7
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efqv.d(com.google.android.rcs.client.messaging.MessagingResult, cjiy):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // defpackage.efoz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.rcs.client.messaging.MessagingResult r2, final defpackage.cjiy r3) {
        /*
            r1 = this;
            int r2 = r2.b()
            if (r2 == 0) goto L33
            r0 = 1
            if (r2 == r0) goto L33
            r0 = 2
            if (r2 == r0) goto L33
            r0 = 3
            if (r2 == r0) goto L33
            switch(r2) {
                case 10: goto L33;
                case 11: goto L33;
                case 12: goto L33;
                case 13: goto L33;
                case 14: goto L2c;
                case 15: goto L25;
                case 16: goto L1e;
                default: goto L12;
            }
        L12:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "unexpected state: "
            java.lang.String r2 = defpackage.a.g(r2, r0)
            r3.<init>(r2)
            throw r3
        L1e:
            cjja r2 = defpackage.cjja.FALLBACK_DEFAULT
            j$.util.Optional r2 = j$.util.Optional.of(r2)
            goto L37
        L25:
            cjja r2 = defpackage.cjja.FALLBACK_NOT_ALLOWED
            j$.util.Optional r2 = j$.util.Optional.of(r2)
            goto L37
        L2c:
            cjja r2 = defpackage.cjja.FALLBACK_REQUIRED
            j$.util.Optional r2 = j$.util.Optional.of(r2)
            goto L37
        L33:
            j$.util.Optional r2 = j$.util.Optional.empty()
        L37:
            r3.getClass()
            efqu r0 = new efqu
            r0.<init>()
            r2.ifPresent(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efqv.e(com.google.android.rcs.client.messaging.MessagingResult, cjiy):void");
    }

    public final cjjb f(MessagingResult messagingResult) {
        cjiy cjiyVar = (cjiy) apply(messagingResult).toBuilder();
        cjiyVar.copyOnWrite();
        cjjb cjjbVar = (cjjb) cjiyVar.instance;
        cjjbVar.b &= -9;
        cjjbVar.f = 0;
        return (cjjb) cjiyVar.build();
    }
}
