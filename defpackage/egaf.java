package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.egac;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egaf implements egac, lun {
    private static final ekrg e = ekrg.c("com/google/apps/tiktok/account/api/controller/ActivityAccountStateActivityBacked");
    public final boolean a;
    private final efzn f;
    private final egaz g;
    private final ehna i;
    private final ehnu k;
    private final List h = new ArrayList();
    private Object j = null;
    public int b = -1;
    public egbs c = egbs.a;
    public int d = 0;

    public egaf(ehnu ehnuVar, efzn efznVar, egaz egazVar, ejwi ejwiVar, ehna ehnaVar) {
        this.k = ehnuVar;
        this.f = efznVar;
        this.g = egazVar;
        this.a = ((Boolean) ejwiVar.e(false)).booleanValue();
        this.i = ehnaVar;
        ehnuVar.P().c(this);
        ehnuVar.U().b("tiktok_activity_account_state_saved_instance_state", new piw() { // from class: egae
            @Override // defpackage.piw
            public final Bundle a() {
                Bundle bundle = new Bundle();
                egaf egafVar = this.a;
                bundle.putInt("state_account_id", egafVar.b);
                ProtoParsers.j(bundle, "state_account_info", egafVar.c);
                bundle.putInt("state_account_state", egafVar.d);
                bundle.putBoolean("tiktok_accounts_disabled", egafVar.a);
                return bundle;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void p(fr frVar) {
        try {
            frVar.aq(null);
            List<ea> listO = frVar.o();
            if (listO == null || listO.isEmpty()) {
                return;
            }
            cg cgVar = new cg(frVar);
            for (ea eaVar : listO) {
                if ((eaVar instanceof eyhx) && (((eyhx) eaVar).bb() instanceof egac.a)) {
                    cgVar.o(eaVar);
                } else {
                    fr frVarI = eaVar.I();
                    frVarI.al();
                    p(frVarI);
                }
            }
            if (cgVar.i()) {
                return;
            }
            cgVar.A();
            cgVar.c();
        } catch (IllegalStateException e2) {
            StringWriter stringWriter = new StringWriter();
            frVar.K("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            ((ekrd) ((ekrd) ((ekrd) e.i()).g(e2)).h("com/google/apps/tiktok/account/api/controller/ActivityAccountStateActivityBacked", "clearFragments", 333, "ActivityAccountStateActivityBacked.java")).t("popBackStackImmediate failure, fragment state %s", new esvh(esvg.NO_USER_DATA, stringWriter.toString()));
            throw e2;
        }
    }

    private final void q() {
        this.k.a().al();
    }

    private final boolean r(int i, egbs egbsVar, int i2) {
        egbsVar.getClass();
        ecem.c();
        this.g.g();
        int i3 = this.b;
        boolean z = i2 != this.d;
        boolean z2 = i != i3;
        if (z2 || z) {
            q();
        }
        if (z2 || (z && this.d != 0)) {
            p(this.k.a());
        }
        if (z2) {
            int i4 = this.b;
            this.b = i;
            this.i.b(efwo.b(i));
            if (Log.isLoggable("ActivityAccountState", 3)) {
                Log.d("ActivityAccountState", "Account Transition: " + i4 + " > " + this.b);
            }
        }
        if (this.d == 0) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((egad) it.next()).a();
            }
        }
        this.c = egbsVar;
        this.d = i2;
        return z2 || z;
    }

    @Override // defpackage.egac
    public final int g() {
        ecem.c();
        return this.b;
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        ehnu ehnuVar = this.k;
        Bundle bundleA = ehnuVar.U().d() ? ehnuVar.U().a("tiktok_activity_account_state_saved_instance_state") : null;
        if (bundleA != null) {
            if (!this.a && bundleA.getBoolean("tiktok_accounts_disabled")) {
                p(this.k.a());
                return;
            }
            this.b = bundleA.getInt("state_account_id", -1);
            try {
                this.c = (egbs) ProtoParsers.d(bundleA, "state_account_info", egbs.a, evrr.a());
                int i = bundleA.getInt("state_account_state", 0);
                this.d = i;
                if (i != 0) {
                    if (i == 1) {
                        this.f.e();
                        return;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                        }
                        this.f.d();
                    } else {
                        efzn efznVar = this.f;
                        efwo.b(this.b);
                        efznVar.c(this.c);
                    }
                }
            } catch (evtj e2) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", e2);
            }
        }
    }

    @Override // defpackage.egac
    public final egbs h() {
        ecem.c();
        return this.c;
    }

    @Override // defpackage.egac
    public final boolean i() {
        ecem.c();
        return this.b != -1;
    }

    @Override // defpackage.egac
    public final void j() {
        r(-1, egbs.a, 0);
    }

    @Override // defpackage.egac
    public final void k(Object obj) {
        Object obj2 = this.j;
        boolean z = true;
        if (obj2 != null && obj2 != obj) {
            z = false;
        }
        ejwl.l(z);
        this.j = obj;
    }

    @Override // defpackage.egac
    public final void l(efyg efygVar) {
        efygVar.getClass();
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Error", efygVar);
        }
        r(-1, egbs.a, 3);
        efzn efznVar = this.f;
        efznVar.d();
        efznVar.f(efygVar);
    }

    @Override // defpackage.egac
    public final void m() {
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Loading");
        }
        if (r(-1, egbs.a, 1)) {
            efzn efznVar = this.f;
            efznVar.e();
            efznVar.g();
        }
    }

    @Override // defpackage.egac
    public final void n(efwo efwoVar, egbs egbsVar, efxb efxbVar) {
        if (Log.isLoggable("ActivityAccountState", 3)) {
            Log.d("ActivityAccountState", "Switch To Account: ".concat(String.valueOf(String.valueOf(efwoVar))));
        }
        if (r(efwoVar.a(), egbsVar, 2)) {
            efzn efznVar = this.f;
            efznVar.c(egbsVar);
            efznVar.h(efwoVar, egbsVar);
            q();
            efznVar.b(egbsVar);
        }
    }

    @Override // defpackage.egac
    public final void o(egbs egbsVar) {
        q();
        if (i()) {
            this.f.b(egbsVar);
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
