package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzma extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzmf b;
    final /* synthetic */ Throwable c;
    final /* synthetic */ byiv d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzma(fcxy fcxyVar, bzmf bzmfVar, Throwable th, byiv byivVar, int i, String str) {
        super(2, fcxyVar);
        this.b = bzmfVar;
        this.c = th;
        this.d = byivVar;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzma) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        bzmf bzmfVar = this.b;
        Throwable th = this.c;
        ArrayList arrayList = new ArrayList(6);
        byiv byivVar = this.d;
        arrayList.add(new bzmu(bzmf.b(byivVar), bzmf.a(byivVar)));
        arrayList.add(new bzmq(bzmf.b(byivVar) == bmqz.BACKUP_DELETE ? null : byivVar.e));
        arrayList.add(new bzmr(byivVar));
        emcn emcnVarA = auls.a(th);
        emcnVarA.getClass();
        arrayList.add(new bzmv(emcnVarA));
        arrayList.add(new bzmp(this.e));
        String str = this.f;
        bzmx[] bzmxVarArr = str != null ? (bzmx[]) fcva.b(new bzmt(str)).toArray(new bzmt[0]) : (bzmx[]) fcvo.a.toArray(new bzmx[0]);
        bzmo bzmoVar = bzmfVar.a;
        fdcl.a(bzmxVarArr, arrayList);
        bzmx[] bzmxVarArr2 = (bzmx[]) arrayList.toArray(new bzmx[arrayList.size()]);
        this.a = 1;
        Object objA = bzmoVar.a(bzmxVarArr2, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzma bzmaVar = new bzma(fcxyVar, this.b, this.c, this.d, this.e, this.f);
        bzmaVar.g = obj;
        return bzmaVar;
    }
}
