package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmj extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzmo b;
    final /* synthetic */ bzmu c;
    final /* synthetic */ bzmq d;
    final /* synthetic */ bzmx[] e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmj(fcxy fcxyVar, bzmo bzmoVar, bzmu bzmuVar, bzmq bzmqVar, bzmx[] bzmxVarArr) {
        super(2, fcxyVar);
        this.b = bzmoVar;
        this.c = bzmuVar;
        this.d = bzmqVar;
        this.e = bzmxVarArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bzmo bzmoVar = this.b;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.c);
        arrayList.add(this.d);
        fdcl.a(this.e, arrayList);
        bzmx[] bzmxVarArr = (bzmx[]) arrayList.toArray(new bzmx[arrayList.size()]);
        this.a = 1;
        Object objA = bzmoVar.a(bzmxVarArr, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzmj bzmjVar = new bzmj(fcxyVar, this.b, this.c, this.d, this.e);
        bzmjVar.f = obj;
        return bzmjVar;
    }
}
