package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dbwh implements fbmx {
    public /* synthetic */ void d(dbwo dbwoVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void e(dbws dbwsVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void f(dbww dbwwVar, fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.fbmx
    public final fbst n() {
        fbsy fbsyVar = dbwj.a;
        if (fbsyVar == null) {
            synchronized (dbwj.class) {
                fbsyVar = dbwj.a;
                if (fbsyVar == null) {
                    fbsx fbsxVar = new fbsx("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService");
                    fbsxVar.a(dbwj.c());
                    fbsxVar.a(dbwj.b());
                    fbsxVar.a(dbwj.a());
                    fbsyVar = new fbsy(fbsxVar);
                    dbwj.a = fbsyVar;
                }
            }
        }
        HashMap map = new HashMap();
        fbrk fbrkVarC = dbwj.c();
        fcse fcseVar = new fcse(new dbwi(this, 0));
        String str = fbsyVar.a;
        fbss.b(fbrkVarC, fcseVar, str, fbsyVar, map);
        fbss.b(dbwj.b(), new fcse(new dbwi(this, 1)), str, fbsyVar, map);
        fbss.b(dbwj.a(), new fcse(new dbwi(this, 2)), str, fbsyVar, map);
        return fbss.a(str, fbsyVar, map);
    }
}
