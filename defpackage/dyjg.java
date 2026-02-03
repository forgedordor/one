package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyjg extends dygn {
    public boolean A;
    public lbz B;
    public etzz C;
    private final ddfp D;
    public final ddfu a;
    public final ejwi y;
    public boolean z;

    public dyjg(dyju dyjuVar, lvj lvjVar, final ddfp ddfpVar, final ejwi ejwiVar, final String str, ejwi ejwiVar2) {
        dygo dygoVarE = dygp.e();
        dyjv dyjvVar = (dyjv) dyjuVar;
        dyeu dyeuVar = (dyeu) dygoVarE;
        dyeuVar.b = new dyet(dyjvVar.a, ejud.a);
        dyeuVar.a = dyjvVar.c;
        dyey dyeyVar = new dyey();
        dyeyVar.b(160133);
        dyeyVar.c(90535);
        dyeyVar.d(90535);
        dyeuVar.d = dyeyVar.a();
        super(dygoVarE.a());
        this.B = new lbz() { // from class: dyje
            @Override // defpackage.lbz
            public final void accept(Object obj) {
            }
        };
        this.D = ddfpVar;
        this.y = ejwiVar2;
        ddft ddftVar = (ddft) ddfu.a.createBuilder();
        ddftVar.copyOnWrite();
        ddfu ddfuVar = (ddfu) ddftVar.instance;
        str.getClass();
        ddfuVar.c = str;
        euag euagVar = (euag) euai.a.createBuilder();
        euagVar.copyOnWrite();
        euai euaiVar = (euai) euagVar.instance;
        euaiVar.c = 1;
        euaiVar.b |= 1;
        ddftVar.copyOnWrite();
        ddfu ddfuVar2 = (ddfu) ddftVar.instance;
        euai euaiVar2 = (euai) euagVar.build();
        euaiVar2.getClass();
        ddfuVar2.d = euaiVar2;
        ddfuVar2.b |= 1;
        String str2 = dyjvVar.d;
        ddftVar.copyOnWrite();
        ddfu ddfuVar3 = (ddfu) ddftVar.instance;
        ddfuVar3.b |= 2;
        ddfuVar3.e = str2;
        this.a = (ddfu) ddftVar.build();
        b(lvjVar, new lvz() { // from class: dyjf
            @Override // defpackage.lvz
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                dyjg dyjgVar = this.a;
                if (zBooleanValue == dyjgVar.A) {
                    return;
                }
                dyjgVar.A = bool.booleanValue();
                if (dyjgVar.z) {
                    final dyws dywsVar = (dyws) ((ejwt) ejwiVar).a;
                    dywsVar.a(new Runnable() { // from class: dywo
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((ecoe) ((dyxi) dywsVar.a.get()).j.get()).a(new Object[0]);
                        }
                    });
                }
                dyjg.l(ddfpVar, dyjgVar.z, dyjgVar.a, dyjgVar.A);
            }
        });
        j(dygk.ALWAYS_HIDE_DIVIDER_CARD);
        dygq dygqVarD = dygr.d();
        ((dyew) dygqVarD).b = ejwi.j(dyjvVar.b);
        k(ejwi.j(dygqVarD.a()));
        emma emmaVar = (emma) emmc.a.createBuilder();
        emmaVar.copyOnWrite();
        emmc emmcVar = (emmc) emmaVar.instance;
        emmcVar.c = 3;
        emmcVar.b |= 1;
        emmc emmcVar2 = (emmc) emmaVar.build();
        evsl evslVar = dyxw.a;
        dyxz dyxzVar = (dyxz) dyya.a.createBuilder();
        emmn emmnVar = (emmn) emmo.a.createBuilder();
        emmnVar.copyOnWrite();
        emmo emmoVar = (emmo) emmnVar.instance;
        emmcVar2.getClass();
        emmoVar.g = emmcVar2;
        emmoVar.c |= 64;
        emmo emmoVar2 = (emmo) emmnVar.build();
        dyxzVar.copyOnWrite();
        dyya dyyaVar = (dyya) dyxzVar.instance;
        emmoVar2.getClass();
        dyyaVar.c = emmoVar2;
        dyyaVar.b |= 1;
        dyqj.a(this.f, ejwi.j(new dsva(evslVar, (dyya) dyxzVar.build())));
        m(new View.OnClickListener() { // from class: dyjd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dyjg dyjgVar = this.a;
                etzz etzzVar = dyjgVar.C;
                if (etzzVar == null) {
                    return;
                }
                etzv etzvVar = etzzVar.c;
                if (etzvVar == null) {
                    etzvVar = etzv.a;
                }
                etzt etztVar = etzvVar.b;
                if (etztVar == null) {
                    etztVar = etzt.a;
                }
                if ((etztVar.b & 1) == 0) {
                    etzr etzrVar = (etzr) etztVar.toBuilder();
                    etzrVar.copyOnWrite();
                    etzt etztVar2 = (etzt) etzrVar.instance;
                    etztVar2.b |= 1;
                    etztVar2.c = 400;
                    etzrVar.a(etfz.a);
                    etztVar = (etzt) etzrVar.build();
                }
                String str3 = str;
                dyjgVar.B.accept(str3);
                dyat.b(view, str3, etztVar);
            }
        });
        n(false);
    }

    public static void l(ddfp ddfpVar, boolean z, ddfu ddfuVar, boolean z2) {
        if (z && z2) {
            ddhd.a(ddfuVar, (ddhi) ddfpVar);
        }
    }

    @Override // defpackage.dygn
    protected final void h() {
        if (this.z) {
            return;
        }
        this.z = true;
        l(this.D, true, this.a, this.A);
    }

    @Override // defpackage.dygn
    protected final void i() {
        this.z = false;
    }
}
