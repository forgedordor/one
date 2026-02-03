package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cgis {
    public static cgir m(cgit cgitVar, IconCompat iconCompat, CharSequence charSequence, Optional optional) {
        cggl cgglVar = new cggl();
        cgglVar.b(cgitVar);
        cgglVar.c = Optional.of(iconCompat);
        cgglVar.g(charSequence);
        cgglVar.c((Bundle) optional.orElse(new Bundle()));
        cgglVar.a = Optional.empty();
        cgglVar.b = Optional.empty();
        cgglVar.f(false);
        cgglVar.f = Optional.empty();
        cgglVar.d = Optional.empty();
        cgglVar.e(false);
        cgglVar.d(false);
        cgglVar.e = Optional.of(0);
        return cgglVar;
    }

    public static cgir n(cgit cgitVar, IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Optional optional) {
        cggl cgglVar = new cggl();
        cgglVar.b(cgitVar);
        cgglVar.a = Optional.of(pendingIntent);
        cgglVar.c((Bundle) optional.orElse(new Bundle()));
        cgglVar.c = Optional.of(iconCompat);
        cgglVar.g(charSequence);
        cgglVar.b = Optional.empty();
        cgglVar.f = Optional.empty();
        cgglVar.f(false);
        cgglVar.d = Optional.empty();
        cgglVar.e(false);
        cgglVar.d(false);
        cgglVar.e = Optional.of(0);
        return cgglVar;
    }

    public static cgir o(cgit cgitVar, IconCompat iconCompat, CharSequence charSequence, Intent intent, Optional optional) {
        cggl cgglVar = new cggl();
        cgglVar.b(cgitVar);
        cgglVar.a = Optional.empty();
        cgglVar.c((Bundle) optional.orElse(new Bundle()));
        cgglVar.b = Optional.of(intent);
        cgglVar.c = Optional.of(iconCompat);
        cgglVar.g(charSequence);
        cgglVar.f(true);
        cgglVar.f = Optional.empty();
        cgglVar.d = Optional.empty();
        cgglVar.e(false);
        cgglVar.d(false);
        cgglVar.e = Optional.of(0);
        return cgglVar;
    }

    public static cgis p(cgit cgitVar, kvf kvfVar, Optional optional) {
        cggl cgglVar = new cggl();
        cgglVar.b(cgitVar);
        cgglVar.c((Bundle) optional.orElse(new Bundle()));
        cgglVar.c = Optional.ofNullable(kvfVar.a());
        cgglVar.b = Optional.empty();
        cgglVar.f = Optional.empty();
        cgglVar.f(false);
        cgglVar.e(false);
        cgglVar.d(false);
        cgglVar.e = Optional.of(0);
        if (eotp.a("bugle.fix_null_check_for_android_x", "bugle")) {
            cgglVar.g((CharSequence) Objects.requireNonNullElse(kvfVar.h, ""));
        } else {
            cgglVar.g(kvfVar.h);
        }
        cgglVar.d = Optional.of(Boolean.valueOf(kvfVar.c));
        kxb[] kxbVarArr = kvfVar.b;
        if (kxbVarArr != null) {
            cgglVar.f = Optional.of(kxbVarArr);
        } else {
            cgglVar.f = Optional.empty();
        }
        PendingIntent pendingIntent = kvfVar.i;
        if (pendingIntent != null) {
            cgglVar.a = Optional.of(pendingIntent);
        }
        cgglVar.e = Optional.of(Integer.valueOf(kvfVar.e));
        return cgglVar.a();
    }

    public static cgir q(cgit cgitVar, IconCompat iconCompat, CharSequence charSequence, Intent intent, boolean z) {
        cggl cgglVar = new cggl();
        cgglVar.b(cgitVar);
        cgglVar.a = Optional.empty();
        cgglVar.b = Optional.of(intent);
        cgglVar.c = Optional.of(iconCompat);
        cgglVar.g(charSequence);
        cgglVar.f(false);
        cgglVar.f = Optional.empty();
        cgglVar.d = Optional.empty();
        cgglVar.c(new Bundle());
        cgglVar.e(true);
        cgglVar.d(z);
        cgglVar.e = Optional.of(0);
        return cgglVar;
    }

    public abstract Bundle a();

    public abstract cgit b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract CharSequence i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();
}
