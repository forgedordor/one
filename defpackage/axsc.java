package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axsc implements aypj {
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
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;

    public axsc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20) {
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
        fcsuVar15.getClass();
        this.o = fcsuVar15;
        fcsuVar16.getClass();
        this.p = fcsuVar16;
        fcsuVar17.getClass();
        this.q = fcsuVar17;
        fcsuVar18.getClass();
        fcsuVar19.getClass();
        this.r = fcsuVar19;
        fcsuVar20.getClass();
        this.s = fcsuVar20;
    }

    @Override // defpackage.aypj
    public final /* synthetic */ eiju a(ConversationIdType conversationIdType) {
        return eiju.g(aypi.c(this, conversationIdType, bary.a, true, false).r());
    }

    @Override // defpackage.aypj
    public final /* synthetic */ eiju b(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        return eiju.g(aypi.c(this, conversationIdType, messageIdType, true, false).r());
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        crmx crmxVar = (crmx) this.c.b();
        crmxVar.getClass();
        ains ainsVar = (ains) this.d.b();
        ainsVar.getClass();
        ajhd ajhdVar = (ajhd) this.e.b();
        ajhdVar.getClass();
        cmqj cmqjVar = (cmqj) this.f.b();
        cmqjVar.getClass();
        dqsn dqsnVar = (dqsn) this.g.b();
        dqsnVar.getClass();
        cmvy cmvyVar = (cmvy) this.h.b();
        cmvyVar.getClass();
        auuh auuhVar = (auuh) this.i.b();
        auuhVar.getClass();
        bxjh bxjhVar = (bxjh) this.j.b();
        bxjhVar.getClass();
        cgdh cgdhVar = (cgdh) this.k.b();
        cgdhVar.getClass();
        ((aptg) this.s.b()).getClass();
        parcel.getClass();
        return new MarkAsReadAction(context, cogwVar, crmxVar, ainsVar, ajhdVar, cmqjVar, dqsnVar, cmvyVar, auuhVar, bxjhVar, cgdhVar, this.l, this.m, this.n, this.o, this.p, this.q, this.r, parcel);
    }

    @Override // defpackage.aypj
    public final /* synthetic */ eiju d(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        return eiju.g(h(new ConversationIdType[]{conversationIdType}, messageIdType, true, false, -1, false).r());
    }

    @Override // defpackage.aypj
    public final /* synthetic */ void e(ConversationIdType conversationIdType) {
        aypi.a(this, conversationIdType, true);
    }

    @Override // defpackage.aypj
    public final /* synthetic */ Action f(ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z) {
        return aypi.c(this, conversationIdType, messageIdType, true, z);
    }

    @Override // defpackage.aypj
    public final /* synthetic */ Action g(ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType) {
        return h(conversationIdTypeArr, messageIdType, true, false, -1, true);
    }

    public final MarkAsReadAction h(ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType, boolean z, boolean z2, int i, boolean z3) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        crmx crmxVar = (crmx) this.c.b();
        crmxVar.getClass();
        ains ainsVar = (ains) this.d.b();
        ainsVar.getClass();
        ajhd ajhdVar = (ajhd) this.e.b();
        ajhdVar.getClass();
        cmqj cmqjVar = (cmqj) this.f.b();
        cmqjVar.getClass();
        dqsn dqsnVar = (dqsn) this.g.b();
        dqsnVar.getClass();
        cmvy cmvyVar = (cmvy) this.h.b();
        cmvyVar.getClass();
        auuh auuhVar = (auuh) this.i.b();
        auuhVar.getClass();
        bxjh bxjhVar = (bxjh) this.j.b();
        bxjhVar.getClass();
        cgdh cgdhVar = (cgdh) this.k.b();
        cgdhVar.getClass();
        ((aptg) this.s.b()).getClass();
        conversationIdTypeArr.getClass();
        messageIdType.getClass();
        return new MarkAsReadAction(context, cogwVar, crmxVar, ainsVar, ajhdVar, cmqjVar, dqsnVar, cmvyVar, auuhVar, bxjhVar, cgdhVar, this.l, this.m, this.n, this.o, this.p, this.q, this.r, conversationIdTypeArr, messageIdType, z, z2, i, z3);
    }

    @Override // defpackage.aypj
    public final /* synthetic */ void i(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        aypi.b(this, conversationIdType, messageIdType, true);
    }

    @Override // defpackage.aypj
    public final /* synthetic */ void j(ConversationIdType conversationIdType) {
        aypi.a(this, conversationIdType, false);
    }

    @Override // defpackage.aypj
    public final /* synthetic */ Action k() {
        return h(new ConversationIdType[0], bary.a, true, false, 1, true);
    }
}
