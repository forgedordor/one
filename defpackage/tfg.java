package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfg implements Function {
    final /* synthetic */ brdp a;
    final /* synthetic */ Instant b;

    public tfg(brdp brdpVar, Instant instant) {
        this.a = brdpVar;
        this.b = instant;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        brnj brnjVar = (brnj) obj;
        ekgb ekgbVarG = this.a.g();
        ekfw ekfwVar = new ekfw();
        ekqh it = ekgbVarG.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(bary.a((MessageIdType) it.next())));
        }
        brnjVar.ap(new dqpm("p2p_suggestions.target_message_id", 3, brnj.as(ekfwVar.g()), true));
        brnjVar.ap(new dqty("p2p_suggestions.generated_timestamp", 7, Long.valueOf(this.b.toEpochMilli())));
        return brnjVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
