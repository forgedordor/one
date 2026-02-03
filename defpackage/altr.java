package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class altr implements alrj {
    public final eygg b;
    public final eygg c;
    public final eygg d;
    public final eygg e;
    public final eygg f;
    public final eygg g;
    public final eygg h;
    private final eygg i;
    private final eygg j;
    private final eygg k;
    private final eygg l;

    public altr(eygg eyggVar, eygg eyggVar2, eygg eyggVar3, eygg eyggVar4, eygg eyggVar5, eygg eyggVar6, eygg eyggVar7, eygg eyggVar8, eygg eyggVar9, eygg eyggVar10, eygg eyggVar11) {
        this.d = eyggVar;
        this.c = eyggVar2;
        this.i = eyggVar3;
        this.e = eyggVar4;
        this.b = eyggVar5;
        this.f = eyggVar6;
        this.g = eyggVar7;
        this.j = eyggVar8;
        this.k = eyggVar9;
        this.l = eyggVar10;
        this.h = eyggVar11;
    }

    private final alqm B(ParticipantsTable.BindData bindData, String str) {
        alnz alnzVar = (alnz) this.j.b();
        String strV = bindData.V();
        String strT = bindData.T();
        String strO = bindData.O();
        int iP = bindData.p();
        return alnzVar.e(strV, strT, strO, iP == 1, str, new ejxr() { // from class: altb
            @Override // defpackage.ejxr
            public final Object get() {
                return ((crmx) this.a.c.b()).r();
            }
        });
    }

    @Override // defpackage.alrj
    public final Optional A(ParticipantsTable.BindData bindData) {
        return bbcf.c(alnz.t(bindData.V(), bindData.T())) ? Optional.empty() : Optional.of(B(bindData, bindData.T()));
    }

    @Override // defpackage.alfq
    public final alqm a(String str) {
        return ((alnz) this.j.b()).a(str);
    }

    @Override // defpackage.alfq
    public final alqm b(aubq aubqVar) {
        return ((alnz) this.j.b()).b(aubqVar);
    }

    @Override // defpackage.alfq
    public final alqm c(String str, ejxr ejxrVar) {
        return ((alnz) this.j.b()).c(ejwk.b(str), ejxrVar);
    }

    @Override // defpackage.alfq
    public final alqm d(dggk dggkVar) {
        return ((alnz) this.j.b()).d(dggkVar);
    }

    @Override // defpackage.alfq
    public final alqm e(String str, String str2, String str3, boolean z, String str4, ejxr ejxrVar) {
        return ((alnz) this.j.b()).e(str, str2, str3, z, str4, ejxrVar);
    }

    @Override // defpackage.alfq
    public final alqm f() {
        return ((alnz) this.j.b()).f();
    }

    @Override // defpackage.alfq
    public final alqm g(alqm alqmVar, ejxr ejxrVar) {
        return ((alnz) this.j.b()).g(alqmVar, ejxrVar);
    }

    @Override // defpackage.alfq
    public final alqm h(alqm alqmVar, final String str) {
        return g(alqmVar, new ejxr() { // from class: alta
            @Override // defpackage.ejxr
            public final Object get() {
                return str;
            }
        });
    }

    @Override // defpackage.alfq
    public final alqm i(alqm alqmVar, boolean z) {
        return ((alnz) this.j.b()).i(alqmVar, z);
    }

    @Override // defpackage.alfq
    public final alqm j(alqm alqmVar, int i) {
        return ((alnz) this.j.b()).j(alqmVar, i);
    }

    @Override // defpackage.alfq
    public final alqm k(alqm alqmVar) {
        return ((alnz) this.j.b()).k(alqmVar);
    }

    @Override // defpackage.alrj
    public final alqm l() {
        return ((alql) this.l.b()).c(new ejxr() { // from class: alss
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new ejxr() { // from class: alst
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new ejxr() { // from class: alsu
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of("EMERGENCY+SERVICE+PROVIDER");
            }
        }, new ejxr() { // from class: alsv
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new ejxr() { // from class: alsw
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new altj(), new ejxr() { // from class: alsx
            @Override // defpackage.ejxr
            public final Object get() {
                return new alqj("EMERGENCY+SERVICE+PROVIDER");
            }
        }, new ejxr() { // from class: alsy
            @Override // defpackage.ejxr
            public final Object get() {
                return alwk.SATELLITE_ESP;
            }
        }, new altj(), new altj());
    }

    @Override // defpackage.alrj
    public final alqm m() {
        return ((alql) this.l.b()).c(new ejxr() { // from class: altc
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new ejxr() { // from class: altd
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new ejxr() { // from class: alte
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of("EMERGENCY+SERVICE+PROVIDER+DEMO");
            }
        }, new ejxr() { // from class: altf
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new ejxr() { // from class: altg
            @Override // defpackage.ejxr
            public final Object get() {
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new altj(), new ejxr() { // from class: alth
            @Override // defpackage.ejxr
            public final Object get() {
                return new alqj("EMERGENCY+SERVICE+PROVIDER+DEMO");
            }
        }, new ejxr() { // from class: alti
            @Override // defpackage.ejxr
            public final Object get() {
                return alwk.SATELLITE_ESP;
            }
        }, new altj(), new altj());
    }

    @Override // defpackage.alrj
    public final alqm n(String str) {
        eygg eyggVar = this.k;
        if (((aqbh) eyggVar.b()).a() && alpd.a(str)) {
            return l();
        }
        if (((aqbh) eyggVar.b()).a() && alpd.b(str)) {
            return m();
        }
        eygg eyggVar2 = this.i;
        if (((Optional) eyggVar2.b()).isPresent() && ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && TextUtils.equals(str, ((cgsa) ((Optional) eyggVar2.b()).get()).r())) {
            return v();
        }
        if (dfog.O()) {
            return ((alnz) this.j.b()).c(str, new ejxr() { // from class: altk
                @Override // defpackage.ejxr
                public final Object get() {
                    return ((crmx) this.a.c.b()).k();
                }
            });
        }
        return ((alnz) this.j.b()).c(str, ejxx.a(new ejxr() { // from class: altl
            @Override // defpackage.ejxr
            public final Object get() {
                altr altrVar = this.a;
                return Optional.of(((crnb) altrVar.e.b()).c(((crny) altrVar.b.b()).b()));
            }
        }));
    }

    @Override // defpackage.alrj
    public final alqm o(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.O());
    }

    @Override // defpackage.alrj
    public final alqm p(String str) {
        eygg eyggVar = this.k;
        if (((aqbh) eyggVar.b()).a() && alpd.a(str)) {
            return l();
        }
        if (((aqbh) eyggVar.b()).a() && alpd.b(str)) {
            return m();
        }
        eygg eyggVar2 = this.i;
        if (((Optional) eyggVar2.b()).isPresent() && TextUtils.equals(str, ((cgsa) ((Optional) eyggVar2.b()).get()).r())) {
            return v();
        }
        return ((alnz) this.j.b()).c(str, ejxx.a(new ejxr() { // from class: altm
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
        return ((alnz) this.j.b()).c(str, new ejxr() { // from class: alsp
            @Override // defpackage.ejxr
            public final Object get() {
                altr altrVar = this.a;
                int iA = ((chvg) altrVar.f.b()).a(chvn.g);
                return Optional.of(((arsn) altrVar.h.b()).a() ? ((crny) altrVar.b.b()).h(iA).s() : ((crnb) altrVar.e.b()).c(iA));
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm s(qxf qxfVar) {
        if (qxfVar instanceof bacc) {
            cczv cczvVar = alvx.a;
            if (((Boolean) new alum().get()).booleanValue()) {
                return ((bacc) qxfVar).l;
            }
        }
        return qxfVar.f < 0 ? ((alnz) this.j.b()).c(qxfVar.c, new altj()) : n(qxfVar.c);
    }

    @Override // defpackage.alrj
    public final alqm t(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.V());
    }

    @Override // defpackage.alrj
    public final alqm u(String str, final int i) {
        eygg eyggVar = this.k;
        if (((aqbh) eyggVar.b()).a() && alpd.a(str)) {
            return l();
        }
        if (((aqbh) eyggVar.b()).a() && alpd.b(str)) {
            return m();
        }
        eygg eyggVar2 = this.i;
        return (((Optional) eyggVar2.b()).isPresent() && ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && TextUtils.equals(str, ((cgsa) ((Optional) eyggVar2.b()).get()).r())) ? v() : c(str, new ejxr() { // from class: altn
            @Override // defpackage.ejxr
            public final Object get() {
                altr altrVar = this.a;
                boolean zA = ((arsn) altrVar.h.b()).a();
                int i2 = i;
                String strS = zA ? ((crny) altrVar.b.b()).h(i2).s() : ((crnb) altrVar.e.b()).c(i2);
                return TextUtils.isEmpty(strS) ? Optional.empty() : Optional.of(strS);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm v() {
        eygg eyggVar = this.i;
        if (((Optional) eyggVar.b()).isEmpty()) {
            throw new UnsupportedOperationException("Penpal bot is not supported.");
        }
        final cgsa cgsaVar = (cgsa) ((Optional) eyggVar.b()).get();
        return ((alql) this.l.b()).c(new ejxr() { // from class: alto
            @Override // defpackage.ejxr
            public final Object get() {
                return cgsaVar.r();
            }
        }, new ejxr() { // from class: alto
            @Override // defpackage.ejxr
            public final Object get() {
                return cgsaVar.r();
            }
        }, new ejxr() { // from class: altp
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(cgsaVar.r());
            }
        }, new ejxr() { // from class: alto
            @Override // defpackage.ejxr
            public final Object get() {
                return cgsaVar.r();
            }
        }, new ejxr() { // from class: alto
            @Override // defpackage.ejxr
            public final Object get() {
                return cgsaVar.r();
            }
        }, new ejxr() { // from class: altq
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(((asqx) this.a.g.b()).a(cgsaVar.r(), false));
            }
        }, new ejxr() { // from class: alsq
            @Override // defpackage.ejxr
            public final Object get() {
                return new alqj(cgsaVar.r());
            }
        }, new ejxr() { // from class: alsr
            @Override // defpackage.ejxr
            public final Object get() {
                return alwk.PENPAL_BOT;
            }
        }, new altj(), new altj());
    }

    @Override // defpackage.alrj
    public final alqm w(alqm alqmVar) {
        return h(alqmVar, ((crmx) this.c.b()).n(ejwk.b(alqmVar.n())));
    }

    @Override // defpackage.alrj
    public final alqm x(final alqm alqmVar) {
        ejxr ejxrVar = new ejxr() { // from class: alsz
            @Override // defpackage.ejxr
            public final Object get() {
                return ((alwh) this.a.d.b()).e(ejwk.b(alqmVar.n()));
            }
        };
        return ((Boolean) alhy.c.e()).booleanValue() ? ((alql) this.l.b()).a(alqmVar, ejxrVar) : ((alql) this.l.b()).b(alqmVar, (String) ejxrVar.get());
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
    @Override // defpackage.alrj
    public final ekgb z(asrg asrgVar) {
        ekfw ekfwVar = new ekfw();
        if (asrgVar.d()) {
            ekgb ekgbVarC = asrgVar.c();
            int size = ekgbVarC.size();
            for (int i = 0; i < size; i++) {
                ekfwVar.h(((alnz) this.j.b()).b((aubq) ekgbVarC.get(i)));
            }
        } else {
            ekfwVar.h(((alnz) this.j.b()).b(asrgVar.a()));
        }
        return ekfwVar.g();
    }
}
