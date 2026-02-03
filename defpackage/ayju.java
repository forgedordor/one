package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayju implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public ayju(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
    }

    public final /* bridge */ /* synthetic */ Action a(String str, String str2, String str3, bvdt bvdtVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        ((bxmv) this.b.b()).getClass();
        bayy bayyVar = (bayy) this.c.b();
        bayyVar.getClass();
        dqsn dqsnVar = (dqsn) this.d.b();
        dqsnVar.getClass();
        str.getClass();
        str2.getClass();
        bvdtVar.getClass();
        return new UpdateAttachmentAfterResizingAction(context, bayyVar, dqsnVar, str, str2, str3, bvdtVar);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        ((bxmv) this.b.b()).getClass();
        bayy bayyVar = (bayy) this.c.b();
        bayyVar.getClass();
        dqsn dqsnVar = (dqsn) this.d.b();
        dqsnVar.getClass();
        parcel.getClass();
        return new UpdateAttachmentAfterResizingAction(context, bayyVar, dqsnVar, parcel);
    }
}
