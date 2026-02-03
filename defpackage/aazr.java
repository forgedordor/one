package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.diagnostics.LogTelephonyDatabaseAction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazr extends aazq {
    public final fcsu a;

    public aazr(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LogTelephonyDatabaseAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        parcel.getClass();
        return new LogTelephonyDatabaseAction(context, parcel);
    }
}
