package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkx extends fdbr implements fdae {
    final /* synthetic */ qee a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkx(qee qeeVar, String str) {
        super(0);
        this.a = qeeVar;
        this.b = str;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        final qee qeeVar = this.a;
        final WorkDatabase workDatabase = qeeVar.e;
        workDatabase.getClass();
        final String str = this.b;
        workDatabase.p(new Runnable() { // from class: qkw
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                String str2 = str;
                qjo qjoVarD = workDatabase.D();
                pff pffVarA = pff.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
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
        qky.d(qeeVar);
        return fctx.a;
    }
}
