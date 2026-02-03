package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alri {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/identity/MessagingIdentityDifferenceReporter");
    public final Context b;
    public final eygg c;
    public final eygg d;
    public final eygg e;
    public final eygg f;
    private final eygg g;

    public alri(Context context, eygg eyggVar, eygg eyggVar2, eygg eyggVar3, eygg eyggVar4, eygg eyggVar5) {
        this.b = context;
        this.c = eyggVar;
        this.d = eyggVar2;
        this.g = eyggVar3;
        this.e = eyggVar4;
        this.f = eyggVar5;
    }

    public static esvh b(awch awchVar, String str) {
        return new esvh(esvg.CONFIRMED_UPLOAD_SAFE_USER_DATA, str == null ? "null" : ((avog) awchVar.a(str)).a);
    }

    public final crnc a(String str) {
        if (str != null && str.length() == 2) {
            crnc crncVar = new crnc(((ephj) this.g.b()).a(str.toUpperCase(Locale.US)));
            if (!crncVar.b()) {
                return crncVar;
            }
        }
        return new crnc(0);
    }
}
