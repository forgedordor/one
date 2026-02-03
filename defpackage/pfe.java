package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public final class pfe extends pjp {
    private pdi a;
    private final List c;
    private final pfc d;
    private final String e;
    private final String f;

    public pfe(pdi pdiVar, pfc pfcVar) {
        super(24);
        this.c = pdiVar.e;
        this.a = pdiVar;
        this.d = pfcVar;
        this.e = "08b926448d86528e697981ddd30459f7";
        this.f = "149fd8ad55885d3fe3549a37a0163243";
    }

    private final void g(pjo pjoVar) {
        pjoVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        pjoVar.g(pey.a(this.e));
    }

    @Override // defpackage.pjp
    public final void a(pjo pjoVar) throws IOException {
        Cursor cursorB = pjoVar.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) == 0) {
                    z = true;
                }
            }
            fczl.a(cursorB, null);
            pfc pfcVar = this.d;
            pfcVar.b(pjoVar);
            if (!z) {
                pfd pfdVarA = pfcVar.a(pjoVar);
                if (!pfdVarA.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(pfdVarA.b)));
                }
            }
            g(pjoVar);
            for (pev pevVar : this.c) {
            }
        } finally {
        }
    }

    @Override // defpackage.pjp
    public final void b(pjo pjoVar, int i, int i2) throws Exception {
        d(pjoVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // defpackage.pjp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.pjo r5) throws java.lang.Exception {
        /*
            r4 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r5.b(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> La9
            r2 = 0
            if (r1 == 0) goto L15
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = r2
        L16:
            r3 = 0
            defpackage.fczl.a(r0, r3)
            if (r1 == 0) goto L5c
            pjn r0 = new pjn
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r0 = r5.a(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L32
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L55
            goto L33
        L32:
            r1 = r3
        L33:
            defpackage.fczl.a(r0, r3)
            java.lang.String r0 = r4.e
            boolean r2 = defpackage.fdbq.f(r0, r1)
            if (r2 != 0) goto L69
            java.lang.String r2 = r4.f
            boolean r2 = defpackage.fdbq.f(r2, r1)
            if (r2 == 0) goto L47
            goto L69
        L47:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r3 = ", found: "
            java.lang.String r0 = defpackage.a.n(r1, r0, r2, r3)
            r5.<init>(r0)
            throw r5
        L55:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L57
        L57:
            r1 = move-exception
            defpackage.fczl.a(r0, r5)
            throw r1
        L5c:
            pfc r0 = r4.d
            pfd r0 = r0.a(r5)
            boolean r1 = r0.a
            if (r1 == 0) goto L97
            r4.g(r5)
        L69:
            pfc r0 = r4.d
            qdz r0 = (defpackage.qdz) r0
            androidx.work.impl.WorkDatabase_Impl r0 = r0.a
            r0.a = r5
            java.lang.String r1 = "PRAGMA foreign_keys = ON"
            r5.g(r1)
            pgz r1 = new pgz
            r1.<init>(r5)
            r0.u(r1)
            java.util.List r0 = r4.c
            java.util.Iterator r0 = r0.iterator()
        L84:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r0.next()
            pev r1 = (defpackage.pev) r1
            r1.a(r5)
            goto L84
        L94:
            r4.a = r3
            return
        L97:
            java.lang.String r5 = r0.b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        La9:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> Lab
        Lab:
            r1 = move-exception
            defpackage.fczl.a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfe.c(pjo):void");
    }

    @Override // defpackage.pjp
    public final void d(pjo pjoVar, int i, int i2) throws Exception {
        List listA;
        pdi pdiVar = this.a;
        if (pdiVar != null && (listA = pia.a(pdiVar.d, i, i2)) != null) {
            int i3 = phx.a;
            pho.a(new pgz(pjoVar));
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                ((phj) it.next()).b(new pgz(pjoVar));
            }
            pfd pfdVarA = this.d.a(pjoVar);
            if (!pfdVarA.a) {
                throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(pfdVarA.b)));
            }
            g(pjoVar);
            return;
        }
        pdi pdiVar2 = this.a;
        if (pdiVar2 == null || pia.b(pdiVar2, i, i2)) {
            throw new IllegalStateException(a.z(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        pjoVar.g("DROP TABLE IF EXISTS `Dependency`");
        pjoVar.g("DROP TABLE IF EXISTS `WorkSpec`");
        pjoVar.g("DROP TABLE IF EXISTS `WorkTag`");
        pjoVar.g("DROP TABLE IF EXISTS `SystemIdInfo`");
        pjoVar.g("DROP TABLE IF EXISTS `WorkName`");
        pjoVar.g("DROP TABLE IF EXISTS `WorkProgress`");
        pjoVar.g("DROP TABLE IF EXISTS `Preference`");
        for (pev pevVar : this.c) {
        }
        this.d.b(pjoVar);
    }

    @Override // defpackage.pjp
    public final void e() {
    }
}
