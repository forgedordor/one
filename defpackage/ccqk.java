package defpackage;

import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccqk implements ccql {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsOnImdnVerifiedHandler");
    public final ciwi a;

    public ccqk(ciwi ciwiVar) {
        ciwiVar.getClass();
        this.a = ciwiVar;
    }

    @Override // defpackage.ccql
    public final Object a(ChatSessionMessageEvent chatSessionMessageEvent, cbqz cbqzVar, basd basdVar, elpg elpgVar, fcxy fcxyVar) throws Throwable {
        Object objB = b(basdVar, cbqzVar.d(), new ccqi(this, chatSessionMessageEvent, cbqzVar, basdVar, elpgVar, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.basd r10, boolean r11, defpackage.fdap r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.ccqj
            if (r0 == 0) goto L13
            r0 = r13
            ccqj r0 = (defpackage.ccqj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccqj r0 = new ccqj
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "withImdnProcessingLogged"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/e2ee/mls/incoming/MlsOnImdnVerifiedHandler"
            java.lang.String r5 = "BugleE2eeMls"
            r6 = 1
            java.lang.String r7 = "MlsOnImdnVerifiedHandler.kt"
            if (r2 == 0) goto L39
            if (r2 != r6) goto L31
            basd r10 = r0.d
            defpackage.fctl.b(r13)
            goto L6e
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            defpackage.fctl.b(r13)
            ekrg r13 = defpackage.ccqk.b
            ekrw r13 = r13.e()
            ekrz r2 = defpackage.eksq.a
            r13.X(r2, r5)
            ekrd r13 = (defpackage.ekrd) r13
            ekrz r2 = defpackage.cqnc.e
            java.lang.String r8 = r10.f()
            r13.X(r2, r8)
            r2 = 53
            ekrw r13 = r13.h(r4, r3, r2, r7)
            ekrd r13 = (defpackage.ekrd) r13
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            java.lang.String r2 = "Start processing receipt... The receipt was encrypted: %b"
            r13.t(r2, r11)
            r0.d = r10
            r0.c = r6
            java.lang.Object r11 = r12.invoke(r0)
            if (r11 != r1) goto L6e
            return r1
        L6e:
            ekrg r11 = defpackage.ccqk.b
            ekrw r11 = r11.e()
            ekrz r12 = defpackage.eksq.a
            r11.X(r12, r5)
            ekrd r11 = (defpackage.ekrd) r11
            ekrz r12 = defpackage.cqnc.e
            java.lang.String r10 = r10.f()
            r11.X(r12, r10)
            r10 = 58
            ekrw r10 = r11.h(r4, r3, r10, r7)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "Completed receipt processing."
            r10.q(r11)
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccqk.b(basd, boolean, fdap, fcxy):java.lang.Object");
    }
}
