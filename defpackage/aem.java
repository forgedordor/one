package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aem extends adx {
    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        return ael.a(strArr);
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1) {
            return fcvp.a;
        }
        if (intent == null) {
            return fcvp.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return fcvp.a;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return fcwa.k(fcva.ar(fcur.K(stringArrayExtra), arrayList));
    }

    @Override // defpackage.adx
    public final /* bridge */ /* synthetic */ adw c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new adw(fcvp.a);
        }
        for (String str : strArr) {
            if (kxj.c(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(strArr.length), 16));
        for (String str2 : strArr) {
            fcti fctiVar = new fcti(str2, true);
            linkedHashMap.put(fctiVar.a, fctiVar.b);
        }
        return new adw(linkedHashMap);
    }
}
