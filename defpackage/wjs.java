package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjs extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ wjy c;
    final /* synthetic */ List d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjs(fcxy fcxyVar, wjy wjyVar, List list) {
        super(3, fcxyVar);
        this.c = wjyVar;
        this.d = list;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wjs wjsVar = new wjs((fcxy) obj3, this.c, this.d);
        wjsVar.e = (fdpm) obj;
        wjsVar.b = (Object[]) obj2;
        return wjsVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r9 = this.e;
            List listM = fcur.M((dilm[]) this.b);
            wjy wjyVar = this.c;
            List list = this.d;
            djcq djcqVar = new djcq(listM, new wjo(wjyVar, list), new wjp(wjyVar, list), new wjq(wjyVar, list));
            this.a = 1;
            if (r9.fO(djcqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
