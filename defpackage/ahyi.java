package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyi extends fcyz implements fdap {
    int a;
    final /* synthetic */ ahzi b;
    final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyi(ahzi ahziVar, UUID uuid, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ahziVar;
        this.c = uuid;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        if (r5.s(r1, r2, r4) == r0) goto L29;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.a
            defpackage.fctl.b(r5)
            switch(r1) {
                case 0: goto Lc;
                case 1: goto L27;
                case 2: goto L3c;
                case 3: goto L74;
                case 4: goto L81;
                case 5: goto Lad;
                case 6: goto Lad;
                default: goto La;
            }
        La:
            goto Lc5
        Lc:
            ahzi r5 = r4.b
            arjj r1 = r5.m
            boolean r1 = r1.a()
            if (r1 == 0) goto L27
            fcsu r5 = r5.n
            java.lang.Object r5 = r5.b()
            cobl r5 = (defpackage.cobl) r5
            r1 = 1
            r4.a = r1
            java.lang.Object r5 = r5.f(r4)
            if (r5 == r0) goto Lc4
        L27:
            ahzi r5 = r4.b
            fcsu r5 = r5.b
            java.lang.Object r5 = r5.b()
            ahwd r5 = (defpackage.ahwd) r5
            java.util.UUID r1 = r4.c
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r5.o(r1, r4)
            if (r5 == r0) goto Lc4
        L3c:
            r5.getClass()
            ahto r5 = (defpackage.ahto) r5
            aiaf r5 = r5.c
            aiaf r1 = defpackage.aiaf.CREATED
            if (r5 != r1) goto L74
            ahzi r5 = r4.b
            java.util.UUID r1 = r4.c
            r2 = 3
            r4.a = r2
            java.lang.String[] r2 = defpackage.bmkn.a
            bmkd r2 = new bmkd
            r2.<init>()
            java.lang.String r3 = "clearBackupIdMap"
            r2.f(r3)
            r2.e()
            r2.d()
            fcsu r5 = r5.b
            java.lang.Object r5 = r5.b()
            ahwd r5 = (defpackage.ahwd) r5
            aiaf r2 = defpackage.aiaf.DATABASE_RESTORING
            java.lang.Object r5 = r5.s(r1, r2, r4)
            if (r5 == r0) goto L72
            fctx r5 = defpackage.fctx.a
        L72:
            if (r5 == r0) goto Lc4
        L74:
            ahzi r5 = r4.b
            java.util.UUID r1 = r4.c
            r2 = 4
            r4.a = r2
            java.lang.Object r5 = r5.k(r1, r4)
            if (r5 == r0) goto Lc4
        L81:
            ahzi r1 = r4.b
            ahtq r2 = r1.k
            ahzk r2 = (defpackage.ahzk) r2
            azvv r2 = r2.a
            java.io.File r5 = (java.io.File) r5
            boolean r3 = r2.c
            if (r3 == 0) goto L9b
            java.util.UUID r2 = r4.c
            r3 = 5
            r4.a = r3
            java.lang.Object r5 = r1.p(r5, r2, r4)
            if (r5 == r0) goto Lc4
            goto Lad
        L9b:
            fcsu r1 = r1.e
            java.lang.Object r1 = r1.b()
            ayso r1 = (defpackage.ayso) r1
            r3 = 6
            r4.a = r3
            java.lang.Object r5 = r1.a(r5, r2, r4)
            if (r5 != r0) goto Lad
            goto Lc4
        Lad:
            ahzi r5 = r4.b
            fcsu r5 = r5.b
            java.lang.Object r5 = r5.b()
            ahwd r5 = (defpackage.ahwd) r5
            java.util.UUID r1 = r4.c
            aiaf r2 = defpackage.aiaf.DATABASE_RESTORE_COMPLETE
            r3 = 7
            r4.a = r3
            java.lang.Object r5 = r5.s(r1, r2, r4)
            if (r5 != r0) goto Lc5
        Lc4:
            return r0
        Lc5:
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahyi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ahyi(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
