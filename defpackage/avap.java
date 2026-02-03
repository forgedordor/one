package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avap extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdvc[] c;
    final /* synthetic */ fdax d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avap(fcxy fcxyVar, fdvc[] fdvcVarArr, fdax fdaxVar) {
        super(3, fcxyVar);
        this.c = fdvcVarArr;
        this.d = fdaxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        avap avapVar = new avap((fcxy) obj3, this.c, this.d);
        avapVar.e = (fdpm) obj;
        avapVar.b = (Object[]) obj2;
        return avapVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i2 = this.a;
        fctl.b(obj);
        if (i2 == 0) {
            ?? r15 = this.e;
            Object obj3 = this.b;
            fdvc[] fdvcVarArr = this.c;
            ArrayList arrayList = new ArrayList(6);
            int i3 = 0;
            int i4 = 0;
            while (i3 < 6) {
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
            Object objA = this.d.a(array[0], array[1], array[2], array[3], array[4], array[5]);
            this.a = 1;
            if (r15.fO(objA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
