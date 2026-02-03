package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzge extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Optional c;
    final /* synthetic */ bzgt d;
    final /* synthetic */ bzbz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzge(Optional optional, bzgt bzgtVar, bzbz bzbzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = optional;
        this.d = bzgtVar;
        this.e = bzbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzge) c((Map) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                Map map = (Map) this.b;
                Optional optional = this.c;
                final bzbz bzbzVar = this.e;
                final fdap fdapVar = new fdap() { // from class: bzga
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        int i = bzbzVar.b.e;
                        carg cargVar = (carg) obj2;
                        long jA = cargVar.a.a();
                        carf carfVarA = cargVar.a(i);
                        if (carfVarA != null) {
                            carfVarA.d = jA;
                        }
                        return fctx.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: bzgb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        fdapVar.invoke(obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                bzce bzceVar = this.d.g;
                this.a = 1;
                obj = bzceVar.a(map, bzbzVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return (Map) obj;
        } finally {
            Optional optional2 = this.c;
            final bzbz bzbzVar2 = this.e;
            final fdap fdapVar2 = new fdap() { // from class: bzgc
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    int i = bzbzVar2.b.e;
                    carg cargVar = (carg) obj2;
                    long jA = cargVar.a.a();
                    carf carfVarA = cargVar.a(i);
                    if (carfVarA != null) {
                        carfVarA.e = jA;
                    }
                    return fctx.a;
                }
            };
            optional2.ifPresent(new Consumer() { // from class: bzgd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj2) {
                    fdapVar2.invoke(obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzge bzgeVar = new bzge(this.c, this.d, this.e, fcxyVar);
        bzgeVar.b = obj;
        return bzgeVar;
    }
}
