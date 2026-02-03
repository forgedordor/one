package defpackage;

import j$.time.Instant;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccny implements ccnp {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;

    public ccny(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    public final void a(String str, String str2, epsl epslVar, int i) {
        Instant instantA = ((coha) this.a.b()).a();
        evtg<epsi> evtgVar = epslVar.b;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
        for (epsi epsiVar : evtgVar) {
            String[] strArr = ccen.a;
            ccdf ccdfVar = new ccdf();
            ccdfVar.f(str2);
            ccdfVar.e(str);
            ccdfVar.d(epsiVar.c);
            ccdfVar.c(epsiVar.d.I());
            ccdfVar.b(instantA);
            arrayList.add(ccdfVar.a());
        }
        ccdc[] ccdcVarArr = (ccdc[]) arrayList.toArray(new ccdc[0]);
        if (i == 1) {
            dqru.B(ccen.a(), 3, false, new BiConsumer() { // from class: ccdb
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String[] strArr2 = ccen.a;
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            }, (ccdc[]) Arrays.copyOf(ccdcVarArr, ccdcVarArr.length));
            return;
        }
        for (final ccdc ccdcVar : ccdcVarArr) {
            String[] strArr2 = ccen.a;
            ccek ccekVar = new ccek();
            ccekVar.ap("updateEpochRecord");
            ccekVar.af(new ccel((ccem) new Function() { // from class: ccnt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ccdc ccdcVar2 = ccdcVar;
                    ccem ccemVar = (ccem) obj;
                    ccdcVar2.aA(0, "identity_id");
                    ccemVar.d(ccdcVar2.a);
                    ccemVar.c(ccdcVar2.n());
                    ccemVar.b(ccdcVar2.k());
                    return ccemVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new ccem())));
            ccekVar.a.put("epoch_data", ccdcVar.o());
            if (ccekVar.b().e() == 0) {
                String strN = ccdcVar.n();
                strN.getClass();
                throw new ccnn(strN, ccdcVar.k());
            }
        }
    }
}
