package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahuv implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        btqx btqxVar = (btqx) obj;
        btqxVar.getClass();
        aiaf aiafVar = aiaf.COMPLETE_SUCCESS;
        btqxVar.ap(new dqty("restore_workflow_executions.status", 8, Integer.valueOf(aiafVar == null ? 0 : aiafVar.q)));
        return btqxVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
