package defpackage;

import j$.util.DesugarDate;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caio extends fcyz implements fdat {
    final /* synthetic */ caip a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caio(fcxy fcxyVar, caip caipVar) {
        super(2, fcxyVar);
        this.a = caipVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caio) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cbfd cbfdVarA = cbfi.a();
        cbfdVarA.A("ForwardSyncPauseLatch#isLatched");
        cbeg cbegVar = cbfi.c;
        boolean z = false;
        cbfdVarA.c(cbegVar.e, cbegVar.j);
        final caip caipVar = this.a;
        cbfdVarA.e(new Function() { // from class: cain
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                cbfh cbfhVar = (cbfh) obj2;
                int iIntValue = cbfi.c().intValue();
                if (iIntValue < 41030) {
                    dqru.x("queue", iIntValue);
                }
                caip caipVar2 = caipVar;
                cbfhVar.ap(new dqpj("work_queue.queue", 11, "cms_restore_page%"));
                cbfhVar.e(DesugarDate.from(caipVar2.a.f()));
                return cbfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cbfdVarA.C(new dqxl("MAX(timestamp,minimum_start_time) DESC", new Object[0]));
        cbfdVarA.y(1);
        dqqj dqqjVarP = cbfdVarA.b().p();
        try {
            cbei cbeiVar = (cbei) dqqjVarP;
            if (cbeiVar.moveToNext()) {
                long jMax = Math.max(cbeiVar.c(), cbeiVar.g().getTime());
                long epochMilli = caipVar.a.f().toEpochMilli();
                Object objE = caipVar.b.e();
                objE.getClass();
                if (jMax > epochMilli - ((Number) objE).longValue()) {
                    z = true;
                }
            }
            fczl.a(dqqjVarP, null);
            return Boolean.valueOf(z);
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        caio caioVar = new caio(fcxyVar, this.a);
        caioVar.b = obj;
        return caioVar;
    }
}
