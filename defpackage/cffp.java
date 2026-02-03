package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import org.whispersystems.curve25519.Curve25519;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffp {
    public static final cqce a = cqce.g("BugleNetwork", "RegisterRefreshRequestBuilder");
    public final Supplier b;
    private final eosc c;
    private final cfgs d;
    private final long e;
    private final Optional f;
    private final Callable g;

    public cffp(eosc eoscVar, cfgs cfgsVar, long j, Optional optional, Callable callable, Supplier supplier) {
        this.c = eoscVar;
        this.d = cfgsVar;
        this.f = optional;
        this.e = j;
        this.g = callable;
        this.b = supplier;
    }

    public final cfgr a() {
        cfgr cfgrVarA = this.d.a();
        cfgrVarA.j();
        cfgrVarA.m(this.g);
        cfgrVarA.k(this.e);
        cfgrVarA.l();
        cfgrVarA.k = this.f;
        return cfgrVarA;
    }

    public final ListenableFuture b(final ezpp ezppVar, final cfgr cfgrVar) {
        return eika.j(cfgrVar.b(), new ejvr() { // from class: cffo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                byte[] bArrB;
                ezlk ezlkVar = (ezlk) ezll.a.createBuilder();
                ezol ezolVar = (ezol) this.a.b.get();
                ezlkVar.copyOnWrite();
                ezll ezllVar = (ezll) ezlkVar.instance;
                ezolVar.getClass();
                ezllVar.d = ezolVar;
                ezllVar.b |= 2;
                cfgr cfgrVar2 = cfgrVar;
                long jA = cfgrVar2.a();
                ezlkVar.copyOnWrite();
                ((ezll) ezlkVar.instance).e = jA;
                ezlkVar.copyOnWrite();
                ezll ezllVar2 = (ezll) ezlkVar.instance;
                ezlj ezljVar = (ezlj) ((ezli) obj).build();
                ezljVar.getClass();
                ezllVar2.h = ezljVar;
                ezllVar2.b |= 4;
                ezll ezllVar3 = (ezll) ezlkVar.build();
                cffp.a.m("Creating RegisterRefreshRequest");
                eiju eijuVar = cfgrVar2.g;
                if (eijuVar == null) {
                    throw new IllegalStateException("Key pair future is not set.");
                }
                try {
                    Optional optional = (Optional) eork.q(eijuVar);
                    fgwc fgwcVar = optional.isPresent() ? (fgwc) optional.get() : null;
                    if (fgwcVar == null) {
                        throw new IllegalStateException("Key pair is not available.");
                    }
                    try {
                        int i = ezllVar3.f;
                        char c = i != 0 ? i != 2 ? (char) 0 : (char) 4 : (char) 2;
                        if (c != 0 && c == 4) {
                            ezpp ezppVar2 = ezllVar3.c;
                            if (ezppVar2 == null) {
                                ezppVar2 = ezpp.a;
                            }
                            bArrB = eomt.b(ceop.c(ezppVar2.c.getBytes(StandardCharsets.UTF_8)), ceop.e(ezllVar3.e));
                        } else {
                            byte[] bArrD = ceop.d(0);
                            byte[] bArrD2 = ceop.d(0);
                            ezlj ezljVar2 = ezllVar3.h;
                            if (ezljVar2 == null) {
                                ezljVar2 = ezlj.a;
                            }
                            if ((ezljVar2.b & 4) != 0) {
                                ezlj ezljVar3 = ezllVar3.h;
                                if (ezljVar3 == null) {
                                    ezljVar3 = ezlj.a;
                                }
                                ezpb ezpbVar = ezljVar3.i;
                                if (ezpbVar == null) {
                                    ezpbVar = ezpb.a;
                                }
                                bArrD = ceop.d(ezpbVar.b);
                                ezlj ezljVar4 = ezllVar3.h;
                                if (ezljVar4 == null) {
                                    ezljVar4 = ezlj.a;
                                }
                                ezpb ezpbVar2 = ezljVar4.i;
                                if (ezpbVar2 == null) {
                                    ezpbVar2 = ezpb.a;
                                }
                                bArrD2 = ceop.c(ezpbVar2.c.I());
                            }
                            ezol ezolVar2 = ezllVar3.d;
                            if (ezolVar2 == null) {
                                ezolVar2 = ezol.a;
                            }
                            byte[] bArrC = ceop.c(ezolVar2.d.getBytes("UTF-8"));
                            ezol ezolVar3 = ezllVar3.d;
                            if (ezolVar3 == null) {
                                ezolVar3 = ezol.a;
                            }
                            byte[] bArrD3 = ceop.d(ezolVar3.b);
                            ezol ezolVar4 = ezllVar3.d;
                            if (ezolVar4 == null) {
                                ezolVar4 = ezol.a;
                            }
                            byte[] bArrC2 = ceop.c(ezolVar4.c.getBytes("UTF-8"));
                            ezlj ezljVar5 = ezllVar3.h;
                            if (ezljVar5 == null) {
                                ezljVar5 = ezlj.a;
                            }
                            byte[] bArrC3 = ceop.c(ezljVar5.f.getBytes("UTF-8"));
                            ezlj ezljVar6 = ezllVar3.h;
                            if (ezljVar6 == null) {
                                ezljVar6 = ezlj.a;
                            }
                            byte[] bArrC4 = ceop.c(ezljVar6.g.I());
                            ezlj ezljVar7 = ezllVar3.h;
                            if (ezljVar7 == null) {
                                ezljVar7 = ezlj.a;
                            }
                            bArrB = eomt.b(bArrC, bArrD3, bArrC2, bArrC3, bArrC4, ceop.c(ezljVar7.h.getBytes("UTF-8")), bArrD, bArrD2, ceop.e(ezllVar3.e));
                        }
                        try {
                            byte[] bArrCalculateSignature = Curve25519.getInstance(Curve25519.BEST).calculateSignature(fgwcVar.b.a, bArrB);
                            bArrCalculateSignature.getClass();
                            if (cqbe.c() && !Curve25519.getInstance(Curve25519.BEST).verifySignature(fgwcVar.a.a, bArrB, bArrCalculateSignature)) {
                                throw new IllegalStateException("unable to verify signature locally");
                            }
                            evqs evqsVarX = evqs.x(bArrCalculateSignature);
                            ezpp ezppVar3 = ezppVar;
                            ezlk ezlkVar2 = (ezlk) ezllVar3.toBuilder();
                            ezlkVar2.copyOnWrite();
                            ezll ezllVar4 = (ezll) ezlkVar2.instance;
                            ezppVar3.getClass();
                            ezllVar4.c = ezppVar3;
                            ezllVar4.b |= 1;
                            ezlkVar2.copyOnWrite();
                            ((ezll) ezlkVar2.instance).g = evqsVarX;
                            return (ezll) ezlkVar2.build();
                        } catch (fgvy e) {
                            ekrw ekrwVarI = ceop.a.i();
                            ekrwVarI.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "signBytes", (char) 317, "CryptoHelper.java")).q("failed to signBytes");
                            throw new IllegalStateException("Failed to sign", e);
                        }
                    } catch (UnsupportedEncodingException e2) {
                        throw new IllegalStateException("Unsupported encoding in the request", e2);
                    }
                } catch (ExecutionException e3) {
                    throw new IllegalStateException("Key pair is not available.", e3);
                }
            }
        }, this.c);
    }
}
