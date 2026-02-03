package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnkh implements eyif {
    public static eqcl a(Context context, ceds cedsVar, asel aselVar) throws PackageManager.NameNotFoundException {
        ezoe ezoeVar;
        String str;
        eqcc eqccVar = new eqcc();
        eqccVar.a(false);
        ezod ezodVar = (ezod) ezoe.a.createBuilder();
        int iB = cpge.b(context);
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).b = iB;
        int iC = cpge.c(context);
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).c = iC;
        int iA = cpge.a(context);
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).d = iA;
        String strD = cpge.d(context);
        ezodVar.copyOnWrite();
        ezoe ezoeVar2 = (ezoe) ezodVar.instance;
        strD.getClass();
        ezoeVar2.h = strD;
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).e = 4;
        int iA2 = cedsVar.a();
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).g = felo.a(iA2);
        ezoe ezoeVar3 = (ezoe) ezodVar.build();
        if (ezoeVar3 == null) {
            throw new NullPointerException("Null clientInfo");
        }
        eqccVar.a = ezoeVar3;
        eqccVar.b = "RCS";
        eqccVar.a(crtr.a() || ((eoth) ((asec) aselVar).a.b()).a("bugle.enable_request_header_modification"));
        if (eqccVar.d == 1 && (ezoeVar = eqccVar.a) != null && (str = eqccVar.b) != null) {
            return new eqcl(ezoeVar, str, eqccVar.c);
        }
        StringBuilder sb = new StringBuilder();
        if (eqccVar.a == null) {
            sb.append(" clientInfo");
        }
        if (eqccVar.b == null) {
            sb.append(" appName");
        }
        if (eqccVar.d == 0) {
            sb.append(" enableRequestHeaderModification");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
