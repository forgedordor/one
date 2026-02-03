package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aslf {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/business/RbmBusinessInfoAndShortCodeUrlCreator");
    public static final aslc b = new aslc("rbm.goog");
    public final CronetEngine c;
    public final eosc d;
    public final crmx e;
    public final Context f;
    public final ewto g;

    public aslf(CronetEngine cronetEngine, eosc eoscVar, crmx crmxVar, Context context, ewto ewtoVar) {
        this.c = cronetEngine;
        this.d = eoscVar;
        this.e = crmxVar;
        this.f = context;
        this.g = ewtoVar;
    }

    static String a(String str) {
        return str.trim().replace("tel:", "");
    }
}
