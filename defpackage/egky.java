package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egky implements lun {
    public final ea a;
    public final efxf b;
    final dydi c;
    private final eigp f;
    private final dyay g = new egkx(this);
    efwo d = null;
    public egbe e = null;

    public egky(ea eaVar, efxf efxfVar, ejwi ejwiVar, eigp eigpVar) {
        this.a = eaVar;
        this.b = efxfVar;
        this.f = eigpVar;
        dydi dydiVar = new dydi(new egli(ejwiVar));
        this.c = dydiVar;
        dydiVar.a.a = false;
        eaVar.P().c(this);
        eaVar.U().b("tiktok_og_model_saved_instance_state", new piw() { // from class: egkw
            @Override // defpackage.piw
            public final Bundle a() {
                Bundle bundle = new Bundle();
                bundle.putParcelable("active_account_id", this.a.d);
                return bundle;
            }
        });
    }

    private final void k(egbe egbeVar) {
        this.b.b(egbeVar.a());
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        this.c.d(this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final egbe g(efwo efwoVar) {
        if (efwoVar == null) {
            return null;
        }
        ekgb ekgbVarB = this.c.b();
        int i = ((ekoe) ekgbVarB).c;
        int i2 = 0;
        while (i2 < i) {
            egbe egbeVar = (egbe) ekgbVarB.get(i2);
            i2++;
            if (efwoVar.equals(egbeVar.a())) {
                return egbeVar;
            }
        }
        return null;
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        ea eaVar = this.a;
        Bundle bundleA = eaVar.U().d() ? eaVar.U().a("tiktok_og_model_saved_instance_state") : null;
        if (bundleA != null) {
            this.d = (efwo) bundleA.getParcelable("active_account_id");
        }
        this.c.c(this.g);
    }

    public final void h() {
        j(null);
    }

    final void i(egbe egbeVar) {
        if (eidc.v()) {
            k(egbeVar);
            return;
        }
        eieh eiehVarC = this.f.c("Nav: Switch Account", "com/google/apps/tiktok/account/ui/onegoogle/OGAccountsModel", "selectAccount", 172);
        try {
            k(egbeVar);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j(efwo efwoVar) {
        this.d = efwoVar;
        this.c.g(g(efwoVar));
    }

    /* compiled from: PG */
    public final class a implements egzv, lun {
        private final egky a;
        private final egkz b;
        private ejwi c = ejud.a;
        private final ejwi d;

        public a(egky egkyVar, ejwi ejwiVar, egkz egkzVar, ejwi ejwiVar2) {
            this.a = egkyVar;
            this.b = egkzVar;
            this.d = ejwiVar2;
            eglh eglhVar = (eglh) ((ejwt) ejwiVar).a;
            if (eglhVar.a.compareAndSet(false, true)) {
                eglhVar.b.d(new eglg(eglhVar));
            }
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            this.c = ejud.a;
            this.a.h();
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            List<egbe> list = (List) obj;
            ekhx ekhxVarO = ekhx.o(list);
            if (this.c.g() && ((ekhx) this.c.c()).equals(ekhxVarO)) {
                return;
            }
            this.c = ejwi.j(ekhxVarO);
            ArrayList arrayList = new ArrayList();
            for (egbe egbeVar : list) {
                if ("pseudonymous".equals(egbeVar.b().k)) {
                    egky egkyVar = this.a;
                    ejwl.l("pseudonymous".equals(egbeVar.b().k));
                    egkyVar.e = egbeVar;
                } else if (!"incognito".equals(egbeVar.b().k)) {
                    arrayList.add(egbeVar);
                }
            }
            egky egkyVar2 = this.a;
            dydi dydiVar = egkyVar2.c;
            dydiVar.a.g(ekgb.n(arrayList));
            dydiVar.g(egkyVar2.g(egkyVar2.d));
            if (((Boolean) this.d.e(false)).booleanValue()) {
                egkz egkzVar = this.b;
                if (egkzVar.a.compareAndSet(false, true)) {
                    egoc.d("com/google/apps/tiktok/account/ui/onegoogle/OGAccountsModel$SyncAccountsOnce", "syncIfNotSyncedBefore", 277, egkzVar.b.b(), "Failed to sync accounts in the OGAccountsModel", new Object[0]);
                }
            }
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
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
        public final /* synthetic */ void gF(lvj lvjVar) {
        }

        @Override // defpackage.lun
        public final /* synthetic */ void gG(lvj lvjVar) {
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
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
