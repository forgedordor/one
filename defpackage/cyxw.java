package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyxw {
    public static final cqce a = cqce.g("Bugle", "SetupExpressiveStickersManager");
    public static final cczv b = cdag.p(166643423);
    public final cqbm c;
    public final eosc d;
    public final eosd e;
    public final eosc f;
    public boolean g;
    public ListenableFuture h;
    cqew i;
    private final crqv j;
    private final ayje k;

    public cyxw(ayje ayjeVar, crqv crqvVar, cqbm cqbmVar, eosc eoscVar, eosd eosdVar, eosc eoscVar2) {
        this.k = ayjeVar;
        crqvVar.getClass();
        this.j = crqvVar;
        cqbmVar.getClass();
        this.c = cqbmVar;
        eoscVar.getClass();
        this.d = eoscVar;
        eosdVar.getClass();
        this.e = eosdVar;
        eoscVar2.getClass();
        this.f = eoscVar2;
    }

    final void a() {
        if (this.i != null) {
            return;
        }
        cyxv cyxvVar = new cyxv(this);
        this.i = cyxvVar;
        cqey cqeyVar = (cqey) this.c.a();
        cqer cqerVar = (cqer) cqeu.a.createBuilder();
        cqet cqetVar = cqet.ALL_ACTIVE_SUBSCRIPTIONS;
        cqerVar.copyOnWrite();
        cqeu cqeuVar = (cqeu) cqerVar.instance;
        cqeuVar.c = cqetVar.e;
        cqeuVar.b |= 1;
        cqeyVar.m(cyxvVar, (cqeu) cqerVar.build());
        a.m("Register stickers setup connectivity state listener");
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [eygg, java.lang.Object] */
    public final void b() {
        a.m("Schedule SetupExpressiveStickersAction");
        this.j.h("has_try_expressive_stickers_setup", true);
        ayje ayjeVar = this.k;
        Context context = (Context) ayjeVar.a.b();
        context.getClass();
        crqv crqvVar = (crqv) ayjeVar.c.b();
        crqvVar.getClass();
        ((cqmr) ayjeVar.d.b()).getClass();
        cogw cogwVar = (cogw) ayjeVar.e.b();
        cogwVar.getClass();
        ?? B = ayjeVar.f.b();
        B.getClass();
        eosc eoscVar = (eosc) ayjeVar.g.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) ayjeVar.h.b();
        eoscVar2.getClass();
        eosd eosdVar = (eosd) ayjeVar.i.b();
        eosdVar.getClass();
        ebxr ebxrVar = (ebxr) ayjeVar.j.b();
        ebxrVar.getClass();
        dqsn dqsnVar = (dqsn) ayjeVar.k.b();
        dqsnVar.getClass();
        new SetupExpressiveStickersAction(context, ayjeVar.b, crqvVar, cogwVar, B, eoscVar, eoscVar2, eosdVar, ebxrVar, dqsnVar).E(Action.t);
    }

    public final void c() {
        cqew cqewVar = this.i;
        if (cqewVar != null) {
            this.i = null;
            cqey cqeyVar = (cqey) this.c.a();
            cqer cqerVar = (cqer) cqeu.a.createBuilder();
            cqet cqetVar = cqet.ALL_ACTIVE_SUBSCRIPTIONS;
            cqerVar.copyOnWrite();
            cqeu cqeuVar = (cqeu) cqerVar.instance;
            cqeuVar.c = cqetVar.e;
            cqeuVar.b |= 1;
            cqeyVar.n(cqewVar, (cqeu) cqerVar.build());
            a.m("Unregister stickers setup connectivity state listener");
        }
    }

    public final boolean d() {
        crqv crqvVar = this.j;
        return crqvVar.q("is_expressive_stickers_setup_done", false) || crqvVar.q("has_try_expressive_stickers_setup", false);
    }
}
