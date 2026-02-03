package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afjf extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ int b;
    final /* synthetic */ afjl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afjf(afjl afjlVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = afjlVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        afjf afjfVar = new afjf(this.c, (fcxy) obj3);
        afjfVar.a = (pxc) obj;
        afjfVar.b = iIntValue;
        return afjfVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        float fA;
        fctl.b(obj);
        List list = ((pxc) this.a).a;
        int i = this.b;
        ArrayList<pwl> arrayList = new ArrayList();
        for (Object obj2 : list) {
            pwl pwlVar = (pwl) obj2;
            if ((pwlVar instanceof pwl) && fdbq.f(pwlVar.b(), pwi.a)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        for (pwl pwlVar2 : arrayList) {
            pwlVar2.getClass();
            arrayList2.add(pwlVar2);
        }
        if (((pwl) fcva.P(arrayList2)) != null) {
            fA = r6.a().left / i;
        } else {
            afjl afjlVar = this.c;
            fA = kyy.a(afjlVar.b.getResources(), true != ((asgt) afjlVar.y.b()).a() ? R.dimen.split_view_leftside_width_percent : R.dimen.split_view_width_percent_coolranch);
        }
        return new Float(fA);
    }
}
