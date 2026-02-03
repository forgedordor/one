package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aivm extends aivg {
    public aivm(fcsu fcsuVar, aiwc aiwcVar, Executor executor) {
        super(fcsuVar, aiwcVar, executor);
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: aivk
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                elna elnaVar = (elna) obj;
                emxv emxvVar = (emxv) obj2;
                elnaVar.copyOnWrite();
                elnb elnbVar = (elnb) elnaVar.instance;
                elnb elnbVar2 = elnb.a;
                emxvVar.getClass();
                elnbVar.c = emxvVar;
                elnbVar.b = 9;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
