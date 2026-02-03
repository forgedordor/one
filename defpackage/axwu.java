package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerFavoriteAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwu implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public axwu(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
    }

    public final /* synthetic */ Action a(ezol ezolVar, String str, String str2, boolean z) {
        cema cemaVar = (cema) this.b.b();
        cemaVar.getClass();
        cemk cemkVar = (cemk) this.c.b();
        cemkVar.getClass();
        cfeh cfehVar = (cfeh) this.d.b();
        cfehVar.getClass();
        str.getClass();
        str2.getClass();
        return new ProcessExpressiveStickerFavoriteAction(this.a, cemaVar, cemkVar, cfehVar, this.e, ezolVar, str, str2, z);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cema cemaVar = (cema) this.b.b();
        cemaVar.getClass();
        cemk cemkVar = (cemk) this.c.b();
        cemkVar.getClass();
        cfeh cfehVar = (cfeh) this.d.b();
        cfehVar.getClass();
        parcel.getClass();
        return new ProcessExpressiveStickerFavoriteAction(this.a, cemaVar, cemkVar, cfehVar, this.e, parcel);
    }
}
