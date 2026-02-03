package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xya implements fdpm {
    final /* synthetic */ fdpm a;
    final /* synthetic */ Map b;
    final /* synthetic */ xxe c;
    final /* synthetic */ int d;
    final /* synthetic */ fdjx e;
    final /* synthetic */ xye f;

    public xya(fdpm fdpmVar, Map map, xxe xxeVar, int i, fdjx fdjxVar, xye xyeVar) {
        this.a = fdpmVar;
        this.b = map;
        this.c = xxeVar;
        this.d = i;
        this.e = fdjxVar;
        this.f = xyeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.xxz
            if (r0 == 0) goto L13
            r0 = r15
            xxz r0 = (defpackage.xxz) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            xxz r0 = new xxz
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r15)
            goto L9e
        L28:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L30:
            defpackage.fctl.b(r15)
            fdpm r15 = r13.a
            r8 = r14
            yby r8 = (defpackage.yby) r8
            java.util.Map r14 = r13.b
            xxe r2 = r13.c
            int r4 = r13.d
            java.util.List r2 = r2.a
            java.lang.Object r5 = r2.get(r4)
            ajlt r5 = (defpackage.ajlt) r5
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r5.b()
            java.lang.String r5 = r5.a()
            if (r5 == 0) goto La1
            r6 = 0
            java.lang.Object r14 = j$.util.Map.EL.getOrDefault(r14, r5, r6)
            r7 = r14
            xwn r7 = (defpackage.xwn) r7
            if (r7 == 0) goto L95
            fdjx r5 = r13.e
            r14 = r4
            xxd r4 = new xxd
            java.lang.Object r14 = r2.get(r14)
            r6 = r14
            ajlt r6 = (defpackage.ajlt) r6
            xye r14 = r13.f
            arlw r2 = r14.h
            arli r2 = (defpackage.arli) r2
            fcsu r2 = r2.a
            xxc r12 = new xxc
            java.lang.Object r2 = r2.b()
            eoth r2 = (defpackage.eoth) r2
            java.lang.String r9 = "bugle.enable_send_button_improvements_in_media_viewer"
            boolean r2 = r2.a(r9)
            asik r9 = r14.g
            boolean r9 = r9.a()
            asif r10 = r14.f
            boolean r10 = r10.a()
            r12.<init>(r2, r9, r10)
            fctc r9 = r14.j
            vtx r10 = r14.d
            vts r11 = r14.e
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r6 = r4
        L95:
            r0.b = r3
            java.lang.Object r14 = r15.fO(r6, r0)
            if (r14 != r1) goto L9e
            return r1
        L9e:
            fctx r14 = defpackage.fctx.a
            return r14
        La1:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xya.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
