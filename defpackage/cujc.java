package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/toast/ToastsControllerImpl");
    public final Context b;
    public final lvc c;
    public final cujd d;
    private final fdjx e;
    private boolean f;

    public cujc(Context context, fdjx fdjxVar, lvc lvcVar, cujd cujdVar) {
        fdjxVar.getClass();
        lvcVar.getClass();
        cujdVar.getClass();
        this.b = context;
        this.e = fdjxVar;
        this.c = lvcVar;
        this.d = cujdVar;
    }

    public final void a() {
        ((ekrd) a.e().h("com/google/android/apps/messaging/toast/ToastsControllerImpl", "initialize", 33, "ToastsControllerImpl.kt")).q("Initializing toast controller.");
        if (this.f) {
            return;
        }
        auvw.k(this.e, null, null, new cujb(this, null), 3);
        this.f = true;
    }
}
