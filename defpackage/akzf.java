package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzf extends dqws {
    public akzf(String[] strArr) {
        super("conversations INNER JOIN conversation_to_participants ON (conversation_to_participants.conversation_id=conversations._id) INNER JOIN participants ON (participants._id=conversation_to_participants.participant_id)", strArr, "conversations._id", null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final akzd b() {
        l();
        return new akzd(this.a.a());
    }

    public final void c(akzc... akzcVarArr) {
        D((String) DesugarArrays.stream(akzcVarArr).map(new Function() { // from class: akze
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((akzc) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void d(akzh akzhVar) {
        k(new akzg(akzhVar));
    }

    public final void e(Function function) {
        String[] strArr = akzi.a;
        k(new akzg((akzh) function.apply(new akzh())));
    }
}
