package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uzh extends fcyz implements fdat {
    final /* synthetic */ uzk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzh(uzk uzkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = uzkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uzh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final fdap fdapVar = new fdap() { // from class: uzf
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ((uzw) obj2).n(2);
                return fctx.a;
            }
        };
        this.a.f.ifPresent(new Consumer() { // from class: uzg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                fdapVar.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new uzh(this.a, fcxyVar);
    }
}
