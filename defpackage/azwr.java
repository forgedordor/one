package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwr implements azvn {
    public static final azwr a = new azwr();
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/CombinedConversationsWriterWorkflowSteps");

    private azwr() {
    }

    @Override // defpackage.azvn
    public final int a() {
        return azxe.a.a();
    }

    @Override // defpackage.azvn
    public final void b(dqws dqwsVar) {
        azxe.a.b(null);
        azxb.a.b(null);
        azww.a.b(null);
        azwz.a.b(null);
    }

    @Override // defpackage.azvn
    public final void c(ahzu ahzuVar) throws SQLException {
        azxe.a.c(ahzuVar);
        int iB = azvg.b(azxd.a, 5);
        if (ahzuVar != null) {
            ahzuVar.b("[conversations] found %d duplicate non-RCS-Group conversations by participants.", Integer.valueOf(iB));
        } else {
            ekrw ekrwVarE = b.e();
            ekrwVarE.X(eksq.a, "BugleRestore");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/datamodel/backup/restore/conversations/CombinedConversationsWriterWorkflowSteps", "findAndMarkDuplicates", 104, "BatchedConversationsRestoreTableWriter.kt")).r("[conversations] found %d duplicate non-RCS-Group conversations by participants.", iB);
        }
        azxb.a.c(ahzuVar);
        azww.a.c(ahzuVar);
        azwz.a.c(ahzuVar);
    }

    @Override // defpackage.azvn
    public final void d(ahzu ahzuVar) {
        azxe.a.d(ahzuVar);
        azxb.a.d(ahzuVar);
        azww.a.d(ahzuVar);
        azwz.a.d(ahzuVar);
    }

    @Override // defpackage.azvn
    public final void f() {
        azxe.a.f();
        azxb.a.f();
        azww.a.f();
        azwz.a.f();
    }

    @Override // defpackage.azvn
    public final void g(int i, dqxe dqxeVar) {
        azxe.a.g(i, null);
        ayur ayurVarA = ayuu.a();
        ayua ayuaVar = ayuu.c;
        ayub ayubVar = ayuaVar.b;
        ayub ayubVar2 = ayuaVar.a;
        azwc azwcVar = azvt.a;
        azxb.a.g(i, azvt.a(ayurVarA, ayubVar, ayubVar2, azwcVar, azvt.f));
        azww.a.g(i, azvt.a(ayuu.a(), ayubVar, ayubVar2, azwcVar, azvt.e));
        String[] strArr = aywb.a;
        ayvy ayvyVar = new ayvy(aywb.a);
        ayvk ayvkVar = aywb.c;
        azwz.a.g(i, azvt.a(ayvyVar, ayvkVar.b, ayvkVar.a, azwcVar, azvt.h));
    }

    @Override // defpackage.azvn
    public final /* synthetic */ void e(ahzu ahzuVar) {
    }
}
