package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aieq implements aivh {
    public static long d(Instant instant) {
        return Duration.ofHours(instant.atZone(ZoneId.systemDefault()).getHour()).toMillis();
    }

    @Override // defpackage.aivh
    public final ellf a() {
        return ellf.SCHEDULED_SEND_EVENT;
    }

    @Override // defpackage.aivh
    public final BiConsumer b() {
        return new BiConsumer() { // from class: aieo
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ellg ellgVar = (ellg) obj;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                enhk enhkVar = (enhk) ((enhj) obj2).build();
                ellh ellhVar2 = ellh.a;
                enhkVar.getClass();
                ellhVar.aE = enhkVar;
                ellhVar.e |= 128;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.aivh
    public final Supplier c() {
        return new Supplier() { // from class: aiep
            @Override // java.util.function.Supplier
            public final Object get() {
                return (enhj) enhk.a.createBuilder();
            }
        };
    }
}
