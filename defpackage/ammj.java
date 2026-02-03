package defpackage;

import android.os.Build;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ammj implements cqto {
    final /* synthetic */ amml a;

    public ammj(amml ammlVar) {
        this.a = ammlVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        anpi anpiVar = new anpi() { // from class: ammh
            @Override // defpackage.anpi
            public final eiju a() {
                amml ammlVar = this.a.a;
                synchronized (ammlVar.b) {
                    cquc cqucVar = ammlVar.s;
                    if (cqucVar != null) {
                        ammlVar.r = null;
                        cqucVar.a();
                        ammlVar.s = null;
                        ammlVar.k.b().k(eiid.h(new ammk(ammlVar)), ammlVar.f);
                    }
                }
                return ammlVar.g("Recipients");
            }
        };
        amml ammlVar = this.a;
        ammlVar.p = cqty.b(ammlVar.k.a(anpiVar), ammlVar.j.a(new anpi() { // from class: ammi
            @Override // defpackage.anpi
            public final eiju a() {
                return this.a.a.g("Conversation Properties");
            }
        }));
        synchronized (ammlVar.b) {
            ammlVar.q = true;
        }
        amml ammlVar2 = this.a;
        synchronized (ammlVar2.c) {
            ejwl.l(ammlVar2.t == null);
            ejwl.l(ammlVar2.u == null);
        }
        final amml ammlVar3 = this.a;
        final eiju eijuVarB = ammlVar3.j.b();
        final eiju eijuVarB2 = ammlVar3.k.b();
        eijx.k(eijuVarB, eijuVarB2).a(new Callable() { // from class: amly
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ajts ajtsVar = (ajts) eork.q(eijuVarB);
                ekgb ekgbVar = (ekgb) eork.q(eijuVarB2);
                if (ajtsVar.z() || ekgbVar.isEmpty()) {
                    return null;
                }
                amml ammlVar4 = ammlVar3;
                ammlVar4.h(ajtsVar.h());
                if ((ajtsVar.c() == ajlj.ONE_ON_ONE || ajtsVar.c() == ajlj.RBM) && ekgbVar.size() != 1) {
                    eksl ekslVar = (eksl) amml.a.j();
                    ekslVar.X(cqnc.t, ammlVar4.i);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "maybeSubscribeToAllRcsObservables", 828, "DefaultBugleComposeConstraintsSupplier.java")).w("Compose Constraints: Found %s Recipients for 1:1 conversation. Properties: %s", ekgbVar.size(), ajtsVar);
                }
                ammlVar4.e(ekgbVar);
                return null;
            }
        }, Build.VERSION.SDK_INT <= 26 ? ammlVar3.f : ammlVar3.e).k(auvh.b(), ammlVar3.e);
    }

    @Override // defpackage.cqto
    public final void fK() {
        cquc cqucVar;
        cquc cqucVar2;
        amml ammlVar = this.a;
        synchronized (ammlVar.c) {
            cqucVar = ammlVar.t;
            ammlVar.t = null;
            ammlVar.u = null;
        }
        if (cqucVar != null) {
            cqucVar.a();
        }
        amml ammlVar2 = this.a;
        synchronized (ammlVar2.b) {
            ammlVar2.q = false;
            cqucVar2 = ammlVar2.s;
            ammlVar2.r = null;
            ammlVar2.s = null;
        }
        if (cqucVar2 != null) {
            cqucVar2.a();
        }
        amml ammlVar3 = this.a;
        cquc cqucVar3 = ammlVar3.p;
        cqucVar3.getClass();
        cqucVar3.a();
        ammlVar3.p = null;
    }
}
