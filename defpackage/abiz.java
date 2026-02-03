package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abiz extends abs {
    final /* synthetic */ abja a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abiz(abja abjaVar) {
        super(true);
        this.a = abjaVar;
    }

    @Override // defpackage.abs
    public final void b() {
        DittoWebFragment dittoWebFragment = (DittoWebFragment) this.a.c.a().g(R.id.ditto_web_fragment_ref);
        if (dittoWebFragment == null) {
            abja.b.r("Cannot find DittoWebFragment");
            return;
        }
        abjq abjqVarH = dittoWebFragment.H();
        if (!((lvc) abjqVarH.o.b()).a().a(lvb.d)) {
            abjq.a.r("Current life cycle state is not STARTED, ignore back button press.");
            ((ains) abjqVarH.l.b()).c("Bugle.Satellite.BackPressed.BeforeFragmentStarted.Counts");
            return;
        }
        egpr egprVar = (egpr) abjqVarH.h.b();
        abod abodVarA = ((aboe) abjqVarH.s.b()).a();
        abodVarA.d = false;
        abou abouVar = abou.FOREGROUND;
        eppg eppgVar = (eppg) eppi.a.createBuilder();
        evrl evrlVar = evrl.a;
        eppgVar.copyOnWrite();
        eppi eppiVar = (eppi) eppgVar.instance;
        evrlVar.getClass();
        eppiVar.c = evrlVar;
        eppiVar.b = 208;
        egprVar.g(egpq.a(abodVarA.b(abouVar, (eppi) eppgVar.build())), abjqVarH.F);
    }
}
