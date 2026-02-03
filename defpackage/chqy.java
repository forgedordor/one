package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chqy extends fcyz implements fdat {
    int a;
    final /* synthetic */ chqz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chqy(chqz chqzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chqzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chqy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
    
        if (r1.e.b(r8) == r0) goto L25;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r8.a
            r2 = 1
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/profile/synclet/ProfileRefreshSynclet$sync$1"
            java.lang.String r5 = "BugleProfiles"
            java.lang.String r6 = "ProfileRefreshSynclet.kt"
            defpackage.fctl.b(r9)
            if (r1 == 0) goto L16
            if (r1 == r2) goto L7a
            goto Lc9
        L16:
            chqz r9 = r8.b
            fcsu r1 = r9.f
            java.lang.Object r1 = r1.b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L41
            ekrg r9 = defpackage.chqz.a
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r5)
            r0 = 45
            ekrw r9 = r9.h(r4, r3, r0, r6)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Profiles full refresh disabled, not refreshing profiles"
            r9.q(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        L41:
            fcsu r1 = r9.g
            java.lang.Object r1 = r1.b()
            artb r1 = (defpackage.artb) r1
            boolean r1 = r1.a()
            if (r1 != 0) goto L6a
            ekrg r9 = defpackage.chqz.a
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r5)
            r0 = 50
            ekrw r9 = r9.h(r4, r3, r0, r6)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r0 = "Profiles synclet disabled, using startup task instead"
            r9.q(r0)
            fctx r9 = defpackage.fctx.a
            return r9
        L6a:
            r8.a = r2
            fcyh r1 = r9.d
            chqx r2 = new chqx
            r7 = 0
            r2.<init>(r9, r7)
            java.lang.Object r9 = defpackage.fdin.a(r1, r2, r8)
            if (r9 == r0) goto Le8
        L7a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto La1
            ekrg r9 = defpackage.chqz.a
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r5)
            r0 = 61
            ekrw r9 = r9.h(r4, r3, r0, r6)
            ekrd r9 = (defpackage.ekrd) r9
            chqz r0 = r8.b
            java.lang.String r1 = "Not running synclet for %s, id does not match current user state"
            efwo r0 = r0.b
            r9.t(r1, r0)
            fctx r9 = defpackage.fctx.a
            return r9
        La1:
            ekrg r9 = defpackage.chqz.a
            ekrw r9 = r9.h()
            ekrz r1 = defpackage.eksq.a
            r9.X(r1, r5)
            r1 = 67
            ekrw r9 = r9.h(r4, r3, r1, r6)
            ekrd r9 = (defpackage.ekrd) r9
            chqz r1 = r8.b
            java.lang.String r2 = "Profiles daily synclet full refresh worker started: %s"
            efwo r7 = r1.b
            r9.t(r2, r7)
            r9 = 2
            r8.a = r9
            chqo r9 = r1.e
            java.lang.Object r9 = r9.b(r8)
            if (r9 != r0) goto Lc9
            goto Le8
        Lc9:
            ekrg r9 = defpackage.chqz.a
            ekrw r9 = r9.h()
            ekrz r0 = defpackage.eksq.a
            r9.X(r0, r5)
            r0 = 71
            ekrw r9 = r9.h(r4, r3, r0, r6)
            ekrd r9 = (defpackage.ekrd) r9
            chqz r0 = r8.b
            java.lang.String r1 = "Profiles daily synclet full refresh worker finished: %s"
            efwo r0 = r0.b
            r9.t(r1, r0)
            fctx r9 = defpackage.fctx.a
            return r9
        Le8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chqy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chqy(this.b, fcxyVar);
    }
}
