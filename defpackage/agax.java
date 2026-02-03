package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agax {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher");
    private final adq b;

    public agax(eg egVar) {
        egVar.getClass();
        this.b = egVar.h;
    }

    public final Object a(String str, adx adxVar, Object obj, kun kunVar, fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        fdce fdceVar = new fdce();
        fdci fdciVar = new fdci();
        fdciVar.a = this.b.b(str, adxVar, new agav(fdceVar, fdiuVar, fdciVar));
        if (fdceVar.a) {
            ((adj) fdciVar.a).b();
            ((ekrd) a.j().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "launch", 53, "ActivityResultLauncher.kt")).q("Activity result callback already invoked upon registration.");
        } else {
            try {
                ((ekrd) a.e().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "launch", 56, "ActivityResultLauncher.kt")).t("Launching activity for result. key = %s", str);
                ((adj) fdciVar.a).a(obj, kunVar);
            } catch (Exception e) {
                ((ekrd) a.j().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "launch", 63, "ActivityResultLauncher.kt")).q("Launching activity threw exception, clearing registration and completing continuation with failure.");
                fdceVar.a = true;
                fdiuVar.w(fctl.a(e));
                ((adj) fdciVar.a).b();
            }
        }
        Object objM = fdiuVar.m();
        if (objM == fcyl.a) {
            fcxyVar.getClass();
        }
        return objM;
    }

    public final Object b(String str, adx adxVar, fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        fdce fdceVar = new fdce();
        fdci fdciVar = new fdci();
        fdciVar.a = this.b.b(str, adxVar, new agaw(fdceVar, fdiuVar, fdciVar));
        if (fdceVar.a) {
            ((ekrd) a.e().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher", "retrievePendingResult", 93, "ActivityResultLauncher.kt")).q("Activity result callback already invoked upon registration, unregistering launcher.");
            ((adj) fdciVar.a).b();
        }
        Object objM = fdiuVar.m();
        if (objM == fcyl.a) {
            fcxyVar.getClass();
        }
        return objM;
    }
}
