package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cifw {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final chvg d;
    private final asry e;
    private final atah f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final armi j;

    public cifw(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, chvg chvgVar, asry asryVar, atah atahVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, armi armiVar, fcsu fcsuVar7) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        chvgVar.getClass();
        asryVar.getClass();
        atahVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        armiVar.getClass();
        fcsuVar7.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = chvgVar;
        this.e = asryVar;
        this.f = atahVar;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = armiVar;
    }

    public static /* synthetic */ enxu t(cifw cifwVar, int i) {
        return cifwVar.m(i, null);
    }

    public static /* synthetic */ void u(cifw cifwVar, auib auibVar, int i, cbqz cbqzVar, int i2) {
        if ((i2 & 4) != 0) {
            cbqzVar = cbqz.a;
        }
        cifwVar.o(auibVar, i, cbqzVar, 2);
    }

    public static /* synthetic */ void v(cifw cifwVar, int i, int i2, String str, auib auibVar, elma elmaVar, enxu enxuVar, int i3, cbqz cbqzVar, elly ellyVar, int i4) {
        List arrayList;
        fhaz fhazVar;
        if ((i4 & 128) != 0) {
            cbqzVar = cbqz.a;
        }
        if ((i4 & 8) != 0) {
            auibVar = null;
        }
        if ((i4 & 256) != 0) {
            ellyVar = null;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elof elofVar = (elof) elpg.b.createBuilder();
        elofVar.getClass();
        if (auibVar != null && (fhazVar = (fhaz) ((atau) cifwVar.c.b()).fH().fM(auibVar)) != null) {
            elofVar.copyOnWrite();
            elpg elpgVar = (elpg) elofVar.instance;
            elpgVar.p = fhazVar;
            elpgVar.c |= 1024;
        }
        if ((i4 & 32) != 0) {
            enxuVar = null;
        }
        if (enxuVar != null) {
            elhf.e(enxuVar, elofVar);
        }
        elgr.d(elhf.a(elofVar), ellgVar);
        int iA = cifwVar.d.a(chvn.s);
        if (cifwVar.j.a()) {
            arrayList = new ArrayList();
            if (cbqzVar.e()) {
                arrayList.add(enpj.MLS_PROTOCOL);
            }
            if (cbqzVar.f()) {
                arrayList.add(enpj.SCYTALE_PROTOCOL);
            }
        } else {
            arrayList = fcvo.a;
        }
        if ((i4 & 2) != 0) {
            i2 = 1;
        }
        elgr.g(ellf.BUGLE_GROUP, ellgVar);
        ellv ellvVar = (ellv) elmc.b.createBuilder();
        ellvVar.getClass();
        ellvVar.copyOnWrite();
        elmc elmcVar = (elmc) ellvVar.instance;
        elmcVar.d = i - 1;
        elmcVar.c |= 1;
        if (i2 == 0) {
            throw null;
        }
        if ((i4 & 64) != 0) {
            i3 = 1;
        }
        ellvVar.copyOnWrite();
        elmc elmcVar2 = (elmc) ellvVar.instance;
        elmcVar2.e = i2 - 1;
        elmcVar2.c |= 2;
        if (i3 == 0) {
            throw null;
        }
        ellvVar.copyOnWrite();
        elmc elmcVar3 = (elmc) ellvVar.instance;
        elmcVar3.p = i3 - 1;
        elmcVar3.c |= 131072;
        new evsz(elmcVar3.q, elmc.a);
        ellvVar.copyOnWrite();
        elmc elmcVar4 = (elmc) ellvVar.instance;
        evsx evsxVar = elmcVar4.q;
        if (!evsxVar.c()) {
            elmcVar4.q = evsn.mutableCopy(evsxVar);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            elmcVar4.q.h(((enpj) it.next()).d);
        }
        enwr enwrVar = ((dggw) cifwVar.g.b()).c(iA).a;
        enwrVar.getClass();
        ellvVar.copyOnWrite();
        elmc elmcVar5 = (elmc) ellvVar.instance;
        elmcVar5.h = enwrVar.N;
        elmcVar5.c |= 16;
        if (auibVar != null) {
            String str2 = auibVar.c;
            str2.getClass();
            elgv.a(str2, ellvVar);
        } else {
            if ((i4 & 4) != 0) {
                str = null;
            }
            if (str != null) {
                elgv.a(str, ellvVar);
            }
        }
        if ((i4 & 16) != 0) {
            elmaVar = null;
        }
        if (elmaVar != null) {
            ellvVar.copyOnWrite();
            elmc elmcVar6 = (elmc) ellvVar.instance;
            elmcVar6.i = elmaVar;
            elmcVar6.c |= 32;
        }
        if (ellyVar != null) {
            ellvVar.copyOnWrite();
            elmc elmcVar7 = (elmc) ellvVar.instance;
            elmcVar7.f = ellyVar;
            elmcVar7.c |= 4;
        }
        evsn evsnVarBuild = ellvVar.build();
        evsnVarBuild.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.B = (elmc) evsnVarBuild;
        ellhVar.b |= 4194304;
        evsf builder = elgr.a(ellgVar).toBuilder();
        builder.getClass();
        ailn ailnVarA = ((aimb) cifwVar.a.b()).a();
        ailnVarA.d(emxt.BUGLE_GROUP);
        ailnVarA.j((ellg) builder, aioj.LOG_SPEC_GROUP_OPERATION_EVENT);
    }

    public final auib a() {
        fhaz fhazVarA = cqdr.a();
        fhazVarA.getClass();
        Object objFM = ((atau) this.c.b()).fM(fhazVarA);
        objFM.getClass();
        return (auib) objFM;
    }

    public final auib b() {
        auib auibVarA = a();
        v(this, 16, 0, null, auibVarA, null, null, 0, null, null, 502);
        return auibVarA;
    }

    @fcsv
    public final void c(aubf aubfVar) {
        aubb aubbVar;
        aubfVar.getClass();
        try {
            aubbVar = (aubb) evsn.parseFrom(aubb.a, aubfVar.d, evrr.a());
        } catch (evtj unused) {
            aubbVar = null;
        }
        String str = aubbVar != null ? aubbVar.e : null;
        aubl aublVar = aubfVar.c;
        if (aublVar == null) {
            aublVar = aubl.a;
        }
        v(this, 17, 3, str, null, null, m(3, aublVar), 0, null, null, 472);
    }

    @fcsv
    public final void d() {
        v(this, 17, 3, null, null, null, m(3, null), 0, null, null, 472);
    }

    public final void e(auib auibVar, cbqz cbqzVar) {
        auibVar.getClass();
        cbqzVar.getClass();
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxtVar.getClass();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.getClass();
        enye.d(2, enxvVar);
        enye.c(enxk.CHAT_API_FAILED_PERMANENTLY, enxvVar);
        enye.b(enxi.CHAT_API_INVALID_REMOTE_PARTICIPANT, enxvVar);
        enxb.b(enye.a(enxvVar), enxtVar);
        v(this, 17, 3, null, auibVar, null, enxb.a(enxtVar), 0, cbqzVar, null, 340);
    }

    public final void f(aubf aubfVar) {
        cbqz cbqzVar;
        aubb aubbVar;
        aubfVar.getClass();
        if (this.j.a()) {
            try {
                cbqz cbqzVar2 = cbqz.a;
                cbqzVar = new cbqz(((aubb) evsn.parseFrom(aubb.a, aubfVar.d, evrr.a())).g);
            } catch (evtj unused) {
                cbqzVar = cbqz.a;
            }
        } else {
            cbqzVar = cbqz.a;
        }
        cbqz cbqzVar3 = cbqzVar;
        auib auibVar = null;
        try {
            aubbVar = (aubb) evsn.parseFrom(aubb.a, aubfVar.d, evrr.a());
        } catch (evtj unused2) {
            aubbVar = null;
        }
        if (aubbVar != null && (auibVar = aubbVar.f) == null) {
            auibVar = auib.a;
        }
        auib auibVar2 = auibVar;
        aubl aublVar = aubfVar.c;
        if (aublVar == null) {
            aublVar = aubl.a;
        }
        v(this, 17, 3, null, auibVar2, null, m(3, aublVar), 0, cbqzVar3, null, 340);
    }

    public final void g(auib auibVar, cbqz cbqzVar) {
        auibVar.getClass();
        cbqzVar.getClass();
        v(this, 17, 2, null, auibVar, null, null, 0, cbqzVar, null, 372);
    }

    public final void h(aucb aucbVar, aubl aublVar) {
        aublVar.getClass();
        if (aucbVar.d) {
            return;
        }
        auib auibVar = aucbVar.e;
        if (auibVar == null) {
            auibVar = auib.a;
        }
        v(this, 3, 3, null, auibVar, null, m(3, aublVar), 0, null, null, 468);
    }

    public final void i() {
        v(this, 3, 3, null, null, null, m(3, null), 0, null, null, 468);
    }

    @fcsv
    public final void j(String str) {
        str.getClass();
        v(this, 21, 2, str, null, null, null, 0, null, null, 504);
    }

    public final void k(auib auibVar, cbqz cbqzVar) {
        auibVar.getClass();
        cbqzVar.getClass();
        v(this, 21, 2, null, auibVar, null, null, 0, cbqzVar, null, 372);
    }

    public final void l(auib auibVar, cbqz cbqzVar, enxi enxiVar) {
        auibVar.getClass();
        cbqzVar.getClass();
        enxiVar.getClass();
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxtVar.getClass();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.getClass();
        enye.d(2, enxvVar);
        enye.c(enxk.CHAT_API_FAILED_PERMANENTLY, enxvVar);
        enye.b(enxiVar, enxvVar);
        enxb.b(enye.a(enxvVar), enxtVar);
        v(this, 19, 3, null, auibVar, null, enxb.a(enxtVar), 0, cbqzVar, null, 340);
    }

    public final enxu m(int i, aubl aublVar) {
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxtVar.getClass();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.getClass();
        enye.d(i, enxvVar);
        if (aublVar != null) {
            aubk aubkVarB = aubk.b(aublVar.c);
            if (aubkVarB == null) {
                aubkVarB = aubk.UNKNOWN_STATUS;
            }
            if (aubkVarB != null) {
                enye.c((enxk) ejvk.a(this.e, aubkVarB), enxvVar);
            }
        }
        if (aublVar != null) {
            aubi aubiVarB = aubi.b(aublVar.d);
            if (aubiVarB == null) {
                aubiVarB = aubi.UNKNOWN_CAUSE;
            }
            if (aubiVarB != null) {
                enye.b((enxi) ejvk.a(this.f, aubiVarB), enxvVar);
            }
        }
        enxb.b(enye.a(enxvVar), enxtVar);
        return enxb.a(enxtVar);
    }

    public final void n(auib auibVar, int i) {
        auibVar.getClass();
        u(this, auibVar, i, null, 12);
    }

    public final void o(auib auibVar, int i, cbqz cbqzVar, int i2) {
        auibVar.getClass();
        cbqzVar.getClass();
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxtVar.getClass();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.getClass();
        enye.d(i2, enxvVar);
        enxb.b(enye.a(enxvVar), enxtVar);
        v(this, 17, 3, null, auibVar, null, enxb.a(enxtVar), i, cbqzVar, null, 276);
    }

    public final void p(auib auibVar, int i) {
        if (((apul) this.i.b()).a()) {
            v(this, 3, 3, null, auibVar, null, t(this, 3), i, null, null, 404);
        }
    }

    public final void q(auib auibVar, aubl aublVar, int i) {
        auibVar.getClass();
        aublVar.getClass();
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        if (aubkVarB == aubk.OK) {
            v(this, 26, 2, null, auibVar, null, null, 0, null, null, 500);
        } else {
            v(this, 26, 3, null, auibVar, null, m(i, aublVar), 0, null, null, 468);
        }
    }

    @fcsv
    public final void r(String str, aubl aublVar, int i, int i2) {
        str.getClass();
        v(this, 21, 3, str, null, null, m(i, aublVar), true != ((apum) this.h.b()).a() ? 1 : i2, null, null, 408);
    }

    public final void s(auib auibVar, int i, cbqz cbqzVar) {
        auibVar.getClass();
        cbqzVar.getClass();
        v(this, 19, 3, null, auibVar, null, null, i, cbqzVar, null, 308);
    }

    public final void w(auib auibVar, int i) {
        auibVar.getClass();
        x(auibVar, null, i, cbqz.a);
    }

    public final void x(auib auibVar, aubl aublVar, int i, cbqz cbqzVar) {
        auibVar.getClass();
        cbqzVar.getClass();
        v(this, 21, 3, null, auibVar, null, m(2, aublVar), true != ((apum) this.h.b()).a() ? 1 : i, cbqzVar, null, 276);
    }
}
