package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yxu extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ amyb c;
    final /* synthetic */ yya d;
    final /* synthetic */ yxg e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxu(fcxy fcxyVar, amyb amybVar, yya yyaVar, yxg yxgVar) {
        super(3, fcxyVar);
        this.c = amybVar;
        this.d = yyaVar;
        this.e = yxgVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yxu yxuVar = new yxu((fcxy) obj3, this.c, this.d, this.e);
        yxuVar.f = (fdpm) obj;
        yxuVar.b = obj2;
        return yxuVar.b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            defpackage.fctl.b(r8)
            if (r1 == 0) goto La
            goto L6e
        La:
            java.lang.Object r8 = r7.f
            java.lang.Object r1 = r7.b
            aoer r1 = (defpackage.aoer) r1
            r2 = 1
            if (r1 == 0) goto L5f
            boolean r1 = r1.v()
            if (r1 != r2) goto L5f
            amyb r1 = r7.c
            boolean r3 = r1.f()
            if (r3 == 0) goto L2a
            yya r3 = r7.d
            yxg r4 = r7.e
            auyl r1 = r3.a(r1, r4)
            goto L65
        L2a:
            ekrg r1 = defpackage.yya.a
            ekrw r1 = r1.h()
            r3 = 202(0xca, float:2.83E-43)
            java.lang.String r4 = "ProgressBarOverlayUiAdapter.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter$createWithOverlayForSatellite$$inlined$flatMapLatest$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r1 = r1.h(r5, r6, r3, r4)
            ekrd r1 = (defpackage.ekrd) r1
            yxg r3 = r7.e
            ajlt r4 = r3.a
            java.lang.String r5 = "Not transferring for messageId=%s"
            com.google.android.apps.messaging.shared.api.messaging.MessageId r6 = r4.b()
            r1.t(r5, r6)
            boolean r1 = defpackage.ykm.q(r4)
            if (r1 == 0) goto L5f
            yya r1 = r7.d
            auxq r4 = new auxq
            yxv r5 = new yxv
            r5.<init>(r1, r3)
            r4.<init>(r5)
            r1 = r4
            goto L65
        L5f:
            fdpu r1 = new fdpu
            r3 = 0
            r1.<init>(r3)
        L65:
            r7.a = r2
            java.lang.Object r8 = defpackage.fdpy.c(r8, r1, r7)
            if (r8 != r0) goto L6e
            return r0
        L6e:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxu.b(java.lang.Object):java.lang.Object");
    }
}
