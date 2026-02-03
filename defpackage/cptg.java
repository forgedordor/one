package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cptg implements cpsm {
    public static final cqce a = cqce.g("BugleCms", "CmsMessagesFactoryImpl");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsMessagesFactoryImpl");
    public final eqnd c;
    public final cptv e;
    private final bbdl j;
    private final String k;
    private final Optional l;
    private final ains m;
    private final apom n;
    private final aqeg o;
    private final aqfo p;
    public boolean f = false;
    public Optional g = null;
    private ConversationIdType q = null;
    public final Supplier d = new cpte(this);
    private final Supplier h = new cptb(this);
    private final ejxr i = ejxx.a(new ejxr() { // from class: cpsw
        @Override // defpackage.ejxr
        public final Object get() {
            cptg cptgVar = this.a;
            try {
                cptv cptvVar = cptgVar.e;
                Optional optionalB = cptv.b(cptgVar.c, cptl.OBJECT_PAYLOAD_PART_ADDITIONAL_FIELDS.d);
                if (optionalB.isEmpty()) {
                    return epjf.a;
                }
                evqe evqeVar = ((eqnu) optionalB.get()).g;
                if (evqeVar == null) {
                    evqeVar = evqe.a;
                }
                return (epjf) cptvVar.a.a((epkh) evsn.parseFrom(epkh.a, evqeVar.c, evrr.a()), epjf.a);
            } catch (cpql e) {
                cqbd cqbdVarE = cptg.a.e();
                cqbdVarE.I("Message AdditionalFields decryption succeeded. Original exception is logged below.");
                cqbdVarE.A("object_cms_id", cptgVar.c.c);
                cqbdVarE.s(e);
                cptgVar.f = true;
                return (epjf) e.a;
            } catch (evtj e2) {
                cqbd cqbdVarE2 = cptg.a.e();
                cqbdVarE2.I("Failed to create AdditionalFields.");
                cqbdVarE2.A("object_cms_id", cptgVar.c.c);
                cqbdVarE2.s(e2);
                throw new cpsy(e2);
            }
        }
    });

    public cptg(bbdl bbdlVar, cptv cptvVar, ains ainsVar, apom apomVar, aqeg aqegVar, aqfo aqfoVar, eqnd eqndVar, String str, Optional optional) {
        this.e = cptvVar;
        this.j = bbdlVar;
        this.m = ainsVar;
        this.k = str;
        this.l = optional;
        this.n = apomVar;
        this.o = aqegVar;
        this.p = aqfoVar;
        this.c = eqndVar;
    }

    public static bpvd e(epkz epkzVar) {
        String[] strArr = bpxj.a;
        bpvi bpviVar = new bpvi();
        bpviVar.o(epkzVar.b);
        bpviVar.f(epkzVar.c);
        bpviVar.m(epkzVar.d);
        bpviVar.h(epkzVar.e);
        bpviVar.i(epkzVar.g);
        bpviVar.j(epkzVar.f);
        return bpviVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ConversationIdType g(final String str) {
        ConversationIdType conversationIdTypeC;
        ConversationIdType conversationIdType;
        boolean zA = this.p.a();
        if (zA && (conversationIdType = this.q) != null) {
            return conversationIdType;
        }
        eieu eieuVarK = eiiy.k("CmsMessagesFactoryImpl#getBugleConversationId");
        try {
            if (zA) {
                botb botbVarE = botm.e();
                botbVarE.A("CmsMessagesFactoryImpl#getBugleConversationId");
                botbVarE.i(new Function() { // from class: cpso
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        botlVar.e(str);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                botbVarE.g(new Function() { // from class: cpsp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bopp) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekgb ekgbVarZ = botbVarE.b().z();
                if (ekgbVarZ.size() != 1) {
                    throw new cpsx(String.format("Unable to get Conversation data for conversation_cms_id: %s, object_cms_id: %s", str, this.c.c));
                }
                conversationIdTypeC = ((bojh) ekgbVarZ.get(0)).C();
                this.q = conversationIdTypeC;
            } else {
                conversationIdTypeC = (ConversationIdType) botm.h(str, new Function() { // from class: cpsq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bojh) obj).C();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Supplier() { // from class: cpsr
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        throw new cpsx(String.format("Unable to get Conversation data for conversation_cms_id: %s, object_cms_id: %s", str, this.a.c.c));
                    }
                });
            }
            eieuVarK.close();
            return conversationIdTypeC;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a3 A[Catch: all -> 0x0544, TryCatch #0 {all -> 0x0544, blocks: (B:144:0x0256, B:146:0x0264, B:149:0x0273, B:151:0x027b, B:153:0x028e, B:156:0x0297, B:159:0x02a3, B:172:0x0301, B:162:0x02b4, B:164:0x02c7, B:166:0x02cf, B:171:0x02f4, B:169:0x02e2, B:173:0x0305), top: B:327:0x0256, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0447 A[Catch: all -> 0x056f, TryCatch #5 {all -> 0x056f, blocks: (B:3:0x000a, B:5:0x002b, B:7:0x0033, B:9:0x0049, B:10:0x004c, B:12:0x0052, B:13:0x0055, B:14:0x0058, B:133:0x0215, B:134:0x0217, B:136:0x0221, B:137:0x0228, B:139:0x023a, B:140:0x023d, B:142:0x0245, B:143:0x024c, B:147:0x026e, B:175:0x0316, B:177:0x0321, B:179:0x0327, B:180:0x032c, B:186:0x0368, B:192:0x0395, B:200:0x03a3, B:199:0x03a0, B:201:0x03a4, B:203:0x03aa, B:204:0x03ad, B:206:0x03b5, B:207:0x03b8, B:211:0x03cb, B:213:0x03d6, B:214:0x03d8, B:216:0x03e3, B:218:0x03ee, B:229:0x0408, B:230:0x040a, B:232:0x0416, B:234:0x0423, B:236:0x042b, B:237:0x042d, B:239:0x0435, B:241:0x043d, B:242:0x043f, B:244:0x0447, B:246:0x044e, B:257:0x0467, B:258:0x0469, B:260:0x0473, B:262:0x047f, B:264:0x0483, B:265:0x0485, B:267:0x048f, B:268:0x0492, B:270:0x0498, B:271:0x049b, B:273:0x04a4, B:274:0x04a6, B:276:0x04b0, B:278:0x04b5, B:280:0x04bc, B:282:0x04c2, B:284:0x04c6, B:285:0x04c8, B:288:0x04d7, B:290:0x04dd, B:291:0x04e0, B:293:0x04eb, B:295:0x04f3, B:296:0x04fc, B:298:0x0510, B:300:0x0518, B:301:0x0525, B:303:0x052b, B:305:0x0533, B:306:0x053c, B:279:0x04b9, B:261:0x047b, B:252:0x045a, B:253:0x045d, B:254:0x0460, B:255:0x0463, B:245:0x044b, B:224:0x03fb, B:225:0x03fe, B:226:0x0401, B:227:0x0404, B:217:0x03eb, B:210:0x03c9, B:315:0x054e, B:314:0x054b, B:16:0x005e, B:17:0x0062, B:18:0x0066, B:19:0x006a, B:20:0x006e, B:21:0x0072, B:22:0x0076, B:23:0x007a, B:24:0x007e, B:25:0x0082, B:26:0x0086, B:27:0x008a, B:28:0x008e, B:29:0x0092, B:30:0x0096, B:31:0x009a, B:32:0x009e, B:33:0x00a2, B:34:0x00a6, B:35:0x00aa, B:36:0x00ae, B:37:0x00b2, B:38:0x00b6, B:39:0x00ba, B:40:0x00be, B:41:0x00c2, B:42:0x00c6, B:43:0x00ca, B:44:0x00ce, B:45:0x00d2, B:46:0x00d6, B:47:0x00da, B:48:0x00de, B:49:0x00e2, B:50:0x00e6, B:51:0x00ea, B:52:0x00ee, B:53:0x00f2, B:54:0x00f6, B:55:0x00fa, B:56:0x00fe, B:57:0x0102, B:58:0x0106, B:59:0x010a, B:60:0x010e, B:61:0x0112, B:62:0x0116, B:63:0x011a, B:64:0x011e, B:65:0x0122, B:66:0x0126, B:67:0x012a, B:68:0x012e, B:69:0x0132, B:70:0x0136, B:71:0x013a, B:72:0x013e, B:73:0x0142, B:74:0x0146, B:75:0x014a, B:76:0x014e, B:77:0x0152, B:78:0x0156, B:79:0x015a, B:80:0x015e, B:81:0x0162, B:82:0x0166, B:83:0x016a, B:84:0x016e, B:85:0x0172, B:86:0x0176, B:87:0x017a, B:88:0x017e, B:89:0x0182, B:90:0x0186, B:91:0x018a, B:92:0x018e, B:93:0x0192, B:94:0x0196, B:95:0x019a, B:96:0x019e, B:97:0x01a2, B:98:0x01a6, B:99:0x01aa, B:100:0x01ae, B:101:0x01b2, B:102:0x01b6, B:103:0x01ba, B:104:0x01be, B:105:0x01c2, B:106:0x01c6, B:107:0x01c9, B:108:0x01cc, B:109:0x01cf, B:110:0x01d2, B:111:0x01d5, B:112:0x01d8, B:113:0x01db, B:114:0x01de, B:115:0x01e1, B:116:0x01e4, B:117:0x01e7, B:118:0x01ea, B:119:0x01ed, B:120:0x01f0, B:121:0x01f3, B:122:0x01f6, B:123:0x01f9, B:124:0x01fc, B:125:0x01ff, B:126:0x0202, B:127:0x0205, B:128:0x0208, B:129:0x020b, B:130:0x020e, B:131:0x0211, B:316:0x054f, B:317:0x055e, B:318:0x055f, B:319:0x056e, B:144:0x0256, B:146:0x0264, B:149:0x0273, B:151:0x027b, B:153:0x028e, B:156:0x0297, B:159:0x02a3, B:172:0x0301, B:162:0x02b4, B:164:0x02c7, B:166:0x02cf, B:171:0x02f4, B:169:0x02e2, B:173:0x0305, B:181:0x0330, B:183:0x0338, B:185:0x035d, B:188:0x036c, B:189:0x0383, B:190:0x0384, B:311:0x0546, B:196:0x039b), top: B:335:0x000a, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Type inference failed for: r10v2, types: [alqm, java.lang.Object] */
    @Override // defpackage.cpsm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData a() {
        /*
            Method dump skipped, instructions count: 1644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cptg.a():com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData");
    }

    @Override // defpackage.cpsm
    public final epjf b() {
        epjf epjfVar;
        eieu eieuVarK = eiiy.k("CmsMessagesFactoryImpl#getAdditionalFields");
        try {
            if (this.n.a() && cpyl.a()) {
                ejwl.l(!ecem.g());
                epjfVar = (epjf) this.i.get();
            } else {
                epjfVar = epjf.a;
            }
            eieuVarK.close();
            return epjfVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cpsm
    public final List c() {
        epkn epknVar;
        eieu eieuVarK = eiiy.k("CmsMessagesFactoryImpl#getMessagePartsList");
        try {
            ejwl.l(!ecem.g());
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            for (eplj epljVar : ((cpte) this.d).a().p) {
                String str = this.c.m;
                eieu eieuVarK2 = eiiy.k("CmsMessagesFactoryImpl#restorePartsForMessagePartModel");
                try {
                    String[] strArr = PartsTable.a;
                    bscm bscmVar = new bscm();
                    if (!str.isEmpty()) {
                        bscmVar.u(g(str));
                    }
                    eplk eplkVarB = eplk.b(epljVar.e);
                    if (eplkVarB == null) {
                        eplkVarB = eplk.UNRECOGNIZED;
                    }
                    switch (eplkVarB.ordinal()) {
                        case 1:
                            eplr eplrVar = epljVar.b == 3 ? (eplr) epljVar.c : eplr.a;
                            bscmVar.Z(eplrVar.c);
                            bscmVar.t("text/plain");
                            epkz epkzVar = eplrVar.d;
                            if (epkzVar == null) {
                                epkzVar = epkz.a;
                            }
                            epkz epkzVar2 = epkz.a;
                            if (epkzVar.equals(epkzVar2)) {
                                this.g = Optional.empty();
                                break;
                            } else {
                                epkz epkzVar3 = eplrVar.d;
                                if (epkzVar3 != null) {
                                    epkzVar2 = epkzVar3;
                                }
                                this.g = Optional.of(e(epkzVar2));
                                break;
                            }
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                            epkm epkmVar = epljVar.b == 4 ? (epkm) epljVar.c : epkm.a;
                            bscmVar.n(epkmVar.d);
                            bscmVar.l(epkmVar.g);
                            bscmVar.y(epkmVar.h);
                            bscmVar.v(epkmVar.m);
                            bscmVar.ae((int) epkmVar.l);
                            bscmVar.A((int) epkmVar.k);
                            bscmVar.Y(epkmVar.e);
                            bscmVar.o(epkmVar.b.I());
                            bscmVar.m(epkmVar.c.I());
                            bscmVar.k(bvdl.CMS_MEDIA_DOWNLOAD_NOT_STARTED);
                            switch (epkmVar.f) {
                                case 0:
                                    epknVar = epkn.ATTACHMENT_TYPE_UNKNOWN;
                                    break;
                                case 1:
                                    epknVar = epkn.IMAGE_JPEG;
                                    break;
                                case 2:
                                    epknVar = epkn.IMAGE_JPG;
                                    break;
                                case 3:
                                    epknVar = epkn.IMAGE_PNG;
                                    break;
                                case 4:
                                    epknVar = epkn.IMAGE_GIF;
                                    break;
                                case 5:
                                    epknVar = epkn.IMAGE_WEBP;
                                    break;
                                case 6:
                                    epknVar = epkn.IMAGE_HEIF;
                                    break;
                                case 7:
                                    epknVar = epkn.IMAGE_WBMP;
                                    break;
                                case 8:
                                    epknVar = epkn.IMAGE_X_MS_BMP;
                                    break;
                                case 9:
                                    epknVar = epkn.VIDEO_MP4;
                                    break;
                                case 10:
                                    epknVar = epkn.VIDEO_3G2;
                                    break;
                                case 11:
                                    epknVar = epkn.VIDEO_3GPP;
                                    break;
                                case 12:
                                    epknVar = epkn.VIDEO_WEBM;
                                    break;
                                case 13:
                                    epknVar = epkn.VIDEO_MKV;
                                    break;
                                case 14:
                                    epknVar = epkn.AUDIO_AAC;
                                    break;
                                case 15:
                                    epknVar = epkn.AUDIO_AMR;
                                    break;
                                case 16:
                                    epknVar = epkn.AUDIO_MP3;
                                    break;
                                case 17:
                                    epknVar = epkn.AUDIO_MPEG;
                                    break;
                                case 18:
                                    epknVar = epkn.AUDIO_MPG;
                                    break;
                                case 19:
                                    epknVar = epkn.AUDIO_MP4;
                                    break;
                                case 20:
                                    epknVar = epkn.AUDIO_MP4_LATM;
                                    break;
                                case 21:
                                    epknVar = epkn.AUDIO_3GPP;
                                    break;
                                case 22:
                                    epknVar = epkn.AUDIO_OGG;
                                    break;
                                case 23:
                                    epknVar = epkn.TEXT_VCARD;
                                    break;
                                case 24:
                                    epknVar = epkn.VIDEO_M4V;
                                    break;
                                case 25:
                                    epknVar = epkn.VIDEO_MPEG4;
                                    break;
                                case 26:
                                    epknVar = epkn.VIDEO_MPEG;
                                    break;
                                case 27:
                                    epknVar = epkn.VIDEO_3GP;
                                    break;
                                case 28:
                                    epknVar = epkn.APP_PDF;
                                    break;
                                case 29:
                                    epknVar = epkn.APP_TXT;
                                    break;
                                case 30:
                                    epknVar = epkn.APP_HTML;
                                    break;
                                case 31:
                                    epknVar = epkn.AUDIO_OGG2;
                                    break;
                                case 32:
                                    epknVar = epkn.APP_SMIL;
                                    break;
                                case 33:
                                    epknVar = epkn.IMAGE_HEIC;
                                    break;
                                case 34:
                                    epknVar = epkn.TEXT_VCARD_RECEIVE;
                                    break;
                                case 35:
                                    epknVar = epkn.VIDEO_HEVC;
                                    break;
                                default:
                                    epknVar = null;
                                    break;
                            }
                            if (epknVar == null) {
                                epknVar = epkn.UNRECOGNIZED;
                            }
                            String str2 = (String) cptt.h.get(epknVar);
                            if (str2 != null) {
                                bscmVar.t(str2);
                                break;
                            }
                            break;
                        case 6:
                        case 8:
                            eplb eplbVar = epljVar.b == 5 ? (eplb) epljVar.c : eplb.a;
                            eplk eplkVarB2 = eplk.b(epljVar.e);
                            if (eplkVarB2 == null) {
                                eplkVarB2 = eplk.UNRECOGNIZED;
                            }
                            boolean zA = this.o.a();
                            bscmVar.D(eplbVar.b);
                            bscmVar.F(eplbVar.c);
                            bscmVar.Z(eplbVar.d);
                            if (zA && eplkVarB2.equals(eplk.RCS_LOCATION)) {
                                bscmVar.t("application/vnd.gsma.rcspushlocation+xml");
                                break;
                            }
                            break;
                    }
                    PartsTable.BindData bindDataA = bscmVar.a();
                    eieuVarK2.close();
                    ekfwVar.h(bindDataA);
                } finally {
                }
            }
            ekgb ekgbVarG = ekfwVar.g();
            eieuVarK.close();
            return ekgbVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cpsm
    public final boolean d() {
        return this.f;
    }
}
