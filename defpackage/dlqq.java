package defpackage;

import android.graphics.Point;
import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlqq implements fdat {
    final /* synthetic */ Point a;
    final /* synthetic */ hox b;
    final /* synthetic */ hox c;
    final /* synthetic */ dlqu d;
    final /* synthetic */ hox e;

    public dlqq(Point point, hox hoxVar, hox hoxVar2, dlqu dlquVar, hox hoxVar3) {
        this.a = point;
        this.b = hoxVar;
        this.c = hoxVar2;
        this.d = dlquVar;
        this.e = hoxVar3;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hox hoxVar = this.b;
            Uri uriA = dlqs.a(hoxVar);
            ics icsVarA = ics.e;
            if (fdbq.f(dlqs.a(hoxVar), Uri.EMPTY)) {
                icsVarA = iep.a(icsVarA, 5.0f, 5.0f, new ieq(ieq.a).b);
            }
            Point point = this.a;
            iva ivaVar = iuz.g;
            Integer numValueOf = point != null ? Integer.valueOf(point.x) : null;
            djrv.a(uriA, null, icsVarA, null, dlqs.b(this.c), null, ivaVar, null, 0.0f, numValueOf, point != null ? Integer.valueOf(point.y) : null, Duration.ZERO, null, null, new dlqp(this.d, this.e), rok.d, hmlVar, 12582960, 100666368, 116584);
        }
        return fctx.a;
    }
}
