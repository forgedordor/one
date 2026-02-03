package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbfk {
    private static final cqce a = cqce.g("Bugle", "AttachmentUtils");
    private final Context b;
    private final cqmp c;
    private final cqmz d;
    private final cmum e;
    private final cqxl f;
    private int g = -1;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;

    public bbfk(Context context, cqmp cqmpVar, cqmz cqmzVar, cmum cmumVar, cqxl cqxlVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = context;
        this.c = cqmpVar;
        this.d = cqmzVar;
        this.e = cmumVar;
        this.f = cqxlVar;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
    }

    private final int e(int i) {
        int i2 = this.g;
        if (i2 != -1) {
            return i2;
        }
        int iB = this.c.b(i);
        this.g = iB;
        return iB;
    }

    private static boolean f(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.aX()) {
            return (((Boolean) cgwx.a.e()).booleanValue() && messagePartCoreData.bi()) ? false : true;
        }
        return false;
    }

    public final long a(Context context, MessagePartCoreData messagePartCoreData, long j) {
        cqaz.l(context);
        cqaz.l(messagePartCoreData);
        boolean z = true;
        if (!le.f(messagePartCoreData.R()) && !le.z(messagePartCoreData.R())) {
            z = false;
        }
        cqaz.k(z);
        Uri uriT = messagePartCoreData.t();
        if (uriT == null) {
            return j;
        }
        cqwg cqwgVar = new cqwg(context);
        try {
            try {
                cqwgVar.c(uriT);
                j = cqwgVar.d(j);
            } catch (IOException e) {
                cqbd cqbdVarC = a.c();
                cqbdVarC.I("Error extracting duration from");
                cqbdVarC.I(uriT);
                cqbdVarC.s(e);
            }
            return j;
        } finally {
            cqwgVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r23, int r24, android.net.Uri r25, long r26) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbfk.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, android.net.Uri, long):java.util.List");
    }

    final boolean c(MessagePartCoreData messagePartCoreData, long j, boolean z) {
        Uri uriT = messagePartCoreData.t();
        if (messagePartCoreData.bp()) {
            Uri uriT2 = messagePartCoreData.t();
            if (((Boolean) bxmw.a.e()).booleanValue() && z && uriT2 != null && this.d.a(uriT2) > ((Long) bxmw.d.e()).longValue()) {
                return true;
            }
            if (messagePartCoreData.w() != null && messagePartCoreData.p() > j) {
                return true;
            }
            if (uriT != null && this.d.a(uriT) > j) {
                return true;
            }
        }
        return false;
    }

    public final void d(MessageCoreData messageCoreData, Uri uri, long j, List list) {
        boolean z;
        Iterator it = list.iterator();
        boolean z2 = false;
        boolean z3 = false;
        loop0: while (true) {
            z = z3;
            while (it.hasNext()) {
                bvdt bvdtVarH = ((MessagePartCoreData) it.next()).H();
                if (bvdtVarH.a()) {
                    if (bvdtVarH == bvdt.TOO_LARGE) {
                        break;
                    } else {
                        z3 = true;
                    }
                }
            }
            z3 = true;
        }
        Iterator it2 = messageCoreData.M().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((MessagePartCoreData) it2.next()).w() != null) {
                z2 = true;
                break;
            }
        }
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        if (!((Boolean) cgwx.a.e()).booleanValue() || messageCoreData.R() == null) {
            messageCoreData.ce(conversationIdTypeA, uri, j);
        }
        if (!z3) {
            if (z2) {
                messageCoreData.bj(j);
            }
        } else if (z) {
            messageCoreData.bm(j);
        } else {
            messageCoreData.bc(j);
        }
    }
}
