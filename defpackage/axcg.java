package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcg extends fcyz implements fdat {
    final /* synthetic */ axcl a;
    final /* synthetic */ axcm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axcg(fcxy fcxyVar, axcl axclVar, axcm axcmVar) {
        super(2, fcxyVar);
        this.a = axclVar;
        this.b = axcmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axcg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        axav axavVarB = axcb.b("MyIdentityTablesOperations#getMyIdentityForToken");
        final axcm axcmVar = this.b;
        axavVarB.c(new Function() { // from class: axbe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                axax axaxVar = (axax) obj2;
                eksp ekspVar = axcl.a;
                axaxVar.ap(new dqpj("my_identities.token", 1, axcn.b(axcmVar)));
                return axaxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb<awzp> ekgbVarZ = axavVarB.b().z();
        if (ekgbVarZ.size() > 1) {
            throw new IllegalStateException("there are " + ekgbVarZ.size() + " identities for token " + axcmVar.b);
        }
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        for (awzp awzpVar : ekgbVarZ) {
            axcl axclVar = this.a;
            awzpVar.getClass();
            arrayList.add(axclVar.k(awzpVar));
        }
        awxn awxnVar = (awxn) fcva.Y(arrayList);
        if (awxnVar != null) {
            return awxnVar;
        }
        Objects.toString(axcmVar);
        throw new IllegalArgumentException("No MyIdentity found for token ".concat(String.valueOf(axcmVar)));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axcg axcgVar = new axcg(fcxyVar, this.a, this.b);
        axcgVar.c = obj;
        return axcgVar;
    }
}
