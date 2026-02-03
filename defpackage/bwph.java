package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwph extends fcyz implements fdat {
    int a;
    final /* synthetic */ aoer b;
    final /* synthetic */ bwps c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwph(fcxy fcxyVar, aoer aoerVar, bwps bwpsVar) {
        super(2, fcxyVar);
        this.b = aoerVar;
        this.c = bwpsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwph) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Optional optionalO = this.b.o();
            final bwpj bwpjVar = bwpj.a;
            String str = ((aubq) optionalO.flatMap(new Function() { // from class: bwpr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj2) {
                    return bwpjVar.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElseThrow()).d;
            str.getClass();
            eiju eijuVarE = ((bvut) this.c.d.b()).e(str);
            eijuVarE.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarE, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Boolean bool = (Boolean) obj;
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        fcww fcwwVar = new fcww((byte[]) null);
        if (zBooleanValue) {
            fcwwVar.add(bwus.b);
            if (bwbv.g()) {
                fcwwVar.add(bwus.c);
            }
        } else {
            fcwwVar.add(bwus.a);
        }
        return new E2eeInfo(fcva.a(fcwwVar));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwph bwphVar = new bwph(fcxyVar, this.b, this.c);
        bwphVar.d = obj;
        return bwphVar;
    }
}
