package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avfh extends fcyz implements fdat {
    int a;
    final /* synthetic */ avgc b;
    final /* synthetic */ ehvv c;
    final /* synthetic */ List d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avfh(fcxy fcxyVar, avgc avgcVar, ehvv ehvvVar, List list) {
        super(2, fcxyVar);
        this.b = avgcVar;
        this.c = ehvvVar;
        this.d = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avfh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List list;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            avgc avgcVar = this.b;
            ehvv ehvvVar = this.c;
            avef avefVar = avef.a;
            this.a = 1;
            obj = avgcVar.x(ehvvVar, avefVar, this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            list = (List) this.e;
            fctl.b(obj);
            return fcva.ah(list, (List) obj);
        }
        fctl.b(obj);
        avgc avgcVar2 = this.b;
        List list2 = (List) obj;
        if (!((Boolean) avgcVar2.g.b()).booleanValue()) {
            return list2;
        }
        List list3 = this.d;
        avef avefVar2 = avef.b;
        ehvv ehvvVarF = avgc.F(list3, avefVar2);
        this.e = list2;
        this.a = 2;
        Object objX = avgcVar2.x(ehvvVarF, avefVar2, this);
        if (objX != fcylVar) {
            list = list2;
            obj = objX;
            return fcva.ah(list, (List) obj);
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avfh avfhVar = new avfh(fcxyVar, this.b, this.c, this.d);
        avfhVar.e = obj;
        return avfhVar;
    }
}
