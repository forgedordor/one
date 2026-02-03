package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahfi extends Exception {
    private ahfi(String str) {
        super(str);
    }

    public static void a(Intent intent, String str) throws ahfi {
        String action = intent.getAction();
        if (action == null || !action.equals(str)) {
            throw new ahfi(String.format("Action %s is not recognized. %s was expected", action, str));
        }
    }

    public static void b(Intent intent, String str) throws ahfi {
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            throw new ahfi(String.format("%s intent is missing extras.", intent.getAction()));
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 == null || !extras2.containsKey(str)) {
            throw new ahfi(String.format("%s intent is missing an expected extra: %s", intent.getAction(), str));
        }
    }
}
