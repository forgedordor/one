package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytb extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ auyl[] c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytb(fcxy fcxyVar, auyl[] auylVarArr) {
        super(3, fcxyVar);
        this.c = auylVarArr;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ytb ytbVar = new ytb((fcxy) obj3, this.c);
        ytbVar.d = (fdpm) obj;
        ytbVar.b = (Object[]) obj2;
        return ytbVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r12 = this.d;
            Object obj2 = this.b;
            auyl[] auylVarArr = this.c;
            ArrayList arrayList = new ArrayList(2);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                Object obj3 = null;
                if (i2 >= 2) {
                    break;
                }
                if (auylVarArr[i2] != null) {
                    obj3 = ((Object[]) obj2)[i3];
                    i3++;
                }
                arrayList.add(obj3);
                i2++;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            djpa djpaVarL = (djpa) array[0];
            if (!((Boolean) array[1]).booleanValue()) {
                djpaVarL = djpa.l(djpaVarL, null, false, false, 524286);
            }
            this.a = 1;
            if (r12.fO(djpaVarL, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
