package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cucu extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cucv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cucu(cucv cucvVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = cucvVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cucu cucuVar = new cucu(this.d, (fcxy) obj4);
        cucuVar.a = (aoer) obj;
        cucuVar.b = (ekgb) obj2;
        cucuVar.c = (cudx) obj3;
        return cucuVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [aoer, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cueh cuehVar;
        fctl.b(obj);
        final ?? r12 = this.a;
        ?? r0 = this.b;
        Object obj2 = this.c;
        if (r12 != 0) {
            final ekgb ekgbVar = (ekgb) r0;
            if (ekgbVar.size() >= 2 && ((cuehVar = ((cudx) obj2).d) == cueh.a || cuehVar == cueh.b || cuehVar == cueh.c)) {
                final cucv cucvVar = this.d;
                asgz asgzVar = cucvVar.d;
                dlbt dlbtVar = null;
                dlcn dlcnVar = asgzVar.a() ? null : new dlcn(new dlco(cucv.d(r12), r12.q(), new fdae() { // from class: cucs
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        final ekgb ekgbVar2 = ekgbVar;
                        ekgbVar2.getClass();
                        final fduf fdufVarA = fdvf.a(r12);
                        final cucv cucvVar2 = cucvVar;
                        cucvVar2.c.d(false, new fdap() { // from class: cucp
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                ahat ahatVar = (ahat) obj3;
                                ahatVar.getClass();
                                cucv cucvVar3 = cucvVar2;
                                ekgb ekgbVar3 = ekgbVar2;
                                fduf fdufVar = fdufVarA;
                                auvw.k(cucvVar3.a, null, null, new cucr(fdufVar, ahatVar, cucvVar3, ekgbVar3, null), 3);
                                return cucvVar3.b(ekgbVar3, (aoer) fdufVar.c(), ahatVar, fdufVar);
                            }
                        });
                        return fctx.a;
                    }
                }));
                if (asgzVar.a()) {
                    String strB = r12.h().b();
                    r0.getClass();
                    ArrayList arrayList = new ArrayList(fcva.p((Iterable) r0, 10));
                    for (aoer aoerVar : r0) {
                        String strB2 = aoerVar.h().b();
                        aoerVar.getClass();
                        arrayList.add(new dlbu(strB2, cucv.d(aoerVar), aoerVar.q(), cucvVar.c(aoerVar)));
                    }
                    dlbtVar = new dlbt(strB, arrayList, new fdap() { // from class: cuct
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            String str = (String) obj3;
                            for (aoer aoerVar2 : ekgbVar) {
                                if (fdbq.f(aoerVar2.h().b(), str)) {
                                    cucvVar.b.d(aoerVar2);
                                    return fctx.a;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }, new dlbs(asgzVar.a()));
                }
                return new cucx(true, dlcnVar, dlbtVar, new cucw(asgzVar.a()));
            }
        }
        return new cucx();
    }
}
