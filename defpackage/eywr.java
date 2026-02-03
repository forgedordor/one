package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class eywr extends fcmx {
    public eywr() {
        super(fcyi.a);
    }

    public Object b(ezho ezhoVar, fcxy fcxyVar) {
        throw null;
    }

    public Object c(ezkf ezkfVar, fcxy fcxyVar) {
        throw null;
    }

    public fdpl d(ezkl ezklVar) {
        throw null;
    }

    @Override // defpackage.fbmx
    public final fbst n() {
        fbsy fbsyVar = eywe.a;
        if (fbsyVar == null) {
            synchronized (eywe.class) {
                fbsyVar = eywe.a;
                if (fbsyVar == null) {
                    fbsx fbsxVar = new fbsx("google.internal.communications.instantmessaging.v1.Messaging");
                    fbsxVar.a(eywe.n());
                    fbsxVar.a(eywe.m());
                    fbsxVar.a(eywe.e());
                    fbsxVar.a(eywe.j());
                    fbsxVar.a(eywe.i());
                    fbsxVar.a(eywe.h());
                    fbsxVar.a(eywe.c());
                    fbsxVar.a(eywe.d());
                    fbsxVar.a(eywe.k());
                    fbsxVar.a(eywe.l());
                    fbsxVar.a(eywe.g());
                    fbsxVar.a(eywe.f());
                    fbsyVar = new fbsy(fbsxVar);
                    eywe.a = fbsyVar;
                }
            }
        }
        HashMap map = new HashMap();
        fcyh fcyhVar = this.c;
        fbsr fbsrVarC = fcog.c(fcyhVar, eywe.n(), new eywi(this));
        String str = fbsyVar.a;
        fbss.c(fbsrVarC, str, map);
        fbss.c(fcog.c(fcyhVar, eywe.m(), new eywj(this)), str, map);
        fbrk fbrkVarE = eywe.e();
        eywk eywkVar = new eywk(this);
        if (fbrkVarE.a != fbrj.BIDI_STREAMING) {
            Objects.toString(fbrkVarE);
            throw new IllegalArgumentException("Expected a bidi streaming method descriptor but got ".concat(fbrkVarE.toString()));
        }
        fbss.c(fcog.a(fcyhVar, fbrkVarE, eywkVar), str, map);
        fbss.c(fcog.b(fcyhVar, eywe.j(), new eywl(this)), str, map);
        fbss.c(fcog.b(fcyhVar, eywe.i(), new eywm(this)), str, map);
        fbss.c(fcog.c(fcyhVar, eywe.h(), new eywn(this)), str, map);
        fbss.c(fcog.c(fcyhVar, eywe.c(), new eywo(this)), str, map);
        fbss.c(fcog.c(fcyhVar, eywe.d(), new eywp(this)), str, map);
        fbss.c(fcog.c(fcyhVar, eywe.k(), new eywq(this)), str, map);
        fbss.c(fcog.c(fcyhVar, eywe.l(), new eywf(this)), str, map);
        fbss.c(fcog.c(fcyhVar, eywe.g(), new eywg(this)), str, map);
        fbss.c(fcog.c(fcyhVar, eywe.f(), new eywh(this)), str, map);
        return fbss.a(str, fbsyVar, map);
    }

    public eywr(fcyh fcyhVar) {
        super(fcyhVar);
    }
}
