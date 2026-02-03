package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crlm extends fcyz implements fdat {
    final /* synthetic */ crln a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crlm(crln crlnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crlnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crlm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        long epochMilli = this.a.c.f().toEpochMilli();
        Object objE = crln.a.e();
        objE.getClass();
        final long jLongValue = epochMilli - ((Number) objE).longValue();
        brna brnaVarA = brnk.a();
        brnaVarA.A("isSmartsHatsEligible");
        brnaVarA.d(new Function() { // from class: crll
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brnj brnjVar = (brnj) obj2;
                brnjVar.b(jLongValue);
                ezai ezaiVar = ezai.CLICKED;
                brnjVar.ap(new dqty("p2p_suggestions.suggestion_status", 1, Integer.valueOf(ezaiVar == null ? 0 : ezaiVar.a())));
                return brnjVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return Boolean.valueOf(brnaVarA.b().h() >= ((Number) crln.b.e()).intValue());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crlm(this.a, fcxyVar);
    }
}
