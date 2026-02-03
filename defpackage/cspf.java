package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cspf implements csny {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fdjx f;
    public final ConversationIdType g;
    public final fdkf h;
    public final fctc i;
    private final fcsu j;
    private final fctc k;
    private final fctc l;
    private final fctc m;
    private final fctc n;
    private final fctc o;
    private final fctc p;
    private final fctc q;
    private final fctc r;

    public cspf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fdjx fdjxVar, ConversationIdType conversationIdType) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar5;
        this.e = fcsuVar6;
        this.j = fcsuVar7;
        this.f = fdjxVar;
        this.g = conversationIdType;
        this.h = eicj.c(fdjxVar, new csos(this, null));
        eicj.c(fdjxVar, new csoy(this, null));
        this.k = fctd.a(new fdae() { // from class: csoj
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new cspb(cspfVar, null));
            }
        });
        fctd.a(new fdae() { // from class: csol
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new cspa(cspfVar, null));
            }
        });
        this.l = fctd.a(new fdae() { // from class: csom
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new cspc(cspfVar, null));
            }
        });
        this.m = fctd.a(new fdae() { // from class: cson
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new cspd(cspfVar, null));
            }
        });
        this.n = fctd.a(new fdae() { // from class: csoo
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new csou(cspfVar, null));
            }
        });
        this.i = fctd.a(new fdae() { // from class: csop
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new cspe(cspfVar, null));
            }
        });
        this.o = fctd.a(new fdae() { // from class: csoq
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new csox(cspfVar, null));
            }
        });
        this.p = fctd.a(new fdae() { // from class: csor
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new csov(cspfVar, null));
            }
        });
        this.q = fctd.a(new fdae() { // from class: csoh
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new csot(cspfVar, null));
            }
        });
        this.r = fctd.a(new fdae() { // from class: csoi
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new csow(cspfVar, null));
            }
        });
        fctd.a(new fdae() { // from class: csok
            @Override // defpackage.fdae
            public final Object invoke() {
                cspf cspfVar = this.a;
                return eicj.c(cspfVar.f, new csoz(cspfVar, null));
            }
        });
    }

    @Override // defpackage.csny
    public final List a() {
        return csdy.a((csea) this.c.b(), null, csof.a(this.g), 1);
    }

    @Override // defpackage.csny
    public final fdkf b() {
        return (fdkf) this.q.a();
    }

    @Override // defpackage.csny
    public final fdkf c() {
        return (fdkf) this.p.a();
    }

    @Override // defpackage.csny
    public final fdkf d() {
        return (fdkf) this.r.a();
    }

    @Override // defpackage.csny
    public final fdkf e() {
        return (fdkf) this.o.a();
    }

    @Override // defpackage.csny
    public final fdkf f() {
        return (fdkf) this.k.a();
    }

    @Override // defpackage.csny
    public final fdkf g() {
        return (fdkf) this.l.a();
    }

    @Override // defpackage.csny
    public final fdkf h() {
        return (fdkf) this.m.a();
    }

    @Override // defpackage.csny
    public final int i(cspo cspoVar) {
        ecem.b();
        return baxe.b(this.g, cspoVar.a);
    }

    @Override // defpackage.csny
    public final boolean j(bvdk bvdkVar, elka elkaVar) {
        bvdkVar.getClass();
        elkaVar.getClass();
        return ((cpgf) this.j.b()).b(this.g, bvdkVar, elkaVar, false);
    }

    public final fdkf k() {
        return (fdkf) this.n.a();
    }
}
