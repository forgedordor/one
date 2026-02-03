package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwy implements drwm {
    private final SharedPreferences a;
    private final String b;

    public drwy(Context context) {
        String strConcat = String.valueOf(context.getPackageName()).concat("null");
        this.b = strConcat;
        this.a = context.getSharedPreferences(strConcat, 0);
    }

    @Override // defpackage.ejxr
    public final /* synthetic */ Object get() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.drwm
    public final /* synthetic */ void a(drwv drwvVar) {
    }
}
