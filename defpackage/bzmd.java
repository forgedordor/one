package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzmd extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzmf b;
    final /* synthetic */ byiv c;
    final /* synthetic */ byiv d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmd(fcxy fcxyVar, bzmf bzmfVar, byiv byivVar, byiv byivVar2, int i, String str) {
        super(2, fcxyVar);
        this.b = bzmfVar;
        this.c = byivVar;
        this.d = byivVar2;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        byiv byivVar = this.c;
        bzmu bzmuVar = new bzmu(bzmf.b(byivVar), bzmf.a(byivVar));
        bzmq bzmqVar = new bzmq(byivVar.e);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new bzmr(byivVar));
        arrayList.add(new bzmv(emcn.CMS_DEPENDENCY_MISSING));
        byiv byivVar2 = this.d;
        int i2 = byivVar2.d;
        String str = byivVar2.e;
        str.getClass();
        arrayList.add(new bzms(i2, str));
        arrayList.add(new bzmp(this.e));
        String str2 = this.f;
        bzmx[] bzmxVarArr = str2 != null ? (bzmx[]) fcva.b(new bzmt(str2)).toArray(new bzmt[0]) : (bzmx[]) fcvo.a.toArray(new bzmx[0]);
        bzmo bzmoVar = bzmfVar.a;
        fdcl.a(bzmxVarArr, arrayList);
        bzmx[] bzmxVarArr2 = (bzmx[]) arrayList.toArray(new bzmx[arrayList.size()]);
        this.a = 1;
        bzmi.b(bzmuVar.a);
        Object objA = fdin.a(eicg.a(bzmoVar.b), new bzmj(null, bzmoVar, bzmuVar, bzmqVar, bzmxVarArr2), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzmd bzmdVar = new bzmd(fcxyVar, this.b, this.c, this.d, this.e, this.f);
        bzmdVar.g = obj;
        return bzmdVar;
    }
}
