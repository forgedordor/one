package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmvd extends ContentObserver {
    final /* synthetic */ fdci a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmvd(fdci fdciVar, Handler handler) {
        super(handler);
        this.a = fdciVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        dmbn dmbnVar = (dmbn) this.a.a;
        if (dmbnVar != null) {
            dmbnVar.e();
        }
    }
}
