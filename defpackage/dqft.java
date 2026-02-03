package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqft implements fdau {
    final /* synthetic */ dqfx a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dqbw c;

    public dqft(dqfx dqfxVar, boolean z, dqbw dqbwVar) {
        this.a = dqfxVar;
        this.b = z;
        this.c = dqbwVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.E(zBooleanValue) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dqfx dqfxVar = this.a;
            dqfq dqfqVar = zBooleanValue ? new dqfq(new dqfu(dqfxVar), R.drawable.gs_pause_circle_fill1_vd_theme_24, R.string.pause_button_content_description) : new dqfq(new dqfv(dqfxVar), R.drawable.gs_play_circle_fill1_vd_theme_24, R.string.play_button_content_description);
            boolean z = this.b;
            hmlVar.v(-1492674922);
            long j = dqct.c(this.c) ? ije.a : glz.a(hmlVar).s;
            fdae fdaeVar = dqfqVar.a;
            hmlVar.o();
            long j2 = glz.a(hmlVar).q;
            gjz.a(fdaeVar, null, z, null, gjm.d(0L, j, 0L, ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), fon.a(hmlVar), ije.f(j2)), hmlVar, 5), hxe.d(1537769752, new dqfs(dqfqVar), hmlVar), hmlVar, 1572864, 42);
        }
        return fctx.a;
    }
}
