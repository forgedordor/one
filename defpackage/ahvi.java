package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahvi implements Function {
    final /* synthetic */ UUID a;

    public ahvi(UUID uuid) {
        this.a = uuid;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        btqx btqxVar = (btqx) obj;
        btqxVar.b(Optional.of(this.a));
        return btqxVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
