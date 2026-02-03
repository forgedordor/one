package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egah implements egac, lun {
    public static final egag a = new egag();
    public static final ekrg b = ekrg.c("com/google/apps/tiktok/account/api/controller/ActivityAccountStateViewModelBacked");
    private final efzn c;
    private final egaz d;
    private final ehna e;
    private final fctc f;
    private final List g;
    private final boolean h;
    private Object i;
    private final ehnu j;

    public egah(final ehnu ehnuVar, efzn efznVar, egaz egazVar, ejwi ejwiVar, ehna ehnaVar) {
        ehnuVar.getClass();
        efznVar.getClass();
        egazVar.getClass();
        ehnaVar.getClass();
        this.j = ehnuVar;
        this.c = efznVar;
        this.d = egazVar;
        this.e = ehnaVar;
        int i = fdcj.a;
        this.f = new lxf(new fdbi(egas.class), new fdae() { // from class: egai
            @Override // defpackage.fdae
            public final Object invoke() {
                return ehnuVar.S();
            }
        }, new fdae() { // from class: egaj
            @Override // defpackage.fdae
            public final Object invoke() {
                return ehnuVar.R();
            }
        }, new fdae() { // from class: egak
            @Override // defpackage.fdae
            public final Object invoke() {
                return ehnuVar.T();
            }
        });
        this.g = new ArrayList();
        this.h = ((Boolean) ejwiVar.e(false)).booleanValue();
        ehnuVar.P().c(this);
    }

    private final egas p() {
        return (egas) this.f.a();
    }

    private final void q() {
        this.j.a().al();
    }

    private final boolean r(int i, egbs egbsVar, int i2) {
        ecem.c();
        this.d.g();
        int iG = g();
        boolean z = i2 != p().c;
        boolean z2 = i != iG;
        if (z2 || z) {
            q();
        }
        if (z2 || (z && p().c != 0)) {
            a.a(this.j.a());
        }
        if (z2) {
            int iG2 = g();
            p().a = i;
            this.e.b(efwo.b(g()));
            if (Log.isLoggable("ActivityAccountState", 3)) {
                Log.d("ActivityAccountState", "Account Transition: " + iG2 + " > " + g());
            }
        }
        if (p().c == 0) {
            g();
            if (p().c == 0) {
                s();
            } else {
                g();
                s();
            }
        }
        p().b = egbsVar;
        p().c = i2;
        return z2 || z;
    }

    private final void s() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((egad) it.next()).a();
        }
    }

    @Override // defpackage.egac
    public final int g() {
        ecem.c();
        return p().a;
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        boolean z = p().e && !this.h && p().d;
        p().d = this.h;
        if (z) {
            egas egasVarP = p();
            egasVarP.a = -1;
            egbs egbsVar = egbs.a;
            egbsVar.getClass();
            egasVarP.b = egbsVar;
            egasVarP.c = 0;
            a.a(this.j.a());
            return;
        }
        int i = p().c;
        if (i != 0) {
            if (i == 1) {
                this.c.e();
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                }
                this.c.d();
            } else {
                efzn efznVar = this.c;
                efwo.b(g());
                efznVar.c(p().b);
            }
        }
    }

    @Override // defpackage.egac
    public final egbs h() {
        ecem.c();
        return p().b;
    }

    @Override // defpackage.egac
    public final boolean i() {
        ecem.c();
        return p().a != -1;
    }

    @Override // defpackage.egac
    public final void j() {
        egbs egbsVar = egbs.a;
        egbsVar.getClass();
        r(-1, egbsVar, 0);
    }

    @Override // defpackage.egac
    public final void k(Object obj) {
        Object obj2 = this.i;
        if (obj2 != null && !fdbq.f(obj2, obj)) {
            throw new IllegalStateException("Check failed.");
        }
        this.i = obj;
    }

    @Override // defpackage.egac
    public final void l(efyg efygVar) {
        efygVar.getClass();
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Error", efygVar);
        }
        egbs egbsVar = egbs.a;
        egbsVar.getClass();
        r(-1, egbsVar, 3);
        efzn efznVar = this.c;
        efznVar.d();
        efznVar.f(efygVar);
    }

    @Override // defpackage.egac
    public final void m() {
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Loading");
        }
        egbs egbsVar = egbs.a;
        egbsVar.getClass();
        if (r(-1, egbsVar, 1)) {
            efzn efznVar = this.c;
            efznVar.e();
            efznVar.g();
        }
    }

    @Override // defpackage.egac
    public final void n(efwo efwoVar, egbs egbsVar, efxb efxbVar) {
        efwoVar.getClass();
        egbsVar.getClass();
        efxbVar.getClass();
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Objects.toString(efwoVar);
            Log.d("ActivityAccountState", "Switch To Account: ".concat(efwoVar.toString()));
        }
        if (r(efwoVar.a(), egbsVar, 2)) {
            efzn efznVar = this.c;
            efznVar.c(egbsVar);
            efznVar.h(efwoVar, egbsVar);
            q();
            efznVar.b(egbsVar);
        }
    }

    @Override // defpackage.egac
    public final void o(egbs egbsVar) {
        egbsVar.getClass();
        q();
        if (i()) {
            this.c.b(egbsVar);
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
