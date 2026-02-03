package defpackage;

import j$.time.MonthDay;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agln implements Function {
    final /* synthetic */ MonthDay a;

    public agln(MonthDay monthDay) {
        this.a = monthDay;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bngy bngyVar = (bngy) obj;
        bngyVar.c(aukf.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY);
        bngyVar.e(this.a.toString());
        return bngyVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
