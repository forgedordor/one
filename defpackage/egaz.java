package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egaz implements lun {
    public final egpn a;
    public egab b;
    private final List c;
    private final ehnu d;

    public egaz(ehnu ehnuVar) {
        ehnuVar.getClass();
        this.d = ehnuVar;
        this.a = new egpn("KeepStateCallbacksHandler");
        this.c = new ArrayList();
        ehnuVar.P().c(this);
        ehnuVar.U().b("tiktok_keep_state_callback_handler", new piw() { // from class: egay
            @Override // defpackage.piw
            public final Bundle a() {
                Bundle bundle = new Bundle();
                egaz egazVar = this.a;
                egazVar.a.f(bundle);
                egab egabVar = egazVar.b;
                if (egabVar != null) {
                    bundle.putInt("KSCH$AC$callbacks_id", egabVar.a);
                    bundle.putInt("KSCH$AC$callbacks_state", egabVar.b);
                }
                return bundle;
            }
        });
    }

    public final void g() {
        ecem.c();
        egab egabVar = this.b;
        if (egabVar == null) {
            return;
        }
        if (egabVar.b == 1) {
        }
        this.b = null;
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        ehnu ehnuVar = this.d;
        egab egabVar = null;
        Bundle bundleA = ehnuVar.U().d() ? ehnuVar.U().a("tiktok_keep_state_callback_handler") : null;
        if (bundleA != null) {
            this.a.e(bundleA);
            if (bundleA.containsKey("KSCH$AC$callbacks_id")) {
                if (!bundleA.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
                egabVar = new egab(bundleA.getInt("KSCH$AC$callbacks_id"), bundleA.getInt("KSCH$AC$callbacks_state"));
            } else if (bundleA.containsKey("KSCH$AC$callbacks_state")) {
                throw new IllegalStateException("Check failed.");
            }
            this.b = egabVar;
        }
        List list = this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.a.d((abyu) it.next());
        }
        list.clear();
    }

    public final void h(efyg efygVar) {
        efygVar.getClass();
        ecem.c();
        egab egabVar = this.b;
        egabVar.getClass();
        this.b = null;
    }

    public final void i() {
        ecem.c();
        egab egabVar = this.b;
        egabVar.getClass();
        if (egabVar.b == 1) {
            return;
        }
        egabVar.b = 1;
    }

    public final int j(abyu abyuVar) {
        return this.a.a(abyuVar);
    }

    public final abyu k(int i) {
        return (abyu) this.a.b(i);
    }

    public final void l(abyu abyuVar) {
        ecem.c();
        if (this.d.P().a().a(lvb.c)) {
            throw new IllegalStateException("registerKeepStateCallbacks should be invoked in the constructor only.");
        }
        this.c.add(abyuVar);
    }

    public final void m(abyu abyuVar) {
        ecem.c();
        g();
        this.b = new egab(this.a.a(abyuVar), 0);
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
