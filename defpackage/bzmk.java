package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmk extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzmo b;
    final /* synthetic */ Throwable c;
    final /* synthetic */ bzmu d;
    final /* synthetic */ bzmt e;
    final /* synthetic */ bzmx[] f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmk(fcxy fcxyVar, bzmo bzmoVar, Throwable th, bzmu bzmuVar, bzmt bzmtVar, bzmx[] bzmxVarArr) {
        super(2, fcxyVar);
        this.b = bzmoVar;
        this.c = th;
        this.d = bzmuVar;
        this.e = bzmtVar;
        this.f = bzmxVarArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        arrayList.add(this.d);
        arrayList.add(this.e);
        fdcl.a(this.f, arrayList);
        bzmx[] bzmxVarArr = (bzmx[]) arrayList.toArray(new bzmx[arrayList.size()]);
        this.a = 1;
        Object objA = bzmoVar.a(bzmxVarArr, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzmk bzmkVar = new bzmk(fcxyVar, this.b, this.c, this.d, this.e, this.f);
        bzmkVar.g = obj;
        return bzmkVar;
    }
}
