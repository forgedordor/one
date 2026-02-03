package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbm extends dqwl<brzj, bsbm, bsbo, ParticipantsTable.BindData, brzi> {
    public bsbm(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bsbe(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = ParticipantsTable.a;
        return new HashMap();
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return false;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[0];
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[0];
    }

    public final ekgb f() {
        brzj brzjVar = (brzj) q(ParticipantsTable.c.a);
        try {
            ekgb ekgbVarK = brzjVar.k();
            brzjVar.close();
            return ekgbVarK;
        } catch (Throwable th) {
            try {
                brzjVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb g() {
        brzj brzjVar = (brzj) q(ParticipantsTable.c.d);
        try {
            ekgb ekgbVarN = brzjVar.n();
            brzjVar.close();
            return ekgbVarN;
        } catch (Throwable th) {
            try {
                brzjVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
