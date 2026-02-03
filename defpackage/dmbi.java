package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbi implements dmbc {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/cameragallery/data/GalleryLoaderImpl");
    public final fdjx b;
    public final dolm c;
    public final dlvl d;
    public final dngc e;
    public final dmyw f;
    public final fctc g;
    public final vun h;

    public dmbi(fdjx fdjxVar, Optional optional, dolm dolmVar, dlvl dlvlVar, dngc dngcVar, final fcsu fcsuVar, dmyw dmywVar) {
        dmyw dmywVar2;
        this.b = fdjxVar;
        this.c = dolmVar;
        this.d = dlvlVar;
        this.e = dngcVar;
        if (dmywVar == null) {
            dmywVar2 = new dmyw((dnbx) null, (dmiv) null, (fctc) null, false, false, false, false, 1023);
        } else {
            dmywVar2 = dmywVar;
        }
        this.f = dmywVar2;
        fctd.a(new fdae() { // from class: dmbe
            @Override // defpackage.fdae
            public final Object invoke() {
                Object objB = fcsuVar.b();
                objB.getClass();
                Optional optional2 = (Optional) objB;
                return (dluu) (optional2.isPresent() ? optional2.get() : new dluu(null));
            }
        });
        this.h = (vun) fdct.b(optional);
        this.g = fctd.a(new fdae() { // from class: dmbf
            @Override // defpackage.fdae
            public final Object invoke() {
                Iterable iterable = (Iterable) this.a.f.f.a();
                ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((dogj) it.next()).c().a());
                }
                List listG = fcva.g(1, 3);
                return fdgn.c("mime_type IN ('" + fcva.aF(arrayList, "','", null, null, null, 62) + "') \n    AND media_type IN (" + fcva.aF(listG, ",", null, null, null, 62) + ")", "|");
            }
        });
    }
}
