package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ky {
    public static final cqce a = cqce.g("Bugle", "MmsManager");
    private static final SparseArray b = new SparseArray();
    private final cmtg c;
    private kz d = null;
    private final eygg e;
    private final fcsu f;
    private final Context g;

    public ky(Context context, eygg eyggVar, fcsu fcsuVar, cmtg cmtgVar) {
        this.c = cmtgVar;
        this.f = fcsuVar;
        this.e = eyggVar;
        this.g = context;
    }

    public final Bundle a(int i) {
        Bundle bundle;
        SparseArray sparseArray = b;
        synchronized (sparseArray) {
            bundle = (Bundle) sparseArray.get(i);
            if (bundle == null) {
                bundle = new Bundle();
                sparseArray.put(i, bundle);
                cmtg cmtgVar = this.c;
                if (cmtgVar != null) {
                    Bundle carrierConfigValues = SmsManager.getSmsManagerForSubscriptionId(i).getCarrierConfigValues();
                    Bundle bundleA = cmtgVar.a(i);
                    if (carrierConfigValues != null) {
                        for (String str : bundleA.keySet()) {
                            Object obj = bundleA.get(str);
                            Object obj2 = carrierConfigValues.get(str);
                            if ((obj != null && obj2 != null && !obj.equals(obj2)) || ((obj != null && obj2 == null) || (obj == null && obj2 != null))) {
                                if (obj == null || (obj instanceof String)) {
                                    bundle.putString(str, (String) obj);
                                } else if (obj instanceof Integer) {
                                    bundle.putInt(str, ((Integer) obj).intValue());
                                } else if (obj instanceof Boolean) {
                                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                                }
                            }
                        }
                    } else {
                        bundle.putAll(bundleA);
                    }
                }
                Context context = this.g;
                cmti cmtiVar = new cmti(context, (cmum) this.f.b(), i);
                this.d = cmtiVar;
                cmtiVar.a();
                bundle.putString("userAgent", cmtiVar.a);
                cmtiVar.a();
                bundle.putString("uaProfUrl", cmtiVar.b);
            }
        }
        return bundle;
    }
}
