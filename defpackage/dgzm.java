package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgzm implements dgwo {
    final /* synthetic */ dgzn a;
    private final long b;

    public dgzm(dgzn dgznVar, long j) {
        this.a = dgznVar;
        this.b = j;
    }

    @Override // defpackage.dgwo
    public final void d(dgwm dgwmVar, String str, byte[] bArr) {
        dgzn dgznVar = this.a;
        dhgr dhgrVar = dgznVar.R;
        long j = this.b;
        Optional optionalA = dhgrVar.a(j);
        if (optionalA.isEmpty()) {
            dhja.h(dgzn.B, "GroupSessionData is not found with sessionId %d. Cannot process conference event.", Long.valueOf(j));
            return;
        }
        Optional optional = ((dhgp) optionalA.get()).b;
        if (optional.isEmpty()) {
            dhja.h(dgzn.B, "No valid conference info. Not firing conference state changed from InstantMessageSession", new Object[0]);
            return;
        }
        if (dgznVar.G == null) {
            dgznVar.G = new ArrayList();
        }
        Object obj = optional.get();
        Iterator it = dgznVar.G.iterator();
        while (it.hasNext()) {
            Optional optionalA2 = ((dezn) obj).d.a((String) it.next(), dgznVar.m);
            if (optionalA2.isPresent() && ((dfaj) optionalA2.get()).b().isEmpty()) {
                throw new IllegalStateException("There is no endpoint present");
            }
            if (optionalA2.isEmpty() || ((dfaj) optionalA2.get()).h == dfae.DELETED || ((dfaj) optionalA2.get()).b().isEmpty() || (((dfaj) optionalA2.get()).a() == dezw.DISCONNECTED && ((dezv) ((dfaj) optionalA2.get()).b().get()).f != dezu.BOOTED)) {
                it.remove();
            }
        }
        try {
            ((dezn) optional.get()).c();
            dhgrVar.d();
        } catch (Exception e) {
            dhja.i(e, "Error while saving groups after resetting conference : %s", e.getMessage());
        }
        for (dgwh dgwhVar : ((dgwe) this.a).g) {
            if (dgwhVar instanceof dgyy) {
                ((dgyy) dgwhVar).d();
            }
        }
    }

    @Override // defpackage.dgwo
    public final void q(int i, String str) {
        dhja.h(dgzn.B, "Subscription for conference failed: %d:%s", Integer.valueOf(i), str);
    }

    @Override // defpackage.dgwo
    public final void r(dhft dhftVar) {
        dhja.j(dhftVar, dgzn.B, "Subscription for conference failed: %s", dhftVar.getMessage());
    }

    @Override // defpackage.dgwo
    public final void t() {
    }

    @Override // defpackage.dgwo
    public final void u() {
    }

    @Override // defpackage.dgwo
    public final void v(dhft dhftVar) {
    }
}
