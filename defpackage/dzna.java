package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzna implements ejxr {
    private final Context a;

    public dzna(Context context) {
        this.a = context;
    }

    @Override // defpackage.ejxr
    public final /* bridge */ /* synthetic */ Object get() {
        Context context = this.a;
        return dqyw.g(context) ? ejud.a : ejwi.j(new File(context.getFilesDir(), "primes/crash"));
    }
}
