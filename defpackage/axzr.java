package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzr extends fcyz implements fdat {
    int a;
    final /* synthetic */ aybe b;
    final /* synthetic */ baqv c;
    final /* synthetic */ axzs d;
    final /* synthetic */ emum e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axzr(fcxy fcxyVar, aybe aybeVar, baqv baqvVar, axzs axzsVar, emum emumVar) {
        super(2, fcxyVar);
        this.b = aybeVar;
        this.c = baqvVar;
        this.d = axzsVar;
        this.e = emumVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axzr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aybe aybeVar = this.b;
        cqce cqceVar = aybe.a;
        awgi awgiVar = (awgi) aybeVar.D.b();
        baqv baqvVar = this.c;
        axzs axzsVar = this.d;
        ekgb ekgbVar = axzsVar.b;
        ConversationIdType conversationIdTypeA = baqvVar.a();
        boolean zB = baqvVar.b();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((alqm) it.next()).n());
        }
        eiju eijuVarA = awgiVar.a(conversationIdTypeA, zB, axzsVar.a, ekfv.a(fcva.ae(arrayList)), this.e);
        eijuVarA.getClass();
        this.a = 1;
        Object objC = fdxs.c(eijuVarA, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axzr axzrVar = new axzr(fcxyVar, this.b, this.c, this.d, this.e);
        axzrVar.f = obj;
        return axzrVar;
    }
}
