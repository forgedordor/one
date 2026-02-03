package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avat extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdvc[] c;
    final /* synthetic */ fdat d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avat(fcxy fcxyVar, fdvc[] fdvcVarArr, fdat fdatVar) {
        super(3, fcxyVar);
        this.c = fdvcVarArr;
        this.d = fdatVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        avat avatVar = new avat((fcxy) obj3, this.c, this.d);
        avatVar.e = (fdpm) obj;
        avatVar.b = (Object[]) obj2;
        return avatVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i2 = this.a;
        fctl.b(obj);
        if (i2 == 0) {
            ?? r12 = this.e;
            Object obj3 = this.b;
            fdvc[] fdvcVarArr = this.c;
            ArrayList arrayList = new ArrayList(2);
            int i3 = 0;
            int i4 = 0;
            while (i3 < 2) {
                if (fdvcVarArr[i3] != null) {
                    i = i4 + 1;
                    obj2 = ((Object[]) obj3)[i4];
                } else {
                    i = i4;
                    obj2 = null;
                }
                arrayList.add(obj2);
                i3++;
                i4 = i;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object objA = this.d.a(array[0], array[1]);
            this.a = 1;
            if (r12.fO(objA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
