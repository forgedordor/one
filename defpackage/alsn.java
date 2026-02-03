package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alsn implements alrj {
    public final fcsu b;
    public final eygg c;
    public final eygg d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final eygg h;
    private final eygg i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;

    public alsn(eygg eyggVar, eygg eyggVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, final fcsu fcsuVar5, final eygg eyggVar3, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, eygg eyggVar4, final fcsu fcsuVar10) {
        fcsu fcsuVar11 = new fcsu() { // from class: alrk
            @Override // defpackage.fcsu
            public final Object b() {
                return true;
            }
        };
        this.d = eyggVar;
        this.c = eyggVar2;
        this.e = new ajlc(fcsuVar11, fcsuVar);
        this.b = new ajlc(fcsuVar11, fcsuVar2);
        this.f = new ajlc(fcsuVar11, fcsuVar3);
        this.g = fcsuVar4;
        this.i = new eygg() { // from class: alrv
            @Override // defpackage.eygg
            public final Object b() {
                return ((arso) fcsuVar10.b()).a() ? (alfq) eyggVar3.b() : (alfq) fcsuVar5.b();
            }
        };
        this.j = new ajlc(fcsuVar11, fcsuVar6);
        this.k = new ajlc(fcsuVar11, fcsuVar7);
        this.l = new ajlc(fcsuVar11, fcsuVar8);
        this.m = new ajlc(fcsuVar11, fcsuVar9);
        this.h = eyggVar4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [alfq, java.lang.Object] */
    private final alqm B(ParticipantsTable.BindData bindData, String str) {
        ?? B = this.i.b();
        String strV = bindData.V();
        String strT = bindData.T();
        String strO = bindData.O();
        int iP = bindData.p();
        return B.e(strV, strT, strO, iP == 1, str, new ejxr() { // from class: alrw
            @Override // defpackage.ejxr
            public final Object get() {
                return ((crmx) this.a.c.b()).r();
            }
        });
    }

    @Override // defpackage.alrj
    public final Optional A(ParticipantsTable.BindData bindData) {
        return bbcf.c(alhy.u(bindData.V(), bindData.T())) ? Optional.empty() : Optional.of(B(bindData, bindData.T()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm a(String str) {
        return this.i.b().a(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm b(aubq aubqVar) {
        return this.i.b().b(aubqVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm c(String str, ejxr ejxrVar) {
        return this.i.b().c(str, ejxrVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm d(dggk dggkVar) {
        return this.i.b().d(dggkVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm e(String str, String str2, String str3, boolean z, String str4, ejxr ejxrVar) {
        return this.i.b().e(str, str2, str3, z, str4, ejxrVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm f() {
        return this.i.b().f();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm g(alqm alqmVar, ejxr ejxrVar) {
        return this.i.b().g(alqmVar, ejxrVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm h(alqm alqmVar, String str) {
        return this.i.b().h(alqmVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm i(alqm alqmVar, boolean z) {
        return this.i.b().i(alqmVar, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm j(alqm alqmVar, int i) {
        return this.i.b().j(alqmVar, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alfq
    public final alqm k(alqm alqmVar) {
        return this.i.b().k(alqmVar);
    }

    @Override // defpackage.alrj
    public final alqm l() {
        return ((alql) this.k.b()).c(new ejxr() { // from class: alsh
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new ejxr() { // from class: alsi
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new ejxr() { // from class: alsj
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of("EMERGENCY+SERVICE+PROVIDER");
            }
        }, new ejxr() { // from class: alsk
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new ejxr() { // from class: alsl
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new alsg(), new ejxr() { // from class: alsm
            @Override // defpackage.ejxr
            public final Object get() {
                return new alqj("EMERGENCY+SERVICE+PROVIDER");
            }
        }, new ejxr() { // from class: alrl
            @Override // defpackage.ejxr
            public final Object get() {
                return alwk.SATELLITE_ESP;
            }
        }, new alsg(), new alsg());
    }

    @Override // defpackage.alrj
    public final alqm m() {
        return ((alql) this.k.b()).c(new ejxr() { // from class: alrm
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new ejxr() { // from class: alrn
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new ejxr() { // from class: alro
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of("EMERGENCY+SERVICE+PROVIDER+DEMO");
            }
        }, new ejxr() { // from class: alrp
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new ejxr() { // from class: alrq
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new alsg(), new ejxr() { // from class: alrr
            @Override // defpackage.ejxr
            public final Object get() {
                return new alqj("EMERGENCY+SERVICE+PROVIDER+DEMO");
            }
        }, new ejxr() { // from class: alrs
            @Override // defpackage.ejxr
            public final Object get() {
                return alwk.SATELLITE_ESP;
            }
        }, new alsg(), new alsg());
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [alfq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [alfq, java.lang.Object] */
    @Override // defpackage.alrj
    public final alqm n(String str) {
        fcsu fcsuVar = this.j;
        if (((aqbh) fcsuVar.b()).a() && alpd.a(str)) {
            return l();
        }
        if (((aqbh) fcsuVar.b()).a() && alpd.b(str)) {
            return m();
        }
        fcsu fcsuVar2 = this.m;
        if (((Optional) fcsuVar2.b()).isPresent() && ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && TextUtils.equals(str, ((cgsa) ((Optional) fcsuVar2.b()).get()).r())) {
            return v();
        }
        if (dfog.O()) {
            return this.i.b().c(str, new ejxr() { // from class: alrt
                @Override // defpackage.ejxr
                public final Object get() {
                    return ((crmx) this.a.c.b()).k();
                }
            });
        }
        return this.i.b().c(str, ejxx.a(new ejxr() { // from class: alru
            @Override // defpackage.ejxr
            public final Object get() {
                alsn alsnVar = this.a;
                return Optional.of(((crnb) alsnVar.e.b()).c(((crny) alsnVar.b.b()).b()));
            }
        }));
    }

    @Override // defpackage.alrj
    public final alqm o(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.O());
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [alfq, java.lang.Object] */
    @Override // defpackage.alrj
    public final alqm p(String str) {
        fcsu fcsuVar = this.j;
        if (((aqbh) fcsuVar.b()).a() && alpd.a(str)) {
            return l();
        }
        if (((aqbh) fcsuVar.b()).a() && alpd.b(str)) {
            return m();
        }
        fcsu fcsuVar2 = this.m;
        if (((Optional) fcsuVar2.b()).isPresent() && ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && TextUtils.equals(str, ((cgsa) ((Optional) fcsuVar2.b()).get()).r())) {
            return v();
        }
        return this.i.b().c(str, ejxx.a(new ejxr() { // from class: alsf
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(((crmx) this.a.c.b()).A());
            }
        }));
    }

    @Override // defpackage.alrj
    public final alqm q(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.T());
    }

    @Override // defpackage.alrj
    public final alqm r(String str) {
        return c(str, new ejxr() { // from class: alrz
            @Override // defpackage.ejxr
            public final Object get() {
                alsn alsnVar = this.a;
                int iA = ((chvg) alsnVar.f.b()).a(chvn.f);
                return Optional.ofNullable(((arsn) alsnVar.h.b()).a() ? ((crny) alsnVar.b.b()).h(iA).s() : ((crnb) alsnVar.e.b()).c(iA));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [alfq, java.lang.Object] */
    @Override // defpackage.alrj
    public final alqm s(qxf qxfVar) {
        if (qxfVar instanceof bacc) {
            cczv cczvVar = alvx.a;
            if (((Boolean) new alum().get()).booleanValue()) {
                return ((bacc) qxfVar).l;
            }
        }
        if (qxfVar.f >= 0) {
            return n(qxfVar.c);
        }
        if (((apzk) this.l.b()).a()) {
            return n(qxfVar.c);
        }
        eygg eyggVar = this.i;
        return eyggVar.b().c(qxfVar.c, new alsg());
    }

    @Override // defpackage.alrj
    public final alqm t(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.V());
    }

    @Override // defpackage.alrj
    public final alqm u(String str, final int i) {
        return c(str, new ejxr() { // from class: alry
            @Override // defpackage.ejxr
            public final Object get() {
                alsn alsnVar = this.a;
                boolean zA = ((arsn) alsnVar.h.b()).a();
                int i2 = i;
                String strS = zA ? ((crny) alsnVar.b.b()).h(i2).s() : ((crnb) alsnVar.e.b()).c(i2);
                return TextUtils.isEmpty(strS) ? Optional.empty() : Optional.of(strS);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm v() {
        fcsu fcsuVar = this.m;
        if (((Optional) fcsuVar.b()).isEmpty()) {
            throw new UnsupportedOperationException("Penpal bot is not supported.");
        }
        final cgsa cgsaVar = (cgsa) ((Optional) fcsuVar.b()).get();
        return ((alql) this.k.b()).c(new ejxr() { // from class: alsa
            @Override // defpackage.ejxr
            public final Object get() {
                return cgsaVar.r();
            }
        }, new ejxr() { // from class: alsa
            @Override // defpackage.ejxr
            public final Object get() {
                return cgsaVar.r();
            }
        }, new ejxr() { // from class: alsb
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(cgsaVar.r());
            }
        }, new ejxr() { // from class: alsa
            @Override // defpackage.ejxr
            public final Object get() {
                return cgsaVar.r();
            }
        }, new ejxr() { // from class: alsa
            @Override // defpackage.ejxr
            public final Object get() {
                return cgsaVar.r();
            }
        }, new ejxr() { // from class: alsc
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(((asqx) this.a.g.b()).a(cgsaVar.r(), false));
            }
        }, new ejxr() { // from class: alsd
            @Override // defpackage.ejxr
            public final Object get() {
                return new alqj(cgsaVar.r());
            }
        }, new ejxr() { // from class: alse
            @Override // defpackage.ejxr
            public final Object get() {
                return alwk.PENPAL_BOT;
            }
        }, new alsg(), new alsg());
    }

    @Override // defpackage.alrj
    public final alqm w(alqm alqmVar) {
        return h(alqmVar, ((crmx) this.c.b()).n(ejwk.b(alqmVar.n())));
    }

    @Override // defpackage.alrj
    public final alqm x(final alqm alqmVar) {
        ejxr ejxrVar = new ejxr() { // from class: alrx
            @Override // defpackage.ejxr
            public final Object get() {
                return ((alwh) this.a.d.b()).e(ejwk.b(alqmVar.n()));
            }
        };
        return ((Boolean) alhy.c.e()).booleanValue() ? ((alql) this.k.b()).a(alqmVar, ejxrVar) : ((alql) this.k.b()).b(alqmVar, (String) ejxrVar.get());
    }

    @Override // defpackage.alrj
    public final ekgb y(List list) {
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            ekfwVar.h(B(bindData, bindData.T()));
        }
        return ekfwVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [alfq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [alfq, java.lang.Object] */
    @Override // defpackage.alrj
    public final ekgb z(asrg asrgVar) {
        ekfw ekfwVar = new ekfw();
        if (asrgVar.d()) {
            ekgb ekgbVarC = asrgVar.c();
            int size = ekgbVarC.size();
            for (int i = 0; i < size; i++) {
                ekfwVar.h(this.i.b().b((aubq) ekgbVarC.get(i)));
            }
        } else {
            ekfwVar.h(this.i.b().b(asrgVar.a()));
        }
        return ekfwVar.g();
    }
}
