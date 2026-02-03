package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uje implements eyif {
    /* JADX WARN: Type inference failed for: r5v0, types: [dmiw, java.lang.Object] */
    public static dmyw a(Context context, fcyh fcyhVar, lxq lxqVar, Optional optional, srx srxVar, egqi egqiVar, Optional optional2, Optional optional3, fcsu fcsuVar) {
        context.getClass();
        fcyhVar.getClass();
        lxqVar.getClass();
        srxVar.getClass();
        egqiVar.getClass();
        fcsuVar.getClass();
        Object obj = optional.isEmpty() ? null : ((Boolean) ujw.f.e()).booleanValue() ? dmis.a : optional.get();
        optional3.isPresent();
        ujc ujcVar = new ujc(fcyhVar, context);
        optional2.isPresent();
        dmiv dmivVar = new dmiv((dmiu) obj, ujcVar, optional2.get(), ((aqdt) fcsuVar.b()).a());
        if (ujd.a(lxqVar) || !context.getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            dmivVar = null;
        }
        Object objE = ujw.h.e();
        objE.getClass();
        dnbx dnbxVar = new dnbx(true, ((Boolean) objE).booleanValue(), 1);
        fctc fctcVarA = ujd.a(lxqVar) ? fctd.a(new fdae() { // from class: uja
            @Override // defpackage.fdae
            public final Object invoke() {
                dohf dohfVar = dohm.b;
                return dogr.a();
            }
        }) : dmyw.a;
        Object objE2 = ujw.g.e();
        objE2.getClass();
        return new dmyw(dnbxVar, dmivVar, fctcVarA, ((Boolean) objE2).booleanValue(), true, true, true, 3);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
