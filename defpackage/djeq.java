package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djeq implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ djew b;
    final /* synthetic */ boolean c;

    public djeq(boolean z, djew djewVar, boolean z2) {
        this.a = z;
        this.b = djewVar;
        this.c = z2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long jF;
        long j;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ede) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-1836746615);
            boolean z = this.a;
            ico icoVar = ics.e;
            ics icsVarC = z ? efs.c(icoVar, 1.0f, 0.0f, 2) : icoVar;
            djew djewVar = this.b;
            String str = djewVar.e;
            if (str != null) {
                icsVarC = icsVarC.a(efs.c(icoVar, 0.0f, -4.0f, 1));
            }
            djrr djrrVar = djewVar.a;
            if (djrrVar.ordinal() != 57) {
                icsVarC = icsVarC.a(djrq.a(icoVar, (kji) hmlVar.e(jmh.j)));
            }
            hmlVar.o();
            inz inzVarB = djrs.b(djrrVar, hmlVar);
            String strB = djewVar.d;
            hmlVar.v(-1836740562);
            if (strB == null) {
                strB = jqu.b(R.string.compose_icon_send_content_description, hmlVar);
            }
            hmlVar.o();
            if (djewVar.f) {
                hmlVar.v(-1104242979);
                if (this.c) {
                    hmlVar.v(-1104206864);
                    jF = glz.a(hmlVar).b;
                    hmlVar.o();
                } else {
                    hmlVar.v(-1104140462);
                    jF = glz.a(hmlVar).a;
                    hmlVar.o();
                }
                hmlVar.o();
            } else {
                hmlVar.v(-1104059459);
                if (this.c) {
                    hmlVar.v(-1104024863);
                    long j2 = glz.a(hmlVar).b;
                    jF = ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.38f, ije.f(j2));
                    hmlVar.o();
                } else {
                    hmlVar.v(-1103911775);
                    long j3 = glz.a(hmlVar).q;
                    jF = ijg.f(ije.d(j3), ije.c(j3), ije.b(j3), 0.38f, ije.f(j3));
                    hmlVar.o();
                }
                hmlVar.o();
            }
            djco.a(inzVarB, strB, icsVarC, jF, hmlVar, 0, 0);
            if (str != null) {
                boolean z2 = this.c;
                ics icsVarC2 = efs.c(icoVar, 0.0f, 10.0f, 1);
                if (z) {
                    icsVarC2 = icsVarC2.a(efs.c(icoVar, 1.0f, 0.0f, 2));
                }
                jyq jyqVar = dljt.e(hmlVar).e;
                if (z2) {
                    hmlVar.v(1530801618);
                    j = glz.a(hmlVar).b;
                    hmlVar.o();
                } else {
                    hmlVar.v(1530868020);
                    j = glz.a(hmlVar).a;
                    hmlVar.o();
                }
                dlfw.a(str, icsVarC2, j, null, 0, 0, jyqVar, hmlVar, 0, 56);
            }
        }
        return fctx.a;
    }
}
