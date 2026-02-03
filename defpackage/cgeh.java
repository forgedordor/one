package defpackage;

import android.app.Notification;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cgeh extends cgan {
    private final cgeg a;

    public cgeh(cgaz cgazVar, cgeg cgegVar, cgbe cgbeVar, String str, cgda cgdaVar) {
        super(cgazVar.b(cgbeVar, str, cgdaVar));
        this.a = new cgef(cgegVar);
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final Notification b() {
        return this.a.a(o());
    }
}
