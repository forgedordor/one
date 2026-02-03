package defpackage;

import android.os.StrictMode$OnThreadViolationListener;
import android.os.strictmode.Violation;
import androidx.car.app.hardware.info.EnergyProfile;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxbg implements StrictMode$OnThreadViolationListener {
    public final void onThreadViolation(Violation violation) {
        String str;
        boolean z;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            loop0: for (StackTraceElement stackTraceElement : stackTrace) {
                String string = stackTraceElement.toString();
                ekhv ekhvVar = new ekhv();
                ekhvVar.h(bxbf.a);
                ekqg ekqgVarListIterator = ekhvVar.g().listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    str = (String) ekqgVarListIterator.next();
                    if (string.contains(str)) {
                        z = true;
                        break loop0;
                    }
                }
            }
            str = "";
            z = false;
        } else {
            str = "";
            z = false;
        }
        if (z) {
            ekrw ekrwVarJ = bxbh.a.j();
            ekrwVarJ.X(eksq.a, "strictmode_in_txn");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "strictmodeViolationCallback", 85, "Post29PolicyMaker.java")).t("exempted by %s", str);
            return;
        }
        ekrg ekrgVar = bxbh.a;
        ekrw ekrwVarJ2 = ekrgVar.j();
        ekrz ekrzVar = eksq.a;
        ekrwVarJ2.X(ekrzVar, "strictmode_in_txn");
        ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "strictmodeViolationCallback", 72, "Post29PolicyMaker.java")).t("violation %s", violation == null ? null : violation.getMessage());
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement2 : stackTrace) {
                ekrw ekrwVarJ3 = ekrgVar.j();
                ekrwVarJ3.X(ekrzVar, "strictmode_in_txn");
                ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "strictmodeViolationCallback", 75, "Post29PolicyMaker.java")).t("   %s", stackTraceElement2);
            }
        }
        ekrw ekrwVarJ4 = ekrgVar.j();
        ekrwVarJ4.X(ekrzVar, "strictmode_in_txn");
        ((ekrd) ((ekrd) ekrwVarJ4).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "logCurrentOutermostTransactionStackOnThisThread", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Post29PolicyMaker.java")).q("unknown where transaction was acquired.  Running logging outside of transaction?");
        auvh.d(new AssertionError("StrictMode violation while in a transaction: ".concat(String.valueOf(violation != null ? violation.getClass().getSimpleName() : null))));
    }
}
