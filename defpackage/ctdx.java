package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctdx implements ctdp, ctdl {
    public static final cqce a = cqce.g("BugleDataModel", "XmsViaTelephonySender");
    public final Context b;
    public final cmuq c;
    public final cmqj d;
    public final ceae e;
    public final cmos f;
    public final dzqp g;
    public final ctdq h;
    private final eosc i;
    private final eosc j;
    private final eosc k;
    private final ctdk l;
    private final fcsu m;

    public ctdx(Context context, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, cmuq cmuqVar, cmqj cmqjVar, ceae ceaeVar, cmos cmosVar, dzqp dzqpVar, ctdq ctdqVar, ctdk ctdkVar, fcsu fcsuVar) {
        this.b = context;
        this.j = eoscVar;
        this.i = eoscVar2;
        this.k = eoscVar3;
        this.c = cmuqVar;
        this.d = cmqjVar;
        this.e = ceaeVar;
        this.f = cmosVar;
        this.g = dzqpVar;
        this.h = ctdqVar;
        this.l = ctdkVar;
        this.m = fcsuVar;
    }

    public static chvf c() {
        return chvf.j(2, 0).a();
    }

    @Override // defpackage.ctdl
    public final eiju a(ctdn ctdnVar) {
        Optional optionalEmpty;
        ctdi ctdiVar = (ctdi) ctdnVar;
        final MessageCoreData messageCoreData = ctdiVar.a;
        ejwl.a(messageCoreData.cO());
        ctdk ctdkVar = this.l;
        cqjy cqjyVar = ctdkVar.d;
        final long jT = messageCoreData.t();
        boolean z = cqjyVar.k;
        final int i = ctdiVar.c;
        final Uri uri = ctdiVar.b;
        if (z) {
            cqbd cqbdVarE = ctdk.a.e();
            cqbdVarE.I("emulate MMS send failure for debugging.");
            cqbdVarE.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            cqbdVarE.w(jT);
            cqbdVarE.r();
            chve chveVarJ = chvf.j(1, 0);
            ((chue) chveVarJ).c = uri;
            chveVarJ.b(8);
            optionalEmpty = Optional.of(chveVarJ.a());
        } else if (!ctdkVar.b.a(i).p()) {
            cqbd cqbdVarE2 = ctdk.a.e();
            cqbdVarE2.I("MMS is not enabled by carrier.");
            cqbdVarE2.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            cqbdVarE2.w(jT);
            cqbdVarE2.r();
            chve chveVarJ2 = chvf.j(3, 0);
            ((chue) chveVarJ2).c = uri;
            chveVarJ2.b(7);
            optionalEmpty = Optional.of(chveVarJ2.a());
        } else if (ctdkVar.c.b()) {
            optionalEmpty = Optional.empty();
        } else {
            cqbd cqbdVarE3 = ctdk.a.e();
            cqbdVarE3.I("Outgoing MMS is not enabled by Knox policy.");
            cqbdVarE3.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            cqbdVarE3.w(jT);
            cqbdVarE3.r();
            chve chveVarJ3 = chvf.j(3, 0);
            ((chue) chveVarJ3).c = uri;
            chveVarJ3.b(7);
            optionalEmpty = Optional.of(chveVarJ3.a());
        }
        if (!optionalEmpty.isPresent()) {
            return eijx.g(new Callable() { // from class: ctdr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.a.d(messageCoreData));
                }
            }, this.i).h(new ejvr() { // from class: ctds
                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:169:0x0361  */
                /* JADX WARN: Removed duplicated region for block: B:172:0x0370 A[Catch: lj -> 0x0402, DONT_GENERATE, TRY_ENTER, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:175:0x0376 A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:180:0x0387 A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:181:0x038a A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:182:0x0391 A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:183:0x0398 A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:184:0x039f A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:185:0x03a5 A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:186:0x03ab A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:187:0x03b1 A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:188:0x03b7 A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:190:0x03cb A[Catch: lj -> 0x0402, TryCatch #2 {lj -> 0x0402, blocks: (B:202:0x03f6, B:203:0x03f9, B:48:0x0123, B:50:0x012c, B:70:0x01b3, B:72:0x01b8, B:73:0x01bb, B:74:0x01bc, B:179:0x0384, B:180:0x0387, B:191:0x03d1, B:192:0x03e2, B:181:0x038a, B:210:0x0408, B:182:0x0391, B:183:0x0398, B:184:0x039f, B:185:0x03a5, B:186:0x03ab, B:187:0x03b1, B:188:0x03b7, B:189:0x03ca, B:190:0x03cb, B:79:0x01d0, B:165:0x0358, B:175:0x0376, B:177:0x037a, B:172:0x0370, B:194:0x03e5, B:195:0x03e8, B:196:0x03e9, B:197:0x03f0, B:206:0x03fe, B:53:0x015a, B:55:0x0160, B:57:0x016b, B:65:0x0180, B:67:0x018d, B:68:0x01a1, B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:233:0x0064, inners: #14, #16 }] */
                /* JADX WARN: Removed duplicated region for block: B:204:0x03fa  */
                /* JADX WARN: Removed duplicated region for block: B:234:0x030b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:246:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:290:? A[Catch: all -> 0x035e, SYNTHETIC, TryCatch #16 {all -> 0x035e, blocks: (B:81:0x01fc, B:84:0x0204, B:85:0x020b, B:87:0x0211, B:89:0x021d, B:92:0x0229, B:93:0x0230, B:95:0x0239, B:96:0x023c, B:98:0x0243, B:99:0x0246, B:101:0x024d, B:102:0x0250, B:104:0x0257, B:106:0x0261, B:107:0x0264, B:109:0x026b, B:110:0x026e, B:112:0x029a, B:114:0x02a0, B:116:0x02a6, B:118:0x02b3, B:120:0x02bb, B:131:0x02e3, B:159:0x0337, B:161:0x0341, B:134:0x02e8, B:149:0x030b, B:153:0x0313, B:152:0x0310, B:154:0x0314, B:156:0x0320, B:158:0x0327, B:162:0x034c, B:163:0x0353, B:170:0x0363), top: B:246:0x01fc, outer: #2, inners: #3, #9 }] */
                @Override // defpackage.ejvr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r26) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 1312
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ctds.apply(java.lang.Object):java.lang.Object");
                }
            }, this.j).h(new ejvr() { // from class: ctdt
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ((chvf) obj).l(bvec.TELEPHONY_UNSPECIFIED);
                }
            }, this.k);
        }
        return eiju.g(eork.i(((chvf) optionalEmpty.get()).l(bvec.TELEPHONY_UNSPECIFIED)));
    }

    @Override // defpackage.ctdp
    public final eiju b(final ctdo ctdoVar) {
        final MessageCoreData messageCoreData = ((ctdj) ctdoVar).a;
        ejwl.a(messageCoreData.dg());
        return eijx.g(new Callable() { // from class: ctdu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.d(messageCoreData));
            }
        }, this.i).h(new ejvr() { // from class: ctdv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String strB;
                boolean zBooleanValue;
                if (!((Boolean) obj).booleanValue()) {
                    return ctdx.c();
                }
                MessageCoreData messageCoreData2 = messageCoreData;
                ctdo ctdoVar2 = ctdoVar;
                ctdx ctdxVar = this.a;
                if (!((Boolean) cgwx.a.e()).booleanValue() || messageCoreData2.R() == null) {
                    ctdq ctdqVar = ctdxVar.h;
                    MessagePartCoreData messagePartCoreDataH = messageCoreData2.H();
                    strB = messagePartCoreDataH == null ? (!ctdqVar.b.a() || ejwk.c(messageCoreData2.az())) ? ejwk.b(messageCoreData2.as()) : ejwk.b(messageCoreData2.az()) : messageCoreData2.cq() ? ctdqVar.a.a(messagePartCoreDataH) : messageCoreData2.ap();
                } else {
                    strB = ((Boolean) cgwx.b.e()).booleanValue() ? ejwk.b(messageCoreData2.as()) : messageCoreData2.aE();
                }
                String str = strB;
                ctdj ctdjVar = (ctdj) ctdoVar2;
                alqm alqmVar = ctdjVar.d;
                if (((Boolean) cdak.a.e()).booleanValue()) {
                    Context context = ctdxVar.b;
                    if (crad.c()) {
                        cczv cczvVar = alvx.a;
                        if ("119".equals(alqmVar.k(((Boolean) new ejxr() { // from class: alvo
                            @Override // defpackage.ejxr
                            public final Object get() {
                                return Boolean.valueOf(eotp.a("bugle.enable_mi_in_national_emergency_util", "bugle"));
                            }
                        }.get()).booleanValue()))) {
                            Intent intent = new Intent("com.lge.mms.action.MMS_119APP_REQUEST");
                            intent.putExtra("startFlag", "003");
                            context.sendBroadcast(intent);
                        }
                    }
                }
                int i = ctdjVar.c;
                cmqj cmqjVar = ctdxVar.d;
                Uri uri = ctdjVar.b;
                String str2 = ctdjVar.e;
                cmuq cmuqVar = ctdxVar.c;
                cmum cmumVar = cmuqVar.d;
                if (cmumVar.a(i).t()) {
                    boolean zS = cmumVar.a(i).s();
                    zBooleanValue = ((Boolean) cmuqVar.b(i).f().orElse(Boolean.valueOf(zS))).booleanValue();
                    ekrw ekrwVarE = cmuq.a.e();
                    ekrwVarE.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/sms/config/MmsSmsPreferenceUtils", "isDeliveryReportRequired", 77, "MmsSmsPreferenceUtils.java")).H("SMS delivery reports pref: %b (default: %b)", zBooleanValue, zS);
                } else {
                    ekrw ekrwVarE2 = cmuq.a.e();
                    ekrwVarE2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/sms/config/MmsSmsPreferenceUtils", "isDeliveryReportRequired", 69, "MmsSmsPreferenceUtils.java")).q("SMS delivery reports disabled by subscription");
                    zBooleanValue = false;
                }
                return cmqjVar.r(alqmVar, str, uri, i, ejwk.b(str2), zBooleanValue, messageCoreData2.C(), messageCoreData2.t());
            }
        }, this.j).h(new ejvr() { // from class: ctdw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((chvf) obj).l(bvec.TELEPHONY_UNSPECIFIED);
            }
        }, this.k);
    }

    public final boolean d(MessageCoreData messageCoreData) {
        bvec bvecVar = bvec.TELEPHONY_UNSPECIFIED;
        messageCoreData.ca(bvecVar);
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("updateXmsTransport");
        brduVar.al();
        brduVar.V(bvecVar);
        brduVar.ap("updateXmsTransport");
        boolean zV = ((baxe) this.m.b()).V(messageCoreData.A(), messageCoreData.C(), brduVar);
        if (!zV) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Unable to update XmsTransport when trying to send the message via Telephony");
            cqbdVarE.A("messageId", messageCoreData.C());
            cqbdVarE.r();
        }
        return zV;
    }
}
