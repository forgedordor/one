package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akaf implements akag {
    public static final eksp a = eksp.c("BugleConversation");
    public final fdjx b;
    public final cogw c;
    public final ajvr d;
    public final fcsu e;
    public final fcsu f;
    public final atut g;
    public final ardj h;
    public final cifw i;
    private final fcyh j;
    private final asre k;
    private final avpc l;
    private final fcsu m;
    private final dzuc n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;

    public akaf(fcyh fcyhVar, fdjx fdjxVar, cogw cogwVar, ajvr ajvrVar, fcsu fcsuVar, fcsu fcsuVar2, asre asreVar, avpc avpcVar, fcsu fcsuVar3, dzuc dzucVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, atut atutVar, ardj ardjVar, cifw cifwVar) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        cogwVar.getClass();
        ajvrVar.getClass();
        fcsuVar.getClass();
        asreVar.getClass();
        avpcVar.getClass();
        fcsuVar3.getClass();
        dzucVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        ardjVar.getClass();
        cifwVar.getClass();
        this.j = fcyhVar;
        this.b = fdjxVar;
        this.c = cogwVar;
        this.d = ajvrVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.k = asreVar;
        this.l = avpcVar;
        this.m = fcsuVar3;
        this.n = dzucVar;
        this.o = fcsuVar4;
        this.p = fcsuVar5;
        this.q = fcsuVar6;
        this.g = atutVar;
        this.h = ardjVar;
        this.i = cifwVar;
    }

    @Override // defpackage.akag
    public final eiju a(aoer aoerVar, ekgb ekgbVar, boolean z, String str, Uri uri, auib auibVar) {
        ekgbVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new akaa(this, aoerVar, ekgbVar, z, str, uri, auibVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [eieu] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aoer r18, defpackage.ekgb r19, com.google.android.ims.rcsservice.group.GroupInfo r20, android.net.Uri r21, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r22, defpackage.auib r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaf.b(aoer, ekgb, com.google.android.ims.rcsservice.group.GroupInfo, android.net.Uri, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, auib, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.aoer r15, defpackage.ekgb r16, boolean r17, java.lang.String r18, android.net.Uri r19, defpackage.auib r20, defpackage.fcxy r21) {
        /*
            r14 = this;
            r0 = r21
            boolean r1 = r0 instanceof defpackage.ajzy
            if (r1 == 0) goto L15
            r1 = r0
            ajzy r1 = (defpackage.ajzy) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            ajzy r1 = new ajzy
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r1.c
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            eieu r15 = r1.d
            defpackage.fctl.b(r0)     // Catch: java.lang.Throwable -> L2b
            goto L68
        L2b:
            r0 = move-exception
            r1 = r0
            goto L74
        L2e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L36:
            defpackage.fctl.b(r0)
            fcyh r0 = r1.u()
            boolean r0 = defpackage.eicg.b(r0)
            if (r0 == 0) goto L7a
            java.lang.String r0 = "getOrCreateConversation"
            eieu r3 = defpackage.eiiy.h(r0)
            fcyh r0 = r14.j     // Catch: java.lang.Throwable -> L70
            ajzz r5 = new ajzz     // Catch: java.lang.Throwable -> L70
            r13 = 0
            r6 = r14
            r9 = r15
            r7 = r16
            r8 = r17
            r12 = r18
            r11 = r19
            r10 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L70
            r1.d = r3     // Catch: java.lang.Throwable -> L70
            r1.c = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = defpackage.fdin.a(r0, r5, r1)     // Catch: java.lang.Throwable -> L70
            if (r0 == r2) goto L6f
            r15 = r3
        L68:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r0 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r0     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            defpackage.fczl.a(r15, r1)
            return r0
        L6f:
            return r2
        L70:
            r0 = move-exception
            r15 = r0
            r1 = r0
            r15 = r3
        L74:
            throw r1     // Catch: java.lang.Throwable -> L75
        L75:
            r0 = move-exception
            defpackage.fczl.a(r15, r1)
            throw r0
        L7a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaf.c(aoer, ekgb, boolean, java.lang.String, android.net.Uri, auib, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r5, java.lang.String r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.akad
            if (r0 == 0) goto L13
            r0 = r7
            akad r0 = (defpackage.akad) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            akad r0 = new akad
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r5 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L6b
        L29:
            r6 = move-exception
            goto L64
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r7)
            fcyh r7 = r0.u()
            boolean r7 = defpackage.eicg.b(r7)
            if (r7 == 0) goto L72
            java.lang.String r7 = "updateExistingConversation"
            eieu r7 = defpackage.eiiy.h(r7)
            if (r6 == 0) goto L6a
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L61
            if (r2 != 0) goto L4f
            goto L6a
        L4f:
            ajvr r2 = r4.d     // Catch: java.lang.Throwable -> L61
            eiju r5 = r2.R(r5, r6)     // Catch: java.lang.Throwable -> L61
            r0.d = r7     // Catch: java.lang.Throwable -> L61
            r0.c = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)     // Catch: java.lang.Throwable -> L61
            if (r5 == r1) goto L60
            goto L6a
        L60:
            return r1
        L61:
            r5 = move-exception
            r6 = r5
            r5 = r7
        L64:
            throw r6     // Catch: java.lang.Throwable -> L65
        L65:
            r7 = move-exception
            defpackage.fczl.a(r5, r6)
            throw r7
        L6a:
            r5 = r7
        L6b:
            r6 = 0
            defpackage.fczl.a(r5, r6)
            fctx r5 = defpackage.fctx.a
            return r5
        L72:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaf.d(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8 A[Catch: all -> 0x0043, TryCatch #7 {all -> 0x0043, blocks: (B:13:0x003d, B:95:0x028a, B:97:0x0296, B:102:0x02b1, B:154:0x03d5, B:158:0x03e0, B:160:0x03f8, B:218:0x04fd, B:219:0x0502, B:110:0x02c4, B:111:0x02c7, B:112:0x02c8, B:113:0x02cd, B:76:0x01e9, B:78:0x01f2, B:80:0x01fa, B:83:0x0209, B:87:0x0221, B:89:0x0245, B:114:0x02ce, B:115:0x02d5, B:118:0x02d9, B:120:0x02ec, B:123:0x0304, B:125:0x0318, B:130:0x0326, B:131:0x0337, B:133:0x033d, B:134:0x034e, B:140:0x0365, B:141:0x0368, B:142:0x0369, B:143:0x036e, B:144:0x036f, B:146:0x037b, B:153:0x03b9, B:224:0x0507, B:225:0x050a, B:226:0x050b, B:227:0x0510, B:98:0x029a, B:100:0x02ac, B:104:0x02b8, B:105:0x02bf, B:121:0x02f0, B:147:0x037f, B:148:0x0390, B:150:0x0396, B:151:0x03ab, B:108:0x02c2, B:138:0x0363, B:222:0x0505), top: B:249:0x002a, inners: #0, #1, #4, #6, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03e0 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #7 {all -> 0x0043, blocks: (B:13:0x003d, B:95:0x028a, B:97:0x0296, B:102:0x02b1, B:154:0x03d5, B:158:0x03e0, B:160:0x03f8, B:218:0x04fd, B:219:0x0502, B:110:0x02c4, B:111:0x02c7, B:112:0x02c8, B:113:0x02cd, B:76:0x01e9, B:78:0x01f2, B:80:0x01fa, B:83:0x0209, B:87:0x0221, B:89:0x0245, B:114:0x02ce, B:115:0x02d5, B:118:0x02d9, B:120:0x02ec, B:123:0x0304, B:125:0x0318, B:130:0x0326, B:131:0x0337, B:133:0x033d, B:134:0x034e, B:140:0x0365, B:141:0x0368, B:142:0x0369, B:143:0x036e, B:144:0x036f, B:146:0x037b, B:153:0x03b9, B:224:0x0507, B:225:0x050a, B:226:0x050b, B:227:0x0510, B:98:0x029a, B:100:0x02ac, B:104:0x02b8, B:105:0x02bf, B:121:0x02f0, B:147:0x037f, B:148:0x0390, B:150:0x0396, B:151:0x03ab, B:108:0x02c2, B:138:0x0363, B:222:0x0505), top: B:249:0x002a, inners: #0, #1, #4, #6, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x043d A[Catch: all -> 0x00cf, TRY_ENTER, TryCatch #12 {all -> 0x00cf, blocks: (B:187:0x04ac, B:193:0x04b7, B:194:0x04ba, B:178:0x0472, B:180:0x047b, B:182:0x0487, B:195:0x04bb, B:196:0x04c0, B:197:0x04c1, B:207:0x04e8, B:208:0x04eb, B:166:0x0434, B:170:0x043d, B:172:0x0449, B:209:0x04ec, B:210:0x04f1, B:216:0x04f9, B:217:0x04fc, B:36:0x00ca, B:92:0x0279, B:205:0x04e6, B:191:0x04b5, B:214:0x04f7), top: B:249:0x002a, inners: #11, #17, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x047b A[Catch: all -> 0x00cf, TryCatch #12 {all -> 0x00cf, blocks: (B:187:0x04ac, B:193:0x04b7, B:194:0x04ba, B:178:0x0472, B:180:0x047b, B:182:0x0487, B:195:0x04bb, B:196:0x04c0, B:197:0x04c1, B:207:0x04e8, B:208:0x04eb, B:166:0x0434, B:170:0x043d, B:172:0x0449, B:209:0x04ec, B:210:0x04f1, B:216:0x04f9, B:217:0x04fc, B:36:0x00ca, B:92:0x0279, B:205:0x04e6, B:191:0x04b5, B:214:0x04f7), top: B:249:0x002a, inners: #11, #17, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04c1 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #12 {all -> 0x00cf, blocks: (B:187:0x04ac, B:193:0x04b7, B:194:0x04ba, B:178:0x0472, B:180:0x047b, B:182:0x0487, B:195:0x04bb, B:196:0x04c0, B:197:0x04c1, B:207:0x04e8, B:208:0x04eb, B:166:0x0434, B:170:0x043d, B:172:0x0449, B:209:0x04ec, B:210:0x04f1, B:216:0x04f9, B:217:0x04fc, B:36:0x00ca, B:92:0x0279, B:205:0x04e6, B:191:0x04b5, B:214:0x04f7), top: B:249:0x002a, inners: #11, #17, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e9 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #7 {all -> 0x0043, blocks: (B:13:0x003d, B:95:0x028a, B:97:0x0296, B:102:0x02b1, B:154:0x03d5, B:158:0x03e0, B:160:0x03f8, B:218:0x04fd, B:219:0x0502, B:110:0x02c4, B:111:0x02c7, B:112:0x02c8, B:113:0x02cd, B:76:0x01e9, B:78:0x01f2, B:80:0x01fa, B:83:0x0209, B:87:0x0221, B:89:0x0245, B:114:0x02ce, B:115:0x02d5, B:118:0x02d9, B:120:0x02ec, B:123:0x0304, B:125:0x0318, B:130:0x0326, B:131:0x0337, B:133:0x033d, B:134:0x034e, B:140:0x0365, B:141:0x0368, B:142:0x0369, B:143:0x036e, B:144:0x036f, B:146:0x037b, B:153:0x03b9, B:224:0x0507, B:225:0x050a, B:226:0x050b, B:227:0x0510, B:98:0x029a, B:100:0x02ac, B:104:0x02b8, B:105:0x02bf, B:121:0x02f0, B:147:0x037f, B:148:0x0390, B:150:0x0396, B:151:0x03ab, B:108:0x02c2, B:138:0x0363, B:222:0x0505), top: B:249:0x002a, inners: #0, #1, #4, #6, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f2 A[Catch: all -> 0x0043, TryCatch #7 {all -> 0x0043, blocks: (B:13:0x003d, B:95:0x028a, B:97:0x0296, B:102:0x02b1, B:154:0x03d5, B:158:0x03e0, B:160:0x03f8, B:218:0x04fd, B:219:0x0502, B:110:0x02c4, B:111:0x02c7, B:112:0x02c8, B:113:0x02cd, B:76:0x01e9, B:78:0x01f2, B:80:0x01fa, B:83:0x0209, B:87:0x0221, B:89:0x0245, B:114:0x02ce, B:115:0x02d5, B:118:0x02d9, B:120:0x02ec, B:123:0x0304, B:125:0x0318, B:130:0x0326, B:131:0x0337, B:133:0x033d, B:134:0x034e, B:140:0x0365, B:141:0x0368, B:142:0x0369, B:143:0x036e, B:144:0x036f, B:146:0x037b, B:153:0x03b9, B:224:0x0507, B:225:0x050a, B:226:0x050b, B:227:0x0510, B:98:0x029a, B:100:0x02ac, B:104:0x02b8, B:105:0x02bf, B:121:0x02f0, B:147:0x037f, B:148:0x0390, B:150:0x0396, B:151:0x03ab, B:108:0x02c2, B:138:0x0363, B:222:0x0505), top: B:249:0x002a, inners: #0, #1, #4, #6, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0296 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #7 {all -> 0x0043, blocks: (B:13:0x003d, B:95:0x028a, B:97:0x0296, B:102:0x02b1, B:154:0x03d5, B:158:0x03e0, B:160:0x03f8, B:218:0x04fd, B:219:0x0502, B:110:0x02c4, B:111:0x02c7, B:112:0x02c8, B:113:0x02cd, B:76:0x01e9, B:78:0x01f2, B:80:0x01fa, B:83:0x0209, B:87:0x0221, B:89:0x0245, B:114:0x02ce, B:115:0x02d5, B:118:0x02d9, B:120:0x02ec, B:123:0x0304, B:125:0x0318, B:130:0x0326, B:131:0x0337, B:133:0x033d, B:134:0x034e, B:140:0x0365, B:141:0x0368, B:142:0x0369, B:143:0x036e, B:144:0x036f, B:146:0x037b, B:153:0x03b9, B:224:0x0507, B:225:0x050a, B:226:0x050b, B:227:0x0510, B:98:0x029a, B:100:0x02ac, B:104:0x02b8, B:105:0x02bf, B:121:0x02f0, B:147:0x037f, B:148:0x0390, B:150:0x0396, B:151:0x03ab, B:108:0x02c2, B:138:0x0363, B:222:0x0505), top: B:249:0x002a, inners: #0, #1, #4, #6, #8, #9 }] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [akaf] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r4v5, types: [eieu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.Instant r18, java.lang.String r19, boolean r20, defpackage.aoer r21, defpackage.ekgb r22, java.lang.String r23, defpackage.fcxy r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaf.e(j$.time.Instant, java.lang.String, boolean, aoer, ekgb, java.lang.String, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(j$.time.Instant r14, java.lang.String r15, boolean r16, defpackage.aoer r17, defpackage.ekgb r18, java.lang.String r19, defpackage.fcxy r20) {
        /*
            r13 = this;
            r0 = r20
            boolean r1 = r0 instanceof defpackage.akac
            if (r1 == 0) goto L15
            r1 = r0
            akac r1 = (defpackage.akac) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            akac r1 = new akac
            r1.<init>(r13, r0)
        L1a:
            r9 = r1
            java.lang.Object r0 = r9.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r9.c
            r10 = 0
            java.lang.String r11 = "GetOrCreateConversationAction#getOrCreateConversation"
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            dzub r14 = r9.d
            defpackage.fctl.b(r0)     // Catch: java.lang.Throwable -> L2f
            goto L59
        L2f:
            r0 = move-exception
            r15 = r0
            goto L6b
        L32:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3a:
            defpackage.fctl.b(r0)
            dzuc r0 = r13.n
            dzub r12 = r0.d()
            r9.d = r12     // Catch: java.lang.Throwable -> L67
            r9.c = r3     // Catch: java.lang.Throwable -> L67
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            java.lang.Object r0 = r2.e(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L67
            if (r0 == r1) goto L66
            r14 = r12
        L59:
            dzuc r15 = r13.n
            dzfh r1 = new dzfh
            r1.<init>(r11)
            dzua r3 = defpackage.dzua.UNKNOWN
            r15.f(r14, r1, r10, r3)
            return r0
        L66:
            return r1
        L67:
            r0 = move-exception
            r14 = r0
            r15 = r14
            r14 = r12
        L6b:
            dzuc r0 = r13.n
            dzfh r1 = new dzfh
            r1.<init>(r11)
            dzua r3 = defpackage.dzua.UNKNOWN
            r0.f(r14, r1, r10, r3)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akaf.f(j$.time.Instant, java.lang.String, boolean, aoer, ekgb, java.lang.String, fcxy):java.lang.Object");
    }
}
