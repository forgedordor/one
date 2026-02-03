package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bake extends baqz {
    public Optional a;
    public Optional b;
    public Optional c;
    public Optional d;
    public Optional e;
    private cnqj f;
    private bvdk g;
    private Optional h;
    private Optional i;
    private ekgb j;
    private boolean k;
    private boolean l;
    private int m;
    private Optional n;
    private long o;
    private boolean p;
    private boolean q;
    private Optional r;
    private Optional s;
    private Optional t;
    private boolean u;
    private ajsm v;
    private byte w;
    private int x;

    public bake() {
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.a = Optional.empty();
        this.n = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.r = Optional.empty();
        this.s = Optional.empty();
        this.t = Optional.empty();
        this.e = Optional.empty();
    }

    @Override // defpackage.baqz
    public final bara a() {
        if (this.w == -1 && this.f != null && this.g != null && this.j != null && this.x != 0 && this.v != null) {
            return new bakf(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.a, this.m, this.n, this.o, this.b, this.p, this.x, this.q, this.c, this.d, this.r, this.s, this.t, this.e, this.u, this.v);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" threadId");
        }
        if (this.g == null) {
            sb.append(" archiveStatus");
        }
        if (this.j == null) {
            sb.append(" participants");
        }
        if ((this.w & 1) == 0) {
            sb.append(" notificationEnabled");
        }
        if ((this.w & 2) == 0) {
            sb.append(" notificationVibration");
        }
        if ((this.w & 4) == 0) {
            sb.append(" sourceType");
        }
        if ((this.w & 8) == 0) {
            sb.append(" joinState");
        }
        if ((this.w & 16) == 0) {
            sb.append(" rcsSessionId");
        }
        if ((this.w & 32) == 0) {
            sb.append(" hasBeenRestoredFromTelephony");
        }
        if (this.x == 0) {
            sb.append(" restorationSource");
        }
        if ((this.w & 64) == 0) {
            sb.append(" isRcsGroup");
        }
        if ((this.w & 128) == 0) {
            sb.append(" shouldTriggerCreationListeners");
        }
        if (this.v == null) {
            sb.append(" conversationCreationSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.baqz
    public final Optional b() {
        return this.s;
    }

    @Override // defpackage.baqz
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.baqz
    public final Optional d() {
        return this.r;
    }

    @Override // defpackage.baqz
    public final boolean e() {
        if ((this.w & 64) != 0) {
            return this.q;
        }
        throw new IllegalStateException("Property \"isRcsGroup\" has not been set");
    }

    @Override // defpackage.baqz
    public final void f(bvdk bvdkVar) {
        if (bvdkVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.g = bvdkVar;
    }

    @Override // defpackage.baqz
    public final void g(ajsm ajsmVar) {
        if (ajsmVar == null) {
            throw new NullPointerException("Null conversationCreationSource");
        }
        this.v = ajsmVar;
    }

    @Override // defpackage.baqz
    public final void h(String str) {
        this.b = Optional.of(str);
    }

    @Override // defpackage.baqz
    public final void i(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null defaultSelfParticipant");
        }
        this.i = optional;
    }

    @Override // defpackage.baqz
    public final void j(awjl awjlVar) {
        this.t = Optional.of(awjlVar);
    }

    @Override // defpackage.baqz
    public final void k(boolean z) {
        this.p = z;
        this.w = (byte) (this.w | 32);
    }

    @Override // defpackage.baqz
    public final void l(boolean z) {
        this.q = z;
        this.w = (byte) (this.w | 64);
    }

    @Override // defpackage.baqz
    public final void m(int i) {
        this.m = i;
        this.w = (byte) (this.w | 8);
    }

    @Override // defpackage.baqz
    public final void n(boolean z) {
        this.k = z;
        this.w = (byte) (this.w | 1);
    }

    @Override // defpackage.baqz
    public final void o(boolean z) {
        this.l = z;
        this.w = (byte) (this.w | 2);
    }

    @Override // defpackage.baqz
    public final void p(List list) {
        this.j = ekgb.n(list);
    }

    @Override // defpackage.baqz
    public final void q(String str) {
        this.d = Optional.of(str);
    }

    @Override // defpackage.baqz
    public final void r(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null rcsGroupSelfMsisdn");
        }
        this.r = optional;
    }

    @Override // defpackage.baqz
    public final void s(long j) {
        this.o = j;
        this.w = (byte) (this.w | 16);
    }

    @Override // defpackage.baqz
    public final void t(int i) {
        if (i == 0) {
            throw new NullPointerException("Null restorationSource");
        }
        this.x = i;
    }

    @Override // defpackage.baqz
    public final void u(SelfIdentityId selfIdentityId) {
        this.h = Optional.of(selfIdentityId);
    }

    @Override // defpackage.baqz
    public final void v(boolean z) {
        this.u = z;
        this.w = (byte) (this.w | (-128));
    }

    @Override // defpackage.baqz
    public final void w() {
        this.w = (byte) (this.w | 4);
    }

    @Override // defpackage.baqz
    public final void x(cnqj cnqjVar) {
        if (cnqjVar == null) {
            throw new NullPointerException("Null threadId");
        }
        this.f = cnqjVar;
    }

    public bake(bara baraVar) {
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.a = Optional.empty();
        this.n = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.r = Optional.empty();
        this.s = Optional.empty();
        this.t = Optional.empty();
        this.e = Optional.empty();
        bakf bakfVar = (bakf) baraVar;
        this.f = bakfVar.a;
        this.g = bakfVar.b;
        this.h = bakfVar.c;
        this.i = bakfVar.d;
        this.j = bakfVar.e;
        this.k = bakfVar.f;
        this.l = bakfVar.g;
        this.a = bakfVar.h;
        this.m = bakfVar.i;
        this.n = bakfVar.j;
        this.o = bakfVar.k;
        this.b = bakfVar.l;
        this.p = bakfVar.m;
        this.x = bakfVar.w;
        this.q = bakfVar.n;
        this.c = bakfVar.o;
        this.d = bakfVar.p;
        this.r = bakfVar.q;
        this.s = bakfVar.r;
        this.t = bakfVar.s;
        this.e = bakfVar.t;
        this.u = bakfVar.u;
        this.v = bakfVar.v;
        this.w = (byte) -1;
    }
}
