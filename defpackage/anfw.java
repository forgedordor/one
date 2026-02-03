package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anfw implements anfy, ajmh {
    public final fdjx a;
    public final cqmz b;
    private final fdjx c;
    private final fcsu d;
    private final ajmh e;

    public anfw(fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, cqmz cqmzVar, ajmh ajmhVar) {
        this.a = fdjxVar;
        this.c = fdjxVar2;
        this.d = fcsuVar;
        this.b = cqmzVar;
        this.e = ajmhVar;
    }

    public static final long V(amuy amuyVar) {
        if (amuyVar instanceof amua) {
            throw null;
        }
        if (amuyVar instanceof amuf) {
            return ((amuf) amuyVar).d;
        }
        throw new fctg();
    }

    private static final Uri W(amuy amuyVar) {
        if (amuyVar instanceof amuf) {
            return ((amte) ((amuf) amuyVar).c).d;
        }
        if (!(amuyVar instanceof amua)) {
            throw new fctg();
        }
        throw null;
    }

    @Override // defpackage.ajmh
    public final eiju A(MessageId messageId) {
        return this.e.A(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju B(MessageId messageId) {
        return this.e.B(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju C(MessageId messageId, String str, fhaz fhazVar) {
        return this.e.C(messageId, str, fhazVar);
    }

    @Override // defpackage.ajmh
    public final eiju D(MessageId messageId) {
        return this.e.D(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju E(MessageId messageId) {
        return this.e.E(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju F(MessageId messageId) {
        return this.e.F(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju G(ajmy ajmyVar) {
        return this.e.G(ajmyVar);
    }

    @Override // defpackage.ajmh
    public final eiju H(MessageId messageId) {
        return this.e.H(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju I(MessageId messageId, amvx amvxVar) {
        return this.e.I(messageId, amvxVar);
    }

    @Override // defpackage.ajmh
    public final void J(MessageId messageId) {
        this.e.J(messageId);
    }

    @Override // defpackage.ajmh
    public final void K(MessageId messageId, int i) {
        this.e.K(messageId, i);
    }

    @Override // defpackage.ajmh
    public final void L(ajlt ajltVar, int i) {
        this.e.L(ajltVar, i);
    }

    @Override // defpackage.ajmh
    public final eiju M(MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar, angn angnVar) {
        return this.e.M(messageId, anhjVar, ckmnVar, fhazVar, angnVar);
    }

    @Override // defpackage.ajmh
    public final eiju N(int i) {
        return this.e.N(5);
    }

    @Override // defpackage.ajmh
    public final eiju O(int i) {
        return this.e.O(i);
    }

    @Override // defpackage.ajmh
    public final eiju P() {
        return this.e.P();
    }

    @Override // defpackage.ajmh
    public final void Q(MessageId messageId, int i) {
        this.e.Q(messageId, i);
    }

    @Override // defpackage.ajmh
    public final void R(MessageId messageId, int i) {
        this.e.R(messageId, i);
    }

    @Override // defpackage.ajmh
    public final void S() {
        this.e.S();
    }

    @Override // defpackage.ajmh
    public final eiju T(MessageId messageId) {
        return this.e.T(messageId);
    }

    @Override // defpackage.anfy
    public final void U(ConversationId conversationId, MessageId messageId, amuy amuyVar) {
        if (!(messageId instanceof BugleMessageId)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Uri uriW = W(amuyVar);
        if (uriW == null) {
            return;
        }
        boolean z = amuyVar instanceof amuf;
        long jLongValue = amuyVar.a().longValue();
        if (!z) {
            if (!(amuyVar instanceof amua)) {
                throw new fctg();
            }
            throw null;
        }
        amvy amvyVar = ((amuf) amuyVar).c;
        bxoz bxozVar = (bxoz) this.d.b();
        if (((bxph) bxozVar.a).c.a.containsKey(Uri.parse(uriW.toString()))) {
            return;
        }
        auvw.k(this.c, null, null, new anfv(bxozVar, conversationId, this, messageId, amuyVar, ((amte) amvyVar).a, uriW, jLongValue, null), 3);
    }

    @Override // defpackage.ajmh
    public final ajlu a() {
        return this.e.a();
    }

    @Override // defpackage.anfy
    public final void b(amuy amuyVar) {
        Uri uriW = W(amuyVar);
        if (uriW == null) {
            return;
        }
        bxoz bxozVar = (bxoz) this.d.b();
        final long jV = V(amuyVar);
        final bxph bxphVar = (bxph) bxozVar.a;
        auvh.h(eijx.g(new Callable() { // from class: bxpb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final long j = jV;
                return (Boolean) bxphVar.d.c("RichCardMessagePartMediaDownloadHandler#onStart", new ejxr() { // from class: bxpa
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String[] strArr = PartsTable.a;
                        bsjh bsjhVar = new bsjh();
                        bsjhVar.x(bvdy.USER_CANCELED);
                        return Boolean.valueOf(bsjhVar.c(String.valueOf(j)));
                    }
                });
            }
        }, bxphVar.b));
        bxphVar.a(uriW);
    }

    @Override // defpackage.anfy
    public final void c(amuy amuyVar) {
        if (amuyVar instanceof amuf) {
            auvw.k(this.c, null, null, new anfu(this, ((amte) ((amuf) amuyVar).c).b, amuyVar, null), 3);
        } else {
            if (!(amuyVar instanceof amua)) {
                throw new fctg();
            }
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.e.close();
    }

    @Override // defpackage.ajmh
    public final ajlw d() {
        throw null;
    }

    @Override // defpackage.ajmh
    public final ajma e() {
        return this.e.e();
    }

    @Override // defpackage.ajmh
    public final ajmp f() {
        throw null;
    }

    @Override // defpackage.ajmh
    public final ConversationId g() {
        return this.e.g();
    }

    @Override // defpackage.ajmh
    public final anpj h() {
        return this.e.h();
    }

    @Override // defpackage.ajmh
    public final anpj i(MessageId messageId) {
        return this.e.i(messageId);
    }

    @Override // defpackage.ajmh
    public final anpj j() {
        return this.e.j();
    }

    @Override // defpackage.ajmh
    public final anpj k() {
        return this.e.k();
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
        return this.e.n(messageId, anhjVar, ckmnVar, fhazVar);
    }

    @Override // defpackage.ajmh
    public final eiju o(MessageId messageId) {
        return this.e.o(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju p(ekgb ekgbVar) {
        return this.e.p(ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju q() {
        return this.e.q();
    }

    @Override // defpackage.ajmh
    public final eiju r(ekgb ekgbVar) {
        return this.e.r(ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju s(ekgb ekgbVar, cdyt cdytVar) {
        return this.e.s(ekgbVar, cdytVar);
    }

    @Override // defpackage.ajmh
    public final eiju t(ekgb ekgbVar) {
        return this.e.t(ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju u() {
        return this.e.u();
    }

    @Override // defpackage.ajmh
    public final eiju v(MessageId messageId) {
        return this.e.v(messageId);
    }

    @Override // defpackage.ajmh
    public final eiju w() {
        return this.e.w();
    }

    @Override // defpackage.ajmh
    public final eiju x() {
        return this.e.x();
    }

    @Override // defpackage.ajmh
    public final eiju y() {
        throw null;
    }

    @Override // defpackage.ajmh
    public final eiju z() {
        return this.e.z();
    }
}
