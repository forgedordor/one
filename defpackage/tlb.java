package defpackage;

import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import j$.util.Optional;
import java.util.Collection;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tlb implements egps<tld, evwl<cpkr>> {
    final /* synthetic */ BlockAndReportSpamCallbacks a;

    public tlb(BlockAndReportSpamCallbacks blockAndReportSpamCallbacks) {
        this.a = blockAndReportSpamCallbacks;
    }

    @Override // defpackage.egps
    public final /* synthetic */ void c(Object obj, Object obj2) {
        ekgb ekgbVarN;
        final tld tldVar = (tld) obj;
        final cpkr cpkrVar = (cpkr) ((evwl) obj2).a(cpkr.a, evrr.a());
        int i = cpkrVar.b;
        boolean z = true;
        if ((i & 16) == 0 && (i & 2) == 0 && (i & 1) == 0) {
            return;
        }
        boolean zI = tldVar.i();
        boolean zJ = tldVar.j();
        if (!zI && !zJ) {
            z = false;
        }
        ejwl.m(z, "The dialog must result in at least the block or spam status being updated, if not both.");
        BlockAndReportSpamCallbacks blockAndReportSpamCallbacks = this.a;
        tix tixVar = (tix) blockAndReportSpamCallbacks.c.b();
        tiv tivVarG = tiw.g();
        tir tirVar = (tir) tivVarG;
        tirVar.a = tldVar.g();
        tivVarG.g(zI, zI);
        tivVarG.h(zJ, zJ);
        Supplier supplier = blockAndReportSpamCallbacks.k;
        if (supplier == null) {
            int i2 = ekgb.d;
            ekgbVarN = ekoe.a;
        } else {
            ekgbVarN = ekgb.n((Collection) supplier.get());
        }
        tivVarG.e(ekgbVarN);
        tirVar.b = Optional.of(new Runnable() { // from class: tla
            @Override // java.lang.Runnable
            public final void run() {
                final BlockAndReportSpamCallbacks blockAndReportSpamCallbacks2 = this.a.a;
                final tld tldVar2 = tldVar;
                final cpkr cpkrVar2 = cpkrVar;
                ((egpr) blockAndReportSpamCallbacks2.f.b()).h(egpq.b(eijx.f(new Runnable() { // from class: tky
                    @Override // java.lang.Runnable
                    public final void run() {
                        auvh.h(((cpjw) blockAndReportSpamCallbacks2.b.b()).a(cpkg.c(cpkrVar2, tldVar2.i() ? elka.CONVERSATION_FROM_UNBLOCK_ACTION : elka.CONVERSATION_FROM_UNSPAM_ACTION, 2)));
                    }
                }, blockAndReportSpamCallbacks2.h)), new egpo(tldVar2), blockAndReportSpamCallbacks2.j);
            }
        });
        tivVarG.b(tldVar.a());
        tixVar.b(tivVarG.f());
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
