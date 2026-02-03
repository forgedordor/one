package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmwr implements fdau {
    final /* synthetic */ hsf a;

    public dmwr(hsf hsfVar) {
        this.a = hsfVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            gyj.c(jqu.c(R.string.done_button_with_number_items_selected, new Object[]{Integer.valueOf(dmxm.b(this.a).size())}, hmlVar), null, 0L, kjm.c(14), null, null, 0L, null, kjm.c(20), 0, false, 0, 0, null, jyq.y(glz.d(hmlVar).m, glz.a(hmlVar).p, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214), hmlVar, 24576, 48, 129006);
        }
        return fctx.a;
    }
}
