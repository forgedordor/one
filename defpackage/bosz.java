package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bosz extends dqwl<bopr, bosz, botb, bojh, bopq> {
    public bosz(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bosr(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = botm.a;
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
        bopr boprVar = (bopr) q(botm.c.av);
        try {
            ekgb ekgbVarM = boprVar.m();
            boprVar.close();
            return ekgbVarM;
        } catch (Throwable th) {
            try {
                boprVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb g() {
        bopr boprVar = (bopr) q(botm.c.a);
        try {
            ekgb ekgbVarN = boprVar.n();
            boprVar.close();
            return ekgbVarN;
        } catch (Throwable th) {
            try {
                boprVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
