package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axqc extends aypg {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;

    public axqc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14) {
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
        fcsuVar7.getClass();
        this.g = fcsuVar7;
        fcsuVar8.getClass();
        this.h = fcsuVar8;
        fcsuVar9.getClass();
        this.i = fcsuVar9;
        fcsuVar10.getClass();
        this.j = fcsuVar10;
        fcsuVar11.getClass();
        this.k = fcsuVar11;
        fcsuVar12.getClass();
        this.l = fcsuVar12;
        fcsuVar13.getClass();
        this.m = fcsuVar13;
        fcsuVar14.getClass();
        this.n = fcsuVar14;
    }

    @Override // defpackage.aypg
    public final /* bridge */ /* synthetic */ Action a(MessageCoreData messageCoreData, boolean z, elny elnyVar, bvdk bvdkVar, int i, Optional optional, long j, boolean z2) {
        dqsn dqsnVar = (dqsn) this.c.b();
        dqsnVar.getClass();
        alrj alrjVar = (alrj) this.d.b();
        alrjVar.getClass();
        cgdh cgdhVar = (cgdh) this.e.b();
        cgdhVar.getClass();
        axqb axqbVar = (axqb) this.h.b();
        axqbVar.getClass();
        ((apwn) this.k.b()).getClass();
        arnv arnvVar = (arnv) this.l.b();
        arnvVar.getClass();
        aqzn aqznVar = (aqzn) this.m.b();
        aqznVar.getClass();
        messageCoreData.getClass();
        fcsu fcsuVar = this.n;
        fcsu fcsuVar2 = this.i;
        fcsu fcsuVar3 = this.j;
        return new InsertNewMessageAction(this.a, this.b, dqsnVar, alrjVar, cgdhVar, this.f, this.g, axqbVar, fcsuVar2, fcsuVar3, arnvVar, aqznVar, fcsuVar, messageCoreData, z, elnyVar, bvdkVar, i, optional, j, z2);
    }

    @Override // defpackage.aypg
    public final /* bridge */ /* synthetic */ Action b(int i, ekgb ekgbVar, String str, String str2, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, boolean z, boolean z2, elny elnyVar, DeviceData deviceData, boolean z3, ArrayList arrayList, boolean z4, fhaz fhazVar) {
        dqsn dqsnVar = (dqsn) this.c.b();
        dqsnVar.getClass();
        alrj alrjVar = (alrj) this.d.b();
        alrjVar.getClass();
        cgdh cgdhVar = (cgdh) this.e.b();
        cgdhVar.getClass();
        axqb axqbVar = (axqb) this.h.b();
        axqbVar.getClass();
        ((apwn) this.k.b()).getClass();
        arnv arnvVar = (arnv) this.l.b();
        arnvVar.getClass();
        aqzn aqznVar = (aqzn) this.m.b();
        aqznVar.getClass();
        ekgbVar.getClass();
        elnyVar.getClass();
        fcsu fcsuVar = this.n;
        fcsu fcsuVar2 = this.i;
        fcsu fcsuVar3 = this.j;
        return new InsertNewMessageAction(this.a, this.b, dqsnVar, alrjVar, cgdhVar, this.f, this.g, axqbVar, fcsuVar2, fcsuVar3, arnvVar, aqznVar, fcsuVar, i, ekgbVar, str, str2, conversationIdType, selfIdentityId, z, z2, elnyVar, deviceData, z3, arrayList, z4, fhazVar);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        dqsn dqsnVar = (dqsn) this.c.b();
        dqsnVar.getClass();
        alrj alrjVar = (alrj) this.d.b();
        alrjVar.getClass();
        cgdh cgdhVar = (cgdh) this.e.b();
        cgdhVar.getClass();
        axqb axqbVar = (axqb) this.h.b();
        axqbVar.getClass();
        ((apwn) this.k.b()).getClass();
        arnv arnvVar = (arnv) this.l.b();
        arnvVar.getClass();
        aqzn aqznVar = (aqzn) this.m.b();
        aqznVar.getClass();
        parcel.getClass();
        fcsu fcsuVar = this.n;
        fcsu fcsuVar2 = this.i;
        fcsu fcsuVar3 = this.j;
        return new InsertNewMessageAction(this.a, this.b, dqsnVar, alrjVar, cgdhVar, this.f, this.g, axqbVar, fcsuVar2, fcsuVar3, arnvVar, aqznVar, fcsuVar, parcel);
    }
}
