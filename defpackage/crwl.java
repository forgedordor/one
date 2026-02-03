package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crwl extends fcyz implements fdat {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crwl(long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crwl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bmhw.a;
        bmhm bmhmVar = new bmhm();
        bmhmVar.f("A2pConversationSubscriptionsDatabaseOperations#deleteSubscription");
        final long j = this.a;
        bmhmVar.b = new bmhu((bmhv) new Function() { // from class: crwk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bmhv bmhvVar = (bmhv) obj2;
                bmhvVar.b(j);
                return bmhvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bmhv()));
        return new Integer(bmhmVar.d());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crwl(this.a, fcxyVar);
    }
}
