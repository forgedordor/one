package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cjit implements fbmx, cjir {
    @Override // defpackage.cjir
    public /* synthetic */ void b(cjgh cjghVar, fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.cjir
    public /* synthetic */ void c(cjgx cjgxVar, fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.cjir
    public /* synthetic */ void d(cjkc cjkcVar, fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.cjir
    public /* synthetic */ void e(cjky cjkyVar, fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.cjir
    public /* synthetic */ void f(cjlg cjlgVar, fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.cjir
    public /* synthetic */ void g(cjls cjlsVar, fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.cjir
    public /* synthetic */ void h(cjma cjmaVar, fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.cjir
    public /* synthetic */ void i() {
        throw null;
    }

    @Override // defpackage.fbmx
    public final fbst n() {
        fbsy fbsyVar = cjiv.a;
        if (fbsyVar == null) {
            synchronized (cjiv.class) {
                fbsyVar = cjiv.a;
                if (fbsyVar == null) {
                    fbsx fbsxVar = new fbsx("bugle.smapi.rcs.MessagingEngineService");
                    fbsxVar.a(cjiv.f());
                    fbsxVar.a(cjiv.e());
                    fbsxVar.a(cjiv.d());
                    fbsxVar.a(cjiv.b());
                    fbsxVar.a(cjiv.a());
                    fbsxVar.a(cjiv.c());
                    fbsxVar.a(cjiv.h());
                    fbsxVar.a(cjiv.g());
                    fbsyVar = new fbsy(fbsxVar);
                    cjiv.a = fbsyVar;
                }
            }
        }
        HashMap map = new HashMap();
        fbrk fbrkVarF = cjiv.f();
        fcse fcseVar = new fcse(new cjiu(this, 0));
        String str = fbsyVar.a;
        fbss.b(fbrkVarF, fcseVar, str, fbsyVar, map);
        fbss.b(cjiv.e(), new fcse(new cjiu(this, 1)), str, fbsyVar, map);
        fbss.b(cjiv.d(), new fcse(new cjiu(this, 2)), str, fbsyVar, map);
        fbss.b(cjiv.b(), new fcse(new cjiu(this, 3)), str, fbsyVar, map);
        fbss.b(cjiv.a(), new fcse(new cjiu(this, 4)), str, fbsyVar, map);
        fbss.b(cjiv.c(), new fcse(new cjiu(this, 5)), str, fbsyVar, map);
        fbss.b(cjiv.h(), new fcse(new cjiu(this, 6)), str, fbsyVar, map);
        fbss.b(cjiv.g(), new fcse(new cjiu(this, 7)), str, fbsyVar, map);
        return fbss.a(str, fbsyVar, map);
    }
}
