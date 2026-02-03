package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pen extends pjp {
    final /* synthetic */ pep a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pen(pep pepVar, int i) {
        super(i);
        this.a = pepVar;
    }

    @Override // defpackage.pjp
    public final void a(pjo pjoVar) throws Exception {
        pgz pgzVar = new pgz(pjoVar);
        phi phiVarA = pgzVar.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (phiVarA.j()) {
                if (phiVarA.b(0) == 0) {
                    z = true;
                }
            }
            pep pepVar = this.a;
            fdaa.a(phiVarA, null);
            pfa pfaVar = pepVar.b;
            pfaVar.b(pgzVar);
            if (!z) {
                pez pezVarA = pfaVar.a(pgzVar);
                if (!pezVarA.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(pezVarA.b)));
                }
            }
            pepVar.b(pgzVar);
            pfaVar.f();
            for (pev pevVar : pepVar.c) {
            }
        } finally {
        }
    }

    @Override // defpackage.pjp
    public final void b(pjo pjoVar, int i, int i2) {
        d(pjoVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // defpackage.pjp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.pjo r10) throws java.lang.Exception {
        /*
            r9 = this;
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            pgz r1 = new pgz
            r1.<init>(r10)
            java.lang.String r2 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'"
            phi r2 = r1.a(r2)
            boolean r3 = r2.j()     // Catch: java.lang.Throwable -> Ld3
            r4 = 0
            if (r3 == 0) goto L20
            long r5 = r2.b(r4)     // Catch: java.lang.Throwable -> Ld3
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = r4
        L21:
            pep r5 = r9.a
            r6 = 0
            defpackage.fdaa.a(r2, r6)
            if (r3 == 0) goto L66
            java.lang.String r0 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            phi r0 = r1.a(r0)
            boolean r2 = r0.j()     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L3a
            java.lang.String r2 = r0.d(r4)     // Catch: java.lang.Throwable -> L5f
            goto L3b
        L3a:
            r2 = r6
        L3b:
            defpackage.fdaa.a(r0, r6)
            pfa r0 = r5.b
            java.lang.String r3 = r0.b
            boolean r4 = defpackage.fdbq.f(r3, r2)
            if (r4 != 0) goto Lab
            java.lang.String r0 = r0.c
            boolean r0 = defpackage.fdbq.f(r0, r2)
            if (r0 == 0) goto L51
            goto Lab
        L51:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r1 = ", found: "
            java.lang.String r0 = defpackage.a.n(r2, r3, r0, r1)
            r10.<init>(r0)
            throw r10
        L5f:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> L61
        L61:
            r1 = move-exception
            defpackage.fdaa.a(r0, r10)
            throw r1
        L66:
            java.lang.String r2 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.pjk.a(r1, r2)
            pfa r2 = r5.b     // Catch: java.lang.Throwable -> L92
            pez r3 = r2.a(r1)     // Catch: java.lang.Throwable -> L92
            boolean r4 = r3.a     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L7e
            r2.g()     // Catch: java.lang.Throwable -> L92
            r5.b(r1)     // Catch: java.lang.Throwable -> L92
            fctx r0 = defpackage.fctx.a     // Catch: java.lang.Throwable -> L92
            goto L97
        L7e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r3.b     // Catch: java.lang.Throwable -> L92
            r4.append(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L92
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L92
            throw r2     // Catch: java.lang.Throwable -> L92
        L92:
            r0 = move-exception
            java.lang.Object r0 = defpackage.fctl.a(r0)
        L97:
            boolean r2 = defpackage.fctk.d(r0)
            if (r2 == 0) goto La5
            r2 = r0
            fctx r2 = (defpackage.fctx) r2
            java.lang.String r2 = "END TRANSACTION"
            defpackage.pjk.a(r1, r2)
        La5:
            java.lang.Throwable r0 = defpackage.fctk.c(r0)
            if (r0 != 0) goto Lcd
        Lab:
            pfa r0 = r5.b
            r0.d(r1)
            java.util.List r0 = r5.c
            java.util.Iterator r0 = r0.iterator()
        Lb6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc8
            java.lang.Object r2 = r0.next()
            pev r2 = (defpackage.pev) r2
            pjo r3 = r1.a
            r2.a(r3)
            goto Lb6
        Lc8:
            pep r0 = r9.a
            r0.d = r10
            return
        Lcd:
            java.lang.String r10 = "ROLLBACK TRANSACTION"
            defpackage.pjk.a(r1, r10)
            throw r0
        Ld3:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> Ld5
        Ld5:
            r0 = move-exception
            defpackage.fdaa.a(r2, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pen.c(pjo):void");
    }

    @Override // defpackage.pjp
    public final void d(pjo pjoVar, int i, int i2) {
        pgz pgzVar = new pgz(pjoVar);
        pep pepVar = this.a;
        pdi pdiVar = pepVar.a;
        List listA = pia.a(pdiVar.d, i, i2);
        if (listA == null) {
            if (pia.b(pdiVar, i, i2)) {
                throw new IllegalStateException(a.z(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."));
            }
            pfa pfaVar = pepVar.b;
            pfaVar.c(pgzVar);
            for (pev pevVar : pepVar.c) {
            }
            pfaVar.b(pgzVar);
            return;
        }
        pfa pfaVar2 = pepVar.b;
        pfaVar2.e(pgzVar);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((phj) it.next()).b(pgzVar);
        }
        pez pezVarA = pfaVar2.a(pgzVar);
        if (!pezVarA.a) {
            throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(pezVarA.b)));
        }
        pfaVar2.g();
        pepVar.b(pgzVar);
    }
}
