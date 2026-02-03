package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dbcs implements fbmx {
    public /* synthetic */ void b(dbco dbcoVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void c(fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void d(fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.fbmx
    public final fbst n() {
        fbsy fbsyVar = dbct.a;
        if (fbsyVar == null) {
            synchronized (dbct.class) {
                fbsyVar = dbct.a;
                if (fbsyVar == null) {
                    fbsx fbsxVar = new fbsx("com.google.android.apps.restore.osmigration.systemappapi.TargetService");
                    fbsxVar.a(dbct.a());
                    fbsxVar.a(dbct.b());
                    fbsxVar.a(dbct.c());
                    fbsyVar = new fbsy(fbsxVar);
                    dbct.a = fbsyVar;
                }
            }
        }
        HashMap map = new HashMap();
        fbrk fbrkVarA = dbct.a();
        fcse fcseVar = new fcse(new dbcr(this, 0));
        String str = fbsyVar.a;
        fbss.b(fbrkVarA, fcseVar, str, fbsyVar, map);
        fbss.b(dbct.b(), new fcse(new dbcr(this, 1)), str, fbsyVar, map);
        fbss.b(dbct.c(), new fcse(new dbcr(this, 2)), str, fbsyVar, map);
        return fbss.a(str, fbsyVar, map);
    }
}
