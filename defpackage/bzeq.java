package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzeq implements bzbb {
    private final dqsn a;

    public bzeq(dqsn dqsnVar) {
        dqsnVar.getClass();
        this.a = dqsnVar;
    }

    @Override // defpackage.bzbb
    public final void a(String str, String str2, cpyi cpyiVar) {
        try {
            bsbs bsbsVarF = ParticipantsTable.f();
            bsbsVarF.ap("CmsParticipantBackupTableAdapter#setCmsIdAndLifeCycleInTransaction");
            bsbsVarF.i(cpyiVar);
            bsbsVarF.g(str2);
            if (bsbsVarF.e(str)) {
            } else {
                throw new bzdd(str);
            }
        } catch (SQLiteConstraintException e) {
            throw new bzdj("Participants", str, e);
        }
    }

    @Override // defpackage.bzbb
    public final void b(Iterable iterable, cpyi cpyiVar) {
        Object next;
        iterable.getClass();
        cpyiVar.getClass();
        this.a.i();
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("CmsParticipantsBackupTableAdapter#setCmsLifeCyclesInTransaction1");
        bsbsVarF.i(cpyiVar);
        bsbx bsbxVar = new bsbx();
        bsbxVar.m(iterable);
        bsbsVarF.T(bsbxVar);
        if (bsbsVarF.b().e() == fcva.E(iterable)) {
            return;
        }
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("CmsParticipantsBackupTableAdapter#setCmsLifeCyclesInTransaction2");
        bsboVarE.c(ParticipantsTable.c.a);
        bsbx bsbxVar2 = new bsbx();
        bsbxVar2.m(iterable);
        bsboVarE.g(bsbxVar2);
        ekgb ekgbVarF = bsboVarE.b().f();
        ekgbVarF.getClass();
        Set setAv = fcva.av(ekgbVarF);
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (!setAv.contains((String) next)) {
                    break;
                }
            }
        }
        String str = (String) next;
        if (str == null) {
            str = "unknown";
        }
        throw new bzdd(str);
    }
}
