package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aivz extends aivg {
    public aivz(fcsu fcsuVar, aiwc aiwcVar, Executor executor) {
        super(fcsuVar, aiwcVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aivx
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                elna elnaVar = (elna) obj;
                emyw emywVar = (emyw) obj2;
                elnaVar.copyOnWrite();
                elnb elnbVar = (elnb) elnaVar.instance;
                elnb elnbVar2 = elnb.a;
                emywVar.getClass();
                elnbVar.c = emywVar;
                elnbVar.b = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
