package defpackage;

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class depf implements Runnable {
    final /* synthetic */ ChannelEventParcelable a;
    final /* synthetic */ depg b;

    public depf(depg depgVar, ChannelEventParcelable channelEventParcelable) {
        this.a = channelEventParcelable;
        this.b = depgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChannelEventParcelable channelEventParcelable = this.a;
        deph dephVar = this.b.a;
        channelEventParcelable.a(dephVar);
        channelEventParcelable.a(dephVar.J);
    }
}
