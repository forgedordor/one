package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bypf implements Function {
    final /* synthetic */ long a;

    public bypf(long j) {
        this.a = j;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bmsn bmsnVar = (bmsn) obj;
        bmsnVar.ap(new dqty("cms_deleted_messages_buffer.deletion_timestamp", 8, Long.valueOf(this.a)));
        return bmsnVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
