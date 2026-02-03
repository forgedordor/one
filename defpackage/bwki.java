package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.communication.synapse.security.scytale.DecryptResult;
import com.google.communication.synapse.security.scytale.DecryptState;
import com.google.communication.synapse.security.scytale.EncryptResult;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.PlaintextMessage;
import com.google.communication.synapse.security.scytale.ReceiptError;
import com.google.communication.synapse.security.scytale.ReceiptInfo;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.SecureMessage;
import com.google.communication.synapse.security.scytale.UserDevice;
import com.google.communication.synapse.security.scytale.UserDevices;
import j$.time.Instant;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwki implements bwkc {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "ScytaleCrypto");
    public final celq b;
    private final Context c;
    private final fcsu d;
    private final fcsu e;
    private final bwhk f;
    private final fcsu g;
    private final bwkr h;
    private final fcsu i;
    private final fcsu j;
    private final ains k;
    private final fcsu l;
    private final eygg m;
    private final bvur n;
    private final fcsu o;
    private final fcsu p;
    private final efnk q;
    private final fcsu r;
    private final fcsu s;
    private final eosc t;
    private final fcsu u;

    public bwki(Context context, fcsu fcsuVar, fcsu fcsuVar2, celq celqVar, bwhk bwhkVar, fcsu fcsuVar3, bwkr bwkrVar, fcsu fcsuVar4, fcsu fcsuVar5, ains ainsVar, fcsu fcsuVar6, eygg eyggVar, bvur bvurVar, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, eosc eoscVar, fcsu fcsuVar11) {
        this.c = context;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.b = celqVar;
        this.f = bwhkVar;
        this.g = fcsuVar3;
        this.h = bwkrVar;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = ainsVar;
        this.l = fcsuVar6;
        this.m = eyggVar;
        this.n = bvurVar;
        this.o = fcsuVar7;
        this.p = fcsuVar8;
        this.r = fcsuVar9;
        this.s = fcsuVar10;
        this.t = eoscVar;
        this.u = fcsuVar11;
        this.q = new efnk((dflp) fcsuVar11.b());
    }

    private static bwbw g(elxz elxzVar) {
        DecryptState decryptState = DecryptState.UNTRUSTED_IDENTITY_KEY;
        ReceiptError receiptError = ReceiptError.UNKNOWN;
        int iOrdinal = elxzVar.ordinal();
        if (iOrdinal == 1) {
            return bwbw.SENDERS_IDENTITY_INCORRECT;
        }
        if (iOrdinal == 2) {
            return bwbw.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED;
        }
        if (iOrdinal == 3) {
            return bwbw.SENDERS_USER_ID_INCORRECT;
        }
        throw new IllegalStateException("Invalid failed identity verification reason");
    }

    private final bwkb h(chxo chxoVar, elxz elxzVar, Optional optional, btmj btmjVar) {
        if (btmjVar != null) {
            long j = ((chuh) chxoVar).i;
            long jIntValue = j - ((Integer) bwbt.w.e()).intValue();
            if (jIntValue <= btmjVar.k().toEpochMilli() && jIntValue <= ((btkn) optional.get()).k().toEpochMilli()) {
                cqbd cqbdVarE = a.e();
                n(cqbdVarE, chxoVar, optional);
                cqbdVarE.I("Message's identity wasn't successfully verified, dropping message.");
                cqbdVarE.B("remoteUser != null", true);
                cqbdVarE.z("messageMetadata.getReceivedTimestamp", j);
                cqbdVarE.A("remoteUser.getGuaranteedFreshAsOfTimestamp()", btmjVar.k());
                cqbdVarE.A("remoteInstance.get().getGuaranteedFreshAsOfTimestamp", ((btkn) optional.get()).k());
                cqbdVarE.r();
                m(chxoVar, elxzVar);
                return bwkb.e(g(elxzVar));
            }
        }
        bwgs bwgsVar = (bwgs) this.o.b();
        chuh chuhVar = (chuh) chxoVar;
        basd basdVar = chuhVar.a;
        if (!bwgsVar.a(basdVar)) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Exceeded max retry count for identity verification");
            cqbdVarC.h(basdVar);
            cqbdVarC.r();
            return bwkb.e(bwbw.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED);
        }
        cqbd cqbdVarC2 = a.c();
        n(cqbdVarC2, chxoVar, optional);
        cqbdVarC2.I("Received message from a new identity. Performing extra check");
        cqbdVarC2.A("reason", elxzVar);
        cqbdVarC2.r();
        this.f.b(chxoVar, chuhVar.b.d);
        return bwkb.e(bwbw.DECRYPTION_POSTPONED_FOR_IDENTITY_CHECK);
    }

    private final bwkb i(String str, chxo chxoVar, NativeMessageEncryptorV2 nativeMessageEncryptorV2, basd basdVar, String str2, DecryptResult decryptResult, eyfx eyfxVar) {
        eyfu eyfuVar;
        boolean z;
        ChatMessage chatMessage;
        ReceiptInfo receipt = decryptResult.getReceipt();
        if (receipt == null) {
            return bwkb.d(eyfxVar, null);
        }
        if (TextUtils.isEmpty(str)) {
            a.r("Can't send message receipt, unknown local registration id");
            return eyfxVar == null ? bwkb.e(bwbw.LOCAL_REGISTRATION_ID_NOT_FOUND) : bwkb.d(eyfxVar, null);
        }
        try {
            eieu eieuVarK = eiiy.k("ScytaleCryptoImpl#createReceiptMessage");
            try {
                aubq aubqVar = ((chuh) chxoVar).b;
                String str3 = aubqVar.d;
                Instant instantOfEpochMilli = Instant.ofEpochMilli(((chuh) chxoVar).h);
                boolean z2 = ((chuh) chxoVar).e;
                eyfs eyfsVar = (eyfs) eyfv.a.createBuilder();
                String messageId = receipt.getMessageId();
                eyfsVar.copyOnWrite();
                eyfv eyfvVar = (eyfv) eyfsVar.instance;
                messageId.getClass();
                eyfvVar.b |= 1;
                eyfvVar.c = messageId;
                ReceiptError error = receipt.getError();
                DecryptState decryptState = DecryptState.UNTRUSTED_IDENTITY_KEY;
                ReceiptError receiptError = ReceiptError.UNKNOWN;
                int iOrdinal = error.ordinal();
                if (iOrdinal == 0) {
                    eyfuVar = eyfu.UNKNOWN;
                } else if (iOrdinal == 1) {
                    eyfuVar = eyfu.SUCCESS;
                } else if (iOrdinal == 2) {
                    eyfuVar = eyfu.FAILED_TO_DECRYPT;
                } else {
                    if (iOrdinal != 3) {
                        throw new AssertionError("Unknown enum value");
                    }
                    eyfuVar = eyfu.NOT_INTENDED_RECIPIENT;
                }
                eyfsVar.copyOnWrite();
                eyfv eyfvVar2 = (eyfv) eyfsVar.instance;
                eyfvVar2.d = eyfuVar.f;
                eyfvVar2.b |= 2;
                byte[] signature = receipt.getSignature();
                if (signature != null) {
                    evqs evqsVarX = evqs.x(signature);
                    eyfsVar.copyOnWrite();
                    eyfv eyfvVar3 = (eyfv) eyfsVar.instance;
                    eyfvVar3.b |= 4;
                    eyfvVar3.e = evqsVarX;
                }
                byte[] byteArray = ((eyfv) eyfsVar.build()).toByteArray();
                if (receipt.getError() == ReceiptError.SUCCESS) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str2);
                    UserDevices[] userDevicesArr = new UserDevices[1];
                    z = false;
                    cczv cczvVar = alvx.a;
                    if (((Boolean) new alvv().get()).booleanValue()) {
                        str3 = aubqVar.d;
                    }
                    userDevicesArr[0] = new UserDevices(str3, arrayList);
                    ArrayList<UserDevices> arrayList2 = new ArrayList<>(Arrays.asList(userDevicesArr));
                    bwko bwkoVarA = this.h.a();
                    bwkoVarA.b(elss.SUCCESS_RECEIPT);
                    bwkq bwkqVarA = bwkoVarA.a();
                    eyfw eyfwVar = (eyfw) eyfx.a.createBuilder();
                    eyfwVar.copyOnWrite();
                    eyfx eyfxVar2 = (eyfx) eyfwVar.instance;
                    eyfxVar2.b |= 1;
                    eyfxVar2.c = "application/vnd.google.rcs.success";
                    evqs evqsVarX2 = evqs.x(byteArray);
                    eyfwVar.copyOnWrite();
                    eyfx eyfxVar3 = (eyfx) eyfwVar.instance;
                    eyfxVar3.b |= 4;
                    eyfxVar3.e = evqsVarX2;
                    eyfwVar.copyOnWrite();
                    eyfx eyfxVar4 = (eyfx) eyfwVar.instance;
                    str.getClass();
                    eyfxVar4.b |= 2;
                    eyfxVar4.d = str;
                    EncryptResult encryptResult = (EncryptResult) bwlb.a(nativeMessageEncryptorV2.encrypt(Scope.create(bwkqVarA), arrayList2, true, "", false, new PlaintextMessage(basd.e(basdVar), ((eyfx) eyfwVar.build()).toByteArray())));
                    ejyb.a(encryptResult.getMissingSessions().isEmpty());
                    SecureMessage encryptedData = encryptResult.getEncryptedData();
                    ejyb.e(encryptedData);
                    byteArray = encryptedData.getCipherText();
                } else {
                    z = false;
                }
                boolean z3 = (bwbv.h() && (receipt.getError().equals(ReceiptError.FAILED_TO_DECRYPT) || ((!bwbv.g() || !receipt.getError().equals(ReceiptError.OTK_NOT_TARGETED_TO_ME)) ? z : true)) && z2) ? true : z;
                eyfq eyfqVar = (eyfq) eyfr.a.createBuilder();
                evqs evqsVarX3 = evqs.x(byteArray);
                eyfqVar.copyOnWrite();
                eyfr eyfrVar = (eyfr) eyfqVar.instance;
                eyfrVar.b |= 1;
                eyfrVar.c = evqsVarX3;
                eyfqVar.copyOnWrite();
                eyfr eyfrVar2 = (eyfr) eyfqVar.instance;
                str.getClass();
                eyfrVar2.b |= 2;
                eyfrVar2.d = str;
                if (z3) {
                    eyfqVar.copyOnWrite();
                    eyfr eyfrVar3 = (eyfr) eyfqVar.instance;
                    eyfrVar3.b |= 4;
                    eyfrVar3.e = true;
                }
                eyfr eyfrVar4 = (eyfr) eyfqVar.build();
                String string = UUID.randomUUID().toString();
                if (this.n.p() && (receipt.getError().equals(ReceiptError.SUCCESS) || z3)) {
                    efkk efkkVar = efkk.DELIVERY;
                    efia efiaVar = new efia();
                    efiaVar.i(basd.e(basdVar));
                    efiaVar.l(efkkVar);
                    efiaVar.j(efkkVar.f);
                    efiaVar.k(instantOfEpochMilli);
                    efiaVar.g(eyfrVar4.toByteString());
                    efiaVar.a = (dflp) this.u.b();
                    chatMessage = new ChatMessage(ChatMessage.Type.MESSAGE_RECEIPT, ((efmy) this.q.b(efiaVar.m())).a.I(), string);
                } else {
                    chatMessage = new ChatMessage(receipt.getError() == ReceiptError.SUCCESS ? b() : (f() && bwbt.f()) ? ChatMessage.Type.ENCRYPTION_FTD : ChatMessage.Type.TEST_FAILURE, bwir.b(eyfrVar4, ((Boolean) bwbt.m.e()).booleanValue() ? (String) bwbt.n.e() : ""), string);
                }
                eieuVarK.close();
                return bwkb.d(eyfxVar, chatMessage);
            } finally {
            }
        } catch (efoc e) {
            a.s("Failed to serialize a message receipt.", e);
            return eyfxVar == null ? bwkb.e(bwbw.INVALID_FTD_RECEIPT) : bwkb.d(eyfxVar, null);
        }
    }

    private static eyfx j(DecryptResult decryptResult) {
        byte[] decryptedMessage = decryptResult.getDecryptedMessage();
        ejyb.e(decryptedMessage);
        return (eyfx) evsn.parseFrom(eyfx.a, decryptedMessage, evrr.a());
    }

    private static ArrayList k(ekot ekotVar, boolean z) {
        final ArrayList arrayList = new ArrayList();
        final int iA = bwbv.a(ekotVar.i(), z);
        Map.EL.forEach(ekotVar.w(), new BiConsumer() { // from class: bwkd
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int i = iA;
                ArrayList arrayList2 = arrayList;
                String str = (String) obj;
                Collection collection = (Collection) obj2;
                if (i == 1) {
                    arrayList2.add(new UserDevices(str, new ArrayList(collection)));
                    return;
                }
                cqbd cqbdVarC = bwki.a.c();
                cqbdVarC.I("Expanding the recipient.");
                cqbdVarC.y("multiplier", i);
                cqbdVarC.r();
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList2.add(new UserDevices(str, new ArrayList(collection)));
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        return arrayList;
    }

    private static ArrayList l(final String str) {
        String[] strArr = bton.a;
        btok btokVar = new btok(bton.a);
        btokVar.A("getKnownUserIdRepresentations");
        btom btomVar = new btom();
        btomVar.c(str);
        btokVar.k(new btol(btomVar));
        return (ArrayList) btokVar.b().E().map(new Function() { // from class: bwkf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btnp btnpVar = (btnp) obj;
                btnpVar.aA(0, "remote_user_id");
                return new UserDevice(btnpVar.a, str);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: bwkg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
    }

    private final void m(chxo chxoVar, elxz elxzVar) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elxx elxxVar = (elxx) elya.a.createBuilder();
        String strE = basd.e(((chuh) chxoVar).a);
        elxxVar.copyOnWrite();
        elya elyaVar = (elya) elxxVar.instance;
        elyaVar.b |= 1;
        elyaVar.c = strE;
        elxxVar.copyOnWrite();
        elya elyaVar2 = (elya) elxxVar.instance;
        elyaVar2.d = elxzVar.i;
        elyaVar2.b |= 2;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elya elyaVar3 = (elya) elxxVar.build();
        elyaVar3.getClass();
        ellhVar2.ab = elyaVar3;
        ellhVar2.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        ((aill) this.j.b()).j(ellgVar);
    }

    private static void n(cqbd cqbdVar, chxo chxoVar, Optional optional) {
        chuh chuhVar = (chuh) chxoVar;
        cqbdVar.M("remoteUserId", chuhVar.b.d);
        cqbdVar.A("rcsMessageId", chuhVar.a);
        cqbdVar.z("receivedTimestamp", chuhVar.i);
        if (!optional.isPresent()) {
            cqbdVar.A("remoteInstance", "empty");
            return;
        }
        cqbdVar.A("remoteInstance.lastModifiedTimestamp", ((btkn) optional.get()).m());
        cqbdVar.A("remoteInstance.guaranteedFreshAsOfTimestamp", ((btkn) optional.get()).k());
        cqbdVar.A("remoteIdentityKey", ((btkn) optional.get()).q());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168 A[Catch: all -> 0x068e, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0005, B:6:0x001c, B:8:0x0021, B:11:0x0029, B:14:0x0031, B:16:0x0070, B:81:0x0168, B:85:0x017a, B:87:0x01b7, B:89:0x01c0, B:92:0x01ce, B:94:0x0208, B:96:0x020d, B:98:0x0231, B:101:0x0248, B:103:0x028d, B:108:0x02cb, B:104:0x02aa, B:106:0x02be, B:107:0x02c8, B:111:0x02d3, B:112:0x02e9, B:121:0x0368, B:122:0x036b, B:204:0x0565, B:130:0x0388, B:133:0x03a3, B:134:0x03b0, B:137:0x03b7, B:141:0x03cf, B:143:0x03d5, B:153:0x046e, B:164:0x0480, B:163:0x047d, B:166:0x0488, B:171:0x0491, B:178:0x049c, B:177:0x0499, B:179:0x049d, B:181:0x04b3, B:184:0x04bb, B:186:0x04c1, B:188:0x04c9, B:189:0x04e7, B:191:0x04ed, B:193:0x04f4, B:201:0x053e, B:196:0x052d, B:198:0x0535, B:202:0x0550, B:208:0x056e, B:212:0x0579, B:221:0x058c, B:220:0x0589, B:226:0x0591, B:235:0x05bd, B:234:0x05ba, B:238:0x05c4, B:241:0x05e5, B:244:0x0618, B:246:0x0626, B:249:0x063f, B:258:0x0682, B:257:0x067f, B:19:0x007d, B:21:0x009e, B:24:0x00a5, B:26:0x00c5, B:28:0x00cd, B:30:0x00d2, B:32:0x00d6, B:33:0x00d8, B:35:0x00dd, B:37:0x00e1, B:38:0x00e3, B:40:0x00ee, B:42:0x00f4, B:44:0x00f8, B:46:0x00fc, B:47:0x00fe, B:49:0x010a, B:50:0x010c, B:61:0x0125, B:62:0x0127, B:64:0x0134, B:78:0x015b, B:79:0x015d, B:72:0x014b, B:73:0x014e, B:74:0x0151, B:75:0x0154, B:76:0x0157, B:56:0x0118, B:57:0x011b, B:58:0x011e, B:59:0x0121, B:265:0x068d, B:264:0x068a, B:15:0x006c, B:261:0x0685, B:135:0x03b1, B:136:0x03b6, B:132:0x038f, B:93:0x01e1, B:174:0x0494, B:86:0x0180, B:231:0x05b5, B:160:0x0478, B:254:0x067a), top: B:281:0x0005, inners: #1, #4, #7, #9, #10, #13, #14, #15, #16, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0178  */
    @Override // defpackage.bwkc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.bwkb a(java.lang.String r24, defpackage.eyfr r25, defpackage.chxo r26, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2 r27) {
        /*
            Method dump skipped, instructions count: 1681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwki.a(java.lang.String, eyfr, chxo, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2):bwkb");
    }

    @Override // defpackage.bwkc
    public final ChatMessage.Type b() {
        return (f() && bwbt.f()) ? ChatMessage.Type.ENCRYPTED_MESSAGE : ChatMessage.Type.TEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0239  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.String] */
    @Override // defpackage.bwkc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eyfr c(defpackage.eyfx r28, final defpackage.basd r29, java.lang.String r30, defpackage.ekot r31, boolean r32, boolean r33, defpackage.elss r34, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2 r35) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwki.c(eyfx, basd, java.lang.String, ekot, boolean, boolean, elss, com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2):eyfr");
    }

    public final void d(btmj btmjVar) {
        bojh bojhVarB = ((baqx) this.d.b()).b(btmjVar.m());
        if (bojhVarB == null || bojhVarB.m() == 1) {
            return;
        }
        ((aykj) this.i.b()).a(bojhVarB.C()).s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(final chxo chxoVar, bwvi bwviVar) {
        botb botbVarE = botm.e();
        botbVarE.A("updateGroupConversationEncryptionStatusIfNeeded");
        botbVarE.i(new Function() { // from class: bwke
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.E(((chuh) chxoVar).g);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = botbVarE.b().z();
        int size = ekgbVarZ.size();
        for (int i = 0; i < size; i++) {
            bojh bojhVar = (bojh) ekgbVarZ.get(i);
            if (bojhVar.m() != 1) {
                this.k.e("Bugle.Etouffee.Conversation.Encryption.Update", bwviVar.u);
                bwnu bwnuVar = (bwnu) bwnv.a.createBuilder();
                String string = bojhVar.C().toString();
                bwnuVar.copyOnWrite();
                bwnv bwnvVar = (bwnv) bwnuVar.instance;
                string.getClass();
                bwnvVar.c = string;
                String strB = ejwk.b(bojhVar.ae());
                bwnuVar.copyOnWrite();
                ((bwnv) bwnuVar.instance).d = strB;
                String strB2 = ejwk.b(bojhVar.T());
                bwnuVar.copyOnWrite();
                ((bwnv) bwnuVar.instance).e = strB2;
                aubq aubqVar = ((chuh) chxoVar).c;
                bwnuVar.copyOnWrite();
                bwnv bwnvVar2 = (bwnv) bwnuVar.instance;
                bwnvVar2.f = aubqVar;
                bwnvVar2.b |= 1;
                ((cazj) ((bwnw) this.s.b()).a.b()).g(cbcu.f("sync_group_then_encryption_status", (bwnv) bwnuVar.build()));
            }
        }
    }

    final boolean f() {
        Context context = this.c;
        return !dhka.k(context) || dhka.g(context, "ChatSessionServiceVersions", 3);
    }
}
