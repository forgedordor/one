package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaql implements aivh {
    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.CUSTODIAN_REPORT;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new BiConsumer() { // from class: aaqk
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ellg ellgVar = (ellg) obj;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                emvm emvmVar = (emvm) ((emvj) obj2).build();
                ellh ellhVar2 = ellh.a;
                emvmVar.getClass();
                ellhVar.at = emvmVar;
                ellhVar.d |= 131072;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: aaqj
            @Override // java.util.function.Supplier
            public final Object get() {
                return (emvj) emvm.a.createBuilder();
            }
        };
    }
}
