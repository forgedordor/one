package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UploadAttachmentsToBlobstoreAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayld extends ayqp {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public ayld(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
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
        fcsuVar6.getClass();
        this.f = fcsuVar6;
    }

    @Override // defpackage.ayqp
    public final /* bridge */ /* synthetic */ Action a(ArrayList arrayList, String str, boolean z) {
        bvsl bvslVar = (bvsl) this.a.b();
        bvslVar.getClass();
        ceku cekuVar = (ceku) this.b.b();
        cekuVar.getClass();
        eosc eoscVar = (eosc) this.d.b();
        eoscVar.getClass();
        Optional optional = (Optional) this.e.b();
        optional.getClass();
        egej egejVar = (egej) this.f.b();
        egejVar.getClass();
        return new UploadAttachmentsToBlobstoreAction(bvslVar, cekuVar, this.c, eoscVar, optional, egejVar, arrayList, str, z);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bvsl bvslVar = (bvsl) this.a.b();
        bvslVar.getClass();
        ceku cekuVar = (ceku) this.b.b();
        cekuVar.getClass();
        eosc eoscVar = (eosc) this.d.b();
        eoscVar.getClass();
        Optional optional = (Optional) this.e.b();
        optional.getClass();
        egej egejVar = (egej) this.f.b();
        egejVar.getClass();
        parcel.getClass();
        return new UploadAttachmentsToBlobstoreAction(bvslVar, cekuVar, this.c, eoscVar, optional, egejVar, parcel);
    }
}
