package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctue implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public ctue(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        String str;
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarD = egq.d(ics.e, 1.0f);
            hmlVar.v(5004770);
            final String str2 = this.a;
            boolean zD = hmlVar.D(str2);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: ctud
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        jto jtoVar = (jto) obj3;
                        jtoVar.getClass();
                        jtk.k(jtoVar, str2);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            ics icsVarC = jsh.c(icsVarD, false, (fdap) objF);
            String str3 = this.b;
            if (str3.length() == 0) {
                str = "";
            } else {
                str = str3.length() + "/100";
            }
            dthx.b(str, icsVarC, 0L, 0L, null, null, 0L, new khk(6), 0L, 0, false, 0, 0, null, null, hmlVar, 0, 0, 130556);
        }
        return fctx.a;
    }
}
