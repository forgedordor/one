package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlot implements fdat {
    public static final dlot a = new dlot();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlpn.c(djrr.dN, jqu.b(R.string.transcription_in_progress_text, hmlVar), efy.e(ics.e, 24.0f, 11.0f), hmlVar, 6, 0);
        }
        return fctx.a;
    }
}
