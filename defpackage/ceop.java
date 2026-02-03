package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceop {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/common/CryptoHelper");
    public final fcsu b;
    public final eosc c;
    private final fcsu d;
    private final Object e = new Object();
    private final Map f = new HashMap();

    public ceop(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        new HashMap();
        this.d = fcsuVar;
        this.b = fcsuVar2;
        this.c = eoscVar;
    }

    public static byte[] c(byte[] bArr) {
        int length;
        return (bArr == null || (length = bArr.length) == 0) ? eonc.i(0) : ByteBuffer.allocate(length + 4).order(ByteOrder.LITTLE_ENDIAN).putInt(length).put(bArr).array();
    }

    public static byte[] d(int i) {
        return ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putInt(4).putInt(i).array();
    }

    public static byte[] e(long j) {
        return ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN).putInt(8).putLong(j).array();
    }

    public final eiju a(String str) {
        return b(str).h(new ejvr() { // from class: ceoi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                byte[][] bArr = (byte[][]) obj;
                try {
                    return Optional.of(new fgwc(fgvz.b(bArr[0]), new fgwa(bArr[1])));
                } catch (fgvy e) {
                    ekrw ekrwVarI = ceop.a.i();
                    ekrwVarI.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "getPhoneKeyPair", (char) 153, "CryptoHelper.java")).q("Cannot find valid Curve25519 key pair");
                    return Optional.empty();
                }
            }
        }, eoqg.a);
    }

    public final eiju b(String str) {
        eiju eijuVarI;
        synchronized (this.e) {
            Map map = this.f;
            eijuVarI = (eiju) map.get(str);
            if (eijuVarI == null) {
                final cexm cexmVarA = ((cexn) this.d.b()).a(str);
                eijuVarI = cexmVarA.g().i(new eooz() { // from class: ceom
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        cevr cevrVar = (cevr) obj;
                        evqs evqsVar = cevrVar.g;
                        evqs evqsVar2 = cevrVar.f;
                        byte[] bArrI = evqsVar.I();
                        byte[] bArrI2 = evqsVar2.I();
                        if (!evqsVar.H() && !evqsVar2.H()) {
                            ekrw ekrwVarE = ceop.a.e();
                            ekrwVarE.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "ensurePhoneKeyPairBytes", 236, "CryptoHelper.java")).q("CryptoHelper: Using existing identity key");
                            return eijx.e(new byte[][]{bArrI2, bArrI});
                        }
                        final cexm cexmVar = cexmVarA;
                        fgwc fgwcVarA = fgvz.a();
                        fgwb fgwbVar = fgwcVarA.a;
                        fgwa fgwaVar = fgwcVarA.b;
                        final byte[] bArrA = fgwbVar.a();
                        ekrw ekrwVarE2 = ceop.a.e();
                        ekrwVarE2.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/net/common/CryptoHelper", "ensurePhoneKeyPairBytes", 222, "CryptoHelper.java")).q("CryptoHelper: Storing new identity key");
                        if (((aqvc) cexmVar.h.b()).a()) {
                            bwaj bwajVar = (bwaj) cexmVar.g.b();
                            String str2 = cexmVar.f;
                            bArrA.getClass();
                            defn defnVarF = ((dcov) bwajVar.b.b()).f("google_messages_v1", str2, bArrA);
                            final fdap fdapVar = new fdap() { // from class: bvzx
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj2) {
                                    ekrw ekrwVarH = bwaj.a.h();
                                    ekrwVarH.X(eksq.a, "MsgsContactKeyClient");
                                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/etouffee/identitykeycontactsync/MessagesContactKeyClient", "addSelfKeysToContactKeyService$lambda$1", 230, "MessagesContactKeyClient.kt")).q("Successfully added self keys to Contact Key service.");
                                    return fctx.a;
                                }
                            };
                            defnVarF.a(new defh() { // from class: bvzy
                                @Override // defpackage.defh
                                public final void e(Object obj2) {
                                    fdapVar.invoke(obj2);
                                }
                            });
                            defnVarF.t(new defe() { // from class: bvzz
                                @Override // defpackage.defe
                                public final void d(Exception exc) {
                                    ekrw ekrwVarJ = bwaj.a.j();
                                    ekrwVarJ.X(eksq.a, "MsgsContactKeyClient");
                                    ((ekrd) ((ekrd) ekrwVarJ).g(exc).h("com/google/android/apps/messaging/shared/datamodel/etouffee/identitykeycontactsync/MessagesContactKeyClient", "addSelfKeysToContactKeyService$lambda$3", 233, "MessagesContactKeyClient.kt")).q("Failed to add self keys to Contact Key service.");
                                }
                            });
                        }
                        final byte[] bArr = fgwaVar.a;
                        eiju eijuVarJ = cexmVar.b.j(new ejvr() { // from class: cewr
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cevo cevoVar = (cevo) ((cevr) obj2).toBuilder();
                                evqs evqsVarX = evqs.x(bArrA);
                                cevoVar.copyOnWrite();
                                ((cevr) cevoVar.instance).f = evqsVarX;
                                evqs evqsVarX2 = evqs.x(bArr);
                                cevoVar.copyOnWrite();
                                ((cevr) cevoVar.instance).g = evqsVarX2;
                                return (cevr) cevoVar.build();
                            }
                        });
                        ejvr ejvrVar = new ejvr() { // from class: cews
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return null;
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        return eijuVarJ.h(ejvrVar, eoqgVar).i(new eooz() { // from class: ceon
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return cexmVar.g();
                            }
                        }, eoqgVar).h(new ejvr() { // from class: ceoo
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cevr cevrVar2 = (cevr) obj2;
                                return new byte[][]{cevrVar2.f.I(), cevrVar2.g.I()};
                            }
                        }, eoqgVar);
                    }
                }, eoqg.a);
            }
            map.put(str, eijuVarI);
        }
        return eijuVarI;
    }
}
