package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfd implements Function {
    final /* synthetic */ bngt a;
    final /* synthetic */ Instant b;
    final /* synthetic */ Instant c;

    public tfd(bngt bngtVar, Instant instant, Instant instant2) {
        this.a = bngtVar;
        this.b = instant;
        this.c = instant2;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        botl botlVar = (botl) obj;
        botlVar.u(this.a.f());
        final long epochMilli = this.b.toEpochMilli();
        final long epochMilli2 = this.c.toEpochMilli();
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("conversationsWithIsAtLeastOneOutgoingMessageInTimeframeQuery");
        brdrVarD.f(new Function() { // from class: tev
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((bran) obj2).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: tew
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.aj(1, 25);
                brecVar.ap(new dqwx("messages.sent_timestamp", String.valueOf(epochMilli), String.valueOf(epochMilli2)));
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botlVar.t(brdrVarD.b());
        return botlVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
