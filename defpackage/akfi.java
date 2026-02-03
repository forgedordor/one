package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akfi implements ajts {
    private final ConversationId a;
    private final ajts b;

    public akfi(ConversationId conversationId, ajts ajtsVar) {
        this.a = conversationId;
        this.b = ajtsVar;
    }

    @Override // defpackage.ajts
    public final int A() {
        return this.b.A();
    }

    @Override // defpackage.ajts
    public final int B() {
        return this.b.B();
    }

    @Override // defpackage.ajts
    public final long C() {
        return this.b.C();
    }

    @Override // defpackage.ajts
    public final akgk E() {
        return this.b.E();
    }

    @Override // defpackage.ajts
    public final avoe F() {
        return this.b.F();
    }

    @Override // defpackage.ajts
    public final awjl G() {
        return this.b.G();
    }

    @Override // defpackage.ajts
    public final cins H() {
        return this.b.H();
    }

    @Override // defpackage.ajts
    public final elwp I() {
        return this.b.I();
    }

    @Override // defpackage.ajts
    public final Instant J() {
        return this.b.J();
    }

    @Override // defpackage.ajts
    public final Instant K() {
        return this.b.K();
    }

    @Override // defpackage.ajts
    public final String L() {
        return this.b.L();
    }

    @Override // defpackage.ajts
    public final String M() {
        return this.b.M();
    }

    @Override // defpackage.ajts
    public final String N() {
        return this.b.N();
    }

    @Override // defpackage.ajts
    public final boolean O() {
        return this.b.O();
    }

    @Override // defpackage.ajts
    public final boolean P() {
        return this.b.P();
    }

    @Override // defpackage.ajts
    public final /* synthetic */ boolean R() {
        return ajtr.a(this);
    }

    @Override // defpackage.ajts
    public final boolean S() {
        return this.b.S();
    }

    @Override // defpackage.ajlk
    public final Uri a() {
        return this.b.a();
    }

    @Override // defpackage.ajlk
    public final Uri b() {
        return this.b.b();
    }

    @Override // defpackage.ajlk
    public final ajlj c() {
        return this.b.c();
    }

    @Override // defpackage.ajlk
    public final ConversationId d() {
        return this.a;
    }

    @Override // defpackage.ajlk
    public final akbk e() {
        return this.b.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akfi)) {
            return false;
        }
        akfi akfiVar = (akfi) obj;
        return fdbq.f(this.a, akfiVar.a) && fdbq.f(this.b, akfiVar.b);
    }

    @Override // defpackage.ajlk
    public final akbl f() {
        return this.b.f();
    }

    @Override // defpackage.ajlk
    public final akcy g() {
        return this.b.g();
    }

    @Override // defpackage.ajlk
    public final aoer h() {
        return this.b.h();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.ajlk
    public final bvdk i() {
        return this.b.i();
    }

    @Override // defpackage.ajlk
    public final cbqz j() {
        return this.b.j();
    }

    @Override // defpackage.ajlk
    public final cgrb k() {
        cgra cgraVar = cgra.e;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        return new cgrb(cgraVar, instant, cgrc.b);
    }

    @Override // defpackage.ajlk
    public final cgrc l() {
        return cgrc.b;
    }

    @Override // defpackage.ajlk
    public final String m() {
        return this.b.m();
    }

    @Override // defpackage.ajlk
    public final boolean n() {
        return false;
    }

    @Override // defpackage.ajlk
    public final boolean o() {
        return this.b.o();
    }

    @Override // defpackage.ajlk
    public final boolean p() {
        return false;
    }

    @Override // defpackage.ajlk
    public final boolean q() {
        return this.b.q();
    }

    @Override // defpackage.ajlk
    public final boolean r() {
        return this.b.r();
    }

    @Override // defpackage.ajlk
    public final boolean s() {
        return this.b.s();
    }

    @Override // defpackage.ajlk
    public final boolean t() {
        return this.b.t();
    }

    public final String toString() {
        return fdgn.b("\n    EmergencySosConversationProperties: {\n        id: " + this.a + "\n        kind: " + c() + "\n        ConversationType: " + bvdi.a(A()) + "\n        name: " + m() + "\n        nameIsAutomatic: " + w() + "\n        canAddPeople: false\n        archiveStatus: " + i() + "\n        isDeleted: " + z() + "\n        activeSelfIdentity: " + h() + "\n        longPressActionsEnabled: false\n        shouldShowSinName: false\n        canRequestManualSatelliteConnection: false\n        muteStatus: " + cgrc.b + "\n    }\n  ");
    }

    @Override // defpackage.ajlk
    public final boolean u() {
        return this.b.u();
    }

    @Override // defpackage.ajlk
    public final boolean v() {
        return false;
    }

    @Override // defpackage.ajlk
    public final boolean w() {
        return this.b.w();
    }

    @Override // defpackage.ajlk
    public final boolean x() {
        return false;
    }

    @Override // defpackage.ajlk
    public final boolean y() {
        return this.b.y();
    }

    @Override // defpackage.ajlk
    public final boolean z() {
        return this.b.z();
    }
}
