package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxjn implements dxjj {
    public final dxif a;
    private final diep b;
    private final dxve c;

    public dxjn(diep diepVar, dxif dxifVar, dxve dxveVar) {
        diepVar.getClass();
        dxifVar.getClass();
        this.b = diepVar;
        this.a = dxifVar;
        this.c = dxveVar;
    }

    @Override // defpackage.dxjj
    public final boolean a(Context context, esju esjuVar) throws NumberFormatException {
        int iIntValue;
        context.getClass();
        String strB = dxjk.b(esjuVar);
        byte[] bArrD = esjuVar.d();
        String strA = dxjk.a(esjuVar);
        String str = (String) esjuVar.c().get("ki");
        int iA = dxjl.a(esjuVar.a());
        int iA2 = dxjl.a(esjuVar.b());
        Object obj = esjuVar.a.get("google.ttl");
        if (obj instanceof Integer) {
            iIntValue = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                iIntValue = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(String.valueOf(obj))));
            }
        } else {
            iIntValue = 0;
        }
        Bundle bundle = esjuVar.a;
        Integer numValueOf = Integer.valueOf(iIntValue);
        int iM = dxid.m(bundle.getString("message_type"));
        String string = bundle.getString("google.message_id");
        if (string == null) {
            string = bundle.getString("message_id");
        }
        if (true == TextUtils.isEmpty(string)) {
            string = null;
        }
        dxib dxibVar = new dxib(string, iM, iA, iA2, numValueOf, strB, bArrD, strA, str);
        if (!dxibVar.l()) {
            return false;
        }
        this.c.a(context);
        long micros = TimeUnit.MILLISECONDS.toMicros(this.b.f().toEpochMilli());
        if (fbcq.a.get().a()) {
            fdim.a(fcyi.a, new dxjm(this, dxibVar, context, micros, null));
        } else {
            this.a.d(dxibVar, dxjl.b(context), micros);
        }
        return true;
    }
}
