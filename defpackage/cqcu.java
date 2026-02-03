package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqcu implements cqcl {
    public static final cczv a = cdag.h(cdag.b, "enable_unredacted_phone_numbers_feedback_data", false);
    public final eosc b;
    public final cmfo c;
    private final eksp d = eksp.c("Bugle");
    private final eosc e;
    private final egpe f;

    public cqcu(fcsu fcsuVar, eosc eoscVar, eosc eoscVar2) {
        this.e = eoscVar;
        this.b = eoscVar2;
        cmgk cmgkVar = (cmgk) fcsuVar.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.PII_LOG_BRIDGE);
        cmggVarC.f(cqcn.a);
        this.c = cmgkVar.a(cmggVarC.a());
        this.f = new egpe(new eooy() { // from class: cqco
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final cqcu cqcuVar = this.a;
                return cqcuVar.c.h().i(new eooz() { // from class: cqct
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        cqcn cqcnVar = (cqcn) obj;
                        if ((cqcnVar.b & 1) != 0 && !cqcnVar.c.isEmpty()) {
                            return eork.i(cqcnVar.c);
                        }
                        cqcu cqcuVar2 = cqcuVar;
                        return cqcuVar2.c.j(new ejvr() { // from class: cqcp
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                cczv cczvVar = cqcu.a;
                                cqcm cqcmVar = (cqcm) ((cqcn) obj2).toBuilder();
                                String string = UUID.randomUUID().toString();
                                cqcmVar.copyOnWrite();
                                cqcn cqcnVar2 = (cqcn) cqcmVar.instance;
                                string.getClass();
                                cqcnVar2.b |= 1;
                                cqcnVar2.c = string;
                                return (cqcn) cqcmVar.build();
                            }
                        }).h(new ejvr() { // from class: cqcq
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return ((cqcn) obj2).c;
                            }
                        }, cqcuVar2.b);
                    }
                }, cqcuVar.b);
            }
        }, eoscVar2);
    }

    @Override // defpackage.cqcl
    public final CharSequence a(final CharSequence charSequence, int i) {
        final String strConcat;
        if (((Boolean) a.e()).booleanValue()) {
            egpe egpeVar = this.f;
            if (egpeVar.c().isDone()) {
                if (i - 1 == 1) {
                    try {
                        String str = (String) eork.q(egpeVar.c());
                        if (charSequence == null) {
                            strConcat = null;
                        } else if (TextUtils.isEmpty(str)) {
                            strConcat = cqcv.b(charSequence);
                        } else {
                            int i2 = elcz.a;
                            strConcat = "Redacted-".concat(elcx.a.c(((String) charSequence).concat(String.valueOf(str)), StandardCharsets.UTF_8).toString());
                        }
                        eieu eieuVarK = eiiy.k("PiiLogBridgeImpl#syncToDatabase");
                        try {
                            eiju eijuVarG = eijx.g(new Callable() { // from class: cqcr
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    cczv cczvVar = cqcu.a;
                                    String[] strArr = bspe.a;
                                    bsoe bsoeVar = new bsoe();
                                    final CharSequence charSequence2 = charSequence;
                                    bsoeVar.b(charSequence2.toString());
                                    bsoeVar.c(strConcat.toString());
                                    final bsob bsobVarA = bsoeVar.a();
                                    final bspc bspcVar = new bspc((bspd) new Function() { // from class: cqcs
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bspd bspdVar = (bspd) obj;
                                            cczv cczvVar2 = cqcu.a;
                                            bspdVar.ap(new dqpj("pii_hash.hash_key", 1, String.valueOf(charSequence2.toString())));
                                            return bspdVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }.apply(new bspd()));
                                    final dqsy dqsyVarA = bspe.a();
                                    Boolean bool = (Boolean) dqsyVarA.o(new ejxr() { // from class: bsny
                                        @Override // defpackage.ejxr
                                        public final Object get() {
                                            String[] strArr2 = bspe.a;
                                            bspb bspbVar = new bspb();
                                            final bsob bsobVar = bsobVarA;
                                            bsobVar.aA(1, "timestamp");
                                            Instant instant = bsobVar.b;
                                            if (instant == null) {
                                                bspbVar.a.putNull("timestamp");
                                            } else {
                                                bspbVar.a.put("timestamp", Long.valueOf(bart.a(instant)));
                                            }
                                            bspc bspcVar2 = bspcVar;
                                            bsobVar.aA(2, "hash_value");
                                            String str2 = bsobVar.c;
                                            ContentValues contentValues = bspbVar.a;
                                            dqru.v(contentValues, "hash_value", str2);
                                            bsobVar.aA(3, "hash_key");
                                            dqru.v(contentValues, "hash_key", bsobVar.d);
                                            bspbVar.al();
                                            bspbVar.af(bspcVar2);
                                            bspbVar.an(new dqsb("pii_hash", "-updateOrInsert-update"));
                                            if (bspbVar.b().e() != 0) {
                                                return true;
                                            }
                                            final dqsy dqsyVar = dqsyVarA;
                                            return Boolean.valueOf(dqru.b(bspe.a(), "pii_hash", bsobVar, new Function() { // from class: bsnz
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj) {
                                                    return Long.valueOf(dqsyVar.O("pii_hash", (dqst) obj));
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            }, new Consumer() { // from class: bsoa
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj) {
                                                    Long l = (Long) obj;
                                                    if (l.longValue() >= 0) {
                                                        bsob bsobVar2 = bsobVar;
                                                        bsobVar2.a = l.longValue();
                                                        bsobVar2.fN(0);
                                                    }
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            }) != -1);
                                        }
                                    });
                                    bool.booleanValue();
                                    return bool;
                                }
                            }, this.e);
                            eieuVarK.b(eijuVarG);
                            eijuVarG.k(auvh.b(), this.b);
                            eieuVarK.close();
                            return strConcat;
                        } finally {
                        }
                    } catch (ExecutionException e) {
                        ((eksl) ((eksl) ((eksl) this.d.j()).g(e)).h("com/google/android/apps/messaging/shared/util/common/PiiLogBridgeImpl", "sanitizePii", 's', "PiiLogBridgeImpl.java")).q("Failed to get salt for sanitize pii.");
                    }
                }
                return cqcv.b(charSequence);
            }
        }
        return cqcv.b(charSequence);
    }
}
