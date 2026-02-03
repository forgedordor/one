package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clgb {
    public static final basd a(eyga eygaVar) {
        eygaVar.getClass();
        if (b(eygaVar).k()) {
            return b(eygaVar);
        }
        Optional optionalA = civb.a(eygaVar, civa.REPLIES_NAMESPACE, "In-Reply-To-Message-Id");
        final clga clgaVar = clga.a;
        Object objOrElse = optionalA.map(new Function() { // from class: clfz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return clgaVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(basd.a);
        objOrElse.getClass();
        return (basd) objOrElse;
    }

    public static final basd b(eyga eygaVar) {
        civa civaVar = civa.GSMA_RCS_NAMESPACE;
        return fdbq.f("Reply", (String) fdct.b(civb.a(eygaVar, civaVar, "Reference-Type"))) ? basd.a((String) fdct.b(civb.a(eygaVar, civaVar, "Reference-ID"))) : basd.a;
    }
}
