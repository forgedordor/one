package defpackage;

import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atkj {
    public static final List a(final athh athhVar) {
        athhVar.getClass();
        atms atmsVarA = atmx.a();
        atmsVarA.A("getAllBindData");
        atmsVarA.k(new atmv((atmw) new Function() { // from class: atki
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                atmw atmwVar = (atmw) obj;
                atmwVar.c(athhVar);
                return atmwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new atmw())));
        ekgb ekgbVarZ = atmsVarA.b().z();
        if (ekgbVarZ.size() <= 2) {
            ekgbVarZ.getClass();
            return ekgbVarZ;
        }
        Objects.toString(athhVar);
        throw new IllegalStateException("FileProcessingTable has more than two entries (file and thumbnail) for processingId: ".concat(athhVar.toString()));
    }

    public static final atlg b(List list, atmy atmyVar) {
        Object next;
        atmyVar.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((atlg) next).e().equals(atmyVar)) {
                break;
            }
        }
        return (atlg) next;
    }

    public static final cbtf c(athh athhVar, atmy atmyVar) {
        atmyVar.getClass();
        atlg atlgVarB = b(a(athhVar), atmyVar);
        if (atlgVarB == null) {
            return null;
        }
        if (atlgVarB.n() != null) {
            eyfn eyfnVarN = atlgVarB.n();
            eyfnVarN.getClass();
            return new cbte(eyfnVarN);
        }
        if (atlgVarB.m() == null) {
            return null;
        }
        epwc epwcVarM = atlgVarB.m();
        epwcVarM.getClass();
        return new cbtd(epwcVarM);
    }

    public static final eyfn d(athh athhVar, atmy atmyVar) {
        atmyVar.getClass();
        atlg atlgVarB = b(a(athhVar), atmyVar);
        if (atlgVarB != null) {
            return atlgVarB.n();
        }
        return null;
    }
}
