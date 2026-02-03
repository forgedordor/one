package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrm {
    public static final fdat a(jsl jslVar) {
        return (fdat) jsd.a(jslVar.c, jsa.e);
    }

    public static final void b(jsl jslVar, int i, fdap fdapVar) {
        jsl jslVar2;
        hum humVar = new hum(new jsl[16]);
        List listC = c(jslVar);
        int i2 = humVar.b;
        while (true) {
            humVar.p(i2, listC);
            while (true) {
                int i3 = humVar.b;
                if (i3 == 0) {
                    return;
                }
                jslVar2 = (jsl) humVar.c(i3 - 1);
                if (!jsp.a(jslVar2)) {
                    jsc jscVar = jslVar2.c;
                    if (jscVar.f(jte.i)) {
                        continue;
                    } else {
                        jer jerVarE = jslVar2.e();
                        if (jerVarE == null) {
                            itw.b("Expected semantics node to have a coordinator.");
                            throw new fcta();
                        }
                        kjd kjdVarB = kje.b(ivz.f(jerVarE));
                        if (kjdVarB.b < kjdVarB.d && kjdVarB.c < kjdVarB.e) {
                            fdat fdatVarA = a(jslVar2);
                            jry jryVar = (jry) jsd.a(jscVar, jte.u);
                            if (fdatVarA == null || jryVar == null || ((Number) jryVar.b.invoke()).floatValue() <= 0.0f) {
                                break;
                            }
                            int i4 = i + 1;
                            fdapVar.invoke(new jrl(jslVar2, i4, kjdVarB, jerVarE));
                            b(jslVar2, i4, fdapVar);
                        }
                    }
                }
            }
            listC = c(jslVar2);
            i2 = humVar.b;
        }
    }

    private static final List c(jsl jslVar) {
        return jslVar.l(false, false);
    }
}
