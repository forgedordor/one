package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edzc implements fdau {
    final /* synthetic */ fdae a;
    final /* synthetic */ hox b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fdap d;
    final /* synthetic */ Context e;
    final /* synthetic */ add f;
    final /* synthetic */ Uri g;
    final /* synthetic */ add h;
    final /* synthetic */ add i;
    final /* synthetic */ boolean j;
    final /* synthetic */ fdap k;
    final /* synthetic */ edvs l;

    public edzc(fdae fdaeVar, hox hoxVar, boolean z, fdap fdapVar, edvs edvsVar, Context context, add addVar, Uri uri, add addVar2, add addVar3, boolean z2, fdap fdapVar2) {
        this.a = fdaeVar;
        this.b = hoxVar;
        this.c = z;
        this.d = fdapVar;
        this.l = edvsVar;
        this.e = context;
        this.f = addVar;
        this.g = uri;
        this.h = addVar2;
        this.i = addVar3;
        this.j = z2;
        this.k = fdapVar2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((ecyg) obj).getClass();
        gsp gspVarF = gos.f(true, hmlVar, 6, 2);
        long j = glz.a(hmlVar).F;
        long j2 = glz.a(hmlVar).q;
        ico icoVar = ics.e;
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        if (objF == hmk.a) {
            objF = new fdap() { // from class: edyk
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    jto jtoVar = (jto) obj4;
                    jtoVar.getClass();
                    jtk.u(jtoVar, "photoEditBottomSheet");
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        dtgc.a(this.a, jsh.c(icoVar, false, (fdap) objF), gspVarF, 0.0f, false, null, j, j2, 0.0f, 0L, null, null, null, hxe.d(720305858, new edzb(this.b, this.c, this.d, this.l, this.e, this.f, this.g, this.h, this.i, this.j, this.k), hmlVar), hmlVar, 0, 3072, 7992);
        return fctx.a;
    }
}
