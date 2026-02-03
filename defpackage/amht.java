package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amht implements ajlt, amia {
    private final MessageId a;
    private final ConversationId b;
    private final amvr c;
    private final String d;
    private final ajmc e;
    private final Instant f;
    private final Long g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final ajmb k;
    private final angr l;
    private final anpj m;
    private final Instant n;
    private final anlb o;
    private final anpj p;
    private final ajmx q;
    private final fhaz r;
    private final int s;
    private final ajls t;
    private final String u;
    private final angj v;
    private final alwr w;
    private final int x;
    private final int y;

    public /* synthetic */ amht(MessageId messageId, ConversationId conversationId, amvr amvrVar, String str, ajmc ajmcVar, Instant instant, Long l, boolean z, ajmx ajmxVar, fhaz fhazVar, int i, alwr alwrVar, int i2) {
        anpk anpkVar = new anpk(0);
        Instant instant2 = Instant.EPOCH;
        anpk anpkVar2 = new anpk(null);
        instant2.getClass();
        this.a = messageId;
        this.b = conversationId;
        this.c = amvrVar;
        this.d = (i2 & 8) != 0 ? null : str;
        this.e = ajmcVar;
        this.f = instant;
        this.g = (i2 & 64) != 0 ? null : l;
        this.h = false;
        this.i = z;
        this.j = false;
        this.x = 1;
        this.k = null;
        this.l = null;
        this.m = anpkVar;
        this.v = null;
        this.y = 1;
        this.n = instant2;
        this.o = null;
        this.p = anpkVar2;
        this.q = ajmxVar;
        this.r = fhazVar;
        this.s = i;
        this.w = alwrVar;
        ajls ajlsVarA = andv.a(i);
        ajlsVarA.getClass();
        this.t = ajlsVarA;
        this.u = MessageData.ar(i);
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ anms A() {
        return null;
    }

    @Override // defpackage.ajlt
    public final angj B() {
        return null;
    }

    @Override // defpackage.ajlt
    public final int C() {
        return 1;
    }

    @Override // defpackage.ajlt
    public final int D() {
        return 1;
    }

    @Override // defpackage.amia
    public final int E() {
        return this.s;
    }

    @Override // defpackage.amia
    public final fhaz G() {
        return this.r;
    }

    @Override // defpackage.ajlt
    public final ajls a() {
        return this.t;
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ MessageId b() {
        return this.a;
    }

    @Override // defpackage.ajlt
    public final ajmb c() {
        return null;
    }

    @Override // defpackage.ajlt
    public final ajmc d() {
        return this.e;
    }

    @Override // defpackage.ajlt
    public final ajmx e() {
        return this.q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amht)) {
            return false;
        }
        amht amhtVar = (amht) obj;
        if (!fdbq.f(this.a, amhtVar.a) || !fdbq.f(this.b, amhtVar.b) || !fdbq.f(this.c, amhtVar.c) || !fdbq.f(this.d, amhtVar.d) || !fdbq.f(this.e, amhtVar.e) || !fdbq.f(this.f, amhtVar.f) || !fdbq.f(this.g, amhtVar.g)) {
            return false;
        }
        boolean z = amhtVar.h;
        if (this.i != amhtVar.i) {
            return false;
        }
        boolean z2 = amhtVar.j;
        int i = amhtVar.x;
        ajmb ajmbVar = amhtVar.k;
        if (!fdbq.f(null, null)) {
            return false;
        }
        angr angrVar = amhtVar.l;
        if (!fdbq.f(null, null) || !fdbq.f(this.m, amhtVar.m)) {
            return false;
        }
        angj angjVar = amhtVar.v;
        if (!fdbq.f(null, null)) {
            return false;
        }
        int i2 = amhtVar.y;
        if (!fdbq.f(this.n, amhtVar.n)) {
            return false;
        }
        anlb anlbVar = amhtVar.o;
        return fdbq.f(null, null) && fdbq.f(this.p, amhtVar.p) && fdbq.f(this.q, amhtVar.q) && fdbq.f(this.r, amhtVar.r) && this.s == amhtVar.s && fdbq.f(this.w, amhtVar.w);
    }

    @Override // defpackage.ajlt
    public final ConversationId f() {
        return this.b;
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ amvr g() {
        return this.c;
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ amwc h() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int iHashCode2 = ((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        Long l = this.g;
        int iHashCode3 = ((((((((((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31) + amhs.a(false)) * 31) + amhs.a(this.i)) * 31) + amhs.a(false)) * 31) + 1) * 29791) + this.m.hashCode();
        amkb.a(1);
        int iHashCode4 = ((((((iHashCode3 * 961) + 1) * 31) + this.n.hashCode()) * 961) + this.p.hashCode()) * 31;
        ajmx ajmxVar = this.q;
        int iHashCode5 = (iHashCode4 + (ajmxVar == null ? 0 : ajmxVar.hashCode())) * 31;
        fhaz fhazVar = this.r;
        return ((((iHashCode5 + (fhazVar != null ? fhazVar.hashCode() : 0)) * 31) + this.s) * 31) + this.w.hashCode();
    }

    @Override // defpackage.ajlt
    public final angr i() {
        return null;
    }

    @Override // defpackage.ajlt
    public final anlb j() {
        return null;
    }

    @Override // defpackage.ajlt
    public final anpj k(int i) {
        int i2 = ekgb.d;
        return new anpk(ekoe.a);
    }

    @Override // defpackage.ajlt
    public final anpj l() {
        return this.m;
    }

    @Override // defpackage.ajlt
    public final anpj m() {
        return this.p;
    }

    @Override // defpackage.ajlt
    public final eiju n() {
        eiju eijuVarE = eijx.e("Message details not available for this message");
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.ajlt
    public final Instant o() {
        return this.f;
    }

    @Override // defpackage.ajlt
    public final Instant p() {
        return this.n;
    }

    @Override // defpackage.ajlt
    public final Long q() {
        return this.g;
    }

    @Override // defpackage.ajlt
    public final String r() {
        return this.d;
    }

    @Override // defpackage.ajlt
    public final String s() {
        return this.u;
    }

    @Override // defpackage.ajlt
    public final boolean t(aoer aoerVar) {
        return false;
    }

    public final String toString() {
        return "TemporaryMessage(id=" + this.a + ", conversationId=" + this.b + ", content=" + this.c + ", caption=" + this.d + ", provenance=" + this.e + ", receivedTimestamp=" + this.f + ", analyticsStableId=" + this.g + ", isStarred=false, isEncrypted=" + this.i + ", isRead=false, interactability=NONE, preview=null, reactions=null, replyCount=" + this.m + ", editStatus=null, category=NORMAL, sentTimestamp=" + this.n + ", status=null, statusSupplier=" + this.p + ", repliedTo=" + this.q + ", traceId=" + this.r + ", protocol=" + this.s + ", canForwardMessageUtil=" + this.w + ")";
    }

    @Override // defpackage.ajlt
    public final boolean u() {
        return alwr.a(this);
    }

    @Override // defpackage.ajlt
    public final boolean v(aoer aoerVar) {
        return false;
    }

    @Override // defpackage.ajlt
    public final boolean w() {
        return this.i;
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.ajlt
    public final boolean y() {
        return false;
    }

    @Override // defpackage.ajlt
    public final boolean z() {
        return false;
    }
}
