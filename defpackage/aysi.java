package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aysi {
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final Context e;
    public final fdjx f;
    public final fcsu g;
    public final ayrn h;
    public final aqlt i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final ahzu n;
    private final aysl p;
    private final ariz q;
    private static final ekrg o = ekrg.c("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper");
    public static final feav a = new feaz();

    public aysi(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, Context context, fdjx fdjxVar, fcsu fcsuVar4, aysl ayslVar, ayrn ayrnVar, aqlt aqltVar, ariz arizVar, fcsu fcsuVar5, fcsu fcsuVar6, ahzv ahzvVar, fcsu fcsuVar7, fcsu fcsuVar8) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        context.getClass();
        fdjxVar.getClass();
        fcsuVar4.getClass();
        ayrnVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = context;
        this.f = fdjxVar;
        this.g = fcsuVar4;
        this.p = ayslVar;
        this.h = ayrnVar;
        this.i = aqltVar;
        this.q = arizVar;
        this.j = fcsuVar5;
        this.k = fcsuVar6;
        this.l = fcsuVar7;
        this.m = fcsuVar8;
        this.n = ahzvVar.a(o, null, null);
    }

    public final File a(UUID uuid) {
        File dir = this.e.getDir("backup", 0);
        if (uuid != null) {
            File file = new File(new File(dir, uuid.toString()), "backup_db");
            if (file.exists()) {
                return file;
            }
        }
        File file2 = new File(dir, "backup_db");
        if (file2.exists()) {
            return file2;
        }
        this.n.k("Backup database file not found");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe A[Catch: Exception -> 0x010c, TryCatch #1 {Exception -> 0x010c, blocks: (B:27:0x00f5, B:29:0x00fe, B:31:0x0108, B:30:0x0105), top: B:65:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105 A[Catch: Exception -> 0x010c, TryCatch #1 {Exception -> 0x010c, blocks: (B:27:0x00f5, B:29:0x00fe, B:31:0x0108, B:30:0x0105), top: B:65:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aytc r30, java.util.UUID r31, defpackage.azva r32, defpackage.fcxy r33) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aysi.b(aytc, java.util.UUID, azva, fcxy):java.lang.Object");
    }

    public final void c(final aytd aytdVar, final aytc aytcVar, final boolean z, String str, final emng emngVar, final UUID uuid, final azva azvaVar) throws IOException {
        if (this.q.a() && ((((arjg) this.m.b()).a() && aytcVar.c.contains(emngVar)) || aytcVar.b.contains(str))) {
            this.n.h("[%s]: Table disabled via BackupParameters", emngVar.name());
            return;
        }
        ahzu ahzuVar = this.n;
        ahzuVar.h("[%s]: Writing Backup", emngVar.name());
        ahzuVar.i("[%s]: Backup time: [%s]ms", emngVar.name(), Long.valueOf(fdhi.g(ayrq.c("DatabaseBackerUpper::writeSingleBackupTable", new fdae() { // from class: ayrx
            @Override // defpackage.fdae
            public final Object invoke() throws Exception {
                try {
                    aytdVar.b(aytcVar);
                } catch (Exception e) {
                    emng emngVar2 = emngVar;
                    aysi aysiVar = this;
                    if (!z) {
                        if (((arjg) aysiVar.m.b()).a()) {
                            throw new aysd(emngVar2, e);
                        }
                        throw e;
                    }
                    aysiVar.n.o(e, "[%s]: Failed to write to Backup, continuing.", emngVar2.name());
                    if (((arjg) aysiVar.m.b()).a()) {
                        aysiVar.e(uuid, azvaVar, 9, emngVar2);
                    }
                }
                return fctx.a;
            }
        }))));
    }

    public final Object d(int i, fdae fdaeVar) {
        if (!((arjg) this.m.b()).a()) {
            return fdaeVar.invoke();
        }
        try {
            return fdaeVar.invoke();
        } catch (Exception e) {
            throw new ayse(i, e);
        }
    }

    public final void e(UUID uuid, azva azvaVar, int i, emng emngVar) {
        this.p.a(uuid, azvaVar, i, emngVar);
    }
}
