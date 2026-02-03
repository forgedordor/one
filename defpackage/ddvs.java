package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddvs extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ Context a;
    final /* synthetic */ defr b;
    private final WeakReference c;

    public ddvs(Context context, defr defrVar) {
        this.a = context;
        this.b = defrVar;
        this.c = new WeakReference(context);
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onGetDeviceContactsSyncSettingAction(Status status, String str) {
        if (status.d()) {
            Intent intent = new Intent(str);
            Bundle bundle = new Bundle();
            bundle.putString("ApplicationId", this.a.getPackageName());
            intent.putExtras(bundle);
            Context context = (Context) this.c.get();
            if (context != null) {
                context.startActivity(intent);
            }
            dcjb.b(status, null, this.b);
        }
    }
}
