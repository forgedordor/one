package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bngt extends dqwl {
    public bngt(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bngn(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = bngz.a;
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
        bngf bngfVar = (bngf) q(bngz.c.b);
        try {
            ekgb ekgbVarC = bngfVar.c();
            bngfVar.close();
            return ekgbVarC;
        } catch (Throwable th) {
            try {
                bngfVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
