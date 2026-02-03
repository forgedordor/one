package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akmb implements akmy, ajts {
    public final ajts a;
    private final asqe b;
    private final cgrc c;
    private final fctc d;

    public akmb(ajts ajtsVar, asqe asqeVar, cgrc cgrcVar) {
        cgrcVar.getClass();
        this.a = ajtsVar;
        this.b = asqeVar;
        this.c = cgrcVar;
        this.d = fctd.a(new fdae() { // from class: akma
            @Override // defpackage.fdae
            public final Object invoke() {
                ConversationId conversationIdD = this.a.a.d();
                conversationIdD.getClass();
                return new RbmConversationId(((BugleConversationId) conversationIdD).a);
            }
        });
    }

    @Override // defpackage.ajts
    public final int A() {
        return this.a.A();
    }

    @Override // defpackage.ajts
    public final int B() {
        return this.a.B();
    }

    @Override // defpackage.ajts
    public final long C() {
        return this.a.C();
    }

    @Override // defpackage.akmy
    public final asqe D() {
        return this.b;
    }

    @Override // defpackage.ajts
    public final akgk E() {
        return this.a.E();
    }

    @Override // defpackage.ajts
    public final avoe F() {
        return this.a.F();
    }

    @Override // defpackage.ajts
    public final awjl G() {
        return this.a.G();
    }

    @Override // defpackage.ajts
    public final cins H() {
        return this.a.H();
    }

    @Override // defpackage.ajts
    public final elwp I() {
        return this.a.I();
    }

    @Override // defpackage.ajts
    public final Instant J() {
        return this.a.J();
    }

    @Override // defpackage.ajts
    public final Instant K() {
        return this.a.K();
    }

    @Override // defpackage.ajts
    public final String L() {
        return this.a.L();
    }

    @Override // defpackage.ajts
    public final String M() {
        return this.a.M();
    }

    @Override // defpackage.ajts
    public final String N() {
        return this.a.N();
    }

    @Override // defpackage.ajts
    public final boolean O() {
        return this.a.O();
    }

    @Override // defpackage.ajts
    public final boolean P() {
        return this.a.P();
    }

    @Override // defpackage.ajts
    public final /* synthetic */ boolean R() {
        return ajtr.a(this);
    }

    @Override // defpackage.ajts
    public final boolean S() {
        return true;
    }

    @Override // defpackage.ajlk
    public final Uri a() {
        return this.a.a();
    }

    @Override // defpackage.ajlk
    public final Uri b() {
        return this.a.b();
    }

    @Override // defpackage.ajlk
    public final ajlj c() {
        return this.a.c();
    }

    @Override // defpackage.ajlk
    public final ConversationId d() {
        return (ConversationId) this.d.a();
    }

    @Override // defpackage.ajlk
    public final akbk e() {
        return this.a.e();
    }

    @Override // defpackage.ajlk
    public final akbl f() {
        return this.a.f();
    }

    @Override // defpackage.ajlk
    public final akcy g() {
        return this.a.g();
    }

    @Override // defpackage.ajlk
    public final aoer h() {
        return this.a.h();
    }

    @Override // defpackage.ajlk
    public final bvdk i() {
        return this.a.i();
    }

    @Override // defpackage.ajlk
    public final cbqz j() {
        return this.a.j();
    }

    @Override // defpackage.ajlk
    public final cgrb k() {
        ajts ajtsVar = this.a;
        return new cgrb(ajtsVar.k().a, ajtsVar.k().b, l());
    }

    @Override // defpackage.ajlk
    public final cgrc l() {
        cgrc cgrcVar = this.c;
        if (cgrcVar != cgrc.a) {
            return cgrcVar;
        }
        cgrc cgrcVarL = this.a.l();
        cgrcVarL.getClass();
        return cgrcVarL;
    }

    @Override // defpackage.ajlk
    public final String m() {
        return this.a.m();
    }

    @Override // defpackage.ajlk
    public final boolean n() {
        return false;
    }

    @Override // defpackage.ajlk
    public final boolean o() {
        return this.a.o();
    }

    @Override // defpackage.ajlk
    public final boolean p() {
        return false;
    }

    @Override // defpackage.ajlk
    public final boolean q() {
        return this.a.q();
    }

    @Override // defpackage.ajlk
    public final boolean r() {
        return this.a.r();
    }

    @Override // defpackage.ajlk
    public final boolean s() {
        return this.a.s();
    }

    @Override // defpackage.ajlk
    public final boolean t() {
        return this.a.t();
    }

    @Override // defpackage.ajlk
    public final boolean u() {
        return this.a.u();
    }

    @Override // defpackage.ajlk
    public final boolean v() {
        return this.a.v();
    }

    @Override // defpackage.ajlk
    public final boolean w() {
        return this.a.w();
    }

    @Override // defpackage.ajlk
    public final boolean x() {
        return this.a.x();
    }

    @Override // defpackage.ajlk
    public final boolean y() {
        return this.a.y();
    }

    @Override // defpackage.ajlk
    public final boolean z() {
        return this.a.z();
    }
}
