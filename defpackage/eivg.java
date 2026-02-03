package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eivg implements eira {
    final /* synthetic */ eivh a;
    final /* synthetic */ eiou b;

    public eivg(eivh eivhVar, eiou eiouVar) {
        this.b = eiouVar;
        this.a = eivhVar;
    }

    @Override // defpackage.eira
    public final void a(Throwable th) {
        this.b.a(1);
        throw new IllegalStateException("unhandled exception in request processing", th);
    }

    @Override // defpackage.eira
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eipz eipzVar = (eipz) obj;
        eizb eizbVar = (eizb) eizg.a.createBuilder();
        eipzVar.b();
        eizbVar.copyOnWrite();
        ((eizg) eizbVar.instance).d = false;
        Object objA = eipzVar.a();
        if (objA != null) {
            eivh eivhVar = this.a;
            eizc eizcVar = (eizc) eizf.a.createBuilder();
            for (Map.Entry entry : eivhVar.b.d.entrySet()) {
                List list = (List) aky$$ExternalSyntheticApiModelOutline0.m178m(entry.getValue()).apply(objA);
                if (!list.isEmpty()) {
                    eizd eizdVar = (eizd) eize.a.createBuilder();
                    String str = (String) entry.getKey();
                    eizdVar.copyOnWrite();
                    eize eizeVar = (eize) eizdVar.instance;
                    str.getClass();
                    eizeVar.b = str;
                    eizdVar.copyOnWrite();
                    eize eizeVar2 = (eize) eizdVar.instance;
                    evtg evtgVar = eizeVar2.c;
                    if (!evtgVar.c()) {
                        eizeVar2.c = evsn.mutableCopy(evtgVar);
                    }
                    evpz.addAll(list, eizeVar2.c);
                    eize eizeVar3 = (eize) eizdVar.build();
                    eizcVar.copyOnWrite();
                    eizf eizfVar = (eizf) eizcVar.instance;
                    eizeVar3.getClass();
                    evtg evtgVar2 = eizfVar.b;
                    if (!evtgVar2.c()) {
                        eizfVar.b = evsn.mutableCopy(evtgVar2);
                    }
                    eizfVar.b.add(eizeVar3);
                }
            }
            eizf eizfVar2 = (eizf) eizcVar.build();
            eizbVar.copyOnWrite();
            eizg eizgVar = (eizg) eizbVar.instance;
            eizfVar2.getClass();
            eizgVar.c = eizfVar2;
            eizgVar.b = 3;
        }
        eiou eiouVar = this.b;
        eiouVar.a.z(eipn.a("app_action_result", (eizg) eizbVar.build()));
    }
}
