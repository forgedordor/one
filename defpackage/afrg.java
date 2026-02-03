package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afrg implements fdpm {
    final /* synthetic */ afri a;

    public afrg(afri afriVar) {
        this.a = afriVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [afmy] */
    @Override // defpackage.fdpm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(defpackage.afmy r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.afrf
            if (r0 == 0) goto L13
            r0 = r10
            afrf r0 = (defpackage.afrf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            afrf r0 = new afrf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.a
            defpackage.fctl.b(r10)
            goto L98
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r10)
            goto L75
        L3d:
            defpackage.fctl.b(r10)
            com.google.android.apps.messaging.multishare.chip.ChipData r10 = r9.a()
            if (r10 == 0) goto Laa
            com.google.android.apps.messaging.multishare.chip.ChipData r10 = r9.a()
            r10.getClass()
            com.google.android.apps.messaging.multishare.chip.ChipId r10 = r10.a
            boolean r2 = r10 instanceof com.google.android.apps.messaging.multishare.chip.ChipId.Identity
            if (r2 == 0) goto Laa
            afri r2 = r8.a
            r5 = r10
            com.google.android.apps.messaging.multishare.chip.ChipId$Identity r5 = (com.google.android.apps.messaging.multishare.chip.ChipId.Identity) r5
            alqm r5 = r5.a
            anty r2 = r2.a
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r2 = r2.h(r5)
            eiju r2 = r2.s()
            r0.a = r9
            r0.b = r10
            r0.e = r4
            java.lang.Object r2 = defpackage.fdxs.c(r2, r0)
            if (r2 != r1) goto L71
            goto La9
        L71:
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
        L75:
            anvg r5 = defpackage.anvg.b
            if (r10 != r5) goto Laa
            afri r10 = r8.a
            agec r5 = new agec
            com.google.android.apps.messaging.multishare.chip.ChipId$Identity r9 = (com.google.android.apps.messaging.multishare.chip.ChipId.Identity) r9
            alqm r9 = r9.a
            java.util.List r9 = defpackage.fcva.b(r9)
            r6 = 0
            r5.<init>(r6, r9, r4)
            r0.a = r2
            r0.b = r6
            r0.e = r3
            afzc r9 = r10.c
            java.lang.Object r10 = r9.f(r5, r0)
            if (r10 == r1) goto La9
            r9 = r2
        L98:
            agef r10 = (defpackage.agef) r10
            afri r10 = r8.a
            com.google.android.apps.messaging.multishare.chip.ChipData r9 = r9.a()
            r9.getClass()
            afmz r10 = r10.b
            r10.c(r9)
            goto Laa
        La9:
            return r1
        Laa:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afrg.fO(afmy, fcxy):java.lang.Object");
    }
}
