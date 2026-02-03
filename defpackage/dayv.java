package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayv implements fdau {
    final /* synthetic */ String a;

    public dayv(String str) {
        this.a = str;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dthx.b(jqu.c(R.string.continue_as_button, new Object[]{this.a}, hmlVar), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 131070);
        }
        return fctx.a;
    }
}
