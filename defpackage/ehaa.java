package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehaa implements lun {
    final /* synthetic */ ea a;
    final /* synthetic */ ehab b;

    public ehaa(ehab ehabVar, ea eaVar) {
        this.a = eaVar;
        this.b = ehabVar;
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        ehab ehabVar = this.b;
        ehabVar.a.e.d();
        ehabVar.b.d();
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        ehab ehabVar = this.b;
        egpl egplVar = ehabVar.b;
        egplVar.d();
        egplVar.a();
        ehae ehaeVar = ehabVar.a;
        Iterator it = ehaeVar.a.values().iterator();
        while (it.hasNext()) {
            ((ehaq) it.next()).c();
        }
        Iterator it2 = ehaeVar.b.values().iterator();
        while (it2.hasNext()) {
            ((ehaq) it2.next()).c();
        }
        ehaeVar.c.c();
        ehaeVar.d.clear();
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        ea eaVar = this.a;
        lys lysVar = new lys(eaVar.T());
        lysVar.b(lwu.c, Bundle.EMPTY);
        this.b.a = (ehae) new lxo(eaVar.S(), eaVar.R(), lysVar).a(ehae.class);
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        ehab ehabVar = this.b;
        ehabVar.b.c();
        ehae ehaeVar = ehabVar.a;
        ehaeVar.c.g();
        for (Integer num : ehaeVar.b.keySet()) {
            ejwl.n(ehaeVar.d.contains(num), "Did not re-register a subscription for @ResId %s. You must re-register all subscriptions you previously had after a configuration change, so that you don't lose user state.", num.intValue());
        }
        ehabVar.a.e.c();
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }
}
