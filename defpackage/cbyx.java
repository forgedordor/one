package defpackage;

import com.sun.jna.Memory;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbyx implements cbvk {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync");
    public final eqca a;
    private final fcsu c;

    public cbyx(fcsu fcsuVar, eqca eqcaVar) {
        fcsuVar.getClass();
        eqcaVar.getClass();
        this.c = fcsuVar;
        this.a = eqcaVar;
    }

    static /* synthetic */ Object j(cbyx cbyxVar, enba enbaVar, enbs enbsVar, fdae fdaeVar) {
        return cbyxVar.q(enbaVar, enbsVar, "", fdaeVar);
    }

    private final Object q(enba enbaVar, enbs enbsVar, String str, fdae fdaeVar) throws eqbs {
        enbq enbqVarA;
        Object objA;
        ccrp ccrpVar;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objA5;
        Object objA6;
        Object objA7;
        if (!eotp.a("bugle.run_mls_tests_from_synclet", "bugle")) {
            return fdaeVar.invoke();
        }
        try {
            return fdaeVar.invoke();
        } catch (eqbs e) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "BugleE2eeMls");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "handleExceptions", 633, "ZinniaMlsClientSync.kt")).I("MLS operation %s failed for Zinnia operation %s and RCS message ID %s", enbaVar, enbsVar, str);
            ccrj ccrjVar = (ccrj) this.c.b();
            enbaVar.getClass();
            enbsVar.getClass();
            try {
                epzp epzpVarZinnia_ZinniaErrorWithSource_get_zinnia_error_context = eqbs.a.Zinnia_ZinniaErrorWithSource_get_zinnia_error_context(e.b);
                if (epzpVarZinnia_ZinniaErrorWithSource_get_zinnia_error_context.isOk == 1) {
                    eqam eqamVar = new eqam(epzpVarZinnia_ZinniaErrorWithSource_get_zinnia_error_context.union.ok);
                    eqamVar.a();
                    objA = eqamVar;
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_ZinniaErrorWithSource_get_zinnia_error_context.union.err);
                    eqbsVar.b();
                    objA = fctl.a(eqbsVar);
                }
                boolean z = objA instanceof fctj;
                Object obj = objA;
                if (true == z) {
                    obj = null;
                }
                eqam eqamVar2 = (eqam) obj;
                if (eqamVar2 == null) {
                    ccrpVar = new ccrp("UNKNOWN_ERROR", "", e.toString());
                } else {
                    byte[] bArrB = eqamVar2.b();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
                    bArrCopyOf.getClass();
                    epvb epvbVar = (epvb) evsn.parseFrom(epvb.a, bArrCopyOf);
                    epvbVar.getClass();
                    String str2 = epvbVar.b;
                    str2.getClass();
                    String strA = ccrq.a(str2);
                    String str3 = epvbVar.c;
                    str3.getClass();
                    ccrpVar = new ccrp(strA, ccrq.a(str3), e.toString());
                }
                String str4 = ccrpVar.a;
                String str5 = ccrpVar.b;
                String str6 = ccrpVar.c;
                try {
                    objA2 = (enbn) Enum.valueOf(enbn.class, str4);
                } catch (Throwable th) {
                    objA2 = fctl.a(th);
                }
                enbn enbnVar = enbn.UNKNOWN_ERROR;
                if (true == (objA2 instanceof fctj)) {
                    objA2 = enbnVar;
                }
                enbn enbnVar2 = (enbn) objA2;
                int iOrdinal = enbnVar2.ordinal();
                if (iOrdinal == 1) {
                    enbd enbdVar = (enbd) enbq.a.createBuilder();
                    enbdVar.getClass();
                    emzx.c(enbnVar2, enbdVar);
                    try {
                        objA3 = (enbh) Enum.valueOf(enbh.class, str5);
                    } catch (Throwable th2) {
                        objA3 = fctl.a(th2);
                    }
                    Object obj2 = enbh.MLS_ERROR_UNKNOWN;
                    if (true == (objA3 instanceof fctj)) {
                        objA3 = obj2;
                    }
                    enbh enbhVar = (enbh) objA3;
                    enbhVar.getClass();
                    enbdVar.copyOnWrite();
                    enbq enbqVar = (enbq) enbdVar.instance;
                    enbqVar.d = Integer.valueOf(enbhVar.bf);
                    enbqVar.c = 3;
                    emzx.b(str6, enbdVar);
                    enbqVarA = emzx.a(enbdVar);
                } else if (iOrdinal == 3) {
                    enbd enbdVar2 = (enbd) enbq.a.createBuilder();
                    enbdVar2.getClass();
                    emzx.c(enbnVar2, enbdVar2);
                    try {
                        objA4 = (enbj) Enum.valueOf(enbj.class, str5);
                    } catch (Throwable th3) {
                        objA4 = fctl.a(th3);
                    }
                    Object obj3 = enbj.MLS_EXTENSION_ERROR_UNKNOWN;
                    if (true == (objA4 instanceof fctj)) {
                        objA4 = obj3;
                    }
                    enbj enbjVar = (enbj) objA4;
                    enbjVar.getClass();
                    enbdVar2.copyOnWrite();
                    enbq enbqVar2 = (enbq) enbdVar2.instance;
                    enbqVar2.d = Integer.valueOf(enbjVar.e);
                    enbqVar2.c = 6;
                    emzx.b(str6, enbdVar2);
                    enbqVarA = emzx.a(enbdVar2);
                } else if (iOrdinal == 11) {
                    enbd enbdVar3 = (enbd) enbq.a.createBuilder();
                    enbdVar3.getClass();
                    emzx.c(enbnVar2, enbdVar3);
                    try {
                        objA5 = (enbp) Enum.valueOf(enbp.class, str5);
                    } catch (Throwable th4) {
                        objA5 = fctl.a(th4);
                    }
                    Object obj4 = enbp.ZINNIA_FILE_ENCRYPTION_ERROR_UNKNOWN;
                    if (true == (objA5 instanceof fctj)) {
                        objA5 = obj4;
                    }
                    enbp enbpVar = (enbp) objA5;
                    enbpVar.getClass();
                    enbdVar3.copyOnWrite();
                    enbq enbqVar3 = (enbq) enbdVar3.instance;
                    enbqVar3.d = Integer.valueOf(enbpVar.x);
                    enbqVar3.c = 7;
                    emzx.b(str6, enbdVar3);
                    enbqVarA = emzx.a(enbdVar3);
                } else if (iOrdinal == 7) {
                    enbd enbdVar4 = (enbd) enbq.a.createBuilder();
                    enbdVar4.getClass();
                    emzx.c(enbnVar2, enbdVar4);
                    try {
                        objA6 = (enbl) Enum.valueOf(enbl.class, str5);
                    } catch (Throwable th5) {
                        objA6 = fctl.a(th5);
                    }
                    Object obj5 = enbl.ZINNIA_ERROR_UNKNOWN;
                    if (true == (objA6 instanceof fctj)) {
                        objA6 = obj5;
                    }
                    enbl enblVar = (enbl) objA6;
                    enblVar.getClass();
                    enbdVar4.copyOnWrite();
                    enbq enbqVar4 = (enbq) enbdVar4.instance;
                    enbqVar4.d = Integer.valueOf(enblVar.aG);
                    enbqVar4.c = 4;
                    emzx.b(str6, enbdVar4);
                    enbqVarA = emzx.a(enbdVar4);
                } else if (iOrdinal == 8) {
                    enbd enbdVar5 = (enbd) enbq.a.createBuilder();
                    enbdVar5.getClass();
                    emzx.c(enbnVar2, enbdVar5);
                    try {
                        objA7 = (enbf) Enum.valueOf(enbf.class, str5);
                    } catch (Throwable th6) {
                        objA7 = fctl.a(th6);
                    }
                    Object obj6 = enbf.MLS_CODEC_ERROR_UNKNOWN;
                    if (true == (objA7 instanceof fctj)) {
                        objA7 = obj6;
                    }
                    enbf enbfVar = (enbf) objA7;
                    enbfVar.getClass();
                    enbdVar5.copyOnWrite();
                    enbq enbqVar5 = (enbq) enbdVar5.instance;
                    enbqVar5.d = Integer.valueOf(enbfVar.j);
                    enbqVar5.c = 5;
                    emzx.b(str6, enbdVar5);
                    enbqVarA = emzx.a(enbdVar5);
                } else {
                    enbd enbdVar6 = (enbd) enbq.a.createBuilder();
                    enbdVar6.getClass();
                    emzx.c(enbnVar, enbdVar6);
                    emzx.b(str6, enbdVar6);
                    enbqVarA = emzx.a(enbdVar6);
                }
            } catch (Exception e2) {
                enbd enbdVar7 = (enbd) enbq.a.createBuilder();
                enbdVar7.getClass();
                emzx.c(enbn.UNKNOWN_ERROR, enbdVar7);
                String message = e2.getMessage();
                emzx.b(message != null ? message : "", enbdVar7);
                enbqVarA = emzx.a(enbdVar7);
                emzy emzyVar = (emzy) enbu.a.createBuilder();
                emzyVar.copyOnWrite();
                enbu enbuVar = (enbu) emzyVar.instance;
                enbuVar.b |= 1;
                enbuVar.e = str;
                emzyVar.copyOnWrite();
                enbu enbuVar2 = (enbu) emzyVar.instance;
                enbuVar2.i = enbaVar.p;
                enbuVar2.b |= 16;
                enbc enbcVar = (enbc) enbt.a.createBuilder();
                enbcVar.copyOnWrite();
                enbt enbtVar = (enbt) enbcVar.instance;
                enbtVar.c = enbsVar.x;
                enbtVar.b |= 1;
                enbcVar.copyOnWrite();
                enbt enbtVar2 = (enbt) enbcVar.instance;
                enbtVar2.d = enbqVarA;
                enbtVar2.b |= 2;
                emzyVar.copyOnWrite();
                enbu enbuVar3 = (enbu) emzyVar.instance;
                enbt enbtVar3 = (enbt) enbcVar.build();
                enbtVar3.getClass();
                enbuVar3.d = enbtVar3;
                enbuVar3.c = 2;
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_MLS_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                enbu enbuVar4 = (enbu) emzyVar.build();
                enbuVar4.getClass();
                ellhVar2.cx = enbuVar4;
                ellhVar2.i |= 8;
                cbqh.b((cbqh) ccrjVar.a.b(), emxt.BUGLE_MLS_EVENT, ellgVar);
                throw e;
            }
            emzy emzyVar2 = (emzy) enbu.a.createBuilder();
            emzyVar2.copyOnWrite();
            enbu enbuVar5 = (enbu) emzyVar2.instance;
            enbuVar5.b |= 1;
            enbuVar5.e = str;
            emzyVar2.copyOnWrite();
            enbu enbuVar22 = (enbu) emzyVar2.instance;
            enbuVar22.i = enbaVar.p;
            enbuVar22.b |= 16;
            enbc enbcVar2 = (enbc) enbt.a.createBuilder();
            enbcVar2.copyOnWrite();
            enbt enbtVar4 = (enbt) enbcVar2.instance;
            enbtVar4.c = enbsVar.x;
            enbtVar4.b |= 1;
            enbcVar2.copyOnWrite();
            enbt enbtVar22 = (enbt) enbcVar2.instance;
            enbtVar22.d = enbqVarA;
            enbtVar22.b |= 2;
            emzyVar2.copyOnWrite();
            enbu enbuVar32 = (enbu) emzyVar2.instance;
            enbt enbtVar32 = (enbt) enbcVar2.build();
            enbtVar32.getClass();
            enbuVar32.d = enbtVar32;
            enbuVar32.c = 2;
            ellg ellgVar2 = (ellg) ellh.a.createBuilder();
            ellf ellfVar2 = ellf.BUGLE_MLS_EVENT;
            ellgVar2.copyOnWrite();
            ellh ellhVar3 = (ellh) ellgVar2.instance;
            ellhVar3.j = ellfVar2.f11do;
            ellhVar3.b |= 1;
            ellgVar2.copyOnWrite();
            ellh ellhVar22 = (ellh) ellgVar2.instance;
            enbu enbuVar42 = (enbu) emzyVar2.build();
            enbuVar42.getClass();
            ellhVar22.cx = enbuVar42;
            ellhVar22.i |= 8;
            cbqh.b((cbqh) ccrjVar.a.b(), emxt.BUGLE_MLS_EVENT, ellgVar2);
            throw e;
        }
    }

    @Override // defpackage.cbvk
    public final ccfx a(enba enbaVar, final int i) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "generateKeyPackagesSync", 68, "ZinniaMlsClientSync.kt")).u("generateKeyPackagesSync(mlsOperation=%d, count=%d)", enbaVar.p, i);
        epsv epsvVar = (epsv) j(this, enbaVar, enbs.GENERATE_KEY_PACKAGES, new fdae() { // from class: cbyk
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                Object objA;
                epzp epzpVarZinnia_FfiClient_generate_key_packages = epzc.a.Zinnia_FfiClient_generate_key_packages(this.a.a.b.b, new epza(i, null));
                if (epzpVarZinnia_FfiClient_generate_key_packages.isOk == 1) {
                    eqam eqamVar = new eqam(epzpVarZinnia_FfiClient_generate_key_packages.union.ok);
                    eqamVar.a();
                    objA = eqamVar;
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_generate_key_packages.union.err);
                    eqbsVar.b();
                    objA = fctl.a(eqbsVar);
                }
                fctl.b(objA);
                byte[] bArrB = ((eqam) objA).b();
                byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf.getClass();
                epsv epsvVar2 = (epsv) evsn.parseFrom(epsv.a, bArrCopyOf);
                epsvVar2.getClass();
                return epsvVar2;
            }
        });
        evtg<evqs> evtgVar = epsvVar.b;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
        for (evqs evqsVar : evtgVar) {
            evqsVar.getClass();
            arrayList.add(new ccfw(evqsVar));
        }
        evqs evqsVar2 = epsvVar.c;
        evqsVar2.getClass();
        return new ccfx(arrayList, new ccfw(evqsVar2));
    }

    @Override // defpackage.cbvk
    public final eprb b(final ccep ccepVar, final List list, enba enbaVar) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.g, ccepVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "createGroupAndAddMembersSync", 87, "ZinniaMlsClientSync.kt")).u("createGroupAndAddMembersSync(mlsOperation=%d, keyPackageCount=%d)", enbaVar.p, list.size());
        return (eprb) j(this, enbaVar, enbs.CREATE_GROUP_AND_ADD_MEMBERS, new fdae() { // from class: cbyw
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                Object objA;
                epth epthVar = (epth) epti.a.createBuilder();
                epthVar.getClass();
                DesugarCollections.unmodifiableList(((epti) epthVar.instance).b).getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ccfw) it.next()).a);
                }
                ccep ccepVar2 = ccepVar;
                cbyx cbyxVar = this.a;
                eptj.b(arrayList, epthVar);
                epti eptiVarA = eptj.a(epthVar);
                epro eproVar = (epro) eprp.a.createBuilder();
                eproVar.getClass();
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.c(evqs.A(ccepVar2.a), epuuVar);
                epuv epuvVarA = epuw.a(epuuVar);
                eproVar.copyOnWrite();
                eprp eprpVar = (eprp) eproVar.instance;
                eprpVar.c = epuvVarA;
                eprpVar.b |= 1;
                eproVar.copyOnWrite();
                eprp eprpVar2 = (eprp) eproVar.instance;
                eprpVar2.d = eptiVarA;
                eprpVar2.b |= 2;
                evsn evsnVarBuild = eproVar.build();
                evsnVarBuild.getClass();
                byte[] byteArray = ((eprp) evsnVarBuild).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Object obj = fctiVarC.a;
                Memory memory = (Memory) obj;
                epzp epzpVarZinnia_FfiClient_create_group_with_members = epzc.a.Zinnia_FfiClient_create_group_with_members(cbyxVar.a.b.b, (eqau) fctiVarC.b);
                if (epzpVarZinnia_FfiClient_create_group_with_members.isOk == 1) {
                    eqam eqamVar = new eqam(epzpVarZinnia_FfiClient_create_group_with_members.union.ok);
                    eqamVar.a();
                    objA = eqamVar;
                    if (memory != null) {
                        memory.close();
                        objA = eqamVar;
                    }
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_create_group_with_members.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    objA = fctl.a(eqbsVar);
                }
                fctl.b(objA);
                byte[] bArrB = ((eqam) objA).b();
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf2.getClass();
                eprb eprbVar = (eprb) evsn.parseFrom(eprb.a, bArrCopyOf2);
                eprbVar.getClass();
                return eprbVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epun c(final cbwd cbwdVar, final cchc cchcVar, final epsb epsbVar, final int i, enba enbaVar) {
        String str;
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = cqnc.e;
        aufh aufhVar = cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b;
        if (aufhVar == null || (str = aufhVar.j) == null) {
            str = "<unknown>";
        }
        ekrdVar.X(ekrzVar, str);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "processDisplayReceiptSync", 397, "ZinniaMlsClientSync.kt")).u("processDisplayReceiptSync(mlsOperation=%d, eraId=%d)", enbaVar.p, i);
        enbs enbsVar = enbs.PROCESS_DISPLAY_RECEIPT;
        String str2 = (cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b).j;
        str2.getClass();
        return (epun) q(enbaVar, enbsVar, str2, new fdae() { // from class: cbym
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v17, types: [eqam] */
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                ?? A;
                evqs byteString = cbwdVar.toByteString();
                epuj epujVar = (epuj) epuk.a.createBuilder();
                epujVar.getClass();
                epul.d(cchcVar.a, epujVar);
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.e(byteString, epuuVar);
                epul.b(epuw.a(epuuVar), epujVar);
                epul.c(i, epujVar);
                byte[] byteArray = epul.a(epujVar).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                byte[] byteArray2 = epsbVar.toByteArray();
                byte[] bArrCopyOf2 = Arrays.copyOf(byteArray2, byteArray2.length);
                bArrCopyOf2.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Memory memory = (Memory) fctiVarC.a;
                eqau eqauVar = (eqau) fctiVarC.b;
                fcti fctiVarC2 = epzk.c(bArrCopyOf2);
                Memory memory2 = (Memory) fctiVarC2.a;
                epzp epzpVarZinnia_FfiClient_process_and_validate_display_receipt = epzc.a.Zinnia_FfiClient_process_and_validate_display_receipt(this.a.a.b.b, eqauVar, (eqau) fctiVarC2.b);
                if (epzpVarZinnia_FfiClient_process_and_validate_display_receipt.isOk == 1) {
                    A = new eqam(epzpVarZinnia_FfiClient_process_and_validate_display_receipt.union.ok);
                    A.a();
                    if (memory != null) {
                        memory.close();
                    }
                    if (memory2 != null) {
                        memory2.close();
                    }
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_process_and_validate_display_receipt.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    if (memory2 != null) {
                        memory2.close();
                    }
                    A = fctl.a(eqbsVar);
                }
                fctl.b(A);
                byte[] bArrB = ((eqam) A).b();
                byte[] bArrCopyOf3 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf3.getClass();
                epun epunVar = (epun) evsn.parseFrom(epun.a, bArrCopyOf3);
                epunVar.getClass();
                return epunVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epun d(final cbwd cbwdVar, final cchc cchcVar, final eprw eprwVar, final ccep ccepVar, final int i, enba enbaVar) {
        String str;
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = cqnc.e;
        aufh aufhVar = cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b;
        if (aufhVar == null || (str = aufhVar.j) == null) {
            str = "<unknown>";
        }
        ekrdVar.X(ekrzVar, str);
        ekrdVar.X(cqnc.g, ccepVar == null ? new ccep("<unknown>") : ccepVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "processNegativeDeliveryReceiptSync", 347, "ZinniaMlsClientSync.kt")).u("processNegativeDeliveryReceiptSync(mlsOperation=%d, eraId=%d)", enbaVar.p, i);
        enbs enbsVar = enbs.PROCESS_NEGATIVE_DELIVERY_RECEIPT;
        String str2 = (cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b).j;
        str2.getClass();
        return (epun) q(enbaVar, enbsVar, str2, new fdae() { // from class: cbyo
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v16, types: [eqam] */
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                ?? A;
                evqs byteString = cbwdVar.toByteString();
                cchc cchcVar2 = cchcVar;
                evqs evqsVar = cchcVar2 != null ? cchcVar2.a : null;
                ccep ccepVar2 = ccepVar;
                String str3 = ccepVar2 != null ? ccepVar2.a : null;
                epuj epujVar = (epuj) epuk.a.createBuilder();
                epujVar.getClass();
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                if (str3 != null) {
                    epuw.c(evqs.A(str3), epuuVar);
                }
                int i2 = i;
                eprw eprwVar2 = eprwVar;
                epuw.e(byteString, epuuVar);
                epuw.d(eprwVar2.g.E(), epuuVar);
                epul.b(epuw.a(epuuVar), epujVar);
                epul.c(i2, epujVar);
                if (evqsVar != null) {
                    epul.d(evqsVar, epujVar);
                }
                cbyx cbyxVar = this.a;
                byte[] byteArray = epul.a(epujVar).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                byte[] byteArray2 = eprwVar2.toByteArray();
                byte[] bArrCopyOf2 = Arrays.copyOf(byteArray2, byteArray2.length);
                bArrCopyOf2.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Memory memory = (Memory) fctiVarC.a;
                eqau eqauVar = (eqau) fctiVarC.b;
                fcti fctiVarC2 = epzk.c(bArrCopyOf2);
                Memory memory2 = (Memory) fctiVarC2.a;
                epzp epzpVarZinnia_FfiClient_process_and_validate_negative_delivery_receipt = epzc.a.Zinnia_FfiClient_process_and_validate_negative_delivery_receipt(cbyxVar.a.b.b, eqauVar, (eqau) fctiVarC2.b);
                if (epzpVarZinnia_FfiClient_process_and_validate_negative_delivery_receipt.isOk == 1) {
                    A = new eqam(epzpVarZinnia_FfiClient_process_and_validate_negative_delivery_receipt.union.ok);
                    A.a();
                    if (memory != null) {
                        memory.close();
                    }
                    if (memory2 != null) {
                        memory2.close();
                    }
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_process_and_validate_negative_delivery_receipt.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    if (memory2 != null) {
                        memory2.close();
                    }
                    A = fctl.a(eqbsVar);
                }
                fctl.b(A);
                byte[] bArrB = ((eqam) A).b();
                byte[] bArrCopyOf3 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf3.getClass();
                epun epunVar = (epun) evsn.parseFrom(epun.a, bArrCopyOf3);
                epunVar.getClass();
                return epunVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epun e(final cbwd cbwdVar, final cchc cchcVar, final eprw eprwVar, final int i, enba enbaVar) {
        String str;
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = cqnc.e;
        aufh aufhVar = cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b;
        if (aufhVar == null || (str = aufhVar.j) == null) {
            str = "<unknown>";
        }
        ekrdVar.X(ekrzVar, str);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "processPositiveDeliveryReceiptSync", 313, "ZinniaMlsClientSync.kt")).u("processPositiveDeliveryReceiptSync(mlsOperation=%d, eraId=%d)", enbaVar.p, i);
        enbs enbsVar = enbs.PROCESS_POSITIVE_DELIVERY_RECEIPT;
        String str2 = (cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b).j;
        str2.getClass();
        return (epun) q(enbaVar, enbsVar, str2, new fdae() { // from class: cbyv
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v17, types: [eqam] */
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                ?? A;
                evqs byteString = cbwdVar.toByteString();
                epuj epujVar = (epuj) epuk.a.createBuilder();
                epujVar.getClass();
                epul.d(cchcVar.a, epujVar);
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.e(byteString, epuuVar);
                epul.b(epuw.a(epuuVar), epujVar);
                epul.c(i, epujVar);
                byte[] byteArray = epul.a(epujVar).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                byte[] byteArray2 = eprwVar.toByteArray();
                byte[] bArrCopyOf2 = Arrays.copyOf(byteArray2, byteArray2.length);
                bArrCopyOf2.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Memory memory = (Memory) fctiVarC.a;
                eqau eqauVar = (eqau) fctiVarC.b;
                fcti fctiVarC2 = epzk.c(bArrCopyOf2);
                Memory memory2 = (Memory) fctiVarC2.a;
                epzp epzpVarZinnia_FfiClient_process_and_validate_positive_delivery_receipt = epzc.a.Zinnia_FfiClient_process_and_validate_positive_delivery_receipt(this.a.a.b.b, eqauVar, (eqau) fctiVarC2.b);
                if (epzpVarZinnia_FfiClient_process_and_validate_positive_delivery_receipt.isOk == 1) {
                    A = new eqam(epzpVarZinnia_FfiClient_process_and_validate_positive_delivery_receipt.union.ok);
                    A.a();
                    if (memory != null) {
                        memory.close();
                    }
                    if (memory2 != null) {
                        memory2.close();
                    }
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_process_and_validate_positive_delivery_receipt.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    if (memory2 != null) {
                        memory2.close();
                    }
                    A = fctl.a(eqbsVar);
                }
                fctl.b(A);
                byte[] bArrB = ((eqam) A).b();
                byte[] bArrCopyOf3 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf3.getClass();
                epun epunVar = (epun) evsn.parseFrom(epun.a, bArrCopyOf3);
                epunVar.getClass();
                return epunVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq f(final cbwd cbwdVar, final ccep ccepVar, final basd basdVar, final ccct ccctVar, enba enbaVar) {
        if (!basdVar.k()) {
            throw new IllegalArgumentException("MessageId is empty.");
        }
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.f, basdVar);
        ekrdVar.X(cqnc.g, ccepVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "encryptSync", 114, "ZinniaMlsClientSync.kt")).r("encryptSyncCpim(mlsOperation=%d)", enbaVar.p);
        return (epuq) q(enbaVar, enbs.ENCRYPT_BYTES, basdVar.f(), new fdae() { // from class: cbyi
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                Object objA;
                evqs byteString = cbwdVar.toByteString();
                String str = basdVar.b;
                str.getClass();
                epsd epsdVar = (epsd) epse.a.createBuilder();
                epsdVar.getClass();
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.e(byteString, epuuVar);
                epuw.c(evqs.A(ccepVar.a), epuuVar);
                epuw.d(str, epuuVar);
                epuv epuvVarA = epuw.a(epuuVar);
                epsdVar.copyOnWrite();
                epse epseVar = (epse) epsdVar.instance;
                epseVar.c = epuvVarA;
                epseVar.b |= 1;
                epsdVar.copyOnWrite();
                epse epseVar2 = (epse) epsdVar.instance;
                epseVar2.b |= 2;
                epseVar2.d = ccctVar.a;
                epsdVar.copyOnWrite();
                epse epseVar3 = (epse) epsdVar.instance;
                epseVar3.e = 1;
                epseVar3.b |= 4;
                epsdVar.copyOnWrite();
                epse epseVar4 = (epse) epsdVar.instance;
                epseVar4.f = 1;
                epseVar4.b |= 8;
                evsn evsnVarBuild = epsdVar.build();
                evsnVarBuild.getClass();
                byte[] byteArray = ((epse) evsnVarBuild).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Object obj = fctiVarC.a;
                Memory memory = (Memory) obj;
                epzp epzpVarZinnia_FfiClient_encrypt_message = epzc.a.Zinnia_FfiClient_encrypt_message(this.a.a.b.b, (eqau) fctiVarC.b);
                if (epzpVarZinnia_FfiClient_encrypt_message.isOk == 1) {
                    eqam eqamVar = new eqam(epzpVarZinnia_FfiClient_encrypt_message.union.ok);
                    eqamVar.a();
                    objA = eqamVar;
                    if (memory != null) {
                        memory.close();
                        objA = eqamVar;
                    }
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_encrypt_message.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    objA = fctl.a(eqbsVar);
                }
                fctl.b(objA);
                epuq epuqVar = (epuq) evsn.parseFrom(epuq.a, ((eqam) objA).b());
                epuqVar.getClass();
                return epuqVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq g(final ccep ccepVar, final eprw eprwVar, enba enbaVar) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.g, ccepVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "generateDeliveryReceiptSignatureSync", 294, "ZinniaMlsClientSync.kt")).r("generateDeliveryReceiptSignatureSync(mlsOperation=%d)", enbaVar.p);
        return (epuq) j(this, enbaVar, enbs.GENERATE_DELIVERY_RECEIPT_SIGNATURE, new fdae() { // from class: cbyt
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                Object objA;
                epsq epsqVar = (epsq) epsr.a.createBuilder();
                epsqVar.getClass();
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.c(evqs.A(ccepVar.a), epuuVar);
                epuv epuvVarA = epuw.a(epuuVar);
                epsqVar.copyOnWrite();
                epsr epsrVar = (epsr) epsqVar.instance;
                epsrVar.c = epuvVarA;
                epsrVar.b |= 1;
                epsqVar.copyOnWrite();
                epsr epsrVar2 = (epsr) epsqVar.instance;
                epsrVar2.d = eprwVar;
                epsrVar2.b |= 2;
                evsn evsnVarBuild = epsqVar.build();
                evsnVarBuild.getClass();
                byte[] byteArray = ((epsr) evsnVarBuild).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Object obj = fctiVarC.a;
                Memory memory = (Memory) obj;
                epzp epzpVarZinnia_FfiClient_generate_delivery_receipt_mls_message = epzc.a.Zinnia_FfiClient_generate_delivery_receipt_mls_message(this.a.a.b.b, (eqau) fctiVarC.b);
                if (epzpVarZinnia_FfiClient_generate_delivery_receipt_mls_message.isOk == 1) {
                    eqam eqamVar = new eqam(epzpVarZinnia_FfiClient_generate_delivery_receipt_mls_message.union.ok);
                    eqamVar.a();
                    objA = eqamVar;
                    if (memory != null) {
                        memory.close();
                        objA = eqamVar;
                    }
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_generate_delivery_receipt_mls_message.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    objA = fctl.a(eqbsVar);
                }
                fctl.b(objA);
                byte[] bArrB = ((eqam) objA).b();
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf2.getClass();
                epuq epuqVar = (epuq) evsn.parseFrom(epuq.a, bArrCopyOf2);
                epuqVar.getClass();
                return epuqVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq h(final ccep ccepVar, final epsb epsbVar, enba enbaVar) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.g, ccepVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "generateDisplayReceiptSignatureSync", 378, "ZinniaMlsClientSync.kt")).r("generateDisplayReceiptSignatureSync(mlsOperation=%d)", enbaVar.p);
        return (epuq) j(this, enbaVar, enbs.GENERATE_DISPLAY_RECEIPT_SIGNATURE, new fdae() { // from class: cbyu
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                Object objA;
                epss epssVar = (epss) epst.a.createBuilder();
                epssVar.getClass();
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.c(evqs.A(ccepVar.a), epuuVar);
                epuv epuvVarA = epuw.a(epuuVar);
                epssVar.copyOnWrite();
                epst epstVar = (epst) epssVar.instance;
                epstVar.c = epuvVarA;
                epstVar.b |= 1;
                epssVar.copyOnWrite();
                epst epstVar2 = (epst) epssVar.instance;
                epstVar2.d = epsbVar;
                epstVar2.b |= 2;
                evsn evsnVarBuild = epssVar.build();
                evsnVarBuild.getClass();
                byte[] byteArray = ((epst) evsnVarBuild).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Object obj = fctiVarC.a;
                Memory memory = (Memory) obj;
                epzp epzpVarZinnia_FfiClient_generate_display_receipt_mls_message = epzc.a.Zinnia_FfiClient_generate_display_receipt_mls_message(this.a.a.b.b, (eqau) fctiVarC.b);
                if (epzpVarZinnia_FfiClient_generate_display_receipt_mls_message.isOk == 1) {
                    eqam eqamVar = new eqam(epzpVarZinnia_FfiClient_generate_display_receipt_mls_message.union.ok);
                    eqamVar.a();
                    objA = eqamVar;
                    if (memory != null) {
                        memory.close();
                        objA = eqamVar;
                    }
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_generate_display_receipt_mls_message.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    objA = fctl.a(eqbsVar);
                }
                fctl.b(objA);
                byte[] bArrB = ((eqam) objA).b();
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf2.getClass();
                epuq epuqVar = (epuq) evsn.parseFrom(epuq.a, bArrCopyOf2);
                epuqVar.getClass();
                return epuqVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq i(enba enbaVar, final ccep ccepVar) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.g, ccepVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "generateEndMlsCommitSync", 464, "ZinniaMlsClientSync.kt")).r("generateEndMlsCommitSync(mlsOperation=%d)", enbaVar.p);
        return (epuq) j(this, enbaVar, enbs.APPLY_END_MLS, new fdae() { // from class: cbys
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                Object objA;
                epsf epsfVar = (epsf) epsg.a.createBuilder();
                epsfVar.getClass();
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.c(evqs.A(ccepVar.a), epuuVar);
                epuv epuvVarA = epuw.a(epuuVar);
                epsfVar.copyOnWrite();
                epsg epsgVar = (epsg) epsfVar.instance;
                epsgVar.c = epuvVarA;
                epsgVar.b |= 1;
                evsn evsnVarBuild = epsfVar.build();
                evsnVarBuild.getClass();
                byte[] byteArray = ((epsg) evsnVarBuild).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Object obj = fctiVarC.a;
                Memory memory = (Memory) obj;
                epzp epzpVarZinnia_FfiClient_generate_end_mls_commit = epzc.a.Zinnia_FfiClient_generate_end_mls_commit(this.a.a.b.b, (eqau) fctiVarC.b);
                if (epzpVarZinnia_FfiClient_generate_end_mls_commit.isOk == 1) {
                    eqam eqamVar = new eqam(epzpVarZinnia_FfiClient_generate_end_mls_commit.union.ok);
                    eqamVar.a();
                    objA = eqamVar;
                    if (memory != null) {
                        memory.close();
                        objA = eqamVar;
                    }
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_generate_end_mls_commit.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    objA = fctl.a(eqbsVar);
                }
                fctl.b(objA);
                byte[] bArrB = ((eqam) objA).b();
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf2.getClass();
                epuq epuqVar = (epuq) evsn.parseFrom(epuq.a, bArrCopyOf2);
                epuqVar.getClass();
                return epuqVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq k(final ccep ccepVar, final epti eptiVar, enba enbaVar) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.g, ccepVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "maybeRefresh", 534, "ZinniaMlsClientSync.kt")).r("maybeRefresh(mlsOperation=%d)", enbaVar.p);
        return (epuq) j(this, enbaVar, enbs.MAYBE_REFRESH, new fdae() { // from class: cbyr
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                Object objA;
                eptm eptmVar = (eptm) eptn.a.createBuilder();
                eptmVar.getClass();
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.c(evqs.A(ccepVar.a), epuuVar);
                epuv epuvVarA = epuw.a(epuuVar);
                eptmVar.copyOnWrite();
                eptn eptnVar = (eptn) eptmVar.instance;
                eptnVar.c = epuvVarA;
                eptnVar.b |= 1;
                eptmVar.copyOnWrite();
                eptn eptnVar2 = (eptn) eptmVar.instance;
                eptnVar2.d = eptiVar;
                eptnVar2.b |= 2;
                evsn evsnVarBuild = eptmVar.build();
                evsnVarBuild.getClass();
                byte[] byteArray = ((eptn) evsnVarBuild).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Object obj = fctiVarC.a;
                Memory memory = (Memory) obj;
                epzp epzpVarZinnia_FfiClient_maybe_refresh = epzc.a.Zinnia_FfiClient_maybe_refresh(this.a.a.b.b, (eqau) fctiVarC.b);
                if (epzpVarZinnia_FfiClient_maybe_refresh.isOk == 1) {
                    eqam eqamVar = new eqam(epzpVarZinnia_FfiClient_maybe_refresh.union.ok);
                    eqamVar.a();
                    objA = eqamVar;
                    if (memory != null) {
                        memory.close();
                        objA = eqamVar;
                    }
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_maybe_refresh.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    objA = fctl.a(eqbsVar);
                }
                fctl.b(objA);
                byte[] bArrB = ((eqam) objA).b();
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf2.getClass();
                epuq epuqVar = (epuq) evsn.parseFrom(epuq.a, bArrCopyOf2);
                epuqVar.getClass();
                return epuqVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq l(final cbwd cbwdVar, final List list, final evqs evqsVar, enba enbaVar) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "processAdvanceEraRequest", 223, "ZinniaMlsClientSync.kt")).I("processAdvanceEraRequest(mlsOperation=%d, contextId=%s, keyPackageCount=%d)", Integer.valueOf(enbaVar.p), cbwdVar.e, Integer.valueOf(list.size()));
        return (epuq) j(this, enbaVar, enbs.UNSPECIFIED, new fdae() { // from class: cbyp
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                Object objA;
                evqs byteString = cbwdVar.toByteString();
                epth epthVar = (epth) epti.a.createBuilder();
                epthVar.getClass();
                DesugarCollections.unmodifiableList(((epti) epthVar.instance).b).getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ccfw) it.next()).a);
                }
                cbyx cbyxVar = this.a;
                evqs evqsVar2 = evqsVar;
                eptj.b(arrayList, epthVar);
                epti eptiVarA = eptj.a(epthVar);
                eprc eprcVar = (eprc) eprd.a.createBuilder();
                eprcVar.getClass();
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.e(byteString, epuuVar);
                epuv epuvVarA = epuw.a(epuuVar);
                eprcVar.copyOnWrite();
                eprd eprdVar = (eprd) eprcVar.instance;
                eprdVar.c = epuvVarA;
                eprdVar.b |= 1;
                eprcVar.copyOnWrite();
                eprd eprdVar2 = (eprd) eprcVar.instance;
                eprdVar2.d = eptiVarA;
                eprdVar2.b |= 2;
                eprcVar.copyOnWrite();
                eprd eprdVar3 = (eprd) eprcVar.instance;
                eprdVar3.b |= 4;
                eprdVar3.e = evqsVar2;
                evsn evsnVarBuild = eprcVar.build();
                evsnVarBuild.getClass();
                byte[] byteArray = ((eprd) evsnVarBuild).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Object obj = fctiVarC.a;
                Memory memory = (Memory) obj;
                epzp epzpVarZinnia_FfiClient_process_advance_era_request = epzc.a.Zinnia_FfiClient_process_advance_era_request(cbyxVar.a.b.b, (eqau) fctiVarC.b);
                if (epzpVarZinnia_FfiClient_process_advance_era_request.isOk == 1) {
                    eqam eqamVar = new eqam(epzpVarZinnia_FfiClient_process_advance_era_request.union.ok);
                    eqamVar.a();
                    objA = eqamVar;
                    if (memory != null) {
                        memory.close();
                        objA = eqamVar;
                    }
                } else {
                    eqbs eqbsVar = new eqbs(epzpVarZinnia_FfiClient_process_advance_era_request.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    objA = fctl.a(eqbsVar);
                }
                fctl.b(objA);
                byte[] bArrB = ((eqam) objA).b();
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf2.getClass();
                epuq epuqVar = (epuq) evsn.parseFrom(epuq.a, bArrCopyOf2);
                epuqVar.getClass();
                return epuqVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq m(final cbwd cbwdVar, final eyxu eyxuVar) {
        String str;
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = cqnc.e;
        aufh aufhVar = cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b;
        if (aufhVar == null || (str = aufhVar.j) == null) {
            str = "<unknown>";
        }
        ekrdVar.X(ekrzVar, str);
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "processGroupInfoMessage", 172, "ZinniaMlsClientSync.kt");
        enba enbaVar = enba.UNKNOWN_OPERATION;
        ekrdVar2.u("processGroupInfoMessage(mlsOperation=%d, eraId=%d)", enbaVar.p, eyxuVar.e);
        enbs enbsVar = enbs.PROCESS_MESSAGE;
        String str2 = (cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b).j;
        str2.getClass();
        return (epuq) q(enbaVar, enbsVar, str2, new fdae() { // from class: cbyl
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                evqs evqsVar;
                eyxu eyxuVar2 = eyxuVar;
                evqs byteString = cbwdVar.toByteString();
                eyxw eyxwVar = eyxuVar2.c;
                if (eyxwVar == null) {
                    eyxwVar = eyxw.a;
                }
                evqs evqsVar2 = eyxwVar.b;
                evqsVar2.getClass();
                eyxw eyxwVar2 = eyxuVar2.c;
                evqs evqsVar3 = (eyxwVar2 == null ? eyxw.a : eyxwVar2).c;
                evqsVar3.getClass();
                if (eyxwVar2 == null) {
                    eyxwVar2 = eyxw.a;
                }
                if (eyxwVar2.d.H()) {
                    evqsVar = null;
                } else {
                    eyxw eyxwVar3 = eyxuVar2.c;
                    if (eyxwVar3 == null) {
                        eyxwVar3 = eyxw.a;
                    }
                    evqsVar = eyxwVar3.d;
                }
                cbyx cbyxVar = this.a;
                evqs evqsVar4 = eyxuVar2.g;
                int i = eyxuVar2.e;
                epuj epujVar = (epuj) epuk.a.createBuilder();
                epujVar.getClass();
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.e(byteString, epuuVar);
                if (evqsVar4 != null) {
                    epuw.b(evqsVar4, epuuVar);
                }
                epul.b(epuw.a(epuuVar), epujVar);
                epts eptsVar = (epts) eptt.a.createBuilder();
                eptsVar.getClass();
                epwe epweVar = (epwe) epwf.a.createBuilder();
                epweVar.getClass();
                epweVar.copyOnWrite();
                epwf epwfVar = (epwf) epweVar.instance;
                epwfVar.b |= 1;
                epwfVar.c = evqsVar2;
                epweVar.copyOnWrite();
                epwf epwfVar2 = (epwf) epweVar.instance;
                epwfVar2.b |= 2;
                epwfVar2.d = evqsVar3;
                if (evqsVar != null) {
                    epweVar.copyOnWrite();
                    epwf epwfVar3 = (epwf) epweVar.instance;
                    epwfVar3.b |= 4;
                    epwfVar3.e = evqsVar;
                }
                eqca eqcaVar = cbyxVar.a;
                evsn evsnVarBuild = epweVar.build();
                evsnVarBuild.getClass();
                eptsVar.copyOnWrite();
                eptt epttVar = (eptt) eptsVar.instance;
                epttVar.c = (epwf) evsnVarBuild;
                epttVar.b |= 1;
                evsn evsnVarBuild2 = eptsVar.build();
                evsnVarBuild2.getClass();
                epujVar.copyOnWrite();
                epuk epukVar = (epuk) epujVar.instance;
                epukVar.d = (eptt) evsnVarBuild2;
                epukVar.c = 10;
                epul.c(i, epujVar);
                byte[] byteArray = epul.a(epujVar).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                Object objA = eqcaVar.b.a(bArrCopyOf);
                fctl.b(objA);
                byte[] bArrB = ((eqam) objA).b();
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf2.getClass();
                epuq epuqVar = (epuq) evsn.parseFrom(epuq.a, bArrCopyOf2);
                epuqVar.getClass();
                return epuqVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final epuq n(final cbwd cbwdVar, final cchc cchcVar, final int i, final evqs evqsVar, final aubq aubqVar, enba enbaVar, final basd basdVar) {
        String str;
        cbwdVar.getClass();
        enbaVar.getClass();
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = cqnc.e;
        aufh aufhVar = cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b;
        if (aufhVar == null || (str = aufhVar.j) == null) {
            str = "<unknown>";
        }
        ekrdVar.X(ekrzVar, str);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "processMessageSync", 144, "ZinniaMlsClientSync.kt")).u("processMessageSync(mlsOperation=%d, eraId=%d)", enbaVar.p, i);
        enbs enbsVar = enbs.PROCESS_MESSAGE;
        String str2 = (cbwdVar.c == 2 ? (aufh) cbwdVar.d : aufh.b).j;
        str2.getClass();
        return (epuq) q(enbaVar, enbsVar, str2, new fdae() { // from class: cbyn
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                cbwd cbwdVar2 = cbwdVar;
                evqs byteString = cbwdVar2.toByteString();
                aufh aufhVar2 = cbwdVar2.c == 2 ? (aufh) cbwdVar2.d : aufh.b;
                aubq aubqVar2 = aubqVar;
                basd basdVar2 = basdVar;
                int i2 = i;
                String str3 = aufhVar2.j;
                str3.getClass();
                epwg epwgVar = (epwg) epwh.a.createBuilder();
                epwgVar.getClass();
                String str4 = aubqVar2.d;
                str4.getClass();
                epwgVar.copyOnWrite();
                epwh epwhVar = (epwh) epwgVar.instance;
                epwhVar.b |= 1;
                epwhVar.c = str4;
                evsn evsnVarBuild = epwgVar.build();
                evsnVarBuild.getClass();
                epwh epwhVar2 = (epwh) evsnVarBuild;
                if (i2 <= 0) {
                    throw new IllegalArgumentException("Invalid era ID");
                }
                String str5 = epwhVar2.c;
                str5.getClass();
                if (str5.length() <= 0) {
                    throw new IllegalArgumentException("Invalid sender client, msisdn is not set");
                }
                cchc cchcVar2 = cchcVar;
                cbyx cbyxVar = this.a;
                evqs evqsVar2 = evqsVar;
                epuj epujVar = (epuj) epuk.a.createBuilder();
                epujVar.getClass();
                epul.d(cchcVar2.a, epujVar);
                epuu epuuVar = (epuu) epuv.a.createBuilder();
                epuuVar.getClass();
                epuw.e(byteString, epuuVar);
                epuw.d(str3, epuuVar);
                if (evqsVar2 != null) {
                    epuw.b(evqsVar2, epuuVar);
                }
                String str6 = basdVar2.b;
                if (str6 != null) {
                    epuuVar.copyOnWrite();
                    epuv epuvVar = (epuv) epuuVar.instance;
                    epuvVar.b |= 32;
                    epuvVar.g = str6;
                }
                eqca eqcaVar = cbyxVar.a;
                epul.b(epuw.a(epuuVar), epujVar);
                epujVar.copyOnWrite();
                epuk epukVar = (epuk) epujVar.instance;
                epukVar.f = epwhVar2;
                epukVar.b |= 2;
                epul.c(i2, epujVar);
                byte[] byteArray = epul.a(epujVar).toByteArray();
                byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
                bArrCopyOf.getClass();
                Object objA = eqcaVar.b.a(bArrCopyOf);
                fctl.b(objA);
                byte[] bArrB = ((eqam) objA).b();
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
                bArrCopyOf2.getClass();
                epuq epuqVar = (epuq) evsn.parseFrom(epuq.a, bArrCopyOf2);
                epuqVar.getClass();
                return epuqVar;
            }
        });
    }

    @Override // defpackage.cbvk
    public final void o(enba enbaVar) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "runMaintenance", 488, "ZinniaMlsClientSync.kt")).t("runMaintenance(mlsOperation=%d)", enbaVar);
        j(this, enbaVar, enbs.RUN_MAINTENANCE, new fdae() { // from class: cbyq
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                Object objA;
                epzr epzrVarZinnia_FfiClient_run_maintenance = epzc.a.Zinnia_FfiClient_run_maintenance(this.a.a.b.b);
                if (epzrVarZinnia_FfiClient_run_maintenance.isOk == 1) {
                    objA = fctx.a;
                } else {
                    eqbs eqbsVar = new eqbs(epzrVarZinnia_FfiClient_run_maintenance.union.err);
                    eqbsVar.b();
                    objA = fctl.a(eqbsVar);
                }
                fctl.b(objA);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.cbvk
    public final boolean p(final ccep ccepVar, enba enbaVar) {
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.g, ccepVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/mls/client/ZinniaMlsClientSync", "deleteGroupSync", 449, "ZinniaMlsClientSync.kt")).r("deleteGroupSync(mlsOperation=%d)", enbaVar.p);
        return ((Boolean) j(this, enbaVar, enbs.DELETE_GROUP, new fdae() { // from class: cbyj
            @Override // defpackage.fdae
            public final Object invoke() throws Throwable {
                Object objA;
                byte[] bytes = ccepVar.a.getBytes(fdfy.a);
                bytes.getClass();
                byte[] bArrCopyOf = Arrays.copyOf(bytes, bytes.length);
                bArrCopyOf.getClass();
                fcti fctiVarC = epzk.c(bArrCopyOf);
                Object obj = fctiVarC.a;
                Memory memory = (Memory) obj;
                epzl epzlVarZinnia_FfiClient_delete_group = epzc.a.Zinnia_FfiClient_delete_group(this.a.a.b.b, (eqau) fctiVarC.b);
                if (epzlVarZinnia_FfiClient_delete_group.isOk == 1) {
                    objA = Boolean.valueOf(epzlVarZinnia_FfiClient_delete_group.union.ok > 0);
                } else {
                    eqbs eqbsVar = new eqbs(epzlVarZinnia_FfiClient_delete_group.union.err);
                    eqbsVar.b();
                    if (memory != null) {
                        memory.close();
                    }
                    objA = fctl.a(eqbsVar);
                }
                fctl.b(objA);
                Boolean bool = (Boolean) objA;
                bool.booleanValue();
                return bool;
            }
        })).booleanValue();
    }
}
