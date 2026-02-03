package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awfd implements awgf {
    public final fcsu a;
    public final Supplier b;
    public final eosc c;
    public volatile Integer d = null;
    private final eoqr e = new eoqr();

    public awfd(fcsu fcsuVar, eosc eoscVar, final fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.c = eoscVar;
        this.b = new Supplier() { // from class: awfb
            @Override // java.util.function.Supplier
            public final Object get() {
                cmgk cmgkVar = (cmgk) fcsuVar2.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.PHONE_NUMBER_MIN_MATCH_GUESS);
                cmggVarC.f(awgb.a);
                return cmgkVar.a(cmggVarC.a());
            }
        };
    }

    @Override // defpackage.awgf
    public final eiju a() {
        return this.d != null ? eijx.e(Optional.of(this.d)) : eiju.g(this.e.b(eiid.c(new eooy() { // from class: awfa
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final awfd awfdVar = this.a;
                return awfdVar.d != null ? eijx.e(Optional.of(awfdVar.d)) : ((cmfo) awfdVar.b.get()).h().i(new eooz() { // from class: awfc
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        awgb awgbVar = (awgb) obj;
                        if ((awgbVar.b & 1) != 0) {
                            return eijx.e(Optional.of(Integer.valueOf(awgbVar.c)));
                        }
                        final awfd awfdVar2 = awfdVar;
                        return ((awgf) awfdVar2.a.b()).a().i(new eooz() { // from class: awey
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final Optional optional = (Optional) obj2;
                                if (!optional.isPresent() || ((Integer) optional.get()).intValue() < 6) {
                                    return eijx.e(optional);
                                }
                                awfd awfdVar3 = awfdVar2;
                                awfdVar3.d = (Integer) optional.get();
                                return ((cmfo) awfdVar3.b.get()).j(new ejvr() { // from class: awew
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        awga awgaVar = (awga) ((awgb) obj3).toBuilder();
                                        int iIntValue = ((Integer) optional.get()).intValue();
                                        awgaVar.copyOnWrite();
                                        awgb awgbVar2 = (awgb) awgaVar.instance;
                                        awgbVar2.b |= 1;
                                        awgbVar2.c = iIntValue;
                                        return (awgb) awgaVar.build();
                                    }
                                }).h(new ejvr() { // from class: awex
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        return optional;
                                    }
                                }, eoqg.a);
                            }
                        }, awfdVar2.c);
                    }
                }, awfdVar.c);
            }
        }), this.c));
    }

    @Override // defpackage.awgf
    public final Optional b() {
        ejwl.l(!ecem.g());
        if (this.d != null) {
            return Optional.of(this.d);
        }
        try {
            awgb awgbVar = (awgb) ((cmfo) this.b.get()).l();
            if ((awgbVar.b & 1) != 0) {
                return Optional.of(Integer.valueOf(awgbVar.c));
            }
            final Optional optionalB = ((awgf) this.a.b()).b();
            if (optionalB.isPresent() && ((Integer) optionalB.get()).intValue() >= 6) {
                ((cmfo) this.b.get()).m(new ejvr() { // from class: awez
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        awga awgaVar = (awga) ((awgb) obj).toBuilder();
                        int iIntValue = ((Integer) optionalB.get()).intValue();
                        awgaVar.copyOnWrite();
                        awgb awgbVar2 = (awgb) awgaVar.instance;
                        awgbVar2.b |= 1;
                        awgbVar2.c = iIntValue;
                        return (awgb) awgaVar.build();
                    }
                });
            }
            return optionalB;
        } catch (evtj e) {
            throw new RuntimeException(e);
        }
    }
}
