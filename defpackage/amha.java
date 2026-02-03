package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amha extends fcyz implements fdat {
    final /* synthetic */ MessageIdType a;
    final /* synthetic */ amhc b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amha(MessageIdType messageIdType, amhc amhcVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = messageIdType;
        this.b = amhcVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amha) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("refreshDeliveryStatusFromDb");
        brdrVarD.f(new Function() { // from class: amgy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((bran) obj2).k;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final MessageIdType messageIdType = this.a;
        brdrVarD.h(new Function() { // from class: amgz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                brec brecVar = (brec) obj2;
                brecVar.p(messageIdType);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqqj dqqjVarP = brdrVarD.b().p();
        amhc amhcVar = this.b;
        List<amec> list = this.c;
        try {
            brap brapVar = (brap) dqqjVarP;
            if (brapVar.moveToNext()) {
                ajlq ajlqVarA = anea.a(brapVar.i());
                synchronized (list) {
                    for (amec amecVar : list) {
                        ajlqVarA.getClass();
                        amecVar.e(ajlqVarA);
                    }
                }
            }
            fczl.a(dqqjVarP, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amha(this.a, this.b, this.c, fcxyVar);
    }
}
