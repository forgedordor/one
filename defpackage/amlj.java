package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amlj extends amll {
    public ConversationId a;
    public aoer b;
    public anxd c;
    public akgk d;
    public int e;
    public int f;
    private ajna h;
    private ekhv i;
    private ekhx j;
    private ajli k;
    private long l;
    private boolean m;
    private int n;
    private int o;
    private ekgb p;
    private awjl q;
    private elwq r;
    private ajlj s;
    private boolean t;
    private byte u;

    @Override // defpackage.amll
    public final amlm a() {
        ConversationId conversationId;
        ajna ajnaVar;
        ajli ajliVar;
        int i;
        ekgb ekgbVar;
        awjl awjlVar;
        elwq elwqVar;
        akgk akgkVar;
        ajlj ajljVar;
        int i2;
        ekhv ekhvVar = this.i;
        if (ekhvVar != null) {
            this.j = ekhvVar.g();
        } else if (this.j == null) {
            this.j = ekon.a;
        }
        if (this.u == 31 && (conversationId = this.a) != null && (ajnaVar = this.h) != null && (ajliVar = this.k) != null && (i = this.e) != 0 && (ekgbVar = this.p) != null && (awjlVar = this.q) != null && (elwqVar = this.r) != null && (akgkVar = this.d) != null && (ajljVar = this.s) != null && (i2 = this.f) != 0) {
            return new amlk(conversationId, ajnaVar, this.j, ajliVar, this.l, i, this.m, this.n, this.o, this.b, ekgbVar, awjlVar, this.c, elwqVar, akgkVar, ajljVar, this.t, i2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if (this.h == null) {
            sb.append(" bestAvailableTransportFeatureSet");
        }
        if (this.k == null) {
            sb.append(" composeDisabledReason");
        }
        if ((this.u & 1) == 0) {
            sb.append(" maxMessageSizeBytes");
        }
        if (this.e == 0) {
            sb.append(" attachmentMode");
        }
        if ((this.u & 2) == 0) {
            sb.append(" locationSharingSupported");
        }
        if ((this.u & 4) == 0) {
            sb.append(" attachmentCountLimit");
        }
        if ((this.u & 8) == 0) {
            sb.append(" textLengthLimit");
        }
        if (this.p == null) {
            sb.append(" recipients");
        }
        if (this.q == null) {
            sb.append(" destinationToken");
        }
        if (this.r == null) {
            sb.append(" conversationProtocolConditions");
        }
        if (this.d == null) {
            sb.append(" palMode");
        }
        if (this.s == null) {
            sb.append(" conversationKind");
        }
        if ((this.u & 16) == 0) {
            sb.append(" wasRcsConversation");
        }
        if (this.f == 0) {
            sb.append(" encryptionAlgorithm");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.amll
    public final ekhv b() {
        if (this.i == null) {
            if (this.j == null) {
                this.i = new ekhv();
            } else {
                ekhv ekhvVar = new ekhv();
                this.i = ekhvVar;
                ekhvVar.j(this.j);
                this.j = null;
            }
        }
        return this.i;
    }

    @Override // defpackage.amll
    public final int c() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Property \"attachmentMode\" has not been set");
    }

    @Override // defpackage.amll
    public final void d(int i) {
        this.n = i;
        this.u = (byte) (this.u | 4);
    }

    @Override // defpackage.amll
    public final void e(ajna ajnaVar) {
        if (ajnaVar == null) {
            throw new NullPointerException("Null bestAvailableTransportFeatureSet");
        }
        this.h = ajnaVar;
    }

    @Override // defpackage.amll
    public final void f(ajli ajliVar) {
        if (ajliVar == null) {
            throw new NullPointerException("Null composeDisabledReason");
        }
        this.k = ajliVar;
    }

    @Override // defpackage.amll
    public final void g(ajlj ajljVar) {
        if (ajljVar == null) {
            throw new NullPointerException("Null conversationKind");
        }
        this.s = ajljVar;
    }

    @Override // defpackage.amll
    public final void h(elwq elwqVar) {
        if (elwqVar == null) {
            throw new NullPointerException("Null conversationProtocolConditions");
        }
        this.r = elwqVar;
    }

    @Override // defpackage.amll
    public final void i(awjl awjlVar) {
        if (awjlVar == null) {
            throw new NullPointerException("Null destinationToken");
        }
        this.q = awjlVar;
    }

    @Override // defpackage.amll
    public final void j(boolean z) {
        this.m = z;
        this.u = (byte) (this.u | 2);
    }

    @Override // defpackage.amll
    public final void k(long j) {
        this.l = j;
        this.u = (byte) (this.u | 1);
    }

    @Override // defpackage.amll
    public final void l(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null recipients");
        }
        this.p = ekgbVar;
    }

    @Override // defpackage.amll
    public final void m(int i) {
        this.o = i;
        this.u = (byte) (this.u | 8);
    }

    @Override // defpackage.amll
    public final void n(boolean z) {
        this.t = z;
        this.u = (byte) (this.u | 16);
    }
}
