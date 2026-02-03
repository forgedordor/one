package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drwk implements drwm {
    private final drwj a;

    public drwk(Context context) {
        drwj drwjVar = new drwj(context);
        this.a = drwjVar;
        drwjVar.c();
    }

    @Override // defpackage.drwm
    public final void a(drwv drwvVar) {
        drwvVar.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }

    @Override // defpackage.ejxr
    public final /* bridge */ /* synthetic */ Object get() {
        drwj drwjVar = this.a;
        drwjVar.c();
        return drwjVar;
    }
}
