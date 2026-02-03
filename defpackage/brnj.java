package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brnj extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new brnd(this);
    }

    public final void b(long j) {
        ap(new dqty("p2p_suggestions.generated_timestamp", 9, Long.valueOf(j)));
    }

    public final void c(String str) {
        ap(new dqpj("p2p_suggestions._id", 1, str));
    }

    public final void d(Iterable iterable) {
        ap(new dqpm("p2p_suggestions._id", 3, as(iterable), false));
    }

    public final void e(ezan ezanVar) {
        ap(new dqty("p2p_suggestions.smart_suggestion_type", 1, Integer.valueOf(ezanVar == null ? 0 : ezanVar.a())));
    }

    public final void f(Iterable iterable) {
        ap(new dqpm("p2p_suggestions.smart_suggestion_type", 3, as((Iterable) ekpo.a(iterable).map(new Function() { // from class: brne
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((ezan) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new brng()))), true));
    }

    public final void g(MessageIdType messageIdType) {
        ap(new dqpj("p2p_suggestions.target_message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }

    public final void h(dqxe dqxeVar) {
        ap(new dqpk("p2p_suggestions.target_message_id", 3, dqxeVar));
    }
}
