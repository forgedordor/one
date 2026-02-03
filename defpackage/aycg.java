package defpackage;

import android.content.ContentValues;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveSmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aycg implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public aycg(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
    }

    public final /* bridge */ /* synthetic */ Action a(ContentValues contentValues) {
        contentValues.getClass();
        aydh aydhVar = (aydh) this.a.b();
        aydhVar.getClass();
        eosc eoscVar = (eosc) this.b.b();
        eoscVar.getClass();
        dzuc dzucVar = (dzuc) this.c.b();
        dzucVar.getClass();
        ajga ajgaVar = (ajga) this.d.b();
        ajgaVar.getClass();
        return new ReceiveSmsMessageAction(contentValues, aydhVar, eoscVar, dzucVar, ajgaVar);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        parcel.getClass();
        aydh aydhVar = (aydh) this.a.b();
        aydhVar.getClass();
        eosc eoscVar = (eosc) this.b.b();
        eoscVar.getClass();
        dzuc dzucVar = (dzuc) this.c.b();
        dzucVar.getClass();
        ajga ajgaVar = (ajga) this.d.b();
        ajgaVar.getClass();
        return new ReceiveSmsMessageAction(parcel, aydhVar, eoscVar, dzucVar, ajgaVar);
    }
}
