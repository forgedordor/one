package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aivw extends aivg {
    public aivw(fcsu fcsuVar, aiwc aiwcVar, Executor executor) {
        super(fcsuVar, aiwcVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aivu
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                elna elnaVar = (elna) obj;
                emyr emyrVar = (emyr) obj2;
                elnaVar.copyOnWrite();
                elnb elnbVar = (elnb) elnaVar.instance;
                elnb elnbVar2 = elnb.a;
                emyrVar.getClass();
                elnbVar.c = emyrVar;
                elnbVar.b = 3;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(final emza emzaVar, final emyn emynVar) {
        k(new Supplier() { // from class: aivv
            @Override // java.util.function.Supplier
            public final Object get() {
                emyq emyqVar = (emyq) emyr.a.createBuilder();
                emyqVar.copyOnWrite();
                emyr emyrVar = (emyr) emyqVar.instance;
                emza emzaVar2 = emzaVar;
                emzaVar2.getClass();
                emyrVar.c = emzaVar2;
                emyrVar.b |= 1;
                emyqVar.copyOnWrite();
                emyr emyrVar2 = (emyr) emyqVar.instance;
                emyn emynVar2 = emynVar;
                emynVar2.getClass();
                emyrVar2.d = emynVar2;
                emyrVar2.b |= 2;
                emyqVar.copyOnWrite();
                emyr emyrVar3 = (emyr) emyqVar.instance;
                emyrVar3.b |= 4;
                emyrVar3.e = 0;
                emyqVar.copyOnWrite();
                emyr emyrVar4 = (emyr) emyqVar.instance;
                emyrVar4.b |= 8;
                emyrVar4.f = true;
                return (emyr) emyqVar.build();
            }
        });
    }
}
