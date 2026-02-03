package defpackage;

import android.graphics.Point;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djtm implements fdau {
    final /* synthetic */ djtg a;
    final /* synthetic */ ics b;
    final /* synthetic */ Point c;
    final /* synthetic */ iva d;
    final /* synthetic */ hox e;
    final /* synthetic */ hox f;

    public djtm(djtg djtgVar, ics icsVar, Point point, iva ivaVar, hox hoxVar, hox hoxVar2) {
        this.a = djtgVar;
        this.b = icsVar;
        this.c = point;
        this.d = ivaVar;
        this.e = hoxVar;
        this.f = hoxVar2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Integer numValueOf;
        Integer numValueOf2;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hox hoxVar = this.e;
        ics icsVarA = (djto.c(djto.b(hoxVar)) || this.a.q()) ? iep.a(this.b, 5.0f, 5.0f, new ieq(ieq.a).b) : this.b;
        djtg djtgVar = this.a;
        Uri uriE = djtgVar.e();
        if (uriE == null) {
            uriE = (fdbq.f(djtgVar.l(), djto.b(hoxVar)) || djto.c(djtgVar.l())) ? null : djtgVar.l();
        }
        rok rokVar = rok.d;
        Point pointA = djtt.a(djtgVar.i(), djtgVar.h(), this.c);
        if (djtgVar instanceof djtq) {
            hmlVar.v(-1812394910);
            Uri uriB = djto.b(hoxVar);
            Uri uriA = djto.a(this.f);
            djtq djtqVar = (djtq) djtgVar;
            String str = djtqVar.k;
            if (pointA != null) {
                numValueOf2 = Integer.valueOf(pointA.x);
            } else {
                pointA = null;
                numValueOf2 = null;
            }
            djrv.a(uriB, str, icsVarA, uriE, uriA, null, this.d, null, 0.0f, numValueOf2, pointA != null ? Integer.valueOf(pointA.y) : null, null, null, null, djtqVar.d, rokVar, hmlVar, 0, 100663296, 124768);
            hmlVar.o();
        } else if (djtgVar instanceof djtr) {
            hmlVar.v(-1811904800);
            Uri uriB2 = djto.b(hoxVar);
            Uri uriA2 = djto.a(this.f);
            djtr djtrVar = (djtr) djtgVar;
            String strA = djtrVar.a();
            if (pointA != null) {
                numValueOf = Integer.valueOf(pointA.x);
            } else {
                pointA = null;
                numValueOf = null;
            }
            djsp.c(uriB2, strA, icsVarA, uriE, uriA2, null, this.d, null, 0.0f, numValueOf, pointA != null ? Integer.valueOf(pointA.y) : null, djtrVar.a.d, rokVar, djtrVar.c, djtrVar.d, djtrVar.e, djtrVar.b, hmlVar, 0, 100663296, 0);
            hmlVar.o();
        } else {
            hmlVar.v(-1811258760);
            hmlVar.o();
        }
        return fctx.a;
    }
}
