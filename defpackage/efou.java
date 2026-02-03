package defpackage;

import com.google.android.rcs.client.messaging.data.GroupEvent;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efou implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjhs apply(GroupEvent groupEvent) {
        cjhr cjhrVar = (cjhr) cjhs.a.createBuilder();
        b(groupEvent, cjhrVar);
        return (cjhs) cjhrVar.build();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(GroupEvent groupEvent, cjhr cjhrVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
