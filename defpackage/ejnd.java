package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejnd extends euzl {
    public abstract euza a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract List e();

    public abstract List f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.euzl
    public final erxu g() {
        euzr euzrVar = (euzr) h(a()).toBuilder();
        euzp euzpVar = (euzp) euzq.a.createBuilder();
        erxq erxqVar = erxq.a;
        euzpVar.copyOnWrite();
        euzq euzqVar = (euzq) euzpVar.instance;
        erxqVar.getClass();
        euzqVar.c = erxqVar;
        euzqVar.b = 4;
        euzrVar.copyOnWrite();
        euzs euzsVar = (euzs) euzrVar.instance;
        euzq euzqVar2 = (euzq) euzpVar.build();
        euzqVar2.getClass();
        euzsVar.e = euzqVar2;
        euzsVar.b |= 4;
        final euyo euyoVar = (euyo) euyp.a.createBuilder();
        Optional optionalB = b();
        euyoVar.getClass();
        optionalB.ifPresent(new Consumer() { // from class: ejna
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                euyo euyoVar2 = euyoVar;
                String str = (String) obj;
                euyoVar2.copyOnWrite();
                euyp euypVar = (euyp) euyoVar2.instance;
                euyp euypVar2 = euyp.a;
                str.getClass();
                euypVar.b |= 1;
                euypVar.c = str;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        c().ifPresent(new Consumer() { // from class: ejnb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                euyo euyoVar2 = euyoVar;
                euyoVar2.copyOnWrite();
                euyp euypVar = (euyp) euyoVar2.instance;
                euyp euypVar2 = euyp.a;
                euypVar.b |= 2;
                euypVar.d = iIntValue;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        d().ifPresent(new Consumer() { // from class: ejnc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                float fFloatValue = ((Float) obj).floatValue();
                euyo euyoVar2 = euyoVar;
                euyoVar2.copyOnWrite();
                euyp euypVar = (euyp) euyoVar2.instance;
                euyp euypVar2 = euyp.a;
                euypVar.b |= 4;
                euypVar.e = fFloatValue;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (!e().isEmpty()) {
            List listE = e();
            euyoVar.copyOnWrite();
            euyp euypVar = (euyp) euyoVar.instance;
            evtg evtgVar = euypVar.f;
            if (!evtgVar.c()) {
                euypVar.f = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(listE, euypVar.f);
        }
        if (!f().isEmpty()) {
            List listF = f();
            euyoVar.copyOnWrite();
            euyp euypVar2 = (euyp) euyoVar.instance;
            evtg evtgVar2 = euypVar2.g;
            if (!evtgVar2.c()) {
                euypVar2.g = evsn.mutableCopy(evtgVar2);
            }
            evpz.addAll(listF, euypVar2.g);
        }
        euzx euzxVar = (euzx) euzy.a.createBuilder();
        euzxVar.copyOnWrite();
        euzy euzyVar = (euzy) euzxVar.instance;
        euzs euzsVar2 = (euzs) euzrVar.build();
        euzsVar2.getClass();
        euzyVar.d = euzsVar2;
        euzyVar.c |= 1;
        euzxVar.copyOnWrite();
        euzy euzyVar2 = (euzy) euzxVar.instance;
        euyp euypVar3 = (euyp) euyoVar.build();
        euypVar3.getClass();
        euzyVar2.e = euypVar3;
        euzyVar2.c |= 2;
        euzy euzyVar3 = (euzy) euzxVar.build();
        erxt erxtVar = (erxt) erxu.a.createBuilder();
        erxtVar.e(euzy.b, euzyVar3);
        return (erxu) erxtVar.build();
    }
}
