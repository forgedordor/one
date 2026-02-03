package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zdq extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dkur c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdq(fcxy fcxyVar, dkur dkurVar) {
        super(3, fcxyVar);
        this.c = dkurVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zdq zdqVar = new zdq((fcxy) obj3, this.c);
        zdqVar.d = (fdpm) obj;
        zdqVar.b = (Object[]) obj2;
        return zdqVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r12 = this.d;
            dkxv[] dkxvVarArr = (dkxv[]) this.b;
            dkur dkurVar = this.c;
            ArrayList arrayList = new ArrayList(dkxvVarArr.length);
            for (dkxv dkxvVar : dkxvVarArr) {
                dkxvVar.getClass();
                arrayList.add((dkxu) dkxvVar);
            }
            dkur dkurVar2 = new dkur(arrayList, dkurVar.g, dkurVar.b, dkurVar.c, dkurVar.d, dkurVar.e, dkurVar.f);
            this.a = 1;
            if (r12.fO(dkurVar2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
