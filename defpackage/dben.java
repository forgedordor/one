package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dben extends fcmx {
    public dben() {
        super(fcyi.a);
    }

    public Object c(dbdv dbdvVar, fcxy fcxyVar) {
        throw null;
    }

    @Override // defpackage.fbmx
    public final fbst n() {
        fbsy fbsyVar = dbel.a;
        if (fbsyVar == null) {
            synchronized (dbel.class) {
                fbsyVar = dbel.a;
                if (fbsyVar == null) {
                    fbsx fbsxVar = new fbsx("stargate.SatelliteSessionStateNotificationService");
                    fbsxVar.a(dbel.a());
                    fbsyVar = new fbsy(fbsxVar);
                    dbel.a = fbsyVar;
                }
            }
        }
        HashMap map = new HashMap();
        fbsr fbsrVarC = fcog.c(this.c, dbel.a(), new dbem(this));
        String str = fbsyVar.a;
        fbss.c(fbsrVarC, str, map);
        return fbss.a(str, fbsyVar, map);
    }

    public dben(fcyh fcyhVar) {
        super(fcyhVar);
    }
}
