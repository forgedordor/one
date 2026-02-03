package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxrf extends fcmx {
    public bxrf() {
        super(fcyi.a);
    }

    public Object b() {
        throw null;
    }

    @Override // defpackage.fbmx
    public final fbst n() {
        fbsy fbsyVar = bxrd.a;
        if (fbsyVar == null) {
            synchronized (bxrd.class) {
                fbsyVar = bxrd.a;
                if (fbsyVar == null) {
                    fbsx fbsxVar = new fbsx("bugle.smapi.rcs.PdfFilePreviewGeneratorService");
                    fbsxVar.a(bxrd.a());
                    fbsyVar = new fbsy(fbsxVar);
                    bxrd.a = fbsyVar;
                }
            }
        }
        HashMap map = new HashMap();
        fbsr fbsrVarC = fcog.c(this.c, bxrd.a(), new bxre(this));
        String str = fbsyVar.a;
        fbss.c(fbsrVarC, str, map);
        return fbss.a(str, fbsyVar, map);
    }

    public bxrf(fcyh fcyhVar) {
        super(fcyhVar);
    }
}
