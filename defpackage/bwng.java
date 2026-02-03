package defpackage;

import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwng extends fcyz implements fdat {
    final /* synthetic */ bwnn a;
    final /* synthetic */ Instant b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwng(bwnn bwnnVar, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bwnnVar;
        this.b = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwng) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final Instant instant = this.b;
        instant.getClass();
        cqbd cqbdVarA = bwov.a.a();
        cqbdVarA.I("delete");
        cqbdVarA.A("cutoff", instant);
        cqbdVarA.r();
        String[] strArr = bsmv.a;
        bsmj bsmjVar = new bsmj();
        bsmjVar.f("deleteSavedDecryptResultOlderThan");
        bsmjVar.a(new Function() { // from class: bwos
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsmu bsmuVar = (bsmu) obj2;
                bsmuVar.ap(new dqty("pending_incoming_message_rcs_table.received_timestamp", 10, Long.valueOf(instant.toEpochMilli())));
                bsmuVar.b(bvdv.DECRYPTED);
                return bsmuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return new Integer(bsmjVar.d());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwng(this.a, this.b, fcxyVar);
    }
}
