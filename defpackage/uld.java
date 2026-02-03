package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uld implements lun {
    private final fcsu c;
    private final fcsu d;
    private final eg f;
    private final cogw g;
    private Instant h;
    private final cqce b = cqce.g("Bugle", "ConversationScreenErrorStateLogger");
    public final AtomicInteger a = new AtomicInteger(0);
    private final AtomicInteger e = new AtomicInteger(0);

    public uld(eg egVar, fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar) {
        this.f = egVar;
        this.d = fcsuVar;
        this.c = fcsuVar2;
        this.g = cogwVar;
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        this.b.m("onDestroy called:");
        if (Duration.between(this.h, this.g.f()).compareTo(Duration.ofMillis(((Long) acol.a.e()).longValue())) > 0) {
            AtomicInteger atomicInteger = this.e;
            if (atomicInteger.get() != 3) {
                ennt enntVar = (ennt) ennu.a.createBuilder();
                emob emobVar = (emob) emoc.a.createBuilder();
                int iA = emoa.a(this.a.get());
                if (iA == 0) {
                    throw null;
                }
                emobVar.copyOnWrite();
                emoc emocVar = (emoc) emobVar.instance;
                emocVar.d = iA - 1;
                emocVar.b |= 2;
                boolean zA = ((abwu) this.d.b()).a(this.f);
                emobVar.copyOnWrite();
                emoc emocVar2 = (emoc) emobVar.instance;
                emocVar2.b |= 1;
                emocVar2.c = zA;
                enntVar.copyOnWrite();
                ennu ennuVar = (ennu) enntVar.instance;
                emoc emocVar3 = (emoc) emobVar.build();
                emocVar3.getClass();
                ennuVar.d = emocVar3;
                ennuVar.b |= 2;
                emod emodVar = (emod) emog.a.createBuilder();
                int iA2 = emof.a(atomicInteger.get());
                if (iA2 == 0) {
                    throw null;
                }
                emodVar.copyOnWrite();
                emog emogVar = (emog) emodVar.instance;
                emogVar.c = iA2 - 1;
                emogVar.b |= 1;
                enntVar.copyOnWrite();
                ennu ennuVar2 = (ennu) enntVar.instance;
                emog emogVar2 = (emog) emodVar.build();
                emogVar2.getClass();
                ennuVar2.c = emogVar2;
                ennuVar2.b |= 1;
                aill aillVar = (aill) this.c.b();
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.CONVERSATION_SCREEN_METRIC_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                ennv ennvVar = (ennv) ennw.a.createBuilder();
                ennvVar.copyOnWrite();
                ennw ennwVar = (ennw) ennvVar.instance;
                ennu ennuVar3 = (ennu) enntVar.build();
                ennuVar3.getClass();
                ennwVar.c = ennuVar3;
                ennwVar.b = 1;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                ennw ennwVar2 = (ennw) ennvVar.build();
                ennwVar2.getClass();
                ellhVar2.bv = ennwVar2;
                ellhVar2.g |= 32;
                aillVar.k(ellgVar, emxt.CONVERSATION_SCREEN_METRIC_EVENT);
            }
        }
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        this.b.m("onCreate called:");
        this.h = this.g.f();
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
