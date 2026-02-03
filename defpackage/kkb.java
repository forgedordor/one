package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kkb extends fdbr implements fdap {
    public static final kkb a = new kkb();

    public kkb() {
        super(1);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kkt kktVar = (kkt) obj;
        Handler handler = kktVar.getHandler();
        final fdae fdaeVar = kktVar.r;
        handler.post(new Runnable() { // from class: kka
            @Override // java.lang.Runnable
            public final void run() {
                fdaeVar.invoke();
            }
        });
        return fctx.a;
    }
}
