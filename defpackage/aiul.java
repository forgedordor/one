package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiul {
    public static final /* synthetic */ int d = 0;
    private static final long e = TimeUnit.SECONDS.toMillis(60);
    public final ecjh a;
    public final eosc b;
    public final eosc c;
    private final AtomicLong f = new AtomicLong(0);

    public aiul(ecjh ecjhVar, eosc eoscVar, eosc eoscVar2) {
        this.a = ecjhVar;
        this.b = eoscVar;
        this.c = eoscVar2;
    }

    public final eiju a() {
        return eiju.g(this.a.a()).h(new ejvr() { // from class: aitl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = aiul.d;
                evvp evvpVar = ((aith) obj).l;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                return evwz.d(evvpVar);
            }
        }, this.c);
    }

    public final eiju b() {
        return eiju.g(this.a.a()).h(new ejvr() { // from class: aitm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((aith) obj).k;
            }
        }, eoqg.a);
    }

    public final eiju c() {
        return eiju.g(this.a.a()).h(new ejvr() { // from class: aitt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((aith) obj).j);
            }
        }, eoqg.a);
    }

    public final eiju d() {
        return eiju.g(this.a.a()).h(new ejvr() { // from class: aitv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((aith) obj).d);
            }
        }, eoqg.a);
    }

    public final ListenableFuture e() {
        return eika.j(this.a.a(), new ejvr() { // from class: aity
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((aith) obj).f);
            }
        }, eoqg.a);
    }

    public final ListenableFuture f(final Long l) {
        return this.a.b(eiid.a(new ejvr() { // from class: aits
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = aiul.d;
                aitg aitgVar = (aitg) ((aith) obj).toBuilder();
                long jLongValue = l.longValue();
                aitgVar.copyOnWrite();
                aith aithVar = (aith) aitgVar.instance;
                aithVar.b |= 32;
                aithVar.h = jLongValue;
                return (aith) aitgVar.build();
            }
        }), eoqg.a);
    }

    public final ListenableFuture g(final long j) {
        AtomicLong atomicLong = this.f;
        long j2 = atomicLong.get();
        long jAbs = Math.abs(j - j2);
        if (j2 != 0 && jAbs <= e) {
            return eijx.e(null);
        }
        atomicLong.set(j);
        return this.a.b(eiid.a(new ejvr() { // from class: aiue
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = aiul.d;
                aitg aitgVar = (aitg) ((aith) obj).toBuilder();
                aitgVar.copyOnWrite();
                aith aithVar = (aith) aitgVar.instance;
                aithVar.b |= 1;
                aithVar.c = j;
                return (aith) aitgVar.build();
            }
        }), eoqg.a);
    }

    public final ListenableFuture h(final long j) {
        return this.a.b(eiid.a(new ejvr() { // from class: aitq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = aiul.d;
                aitg aitgVar = (aitg) ((aith) obj).toBuilder();
                aitgVar.copyOnWrite();
                aith aithVar = (aith) aitgVar.instance;
                aithVar.b |= 64;
                aithVar.i = j;
                return (aith) aitgVar.build();
            }
        }), eoqg.a);
    }

    public final ListenableFuture i(final Long l) {
        return this.a.b(eiid.a(new ejvr() { // from class: aiub
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = aiul.d;
                aitg aitgVar = (aitg) ((aith) obj).toBuilder();
                long jLongValue = l.longValue();
                aitgVar.copyOnWrite();
                aith aithVar = (aith) aitgVar.instance;
                aithVar.b |= 16;
                aithVar.g = jLongValue;
                return (aith) aitgVar.build();
            }
        }), eoqg.a);
    }

    public final eiju j(final int i) {
        return eiju.g(this.a.a()).h(new ejvr() { // from class: aitr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                evvp evvpVar;
                aith aithVar = (aith) obj;
                int i2 = aiul.d;
                if (i == 3) {
                    evvpVar = aithVar.m;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                } else {
                    evvpVar = aithVar.l;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                }
                return evwz.d(evvpVar);
            }
        }, this.c);
    }

    public final eiju k(final int i, final Instant instant) {
        return j(i).i(new eooz() { // from class: aiuj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Instant) obj).equals(Instant.EPOCH)) {
                    return eijx.e(false);
                }
                final Instant instant2 = instant;
                final int i2 = i;
                aiul aiulVar = this.a;
                return eiju.g(aiulVar.a.b(eiid.a(new ejvr() { // from class: aiuh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        aith aithVar = (aith) obj2;
                        int i3 = aiul.d;
                        int i4 = i2;
                        Instant instant3 = instant2;
                        if (i4 == 3) {
                            aitg aitgVar = (aitg) aithVar.toBuilder();
                            evvp evvpVarB = evwz.b(instant3);
                            aitgVar.copyOnWrite();
                            aith aithVar2 = (aith) aitgVar.instance;
                            evvpVarB.getClass();
                            aithVar2.m = evvpVarB;
                            aithVar2.b |= 2048;
                            return (aith) aitgVar.build();
                        }
                        aitg aitgVar2 = (aitg) aithVar.toBuilder();
                        evvp evvpVarB2 = evwz.b(instant3);
                        aitgVar2.copyOnWrite();
                        aith aithVar3 = (aith) aitgVar2.instance;
                        evvpVarB2.getClass();
                        aithVar3.l = evvpVarB2;
                        aithVar3.b |= 1024;
                        return (aith) aitgVar2.build();
                    }
                }), aiulVar.c)).h(new ejvr() { // from class: aiui
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        int i3 = aiul.d;
                        return true;
                    }
                }, aiulVar.b);
            }
        }, this.c);
    }
}
