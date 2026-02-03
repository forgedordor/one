package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djcf implements fdau {
    final /* synthetic */ dilm a;
    final /* synthetic */ djcq b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ float e;
    final /* synthetic */ int f;

    public djcf(dilm dilmVar, djcq djcqVar, int i, boolean z, int i2, float f) {
        this.a = dilmVar;
        this.b = djcqVar;
        this.c = i;
        this.d = z;
        this.f = i2;
        this.e = f;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((eih) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            String strB = jqu.b(R.string.compose_remove_button_content_description, hmlVar);
            dilm dilmVar = this.a;
            String str = String.format(strB, Arrays.copyOf(new Object[]{dilmVar.e()}, 1));
            str.getClass();
            hmlVar.v(-1633490746);
            final djcq djcqVar = this.b;
            boolean zD = hmlVar.D(djcqVar);
            final int i = this.c;
            boolean zB = zD | hmlVar.B(i);
            Object objF = hmlVar.f();
            if (zB || objF == hmk.a) {
                objF = new fdae() { // from class: djcb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djcqVar.c.invoke(Integer.valueOf(i));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dihd dihdVar = new dihd(str, (fdae) objF);
            hmlVar.v(-1633490746);
            boolean zD2 = hmlVar.D(djcqVar) | hmlVar.B(i);
            Object objF2 = hmlVar.f();
            if (zD2 || objF2 == hmk.a) {
                objF2 = new fdae() { // from class: djcc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djcqVar.b.invoke(Integer.valueOf(i));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            fdae fdaeVar = (fdae) objF2;
            hmlVar.o();
            hmlVar.v(-1633490746);
            boolean zD3 = hmlVar.D(djcqVar) | hmlVar.B(i);
            Object objF3 = hmlVar.f();
            if (zD3 || objF3 == hmk.a) {
                objF3 = new fdae() { // from class: djcd
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djcqVar.d.invoke(Integer.valueOf(i));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF3);
            }
            fdae fdaeVar2 = (fdae) objF3;
            hmlVar.o();
            dioz.b(new dipa(dihdVar, fdaeVar, fdaeVar2, dilmVar instanceof dilh ? this.d : false), null, new ije(djco.l(this.f, this.e, hmlVar)), hxe.d(-1499047417, new djce(dilmVar), hmlVar), hmlVar, 3072);
        }
        return fctx.a;
    }
}
