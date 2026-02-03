package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwnc implements bayb {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "EncryptedRetryMessageListener");
    public final fcsu b;
    private final fcsu c;

    public bwnc(fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = fcsuVar;
        this.b = fcsuVar2;
    }

    private static void a(final MessageCoreData messageCoreData, Optional optional) {
        optional.ifPresent(new Consumer() { // from class: bwna
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                basd basdVar = (basd) obj;
                cqbd cqbdVarC = bwnc.a.c();
                cqbdVarC.I("Update original RcsMessageId.");
                MessageCoreData messageCoreData2 = messageCoreData;
                cqbdVarC.h(messageCoreData2.F());
                cqbdVarC.A("OriginalRcsMessageId", basdVar.f());
                cqbdVarC.r();
                messageCoreData2.bG(basdVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        if (messageCoreData.cB()) {
            final basd basdVarF = messageCoreData.F();
            basdVarF.getClass();
            String[] strArr = bsmv.a;
            bsmj bsmjVar = new bsmj();
            bsmjVar.f("deleteSavedDecryptResult");
            bsmjVar.a(new Function() { // from class: bwou
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsmu bsmuVar = (bsmu) obj;
                    bsmuVar.d(basdVarF);
                    bsmuVar.b(bvdv.DECRYPTED);
                    return bsmuVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int iD = bsmjVar.d();
            cqce cqceVar = a;
            cqbd cqbdVarA = cqceVar.a();
            cqbdVarA.I("Deleted the saved decrypt result");
            cqbdVarA.h(messageCoreData.F());
            cqbdVarA.y("count", iD);
            cqbdVarA.r();
            if (bwbv.f()) {
                Optional optionalA = ((bwmz) this.c.b()).a(messageCoreData.ac());
                cqbd cqbdVarA2 = cqceVar.a();
                cqbdVarA2.I("Received an encrypted message.");
                cqbdVarA2.B("IsRetry", optionalA.isPresent());
                cqbdVarA2.r();
                optionalA.ifPresent(new Consumer() { // from class: bwnb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        final basd basdVar = (basd) obj;
                        String[] strArr2 = bsmv.a;
                        bsmj bsmjVar2 = new bsmj();
                        bsmjVar2.f("removePendingFtdMessage");
                        bsmjVar2.a(new Function() { // from class: bwns
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bsmu bsmuVar = (bsmu) obj2;
                                bsmuVar.d(basdVar);
                                bsmuVar.b(bvdv.FAILED_TO_DECRYPT);
                                return bsmuVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int iD2 = bsmjVar2.d();
                        cqbd cqbdVarC = bwnt.a.c();
                        cqbdVarC.I("Removed the pending message");
                        cqbdVarC.h(basdVar);
                        cqbdVarC.y("count", iD2);
                        cqbdVarC.r();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    @Override // defpackage.bayb
    public final void e(MessageCoreData messageCoreData) {
        if (messageCoreData.cB()) {
            fcsu fcsuVar = this.c;
            a(messageCoreData, ((bwmz) fcsuVar.b()).a(messageCoreData.ac()));
            a(messageCoreData, civb.a(messageCoreData.ac(), civa.ETOUFFEE_NAMESPACE, "original-rcs-message-id").map(new bwmt()));
        }
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayb
    public final void k(MessageCoreData messageCoreData) {
    }
}
