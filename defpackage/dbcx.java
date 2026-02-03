package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dbcx extends fcmx {
    public dbcx() {
        super(fcyi.a);
    }

    public Object d(dbdn dbdnVar, fcxy fcxyVar) {
        throw null;
    }

    public Object e(dbdr dbdrVar, fcxy fcxyVar) {
        throw null;
    }

    @Override // defpackage.fbmx
    public final fbst n() {
        fbsy fbsyVar = dbcu.a;
        if (fbsyVar == null) {
            synchronized (dbcu.class) {
                fbsyVar = dbcu.a;
                if (fbsyVar == null) {
                    fbsx fbsxVar = new fbsx("stargate.DatagramNotificationService");
                    fbsxVar.a(dbcu.a());
                    fbsxVar.a(dbcu.b());
                    fbsyVar = new fbsy(fbsxVar);
                    dbcu.a = fbsyVar;
                }
            }
        }
        HashMap map = new HashMap();
        fcyh fcyhVar = this.c;
        fbsr fbsrVarC = fcog.c(fcyhVar, dbcu.a(), new dbcv(this));
        String str = fbsyVar.a;
        fbss.c(fbsrVarC, str, map);
        fbss.c(fcog.c(fcyhVar, dbcu.b(), new dbcw(this)), str, map);
        return fbss.a(str, fbsyVar, map);
    }

    public dbcx(fcyh fcyhVar) {
        super(fcyhVar);
    }
}
