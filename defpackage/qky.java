package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qky {
    public static final qba a(UUID uuid, qee qeeVar) {
        uuid.getClass();
        pzf pzfVar = qeeVar.d.m;
        qlo qloVar = qeeVar.m.a;
        qloVar.getClass();
        return qbe.a(pzfVar, "CancelWorkById", qloVar, new qku(qeeVar, uuid));
    }

    public static final void b(qee qeeVar, String str) {
        qfa qfaVarA;
        WorkDatabase workDatabase = qeeVar.e;
        workDatabase.getClass();
        qjo qjoVarD = workDatabase.D();
        qid qidVarX = workDatabase.x();
        List listI = fcva.i(str);
        while (!listI.isEmpty()) {
            String str2 = (String) fcva.u(listI);
            qbo qboVarA = qjoVarD.a(str2);
            if (qboVarA != qbo.c && qboVarA != qbo.d) {
                qkk qkkVar = (qkk) qjoVarD;
                pex pexVar = qkkVar.a;
                pexVar.m();
                pfn pfnVar = qkkVar.d;
                pkl pklVarD = pfnVar.d();
                pklVarD.g(1, str2);
                try {
                    pexVar.n();
                    try {
                        pklVarD.a();
                        pexVar.q();
                        pexVar.o();
                        pfnVar.f(pklVarD);
                    } finally {
                    }
                } catch (Throwable th) {
                    qkkVar.d.f(pklVarD);
                    throw th;
                }
            }
            listI.addAll(qidVarX.a(str2));
        }
        qcu qcuVar = qeeVar.g;
        qcuVar.getClass();
        synchronized (qcuVar.j) {
            qas.c().a(qcu.a, a.v(str, "Processor cancelling "));
            qcuVar.h.add(str);
            qfaVarA = qcuVar.a(str);
        }
        qcu.e(str, qfaVarA, 1);
        Iterator it = qeeVar.f.iterator();
        while (it.hasNext()) {
            ((qcw) it.next()).b(str);
        }
    }

    public static final void c(final String str, final qee qeeVar) {
        str.getClass();
        final WorkDatabase workDatabase = qeeVar.e;
        workDatabase.getClass();
        workDatabase.p(new Runnable() { // from class: qks
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                String str2 = str;
                qjo qjoVarD = workDatabase.D();
                pff pffVarA = pff.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
                pffVarA.g(1, str2);
                pex pexVar = ((qkk) qjoVarD).a;
                pexVar.m();
                Cursor cursorA = phn.a(pexVar, pffVarA, false);
                try {
                    ArrayList arrayList = new ArrayList(cursorA.getCount());
                    while (cursorA.moveToNext()) {
                        arrayList.add(cursorA.getString(0));
                    }
                    cursorA.close();
                    pffVarA.j();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        qky.b(qeeVar, (String) it.next());
                    }
                } catch (Throwable th) {
                    cursorA.close();
                    pffVarA.j();
                    throw th;
                }
            }
        });
    }

    public static final void d(qee qeeVar) {
        qcz.a(qeeVar.d, qeeVar.e, qeeVar.f);
    }
}
