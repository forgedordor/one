package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ajti extends ajwi {
    private long A;
    private cgrc B;
    private boolean C;
    private akgk D;
    private akbl E;
    private akbk F;
    private boolean G;
    private boolean H;
    private boolean I;
    private cins J;
    private cbqz K;
    private awjl L;
    private Instant M;
    private boolean N;
    public ConversationId a;
    public String b;
    public String c;
    public String d;
    public aoer e;
    public Uri f;
    public String g;
    public Instant h;
    public cgrb i;
    public akcy j;
    public boolean k;
    public boolean l;
    public Uri m;
    public int n;
    private boolean o;
    private bvdk p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean w;
    private avoe x;
    private int y;
    private elwp z;

    public ajti() {
    }

    @Override // defpackage.ajwi
    public final void A(boolean z) {
        this.t = z;
        this.n |= 16;
    }

    @Override // defpackage.ajwi
    public final ajwj a() {
        ConversationId conversationId;
        bvdk bvdkVar;
        avoe avoeVar;
        elwp elwpVar;
        cgrc cgrcVar;
        cgrb cgrbVar;
        akgk akgkVar;
        akbl akblVar;
        akbk akbkVar;
        cins cinsVar;
        cbqz cbqzVar;
        awjl awjlVar;
        Instant instant;
        if (this.n == 131071 && (conversationId = this.a) != null && (bvdkVar = this.p) != null && (avoeVar = this.x) != null && (elwpVar = this.z) != null && (cgrcVar = this.B) != null && (cgrbVar = this.i) != null && (akgkVar = this.D) != null && (akblVar = this.E) != null && (akbkVar = this.F) != null && (cinsVar = this.J) != null && (cbqzVar = this.K) != null && (awjlVar = this.L) != null && (instant = this.M) != null) {
            return new ajtj(conversationId, this.o, bvdkVar, this.q, this.r, this.s, this.t, this.u, this.b, this.v, this.w, avoeVar, this.y, elwpVar, this.c, this.d, this.e, this.f, this.A, this.g, this.h, cgrcVar, cgrbVar, this.j, this.C, akgkVar, akblVar, akbkVar, this.G, this.H, this.I, cinsVar, cbqzVar, awjlVar, instant, this.k, this.l, this.m, this.N);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if ((this.n & 1) == 0) {
            sb.append(" nameIsAutomatic");
        }
        if (this.p == null) {
            sb.append(" archiveStatus");
        }
        if ((this.n & 2) == 0) {
            sb.append(" deleted");
        }
        if ((this.n & 4) == 0) {
            sb.append(" isUnread");
        }
        if ((this.n & 8) == 0) {
            sb.append(" isEncrypted");
        }
        if ((this.n & 16) == 0) {
            sb.append(" wasPreviouslyEncrypted");
        }
        if ((this.n & 32) == 0) {
            sb.append(" canRequestManualSatelliteConnection");
        }
        if ((this.n & 64) == 0) {
            sb.append(" conversationType");
        }
        if ((this.n & 128) == 0) {
            sb.append(" hasRbmBotRecipient");
        }
        if (this.x == null) {
            sb.append(" errorState");
        }
        if ((this.n & 256) == 0) {
            sb.append(" joinState");
        }
        if (this.z == null) {
            sb.append(" sendMode");
        }
        if ((this.n & 512) == 0) {
            sb.append(" rcsChatSessionId");
        }
        if (this.B == null) {
            sb.append(" conversationMuteThreshold");
        }
        if (this.i == null) {
            sb.append(" conversationMuteStatus");
        }
        if ((this.n & 1024) == 0) {
            sb.append(" sessionAllowsRevocation");
        }
        if (this.D == null) {
            sb.append(" palMode");
        }
        if (this.E == null) {
            sb.append(" parentalApprovalStatus");
        }
        if (this.F == null) {
            sb.append(" parentSupervisionStates");
        }
        if ((this.n & 2048) == 0) {
            sb.append(" canRemovePeople");
        }
        if ((this.n & 4096) == 0) {
            sb.append(" canUpdateGroupName");
        }
        if ((this.n & 8192) == 0) {
            sb.append(" canUpdateGroupIcon");
        }
        if (this.J == null) {
            sb.append(" mmsGroupUpgradeStatus");
        }
        if (this.K == null) {
            sb.append(" encryptionProtocol");
        }
        if (this.L == null) {
            sb.append(" destinationToken");
        }
        if (this.M == null) {
            sb.append(" sortTimestamp");
        }
        if ((this.n & 16384) == 0) {
            sb.append(" longPressActionsEnabled");
        }
        if ((this.n & 32768) == 0) {
            sb.append(" shouldShowSimName");
        }
        if ((this.n & 65536) == 0) {
            sb.append(" canUpdateInviteLink");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ajwi
    public final void b(bvdk bvdkVar) {
        if (bvdkVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.p = bvdkVar;
    }

    @Override // defpackage.ajwi
    public final void c(boolean z) {
        this.G = z;
        this.n |= 2048;
    }

    @Override // defpackage.ajwi
    public final void d() {
        this.u = true;
        this.n |= 32;
    }

    @Override // defpackage.ajwi
    public final void e(boolean z) {
        this.I = z;
        this.n |= 8192;
    }

    @Override // defpackage.ajwi
    public final void f(boolean z) {
        this.H = z;
        this.n |= 4096;
    }

    @Override // defpackage.ajwi
    public final void g(boolean z) {
        this.N = z;
        this.n |= 65536;
    }

    @Override // defpackage.ajwi
    public final void h(cgrc cgrcVar) {
        if (cgrcVar == null) {
            throw new NullPointerException("Null conversationMuteThreshold");
        }
        this.B = cgrcVar;
    }

    @Override // defpackage.ajwi
    public final void i(int i) {
        this.v = i;
        this.n |= 64;
    }

    @Override // defpackage.ajwi
    public final void j(boolean z) {
        this.q = z;
        this.n |= 2;
    }

    @Override // defpackage.ajwi
    public final void k(awjl awjlVar) {
        if (awjlVar == null) {
            throw new NullPointerException("Null destinationToken");
        }
        this.L = awjlVar;
    }

    @Override // defpackage.ajwi
    public final void l(cbqz cbqzVar) {
        if (cbqzVar == null) {
            throw new NullPointerException("Null encryptionProtocol");
        }
        this.K = cbqzVar;
    }

    @Override // defpackage.ajwi
    public final void m(avoe avoeVar) {
        if (avoeVar == null) {
            throw new NullPointerException("Null errorState");
        }
        this.x = avoeVar;
    }

    @Override // defpackage.ajwi
    public final void n(boolean z) {
        this.w = z;
        this.n |= 128;
    }

    @Override // defpackage.ajwi
    public final void o(boolean z) {
        this.s = z;
        this.n |= 8;
    }

    @Override // defpackage.ajwi
    public final void p(boolean z) {
        this.r = z;
        this.n |= 4;
    }

    @Override // defpackage.ajwi
    public final void q(int i) {
        this.y = i;
        this.n |= 256;
    }

    @Override // defpackage.ajwi
    public final void r(cins cinsVar) {
        if (cinsVar == null) {
            throw new NullPointerException("Null mmsGroupUpgradeStatus");
        }
        this.J = cinsVar;
    }

    @Override // defpackage.ajwi
    public final void s(boolean z) {
        this.o = z;
        this.n |= 1;
    }

    @Override // defpackage.ajwi
    public final void t(akgk akgkVar) {
        if (akgkVar == null) {
            throw new NullPointerException("Null palMode");
        }
        this.D = akgkVar;
    }

    @Override // defpackage.ajwi
    public final void u(akbk akbkVar) {
        if (akbkVar == null) {
            throw new NullPointerException("Null parentSupervisionStates");
        }
        this.F = akbkVar;
    }

    @Override // defpackage.ajwi
    public final void v(akbl akblVar) {
        if (akblVar == null) {
            throw new NullPointerException("Null parentalApprovalStatus");
        }
        this.E = akblVar;
    }

    @Override // defpackage.ajwi
    public final void w(long j) {
        this.A = j;
        this.n |= 512;
    }

    @Override // defpackage.ajwi
    public final void x(elwp elwpVar) {
        if (elwpVar == null) {
            throw new NullPointerException("Null sendMode");
        }
        this.z = elwpVar;
    }

    @Override // defpackage.ajwi
    public final void y(boolean z) {
        this.C = z;
        this.n |= 1024;
    }

    @Override // defpackage.ajwi
    public final void z(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null sortTimestamp");
        }
        this.M = instant;
    }

    public ajti(ajwj ajwjVar) {
        ajtj ajtjVar = (ajtj) ajwjVar;
        this.a = ajtjVar.a;
        this.o = ajtjVar.b;
        this.p = ajtjVar.c;
        this.q = ajtjVar.d;
        this.r = ajtjVar.e;
        this.s = ajtjVar.f;
        this.t = ajtjVar.g;
        this.u = ajtjVar.h;
        this.b = ajtjVar.i;
        this.v = ajtjVar.j;
        this.w = ajtjVar.k;
        this.x = ajtjVar.l;
        this.y = ajtjVar.m;
        this.z = ajtjVar.n;
        this.c = ajtjVar.o;
        this.d = ajtjVar.p;
        this.e = ajtjVar.q;
        this.f = ajtjVar.r;
        this.A = ajtjVar.s;
        this.g = ajtjVar.t;
        this.h = ajtjVar.u;
        this.B = ajtjVar.v;
        this.i = ajtjVar.w;
        this.j = ajtjVar.x;
        this.C = ajtjVar.y;
        this.D = ajtjVar.z;
        this.E = ajtjVar.A;
        this.F = ajtjVar.B;
        this.G = ajtjVar.C;
        this.H = ajtjVar.D;
        this.I = ajtjVar.E;
        this.J = ajtjVar.F;
        this.K = ajtjVar.G;
        this.L = ajtjVar.H;
        this.M = ajtjVar.I;
        this.k = ajtjVar.J;
        this.l = ajtjVar.K;
        this.m = ajtjVar.L;
        this.N = ajtjVar.M;
        this.n = 131071;
    }
}
