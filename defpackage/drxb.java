package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drxb implements drwm {
    public final Context a;
    public volatile boolean b;
    public drvm c;
    public volatile drwv d;
    private volatile boolean e;
    private final AtomicReference f = new AtomicReference();
    private volatile SharedPreferences.Editor g;

    public drxb(Context context) {
        this.a = context;
    }

    @Override // defpackage.drwm
    public final void a(drwv drwvVar) {
        this.d = drwvVar;
        if (this.b) {
            c();
        }
    }

    public final SharedPreferences b(SharedPreferences sharedPreferences, boolean z) {
        this.e = z;
        SharedPreferences sharedPreferences2 = (SharedPreferences) this.f.getAndSet(sharedPreferences);
        this.g = sharedPreferences.edit();
        return sharedPreferences2;
    }

    public final void c() {
        drwv drwvVar = this.d;
        if (drwvVar != null) {
            drwvVar.a();
        }
    }

    @Override // defpackage.ejxr
    public final /* bridge */ /* synthetic */ Object get() {
        return (SharedPreferences) this.f.get();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
