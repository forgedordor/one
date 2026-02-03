package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwnm extends fcyz implements fdat {
    final /* synthetic */ bwnn a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwnm(bwnn bwnnVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bwnnVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwnm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = bsmv.a;
        bsmj bsmjVar = new bsmj();
        bsmjVar.f("removeOldPendingFtdMessages");
        final long j = this.b;
        bsmjVar.a(new Function() { // from class: bwnr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsmu bsmuVar = (bsmu) obj2;
                bsmuVar.b(bvdv.FAILED_TO_DECRYPT);
                bsmuVar.ap(new dqty("pending_incoming_message_rcs_table.received_timestamp", 8, Long.valueOf(j)));
                return bsmuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iD = bsmjVar.d();
        cqbd cqbdVarC = bwnt.a.c();
        cqbdVarC.I("Removed old pending messages.");
        cqbdVarC.y("count", iD);
        cqbdVarC.r();
        return new Integer(iD);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bwnm(this.a, this.b, fcxyVar);
    }
}
