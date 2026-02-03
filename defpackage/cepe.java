package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cepe {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;

    public cepe(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    public final Object a(ezol ezolVar, fdat fdatVar) throws IOException {
        eieu eieuVarH = eiiy.h("GrpcProxyFactory#create");
        try {
            dggl dgglVar = (dggl) this.b.b();
            String str = ezolVar.c;
            str.getClass();
            ceog ceogVarA = ((cepu) this.a.b()).a(dgglVar.a(str));
            final cepb cepbVar = (cepb) this.c.b();
            fbqm fbqmVar = (fbqm) Map.EL.computeIfAbsent(cepbVar.o, ceogVarA, new Function() { // from class: ceoz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cepbVar.c(((ceog) obj).b);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            fbrg fbrgVarE = cepbVar.e();
            fbqmVar.getClass();
            Object objA = fdatVar.a(fbqmVar, fbrgVarE);
            fczl.a(eieuVarH, null);
            return objA;
        } finally {
        }
    }
}
