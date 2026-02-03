package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveMmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzo implements ayms {
    private final fcsu a;
    private final fcsu b;

    public axzo(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
    }

    public final /* bridge */ /* synthetic */ Action a(int i, byte[] bArr, long j, int i2, int i3) {
        aybf aybfVar = (aybf) this.a.b();
        aybfVar.getClass();
        return new ReceiveMmsMessageAction(i, bArr, j, i2, i3, aybfVar);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        parcel.getClass();
        aybf aybfVar = (aybf) this.b.b();
        aybfVar.getClass();
        return new ReceiveMmsMessageAction(parcel, aybfVar);
    }
}
