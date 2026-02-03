package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amih extends fcyz implements fdat {
    final /* synthetic */ amii a;
    final /* synthetic */ ajlt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amih(amii amiiVar, ajlt ajltVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = amiiVar;
        this.b = ajltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amih) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Consumer consumer = new Consumer() { // from class: cooi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        coor coorVar = this.a.a;
        ((aimb) coorVar.b.b()).a().j(coorVar.c(this.b, 33, consumer), aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amih(this.a, this.b, fcxyVar);
    }
}
