package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzhm implements dzgw {
    final /* synthetic */ dzhn a;
    final /* synthetic */ int b;

    public dzhm(dzhn dzhnVar, int i) {
        this.b = i;
        this.a = dzhnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzgw
    public final boolean a(dzgh dzghVar) {
        dzhn dzhnVar = this.a;
        int i = 0;
        if (!((Boolean) dzhnVar.c.b()).booleanValue()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= ((dzgs) dzghVar.instance).e.size()) {
                i2 = -1;
                break;
            }
            if (((dzgj) ((dzgs) dzghVar.instance).e.get(i2)).b == 3) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            dzghVar.copyOnWrite();
            dzgs dzgsVar = (dzgs) dzghVar.instance;
            dzgsVar.a();
            dzgsVar.e.remove(i2);
        }
        dzgm dzgmVar = (dzgm) dzgp.a.createBuilder();
        int i3 = this.b;
        dzgmVar.copyOnWrite();
        dzgp dzgpVar = (dzgp) dzgmVar.instance;
        dzgpVar.e = i3 - 1;
        dzgpVar.b |= 2;
        evvp evvpVarB = evwz.b(dzhnVar.b.f());
        dzgmVar.copyOnWrite();
        dzgp dzgpVar2 = (dzgp) dzgmVar.instance;
        evvpVarB.getClass();
        dzgpVar2.d = evvpVarB;
        dzgpVar2.b |= 1;
        if (((Boolean) dzhnVar.f.b()).booleanValue()) {
            Stream map = Collection.EL.stream(((eimd) ((ejwt) dzhnVar.a).a).a.a()).map(new eimc());
            int i4 = ekgb.d;
            Collector collector = ekcv.a;
            ekgb ekgbVarA = dzhx.a((List) Collection.EL.stream((ekgb) map.collect(collector)).map(new Function() { // from class: dzhp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return dzhv.b((fejw) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(collector), ((Long) dzhnVar.d.b()).longValue(), ((Long) dzhnVar.e.b()).longValue());
            int size = ekgbVarA.size();
            while (i < size) {
                fejw fejwVar = (fejw) ekgbVarA.get(i);
                fejh fejhVar = (fejh) feji.a.createBuilder();
                fejhVar.copyOnWrite();
                feji fejiVar = (feji) fejhVar.instance;
                fejwVar.getClass();
                fejiVar.d = fejwVar;
                fejiVar.c = 3;
                fejd fejdVar = (fejd) fejg.a.createBuilder();
                fejdVar.copyOnWrite();
                fejg.a((fejg) fejdVar.instance);
                fejg fejgVar = (fejg) fejdVar.build();
                fejhVar.copyOnWrite();
                feji fejiVar2 = (feji) fejhVar.instance;
                fejgVar.getClass();
                fejiVar2.e = fejgVar;
                fejiVar2.b |= 1;
                dzgmVar.a(fejhVar);
                i++;
            }
        } else {
            Stream map2 = Collection.EL.stream(((eimd) ((ejwt) dzhnVar.a).a).a.a()).map(new eimb());
            int i5 = ekgb.d;
            Collector collector2 = ekcv.a;
            ekgb ekgbVarA2 = dzhx.a((List) Collection.EL.stream((ekgb) map2.collect(collector2)).map(new Function() { // from class: dzho
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return dzht.b((fegm) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(collector2), ((Long) dzhnVar.d.b()).longValue(), ((Long) dzhnVar.e.b()).longValue());
            int size2 = ekgbVarA2.size();
            while (i < size2) {
                fegm fegmVar = (fegm) ekgbVarA2.get(i);
                fejh fejhVar2 = (fejh) feji.a.createBuilder();
                fejhVar2.copyOnWrite();
                feji fejiVar3 = (feji) fejhVar2.instance;
                fegmVar.getClass();
                fejiVar3.d = fegmVar;
                fejiVar3.c = 1;
                fejd fejdVar2 = (fejd) fejg.a.createBuilder();
                fejdVar2.copyOnWrite();
                fejg.a((fejg) fejdVar2.instance);
                fejg fejgVar2 = (fejg) fejdVar2.build();
                fejhVar2.copyOnWrite();
                feji fejiVar4 = (feji) fejhVar2.instance;
                fejgVar2.getClass();
                fejiVar4.e = fejgVar2;
                fejiVar4.b |= 1;
                dzgmVar.a(fejhVar2);
                i++;
            }
        }
        dzgi dzgiVar = (dzgi) dzgj.a.createBuilder();
        dzgp dzgpVar3 = (dzgp) dzgmVar.build();
        dzgiVar.copyOnWrite();
        dzgj dzgjVar = (dzgj) dzgiVar.instance;
        dzgpVar3.getClass();
        dzgjVar.c = dzgpVar3;
        dzgjVar.b = 3;
        dzghVar.a(dzgiVar);
        return true;
    }
}
