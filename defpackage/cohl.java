package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class cohl implements ejvr {
    public final /* synthetic */ coia a;

    @Override // defpackage.ejvr
    public final Object apply(Object obj) {
        List list = (List) obj;
        if (!((eoth) ((aqxf) this.a.f).a.b()).a("bugle.enable_filter_null_message_ids")) {
            return ekgb.n(list);
        }
        Stream streamFilter = Collection.EL.stream(list).filter(new Predicate() { // from class: cohk
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return Objects.nonNull((MessageIdType) obj2);
            }
        });
        int i = ekgb.d;
        return (ekgb) streamFilter.collect(ekcv.a);
    }
}
