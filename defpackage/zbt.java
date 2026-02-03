package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zbt extends fdcy {
    final /* synthetic */ zbu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbt(zbu zbuVar) {
        super(null);
        this.a = zbuVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        if (fdbq.f((MessageId) obj, (MessageId) obj2)) {
            return;
        }
        zbe zbeVar = (zbe) this.a.e.b();
        auvw.k(zbeVar.a, null, null, new zaw(zbeVar, null), 3);
    }
}
