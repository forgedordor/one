package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwd extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ HashMap c;
    final /* synthetic */ fdap d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwd(fcxy fcxyVar, HashMap map, fdap fdapVar) {
        super(3, fcxyVar);
        this.c = map;
        this.d = fdapVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xwd xwdVar = new xwd((fcxy) obj3, this.c, this.d);
        xwdVar.e = (fdpm) obj;
        xwdVar.b = obj2;
        return xwdVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdpuVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r6 = this.e;
            ajlt ajltVar = (ajlt) this.b;
            if (ajltVar == null) {
                this.c.clear();
                fdpuVar = new fdpu(null);
            } else {
                HashMap map = this.c;
                map.keySet().retainAll(fcwm.b(ajltVar.b()));
                MessageId messageIdB = ajltVar.b();
                Object obj2 = map.get(messageIdB);
                if (obj2 == null) {
                    obj2 = (fduj) this.d.invoke(ajltVar);
                    map.put(messageIdB, obj2);
                }
                fdpuVar = (fdpl) obj2;
            }
            this.a = 1;
            if (fdpy.c(r6, fdpuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
