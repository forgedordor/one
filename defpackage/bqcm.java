package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqcm extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bqci(this);
    }

    public final void b(ezah ezahVar) {
        ap(new dqty("message_classifications_table.classification_type", 1, Integer.valueOf(ezahVar == null ? 0 : ezahVar.a())));
    }

    public final void c(ezah... ezahVarArr) {
        ap(new dqpm("message_classifications_table.classification_type", 3, as((Iterable) DesugarArrays.stream(ezahVarArr).map(new Function() { // from class: bqcj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((ezah) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new bqck()))), true));
    }

    public final void d(MessageIdType messageIdType) {
        ap(new dqpj("message_classifications_table.message_id", 1, Long.valueOf(bary.a(messageIdType))));
    }
}
