package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anji extends fcyz implements fdat {
    final /* synthetic */ anjk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anji(anjk anjkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = anjkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anji) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("MessageReplyIdsObservableSupplier.getAsync");
        final anjk anjkVar = this.a;
        brdrVarD.y(anjkVar.b);
        brdrVarD.f(new Function() { // from class: anjf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((bran) obj2).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: anjg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.A(false);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String[] strArr = bqmc.a;
        bqlw bqlwVar = new bqlw(bqmc.a);
        bqlwVar.e(new Function() { // from class: anjh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bqmb bqmbVar = (bqmb) obj2;
                bqmbVar.b(anjk.d(anjkVar.a));
                return bqmbVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqlv bqlvVarB = bqlwVar.b();
        bqlj bqljVar = bqmc.c.a;
        bran branVar = MessagesTable.c;
        brao braoVar = branVar.a;
        brdrVarD.H(dqts.i(bqlvVarB, bqljVar, braoVar).g());
        brdrVarD.d(new brdo(branVar.i, false), new brdo(braoVar, false));
        ekgb ekgbVarZ = brdrVarD.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(new CoreBugleMessageId(((MessagesTable.BindData) it.next()).E(), -1L));
        }
        return ekfv.a(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anji(this.a, fcxyVar);
    }
}
