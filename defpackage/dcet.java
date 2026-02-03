package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dcet extends Exception {
    private final Intent a;

    public dcet(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public final Intent a() {
        return new Intent(this.a);
    }
}
