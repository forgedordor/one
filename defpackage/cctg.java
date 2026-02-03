package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cctg extends fcyz implements fdat {
    boolean a;
    int b;
    final /* synthetic */ cjnm c;
    final /* synthetic */ basd d;
    final /* synthetic */ ccth e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cctg(cjnm cjnmVar, basd basdVar, ccth ccthVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cjnmVar;
        this.d = basdVar;
        this.e = ccthVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cctg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean zBooleanValue;
        boolean z;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            z = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("message-resent-originalid");
            final basd basdVar = this.d;
            brdrVarD.h(new Function() { // from class: cctf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    brec brecVar = (brec) obj2;
                    brecVar.N(basdVar);
                    ccte.a(brecVar);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            MessagesTable.BindData bindData = (MessagesTable.BindData) brdrVarD.b().l();
            final cjnm cjnmVar = this.c;
            eyga eygaVar = cjnmVar.d;
            if (eygaVar == null) {
                eygaVar = eyga.a;
            }
            eygaVar.getClass();
            final basd basdVarA = cccz.a(eygaVar);
            if (basdVarA.k() && bindData != null) {
                ekrw ekrwVarJ = ccth.a.j();
                ekrwVarJ.X(eksq.a, "BugleE2eeMls");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.f, basdVar);
                ekrdVar.X(cqnc.h, basdVarA);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/ResentRawRcsMessageSender$sendMessage$2", "invokeSuspend", 82, "ResentRawRcsMessageSender.kt")).q("The message to be resent is already present in the database, cannot be resent.");
                return false;
            }
            if (basdVarA.i() && bindData == null) {
                ekrw ekrwVarJ2 = ccth.a.j();
                ekrwVarJ2.X(eksq.a, "BugleE2eeMls");
                ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                ekrdVar2.X(cqnc.f, basdVar);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/ResentRawRcsMessageSender$sendMessage$2", "invokeSuspend", 95, "ResentRawRcsMessageSender.kt")).q("Unable to resend a message because the headers did not contain original message id");
                return false;
            }
            if (basdVarA.k()) {
                final ccth ccthVar = this.e;
                Object objC = ccthVar.b.c("RawRcsMessageSender::resendDueToFtd", new ejxr() { // from class: ccta
                    @Override // defpackage.ejxr
                    public final Object get() {
                        brdr brdrVarD2 = MessagesTable.d();
                        brdrVarD2.A("message-resent");
                        final basd basdVar2 = basdVarA;
                        brdrVarD2.h(new Function() { // from class: cctc
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                brec brecVar = (brec) obj2;
                                brecVar.N(basdVar2);
                                ccte.a(brecVar);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        MessagesTable.BindData bindData2 = (MessagesTable.BindData) brdrVarD2.b().l();
                        basd basdVar3 = basdVar;
                        if (bindData2 == null) {
                            ekrw ekrwVarJ3 = ccth.a.j();
                            ekrwVarJ3.X(eksq.a, "BugleE2eeMls");
                            ekrd ekrdVar3 = (ekrd) ekrwVarJ3;
                            ekrdVar3.X(cqnc.f, basdVar3);
                            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/ResentRawRcsMessageSender", "resendDueToFtd$lambda$3", 161, "ResentRawRcsMessageSender.kt")).t("Unable to resend a message because the message that is being resent does not exist. original_rcs_message_id=%s", basdVar2);
                            return false;
                        }
                        Instant instantF = ccthVar.c.f();
                        instantF.getClass();
                        bquu bquuVarK = bindData2.K();
                        bquuVarK.W(basdVar3);
                        bquuVarK.j(null);
                        bquuVarK.i(null);
                        bquuVarK.r(Optional.empty());
                        bquuVarK.af(baro.a);
                        bquuVarK.x(Optional.of(UUID.randomUUID()));
                        bquuVarK.aq(4);
                        bquuVarK.V(-1L);
                        bquuVarK.w(true);
                        bquuVarK.ah(bindData2.y() + 1);
                        bquuVarK.J(bindData2.F().c() ? bindData2.E() : bindData2.F());
                        basd basdVarH = bindData2.H().k() ? bindData2.H() : bindData2.I();
                        cjnm cjnmVar2 = cjnmVar;
                        bquuVarK.L(basdVarH);
                        bquuVarK.ae(instantF.toEpochMilli());
                        bquuVarK.R(cjnmVar2);
                        bquuVarK.c();
                        return true;
                    }
                });
                objC.getClass();
                zBooleanValue = ((Boolean) objC).booleanValue();
            } else {
                ccth ccthVar2 = this.e;
                Object objC2 = ccthVar2.b.c("RawRcsMessageSender::resendDueToPending", new ejxr() { // from class: cctd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String[] strArr = MessagesTable.a;
                        brdu brduVar = new brdu();
                        brduVar.ap("RawRcsMessageSender::setMessageOutgoing");
                        final basd basdVar2 = basdVar;
                        brduVar.X(new Function() { // from class: cctb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                brec brecVar = (brec) obj2;
                                brecVar.N(basdVar2);
                                ccte.a(brecVar);
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        brduVar.f(0);
                        brduVar.U(4);
                        int iIntValue = MessagesTable.g().intValue();
                        int iIntValue2 = MessagesTable.g().intValue();
                        if (iIntValue2 < 60820) {
                            dqru.x("raw_rcs_message_to_send", iIntValue2);
                        }
                        if (iIntValue >= 60820) {
                            brduVar.a.put("raw_rcs_message_to_send", cjnmVar.toByteArray());
                        }
                        if (brduVar.b().e() != 0) {
                            return true;
                        }
                        ekrw ekrwVarJ3 = ccth.a.j();
                        ekrwVarJ3.X(eksq.a, "BugleE2eeMls");
                        ekrd ekrdVar3 = (ekrd) ekrwVarJ3;
                        ekrdVar3.X(cqnc.f, basdVar2);
                        ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/e2ee/mls/outgoing/ResentRawRcsMessageSender", "resendDueToPending$lambda$1", 135, "ResentRawRcsMessageSender.kt")).q("Unable to schedule outgoing message for sending");
                        return false;
                    }
                });
                objC2.getClass();
                zBooleanValue = ((Boolean) objC2).booleanValue();
            }
            if (zBooleanValue) {
                eiju eijuVarP = ((aypv) this.e.d.b()).a().p();
                eijuVarP.getClass();
                this.a = true;
                this.b = 1;
                if (koo.a(eijuVarP, this) == fcylVar) {
                    return fcylVar;
                }
            }
            z = zBooleanValue;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cctg(this.c, this.d, this.e, fcxyVar);
    }
}
