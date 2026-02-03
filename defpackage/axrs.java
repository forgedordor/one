package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axrs implements ayph {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public axrs(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
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

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InsertRcsMessageInTelephonyAction c(Parcel parcel) {
        parcel.getClass();
        chvp chvpVar = (chvp) this.b.b();
        chvpVar.getClass();
        cavl cavlVar = (cavl) this.c.b();
        cavlVar.getClass();
        eosc eoscVar = (eosc) this.d.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) this.e.b();
        eoscVar2.getClass();
        aprl aprlVar = (aprl) this.h.b();
        aprlVar.getClass();
        cawa cawaVar = (cawa) this.i.b();
        cawaVar.getClass();
        return new InsertRcsMessageInTelephonyAction(parcel, this.a, chvpVar, cavlVar, eoscVar, eoscVar2, this.f, this.g, aprlVar, cawaVar);
    }

    public final InsertRcsMessageInTelephonyAction b(ConversationIdType conversationIdType, MessageIdType messageIdType, aubq aubqVar, int i, Optional optional, boolean z) {
        conversationIdType.getClass();
        messageIdType.getClass();
        chvp chvpVar = (chvp) this.b.b();
        chvpVar.getClass();
        cavl cavlVar = (cavl) this.c.b();
        cavlVar.getClass();
        eosc eoscVar = (eosc) this.d.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) this.e.b();
        eoscVar2.getClass();
        aprl aprlVar = (aprl) this.h.b();
        aprlVar.getClass();
        cawa cawaVar = (cawa) this.i.b();
        cawaVar.getClass();
        return new InsertRcsMessageInTelephonyAction(conversationIdType, messageIdType, aubqVar, i, optional, z, this.a, chvpVar, cavlVar, eoscVar, eoscVar2, this.f, this.g, aprlVar, cawaVar);
    }
}
