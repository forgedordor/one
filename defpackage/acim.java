package defpackage;

import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acim {
    private final fcsu a;
    private final fcsu b;

    public acim(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Iterable, java.lang.Object] */
    public final void a(int i, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        fcsu fcsuVar = this.b;
        if (!((ajjp) fcsuVar.b()).b()) {
            ((ajjp) fcsuVar.b()).a();
            return;
        }
        elif elifVar = (elif) elig.a.createBuilder();
        elifVar.copyOnWrite();
        elig eligVar = (elig) elifVar.instance;
        eligVar.d = i - 1;
        eligVar.b |= 2;
        optional.isPresent();
        Object obj = optional.get();
        elifVar.copyOnWrite();
        elig eligVar2 = (elig) elifVar.instance;
        eligVar2.c = ((elie) obj).k;
        eligVar2.b |= 1;
        if (optional2.isPresent()) {
            Object obj2 = optional2.get();
            elifVar.copyOnWrite();
            elig eligVar3 = (elig) elifVar.instance;
            eligVar3.e = ((elia) obj2).m;
            eligVar3.b |= 4;
        }
        if (optional3.isPresent()) {
            ?? r3 = optional3.get();
            elifVar.copyOnWrite();
            elig eligVar4 = (elig) elifVar.instance;
            evsx evsxVar = eligVar4.f;
            if (!evsxVar.c()) {
                eligVar4.f = evsn.mutableCopy(evsxVar);
            }
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                eligVar4.f.h(((elhx) it.next()).g);
            }
        }
        if (optional4.isPresent()) {
            Object obj3 = optional4.get();
            elifVar.copyOnWrite();
            elig eligVar5 = (elig) elifVar.instance;
            eligVar5.g = ((elic) obj3).e;
            eligVar5.b |= 8;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_ADVANCED_FEEDBACK_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elig eligVar6 = (elig) elifVar.build();
        eligVar6.getClass();
        ellhVar2.aj = eligVar6;
        ellhVar2.d |= 32;
        ((aill) this.a.b()).j(ellgVar);
    }
}
