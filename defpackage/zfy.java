package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfy extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ auyl[] c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfy(fcxy fcxyVar, auyl[] auylVarArr) {
        super(3, fcxyVar);
        this.c = auylVarArr;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zfy zfyVar = new zfy((fcxy) obj3, this.c);
        zfyVar.d = (fdpm) obj;
        zfyVar.b = (Object[]) obj2;
        return zfyVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i2 = this.a;
        fctl.b(obj);
        if (i2 == 0) {
            ?? r2 = this.d;
            Object obj3 = this.b;
            auyl[] auylVarArr = this.c;
            ArrayList arrayList = new ArrayList(3);
            int i3 = 0;
            int i4 = 0;
            while (i3 < 3) {
                if (auylVarArr[i3] != null) {
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
            Object obj4 = array[0];
            dlhu dlhuVar = (dlhu) array[1];
            dlhm dlhmVar = (dlhm) obj4;
            dlhm dlhmVarL = ((Boolean) array[2]).booleanValue() ? dlhm.l(dlhmVar, null, null, dlhuVar, null, null, false, false, 4194299) : dlhm.l(dlhmVar, null, null, dlhuVar, null, null, false, false, 4192251);
            this.a = 1;
            if (r2.fO(dlhmVarL, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
