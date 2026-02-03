package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avfz extends fcyz implements fdat {
    int a;
    final /* synthetic */ avgc b;
    final /* synthetic */ fdap c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avfz(fcxy fcxyVar, avgc avgcVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.b = avgcVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avfz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List list;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            avgc avgcVar = this.b;
            fdap fdapVar = this.c;
            avef avefVar = avef.a;
            Object objInvoke = fdapVar.invoke(avefVar);
            this.a = 1;
            obj = avgcVar.x((ehvv) objInvoke, avefVar, this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            list = (List) this.d;
            fctl.b(obj);
            return fcva.ah(list, (List) obj);
        }
        fctl.b(obj);
        avgc avgcVar2 = this.b;
        List list2 = (List) obj;
        if (!((Boolean) avgcVar2.g.b()).booleanValue()) {
            return list2;
        }
        fdap fdapVar2 = this.c;
        avef avefVar2 = avef.b;
        Object objInvoke2 = fdapVar2.invoke(avefVar2);
        this.d = list2;
        this.a = 2;
        Object objX = avgcVar2.x((ehvv) objInvoke2, avefVar2, this);
        if (objX != fcylVar) {
            list = list2;
            obj = objX;
            return fcva.ah(list, (List) obj);
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avfz avfzVar = new avfz(fcxyVar, this.b, this.c);
        avfzVar.d = obj;
        return avfzVar;
    }
}
