package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcj extends fcyz implements fdat {
    final /* synthetic */ axcl a;
    final /* synthetic */ dggk b;
    final /* synthetic */ cmmh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axcj(fcxy fcxyVar, axcl axclVar, dggk dggkVar, cmmh cmmhVar) {
        super(2, fcxyVar);
        this.a = axclVar;
        this.b = dggkVar;
        this.c = cmmhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axcj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cmmh cmmhVar = this.c;
        axcl axclVar = this.a;
        dggk dggkVar = this.b;
        axcm axcmVar = (axcm) axclVar.b.c("MyIdentityTablesOperations#verifyMyIdentity", new axck(cmmhVar, axclVar, dggkVar));
        if (axclVar.c.a() && axcmVar != null) {
            Iterable iterableM = axclVar.m();
            boolean z = false;
            Object obj2 = null;
            for (Object obj3 : iterableM) {
                if (fdbq.f(((awxn) obj3).b(), axcmVar)) {
                    if (z) {
                        throw new IllegalArgumentException("Collection contains more than one matching element.");
                    }
                    z = true;
                    obj2 = obj3;
                }
            }
            if (!z) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            awxn awxnVar = (awxn) obj2;
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : iterableM) {
                awxn awxnVar2 = (awxn) obj4;
                if (awxnVar2.e().isEmpty() && !awxnVar2.b().equals(axcmVar)) {
                    Optional optionalD = awxnVar2.d();
                    optionalD.getClass();
                    if (fdbq.f(fdct.b(optionalD), dggkVar.a)) {
                        arrayList.add(obj4);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                ((eksl) axcl.a.h()).r("Conflating %s MyIdentities with the same address on verified event", arrayList.size());
                axclVar.h(awxnVar, arrayList);
                return axcmVar;
            }
        }
        return axcmVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axcj axcjVar = new axcj(fcxyVar, this.a, this.b, this.c);
        axcjVar.d = obj;
        return axcjVar;
    }
}
