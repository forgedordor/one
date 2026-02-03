package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djcj implements fdat {
    final /* synthetic */ djcy a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ ego d;
    final /* synthetic */ igr e;
    final /* synthetic */ fdap f;
    final /* synthetic */ djga g;
    final /* synthetic */ int h;

    public djcj(djcy djcyVar, int i, float f, int i2, ego egoVar, igr igrVar, fdap fdapVar, djga djgaVar) {
        this.a = djcyVar;
        this.h = i;
        this.b = f;
        this.c = i2;
        this.d = egoVar;
        this.e = igrVar;
        this.f = fdapVar;
        this.g = djgaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        long j2;
        int iB;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final djcy djcyVar = this.a;
            jyq jyqVar = glz.d(hmlVar).j;
            int i = this.h;
            float f = this.b;
            hmlVar.v(-351555844);
            if (i != 3 || f <= 0.5f) {
                hmlVar.v(-2069622631);
                j = glz.a(hmlVar).q;
                hmlVar.o();
            } else {
                hmlVar.v(-2069701092);
                j = dljt.f(hmlVar).p;
                hmlVar.o();
            }
            djcv djcvVar = djcyVar.a;
            hmlVar.o();
            jyq jyqVarB = dlkn.b(jyq.y(jyqVar, j, 0L, null, null, null, null, 0L, null, 0, this.c, 0L, null, null, 0, 16711678), hmlVar);
            ego egoVar = this.d;
            ico icoVar = ics.e;
            ics icsVarA = egoVar.a(icoVar, 1.0f, true);
            if (!djcvVar.h.b) {
                icsVarA = icsVarA.a(cyi.b(icoVar));
            }
            ics icsVarA2 = ifs.a(joj.a(igt.a(icsVarA, this.e), "Compose:Draft:Text"), this.f);
            fae faeVar = new fae(3, null, 0, 4, 118);
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(djcyVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: djci
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((fac) obj3).getClass();
                        djcyVar.d.b.invoke();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            fad fadVar = new fad(null, null, null, (fdap) objF, 31);
            hmlVar.v(1971128241);
            float f2 = true != ((Boolean) dljt.b(hmlVar).j.invoke()).booleanValue() ? 8.0f : 12.0f;
            hmlVar.o();
            float f3 = f2;
            float fA = djbc.a(hmlVar);
            hmlVar.v(-1089257337);
            hmlVar.v(-2119167488);
            boolean z = djcyVar.g.a;
            boolean z2 = z && ((Configuration) hmlVar.e(AndroidCompositionLocals_androidKt.a)).orientation != 2;
            hmlVar.o();
            float f4 = z2 ? Float.NaN : (float) (((Configuration) hmlVar.e(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 0.25d);
            hmlVar.o();
            hmlVar.v(-1759450262);
            int iF = 4;
            if (z) {
                hmlVar.v(570158605);
                hng hngVar = AndroidCompositionLocals_androidKt.a;
                if (((Configuration) hmlVar.e(hngVar)).orientation == 2) {
                    iB = 4;
                    hmlVar.o();
                    iF = fddu.f(iB, 4);
                } else {
                    try {
                        iB = fdcu.b(djcvVar.e / (((Number) dljt.e(hmlVar).a.a()).floatValue() * ((Configuration) hmlVar.e(hngVar)).fontScale));
                    } catch (IllegalArgumentException unused) {
                    }
                    hmlVar.o();
                    iF = fddu.f(iB, 4);
                }
            }
            hmlVar.o();
            djcy djcyVar2 = this.a;
            int i2 = this.h;
            float f5 = this.b;
            hmlVar.v(-340327303);
            if (i2 != 3 || f5 <= 0.5f) {
                hmlVar.v(1727366677);
                j2 = glz.a(hmlVar).s;
                hmlVar.o();
            } else {
                hmlVar.v(1727274545);
                j2 = dljt.f(hmlVar).F;
                hmlVar.o();
            }
            djcv djcvVar2 = djcyVar2.a;
            CharSequence charSequence = djcvVar.b;
            dpfy dpfyVar = djcvVar.a;
            hmlVar.o();
            dpgj dpgjVar = new dpgj(djcvVar2.c, j2);
            djga djgaVar = this.g;
            dpgi.b(dpfyVar, new Void[0], charSequence, icsVarA2, jyqVarB, faeVar, fadVar, f3, fA, f4, Integer.valueOf(iF), djcvVar2.d, djcvVar2.f, djcvVar2.h.a, dpgjVar, djgaVar.c, djgaVar.f, hmlVar, 196608, 0);
        }
        return fctx.a;
    }
}
