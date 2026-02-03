package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SanitizeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygc implements ayqk {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public aygc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SanitizeParticipantsAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        dqsn dqsnVar = (dqsn) this.d.b();
        dqsnVar.getClass();
        parcel.getClass();
        return new SanitizeParticipantsAction(context, this.b, this.c, dqsnVar, parcel);
    }

    @Override // defpackage.ayqk
    public final /* bridge */ /* synthetic */ Action b() {
        Context context = (Context) this.a.b();
        context.getClass();
        dqsn dqsnVar = (dqsn) this.d.b();
        dqsnVar.getClass();
        return new SanitizeParticipantsAction(context, this.b, this.c, dqsnVar);
    }
}
