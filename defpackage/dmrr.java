package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmrr extends fcyz implements fdap {
    int a;
    final /* synthetic */ dmrt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmrr(dmrt dmrtVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dmrtVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object next;
        Collection arrayList;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dqiz dqizVar = this.b.j;
            if (dqizVar == null) {
                ((ekrd) dmrt.a.h().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/effects/CameraEffectsManager$loadFilteredEffects$1", "invokeSuspend", 71, "CameraEffectsManager.kt")).q("No XenoManager provided, returning empty effects list.");
                return fcvo.a;
            }
            this.a = 1;
            obj = dqizVar.d(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        dmrt dmrtVar = this.b;
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fdbq.f(((dbgj) next).a, dmrtVar.e.a)) {
                break;
            }
        }
        dbgj dbgjVar = (dbgj) next;
        if (dbgjVar != null) {
            ArrayList<dbgm> arrayList2 = new ArrayList();
            for (Object obj2 : dbgjVar.b) {
                ((dbgm) obj2).a.getClass();
                arrayList2.add(obj2);
            }
            arrayList = new ArrayList(fcva.p(arrayList2, 10));
            for (dbgm dbgmVar : arrayList2) {
                dbgmVar.getClass();
                dqiz dqizVar2 = dmrtVar.j;
                if (dqizVar2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                String str = dbgmVar.a;
                str.getClass();
                String strF = dqizVar2.f(str);
                str.getClass();
                Integer numB = dqizVar2.b(str);
                str.getClass();
                Bitmap bitmap = dbgmVar.b;
                dpxd dpxdVarA = dqizVar2.a(str);
                dmrz dmryVar = numB != null ? new dmry(numB.intValue(), dpxdVarA) : bitmap != null ? new dmrx(bitmap, dpxdVarA) : null;
                str.getClass();
                arrayList.add(new dmrk(str, strF, dmryVar));
            }
        } else {
            arrayList = fcvo.a;
        }
        if (arrayList.isEmpty()) {
            return fcvo.a;
        }
        fcww fcwwVar = new fcww((byte[]) null);
        fcwwVar.add(dmrtVar.i);
        fcwwVar.addAll(arrayList);
        return fcva.a(fcwwVar);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dmrr(this.b, (fcxy) obj).b(fctx.a);
    }
}
