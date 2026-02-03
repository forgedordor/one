package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxc extends aivg {
    public final ckwv a;

    public ckxc(fcsu fcsuVar, ckwz ckwzVar, Executor executor, ckwv ckwvVar) {
        super(fcsuVar, ckwzVar, executor);
        this.a = ckwvVar;
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: ckxa
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                embq embqVar = (embq) obj;
                embs embsVar = (embs) obj2;
                embqVar.copyOnWrite();
                emby embyVar = (emby) embqVar.instance;
                emby embyVar2 = emby.a;
                embsVar.getClass();
                embyVar.c = embsVar;
                embyVar.b = 2;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
