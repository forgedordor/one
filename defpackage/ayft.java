package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ResumeRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayft implements ayqj {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public ayft(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
        fcsuVar6.getClass();
        this.f = fcsuVar6;
        fcsuVar7.getClass();
        this.g = fcsuVar7;
        fcsuVar8.getClass();
        this.h = fcsuVar8;
        fcsuVar9.getClass();
        this.i = fcsuVar9;
    }

    @Override // defpackage.ayqj
    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType) {
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        ains ainsVar = (ains) this.c.b();
        ainsVar.getClass();
        eosc eoscVar = (eosc) this.d.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) this.e.b();
        eoscVar2.getClass();
        cohh cohhVar = (cohh) this.f.b();
        cohhVar.getClass();
        coor coorVar = (coor) this.g.b();
        coorVar.getClass();
        atgy atgyVar = (atgy) this.i.b();
        atgyVar.getClass();
        messageIdType.getClass();
        return new ResumeRcsFileTransferAction(this.a, cogwVar, ainsVar, eoscVar, eoscVar2, cohhVar, coorVar, this.h, atgyVar, messageIdType);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        ains ainsVar = (ains) this.c.b();
        ainsVar.getClass();
        eosc eoscVar = (eosc) this.d.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) this.e.b();
        eoscVar2.getClass();
        cohh cohhVar = (cohh) this.f.b();
        cohhVar.getClass();
        coor coorVar = (coor) this.g.b();
        coorVar.getClass();
        atgy atgyVar = (atgy) this.i.b();
        atgyVar.getClass();
        parcel.getClass();
        return new ResumeRcsFileTransferAction(this.a, cogwVar, ainsVar, eoscVar, eoscVar2, cohhVar, coorVar, this.h, atgyVar, parcel);
    }
}
