package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzj implements ayms {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;

    public axzj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RebuildShortcutsAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        Optional optional = (Optional) this.b.b();
        optional.getClass();
        baci baciVar = (baci) this.c.b();
        baciVar.getClass();
        eosd eosdVar = (eosd) this.d.b();
        eosdVar.getClass();
        eosd eosdVar2 = (eosd) this.e.b();
        eosdVar2.getClass();
        parcel.getClass();
        return new RebuildShortcutsAction(context, optional, baciVar, eosdVar, eosdVar2, parcel);
    }
}
