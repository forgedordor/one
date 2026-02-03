package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chug extends chxn {
    public basd a;
    public basd b;
    public axcm c;
    public String d;
    public awpx e;
    public String f;
    public String g;
    public String h;
    public eyga i;
    public LocationInformation j;
    private String k;
    private aubq l;
    private awjl m;
    private aubq n;
    private boolean o;
    private long p;
    private long q;
    private long r;
    private int s;
    private boolean t;
    private int u;
    private Bundle v;
    private boolean w;
    private boolean x;
    private boolean y;
    private short z;

    @Override // defpackage.chxn
    public final chxo a() {
        basd basdVar;
        String str;
        aubq aubqVar;
        awjl awjlVar;
        aubq aubqVar2;
        Bundle bundle;
        if (this.z == 2047 && (basdVar = this.a) != null && (str = this.k) != null && (aubqVar = this.l) != null && (awjlVar = this.m) != null && (aubqVar2 = this.n) != null && (bundle = this.v) != null) {
            return new chuh(basdVar, this.b, str, aubqVar, awjlVar, aubqVar2, this.c, this.d, this.o, this.e, this.f, this.g, this.p, this.q, this.h, this.r, this.s, this.t, this.i, this.j, this.u, bundle, this.w, this.x, this.y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rcsMessageId");
        }
        if (this.k == null) {
            sb.append(" remoteUserId");
        }
        if (this.l == null) {
            sb.append(" remoteChatEndpoint");
        }
        if (this.m == null) {
            sb.append(" senderDestinationToken");
        }
        if (this.n == null) {
            sb.append(" selfChatEndpoint");
        }
        if ((this.z & 1) == 0) {
            sb.append(" isGroup");
        }
        if ((this.z & 2) == 0) {
            sb.append(" sentTimestamp");
        }
        if ((this.z & 4) == 0) {
            sb.append(" receivedTimestamp");
        }
        if ((this.z & 8) == 0) {
            sb.append(" rcsSessionId");
        }
        if ((this.z & 16) == 0) {
            sb.append(" spamVerdict");
        }
        if ((this.z & 32) == 0) {
            sb.append(" isMarkedAsBot");
        }
        if ((this.z & 64) == 0) {
            sb.append(" messageStatus");
        }
        if (this.v == null) {
            sb.append(" additionalMessageDetails");
        }
        if ((this.z & 128) == 0) {
            sb.append(" isDeliveryReportRequested");
        }
        if ((this.z & 256) == 0) {
            sb.append(" isNegativeDeliveryReportRequested");
        }
        if ((this.z & 512) == 0) {
            sb.append(" isDisplayReportRequested");
        }
        if ((this.z & 1024) == 0) {
            sb.append(" shouldClearTypingIndicator");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.chxn
    public final void b(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("Null additionalMessageDetails");
        }
        this.v = bundle;
    }

    @Override // defpackage.chxn
    public final void c(boolean z) {
        this.w = z;
        this.z = (short) (this.z | 128);
    }

    @Override // defpackage.chxn
    public final void d(boolean z) {
        this.y = z;
        this.z = (short) (this.z | 512);
    }

    @Override // defpackage.chxn
    public final void e(boolean z) {
        this.o = z;
        this.z = (short) (this.z | 1);
    }

    @Override // defpackage.chxn
    public final void f(boolean z) {
        this.t = z;
        this.z = (short) (this.z | 32);
    }

    @Override // defpackage.chxn
    public final void g(boolean z) {
        this.x = z;
        this.z = (short) (this.z | 256);
    }

    @Override // defpackage.chxn
    public final void h(int i) {
        this.u = i;
        this.z = (short) (this.z | 64);
    }

    @Override // defpackage.chxn
    public final void i() {
        this.r = -1L;
        this.z = (short) (this.z | 8);
    }

    @Override // defpackage.chxn
    public final void j(long j) {
        this.q = j;
        this.z = (short) (this.z | 4);
    }

    @Override // defpackage.chxn
    public final void k(aubq aubqVar) {
        if (aubqVar == null) {
            throw new NullPointerException("Null remoteChatEndpoint");
        }
        this.l = aubqVar;
    }

    @Override // defpackage.chxn
    public final void l(String str) {
        if (str == null) {
            throw new NullPointerException("Null remoteUserId");
        }
        this.k = str;
    }

    @Override // defpackage.chxn
    public final void m(aubq aubqVar) {
        if (aubqVar == null) {
            throw new NullPointerException("Null selfChatEndpoint");
        }
        this.n = aubqVar;
    }

    @Override // defpackage.chxn
    public final void n(awjl awjlVar) {
        if (awjlVar == null) {
            throw new NullPointerException("Null senderDestinationToken");
        }
        this.m = awjlVar;
    }

    @Override // defpackage.chxn
    public final void o(long j) {
        this.p = j;
        this.z = (short) (this.z | 2);
    }

    @Override // defpackage.chxn
    public final void p(int i) {
        this.s = i;
        this.z = (short) (this.z | 16);
    }

    @Override // defpackage.chxn
    public final void q() {
        this.z = (short) (this.z | 1024);
    }
}
