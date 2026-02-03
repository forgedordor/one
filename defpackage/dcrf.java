package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcrf {
    private final dcre a;
    private final ejbj b;
    private long c;
    private final dcmy d;

    public dcrf(dcre dcreVar, dcmy dcmyVar) {
        this.a = dcreVar;
        this.d = dcmyVar;
        this.b = (ejbj) ejbn.a.createBuilder();
        this.c = -1L;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized dcrf clone() {
        return new dcrf(this);
    }

    public final synchronized ejbn b() {
        return (ejbn) this.b.build();
    }

    public final void c(int i, dcre dcreVar) {
        if (dcreVar == dcre.NOTHING) {
            throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
        }
        if (dcreVar.compareTo(this.a) > 0) {
            return;
        }
        synchronized (this) {
            ejbk ejbkVar = (ejbk) ejbm.a.createBuilder();
            ejbkVar.copyOnWrite();
            ejbm ejbmVar = (ejbm) ejbkVar.instance;
            ejbmVar.c = i - 1;
            ejbmVar.b |= 1;
            long jNanoTime = System.nanoTime();
            long j = this.c;
            if (j >= 0) {
                long millis = Duration.ofNanos(jNanoTime - j).toMillis();
                ejbkVar.copyOnWrite();
                ejbm ejbmVar2 = (ejbm) ejbkVar.instance;
                ejbmVar2.b |= 2;
                ejbmVar2.d = millis;
            }
            this.c = jNanoTime;
            ejbj ejbjVar = this.b;
            ejbjVar.copyOnWrite();
            ejbn ejbnVar = (ejbn) ejbjVar.instance;
            ejbm ejbmVar3 = (ejbm) ejbkVar.build();
            ejbn ejbnVar2 = ejbn.a;
            ejbmVar3.getClass();
            evtg evtgVar = ejbnVar.b;
            if (!evtgVar.c()) {
                ejbnVar.b = evsn.mutableCopy(evtgVar);
            }
            ejbnVar.b.add(ejbmVar3);
        }
    }

    private dcrf(dcrf dcrfVar) {
        this.a = dcrfVar.a;
        this.d = dcrfVar.d;
        this.b = (ejbj) dcrfVar.b.mo442clone();
        this.c = dcrfVar.c;
    }
}
