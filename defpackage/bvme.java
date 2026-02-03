package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvme implements bvll {
    public static final egyj a = new egyb("CAN_DEVICE_REGISTER_WITH_GAIA_PAIRING_KEY");
    public final egzh b;
    private final cmfo c;
    private final eosc d;

    public bvme(cmfo cmfoVar, eosc eoscVar, egzh egzhVar) {
        this.c = cmfoVar;
        this.d = eoscVar;
        this.b = egzhVar;
    }

    public static boolean q(bvlj bvljVar) {
        return bvljVar.c && (bvljVar.b & 2) != 0;
    }

    @Override // defpackage.bvll
    public final ehaw a() {
        return new bvmd(this);
    }

    @Override // defpackage.bvll
    public final eiju b() {
        return this.c.h().h(new ejvr() { // from class: bvlr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((bvlj) obj).g);
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvll
    public final eiju c() {
        return this.c.j(new ejvr() { // from class: bvma
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bvli bvliVar = (bvli) ((bvlj) obj).toBuilder();
                bvliVar.copyOnWrite();
                bvlj bvljVar = (bvlj) bvliVar.instance;
                bvljVar.b &= -5;
                bvljVar.e = 0L;
                return (bvlj) bvliVar.build();
            }
        }).h(new ejvr() { // from class: bvmb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bvlj bvljVar = (bvlj) obj;
                this.a.p();
                return bvljVar;
            }
        }, this.d);
    }

    @Override // defpackage.bvll
    public final eiju d() {
        return this.c.h();
    }

    @Override // defpackage.bvll
    public final eiju e() {
        return this.c.h().h(new ejvr() { // from class: bvlz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((bvlj) obj).d;
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvll
    public final eiju f() {
        return this.c.h().h(new ejvr() { // from class: bvlt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bvlj bvljVar = (bvlj) obj;
                return bvme.q(bvljVar) ? bvljVar.d : "";
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvll
    public final eiju g() {
        return this.c.h().h(new ejvr() { // from class: bvln
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((bvlj) obj).c);
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvll
    public final eiju h() {
        return this.c.h().h(new ejvr() { // from class: bvls
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((bvlj) obj).f);
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvll
    public final eiju i() {
        return this.c.h().h(new ejvr() { // from class: bvly
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((bvlj) obj).e);
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvll
    public final eiju j() {
        return this.c.h().h(new ejvr() { // from class: bvlq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(bvme.q((bvlj) obj));
            }
        }, eoqg.a);
    }

    @Override // defpackage.bvll
    public final eiju k(final boolean z) {
        return this.c.j(new ejvr() { // from class: bvlw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bvli bvliVar = (bvli) ((bvlj) obj).toBuilder();
                bvliVar.copyOnWrite();
                bvlj bvljVar = (bvlj) bvliVar.instance;
                bvljVar.b |= 8;
                bvljVar.f = z;
                return (bvlj) bvliVar.build();
            }
        }).h(new ejvr() { // from class: bvlx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.bvll
    public final eiju l(final long j) {
        return this.c.j(new ejvr() { // from class: bvlm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bvli bvliVar = (bvli) ((bvlj) obj).toBuilder();
                bvliVar.copyOnWrite();
                bvlj bvljVar = (bvlj) bvliVar.instance;
                bvljVar.b |= 4;
                bvljVar.e = j;
                return (bvlj) bvliVar.build();
            }
        }).h(new ejvr() { // from class: bvlu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.bvll
    public final void m() {
        this.c.m(new ejvr() { // from class: bvmc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bvli bvliVar = (bvli) ((bvlj) obj).toBuilder();
                bvliVar.copyOnWrite();
                bvlj bvljVar = (bvlj) bvliVar.instance;
                bvljVar.b &= -3;
                bvljVar.d = bvlj.a.d;
                bvliVar.copyOnWrite();
                bvlj bvljVar2 = (bvlj) bvliVar.instance;
                bvljVar2.b |= 1;
                bvljVar2.c = false;
                return (bvlj) bvliVar.build();
            }
        });
        p();
    }

    @Override // defpackage.bvll
    public final void n(final String str) {
        this.c.m(new ejvr() { // from class: bvlv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bvli bvliVar = (bvli) ((bvlj) obj).toBuilder();
                bvliVar.copyOnWrite();
                bvlj bvljVar = (bvlj) bvliVar.instance;
                String str2 = str;
                str2.getClass();
                bvljVar.b |= 2;
                bvljVar.d = str2;
                bvliVar.copyOnWrite();
                bvlj bvljVar2 = (bvlj) bvliVar.instance;
                bvljVar2.b |= 1;
                bvljVar2.c = true;
                return (bvlj) bvliVar.build();
            }
        });
        p();
    }

    @Override // defpackage.bvll
    public final void o() {
        this.c.j(new ejvr() { // from class: bvlo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bvli bvliVar = (bvli) ((bvlj) obj).toBuilder();
                bvliVar.copyOnWrite();
                bvlj bvljVar = (bvlj) bvliVar.instance;
                bvljVar.b |= 16;
                bvljVar.g = true;
                return (bvlj) bvliVar.build();
            }
        }).h(new ejvr() { // from class: bvlp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bvme bvmeVar = this.a;
                bvmeVar.b.a(eijx.e(null), bvme.a);
                bvmeVar.p();
                return null;
            }
        }, this.d);
    }

    public final void p() {
        this.b.a(eijx.e(null), "DEVICE_PAIRING_SETTINGS_KEY");
    }
}
