package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sup extends fcyz implements fdat {
    int a;
    final /* synthetic */ sux b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sup(fcxy fcxyVar, sux suxVar) {
        super(2, fcxyVar);
        this.b = suxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sup) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fctl.b(obj);
            return obj;
        }
        fctl.b(obj);
        this.c = this;
        this.a = 1;
        fdiu fdiuVar = new fdiu(fcym.c(this), 1);
        fdiuVar.B();
        sux suxVar = this.b;
        Optional optional = (Optional) suxVar.c.b();
        final suq suqVar = new suq(suxVar, fdiuVar);
        optional.ifPresentOrElse(new Consumer() { // from class: suv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final /* synthetic */ void z(Object obj2) {
                suqVar.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new sur(fdiuVar));
        Object objM = fdiuVar.m();
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        sup supVar = new sup(fcxyVar, this.b);
        supVar.c = obj;
        return supVar;
    }
}
