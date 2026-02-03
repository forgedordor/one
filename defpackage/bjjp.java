package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjjp extends dqws {
    public bjjp(String[] strArr) {
        super("messages", strArr, null, "%TIMESTAMP_COLUMN_VAL% %ORDER_DIRECTION%, messages._id %ORDER_DIRECTION%", "messages.conversation_id=%CONVERSATION_ID% AND %EXCLUDE_DRAFTS% AND messages.is_hidden <> 1  AND messages.message_status <> 16", "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bjjn b() {
        l();
        return new bjjn(this.a.a());
    }

    public final void c(bjjm... bjjmVarArr) {
        D((String) DesugarArrays.stream(bjjmVarArr).map(new Function() { // from class: bjjo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bjjm) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        String[] strArr = bjju.a;
        k(new bjjq((bjjt) function.apply(new bjjt())));
    }
}
