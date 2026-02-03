package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class duab {
    public static duab c(String str, ejwi ejwiVar) {
        int i = elcz.a;
        elcv elcvVarF = elcx.a.f();
        elcvVarF.l(str);
        if (ejwiVar.g()) {
            elcvVarF.l("|");
            elcvVarF.l(dtvy.a((Account) ejwiVar.c()));
        }
        return new duaa(1, elcvVarF.r().toString());
    }

    public abstract String a();

    public abstract int b();

    public final String toString() {
        return a();
    }
}
