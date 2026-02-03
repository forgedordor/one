package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chxq {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/TransactionIdFactory");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19, types: [alqm, java.lang.Object] */
    public static String a(MessageCoreData messageCoreData, String str, bojh bojhVar) {
        cgsr cgsrVar = null;
        cgsrVar = null;
        if (bojhVar.k() == 2 && str != null) {
            if (!messageCoreData.cO()) {
                String strY = (!ardh.a() || bojhVar.H().equals(bvdp.NAME_IS_MANUAL)) ? bojhVar.Y() : null;
                basd basdVarF = messageCoreData.F();
                String strB = ejwk.b(bojhVar.ae());
                String strD = d(messageCoreData);
                Optional optionalAe = messageCoreData.ae();
                chuy chuyVarB = chxx.b(strB, strY, str);
                chva chvaVar = (chva) chvb.a.createBuilder();
                chvaVar.copyOnWrite();
                chvb chvbVar = (chvb) chvaVar.instance;
                chuz chuzVar = (chuz) chuyVarB.build();
                chuzVar.getClass();
                chvbVar.d = chuzVar;
                chvbVar.c = 2;
                if (basdVarF.k()) {
                    String str2 = basdVarF.b;
                    ejyb.e(str2);
                    chvaVar.copyOnWrite();
                    ((chvb) chvaVar.instance).e = str2;
                }
                if (strD != null) {
                    chvaVar.copyOnWrite();
                    chvb chvbVar2 = (chvb) chvaVar.instance;
                    chvbVar2.b |= 2;
                    chvbVar2.g = strD;
                }
                return chxx.h((chut) chxx.a(optionalAe, chvaVar).build());
            }
            String strB2 = ejwk.b(messageCoreData.aw());
            String strY2 = (!ardh.a() || bojhVar.H().equals(bvdp.NAME_IS_MANUAL)) ? bojhVar.Y() : null;
            ejxr ejxrVar = chxx.a;
            if (!chum.a(strB2)) {
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "BugleRcs");
                ekrd ekrdVar = (ekrd) ekrwVarE;
                ekrdVar.X(cqnc.s, bojhVar.C());
                ekrdVar.X(cqnc.b, messageCoreData.C());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/TransactionIdFactory", "createTransactionIdStringForMmsMessageInUpgradedGroup", 156, "TransactionIdFactory.java")).q("Trying to add RcsGroup info to non-serialized transactionId");
                strB2 = chxx.e(strB2, ejwk.b(strY2), messageCoreData.ae());
            }
            chxw chxwVarC = chxx.c(strB2);
            if (chxwVarC != null) {
                Optional optional = ((chul) chxwVarC).e;
                if (!optional.isEmpty()) {
                    Object obj = optional.get();
                    bojhVar.af();
                    String strB3 = ejwk.b(bojhVar.ae());
                    Optional optionalAe2 = messageCoreData.ae();
                    chuy chuyVarB2 = chxx.b(strB3, strY2, str);
                    chuu chuuVar = (chuu) ((evsn) obj).toBuilder();
                    chuuVar.copyOnWrite();
                    chuv chuvVar = (chuv) chuuVar.instance;
                    chuz chuzVar2 = (chuz) chuyVarB2.build();
                    chuzVar2.getClass();
                    chuvVar.e = chuzVar2;
                    chuvVar.b |= 1;
                    chus chusVar = (chus) chut.a.createBuilder();
                    chusVar.copyOnWrite();
                    chut chutVar = (chut) chusVar.instance;
                    chuv chuvVar2 = (chuv) chuuVar.build();
                    chuvVar2.getClass();
                    chutVar.d = chuvVar2;
                    chutVar.c = 3;
                    if (optionalAe2.isPresent()) {
                        evqs evqsVarA = cnru.a((UUID) optionalAe2.get());
                        chusVar.copyOnWrite();
                        chut chutVar2 = (chut) chusVar.instance;
                        chutVar2.b |= 1;
                        chutVar2.e = evqsVarA;
                    }
                    return chxx.h((chut) chusVar.build());
                }
            }
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleRcs");
            ekrd ekrdVar2 = (ekrd) ekrwVarJ;
            ekrdVar2.X(cqnc.s, bojhVar.C());
            ekrdVar2.X(cqnc.b, messageCoreData.C());
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/rcs/TransactionIdFactory", "createTransactionIdStringForMmsMessageInUpgradedGroup", 167, "TransactionIdFactory.java")).q("Cannot add RcsGroup info to non-serialized transactionId");
            return messageCoreData.aw();
        }
        if (bojhVar.an()) {
            ekgb ekgbVarZ = baga.d(bojhVar.C()).z();
            ejyb.a(!ekgbVarZ.isEmpty());
            ejyb.a(ekgbVarZ.size() < 2);
            ejyb.a(((ParticipantsTable.BindData) ekgbVarZ.get(0)).p() == 1);
            cmtu cmtuVarA = cmpf.a((ParticipantsTable.BindData) ekgbVarZ.get(0));
            basd basdVarF2 = messageCoreData.F();
            String strD2 = d(messageCoreData);
            Optional optionalAe3 = messageCoreData.ae();
            String str3 = cmtuVarA.a;
            String str4 = cmtuVarA.b;
            String str5 = cmtuVarA.c;
            ejxr ejxrVar2 = chxx.a;
            chuw chuwVar = (chuw) chux.a.createBuilder();
            chuwVar.copyOnWrite();
            chux chuxVar = (chux) chuwVar.instance;
            str5.getClass();
            chuxVar.d = str5;
            if (str3 != null) {
                chuwVar.copyOnWrite();
                ((chux) chuwVar.instance).b = str3;
            }
            if (str4 != null) {
                chuwVar.copyOnWrite();
                ((chux) chuwVar.instance).c = str4;
            }
            chux chuxVar2 = (chux) chuwVar.build();
            chva chvaVar2 = (chva) chvb.a.createBuilder();
            chvaVar2.copyOnWrite();
            chvb chvbVar3 = (chvb) chvaVar2.instance;
            chuxVar2.getClass();
            chvbVar3.d = chuxVar2;
            chvbVar3.c = 3;
            if (basdVarF2.k()) {
                String str6 = basdVarF2.b;
                ejyb.e(str6);
                chvaVar2.copyOnWrite();
                ((chvb) chvaVar2.instance).e = str6;
            }
            if (strD2 != null && !apti.a()) {
                chvaVar2.copyOnWrite();
                chvb chvbVar4 = (chvb) chvaVar2.instance;
                chvbVar4.b |= 2;
                chvbVar4.g = strD2;
            }
            return chxx.h((chut) chxx.a(optionalAe3, chvaVar2).build());
        }
        if (bojhVar.k() == 1) {
            return chxx.e(messageCoreData.aw(), ejwk.b(bojhVar.Y()), messageCoreData.ae());
        }
        if (bojhVar.k() == 0 && messageCoreData.cO()) {
            return chxx.e(messageCoreData.aw(), "", messageCoreData.ae());
        }
        aubq aubqVar = messageCoreData.ah().isPresent() ? (aubq) messageCoreData.ah().get().e().orElse(null) : null;
        basd basdVarF3 = messageCoreData.F();
        eyga eygaVarAc = messageCoreData.ac();
        String strD3 = d(messageCoreData);
        Optional optionalAe4 = messageCoreData.ae();
        ejxr ejxrVar3 = chxx.a;
        if (basdVarF3.i()) {
            return "";
        }
        String str7 = basdVarF3.b;
        ejyb.e(str7);
        chva chvaVar3 = (chva) chvb.a.createBuilder();
        chvaVar3.copyOnWrite();
        ((chvb) chvaVar3.instance).e = str7;
        if (strD3 != null && !apti.a()) {
            chvaVar3.copyOnWrite();
            chvb chvbVar5 = (chvb) chvaVar3.instance;
            chvbVar5.b = 2 | chvbVar5.b;
            chvbVar5.g = strD3;
        }
        if (((Boolean) ((cczi) crbf.aw.get()).e()).booleanValue() && aubqVar != null && eygaVarAc != null && fdbq.f(aubqVar.d, "+18339913448")) {
            civa civaVar = civa.RCS_PENPAL_NAMESPACE;
            Optional optionalA = civb.a(eygaVarAc, civaVar, "jakgvfknopmmo");
            final fdap fdapVar = new fdap() { // from class: cgsf
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(fdbq.f((String) obj2, "true"));
                }
            };
            if (fdbq.f((Boolean) optionalA.map(new Function() { // from class: cgsg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return fdapVar.invoke(obj2);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(false), true)) {
                String str8 = (String) fdct.b(civb.a(eygaVarAc, civaVar, "zxmckmnbniuoip"));
                if (str8 != null && str8.length() != 0) {
                    cgsrVar = new cgsr(str8);
                }
                if (cgsrVar != null) {
                    Optional optionalA2 = civb.a(eygaVarAc, civaVar, "PENPAL-COUNTERPARTY-NUMBER");
                    if (optionalA2.isPresent()) {
                        chun chunVar = (chun) chuo.a.createBuilder();
                        Object obj2 = optionalA2.get();
                        chunVar.copyOnWrite();
                        ((chuo) chunVar.instance).b = (String) obj2;
                        chuo chuoVar = (chuo) chunVar.build();
                        chvaVar3.copyOnWrite();
                        chvb chvbVar6 = (chvb) chvaVar3.instance;
                        chuoVar.getClass();
                        chvbVar6.f = chuoVar;
                        chvbVar6.b |= 1;
                    }
                }
            }
        }
        return chxx.h((chut) chxx.a(optionalAe4, chvaVar3).build());
    }

    public static String b(MessageCoreData messageCoreData, bojh bojhVar) {
        String strAw = messageCoreData.aw();
        chxw chxwVarC = chxx.c(strAw);
        return (chxwVarC != null && ((chul) chxwVarC).f.isPresent()) ? strAw : a(messageCoreData, bojhVar.ad(), bojhVar);
    }

    public static byte[] c(MessageCoreData messageCoreData, String str, bojh bojhVar) {
        return a(messageCoreData, str, bojhVar).getBytes(StandardCharsets.US_ASCII);
    }

    private static String d(MessageCoreData messageCoreData) {
        return cdyv.a(messageCoreData.ac());
    }
}
