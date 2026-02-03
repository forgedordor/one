package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvp implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ wvu b;
    final /* synthetic */ wvi c;

    public wvp(fdpm fdpmVar, wvu wvuVar, wvi wviVar) {
        this.a = fdpmVar;
        this.b = wvuVar;
        this.c = wviVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof defpackage.wvo
            if (r2 == 0) goto L17
            r2 = r1
            wvo r2 = (defpackage.wvo) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            wvo r2 = new wvo
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.b
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            defpackage.fctl.b(r1)
            goto Ld3
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            defpackage.fctl.b(r1)
            fdpm r1 = r0.a
            r4 = r23
            java.util.Map r4 = (java.util.Map) r4
            wvu r6 = r0.b
            wvi r7 = r0.c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r9 = r7.a
            java.util.Iterator r9 = r9.iterator()
        L4c:
            boolean r10 = r9.hasNext()
            r11 = 0
            if (r10 == 0) goto Lbb
            java.lang.Object r10 = r9.next()
            cilt r10 = (defpackage.cilt) r10
            anue r12 = r10.c
            java.lang.Object r12 = r4.get(r12)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r12 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r12
            if (r12 != 0) goto L8b
            ekrg r10 = defpackage.wvu.a
            ekrw r10 = r10.j()
            ekrz r12 = defpackage.eksq.a
            java.lang.String r13 = "BugleMentions"
            r10.X(r12, r13)
            r12 = 84
            java.lang.String r13 = "MentionSuggestionsUiAdapterImpl.kt"
            java.lang.String r14 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/mentions/MentionSuggestionsUiAdapterImpl"
            java.lang.String r15 = "createMentionSuggestionsUiData"
            ekrw r10 = r10.h(r14, r15, r12, r13)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r12 = "Ignoring mention due to race condition in membership state"
            r10.q(r12)
            ains r10 = r6.f
            java.lang.String r12 = "Bugle.RcsGroups.Mentions.InvalidMembershipState.Count"
            r10.c(r12)
            goto Lb5
        L8b:
            cphz r11 = r6.d
            djhz r13 = new djhz
            dkrk r14 = new dkrk
            dkpf r15 = r11.c(r12)
            r20 = 0
            r21 = 62
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r11 = r10.a
            java.lang.String r12 = r10.b
            wvm r15 = new wvm
            r15.<init>()
            java.lang.String r10 = r11.concat(r12)
            r13.<init>(r14, r10, r15)
            r11 = r13
        Lb5:
            if (r11 == 0) goto L4c
            r8.add(r11)
            goto L4c
        Lbb:
            boolean r4 = r8.isEmpty()
            if (r5 == r4) goto Lc2
            goto Lc3
        Lc2:
            r8 = r11
        Lc3:
            if (r8 == 0) goto Lca
            djdy r11 = new djdy
            r11.<init>(r8)
        Lca:
            r2.b = r5
            java.lang.Object r1 = r1.fO(r11, r2)
            if (r1 != r3) goto Ld3
            return r3
        Ld3:
            fctx r1 = defpackage.fctx.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvp.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
