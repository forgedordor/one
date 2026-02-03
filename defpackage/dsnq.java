package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsnq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsoa b;
    final /* synthetic */ ethn c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnq(dsoa dsoaVar, ethn ethnVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsoaVar;
        this.c = ethnVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsnq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ListenableFuture listenableFutureA;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                final dsoa dsoaVar = this.b;
                ethn ethnVar = this.c;
                final String str = this.d;
                evtg<ethk> evtgVar = ethnVar.b;
                evtgVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (final ethk ethkVar : evtgVar) {
                    etnj etnjVar = ethkVar.f;
                    if (etnjVar == null) {
                        etnjVar = etnj.a;
                    }
                    etni etniVarB = etni.b(etnjVar.e);
                    if (etniVarB == null) {
                        etniVarB = etni.UITYPE_NONE;
                    }
                    if (etniVarB != etni.UITYPE_GNP_CUSTOM_UI) {
                        ethkVar.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Map map = dsoaVar.f;
                        etnj etnjVar2 = ethkVar.f;
                        if (etnjVar2 == null) {
                            etnjVar2 = etnj.a;
                        }
                        etni etniVarB2 = etni.b(etnjVar2.e);
                        if (etniVarB2 == null) {
                            etniVarB2 = etni.UITYPE_NONE;
                        }
                        fcsu fcsuVar = (fcsu) map.get(etniVarB2);
                        if (fcsuVar != null) {
                            dsqa dsqaVar = (dsqa) fcsuVar.b();
                            etnj etnjVar3 = ethkVar.f;
                            if (etnjVar3 == null) {
                                etnjVar3 = etnj.a;
                            }
                            arrayList2.addAll(dsqaVar.a(etnjVar3.c == 2 ? (etly) etnjVar3.d : etly.a));
                            dsqa dsqaVar2 = (dsqa) fcsuVar.b();
                            etnj etnjVar4 = ethkVar.f;
                            if (etnjVar4 == null) {
                                etnjVar4 = etnj.a;
                            }
                            etly etlyVar = (etnjVar4.c == 6 ? (etna) etnjVar4.d : etna.a).d;
                            if (etlyVar == null) {
                                etlyVar = etly.a;
                            }
                            arrayList2.addAll(dsqaVar2.a(etlyVar));
                        }
                        listenableFutureA = eork.c(arrayList2).a(new Callable() { // from class: dsnj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                eksp ekspVar = dsoa.a;
                                return ethkVar;
                            }
                        }, eoqg.a);
                    } else {
                        listenableFutureA = null;
                    }
                    if (listenableFutureA != null) {
                        arrayList.add(listenableFutureA);
                    }
                }
                ListenableFuture listenableFutureG = eooq.g(eork.o(arrayList), eiid.d(new eooz() { // from class: dsnl
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final List list = (List) obj2;
                        list.getClass();
                        final String str2 = str;
                        String strA = dxuz.a(str2);
                        List listAe = fcva.ae(list);
                        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(listAe, 10)), 16));
                        Iterator it = listAe.iterator();
                        while (true) {
                            dsoa dsoaVar2 = dsoaVar;
                            if (!it.hasNext()) {
                                return eooq.g(((dski) dsoaVar2.c.a(str2)).b(linkedHashMap), eiid.d(new eooz() { // from class: dsnk
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        dsoa.a.o().I("%s promos replaced with %s promos for account: %s", (Integer) obj3, Integer.valueOf(list.size()), str2);
                                        return eorv.a;
                                    }
                                }), eoqg.a);
                            }
                            Object next = it.next();
                            ((ecoe) ((dxtx) dsoaVar2.i.b()).q.get()).a(dsoaVar2.e, strA);
                            linkedHashMap.put(dskj.a((ethk) next), next);
                        }
                    }
                }), eoqg.a);
                this.a = 1;
                if (fdxs.c(listenableFutureG, this) == fcylVar) {
                    return fcylVar;
                }
            }
            return new dxfx(fctx.a);
        } catch (Exception e) {
            return new dxfq(e, 21);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsnq(this.b, this.c, this.d, fcxyVar);
    }
}
