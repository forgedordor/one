package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahvl implements Function {
    public static final ahvl a = new ahvl();

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        btsm btsmVar = (btsm) obj;
        btsmVar.b(btsp.b);
        btso btsoVar = btso.b;
        btsmVar.ap(new dqty("restore_workflow_files.status", 2, Integer.valueOf(btsoVar == null ? 0 : btsoVar.ordinal())));
        return btsmVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
