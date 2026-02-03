package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yav extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ HashMap c;
    final /* synthetic */ ybd d;
    final /* synthetic */ fdjx e;
    final /* synthetic */ fdae f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yav(fcxy fcxyVar, HashMap map, ybd ybdVar, fdjx fdjxVar, fdae fdaeVar) {
        super(3, fcxyVar);
        this.c = map;
        this.d = ybdVar;
        this.e = fdjxVar;
        this.f = fdaeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yav yavVar = new yav((fcxy) obj3, this.c, this.d, this.e, this.f);
        yavVar.g = (fdpm) obj;
        yavVar.b = obj2;
        return yavVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r12 = this.g;
            ekgb<MessageId> ekgbVar = (ekgb) this.b;
            HashMap map = this.c;
            map.keySet().retainAll(ekgbVar);
            ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
            for (MessageId messageId : ekgbVar) {
                Object objA = map.get(messageId);
                if (objA == null) {
                    ybd ybdVar = this.d;
                    fdpl fdplVarA = anov.a(ybdVar.b.i(messageId));
                    ybb ybbVar = new ybb(null, ybdVar, this.f);
                    int i2 = fdsn.a;
                    objA = fdtg.a(new fdwg(ybbVar, fdplVarA), this.e, fdur.a, 1);
                    map.put(messageId, objA);
                }
                arrayList.add((fduj) objA);
            }
            fdqv fdqvVar = new fdqv(new yba((fdpl[]) fcva.ao(arrayList).toArray(new fdpl[0])), new ybc(null));
            this.a = 1;
            if (fdpy.c(r12, fdqvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
