package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djap implements fdat {
    public static final djap a = new djap();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dthx.b(jqu.b(R.string.compose_subject_placeholder, hmlVar), dihi.c(ics.e), glz.a(hmlVar).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).k, hmlVar, 0, 0, 65528);
        }
        return fctx.a;
    }
}
