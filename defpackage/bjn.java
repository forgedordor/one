package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bjn {
    public static bjq a(bjq bjqVar, bjq bjqVar2) {
        if (bjqVar == null && bjqVar2 == null) {
            return blo.b;
        }
        bli bliVarB = bjqVar2 != null ? bli.b(bjqVar2) : bli.a();
        if (bjqVar != null) {
            Iterator it = bjqVar.s().iterator();
            while (it.hasNext()) {
                b(bliVarB, bjqVar2, bjqVar, (bjo) it.next());
            }
        }
        return blo.f(bliVarB);
    }

    public static void b(bli bliVar, bjq bjqVar, bjq bjqVar2, bjo bjoVar) {
        if (!Objects.equals(bjoVar, bku.N)) {
            bliVar.d(bjoVar, bjqVar2.i(bjoVar), bjqVar2.m(bjoVar));
            return;
        }
        bvc bvcVar = (bvc) bjqVar2.n(bjoVar, null);
        bvc bvcVar2 = (bvc) bjqVar.n(bjoVar, null);
        bjp bjpVarI = bjqVar2.i(bjoVar);
        if (bvcVar == null) {
            bvcVar = bvcVar2;
        } else if (bvcVar2 != null) {
            bva bvaVar = bvcVar.a;
            bvd bvdVar = bvcVar.b;
            bvd bvdVar2 = bvcVar2.b;
            if (bvdVar == null) {
                bvdVar = bvdVar2;
            }
            bvcVar2 = new bvc(bvaVar, bvdVar);
            bvcVar = bvcVar2;
        }
        bliVar.d(bjoVar, bjpVarI, bvcVar);
    }
}
