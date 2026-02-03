package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amhl implements alza {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/RootBugleMessageRepository");
    public final alza b;
    private final fctc c;
    private final fctc d;

    public amhl(fcsu fcsuVar, final fcsu fcsuVar2, final fcsu fcsuVar3, final fcsu fcsuVar4, final BugleConversationId bugleConversationId, anpj anpjVar, anpj anpjVar2, anpj anpjVar3, alxh alxhVar, final boolean z, boolean z2) {
        this.b = ((amdy) fcsuVar.b()).b(bugleConversationId, anpjVar, anpjVar2, anpjVar3, alxhVar, z, z2, this);
        this.c = fctd.a(new fdae() { // from class: amhj
            @Override // defpackage.fdae
            public final Object invoke() {
                ancb ancbVar = (ancb) fcsuVar2.b();
                alza alzaVar = this.b;
                anca ancaVarA = ancbVar.a(alzaVar);
                boolean zBooleanValue = ((Boolean) ames.b.e()).booleanValue();
                BugleConversationId bugleConversationId2 = bugleConversationId;
                if (!zBooleanValue || !z) {
                    ekrd ekrdVar = (ekrd) amhl.a.h();
                    ekrdVar.X(cqnc.t, bugleConversationId2);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/RootBugleMessageRepository", "pager_delegate$lambda$0", 116, "RootBugleMessageRepository.kt")).q("Using standard message pager created by RootBugleMessageRepository (OMv1 disabled).");
                    return ancaVarA;
                }
                fcsu fcsuVar5 = fcsuVar3;
                ekrd ekrdVar2 = (ekrd) amhl.a.h();
                ekrdVar2.X(cqnc.t, bugleConversationId2);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/RootBugleMessageRepository", "pager_delegate$lambda$0", 109, "RootBugleMessageRepository.kt")).q("Using optimistic message pager created by RootBugleMessageRepository (OMv1 enabled).");
                return ((andg) fcsuVar5.b()).a(ancaVarA, alzaVar);
            }
        });
        this.d = fctd.a(new fdae() { // from class: amhk
            @Override // defpackage.fdae
            public final Object invoke() {
                ankd ankdVar = (ankd) fcsuVar4.b();
                final amhl amhlVar = this;
                return ankdVar.a(Optional.of(amhlVar.b), new fcsu() { // from class: amhh
                    @Override // defpackage.fcsu
                    public final Object b() {
                        ajmp ajmpVarF = amhlVar.b.f();
                        ajmpVarF.getClass();
                        return ajmpVarF;
                    }
                }, new fcsu() { // from class: amhi
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return amhlVar.a().a();
                    }
                });
            }
        });
    }

    @Override // defpackage.ajmh
    public final eiju A(MessageId messageId) {
        eiju eijuVarA = this.b.A(messageId);
        eijuVarA.getClass();
        return eijuVarA;
    }

    @Override // defpackage.ajmh
    public final eiju B(MessageId messageId) {
        eiju eijuVarB = this.b.B(messageId);
        eijuVarB.getClass();
        return eijuVarB;
    }

    @Override // defpackage.ajmh
    public final eiju C(MessageId messageId, String str, fhaz fhazVar) {
        return this.b.C(messageId, str, fhazVar);
    }

    @Override // defpackage.ajmh
    public final eiju D(MessageId messageId) {
        eiju eijuVarD = this.b.D(messageId);
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajmh
    public final eiju E(MessageId messageId) {
        eiju eijuVarE = this.b.E(messageId);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.ajmh
    public final eiju F(MessageId messageId) {
        return this.b.F(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju G(ajmy ajmyVar) {
        eiju eijuVarG = this.b.G(ajmyVar);
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.ajmh
    public final eiju H(MessageId messageId) {
        return this.b.H(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju I(MessageId messageId, amvx amvxVar) {
        eiju eijuVarI = this.b.I(messageId, amvxVar);
        eijuVarI.getClass();
        return eijuVarI;
    }

    @Override // defpackage.ajmh
    public final void J(MessageId messageId) {
        this.b.J(messageId);
    }

    @Override // defpackage.ajmh
    public final void K(MessageId messageId, int i) {
        this.b.K(messageId, i);
    }

    @Override // defpackage.ajmh
    public final void L(ajlt ajltVar, int i) {
        this.b.L(ajltVar, i);
    }

    @Override // defpackage.ajmh
    public final eiju M(MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar, angn angnVar) {
        return this.b.M(messageId, anhjVar, ckmnVar, fhazVar, angnVar);
    }

    @Override // defpackage.ajmh
    public final eiju N(int i) {
        return this.b.N(5);
    }

    @Override // defpackage.ajmh
    public final eiju O(int i) {
        return this.b.O(i);
    }

    @Override // defpackage.ajmh
    public final eiju P() {
        return this.b.P();
    }

    @Override // defpackage.ajmh
    public final void Q(MessageId messageId, int i) {
        this.b.Q(messageId, i);
    }

    @Override // defpackage.ajmh
    public final void R(MessageId messageId, int i) {
        this.b.R(messageId, i);
    }

    @Override // defpackage.ajmh
    public final void S() {
        this.b.S();
    }

    @Override // defpackage.ajmh
    public final eiju T(MessageId messageId) {
        return this.b.T(messageId);
    }

    @Override // defpackage.alza
    public final BugleConversationId U() {
        BugleConversationId bugleConversationId = ((amdx) this.b).k;
        bugleConversationId.getClass();
        return bugleConversationId;
    }

    @Override // defpackage.alza
    public final eiju V(String str) {
        eiju eijuVarV = this.b.V(str);
        eijuVarV.getClass();
        return eijuVarV;
    }

    @Override // defpackage.alza
    public final eiju W(MessageId messageId) {
        eiju eijuVarW = this.b.W(messageId);
        eijuVarW.getClass();
        return eijuVarW;
    }

    @Override // defpackage.alza
    public final eiju X(ckwl ckwlVar) {
        return this.b.X(ckwlVar);
    }

    @Override // defpackage.alza
    public final eiju Y(Instant instant) {
        return this.b.Y(instant);
    }

    @Override // defpackage.alza
    public final eiju Z(int i) {
        return this.b.Z(i);
    }

    @Override // defpackage.ajmh
    public final ajlu a() {
        ajlu ajluVarA = this.b.a();
        ajluVarA.getClass();
        return ajluVarA;
    }

    @Override // defpackage.alza
    public final eiju aa(aoff aoffVar) {
        eiju eijuVarAa = this.b.aa(aoffVar);
        eijuVarAa.getClass();
        return eijuVarAa;
    }

    @Override // defpackage.alza
    public final void ab() {
        this.b.ab();
    }

    @Override // defpackage.alza
    public final eiju ac(aoer aoerVar, amvr amvrVar, basd basdVar, Instant instant, MessageId messageId) {
        return this.b.ac(aoerVar, amvrVar, basdVar, instant, messageId);
    }

    @Override // defpackage.ancc
    public final ajly ad(MessageId messageId, Instant instant) {
        throw null;
    }

    @Override // defpackage.ancc
    public final andp ae() {
        throw null;
    }

    @Override // defpackage.ancc
    public final eiju ai(int i, int i2) {
        throw null;
    }

    @Override // defpackage.ancc
    public final Instant aj(MessageId messageId) {
        throw null;
    }

    @Override // defpackage.ankf
    public final void al(ajlx ajlxVar) {
        this.b.al(ajlxVar);
    }

    @Override // defpackage.ancc
    public final void am() {
        this.b.am();
    }

    @Override // defpackage.ancc, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.ajmh
    public final ajlw d() {
        Object objA = this.d.a();
        objA.getClass();
        return (ajlw) objA;
    }

    @Override // defpackage.ajmh
    public final ajma e() {
        Object objA = this.c.a();
        objA.getClass();
        return (andq) objA;
    }

    @Override // defpackage.ajmh
    public final ajmp f() {
        throw null;
    }

    @Override // defpackage.ajmh
    public final ConversationId g() {
        BugleConversationId bugleConversationId = ((amdx) this.b).k;
        bugleConversationId.getClass();
        return bugleConversationId;
    }

    @Override // defpackage.ajmh
    public final anpj h() {
        return this.b.h();
    }

    @Override // defpackage.ajmh
    public final anpj i(MessageId messageId) {
        return this.b.i(messageId);
    }

    @Override // defpackage.ajmh
    public final anpj j() {
        anpj anpjVarJ = this.b.j();
        anpjVarJ.getClass();
        return anpjVarJ;
    }

    @Override // defpackage.ajmh
    public final anpj k() {
        return this.b.k();
    }

    @Override // defpackage.ajmh
    public final cquc l(ajmg ajmgVar) {
        throw null;
    }

    @Override // defpackage.ajmh
    public final /* synthetic */ eiju m(MessageId messageId, ekgb ekgbVar) {
        return ajmd.a();
    }

    @Override // defpackage.ajmh
    public final eiju n(MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar) {
        return this.b.n(messageId, anhjVar, ckmnVar, fhazVar);
    }

    @Override // defpackage.ajmh
    public final eiju o(MessageId messageId) {
        eiju eijuVarO = this.b.o(messageId);
        eijuVarO.getClass();
        return eijuVarO;
    }

    @Override // defpackage.ajmh
    public final eiju p(ekgb ekgbVar) {
        eiju eijuVarP = this.b.p(ekgbVar);
        eijuVarP.getClass();
        return eijuVarP;
    }

    @Override // defpackage.ajmh
    public final eiju q() {
        eiju eijuVarQ = this.b.q();
        eijuVarQ.getClass();
        return eijuVarQ;
    }

    @Override // defpackage.ajmh
    public final eiju r(ekgb ekgbVar) {
        return this.b.r(ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju s(ekgb ekgbVar, cdyt cdytVar) {
        return this.b.s(ekgbVar, cdytVar);
    }

    @Override // defpackage.ajmh
    public final eiju t(ekgb ekgbVar) {
        eiju eijuVarT = this.b.t(ekgbVar);
        eijuVarT.getClass();
        return eijuVarT;
    }

    @Override // defpackage.ajmh
    public final eiju u() {
        return this.b.u();
    }

    @Override // defpackage.ajmh
    public final eiju v(MessageId messageId) {
        eiju eijuVarV = this.b.v(messageId);
        eijuVarV.getClass();
        return eijuVarV;
    }

    @Override // defpackage.ajmh
    public final eiju w() {
        eiju eijuVarW = this.b.w();
        eijuVarW.getClass();
        return eijuVarW;
    }

    @Override // defpackage.ajmh
    public final eiju x() {
        eiju eijuVarX = this.b.x();
        eijuVarX.getClass();
        return eijuVarX;
    }

    @Override // defpackage.ajmh
    public final eiju y() {
        eiju eijuVarY = this.b.y();
        eijuVarY.getClass();
        return eijuVarY;
    }

    @Override // defpackage.ajmh
    public final eiju z() {
        eiju eijuVarZ = this.b.z();
        eijuVarZ.getClass();
        return eijuVarZ;
    }
}
