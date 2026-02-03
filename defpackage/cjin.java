package defpackage;

import io.grpc.Status;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cjin implements fbmx, cjil {
    public /* synthetic */ void c(cjgd cjgdVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void d(cjgt cjgtVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void e(cjjh cjjhVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void f(cjjl cjjlVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void g(cjjy cjjyVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void h(cjkm cjkmVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void i(cjlc cjlcVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void j(cjlo cjloVar, fcsf fcsfVar) {
        throw null;
    }

    public /* synthetic */ void k(cjlw cjlwVar, fcsf fcsfVar) {
        throw null;
    }

    @Override // defpackage.cjil
    public final /* synthetic */ void l(fcsf fcsfVar) {
        fcsfVar.b(new fbtf(Status.n.withDescription(String.format("Method %s is unimplemented", cjip.g().b))));
    }

    @Override // defpackage.fbmx
    public final fbst n() {
        fbsy fbsyVar = cjip.a;
        if (fbsyVar == null) {
            synchronized (cjip.class) {
                fbsyVar = cjip.a;
                if (fbsyVar == null) {
                    fbsx fbsxVar = new fbsx("bugle.smapi.rcs.MessagingEngineNotificationService");
                    fbsxVar.a(cjip.d());
                    fbsxVar.a(cjip.c());
                    fbsxVar.a(cjip.h());
                    fbsxVar.a(cjip.g());
                    fbsxVar.a(cjip.f());
                    fbsxVar.a(cjip.b());
                    fbsxVar.a(cjip.a());
                    fbsxVar.a(cjip.e());
                    fbsxVar.a(cjip.j());
                    fbsxVar.a(cjip.i());
                    fbsyVar = new fbsy(fbsxVar);
                    cjip.a = fbsyVar;
                }
            }
        }
        HashMap map = new HashMap();
        fbrk fbrkVarD = cjip.d();
        fcse fcseVar = new fcse(new cjio(this, 0));
        String str = fbsyVar.a;
        fbss.b(fbrkVarD, fcseVar, str, fbsyVar, map);
        fbss.b(cjip.c(), new fcse(new cjio(this, 1)), str, fbsyVar, map);
        fbss.b(cjip.h(), new fcse(new cjio(this, 2)), str, fbsyVar, map);
        fbss.b(cjip.g(), new fcse(new cjio(this, 3)), str, fbsyVar, map);
        fbss.b(cjip.f(), new fcse(new cjio(this, 4)), str, fbsyVar, map);
        fbss.b(cjip.b(), new fcse(new cjio(this, 5)), str, fbsyVar, map);
        fbss.b(cjip.a(), new fcse(new cjio(this, 6)), str, fbsyVar, map);
        fbss.b(cjip.e(), new fcse(new cjio(this, 7)), str, fbsyVar, map);
        fbss.b(cjip.j(), new fcse(new cjio(this, 8)), str, fbsyVar, map);
        fbss.b(cjip.i(), new fcse(new cjio(this, 9)), str, fbsyVar, map);
        return fbss.a(str, fbsyVar, map);
    }
}
