package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czeq {
    private static final cqce a = cqce.g("Bugle", "MessagePartAttachmentLoggingHelper");

    public static emop a(MessagePartCoreData messagePartCoreData) {
        return b(messagePartCoreData, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.emop b(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData r13, defpackage.czen r14) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czeq.b(com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, czen):emop");
    }

    private static empq c(MessagePartCoreData messagePartCoreData) {
        empq empqVar = (empq) emqj.a.createBuilder();
        int iC = messagePartCoreData.c();
        empqVar.copyOnWrite();
        emqj emqjVar = (emqj) empqVar.instance;
        emqjVar.b |= 1;
        emqjVar.e = iC;
        int iB = messagePartCoreData.b();
        empqVar.copyOnWrite();
        emqj emqjVar2 = (emqj) empqVar.instance;
        emqjVar2.b |= 2;
        emqjVar2.f = iB;
        String strR = messagePartCoreData.R();
        if (strR != null) {
            empqVar.copyOnWrite();
            emqj emqjVar3 = (emqj) empqVar.instance;
            emqjVar3.b |= 8;
            emqjVar3.g = strR;
        }
        czel.b(messagePartCoreData.t(), empqVar);
        return empqVar;
    }

    private static void d(MessagePartCoreData messagePartCoreData, emoo emooVar) {
        long jP = messagePartCoreData.p();
        String strR = messagePartCoreData.R();
        int i = czel.c;
        empf empfVar = (empf) empg.a.createBuilder();
        if (jP > 0) {
            if (!((Boolean) czel.a.e()).booleanValue() && jP > 2147483647L) {
                throw new IllegalArgumentException("Invalid attachment size. Size (" + jP + ") is greater than Integer.MAX_VALUE");
            }
            long jA = jP < 7500 ? 5000L : jP < 2000000 ? czel.a(jP, 10000) : jP < 10000000 ? czel.a(jP, 100000) : czel.a(jP, 1000000);
            empfVar.copyOnWrite();
            empg empgVar = (empg) empfVar.instance;
            empgVar.b |= 1;
            empgVar.c = jA;
        }
        if (strR != null) {
            empfVar.copyOnWrite();
            empg empgVar2 = (empg) empfVar.instance;
            empgVar2.b |= 2;
            empgVar2.d = strR;
        }
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        empg empgVar3 = (empg) empfVar.build();
        emop emopVar2 = emop.a;
        empgVar3.getClass();
        emopVar.f = empgVar3;
        emopVar.e = 208;
    }

    private static void e(MessagePartCoreData messagePartCoreData, emoo emooVar) {
        if (messagePartCoreData.bk() || messagePartCoreData.bo()) {
            czel.e(emooVar);
            return;
        }
        if (messagePartCoreData.bw()) {
            h(emooVar);
            return;
        }
        if (messagePartCoreData.bj()) {
            if (messagePartCoreData.bh()) {
                g(messagePartCoreData, emooVar);
                return;
            } else {
                f(messagePartCoreData, emooVar);
                return;
            }
        }
        if (messagePartCoreData.bx()) {
            f(messagePartCoreData, emooVar);
        } else if (messagePartCoreData.bg()) {
            d(messagePartCoreData, emooVar);
        } else {
            a.n("Unable to convert part ".concat(String.valueOf(String.valueOf(messagePartCoreData))));
        }
    }

    private static void f(MessagePartCoreData messagePartCoreData, emoo emooVar) {
        empq empqVarC = c(messagePartCoreData);
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emqj emqjVar = (emqj) empqVarC.build();
        emop emopVar2 = emop.a;
        emqjVar.getClass();
        emopVar.f = emqjVar;
        emopVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    private static void g(MessagePartCoreData messagePartCoreData, emoo emooVar) {
        empq empqVarC = c(messagePartCoreData);
        int i = czel.c;
        emqa emqaVar = emqa.a;
        empqVarC.copyOnWrite();
        emqj emqjVar = (emqj) empqVarC.instance;
        emqj emqjVar2 = emqj.a;
        emqaVar.getClass();
        emqjVar.d = emqaVar;
        emqjVar.c = 104;
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emqj emqjVar3 = (emqj) empqVarC.build();
        emop emopVar2 = emop.a;
        emqjVar3.getClass();
        emopVar.f = emqjVar3;
        emopVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    private static void h(emoo emooVar) {
        int i = czel.c;
        emos emosVar = (emos) emou.a.createBuilder();
        emosVar.copyOnWrite();
        emou emouVar = (emou) emosVar.instance;
        emouVar.c = 0;
        emouVar.b |= 4;
        emou emouVar2 = (emou) emosVar.build();
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        emouVar2.getClass();
        emopVar.f = emouVar2;
        emopVar.e = 206;
    }
}
