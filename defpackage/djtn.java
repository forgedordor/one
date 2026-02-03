package defpackage;

import android.graphics.Point;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djtn implements fdav {
    final /* synthetic */ hox a;
    final /* synthetic */ hox b;
    final /* synthetic */ djtg c;
    final /* synthetic */ iva d;

    public djtn(hox hoxVar, hox hoxVar2, djtg djtgVar, iva ivaVar) {
        this.a = hoxVar;
        this.b = hoxVar2;
        this.c = djtgVar;
        this.d = ivaVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Point point = (Point) obj;
        ics icsVar = (ics) obj2;
        hml hmlVar = (hml) obj3;
        ((Number) obj4).intValue();
        icsVar.getClass();
        hox hoxVar = this.a;
        Uri uriA = djto.c(djto.b(hoxVar)) ? djto.a(this.b) : djto.b(hoxVar);
        djte.b(uriA, null, dea.c(500, 0, null, 6), hxe.d(-2002293270, new djtm(this.c, icsVar, point, this.d, hoxVar, this.b), hmlVar), hmlVar, 28032);
        return fctx.a;
    }
}
