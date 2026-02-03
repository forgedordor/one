package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amyn implements amzd, ajmh {
    public final amoc a;
    public final amzc b;
    public final amyt c;
    public final ajmh d;
    public final amqz e;
    public final anpj f;
    public final anpj g;
    private final aqun i;
    private final fctc j = fctd.a(new fdae() { // from class: amyk
        @Override // defpackage.fdae
        public final Object invoke() {
            amyn amynVar = this.a;
            ajlu ajluVarA = amynVar.d.a();
            ajluVarA.getClass();
            return amynVar.a.a((amky) ajluVarA, amynVar, amynVar.e, amynVar.f, amynVar.g);
        }
    });
    public final fctc h = fctd.a(new fdae() { // from class: amyl
        @Override // defpackage.fdae
        public final Object invoke() {
            amyn amynVar = this.a;
            amyt amytVar = amynVar.c;
            fcsu fcsuVar = amytVar.a;
            alza alzaVar = (alza) amynVar.d;
            fdjx fdjxVar = (fdjx) fcsuVar.b();
            fdjxVar.getClass();
            ccwp ccwpVar = (ccwp) amytVar.b.b();
            ccwpVar.getClass();
            ((aquq) amytVar.c.b()).getClass();
            return new amys(fdjxVar, ccwpVar, alzaVar);
        }
    });
    private final fctc k = fctd.a(new fdae() { // from class: amym
        @Override // defpackage.fdae
        public final Object invoke() {
            amyn amynVar = this.a;
            ajma ajmaVarE = amynVar.d.e();
            amys amysVar = (amys) amynVar.h.a();
            amzc amzcVar = amynVar.b;
            fdjx fdjxVar = (fdjx) amzcVar.a.b();
            fdjxVar.getClass();
            eosc eoscVar = (eosc) amzcVar.b.b();
            eoscVar.getClass();
            ajmaVarE.getClass();
            amysVar.getClass();
            return new amzb(fdjxVar, eoscVar, ajmaVarE, amysVar);
        }
    });

    public amyn(amoc amocVar, amzc amzcVar, aqun aqunVar, amyt amytVar, ajmh ajmhVar, amqz amqzVar, anpj anpjVar, anpj anpjVar2) {
        this.a = amocVar;
        this.b = amzcVar;
        this.i = aqunVar;
        this.c = amytVar;
        this.d = ajmhVar;
        this.e = amqzVar;
        this.f = anpjVar;
        this.g = anpjVar2;
    }

    @Override // defpackage.ajmh
    public final eiju A(MessageId messageId) {
        return this.d.A(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju B(MessageId messageId) {
        return this.d.B(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju C(MessageId messageId, String str, fhaz fhazVar) {
        return this.d.C(messageId, str, fhazVar);
    }

    @Override // defpackage.ajmh
    public final eiju D(MessageId messageId) {
        return this.d.D(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju E(MessageId messageId) {
        return this.d.E(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju F(MessageId messageId) {
        return this.d.F(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju G(ajmy ajmyVar) {
        return this.d.G(ajmyVar);
    }

    @Override // defpackage.ajmh
    public final eiju H(MessageId messageId) {
        return this.d.H(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju I(MessageId messageId, amvx amvxVar) {
        return this.d.I(messageId, amvxVar);
    }

    @Override // defpackage.ajmh
    public final void J(MessageId messageId) {
        this.d.J(messageId);
    }

    @Override // defpackage.ajmh
    public final void K(MessageId messageId, int i) {
        this.d.K(messageId, i);
    }

    @Override // defpackage.ajmh
    public final void L(ajlt ajltVar, int i) {
        this.d.L(ajltVar, i);
    }

    @Override // defpackage.ajmh
    public final eiju M(MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar, angn angnVar) {
        return this.d.M(messageId, anhjVar, ckmnVar, fhazVar, angnVar);
    }

    @Override // defpackage.ajmh
    public final eiju N(int i) {
        return this.d.N(5);
    }

    @Override // defpackage.ajmh
    public final eiju O(int i) {
        return this.d.O(i);
    }

    @Override // defpackage.ajmh
    public final eiju P() {
        return this.d.P();
    }

    @Override // defpackage.ajmh
    public final void Q(MessageId messageId, int i) {
        this.d.Q(messageId, i);
    }

    @Override // defpackage.ajmh
    public final void R(MessageId messageId, int i) {
        this.d.R(messageId, i);
    }

    @Override // defpackage.ajmh
    public final void S() {
        this.d.S();
    }

    @Override // defpackage.ajmh
    public final eiju T(MessageId messageId) {
        return this.d.T(messageId);
    }

    @Override // defpackage.ajmh
    public final ajlu a() {
        return (amob) this.j.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.d.close();
    }

    @Override // defpackage.ajmh
    public final ajlw d() {
        throw null;
    }

    @Override // defpackage.ajmh
    public final ajma e() {
        if (this.i.a()) {
            amzb amzbVar = (amzb) this.k.a();
            amzbVar.getClass();
            return amzbVar;
        }
        ajma ajmaVarE = this.d.e();
        ajmaVarE.getClass();
        return ajmaVarE;
    }

    @Override // defpackage.ajmh
    public final ajmp f() {
        throw null;
    }

    @Override // defpackage.ajmh
    public final ConversationId g() {
        return this.d.g();
    }

    @Override // defpackage.ajmh
    public final anpj h() {
        return this.d.h();
    }

    @Override // defpackage.ajmh
    public final anpj i(MessageId messageId) {
        return this.d.i(messageId);
    }

    @Override // defpackage.ajmh
    public final anpj j() {
        return this.d.j();
    }

    @Override // defpackage.ajmh
    public final anpj k() {
        return this.d.k();
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
        return this.d.n(messageId, anhjVar, ckmnVar, fhazVar);
    }

    @Override // defpackage.ajmh
    public final eiju o(MessageId messageId) {
        return this.d.o(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju p(ekgb ekgbVar) {
        return this.d.p(ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju q() {
        return this.d.q();
    }

    @Override // defpackage.ajmh
    public final eiju r(ekgb ekgbVar) {
        return this.d.r(ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju s(ekgb ekgbVar, cdyt cdytVar) {
        return this.d.s(ekgbVar, cdytVar);
    }

    @Override // defpackage.ajmh
    public final eiju t(ekgb ekgbVar) {
        return this.d.t(ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju u() {
        return this.d.u();
    }

    @Override // defpackage.ajmh
    public final eiju v(MessageId messageId) {
        return this.d.v(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju w() {
        return this.d.w();
    }

    @Override // defpackage.ajmh
    public final eiju x() {
        return this.d.x();
    }

    @Override // defpackage.ajmh
    public final eiju y() {
        throw null;
    }

    @Override // defpackage.ajmh
    public final eiju z() {
        return this.d.z();
    }
}
