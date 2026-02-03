package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytm implements ajlt {
    public final List a;
    private final /* synthetic */ ajlt b;
    private final ytn c;
    private final angr d;
    private final ajmc e;
    private final boolean f;

    public ytm(ajlt ajltVar, ajlt ajltVar2) {
        ajmc ytkVar;
        this.b = ajltVar2;
        boolean z = true;
        List listAi = ajltVar instanceof ytm ? fcva.ai(((ytm) ajltVar).a, ajltVar2) : fcva.g(ajltVar, ajltVar2);
        this.a = listAi;
        this.c = new ytn(listAi);
        this.d = new ytl(this);
        if (listAi.isEmpty()) {
            ytkVar = new ytk(ajltVar2, this);
        } else {
            Iterator it = listAi.iterator();
            while (it.hasNext()) {
                if (!(((ajlt) it.next()).d() instanceof ajmq)) {
                    ytkVar = ajltVar2.d();
                    break;
                }
            }
            ytkVar = new ytk(ajltVar2, this);
        }
        this.e = ytkVar;
        List list = this.a;
        if (list.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((ajlt) it2.next()).z()) {
                    break;
                }
            }
            z = false;
        }
        this.f = z;
    }

    @Override // defpackage.ajlt
    public final anms A() {
        return this.b.A();
    }

    @Override // defpackage.ajlt
    public final angj B() {
        return this.b.B();
    }

    @Override // defpackage.ajlt
    public final int C() {
        return this.b.C();
    }

    @Override // defpackage.ajlt
    public final int D() {
        return this.b.D();
    }

    @Override // defpackage.ajlt
    public final ajls a() {
        return this.b.a();
    }

    @Override // defpackage.ajlt
    public final MessageId b() {
        return this.b.b();
    }

    @Override // defpackage.ajlt
    public final ajmb c() {
        return this.b.c();
    }

    @Override // defpackage.ajlt
    public final ajmc d() {
        return this.e;
    }

    @Override // defpackage.ajlt
    public final ajmx e() {
        return this.b.e();
    }

    @Override // defpackage.ajlt
    public final ConversationId f() {
        return this.b.f();
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ amvr g() {
        return this.c;
    }

    @Override // defpackage.ajlt
    public final amwc h() {
        return null;
    }

    @Override // defpackage.ajlt
    public final angr i() {
        return this.d;
    }

    @Override // defpackage.ajlt
    public final anlb j() {
        return this.b.j();
    }

    @Override // defpackage.ajlt
    public final anpj k(int i) {
        return this.b.k(i);
    }

    @Override // defpackage.ajlt
    public final anpj l() {
        return this.b.l();
    }

    @Override // defpackage.ajlt
    public final anpj m() {
        return this.b.m();
    }

    @Override // defpackage.ajlt
    public final eiju n() {
        return this.b.n();
    }

    @Override // defpackage.ajlt
    public final Instant o() {
        return this.b.o();
    }

    @Override // defpackage.ajlt
    public final Instant p() {
        return this.b.p();
    }

    @Override // defpackage.ajlt
    public final Long q() {
        return this.b.q();
    }

    @Override // defpackage.ajlt
    public final String r() {
        return this.b.r();
    }

    @Override // defpackage.ajlt
    public final String s() {
        return this.b.s();
    }

    @Override // defpackage.ajlt
    public final boolean t(aoer aoerVar) {
        return this.b.t(aoerVar);
    }

    @Override // defpackage.ajlt
    public final boolean u() {
        return this.b.u();
    }

    @Override // defpackage.ajlt
    public final boolean v(aoer aoerVar) {
        return this.b.v(aoerVar);
    }

    @Override // defpackage.ajlt
    public final boolean w() {
        return this.b.w();
    }

    @Override // defpackage.ajlt
    public final boolean x() {
        return this.b.x();
    }

    @Override // defpackage.ajlt
    public final boolean y() {
        return this.b.y();
    }

    @Override // defpackage.ajlt
    public final boolean z() {
        return this.f;
    }
}
