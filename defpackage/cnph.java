package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnph {
    public static final void a(emjt emjtVar, Duration duration, Optional optional, Optional optional2, int i, int i2, Optional optional3, fcsu fcsuVar, List list) {
        int i3 = optional3.isPresent() ? true != ((Boolean) optional3.get()).booleanValue() ? 3 : 2 : 4;
        emjp emjpVar = (emjp) emju.a.createBuilder();
        evrj evrjVarA = evwz.a(duration);
        emjpVar.copyOnWrite();
        emju emjuVar = (emju) emjpVar.instance;
        evrjVarA.getClass();
        emjuVar.g = evrjVarA;
        emjuVar.b |= 8;
        int iB = cnma.b(optional);
        emjpVar.copyOnWrite();
        emju emjuVar2 = (emju) emjpVar.instance;
        emjuVar2.d = iB - 1;
        emjuVar2.b |= 2;
        int iB2 = cnma.b(optional2);
        emjpVar.copyOnWrite();
        emju emjuVar3 = (emju) emjpVar.instance;
        emjuVar3.e = iB2 - 1;
        emjuVar3.b |= 4;
        int iB3 = cnma.b(Optional.of(Integer.valueOf(i)));
        emjpVar.copyOnWrite();
        emju emjuVar4 = (emju) emjpVar.instance;
        emjuVar4.j = iB3 - 1;
        emjuVar4.b |= 64;
        int iB4 = cnma.b(Optional.of(Integer.valueOf(i2)));
        emjpVar.copyOnWrite();
        emju emjuVar5 = (emju) emjpVar.instance;
        emjuVar5.k = iB4 - 1;
        emjuVar5.b |= 128;
        emjpVar.copyOnWrite();
        emju emjuVar6 = (emju) emjpVar.instance;
        emjuVar6.c = emjtVar.g;
        emjuVar6.b |= 1;
        emjpVar.copyOnWrite();
        emju emjuVar7 = (emju) emjpVar.instance;
        emjuVar7.h = i3 - 1;
        emjuVar7.b |= 16;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            emjpVar.a((emjv) it.next());
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.TELEPHONY_WIPEOUT_DETECTOR_EXECUTION_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emju emjuVar8 = (emju) emjpVar.build();
        emjuVar8.getClass();
        ellhVar2.aq = emjuVar8;
        ellhVar2.d |= 16384;
        ((aill) fcsuVar.b()).j(ellgVar);
    }
}
