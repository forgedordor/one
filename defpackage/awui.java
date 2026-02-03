package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awui extends fcyz implements fdat {
    int a;
    final /* synthetic */ awuo b;
    final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awui(awuo awuoVar, Set set, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awuoVar;
        this.c = set;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awui) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (r1.b(r3, r10) == r0) goto L27;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 1
            defpackage.fctl.b(r11)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L18
            goto Lab
        Le:
            awuo r11 = r10.b
            r10.a = r2
            java.lang.Object r11 = r11.f(r10)
            if (r11 == r0) goto Lba
        L18:
            java.util.Set r1 = r10.c
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r11.iterator()
        L25:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r3.next()
            r5 = r4
            awxn r5 = (defpackage.awxn) r5
            axcm r5 = r5.b()
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L25
            r2.add(r4)
            goto L25
        L40:
            awuo r1 = r10.b
            arpg r3 = r1.f
            aros r3 = (defpackage.aros) r3
            fcsu r3 = r3.a
            java.lang.Object r3 = r3.b()
            eoth r3 = (defpackage.eoth) r3
            java.lang.String r4 = "bugle.log_active_token_not_canonical"
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L99
            java.util.Iterator r3 = r2.iterator()
        L5a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L99
            java.lang.Object r4 = r3.next()
            awxn r4 = (defpackage.awxn) r4
            j$.util.Optional r5 = r4.e()
            boolean r5 = r5.isPresent()
            if (r5 == 0) goto L5a
            ekrg r5 = defpackage.awuo.a
            ekrw r5 = r5.j()
            ekrz r6 = defpackage.eksq.a
            java.lang.String r7 = "BugleCME"
            r5.X(r6, r7)
            r6 = 124(0x7c, float:1.74E-43)
            java.lang.String r7 = "BaseMyIdentityManager.kt"
            java.lang.String r8 = "com/google/android/apps/messaging/shared/core/myidentity/BaseMyIdentityManager$updateActiveMyIdentities$1"
            java.lang.String r9 = "invokeSuspend"
            ekrw r5 = r5.h(r8, r9, r6, r7)
            ekrd r5 = (defpackage.ekrd) r5
            axcm r6 = r4.b()
            j$.util.Optional r4 = r4.e()
            java.lang.String r7 = "ActiveToken has canonicalToken set. ActiveToken: %s, canonicalToken: %s"
            r5.D(r7, r6, r4)
            goto L5a
        L99:
            awlc r1 = r1.c
            awuh r3 = new awuh
            r4 = 0
            r3.<init>(r11, r2, r4)
            r11 = 2
            r10.a = r11
            java.lang.Object r11 = r1.b(r3, r10)
            if (r11 != r0) goto Lab
            goto Lba
        Lab:
            awuo r11 = r10.b
            awug r0 = new awug
            r0.<init>()
            awlc r11 = r11.c
            r11.d(r0)
            fctx r11 = defpackage.fctx.a
            return r11
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awui.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awui(this.b, this.c, fcxyVar);
    }
}
