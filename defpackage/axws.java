package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerAttachmentAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axws implements ayms {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;

    public axws(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessExpressiveStickerAttachmentAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        ((cqmr) this.c.b()).getClass();
        cogw cogwVar = (cogw) this.d.b();
        cogwVar.getClass();
        parcel.getClass();
        return new ProcessExpressiveStickerAttachmentAction(context, this.b, cogwVar, parcel);
    }
}
