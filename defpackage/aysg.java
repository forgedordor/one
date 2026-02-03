package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aysg extends fcyz implements fdap {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    Object h;
    Object i;
    Object j;
    int k;
    final /* synthetic */ aysi l;
    final /* synthetic */ aytc m;
    final /* synthetic */ UUID n;
    final /* synthetic */ azva o;
    final /* synthetic */ fdci p;
    final /* synthetic */ fdcg q;
    final /* synthetic */ fdcg r;
    final /* synthetic */ fdcg s;
    final /* synthetic */ fdcg t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aysg(aysi aysiVar, aytc aytcVar, UUID uuid, azva azvaVar, fdci fdciVar, fdcg fdcgVar, fdcg fdcgVar2, fdcg fdcgVar3, fdcg fdcgVar4, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.l = aysiVar;
        this.m = aytcVar;
        this.n = uuid;
        this.o = azvaVar;
        this.p = fdciVar;
        this.q = fdcgVar;
        this.r = fdcgVar2;
        this.s = fdcgVar3;
        this.t = fdcgVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        feav feavVar;
        Object obj10;
        aiaa aiaaVarA;
        fcyl fcylVar = fcyl.a;
        if (this.k != 0) {
            obj9 = this.j;
            obj8 = this.i;
            obj7 = this.h;
            obj6 = this.g;
            obj5 = this.f;
            obj4 = this.e;
            obj3 = this.d;
            obj2 = this.c;
            Object obj11 = this.b;
            Object obj12 = this.a;
            fctl.b(obj);
            obj10 = obj11;
            feavVar = obj12;
        } else {
            fctl.b(obj);
            aysi aysiVar = this.l;
            feav feavVar2 = aysiVar.i.a() ? aysiVar.h.a : aysi.a;
            obj2 = this.m;
            obj3 = this.n;
            obj4 = this.o;
            obj5 = this.p;
            obj6 = this.q;
            obj7 = this.r;
            obj8 = this.s;
            fdcg fdcgVar = this.t;
            this.a = feavVar2;
            this.b = aysiVar;
            this.c = obj2;
            this.d = obj3;
            this.e = obj4;
            this.f = obj5;
            this.g = obj6;
            this.h = obj7;
            this.i = obj8;
            this.j = fdcgVar;
            this.k = 1;
            if (feavVar2.b(this) == fcylVar) {
                return fcylVar;
            }
            obj9 = fdcgVar;
            obj10 = aysiVar;
            feavVar = feavVar2;
        }
        try {
            feav feavVar3 = aysi.a;
            ((aysy) ((aysi) obj10).g.b()).a().h().disableWriteAheadLogging();
            final aysi aysiVar2 = (aysi) obj10;
            ((aysi) obj10).d(4, new fdae() { // from class: ayry
                @Override // defpackage.fdae
                public final Object invoke() {
                    aysi aysiVar3 = aysiVar2;
                    aysiVar3.n.g("Clearing Backup Database");
                    dqsy dqsyVarE = dqru.e(((dqom) ayta.a()).b);
                    try {
                        dqsyVarE.v("PRAGMA FOREIGN_KEYS = 0");
                        Object objB = aysiVar3.c.b();
                        objB.getClass();
                        Iterator it = ((Iterable) objB).iterator();
                        while (it.hasNext()) {
                            ((aytg) it.next()).a.a();
                        }
                        Object objB2 = aysiVar3.b.b();
                        objB2.getClass();
                        Iterator it2 = ((Iterable) objB2).iterator();
                        while (it2.hasNext()) {
                            ((aytg) it2.next()).a.a();
                        }
                        dqsyVarE.v("PRAGMA FOREIGN_KEYS = 1");
                        return fctx.a;
                    } catch (Throwable th) {
                        dqsyVarE.v("PRAGMA FOREIGN_KEYS = 1");
                        throw th;
                    }
                }
            });
            final aysi aysiVar3 = (aysi) obj10;
            ((aysi) obj10).d(5, new fdae() { // from class: ayrt
                @Override // defpackage.fdae
                public final Object invoke() throws IOException {
                    aysy aysyVar = (aysy) aysiVar3.g.b();
                    Cursor cursorE = aysyVar.b().e("pragma wal_checkpoint(TRUNCATE)", null);
                    try {
                        cursorE.moveToFirst();
                        aysyVar.d.c("Checkpoint BugleDb complete: checkpointed = [%s], pages written = [%s]", Boolean.valueOf(cursorE.getLong(0) == 0), Long.valueOf(cursorE.getLong(2)));
                        fczl.a(cursorE, null);
                        return fctx.a;
                    } finally {
                    }
                }
            });
            try {
                final aysi aysiVar4 = (aysi) obj10;
                final aytc aytcVar = (aytc) obj2;
                final UUID uuid = (UUID) obj3;
                final azva azvaVar = (azva) obj4;
                ((dqsn) ((aysi) obj10).d.b()).d("buildBackupDatabase-bugle", new Runnable() { // from class: ayrz
                    @Override // java.lang.Runnable
                    public final void run() {
                        final aysi aysiVar5 = aysiVar4;
                        aysiVar5.d(6, new fdae() { // from class: ayrw
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                aysy aysyVar = (aysy) aysiVar5.g.b();
                                aysyVar.d(aysyVar.a(), aysyVar.b(), "bugleDb");
                                return fctx.a;
                            }
                        });
                        ahzu ahzuVar = aysiVar5.n;
                        ahzuVar.g("Writing Core Backup Tables");
                        final aytc aytcVar2 = aytcVar;
                        final UUID uuid2 = uuid;
                        final azva azvaVar2 = azvaVar;
                        ahzuVar.h("Total Core Backup time: [%s]ms", Long.valueOf(fdhi.g(ayrq.c("DatabaseBackerUpper::copyDataFromBugleDb#coreBackup", new fdae() { // from class: ayru
                            @Override // defpackage.fdae
                            public final Object invoke() throws IOException {
                                aysi aysiVar6 = aysiVar5;
                                for (aytg aytgVar : (List) aysiVar6.b.b()) {
                                    azva azvaVar3 = azvaVar2;
                                    UUID uuid3 = uuid2;
                                    aytc aytcVar3 = aytcVar2;
                                    aysiVar6.c(aytgVar.a, aytcVar3, false, aytgVar.b, aytgVar.c, uuid3, azvaVar3);
                                }
                                return fctx.a;
                            }
                        }))));
                        ahzuVar.g("Writing Feature Backup Tables");
                        ahzuVar.h("Total Feature Backup time: [%s]ms", Long.valueOf(fdhi.g(ayrq.c("DatabaseBackerUpper::copyDataFromBugleDb#featueBackup", new fdae() { // from class: ayrv
                            @Override // defpackage.fdae
                            public final Object invoke() throws IOException {
                                aysi aysiVar6 = aysiVar5;
                                for (aytg aytgVar : (List) aysiVar6.c.b()) {
                                    azva azvaVar3 = azvaVar2;
                                    UUID uuid3 = uuid2;
                                    aytc aytcVar3 = aytcVar2;
                                    aysiVar6.c(aytgVar.a, aytcVar3, true, aytgVar.b, aytgVar.c, uuid3, azvaVar3);
                                }
                                return fctx.a;
                            }
                        }))));
                    }
                });
                final aysi aysiVar5 = (aysi) obj10;
                ((aysi) obj10).d(7, new fdae() { // from class: aysa
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        aysy aysyVar = (aysy) aysiVar5.g.b();
                        aysyVar.f(aysyVar.a(), aysyVar.b(), "bugleDb");
                        return fctx.a;
                    }
                });
                ahzu ahzuVar = ((aysi) obj10).n;
                ahzuVar.g("Preparing BackupDb for storage");
                final aysi aysiVar6 = (aysi) obj10;
                ahzuVar.h("Prepare BackupDb time: [%s]ms", Long.valueOf(fdhi.g(ayrq.c("DatabaseBackerUpper::prepareBackupDbForStorage", new fdae() { // from class: ayrs
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ((aysy) aysiVar6.g.b()).a().v("VACUUM");
                        return fctx.a;
                    }
                }))));
                if (((Boolean) ((aysi) obj10).l.b()).booleanValue()) {
                    String[] strArr = azqo.a;
                    azql azqlVar = new azql(azqo.a);
                    azqlVar.A("backup");
                    azpm azpmVar = (azpm) azqlVar.b().l();
                    if (azpmVar == null) {
                        aiaaVarA = aiaa.a;
                        aiaaVarA.getClass();
                    } else {
                        ahzz ahzzVar = (ahzz) aiaa.a.createBuilder();
                        ahzzVar.getClass();
                        String strE = azpmVar.e();
                        strE.getClass();
                        aiab.b(strE, ahzzVar);
                        azpmVar.aA(1, "schema_version");
                        aiab.f(azpmVar.b, ahzzVar);
                        Instant instantD = azpmVar.d();
                        instantD.getClass();
                        aiab.c(evxd.b(instantD), ahzzVar);
                        Object objB = ((aysi) obj10).j.b();
                        objB.getClass();
                        aiab.d(((Number) objB).longValue(), ahzzVar);
                        Object objB2 = ((aysi) obj10).k.b();
                        objB2.getClass();
                        aiab.e(((Number) objB2).longValue(), ahzzVar);
                        aiaaVarA = aiab.a(ahzzVar);
                    }
                } else {
                    aiaaVarA = aiaa.a;
                    aiaaVarA.getClass();
                }
                ((fdci) obj5).a = aiaaVarA;
                azkz azkzVarA = azlc.a();
                azkzVarA.A("DatabaseBackerUpper#getBackupMessageCount");
                azkzVarA.s();
                ((fdcg) obj6).a = azkzVarA.b().h();
                ayze ayzeVarA = ayzh.a();
                ayzeVarA.A("DatabaseBackerUpper#getBackupMessageCount");
                ayzeVarA.s();
                ((fdcg) obj7).a = ayzeVarA.b().h();
                azuq azuqVarA = azut.a();
                azuqVarA.A("DatabaseBackerUpper#getBackupParticipantsCount");
                azuqVarA.s();
                ((fdcg) obj8).a = azuqVarA.b().h();
                aznp aznpVarA = azns.a();
                aznpVarA.A("DatabaseBackerUpper#getBackupPartsCount");
                aznpVarA.s();
                ((fdcg) obj9).a = aznpVarA.b().h();
                final aysi aysiVar7 = (aysi) obj10;
                final UUID uuid2 = (UUID) obj3;
                return (File) ((aysi) obj10).d(8, new fdae() { // from class: ayrr
                    @Override // defpackage.fdae
                    public final Object invoke() throws IOException {
                        aysi aysiVar8 = aysiVar7;
                        File dir = aysiVar8.e.getDir("backup", 0);
                        File fileC = ((aysy) aysiVar8.g.b()).c();
                        File file = new File(dir, uuid2.toString());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(file, "backup_db");
                        file2.delete();
                        file2.createNewFile();
                        aysiVar8.n.h("Making a copy of backupDb at [%s]", file2.getPath());
                        FileInputStream fileInputStream = new FileInputStream(fileC);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                elec.a(fileInputStream, fileOutputStream);
                                fczl.a(fileOutputStream, null);
                                fczl.a(fileInputStream, null);
                                return file2;
                            } finally {
                            }
                        } finally {
                        }
                    }
                });
            } catch (Throwable th) {
                final aysi aysiVar8 = (aysi) obj10;
                ((aysi) obj10).d(7, new fdae() { // from class: aysa
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        aysy aysyVar = (aysy) aysiVar8.g.b();
                        aysyVar.f(aysyVar.a(), aysyVar.b(), "bugleDb");
                        return fctx.a;
                    }
                });
                throw th;
            }
        } finally {
            feavVar.d();
        }
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aysg(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (fcxy) obj).b(fctx.a);
    }
}
