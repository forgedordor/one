package defpackage;

import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsi {
    private final fctc a;

    public cdsi(final URL url, final fgsk fgskVar, final String str) {
        this.a = fctd.a(new fdae() { // from class: cdsh
            @Override // defpackage.fdae
            public final Object invoke() {
                fgsu fgsuVarB;
                String string = url.toString();
                StringReader stringReader = new StringReader(str);
                fgqz.i(stringReader, "input");
                fgqz.i(string, "baseUri");
                fgrm fgrmVar = new fgrm(string);
                fgsk fgskVar2 = fgskVar;
                fgsy fgsyVar = fgskVar2.a;
                fgsyVar.w = fgrmVar;
                fgsyVar.w.c = fgskVar2;
                fgsyVar.t = fgskVar2;
                fgsyVar.A = fgskVar2.c;
                fgsyVar.u = new fgsd(stringReader, 32768);
                fgsyVar.u.g = null;
                fgsyVar.z = null;
                fgsyVar.v = new fgsw(fgsyVar.u, fgskVar2.b);
                fgsyVar.x = new ArrayList(32);
                fgsyVar.B = new HashMap();
                fgsyVar.y = string;
                fgse fgseVar = (fgse) fgsyVar;
                fgseVar.i = fgsg.a;
                fgseVar.j = null;
                fgseVar.k = false;
                fgseVar.l = null;
                fgseVar.m = null;
                fgseVar.n = new ArrayList();
                fgseVar.o = new ArrayList();
                fgseVar.p = new ArrayList();
                fgseVar.q = new fgsr();
                fgseVar.r = true;
                fgseVar.s = false;
                fgsw fgswVar = fgsyVar.v;
                do {
                    fgsuVarB = fgswVar.b();
                    fgsyVar.N(fgsuVarB);
                    fgsuVarB.a();
                } while (fgsuVarB.h != 6);
                fgsyVar.u.p();
                fgsyVar.u = null;
                fgsyVar.v = null;
                fgsyVar.x = null;
                fgsyVar.B = null;
                return fgsyVar.w;
            }
        });
    }

    public final fgrm a() {
        return (fgrm) this.a.a();
    }
}
