package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjqo extends dqws {
    public bjqo(String[] strArr) {
        super("messages LEFT JOIN message_reactions AS b ON (b.message_id=messages._id)", strArr, null, "%TIMESTAMP_COLUMN_VAL% %ORDER_DIRECTION%, messages._id %ORDER_DIRECTION%", "messages.conversation_id=%CONVERSATION_ID% AND %EXCLUDE_DRAFTS% AND messages.message_status <> 16", "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bjqm b() {
        l();
        return new bjqm(this.a.a());
    }

    public final void c(bjql... bjqlVarArr) {
        D((String) DesugarArrays.stream(bjqlVarArr).map(new Function() { // from class: bjqn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bjql) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(Function function) {
        String[] strArr = bjqr.a;
        k(new bjqp((bjqq) function.apply(new bjqq())));
    }
}
