package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class asts {
    public static final /* synthetic */ int b = 0;

    static {
        cdag.f(cdag.b, "tachygram_rcs_capability_validity_expiry", 86400000L);
        cdag.f(cdag.b, "tachygram_non_rcs_capability_validity_expiry", 600000L);
    }

    public static asts d() {
        return e(Instant.EPOCH);
    }

    public static asts e(Instant instant) {
        aste asteVar = new aste();
        asteVar.c(asva.a);
        asteVar.b(instant);
        return asteVar.a();
    }

    public abstract asva a();

    public abstract Instant b();

    public boolean c() {
        throw null;
    }

    public final String toString() {
        return String.format("RcsCapabilitiesWithMetadata {timestamp: %s, capabilities: %s}", b(), (String) Collection.EL.stream(a().b).map(new Function() { // from class: astq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                asvc asvcVar = (asvc) obj;
                int i = asts.b;
                return asvcVar.c + "=" + asvcVar.d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(";")));
    }
}
