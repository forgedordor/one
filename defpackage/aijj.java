package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aijj extends fcyz implements fdat {
    int a;
    final /* synthetic */ aijk b;
    final /* synthetic */ Intent c;
    final /* synthetic */ cldb d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aijj(aijk aijkVar, Intent intent, cldb cldbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aijkVar;
        this.c = intent;
        this.d = cldbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aijj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdjx fdjxVar = (fdjx) this.e;
        aijk aijkVar = this.b;
        Intent intent = this.c;
        cldb cldbVar = this.d;
        List<aijx> list = aijkVar.a;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (aijx aijxVar : list) {
            arrayList.add(fdin.b(fdjxVar, eicg.a(fcyi.a), fdjz.a, new aiji(null, aijxVar, intent, cldbVar)));
        }
        this.a = 1;
        Object objA = fdii.a(arrayList, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aijj aijjVar = new aijj(this.b, this.c, this.d, fcxyVar);
        aijjVar.e = obj;
        return aijjVar;
    }
}
