package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cada extends fcyz implements fdat {
    int a;
    final /* synthetic */ cadc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cada(fcxy fcxyVar, cadc cadcVar) {
        super(2, fcxyVar);
        this.b = cadcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cada) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [cmfo, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cadc cadcVar = this.b;
        final auml aumlVar = auml.DISABLED;
        boolean zBooleanValue = ((Boolean) ((cczi) cqaa.a.get()).e()).booleanValue();
        final aurx aurxVar = cadcVar.a;
        eiju eijuVarH = (zBooleanValue && cpyl.a()) ? aurxVar.e.get().j(new ejvr() { // from class: auqp
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj2).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.l = aumlVar.h;
                aumqVar.b |= 256;
                return builder.build();
            }
        }).h(new ejvr() { // from class: auqq
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                aurx aurxVar2 = aurxVar;
                if (aurxVar2.l.a()) {
                    aurxVar2.k.set(null);
                } else {
                    aurxVar2.m.c(aumlVar);
                }
                aurxVar2.L();
                if (cpyl.a() && ((Boolean) ((cczi) cqaa.a.get()).e()).booleanValue()) {
                    aurxVar2.J();
                }
                return null;
            }
        }, aurxVar.f) : aurxVar.z(new Function() { // from class: auqn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                aumg aumgVar = (aumg) obj2;
                cqce cqceVar = aurx.a;
                aumgVar.copyOnWrite();
                aumq aumqVar = (aumq) aumgVar.instance;
                aumq aumqVar2 = aumq.a;
                aumqVar.l = aumlVar.h;
                aumqVar.b |= 256;
                return aumgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new ejvr() { // from class: auqo
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                aurx aurxVar2 = aurxVar;
                if (aurxVar2.l.a()) {
                    aurxVar2.k.set(null);
                } else {
                    aurxVar2.m.c(aumlVar);
                }
                return null;
            }
        }, aurxVar.f);
        this.a = 1;
        Object objC = fdxs.c(eijuVarH, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cada cadaVar = new cada(fcxyVar, this.b);
        cadaVar.c = obj;
        return cadaVar;
    }
}
