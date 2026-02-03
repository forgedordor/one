package defpackage;

import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deoy implements Runnable {
    final /* synthetic */ MessageEventParcelable a;
    final /* synthetic */ depg b;

    public deoy(depg depgVar, MessageEventParcelable messageEventParcelable) {
        this.a = messageEventParcelable;
        this.b = depgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.k(this.a);
    }
}
