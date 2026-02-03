package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aivs extends aivg {
    public aivs(fcsu fcsuVar, aiwc aiwcVar, Executor executor) {
        super(fcsuVar, aiwcVar, executor);
    }

    public static int b(int i) {
        if (i <= 0) {
            return 2;
        }
        return i == 1 ? 3 : 4;
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aivq
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                elna elnaVar = (elna) obj;
                emyc emycVar = (emyc) obj2;
                elnaVar.copyOnWrite();
                elnb elnbVar = (elnb) elnaVar.instance;
                elnb elnbVar2 = elnb.a;
                emycVar.getClass();
                elnbVar.c = emycVar;
                elnbVar.b = 13;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
