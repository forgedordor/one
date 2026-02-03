package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csme {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;

    public csme(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.d = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public final void a() throws IOException {
        eieu eieuVarH = eiiy.h("SpatulaSettingsChecker.getAccountIdAndCheckSpatulaSettings");
        try {
            ekrg ekrgVar = a;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "BugleSpam");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker", "getAccountIdAndCheckSpatulaSettings", 46, "SpatulaSettingsChecker.kt")).q("Retrieving account id and checking Spatula settings.");
            if (((csmf) this.c.b()).a() == null) {
                auvw.k(this.d, null, null, new csmd(this, null), 3);
                fczl.a(eieuVarH, null);
            } else {
                ekrw ekrwVarH2 = ekrgVar.h();
                ekrwVarH2.X(ekrzVar, "BugleSpam");
                ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker", "getAccountIdAndCheckSpatulaSettings", 51, "SpatulaSettingsChecker.kt")).q("Last used SpatulaSettings is already initialized.");
                fczl.a(eieuVarH, null);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    public final boolean b() throws IOException {
        csmb csmbVarA;
        eieu eieuVarH = eiiy.h("SpatulaSettingsChecker.isSpatulaEnabled");
        try {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleSpam");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker", "isSpatulaEnabled", 28, "SpatulaSettingsChecker.kt")).q("Checking if spatula is enabled.");
            if (!crtr.e() || (csmbVarA = ((csmf) this.c.b()).a()) == null) {
                fczl.a(eieuVarH, null);
                return false;
            }
            boolean z = csmbVarA.a;
            fczl.a(eieuVarH, null);
            return z;
        } finally {
        }
    }
}
