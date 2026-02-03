package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abh extends adq {
    final /* synthetic */ abi a;

    public abh(abi abiVar) {
        this.a = abiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.adq
    public final void a(final int i, adx adxVar, Object obj, kun kunVar) throws IntentSender.SendIntentException {
        Bundle bundleA;
        final int i2;
        abi abiVar = this.a;
        final adw adwVarC = adxVar.c(abiVar, obj);
        if (adwVarC != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: abf
                @Override // java.lang.Runnable
                public final void run() {
                    abh abhVar = this.a;
                    String str = (String) abhVar.b.get(Integer.valueOf(i));
                    if (str == null) {
                        return;
                    }
                    adm admVar = (adm) abhVar.e.get(str);
                    adi adiVar = admVar != null ? admVar.a : null;
                    Object obj2 = adwVarC.a;
                    if (adiVar == null) {
                        abhVar.g.remove(str);
                        abhVar.f.put(str, obj2);
                    } else {
                        adi adiVar2 = admVar.a;
                        if (abhVar.d.remove(str)) {
                            adiVar2.a(obj2);
                        }
                    }
                }
            });
            return;
        }
        Intent intentA = adxVar.a(abiVar, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(abiVar.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleA = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleA = kunVar != null ? kunVar.a() : null;
        }
        Bundle bundle = bundleA;
        if (fdbq.f("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            int i3 = 0;
            while (true) {
                int length = stringArrayExtra.length;
                if (i3 >= length) {
                    int size = hashSet.size();
                    String[] strArr = size > 0 ? new String[length - size] : stringArrayExtra;
                    if (size > 0) {
                        if (size == length) {
                            return;
                        }
                        int i4 = 0;
                        for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                            if (!hashSet.contains(Integer.valueOf(i5))) {
                                strArr[i4] = stringArrayExtra[i5];
                                i4++;
                            }
                        }
                    }
                    if (abiVar instanceof kuk) {
                    }
                    abiVar.requestPermissions(stringArrayExtra, i);
                    return;
                }
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
                i3++;
            }
        } else {
            if (!fdbq.f("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                abiVar.startActivityForResult(intentA, i, bundle);
                return;
            }
            adt adtVar = (adt) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                adtVar.getClass();
                i2 = i;
                try {
                    abiVar.startIntentSenderForResult(adtVar.a, i2, adtVar.b, adtVar.c, adtVar.d, 0, bundle);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: abg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.f(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i2 = i;
            }
        }
    }
}
