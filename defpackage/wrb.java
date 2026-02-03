package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrb {
    public static final vvo a(IncomingDraft.Attachment attachment, vvl vvlVar) {
        attachment.getClass();
        vvlVar.getClass();
        String str = attachment.a;
        doig doigVarA = dohx.a(str);
        if (doigVarA != null) {
            return new vvo(vvlVar, doigVarA, attachment.b, attachment.c, wqz.a);
        }
        throw new IllegalArgumentException("Failed to parse MediaType: ".concat(str));
    }

    public static final vvw b(IncomingDraft incomingDraft, int i, fdat fdatVar) {
        List list = incomingDraft.b;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                fcva.m();
            }
            IncomingDraft.Attachment attachment = (IncomingDraft.Attachment) obj;
            arrayList.add(a(attachment, (vvl) fdatVar.a(Integer.valueOf(i2), attachment)));
            i2 = i3;
        }
        return new vvw(incomingDraft.a, (List) arrayList, incomingDraft.c, incomingDraft.d, (MessageId) null, incomingDraft.f, incomingDraft.e, false, i, incomingDraft.g, 1168);
    }

    public static final vvw c(IncomingDraft incomingDraft, int i) {
        incomingDraft.getClass();
        return b(incomingDraft, i, new fdat() { // from class: wra
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                ((Integer) obj).intValue();
                ((IncomingDraft.Attachment) obj2).getClass();
                return vuc.a();
            }
        });
    }
}
