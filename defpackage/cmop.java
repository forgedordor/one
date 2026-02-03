package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmop {
    public final fcsu a;
    public final cmum b;
    public final fcsu c;
    public final Context d;
    private final bahv e;
    private final bveg f;
    private final fcsu g;

    public cmop(Context context, fcsu fcsuVar, cmum cmumVar, fcsu fcsuVar2, bahv bahvVar, bveg bvegVar, fcsu fcsuVar3) {
        this.a = fcsuVar;
        this.b = cmumVar;
        this.c = fcsuVar2;
        this.d = context;
        this.e = bahvVar;
        this.f = bvegVar;
        this.g = fcsuVar3;
    }

    public static String c(cmnz cmnzVar) {
        String str = cmnzVar.f;
        return (str == null || str.length() <= 10000) ? str : str.substring(0, 10000);
    }

    public final MessageCoreData a(cmny cmnyVar, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, int i, bvdz bvdzVar, long j) {
        cqaz.l(cmnyVar);
        int i2 = i < 100 ? cmnyVar.t : cmnyVar.u;
        bveg bvegVar = this.f;
        String str2 = cmnyVar.a;
        boolean zJ = cmnyVar.j();
        String str3 = cmnyVar.n;
        String str4 = cmnyVar.o;
        int i3 = cmnyVar.j;
        String str5 = cmnyVar.d;
        boolean z = cmnyVar.m;
        boolean z2 = cmnyVar.l;
        if (!cmnyVar.y) {
            cmnyVar.y = true;
            Iterator it = cmnyVar.x.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                j2 += ((cmnz) it.next()).h;
            }
            if (cmnyVar.f <= 0) {
                long length = cmnyVar.d != null ? r2.getBytes().length : 0L;
                cmnyVar.f = length;
                cmnyVar.f = length + j2;
            }
        }
        MessageCoreData messageCoreDataH = bvegVar.h(str2, str, selfIdentityId, conversationIdType, zJ, i, str3, str4, i3, str5, z, z2, cmnyVar.f, i2, cmnyVar.p, cmnyVar.h, cmnyVar.g, cmnyVar.v, bvdzVar, j);
        d(messageCoreDataH, cmnyVar);
        return messageCoreDataH;
    }

    public final MessagePartCoreData b(cmnz cmnzVar) {
        if (cmnzVar.e()) {
            return this.e.i(c(cmnzVar));
        }
        if (!cmnzVar.c()) {
            return null;
        }
        bahv bahvVar = this.e;
        bahx bahxVarD = bahy.D();
        bacm bacmVar = (bacm) bahxVarD;
        bacmVar.c = cmnzVar.e;
        bacmVar.d = cmnzVar.a();
        bahxVarD.p(-1);
        bahxVarD.i(-1);
        bahxVarD.n(elha.UNKNOWN);
        MessagePartData messagePartDataC = bahvVar.c(bahxVarD.q());
        String str = cmnzVar.i;
        if (str != null) {
            messagePartDataC.aA(Uri.fromFile(new File(str)));
            if (le.i(cmnzVar.e)) {
                messagePartDataC.aw(cmnzVar.i);
                messagePartDataC.aH(cmnzVar.h);
            }
        }
        return messagePartDataC;
    }

    public final void d(MessageCoreData messageCoreData, cmny cmnyVar) {
        Iterator it = cmnyVar.x.iterator();
        while (it.hasNext()) {
            final MessagePartCoreData messagePartCoreDataB = b((cmnz) it.next());
            if (messagePartCoreDataB != null) {
                ((awlc) this.g.b()).d(new Consumer() { // from class: cmon
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((cnos) obj).c(messagePartCoreDataB);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                messageCoreData.aM(messagePartCoreDataB);
            }
        }
        if (((MessageData) messageCoreData).i.iterator().hasNext()) {
            return;
        }
        messageCoreData.aM(this.e.i(""));
    }
}
