package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dbwk implements fbmx {
    public /* synthetic */ void h(dbxa dbxaVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void i(dbxr dbxrVar, fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.fbmx
    public final fbst n() {
        fbsy fbsyVar = dbwm.a;
        if (fbsyVar == null) {
            synchronized (dbwm.class) {
                fbsyVar = dbwm.a;
                if (fbsyVar == null) {
                    fbsx fbsxVar = new fbsx("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService");
                    fbsxVar.a(dbwm.a());
                    fbsxVar.a(dbwm.b());
                    fbsyVar = new fbsy(fbsxVar);
                    dbwm.a = fbsyVar;
                }
            }
        }
        HashMap map = new HashMap();
        fbrk fbrkVarA = dbwm.a();
        fcse fcseVar = new fcse(new dbwl(this, 0));
        String str = fbsyVar.a;
        fbss.b(fbrkVarA, fcseVar, str, fbsyVar, map);
        fbss.b(dbwm.b(), new fcse(new dbwl(this, 1)), str, fbsyVar, map);
        return fbss.a(str, fbsyVar, map);
    }
}
