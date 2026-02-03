package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsmu extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bsmr(this);
    }

    public final void b(bvdv bvdvVar) {
        ap(new dqty("pending_incoming_message_rcs_table.message_status", 1, Integer.valueOf(bvdvVar == null ? 0 : bvdvVar.ordinal())));
    }

    public final void c(bvdv... bvdvVarArr) {
        ap(new dqpm("pending_incoming_message_rcs_table.message_status", 3, as((Iterable) DesugarArrays.stream(bvdvVarArr).map(new Function() { // from class: bsmt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((bvdv) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bsms
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }))), true));
    }

    public final void d(basd basdVar) {
        ap(new dqpj("pending_incoming_message_rcs_table.rcs_message_id", 1, basd.d(basdVar)));
    }

    public final void e(String str) {
        ap(new dqpj("pending_incoming_message_rcs_table.remote_user_id", 1, String.valueOf(str)));
    }
}
