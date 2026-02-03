package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiwo extends aivg {
    public aiwo(fcsu fcsuVar, aiwc aiwcVar, Executor executor) {
        super(fcsuVar, aiwcVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aiwm
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                elna elnaVar = (elna) obj;
                emzh emzhVar = (emzh) obj2;
                elnaVar.copyOnWrite();
                elnb elnbVar = (elnb) elnaVar.instance;
                elnb elnbVar2 = elnb.a;
                emzhVar.getClass();
                elnbVar.c = emzhVar;
                elnbVar.b = 8;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
