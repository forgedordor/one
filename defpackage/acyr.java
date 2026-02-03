package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acyr extends acyw {
    public aukf A;
    public Optional B = Optional.empty();
    public akbj C;
    private bvdk D;
    private int E;
    private boolean F;
    private ConversationIdType G;
    private ejxr H;
    private cgrc I;
    private boolean J;
    private cins K;
    private boolean L;
    private int M;
    private int N;
    private int O;
    private long P;
    private boolean Q;
    private long R;
    private long S;
    private boolean T;
    private boolean U;
    private int V;
    private int W;
    private long X;
    private int Y;
    private int Z;
    public String a;
    private long aa;
    private boolean ab;
    private int ac;
    private boolean ad;
    private int ae;
    private boolean af;
    private int ag;
    private akbl ah;
    private boolean ai;
    private int aj;
    public String b;
    public aonp c;
    public String d;
    public String e;
    public Uri f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public MessageIdType l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public Uri u;
    public String v;
    public String w;
    public String x;
    public Function y;
    public ezgd z;

    @Override // defpackage.acyw
    public final void A(int i) {
        this.W = i;
        this.aj |= 16384;
    }

    @Override // defpackage.acyw
    public final void B(long j) {
        this.X = j;
        this.aj |= 32768;
    }

    @Override // defpackage.acyw
    public final void C(int i) {
        this.ac = i;
        this.aj |= 1048576;
    }

    @Override // defpackage.acyw
    public final void D(int i) {
        this.Y = i;
        this.aj |= 65536;
    }

    @Override // defpackage.acyw
    public final void E(int i) {
        this.Z = i;
        this.aj |= 131072;
    }

    @Override // defpackage.acyw
    public final void F(long j) {
        this.aa = j;
        this.aj |= 262144;
    }

    @Override // defpackage.acyw
    public final void G(int i) {
        this.ae = i;
        this.aj |= 4194304;
    }

    @Override // defpackage.acyw
    public final acyx a() {
        bvdk bvdkVar;
        ConversationIdType conversationIdType;
        ejxr ejxrVar;
        cgrc cgrcVar;
        MessageIdType messageIdType;
        cins cinsVar;
        Function function;
        akbl akblVar;
        akbj akbjVar;
        if (this.aj == 67108863 && (bvdkVar = this.D) != null && (conversationIdType = this.G) != null && (ejxrVar = this.H) != null && (cgrcVar = this.I) != null && (messageIdType = this.l) != null && (cinsVar = this.K) != null && (function = this.y) != null && (akblVar = this.ah) != null && (akbjVar = this.C) != null) {
            return new acys(bvdkVar, this.a, this.b, this.c, this.E, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.F, conversationIdType, ejxrVar, cgrcVar, this.k, messageIdType, this.J, this.m, cinsVar, this.n, this.o, this.p, this.L, this.M, this.q, this.r, this.s, this.t, this.u, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.v, this.W, this.w, this.X, this.Y, this.Z, this.x, this.aa, function, this.ab, this.ac, this.z, this.A, this.B, this.ad, this.ae, this.af, this.ag, akblVar, akbjVar, this.ai);
        }
        StringBuilder sb = new StringBuilder();
        if (this.D == null) {
            sb.append(" archiveStatus");
        }
        if ((this.aj & 1) == 0) {
            sb.append(" conversationType");
        }
        if ((this.aj & 2) == 0) {
            sb.append(" hasRbmBotRecipient");
        }
        if (this.G == null) {
            sb.append(" id_conversations");
        }
        if (this.H == null) {
            sb.append(" mapiConversationId");
        }
        if (this.I == null) {
            sb.append(" conversationMuteThreshold");
        }
        if (this.l == null) {
            sb.append(" id_messages");
        }
        if ((this.aj & 4) == 0) {
            sb.append(" isEnterprise");
        }
        if (this.K == null) {
            sb.append(" groupUpgradeStatus");
        }
        if ((this.aj & 8) == 0) {
            sb.append(" notificationEnabled");
        }
        if ((this.aj & 16) == 0) {
            sb.append(" participantCount");
        }
        if ((this.aj & 32) == 0) {
            sb.append(" protocol");
        }
        if ((this.aj & 64) == 0) {
            sb.append(" rawTelephonyStatus");
        }
        if ((this.aj & 128) == 0) {
            sb.append(" rcsSessionId");
        }
        if ((this.aj & 256) == 0) {
            sb.append(" read");
        }
        if ((this.aj & 512) == 0) {
            sb.append(" receivedTimestamp");
        }
        if ((this.aj & 1024) == 0) {
            sb.append(" sentTimestamp");
        }
        if ((this.aj & 2048) == 0) {
            sb.append(" rcsSessionAllowsRevocation");
        }
        if ((this.aj & 4096) == 0) {
            sb.append(" showDraft");
        }
        if ((this.aj & 8192) == 0) {
            sb.append(" smsErrorCode");
        }
        if ((this.aj & 16384) == 0) {
            sb.append(" smsPriority");
        }
        if ((this.aj & 32768) == 0) {
            sb.append(" sortTimestamp");
        }
        if ((this.aj & 65536) == 0) {
            sb.append(" status");
        }
        if ((this.aj & 131072) == 0) {
            sb.append(" subId");
        }
        if ((this.aj & 262144) == 0) {
            sb.append(" triggerTime");
        }
        if (this.y == null) {
            sb.append(" getExpressionValueFunction");
        }
        if ((this.aj & 524288) == 0) {
            sb.append(" pinStatus");
        }
        if ((this.aj & 1048576) == 0) {
            sb.append(" sourceType");
        }
        if ((this.aj & 2097152) == 0) {
            sb.append(" markedAsUnread");
        }
        if ((this.aj & 4194304) == 0) {
            sb.append(" unreadMessagesCount");
        }
        if ((this.aj & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) == 0) {
            sb.append(" hasMatrixParticipants");
        }
        if ((this.aj & 16777216) == 0) {
            sb.append(" joinState");
        }
        if (this.ah == null) {
            sb.append(" parentalApprovalStatus");
        }
        if (this.C == null) {
            sb.append(" parentControlStates");
        }
        if ((this.aj & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) == 0) {
            sb.append(" hasEmailDestination");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.acyw
    public final void b(bvdk bvdkVar) {
        if (bvdkVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.D = bvdkVar;
    }

    @Override // defpackage.acyw
    public final void c(cgrc cgrcVar) {
        if (cgrcVar == null) {
            throw new NullPointerException("Null conversationMuteThreshold");
        }
        this.I = cgrcVar;
    }

    @Override // defpackage.acyw
    public final void d(int i) {
        this.E = i;
        this.aj |= 1;
    }

    @Override // defpackage.acyw
    public final void e(cins cinsVar) {
        if (cinsVar == null) {
            throw new NullPointerException("Null groupUpgradeStatus");
        }
        this.K = cinsVar;
    }

    @Override // defpackage.acyw
    public final void f(boolean z) {
        this.ai = z;
        this.aj |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
    }

    @Override // defpackage.acyw
    public final void g(boolean z) {
        this.af = z;
        this.aj |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
    }

    @Override // defpackage.acyw
    public final void h(boolean z) {
        this.F = z;
        this.aj |= 2;
    }

    @Override // defpackage.acyw
    public final void i(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null id_conversations");
        }
        this.G = conversationIdType;
    }

    @Override // defpackage.acyw
    public final void j(boolean z) {
        this.J = z;
        this.aj |= 4;
    }

    @Override // defpackage.acyw
    public final void k(int i) {
        this.ag = i;
        this.aj |= 16777216;
    }

    @Override // defpackage.acyw
    public final void l(ejxr ejxrVar) {
        if (ejxrVar == null) {
            throw new NullPointerException("Null mapiConversationId");
        }
        this.H = ejxrVar;
    }

    @Override // defpackage.acyw
    public final void m(boolean z) {
        this.ad = z;
        this.aj |= 2097152;
    }

    @Override // defpackage.acyw
    public final void n(boolean z) {
        this.L = z;
        this.aj |= 8;
    }

    @Override // defpackage.acyw
    public final void o(akbl akblVar) {
        if (akblVar == null) {
            throw new NullPointerException("Null parentalApprovalStatus");
        }
        this.ah = akblVar;
    }

    @Override // defpackage.acyw
    public final void p(int i) {
        this.M = i;
        this.aj |= 16;
    }

    @Override // defpackage.acyw
    public final void q(boolean z) {
        this.ab = z;
        this.aj |= 524288;
    }

    @Override // defpackage.acyw
    public final void r(int i) {
        this.N = i;
        this.aj |= 32;
    }

    @Override // defpackage.acyw
    public final void s(int i) {
        this.O = i;
        this.aj |= 64;
    }

    @Override // defpackage.acyw
    public final void t(boolean z) {
        this.T = z;
        this.aj |= 2048;
    }

    @Override // defpackage.acyw
    public final void u(long j) {
        this.P = j;
        this.aj |= 128;
    }

    @Override // defpackage.acyw
    public final void v(boolean z) {
        this.Q = z;
        this.aj |= 256;
    }

    @Override // defpackage.acyw
    public final void w(long j) {
        this.R = j;
        this.aj |= 512;
    }

    @Override // defpackage.acyw
    public final void x(long j) {
        this.S = j;
        this.aj |= 1024;
    }

    @Override // defpackage.acyw
    public final void y(boolean z) {
        this.U = z;
        this.aj |= 4096;
    }

    @Override // defpackage.acyw
    public final void z(int i) {
        this.V = i;
        this.aj |= 8192;
    }
}
