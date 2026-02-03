package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwhm extends cayv {
    private static final cqce a = cqce.g("BugleE2eeEtouffee", "IdentityVerificationPendingMessageWorkItemHandler");
    private final Context b;
    private final bwhk c;
    private final cgbn d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public bwhm(Context context, bwhk bwhkVar, cgbn cgbnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.b = context;
        this.c = bwhkVar;
        this.d = cgbnVar;
        this.e = fcsuVar;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar2;
        this.i = fcsuVar5;
    }

    public static String k(String str, aubq aubqVar) {
        return aubqVar == null ? str : aubqVar.d;
    }

    private final aubq l(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        cczv cczvVar = alvx.a;
        if (((Boolean) new alup().get()).booleanValue()) {
            return ((asqx) this.h.b()).a(str, false);
        }
        return null;
    }

    private final eiju m(final String str, final aubq aubqVar, int i, elxz elxzVar) {
        int i2;
        if (elxzVar == elxz.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED) {
            ((ains) this.f.b()).e("Bugle.Etouffee.DecryptionAborted.Reason", bwbw.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED.y);
        }
        bsmq bsmqVarA = bsmv.a();
        bsmqVarA.A("logFailureForPendingMessages");
        bsmqVarA.d(new Function() { // from class: bwhl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsmu bsmuVar = (bsmu) obj;
                bsmuVar.e(bwhm.k(str, aubqVar));
                return bsmuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsln bslnVar = (bsln) bsmqVarA.b().p();
        while (bslnVar.moveToNext()) {
            try {
                fcsu fcsuVar = this.e;
                bwey bweyVar = (bwey) fcsuVar.b();
                String strE = basd.e(bslnVar.c());
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                elxx elxxVar = (elxx) elya.a.createBuilder();
                elxxVar.copyOnWrite();
                elya elyaVar = (elya) elxxVar.instance;
                elyaVar.b |= 1;
                elyaVar.c = strE;
                elxxVar.copyOnWrite();
                elya elyaVar2 = (elya) elxxVar.instance;
                elyaVar2.d = elxzVar.i;
                elyaVar2.b |= 2;
                elxxVar.copyOnWrite();
                elya elyaVar3 = (elya) elxxVar.instance;
                elyaVar3.b |= 4;
                elyaVar3.e = i;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                elya elyaVar4 = (elya) elxxVar.build();
                elyaVar4.getClass();
                ellhVar2.ab = elyaVar4;
                ellhVar2.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                if (bweyVar.c.a()) {
                    ((cbqh) bweyVar.b.b()).a(emxt.BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED, ellgVar);
                } else {
                    ((aill) bweyVar.a.b()).j(ellgVar);
                }
                bwey bweyVar2 = (bwey) fcsuVar.b();
                basd basdVarC = bslnVar.c();
                int iOrdinal = elxzVar.ordinal();
                if (iOrdinal == 2) {
                    i2 = 25;
                } else {
                    if (iOrdinal != 7) {
                        throw new IllegalStateException("Unknown reason");
                    }
                    i2 = 42;
                }
                bweyVar2.c(basdVarC, i2);
            } catch (Throwable th) {
                try {
                    bslnVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bslnVar.close();
        final aubq aubqVarL = l(k(str, aubqVar));
        final String strK = k(str, aubqVar);
        bsmj bsmjVar = new bsmj();
        bsmjVar.f("IdentityVerificationPendingMessageProcessor#clearQueue");
        bsmjVar.a(new Function() { // from class: bwgu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsmu bsmuVar = (bsmu) obj;
                bsmuVar.e(bwhk.a(aubqVarL, strK));
                bsmuVar.c(bvdv.WAITING_IDENTITY_VERIFICATION, bvdv.WAITING_PRIOR_MESSAGE);
                return bsmuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsmjVar.d();
        return eijx.e(cbcw.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final eiju n(cayy cayyVar, String str, aubq aubqVar) {
        cqce cqceVar = a;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Starting identity verification worker.");
        String str2 = aubqVar == 0 ? "remoteUserId" : "chatEndpoint";
        String str3 = aubqVar == 0 ? str : aubqVar;
        cqbdVarC.N(str2, str3);
        cqbdVarC.r();
        final int i = ((caxm) cayyVar.a()).c;
        if (i > ((Integer) bwbt.t.e()).intValue()) {
            cqbd cqbdVarE = cqceVar.e();
            cqbdVarE.I("Unable to refresh remote user registration. Dropping all pending messages from that user.");
            cqbdVarE.N(aubqVar != 0 ? "chatEndpoint" : "remoteUserId", str3);
            cqbdVarE.y("runAttemptCount", i);
            cqbdVarE.r();
            return m(str, aubqVar, i, elxz.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED);
        }
        final bwhk bwhkVar = this.c;
        final aubq aubqVarL = l(k(str, aubqVar));
        final String strK = k(str, aubqVar);
        bsmq bsmqVarA = bsmv.a();
        bsmqVarA.A("pendingMessagesExistFor1");
        bsmqVarA.d(new Function() { // from class: bwhe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsmu bsmuVar = (bsmu) obj;
                bsmuVar.e(bwhk.a(aubqVarL, strK));
                bsmuVar.c(bvdv.WAITING_PRIOR_MESSAGE, bvdv.WAITING_IDENTITY_VERIFICATION);
                return bsmuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bsmo bsmoVarB = bsmqVarA.b();
        eiju eijuVarG = eiju.g(bsmoVarB.C(new Supplier() { // from class: dqvg
            @Override // java.util.function.Supplier
            public final Object get() {
                return Boolean.valueOf(bsmoVarB.U());
            }
        }));
        eooz eoozVar = new eooz() { // from class: bwgw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(cbcw.i());
                }
                final int i2 = i;
                final String str4 = strK;
                final aubq aubqVar2 = aubqVarL;
                final bwhk bwhkVar2 = bwhkVar;
                Callable callable = new Callable() { // from class: bwhc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bsmq bsmqVarA2 = bsmv.a();
                        bsmqVarA2.A("pendingIdentityVerificationFor");
                        final aubq aubqVar3 = aubqVar2;
                        final String str5 = str4;
                        bsmqVarA2.d(new Function() { // from class: bwhj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bsmu bsmuVar = (bsmu) obj2;
                                bsmuVar.e(bwhk.a(aubqVar3, str5));
                                bsmuVar.b(bvdv.WAITING_IDENTITY_VERIFICATION);
                                return bsmuVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        ekgb ekgbVarZ = bsmqVarA2.b().z();
                        return Optional.ofNullable(ekgbVarZ.size() > 0 ? (bsjs) ekgbVarZ.get(0) : null);
                    }
                };
                eosc eoscVar = bwhkVar2.c;
                return eijx.g(callable, eoscVar).i(new eooz() { // from class: bwhd
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        Optional optional = (Optional) obj2;
                        if (!optional.isPresent()) {
                            return eijx.e(cbcw.i());
                        }
                        aubq aubqVarA = aubqVar2;
                        bwhk bwhkVar3 = bwhkVar2;
                        String strP = ((bsjs) optional.get()).p();
                        strP.getClass();
                        fcsu fcsuVar = bwhkVar3.k;
                        aubq aubqVarC = ((asqx) fcsuVar.b()).c(strP);
                        if (aubqVarA == null) {
                            aubqVarA = ((asqx) fcsuVar.b()).a(str4, false);
                        }
                        return bwhkVar3.d.a(aubqVarC, ekgb.r(aubqVarA), elyd.RECEIVED_FIRST_ENCRYPTED_MESSAGE).h(new ejvr() { // from class: bwgz
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                qap qapVar = (qap) obj3;
                                return new qao().equals(qapVar) ? cbcw.i() : new qam().equals(qapVar) ? cbcw.m() : new qan().equals(qapVar) ? cbcw.m() : cbcw.k();
                            }
                        }, eoqg.a);
                    }
                }, eoscVar).h(new ejvr() { // from class: bwha
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cbcw cbcwVar = (cbcw) obj2;
                        ekrg ekrgVar = bwhk.a;
                        ekrw ekrwVarF = ekrgVar.f();
                        ekrz ekrzVar = eksq.a;
                        ekrwVarF.X(ekrzVar, "BugleE2eeEtouffee");
                        ekrd ekrdVar = (ekrd) ekrwVarF;
                        ekrz ekrzVar2 = cqnc.I;
                        final String str5 = str4;
                        ekrdVar.X(ekrzVar2, str5);
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 310, "IdentityVerificationPendingMessageProcessor.java")).t("Completed download remote registration id from tachyon. result: %s", cbcwVar);
                        boolean zE = cbcwVar.e();
                        final bwhk bwhkVar3 = bwhkVar2;
                        if (!zE) {
                            int i3 = i2;
                            ekrw ekrwVarJ = ekrgVar.j();
                            ekrwVarJ.X(ekrzVar, "BugleE2eeEtouffee");
                            ekrd ekrdVar2 = (ekrd) ekrwVarJ;
                            ekrdVar2.X(ekrzVar2, str5);
                            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 326, "IdentityVerificationPendingMessageProcessor.java")).q("Refreshing remote registration failed");
                            ((bwey) bwhkVar3.i.b()).a(elxz.TACHYON_DOWNLOAD_FAILED, i3);
                            return cbcw.m();
                        }
                        bsmq bsmqVarA2 = bsmv.a();
                        bsmqVarA2.A("getAllPendingMessages1");
                        boolean z = true;
                        bsmqVarA2.D((String) DesugarArrays.stream(new bsmn[]{new bsmn(bsmv.c.g)}).map(new Function() { // from class: bsmp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((bsmn) obj3).a();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining(", ")));
                        bsmqVarA2.d(new Function() { // from class: bwgt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                bsmu bsmuVar = (bsmu) obj3;
                                bsmuVar.e(str5);
                                bsmuVar.c(bvdv.WAITING_PRIOR_MESSAGE, bvdv.WAITING_IDENTITY_VERIFICATION);
                                return bsmuVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        ekgb ekgbVarZ = bsmqVarA2.b().z();
                        int size = ekgbVarZ.size();
                        int i4 = 0;
                        while (i4 < size) {
                            bsjs bsjsVar = (bsjs) ekgbVarZ.get(i4);
                            ekrw ekrwVarF2 = ekrgVar.f();
                            ekrwVarF2.X(ekrzVar, "BugleE2eeEtouffee");
                            ekrd ekrdVar3 = (ekrd) ekrwVarF2;
                            boolean z2 = z;
                            ekrdVar3.X(cqnc.f, bsjsVar.k());
                            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", 319, "IdentityVerificationPendingMessageProcessor.java")).q("Processing queued message");
                            final basd basdVarK = bsjsVar.k();
                            bsmj bsmjVar = new bsmj();
                            bsmjVar.f("deletePendingMessage");
                            bsmjVar.a(new Function() { // from class: bwgv
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    bsmu bsmuVar = (bsmu) obj3;
                                    bsmuVar.d(basdVarK);
                                    bsmuVar.c(bvdv.WAITING_PRIOR_MESSAGE, bvdv.WAITING_IDENTITY_VERIFICATION);
                                    return bsmuVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bsmjVar.d();
                            String strM = bsjsVar.m();
                            strM.getClass();
                            ContentType contentTypeE = ContentType.e(strM);
                            aufe aufeVar = (aufe) aufh.b.createBuilder();
                            aubq aubqVar3 = aubq.a;
                            ekgb ekgbVar = ekgbVarZ;
                            aubn aubnVar = (aubn) aubqVar3.createBuilder();
                            ekrg ekrgVar2 = ekrgVar;
                            String strO = bsjsVar.o();
                            strO.getClass();
                            aubnVar.copyOnWrite();
                            int i5 = size;
                            aubq aubqVar4 = (aubq) aubnVar.instance;
                            int i6 = i4;
                            aubqVar4.b |= 2;
                            aubqVar4.d = strO;
                            aubp aubpVar = aubp.PHONE;
                            aubnVar.copyOnWrite();
                            aubq aubqVar5 = (aubq) aubnVar.instance;
                            int i7 = aubpVar.f;
                            aubqVar5.c = i7;
                            aubqVar5.b |= 1;
                            aufeVar.copyOnWrite();
                            aufh aufhVar = (aufh) aufeVar.instance;
                            aubq aubqVar6 = (aubq) aubnVar.build();
                            aubqVar6.getClass();
                            aufhVar.d = aubqVar6;
                            aufhVar.c |= 1;
                            aubn aubnVar2 = (aubn) aubqVar3.createBuilder();
                            String strO2 = bsjsVar.o();
                            strO2.getClass();
                            aubnVar2.copyOnWrite();
                            aubq aubqVar7 = (aubq) aubnVar2.instance;
                            aubqVar7.b |= 2;
                            aubqVar7.d = strO2;
                            aubnVar2.copyOnWrite();
                            aubq aubqVar8 = (aubq) aubnVar2.instance;
                            aubqVar8.c = i7;
                            aubqVar8.b |= 1;
                            aufeVar.copyOnWrite();
                            aufh aufhVar2 = (aufh) aufeVar.instance;
                            aubq aubqVar9 = (aubq) aubnVar2.build();
                            aubqVar9.getClass();
                            aufhVar2.f = aubqVar9;
                            aufhVar2.c |= 8;
                            String str6 = bsjsVar.k().b;
                            str6.getClass();
                            aufeVar.copyOnWrite();
                            aufh aufhVar3 = (aufh) aufeVar.instance;
                            aufhVar3.c |= 256;
                            aufhVar3.j = str6;
                            aufeVar.copyOnWrite();
                            aufh aufhVar4 = (aufh) aufeVar.instance;
                            aufhVar4.c |= 512;
                            aufhVar4.k = "Dummy conversation ID for 1:1 E2EE message.";
                            aubs aubsVar = (aubs) aubt.a.createBuilder();
                            aubx aubxVar = (aubx) bwhkVar3.g.fH().fM(contentTypeE);
                            aubsVar.copyOnWrite();
                            aubt aubtVar = (aubt) aubsVar.instance;
                            aubxVar.getClass();
                            aubtVar.c = aubxVar;
                            aubtVar.b |= 1;
                            String strN = bsjsVar.n();
                            strN.getClass();
                            evqs evqsVarA = evqs.A(strN);
                            aubsVar.copyOnWrite();
                            aubt aubtVar2 = (aubt) aubsVar.instance;
                            aubtVar2.b |= 2;
                            aubtVar2.d = evqsVarA;
                            aufeVar.b(aubsVar);
                            bsjsVar.aA(6, "sent_timestamp");
                            evvp evvpVarC = evxc.c(bsjsVar.g);
                            aufeVar.copyOnWrite();
                            aufh aufhVar5 = (aufh) aufeVar.instance;
                            evvpVarC.getClass();
                            aufhVar5.n = evvpVarC;
                            aufhVar5.c |= 2048;
                            String strP = bsjsVar.p();
                            strP.getClass();
                            ejwl.l(!TextUtils.isEmpty(strP));
                            aubq aubqVarA = ((asqx) bwhkVar3.k.b()).a(strP, false);
                            aufeVar.copyOnWrite();
                            aufh aufhVar6 = (aufh) aufeVar.instance;
                            aubqVarA.getClass();
                            aufhVar6.h = aubqVarA;
                            aufhVar6.c |= 64;
                            bsjsVar.aA(13, "is_group");
                            if (bsjsVar.n) {
                                bsjsVar.aA(14, "conversation_id");
                                String str7 = bsjsVar.o;
                                str7.getClass();
                                aufeVar.copyOnWrite();
                                aufh aufhVar7 = (aufh) aufeVar.instance;
                                aufhVar7.c |= 512;
                                aufhVar7.k = str7;
                                aubn aubnVar3 = (aubn) aubqVar3.createBuilder();
                                bsjsVar.aA(15, "conference_uri");
                                String str8 = bsjsVar.p;
                                str8.getClass();
                                aubnVar3.copyOnWrite();
                                aubq aubqVar10 = (aubq) aubnVar3.instance;
                                aubqVar10.b |= 2;
                                aubqVar10.d = str8;
                                aubp aubpVar2 = aubp.GROUP;
                                aubnVar3.copyOnWrite();
                                aubq aubqVar11 = (aubq) aubnVar3.instance;
                                aubqVar11.c = aubpVar2.f;
                                aubqVar11.b |= 1;
                                aubq aubqVar12 = (aubq) aubnVar3.build();
                                aufeVar.copyOnWrite();
                                aufh aufhVar8 = (aufh) aufeVar.instance;
                                aubqVar12.getClass();
                                aufhVar8.f = aubqVar12;
                                aufhVar8.c |= 8;
                            }
                            bsjsVar.aA(12, "custom_headers");
                            eyga eygaVar = bsjsVar.m;
                            if (eygaVar != null) {
                                aufeVar.copyOnWrite();
                                aufh aufhVar9 = (aufh) aufeVar.instance;
                                aufhVar9.l = eygaVar;
                                aufhVar9.c |= 1024;
                            }
                            bsjsVar.aA(16, "is_delivery_report_requested");
                            if (bsjsVar.q) {
                                aufeVar.d(aufg.POSITIVE_DELIVERY);
                            }
                            bsjsVar.aA(17, "is_display_report_requested");
                            if (bsjsVar.r) {
                                aufeVar.d(aufg.DISPLAY);
                            }
                            bsjsVar.aA(18, "is_negative_delivery_report_requested");
                            if (bsjsVar.s) {
                                aufeVar.d(aufg.NEGATIVE_DELIVERY);
                            }
                            bwhkVar3.l.b((aufh) aufeVar.build()).i(new eooz() { // from class: bwhh
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    aufh aufhVar10 = (aufh) obj3;
                                    final basd basdVarA = basd.a(aufhVar10.j);
                                    final bwhk bwhkVar4 = bwhkVar3;
                                    return bwhkVar4.f.f(aufhVar10).i(new eooz() { // from class: bwhg
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            aubl aublVar = (aubl) obj4;
                                            aubk aubkVar = aubk.OK;
                                            aubk aubkVarB = aubk.b(aublVar.c);
                                            if (aubkVarB == null) {
                                                aubkVarB = aubk.UNKNOWN_STATUS;
                                            }
                                            basd basdVar = basdVarA;
                                            if (aubkVar.equals(aubkVarB)) {
                                                ekrw ekrwVarF3 = bwhk.a.f();
                                                ekrwVarF3.X(eksq.a, "BugleE2eeEtouffee");
                                                ekrd ekrdVar4 = (ekrd) ekrwVarF3;
                                                ekrdVar4.X(cqnc.f, basdVar);
                                                ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "chatApiHandleMessage", 410, "IdentityVerificationPendingMessageProcessor.java")).q("Restoring pending message to incoming Chat API path.");
                                            } else {
                                                ains ainsVar = (ains) bwhkVar4.h.b();
                                                aubk aubkVarB2 = aubk.b(aublVar.c);
                                                if (aubkVarB2 == null) {
                                                    aubkVarB2 = aubk.UNKNOWN_STATUS;
                                                }
                                                ainsVar.e("Bugle.Etouffee.FailedToResumeIncomingChatApiMessageThatWasPendingVerification.Status", aubkVarB2.f);
                                                ekrw ekrwVarJ2 = bwhk.a.j();
                                                ekrwVarJ2.X(eksq.a, "BugleE2eeEtouffee");
                                                ekrd ekrdVar5 = (ekrd) ekrwVarJ2;
                                                ekrdVar5.X(cqnc.f, basdVar);
                                                ekrd ekrdVar6 = (ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "chatApiHandleMessage", 419, "IdentityVerificationPendingMessageProcessor.java");
                                                aubk aubkVarB3 = aubk.b(aublVar.c);
                                                if (aubkVarB3 == null) {
                                                    aubkVarB3 = aubk.UNKNOWN_STATUS;
                                                }
                                                aubi aubiVarB = aubi.b(aublVar.d);
                                                if (aubiVarB == null) {
                                                    aubiVarB = aubi.UNKNOWN_CAUSE;
                                                }
                                                ekrdVar6.u("Failed to restore pending message to incoming Chat API path. error status: %d. error cause: %d", aubkVarB3.f, aubiVarB.v);
                                            }
                                            return eijx.e(null);
                                        }
                                    }, bwhkVar4.e);
                                }
                            }, bwhkVar3.e).k(auvh.b(), eoqg.a);
                            i4 = i6 + 1;
                            z = z2;
                            ekrgVar = ekrgVar2;
                            ekgbVarZ = ekgbVar;
                            size = i5;
                        }
                        cczv cczvVar = alvx.a;
                        if (((Boolean) new alvv().get()).booleanValue()) {
                            bwhkVar3.d(bwhkVar3.j.b(((asqx) bwhkVar3.k.b()).a(str5, false)), str5);
                        } else {
                            bwhkVar3.c(str5);
                        }
                        return cbcw.i();
                    }
                }, bwhkVar2.b).e(Throwable.class, new ejvr() { // from class: bwhb
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ekrw ekrwVarJ = bwhk.a.j();
                        ekrwVarJ.X(eksq.a, "BugleE2eeEtouffee");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((Throwable) obj2)).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "processPendingMessages", (char) 354, "IdentityVerificationPendingMessageProcessor.java")).q("Failure when processing messages in queue");
                        ((bwey) bwhkVar2.i.b()).a(elxz.OTHER_EXCEPTION, i2);
                        return cbcw.m();
                    }
                }, bwhkVar2.e);
            }
        };
        eosc eoscVar = bwhkVar.e;
        return eijuVarG.i(eoozVar, eoscVar).h(new ejvr() { // from class: bwgx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                if (cbcwVar.e()) {
                    ((bwey) bwhkVar.i.b()).a(elxz.SUCCESS, i);
                }
                return cbcwVar;
            }
        }, eoscVar).e(Throwable.class, new ejvr() { // from class: bwgy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarJ = bwhk.a.j();
                ekrwVarJ.X(eksq.a, "BugleE2eeEtouffee");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "tryProcessPendingMessages", (char) 293, "IdentityVerificationPendingMessageProcessor.java")).q("Failure when processing messages pending messages.");
                ((bwey) bwhkVar.i.b()).a(elxz.OTHER_EXCEPTION, i);
                return cbcw.m();
            }
        }, eoscVar);
    }

    private final eiju o(cayy cayyVar, String str, aubq aubqVar, int i) {
        ((bwqp) this.g.b()).a(i);
        return n(cayyVar, str, aubqVar);
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.b(caze.FOREGROUND_SERVICE);
        caxzVarL.g(60000L);
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        caxk caxkVar = (caxk) caxzVarL;
        caxkVar.a = pzhVar.a();
        caxkVar.b = this.d.c(this.b.getString(R.string.identity_verification_notification_text));
        caxzVarL.f(pza.a);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("IdentityVerificationPendingMessageWorkItemHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ewtk.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ewtk ewtkVar = (ewtk) evuhVar;
        String str = ewtkVar.c;
        cczv cczvVar = alvx.a;
        aubq aubqVarA = (!((Boolean) new alvv().get()).booleanValue() || str.isEmpty()) ? null : ((asqx) this.h.b()).a(str, false);
        if (!((Boolean) ((cczi) bwbt.v.get()).e()).booleanValue()) {
            return o(cayyVar, str, aubqVarA, 1);
        }
        if ((ewtkVar.b & 2) == 0) {
            return o(cayyVar, str, aubqVarA, 2);
        }
        ((bwqp) this.g.b()).a(3);
        alre alreVar = (alre) this.i.b();
        alwl alwlVar = ewtkVar.d;
        if (alwlVar == null) {
            alwlVar = alwl.a;
        }
        Optional optionalE = alreVar.b(alwlVar).e();
        if (optionalE.isPresent()) {
            return n(cayyVar, ((aubq) optionalE.get()).d, ((Boolean) new alvv().get()).booleanValue() ? (aubq) optionalE.get() : null);
        }
        return m(str, aubqVarA, ((caxm) cayyVar.a()).c, elxz.SENDERS_USER_ID_EMPTY);
    }
}
