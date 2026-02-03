package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxf extends aivg {
    public final ckwv a;

    public ckxf(fcsu fcsuVar, ckwz ckwzVar, Executor executor, ckwv ckwvVar) {
        super(fcsuVar, ckwzVar, executor);
        this.a = ckwvVar;
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: ckxd
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                embq embqVar = (embq) obj;
                embu embuVar = (embu) obj2;
                embqVar.copyOnWrite();
                emby embyVar = (emby) embqVar.instance;
                emby embyVar2 = emby.a;
                embuVar.getClass();
                embyVar.c = embuVar;
                embyVar.b = 1;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }
}
