package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cfta extends fcmx {
    public cfta() {
        this(fcyi.a);
    }

    public Object b(cfsl cfslVar, fcxy fcxyVar) {
        throw null;
    }

    public Object c(cfsp cfspVar, fcxy fcxyVar) {
        throw null;
    }

    @Override // defpackage.fbmx
    public final fbst n() {
        fbsy fbsyVar = cfsx.a;
        if (fbsyVar == null) {
            synchronized (cfsx.class) {
                fbsyVar = cfsx.a;
                if (fbsyVar == null) {
                    fbsx fbsxVar = new fbsx("bugle.PersistentMessagingProxyNotificationService");
                    fbsxVar.a(cfsx.a());
                    fbsxVar.a(cfsx.b());
                    fbsyVar = new fbsy(fbsxVar);
                    cfsx.a = fbsyVar;
                }
            }
        }
        HashMap map = new HashMap();
        fcyh fcyhVar = this.c;
        fbsr fbsrVarC = fcog.c(fcyhVar, cfsx.a(), new cfsy(this));
        String str = fbsyVar.a;
        fbss.c(fbsrVarC, str, map);
        fbss.c(fcog.c(fcyhVar, cfsx.b(), new cfsz(this)), str, map);
        return fbss.a(str, fbsyVar, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfta(fcyh fcyhVar) {
        super(fcyhVar);
        fcyhVar.getClass();
    }
}
