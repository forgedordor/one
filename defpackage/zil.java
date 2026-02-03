package defpackage;

import android.net.Uri;
import android.text.format.DateUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zil implements fdaw {
    final /* synthetic */ zim a;

    public zil(zim zimVar) {
        this.a = zimVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        final zij zijVar = (zij) obj;
        eve eveVar = (eve) obj2;
        hml hmlVar = (hml) obj4;
        int iIntValue = ((Number) obj5).intValue();
        zijVar.getClass();
        eveVar.getClass();
        obj3.getClass();
        String elapsedTime = DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(zijVar.c));
        dker dkerVar = zijVar.i;
        dker dkerVar2 = new dker(dkerVar.a, this.a.a.a(), dkerVar.e, 10);
        hmlVar.v(5004770);
        boolean z = true;
        if ((((iIntValue & 14) ^ 6) <= 4 || !hmlVar.D(zijVar)) && (iIntValue & 6) != 4) {
            z = false;
        }
        Object objF = hmlVar.f();
        if (z || objF == hmk.a) {
            objF = new fdae() { // from class: zik
                @Override // defpackage.fdae
                public final Object invoke() {
                    zijVar.n.invoke();
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        djse djseVar = zijVar.h;
        fdae fdaeVar = zijVar.o;
        fdae fdaeVar2 = zijVar.n;
        int i = zijVar.p;
        Integer num = zijVar.m;
        Integer num2 = zijVar.l;
        boolean z2 = zijVar.k;
        String str = zijVar.j;
        Uri uri = zijVar.b;
        hmlVar.o();
        dlqs.c(new dlqu(zijVar.a, uri, (fdae) objF, elapsedTime, djseVar, str, z2, num2, num, i, fdaeVar2, fdaeVar, dkerVar2), obj3, eveVar, hmlVar, ((iIntValue >> 3) & 112) | ((iIntValue << 3) & 896));
        return fctx.a;
    }
}
