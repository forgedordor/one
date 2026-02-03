package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhaw extends dgvq {
    public final CopyOnWriteArrayList g;
    public final fcsu h;
    public dhaz i;
    public dgvj j;
    public dhmb k;
    public final crmx l;
    public final dgxf m;
    public final dhme n;
    public final dhnr o;
    public final dgwo p;
    public final dhau q;

    public dhaw(dfys dfysVar, dgwg dgwgVar, fcsu fcsuVar, crmx crmxVar, dgxf dgxfVar, dhjt dhjtVar, dhme dhmeVar, dhnr dhnrVar) {
        super(dfysVar, dgwgVar, dhjtVar);
        this.g = new CopyOnWriteArrayList();
        this.q = new dhau(this);
        this.p = new dhav(this);
        this.h = fcsuVar;
        this.l = crmxVar;
        this.m = dgxfVar;
        this.n = dhmeVar;
        this.o = dhnrVar;
    }

    @Override // defpackage.dgvq
    protected final void e() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((dhay) it.next()).c();
        }
    }

    @Override // defpackage.dgvq
    protected final void f() {
        dfys dfysVar = this.a;
        if (((dfyj) dfysVar).g.p().mUsePresence) {
            return;
        }
        if (!dfpk.q()) {
            dhja.c("Capability Discovery via Presence is disabled by Google.", new Object[0]);
        } else if (dfysVar.b().h().mPresenceDiscovery) {
            return;
        } else {
            dhja.c("Capability Discovery via Presence is disabled by configuration.", new Object[0]);
        }
        dhja.c("Presence is disabled by configuration! Stopping PresenceService...", new Object[0]);
        k(dezf.UNKNOWN);
    }

    @Override // defpackage.dgvq
    protected final void g(dezf dezfVar) throws dhax {
        if (dezfVar.b()) {
            dhja.c("Skipping call to unsubscribe due to %s", dezfVar);
            return;
        }
        try {
            dhaz dhazVar = this.i;
            if (dhazVar == null) {
                return;
            }
            try {
                if (dhazVar.k == 0) {
                    this.i = null;
                } else {
                    dhazVar.n();
                }
            } catch (Exception e) {
                throw new dhax("Error while sending presence un-subscription ", e);
            }
        } catch (dhax e2) {
            dhja.i(e2, "Error while unsubscribing: %s", e2.getMessage());
        }
    }

    @Override // defpackage.dgvq
    public final void n() {
    }

    @Override // defpackage.dgvq
    public final void o() {
    }
}
