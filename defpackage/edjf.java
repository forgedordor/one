package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edjf implements eora {
    final /* synthetic */ edhi a;
    final /* synthetic */ edjg b;

    public edjf(edjg edjgVar, edhi edhiVar) {
        this.a = edhiVar;
        this.b = edjgVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        edkn edknVar = new edkn();
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator<E> it = ((etwi) obj).b.iterator();
        while (it.hasNext()) {
            ekfwVar.h(((ettx) it.next()).b);
        }
        edjg edjgVar = this.b;
        edknVar.c(ekfwVar.g());
        edknVar.b(this.a.a());
        edjgVar.g.j(edknVar.a());
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        edjg edjgVar = this.b;
        edhe edheVarA = edjgVar.d.a(th);
        eure eureVarC = this.a.c(th);
        edkn edknVar = new edkn();
        int i = ekgb.d;
        edknVar.c(ekoe.a);
        edknVar.a = ejwi.j(edheVarA);
        edknVar.b(eureVarC);
        edjgVar.g.j(edknVar.a());
    }
}
