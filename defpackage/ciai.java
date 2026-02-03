package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciai extends cicq {
    public Optional a;
    public Optional b;
    public Optional c;
    public cnqj d;
    public int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private Optional i;
    private Optional j;
    private Optional k;
    private Optional l;
    private Optional m;
    private Optional n;
    private Optional o;
    private Optional p;
    private int q;
    private boolean r;
    private Optional s;
    private Optional t;
    private boolean u;
    private ajsm v;
    private byte w;

    public ciai() {
        this.i = Optional.empty();
        this.a = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.s = Optional.empty();
        this.t = Optional.empty();
    }

    @Override // defpackage.cicq
    public final void A(Optional optional) {
        this.i = optional;
    }

    @Override // defpackage.cicq
    public final void B(boolean z) {
        this.u = z;
        this.w = (byte) (this.w | 32);
    }

    @Override // defpackage.cicq
    public final cicq C() {
        this.e = 3;
        return this;
    }

    @Override // defpackage.cicq
    public final cicr a() {
        if (this.w == 63 && this.d != null && this.e != 0 && this.v != null) {
            return new ciaj(this.f, this.g, this.h, this.i, this.a, this.j, this.k, this.l, this.b, this.c, this.m, this.n, this.o, this.p, this.q, this.d, this.r, this.e, this.s, this.t, this.u, this.v);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.w & 1) == 0) {
            sb.append(" createConversationIfNotPresent");
        }
        if ((this.w & 2) == 0) {
            sb.append(" isBot");
        }
        if ((this.w & 4) == 0) {
            sb.append(" isRcsGroup");
        }
        if ((this.w & 8) == 0) {
            sb.append(" rcsGroupJoinState");
        }
        if (this.d == null) {
            sb.append(" knownThreadForConversationCreation");
        }
        if ((this.w & 16) == 0) {
            sb.append(" hasBeenRestoredFromTelephony");
        }
        if (this.e == 0) {
            sb.append(" restorationSource");
        }
        if ((this.w & 32) == 0) {
            sb.append(" shouldTriggerCreationListeners");
        }
        if (this.v == null) {
            sb.append(" conversationCreationSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cicq
    public final Optional b() {
        return this.l;
    }

    @Override // defpackage.cicq
    public final Optional c() {
        return this.n;
    }

    @Override // defpackage.cicq
    public final Optional d() {
        return this.k;
    }

    @Override // defpackage.cicq
    public final Optional e() {
        return this.j;
    }

    @Override // defpackage.cicq
    public final Optional f() {
        return this.a;
    }

    @Override // defpackage.cicq
    public final Optional g() {
        return this.c;
    }

    @Override // defpackage.cicq
    public final Optional h() {
        return this.i;
    }

    @Override // defpackage.cicq
    public final void i(ajsm ajsmVar) {
        if (ajsmVar == null) {
            throw new NullPointerException("Null conversationCreationSource");
        }
        this.v = ajsmVar;
    }

    @Override // defpackage.cicq
    public final void j(boolean z) {
        this.f = z;
        this.w = (byte) (this.w | 1);
    }

    @Override // defpackage.cicq
    public final void k(eyga eygaVar) {
        this.s = Optional.ofNullable(eygaVar);
    }

    @Override // defpackage.cicq
    public final void l(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null defaultSelfParticipant");
        }
        this.m = optional;
    }

    @Override // defpackage.cicq
    public final void m(awjl awjlVar) {
        this.t = Optional.of(awjlVar);
    }

    @Override // defpackage.cicq
    public final void n(String str) {
        this.l = Optional.of(str);
    }

    @Override // defpackage.cicq
    public final void o(boolean z) {
        this.r = z;
        this.w = (byte) (this.w | 16);
    }

    @Override // defpackage.cicq
    public final void p(boolean z) {
        this.g = z;
        this.w = (byte) (this.w | 2);
    }

    @Override // defpackage.cicq
    public final void q(boolean z) {
        this.h = z;
        this.w = (byte) (this.w | 4);
    }

    @Override // defpackage.cicq
    public final void r(List list) {
        this.n = Optional.of(list);
    }

    @Override // defpackage.cicq
    public final void s(String str) {
        this.k = Optional.of(str);
    }

    @Override // defpackage.cicq
    public final void t(cigb cigbVar) {
        this.o = Optional.of(cigbVar);
    }

    @Override // defpackage.cicq
    public final void u(String str) {
        this.j = Optional.of(str);
    }

    @Override // defpackage.cicq
    public final void v(int i) {
        this.q = i;
        this.w = (byte) (this.w | 8);
    }

    @Override // defpackage.cicq
    public final void w(emaf emafVar) {
        this.p = Optional.of(emafVar);
    }

    @Override // defpackage.cicq
    public final void x(Optional optional) {
        this.c = optional;
    }

    @Override // defpackage.cicq
    public final void y(String str) {
        this.c = Optional.of(str);
    }

    @Override // defpackage.cicq
    public final void z(long j) {
        this.i = Optional.of(Long.valueOf(j));
    }

    public ciai(cicr cicrVar) {
        this.i = Optional.empty();
        this.a = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.b = Optional.empty();
        this.c = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.s = Optional.empty();
        this.t = Optional.empty();
        ciaj ciajVar = (ciaj) cicrVar;
        this.f = ciajVar.a;
        this.g = ciajVar.b;
        this.h = ciajVar.c;
        this.i = ciajVar.d;
        this.a = ciajVar.e;
        this.j = ciajVar.f;
        this.k = ciajVar.g;
        this.l = ciajVar.h;
        this.b = ciajVar.i;
        this.c = ciajVar.j;
        this.m = ciajVar.k;
        this.n = ciajVar.l;
        this.o = ciajVar.m;
        this.p = ciajVar.n;
        this.q = ciajVar.o;
        this.d = ciajVar.p;
        this.r = ciajVar.q;
        this.e = ciajVar.v;
        this.s = ciajVar.r;
        this.t = ciajVar.s;
        this.u = ciajVar.t;
        this.v = ciajVar.u;
        this.w = (byte) 63;
    }
}
