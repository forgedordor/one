package defpackage;

import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvwl implements celr {
    private final bvwk a;

    public bvwl(bvwk bvwkVar) {
        this.a = bvwkVar;
    }

    @Override // defpackage.celr
    public final void a(ekgb ekgbVar, final String str) {
        ekgbVar.getClass();
        str.getClass();
        bnfb bnfbVarA = bnfe.a();
        bnfbVarA.A("getLookupKeys");
        bnfbVarA.f(new Function() { // from class: bvwp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bnfd bnfdVar = (bnfd) obj;
                bnfdVar.ap(new dqpj("contacts.phone_number", 1, str));
                return bnfdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = bnfbVarA.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((bncf) it.next()).m());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : ekgbVar) {
            if (!((evqs) obj).H()) {
                arrayList2.add(obj);
            }
        }
        bvwk bvwkVar = this.a;
        bvxa bvxaVar = (bvxa) bvxd.a.createBuilder();
        bvxaVar.getClass();
        DesugarCollections.unmodifiableList(((bvxd) bvxaVar.instance).e).getClass();
        bvxb bvxbVar = (bvxb) bvxc.a.createBuilder();
        bvxbVar.getClass();
        DesugarCollections.unmodifiableList(((bvxc) bvxbVar.instance).c).getClass();
        bvxf.d(arrayList2, bvxbVar);
        bvxf.b(str, bvxbVar);
        bvxf.e(bvxbVar);
        bvxf.c(arrayList, bvxbVar);
        bvxaVar.a(bvxf.a(bvxbVar));
        bvwkVar.a(bvxe.a(bvxaVar));
    }
}
