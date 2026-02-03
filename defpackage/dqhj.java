package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqhj implements fdat {
    final /* synthetic */ int a;

    public dqhj(int i) {
        this.a = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-227859224);
            int i = this.a;
            jul julVar = new jul((byte[]) null);
            julVar.f(jqu.b(R.string.noise_cancellation, hmlVar));
            julVar.f(" ");
            hmlVar.v(-227855423);
            int iA = julVar.a(new jxx(0L, 0L, kcc.h, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
            try {
                julVar.f(jqu.b(i, hmlVar));
                julVar.h(iA);
                hmlVar.o();
                juo juoVarB = julVar.b();
                hmlVar.o();
                gyj.b(juoVarB, null, glz.a(hmlVar).o, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, glz.d(hmlVar).l, hmlVar, 0, 0, 262138);
            } catch (Throwable th) {
                julVar.h(iA);
                throw th;
            }
        }
        return fctx.a;
    }
}
