package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zyp implements fdau {
    final /* synthetic */ zym a;

    public zyp(zym zymVar) {
        this.a = zymVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((eih) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dthx.b(jqu.b(true != this.a.a.isEmpty() ? R.string.bottom_sheet_active_typers : R.string.bottom_sheet_no_active_typers, hmlVar), efy.j(ics.e, 16.0f, 0.0f, 16.0f, 18.0f, 2), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).m, hmlVar, 0, 0, 65532);
        }
        return fctx.a;
    }
}
