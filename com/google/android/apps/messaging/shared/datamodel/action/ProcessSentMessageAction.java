package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import com.sun.jna.Function;
import defpackage.aoyd;
import defpackage.aoyf;
import defpackage.aubi;
import defpackage.aubk;
import defpackage.aubl;
import defpackage.augm;
import defpackage.axyl;
import defpackage.axym;
import defpackage.aymo;
import defpackage.aypy;
import defpackage.baro;
import defpackage.bary;
import defpackage.basd;
import defpackage.cmoi;
import defpackage.cmqb;
import defpackage.cqey;
import defpackage.dfea;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.ejwl;
import defpackage.ejxr;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.elpf;
import defpackage.elpg;
import defpackage.enxu;
import defpackage.enyw;
import defpackage.eoth;
import defpackage.evrj;
import defpackage.evwz;
import defpackage.fcsu;
import defpackage.fdae;
import defpackage.febt;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessSentMessageAction extends Action<Void> {
    public final axym b;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/ProcessSentMessageAction");
    public static final Parcelable.Creator<Action<?>> CREATOR = new axyl();

    /* compiled from: PG */
    public interface a {
        aypy bh();
    }

    private ProcessSentMessageAction(axym axymVar) {
        super(elgm.PROCESS_SENT_MESSAGE_ACTION);
        this.b = axymVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessSentMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessSentMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        aymo aymoVar = this.v;
        basd basdVarB = basd.b(aymoVar.f(), "rcs_message_id");
        if (basdVarB.k() && aymoVar.b("status", 2) == 0) {
            axym axymVar = this.b;
            axymVar.f.d(basdVarB, bary.a, true);
        }
        axym axymVar2 = this.b;
        fcsu fcsuVar = axymVar2.k;
        ((cmoi) fcsuVar.b()).e(basdVarB, 1);
        return ((cmoi) fcsuVar.b()).a(basdVarB, axymVar2.l, new fdae() { // from class: axyj
            @Override // defpackage.fdae
            public final Object invoke() {
                return this.a.b();
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Void b() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleDataModel");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessSentMessageAction", "executeAction", 641, "ProcessSentMessageAction.java")).q("ProcessSentMessageAction::executeInScope");
        eieu eieuVarK = eiiy.k("ProcessSentMessageAction::executeActionInScope");
        try {
            Void r1 = (Void) this.b.i.b(new ejxr() { // from class: axyk
                /* JADX WARN: Removed duplicated region for block: B:105:0x0323  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x035e A[Catch: all -> 0x0555, TryCatch #2 {all -> 0x0555, blocks: (B:5:0x0038, B:7:0x007f, B:8:0x008b, B:11:0x009f, B:40:0x013d, B:45:0x0165, B:56:0x01bf, B:58:0x01de, B:66:0x0214, B:70:0x021e, B:72:0x022d, B:74:0x0233, B:76:0x025f, B:78:0x026b, B:80:0x027c, B:83:0x0287, B:85:0x028b, B:87:0x02a0, B:89:0x02a4, B:94:0x02c8, B:106:0x0335, B:108:0x033b, B:111:0x0342, B:112:0x035e, B:116:0x038a, B:118:0x039a, B:120:0x03a4, B:129:0x03d9, B:131:0x03e3, B:133:0x03ed, B:135:0x040b, B:137:0x041b, B:138:0x041f, B:161:0x0463, B:140:0x0425, B:141:0x0428, B:142:0x042b, B:143:0x042e, B:144:0x0431, B:145:0x0434, B:146:0x0437, B:147:0x043a, B:148:0x043d, B:149:0x0440, B:150:0x0443, B:151:0x0446, B:152:0x0449, B:153:0x044c, B:154:0x044f, B:155:0x0452, B:156:0x0455, B:157:0x0458, B:158:0x045b, B:159:0x045e, B:160:0x0461, B:162:0x0467, B:165:0x0486, B:168:0x049a, B:170:0x04a0, B:171:0x04a6, B:174:0x04b0, B:176:0x04b6, B:177:0x04bc, B:179:0x04c2, B:181:0x04c8, B:183:0x04ce, B:184:0x04d5, B:186:0x04dd, B:188:0x04e3, B:193:0x04f5, B:196:0x04fd, B:198:0x0505, B:200:0x050b, B:201:0x050e, B:202:0x0510, B:204:0x051e, B:206:0x052b, B:205:0x0527, B:189:0x04e6, B:126:0x03b4, B:90:0x02a7, B:91:0x02bd, B:99:0x02e7, B:101:0x030e, B:61:0x01e3, B:49:0x0171, B:51:0x017f, B:52:0x0184, B:54:0x018a, B:55:0x0197, B:44:0x014d, B:13:0x00af, B:15:0x00b5, B:16:0x00c2, B:18:0x00d2, B:20:0x00d8, B:24:0x00fd, B:26:0x0102, B:27:0x0120, B:38:0x0136, B:37:0x0133, B:34:0x012e), top: B:223:0x0038, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:114:0x0385  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x0388  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x03d5  */
                /* JADX WARN: Removed duplicated region for block: B:131:0x03e3 A[Catch: all -> 0x0555, TryCatch #2 {all -> 0x0555, blocks: (B:5:0x0038, B:7:0x007f, B:8:0x008b, B:11:0x009f, B:40:0x013d, B:45:0x0165, B:56:0x01bf, B:58:0x01de, B:66:0x0214, B:70:0x021e, B:72:0x022d, B:74:0x0233, B:76:0x025f, B:78:0x026b, B:80:0x027c, B:83:0x0287, B:85:0x028b, B:87:0x02a0, B:89:0x02a4, B:94:0x02c8, B:106:0x0335, B:108:0x033b, B:111:0x0342, B:112:0x035e, B:116:0x038a, B:118:0x039a, B:120:0x03a4, B:129:0x03d9, B:131:0x03e3, B:133:0x03ed, B:135:0x040b, B:137:0x041b, B:138:0x041f, B:161:0x0463, B:140:0x0425, B:141:0x0428, B:142:0x042b, B:143:0x042e, B:144:0x0431, B:145:0x0434, B:146:0x0437, B:147:0x043a, B:148:0x043d, B:149:0x0440, B:150:0x0443, B:151:0x0446, B:152:0x0449, B:153:0x044c, B:154:0x044f, B:155:0x0452, B:156:0x0455, B:157:0x0458, B:158:0x045b, B:159:0x045e, B:160:0x0461, B:162:0x0467, B:165:0x0486, B:168:0x049a, B:170:0x04a0, B:171:0x04a6, B:174:0x04b0, B:176:0x04b6, B:177:0x04bc, B:179:0x04c2, B:181:0x04c8, B:183:0x04ce, B:184:0x04d5, B:186:0x04dd, B:188:0x04e3, B:193:0x04f5, B:196:0x04fd, B:198:0x0505, B:200:0x050b, B:201:0x050e, B:202:0x0510, B:204:0x051e, B:206:0x052b, B:205:0x0527, B:189:0x04e6, B:126:0x03b4, B:90:0x02a7, B:91:0x02bd, B:99:0x02e7, B:101:0x030e, B:61:0x01e3, B:49:0x0171, B:51:0x017f, B:52:0x0184, B:54:0x018a, B:55:0x0197, B:44:0x014d, B:13:0x00af, B:15:0x00b5, B:16:0x00c2, B:18:0x00d2, B:20:0x00d8, B:24:0x00fd, B:26:0x0102, B:27:0x0120, B:38:0x0136, B:37:0x0133, B:34:0x012e), top: B:223:0x0038, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:137:0x041b A[Catch: all -> 0x0555, TryCatch #2 {all -> 0x0555, blocks: (B:5:0x0038, B:7:0x007f, B:8:0x008b, B:11:0x009f, B:40:0x013d, B:45:0x0165, B:56:0x01bf, B:58:0x01de, B:66:0x0214, B:70:0x021e, B:72:0x022d, B:74:0x0233, B:76:0x025f, B:78:0x026b, B:80:0x027c, B:83:0x0287, B:85:0x028b, B:87:0x02a0, B:89:0x02a4, B:94:0x02c8, B:106:0x0335, B:108:0x033b, B:111:0x0342, B:112:0x035e, B:116:0x038a, B:118:0x039a, B:120:0x03a4, B:129:0x03d9, B:131:0x03e3, B:133:0x03ed, B:135:0x040b, B:137:0x041b, B:138:0x041f, B:161:0x0463, B:140:0x0425, B:141:0x0428, B:142:0x042b, B:143:0x042e, B:144:0x0431, B:145:0x0434, B:146:0x0437, B:147:0x043a, B:148:0x043d, B:149:0x0440, B:150:0x0443, B:151:0x0446, B:152:0x0449, B:153:0x044c, B:154:0x044f, B:155:0x0452, B:156:0x0455, B:157:0x0458, B:158:0x045b, B:159:0x045e, B:160:0x0461, B:162:0x0467, B:165:0x0486, B:168:0x049a, B:170:0x04a0, B:171:0x04a6, B:174:0x04b0, B:176:0x04b6, B:177:0x04bc, B:179:0x04c2, B:181:0x04c8, B:183:0x04ce, B:184:0x04d5, B:186:0x04dd, B:188:0x04e3, B:193:0x04f5, B:196:0x04fd, B:198:0x0505, B:200:0x050b, B:201:0x050e, B:202:0x0510, B:204:0x051e, B:206:0x052b, B:205:0x0527, B:189:0x04e6, B:126:0x03b4, B:90:0x02a7, B:91:0x02bd, B:99:0x02e7, B:101:0x030e, B:61:0x01e3, B:49:0x0171, B:51:0x017f, B:52:0x0184, B:54:0x018a, B:55:0x0197, B:44:0x014d, B:13:0x00af, B:15:0x00b5, B:16:0x00c2, B:18:0x00d2, B:20:0x00d8, B:24:0x00fd, B:26:0x0102, B:27:0x0120, B:38:0x0136, B:37:0x0133, B:34:0x012e), top: B:223:0x0038, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:164:0x0484 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:191:0x04eb  */
                /* JADX WARN: Removed duplicated region for block: B:195:0x04fb A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:200:0x050b A[Catch: all -> 0x0555, TryCatch #2 {all -> 0x0555, blocks: (B:5:0x0038, B:7:0x007f, B:8:0x008b, B:11:0x009f, B:40:0x013d, B:45:0x0165, B:56:0x01bf, B:58:0x01de, B:66:0x0214, B:70:0x021e, B:72:0x022d, B:74:0x0233, B:76:0x025f, B:78:0x026b, B:80:0x027c, B:83:0x0287, B:85:0x028b, B:87:0x02a0, B:89:0x02a4, B:94:0x02c8, B:106:0x0335, B:108:0x033b, B:111:0x0342, B:112:0x035e, B:116:0x038a, B:118:0x039a, B:120:0x03a4, B:129:0x03d9, B:131:0x03e3, B:133:0x03ed, B:135:0x040b, B:137:0x041b, B:138:0x041f, B:161:0x0463, B:140:0x0425, B:141:0x0428, B:142:0x042b, B:143:0x042e, B:144:0x0431, B:145:0x0434, B:146:0x0437, B:147:0x043a, B:148:0x043d, B:149:0x0440, B:150:0x0443, B:151:0x0446, B:152:0x0449, B:153:0x044c, B:154:0x044f, B:155:0x0452, B:156:0x0455, B:157:0x0458, B:158:0x045b, B:159:0x045e, B:160:0x0461, B:162:0x0467, B:165:0x0486, B:168:0x049a, B:170:0x04a0, B:171:0x04a6, B:174:0x04b0, B:176:0x04b6, B:177:0x04bc, B:179:0x04c2, B:181:0x04c8, B:183:0x04ce, B:184:0x04d5, B:186:0x04dd, B:188:0x04e3, B:193:0x04f5, B:196:0x04fd, B:198:0x0505, B:200:0x050b, B:201:0x050e, B:202:0x0510, B:204:0x051e, B:206:0x052b, B:205:0x0527, B:189:0x04e6, B:126:0x03b4, B:90:0x02a7, B:91:0x02bd, B:99:0x02e7, B:101:0x030e, B:61:0x01e3, B:49:0x0171, B:51:0x017f, B:52:0x0184, B:54:0x018a, B:55:0x0197, B:44:0x014d, B:13:0x00af, B:15:0x00b5, B:16:0x00c2, B:18:0x00d2, B:20:0x00d8, B:24:0x00fd, B:26:0x0102, B:27:0x0120, B:38:0x0136, B:37:0x0133, B:34:0x012e), top: B:223:0x0038, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:201:0x050e A[Catch: all -> 0x0555, TryCatch #2 {all -> 0x0555, blocks: (B:5:0x0038, B:7:0x007f, B:8:0x008b, B:11:0x009f, B:40:0x013d, B:45:0x0165, B:56:0x01bf, B:58:0x01de, B:66:0x0214, B:70:0x021e, B:72:0x022d, B:74:0x0233, B:76:0x025f, B:78:0x026b, B:80:0x027c, B:83:0x0287, B:85:0x028b, B:87:0x02a0, B:89:0x02a4, B:94:0x02c8, B:106:0x0335, B:108:0x033b, B:111:0x0342, B:112:0x035e, B:116:0x038a, B:118:0x039a, B:120:0x03a4, B:129:0x03d9, B:131:0x03e3, B:133:0x03ed, B:135:0x040b, B:137:0x041b, B:138:0x041f, B:161:0x0463, B:140:0x0425, B:141:0x0428, B:142:0x042b, B:143:0x042e, B:144:0x0431, B:145:0x0434, B:146:0x0437, B:147:0x043a, B:148:0x043d, B:149:0x0440, B:150:0x0443, B:151:0x0446, B:152:0x0449, B:153:0x044c, B:154:0x044f, B:155:0x0452, B:156:0x0455, B:157:0x0458, B:158:0x045b, B:159:0x045e, B:160:0x0461, B:162:0x0467, B:165:0x0486, B:168:0x049a, B:170:0x04a0, B:171:0x04a6, B:174:0x04b0, B:176:0x04b6, B:177:0x04bc, B:179:0x04c2, B:181:0x04c8, B:183:0x04ce, B:184:0x04d5, B:186:0x04dd, B:188:0x04e3, B:193:0x04f5, B:196:0x04fd, B:198:0x0505, B:200:0x050b, B:201:0x050e, B:202:0x0510, B:204:0x051e, B:206:0x052b, B:205:0x0527, B:189:0x04e6, B:126:0x03b4, B:90:0x02a7, B:91:0x02bd, B:99:0x02e7, B:101:0x030e, B:61:0x01e3, B:49:0x0171, B:51:0x017f, B:52:0x0184, B:54:0x018a, B:55:0x0197, B:44:0x014d, B:13:0x00af, B:15:0x00b5, B:16:0x00c2, B:18:0x00d2, B:20:0x00d8, B:24:0x00fd, B:26:0x0102, B:27:0x0120, B:38:0x0136, B:37:0x0133, B:34:0x012e), top: B:223:0x0038, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:204:0x051e A[Catch: all -> 0x0555, TryCatch #2 {all -> 0x0555, blocks: (B:5:0x0038, B:7:0x007f, B:8:0x008b, B:11:0x009f, B:40:0x013d, B:45:0x0165, B:56:0x01bf, B:58:0x01de, B:66:0x0214, B:70:0x021e, B:72:0x022d, B:74:0x0233, B:76:0x025f, B:78:0x026b, B:80:0x027c, B:83:0x0287, B:85:0x028b, B:87:0x02a0, B:89:0x02a4, B:94:0x02c8, B:106:0x0335, B:108:0x033b, B:111:0x0342, B:112:0x035e, B:116:0x038a, B:118:0x039a, B:120:0x03a4, B:129:0x03d9, B:131:0x03e3, B:133:0x03ed, B:135:0x040b, B:137:0x041b, B:138:0x041f, B:161:0x0463, B:140:0x0425, B:141:0x0428, B:142:0x042b, B:143:0x042e, B:144:0x0431, B:145:0x0434, B:146:0x0437, B:147:0x043a, B:148:0x043d, B:149:0x0440, B:150:0x0443, B:151:0x0446, B:152:0x0449, B:153:0x044c, B:154:0x044f, B:155:0x0452, B:156:0x0455, B:157:0x0458, B:158:0x045b, B:159:0x045e, B:160:0x0461, B:162:0x0467, B:165:0x0486, B:168:0x049a, B:170:0x04a0, B:171:0x04a6, B:174:0x04b0, B:176:0x04b6, B:177:0x04bc, B:179:0x04c2, B:181:0x04c8, B:183:0x04ce, B:184:0x04d5, B:186:0x04dd, B:188:0x04e3, B:193:0x04f5, B:196:0x04fd, B:198:0x0505, B:200:0x050b, B:201:0x050e, B:202:0x0510, B:204:0x051e, B:206:0x052b, B:205:0x0527, B:189:0x04e6, B:126:0x03b4, B:90:0x02a7, B:91:0x02bd, B:99:0x02e7, B:101:0x030e, B:61:0x01e3, B:49:0x0171, B:51:0x017f, B:52:0x0184, B:54:0x018a, B:55:0x0197, B:44:0x014d, B:13:0x00af, B:15:0x00b5, B:16:0x00c2, B:18:0x00d2, B:20:0x00d8, B:24:0x00fd, B:26:0x0102, B:27:0x0120, B:38:0x0136, B:37:0x0133, B:34:0x012e), top: B:223:0x0038, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:205:0x0527 A[Catch: all -> 0x0555, TryCatch #2 {all -> 0x0555, blocks: (B:5:0x0038, B:7:0x007f, B:8:0x008b, B:11:0x009f, B:40:0x013d, B:45:0x0165, B:56:0x01bf, B:58:0x01de, B:66:0x0214, B:70:0x021e, B:72:0x022d, B:74:0x0233, B:76:0x025f, B:78:0x026b, B:80:0x027c, B:83:0x0287, B:85:0x028b, B:87:0x02a0, B:89:0x02a4, B:94:0x02c8, B:106:0x0335, B:108:0x033b, B:111:0x0342, B:112:0x035e, B:116:0x038a, B:118:0x039a, B:120:0x03a4, B:129:0x03d9, B:131:0x03e3, B:133:0x03ed, B:135:0x040b, B:137:0x041b, B:138:0x041f, B:161:0x0463, B:140:0x0425, B:141:0x0428, B:142:0x042b, B:143:0x042e, B:144:0x0431, B:145:0x0434, B:146:0x0437, B:147:0x043a, B:148:0x043d, B:149:0x0440, B:150:0x0443, B:151:0x0446, B:152:0x0449, B:153:0x044c, B:154:0x044f, B:155:0x0452, B:156:0x0455, B:157:0x0458, B:158:0x045b, B:159:0x045e, B:160:0x0461, B:162:0x0467, B:165:0x0486, B:168:0x049a, B:170:0x04a0, B:171:0x04a6, B:174:0x04b0, B:176:0x04b6, B:177:0x04bc, B:179:0x04c2, B:181:0x04c8, B:183:0x04ce, B:184:0x04d5, B:186:0x04dd, B:188:0x04e3, B:193:0x04f5, B:196:0x04fd, B:198:0x0505, B:200:0x050b, B:201:0x050e, B:202:0x0510, B:204:0x051e, B:206:0x052b, B:205:0x0527, B:189:0x04e6, B:126:0x03b4, B:90:0x02a7, B:91:0x02bd, B:99:0x02e7, B:101:0x030e, B:61:0x01e3, B:49:0x0171, B:51:0x017f, B:52:0x0184, B:54:0x018a, B:55:0x0197, B:44:0x014d, B:13:0x00af, B:15:0x00b5, B:16:0x00c2, B:18:0x00d2, B:20:0x00d8, B:24:0x00fd, B:26:0x0102, B:27:0x0120, B:38:0x0136, B:37:0x0133, B:34:0x012e), top: B:223:0x0038, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:219:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:230:0x039a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x016f  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0208  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0214 A[Catch: all -> 0x0555, TRY_ENTER, TryCatch #2 {all -> 0x0555, blocks: (B:5:0x0038, B:7:0x007f, B:8:0x008b, B:11:0x009f, B:40:0x013d, B:45:0x0165, B:56:0x01bf, B:58:0x01de, B:66:0x0214, B:70:0x021e, B:72:0x022d, B:74:0x0233, B:76:0x025f, B:78:0x026b, B:80:0x027c, B:83:0x0287, B:85:0x028b, B:87:0x02a0, B:89:0x02a4, B:94:0x02c8, B:106:0x0335, B:108:0x033b, B:111:0x0342, B:112:0x035e, B:116:0x038a, B:118:0x039a, B:120:0x03a4, B:129:0x03d9, B:131:0x03e3, B:133:0x03ed, B:135:0x040b, B:137:0x041b, B:138:0x041f, B:161:0x0463, B:140:0x0425, B:141:0x0428, B:142:0x042b, B:143:0x042e, B:144:0x0431, B:145:0x0434, B:146:0x0437, B:147:0x043a, B:148:0x043d, B:149:0x0440, B:150:0x0443, B:151:0x0446, B:152:0x0449, B:153:0x044c, B:154:0x044f, B:155:0x0452, B:156:0x0455, B:157:0x0458, B:158:0x045b, B:159:0x045e, B:160:0x0461, B:162:0x0467, B:165:0x0486, B:168:0x049a, B:170:0x04a0, B:171:0x04a6, B:174:0x04b0, B:176:0x04b6, B:177:0x04bc, B:179:0x04c2, B:181:0x04c8, B:183:0x04ce, B:184:0x04d5, B:186:0x04dd, B:188:0x04e3, B:193:0x04f5, B:196:0x04fd, B:198:0x0505, B:200:0x050b, B:201:0x050e, B:202:0x0510, B:204:0x051e, B:206:0x052b, B:205:0x0527, B:189:0x04e6, B:126:0x03b4, B:90:0x02a7, B:91:0x02bd, B:99:0x02e7, B:101:0x030e, B:61:0x01e3, B:49:0x0171, B:51:0x017f, B:52:0x0184, B:54:0x018a, B:55:0x0197, B:44:0x014d, B:13:0x00af, B:15:0x00b5, B:16:0x00c2, B:18:0x00d2, B:20:0x00d8, B:24:0x00fd, B:26:0x0102, B:27:0x0120, B:38:0x0136, B:37:0x0133, B:34:0x012e), top: B:223:0x0038, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:94:0x02c8 A[Catch: all -> 0x0555, TryCatch #2 {all -> 0x0555, blocks: (B:5:0x0038, B:7:0x007f, B:8:0x008b, B:11:0x009f, B:40:0x013d, B:45:0x0165, B:56:0x01bf, B:58:0x01de, B:66:0x0214, B:70:0x021e, B:72:0x022d, B:74:0x0233, B:76:0x025f, B:78:0x026b, B:80:0x027c, B:83:0x0287, B:85:0x028b, B:87:0x02a0, B:89:0x02a4, B:94:0x02c8, B:106:0x0335, B:108:0x033b, B:111:0x0342, B:112:0x035e, B:116:0x038a, B:118:0x039a, B:120:0x03a4, B:129:0x03d9, B:131:0x03e3, B:133:0x03ed, B:135:0x040b, B:137:0x041b, B:138:0x041f, B:161:0x0463, B:140:0x0425, B:141:0x0428, B:142:0x042b, B:143:0x042e, B:144:0x0431, B:145:0x0434, B:146:0x0437, B:147:0x043a, B:148:0x043d, B:149:0x0440, B:150:0x0443, B:151:0x0446, B:152:0x0449, B:153:0x044c, B:154:0x044f, B:155:0x0452, B:156:0x0455, B:157:0x0458, B:158:0x045b, B:159:0x045e, B:160:0x0461, B:162:0x0467, B:165:0x0486, B:168:0x049a, B:170:0x04a0, B:171:0x04a6, B:174:0x04b0, B:176:0x04b6, B:177:0x04bc, B:179:0x04c2, B:181:0x04c8, B:183:0x04ce, B:184:0x04d5, B:186:0x04dd, B:188:0x04e3, B:193:0x04f5, B:196:0x04fd, B:198:0x0505, B:200:0x050b, B:201:0x050e, B:202:0x0510, B:204:0x051e, B:206:0x052b, B:205:0x0527, B:189:0x04e6, B:126:0x03b4, B:90:0x02a7, B:91:0x02bd, B:99:0x02e7, B:101:0x030e, B:61:0x01e3, B:49:0x0171, B:51:0x017f, B:52:0x0184, B:54:0x018a, B:55:0x0197, B:44:0x014d, B:13:0x00af, B:15:0x00b5, B:16:0x00c2, B:18:0x00d2, B:20:0x00d8, B:24:0x00fd, B:26:0x0102, B:27:0x0120, B:38:0x0136, B:37:0x0133, B:34:0x012e), top: B:223:0x0038, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:95:0x02d8  */
                @Override // defpackage.ejxr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object get() throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 1426
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.axyk.get():java.lang.Object");
                }
            });
            eieuVarK.close();
            return r1;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessSentMessageAction(axym axymVar, int i, Uri uri, Bundle bundle) {
        this(axymVar);
        aymo aymoVar = this.v;
        aymoVar.p("sent_by_mms_api_or_lib", true);
        aymoVar.v("message_id", bundle.getString("message_id"));
        aymoVar.t("message_uri", uri);
        aymoVar.t("updated_message_uri", bundle.getParcelable("updated_message_uri"));
        aymoVar.r("sub_id", bundle.getInt("sub_id", -1));
        aymoVar.r("result_code", i);
        if (axymVar.m.a() && i == 13) {
            aymoVar.r("raw_status", 10006);
        }
        aymoVar.r("http_status_code", bundle.getInt("android.telephony.extra.MMS_HTTP_STATUS", 0));
        aymoVar.t("content_uri", bundle.getParcelable("content_uri"));
        byte[] byteArray = bundle.getByteArray("android.telephony.extra.MMS_DATA");
        if (byteArray != null) {
            aymoVar.q(GroupManagementResponse.XML_TAG, byteArray);
        }
        aymoVar.p("response_important", bundle.getBoolean("response_important"));
        this.v.r("mms_api", 1);
        aymoVar.r("mms_last_connection_failure_cause_code", bundle.getInt("android.telephony.extra.LAST_CONNECTION_FAILURE_CAUSE_CODE"));
        if (bundle.getBoolean("android.telephony.extra.HANDLED_BY_CARRIER_APP")) {
            this.v.r("mms_api", 3);
        }
        aymoVar.r("key_rcs_transport_type", enyw.NOT_RCS.h);
        aymoVar.r("xsl_bugle_sending_status", febt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_MMS.a());
        if (bundle.containsKey("android.telephony.extra.HANDLED_BY_CARRIER_APP")) {
            aymoVar.p("handled_by_carrier_app", bundle.getBoolean("android.telephony.extra.HANDLED_BY_CARRIER_APP"));
        }
        aymoVar.r("xms_transport", elpf.TELEPHONY_UNSPECIFIED.h);
    }

    public ProcessSentMessageAction(axym axymVar, Parcel parcel) {
        super(parcel, elgm.PROCESS_SENT_MESSAGE_ACTION);
        this.b = axymVar;
    }

    public ProcessSentMessageAction(axym axymVar, baro baroVar, int i, int i2) {
        this(axymVar);
        ejwl.b(!baroVar.f().isEmpty(), "Missing Datagram Id");
        aymo aymoVar = this.v;
        aymoVar.p("sent_by_mms_api_or_lib", false);
        baro.h(aymoVar.f(), "datagram_id", baroVar);
        aymoVar.r("status", i);
        aymoVar.r("raw_status", 0);
        aymoVar.r("result_code", i2);
        aymoVar.r("key_rcs_transport_type", enyw.NOT_RCS.h);
    }

    public ProcessSentMessageAction(axym axymVar, MessageIdType messageIdType, basd basdVar, Uri uri, Uri uri2, int i, int i2, int i3, int i4, enxu enxuVar, elpf elpfVar) {
        this(axymVar);
        aymo aymoVar = this.v;
        aymoVar.p("sent_by_mms_api_or_lib", false);
        aymoVar.v("message_id", messageIdType.b());
        if (basdVar != null) {
            basd.h(aymoVar.f(), "rcs_message_id", basdVar);
        }
        aymoVar.t("message_uri", uri);
        aymoVar.t("updated_message_uri", uri2);
        aymoVar.r("sub_id", i);
        aymoVar.r("status", i2);
        aymoVar.r("raw_status", i3);
        aymoVar.r("result_code", i4);
        aymoVar.r("sms_error_code", -1);
        aymoVar.r("sms_part_count", 1);
        if (enxuVar != null) {
            aymoVar.q("rcs_diagnostics", enxuVar.toByteArray());
        }
        aymoVar.r("xsl_bugle_sending_status", febt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_FAST_FAILURE.a());
        aymoVar.r("xms_transport", elpfVar.h);
    }

    public ProcessSentMessageAction(axym axymVar, MessageIdType messageIdType, String str, int i, int i2) {
        this(axymVar);
        aymo aymoVar = this.v;
        aymoVar.p("sent_by_mms_api_or_lib", false);
        aymoVar.v("message_id", messageIdType.b());
        aymoVar.r("sub_id", i);
        aymoVar.r("status", i2 != -1 ? 2 : 0);
        aymoVar.r("raw_status", 0);
        aymoVar.r("result_code", i2);
        aymoVar.r("sms_error_code", -1);
        aymoVar.r("sms_part_count", 1);
        if (str != null) {
            aymoVar.v("cloud_sync_id", str);
        }
        aymoVar.r("key_rcs_transport_type", enyw.UNKNOWN_RCS_TYPE.h);
    }

    public ProcessSentMessageAction(axym axymVar, basd basdVar, int i, long j, long j2, Duration duration) {
        int i2;
        this(axymVar);
        final aymo aymoVar = this.v;
        aymoVar.p("sent_by_mms_api_or_lib", false);
        basdVar.g(new Consumer() { // from class: axyi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                basd.h(aymoVar.f(), "rcs_message_id", (basd) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        aymoVar.r("http_status_code", 0);
        aymoVar.s("delivered_time", j2);
        aymoVar.r("sms_error_code", -1);
        if (i == 50030) {
            aymoVar.r("status", 0);
            aymoVar.r("raw_status", 0);
            aymoVar.r("result_code", 0);
        } else {
            switch ((int) j) {
                case 59:
                case 60:
                case 62:
                case Function.ALT_CONVENTION /* 63 */:
                    i2 = 3;
                    break;
                case 61:
                default:
                    i2 = 1;
                    break;
            }
            aymoVar.r("status", i2);
            aymoVar.r("result_code", i2);
            aymoVar.r("raw_status", 0);
            aymoVar.r("rcs_chat_session_event_info", dfea.a(j) - 1);
        }
        aymoVar.r("key_rcs_transport_type", enyw.RCS_LEGACY.h);
        aymoVar.G(duration);
        aymoVar.r("xsl_bugle_sending_status", febt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_RCS.a());
    }

    public ProcessSentMessageAction(axym axymVar, basd basdVar, aubl aublVar, Instant instant, boolean z, elpg elpgVar, augm augmVar, enxu enxuVar) {
        this(axymVar);
        int i = 1;
        ejwl.b(!basdVar.f().isEmpty(), "Missing RCS Message Id");
        aymo aymoVar = this.v;
        aymoVar.p("sent_by_mms_api_or_lib", false);
        basd.h(aymoVar.f(), "rcs_message_id", basdVar);
        aymoVar.r("http_status_code", 0);
        aymoVar.s("delivered_time", instant.toEpochMilli());
        aymoVar.r("sms_error_code", -1);
        aymoVar.r("raw_status", 0);
        aubk aubkVarB = aubk.b(aublVar.c);
        int iOrdinal = (aubkVarB == null ? aubk.UNKNOWN_STATUS : aubkVarB).ordinal();
        if (iOrdinal == 1) {
            aymoVar.p("is_revocation_supported", z);
            i = 0;
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                aubk aubkVarB2 = aubk.b(aublVar.c);
                throw new IllegalArgumentException(String.format("Unexpected chatApiResult %s for rcsMessageId %s", (aubkVarB2 == null ? aubk.UNKNOWN_STATUS : aubkVarB2).name(), basdVar.b));
            }
            i = !augmVar.c ? 5 : 3;
        }
        aymoVar.r("status", i);
        aubi aubiVarB = aubi.b(aublVar.d);
        aymoVar.r("result_code", (aubiVarB == null ? aubi.UNKNOWN_CAUSE : aubiVarB).v);
        enyw enywVarB = enyw.b(elpgVar.Y);
        aymoVar.r("key_rcs_transport_type", (enywVarB == null ? enyw.UNKNOWN_RCS_TYPE : enywVarB).h);
        if ((augmVar.b & 2) != 0) {
            evrj evrjVar = augmVar.d;
            aymoVar.G(evwz.c(evrjVar == null ? evrj.a : evrjVar));
        }
        if (enxuVar != null) {
            aymoVar.q("rcs_diagnostics", enxuVar.toByteArray());
        }
        aymoVar.r("xsl_bugle_sending_status", febt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_CHATAPI.a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProcessSentMessageAction(axym axymVar, cmqb cmqbVar, MessageIdType messageIdType, Uri uri, int i, int i2, int i3, int i4, String str, Boolean bool) {
        int i5;
        this(axymVar);
        int i6 = i2;
        aymo aymoVar = this.v;
        aymoVar.p("sent_by_mms_api_or_lib", false);
        aymoVar.v("message_id", messageIdType.b());
        aymoVar.t("message_uri", uri);
        aymoVar.r("sub_id", i3);
        if (i == -1) {
            i5 = 0;
        } else {
            i5 = 2;
            if ((!cmqbVar.e.E() && cmqbVar.i.a() > 0) || ((cqey) cmqbVar.f.a()).x()) {
                if (i == 1) {
                    cmqb.a.n("Generic failure");
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            cmqb.a.r("No service, returning message send status AUTO_RETRY");
                        } else if (i != 5) {
                            int i7 = 41;
                            if (i == 17) {
                                if (((eoth) ((aoyf) cmqbVar.k).a.b()).a("bugle.enable_network_error_network_timeout_retry")) {
                                    if (i6 == 332) {
                                        i5 = 1;
                                        i6 = 332;
                                    } else if (i6 == 41) {
                                        i5 = 1;
                                        i6 = 41;
                                    }
                                }
                                ((ekrd) cmqb.a.k().h("com/google/android/apps/messaging/shared/sms/SmsSender", "getStatusFromResult", 487, "SmsSender.java")).I("Sms ResultCode: %d and ErrCode: %d mapped to RetryAction: %d", Integer.valueOf(i), Integer.valueOf(i6), Integer.valueOf(i5));
                            } else if (i != 112) {
                                cmqb.a.n(defpackage.a.g(i, "Unexpected sent intent resultCode = "));
                            } else if (((eoth) ((aoyd) cmqbVar.l).a.b()).a("bugle.enable_network_error_network_timeout_retry_with_sub_error_code")) {
                                if (i6 == 332) {
                                    i5 = 1;
                                    i7 = 332;
                                } else if (i6 == 41) {
                                    i5 = 1;
                                } else {
                                    i7 = i6;
                                }
                                ((ekrd) cmqb.a.k().h("com/google/android/apps/messaging/shared/sms/SmsSender", "getStatusFromResult", 499, "SmsSender.java")).I("Sms ResultCode: %d and ErrCode: %d mapped to RetryAction: %d", Integer.valueOf(i), Integer.valueOf(i7), Integer.valueOf(i5));
                                i6 = i7;
                            } else {
                                cmqb.a.r("RESULT_RIL_NETWORK_ERR: returning message send status AUTO_RETRY");
                            }
                        } else {
                            cmqb.a.n("Message sending limit is exceeded. Either the telephony is applying throttle, or the user declined the premium SMS feature for Bugle.");
                        }
                        i5 = 1;
                    } else {
                        cmqb.a.n("The PDU sent to the SmsManager was null");
                    }
                } else if (((cqey) cmqbVar.f.a()).x()) {
                    cmqb.a.r("Radio is off, returning message send status AUTO_RETRY");
                    i5 = 1;
                } else {
                    cmqb.a.r("Radio is off");
                }
            }
        }
        aymoVar.r("status", i5);
        aymoVar.r("raw_status", 0);
        aymoVar.r("result_code", i);
        aymoVar.r("sms_error_code", i6);
        aymoVar.r("sms_part_count", i4);
        aymoVar.r("key_rcs_transport_type", enyw.NOT_RCS.h);
        aymoVar.r("xsl_bugle_sending_status", febt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_SMS.a());
        if (str != null) {
            aymoVar.v("format", str);
        }
        if (bool != null) {
            aymoVar.p("is_ims", bool.booleanValue());
        }
        aymoVar.r("xms_transport", elpf.TELEPHONY_UNSPECIFIED.h);
    }
}
