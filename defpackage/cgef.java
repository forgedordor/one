package defpackage;

import android.app.Notification;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgef implements cgeg {
    final /* synthetic */ cgeg a;
    private Supplier b;

    public cgef(cgeg cgegVar) {
        this.a = cgegVar;
    }

    @Override // defpackage.cgeg
    public final Notification a(String str) {
        if (this.b == null) {
            this.b = new cgee(this.a.a(str));
        }
        return ((cgee) this.b).a;
    }
}
