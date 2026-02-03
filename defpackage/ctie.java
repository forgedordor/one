package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.startchat.StartChatActivity;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctie implements ctic {
    private static final cqce c = cqce.g("BugleContacts", "StartChatEntryPointImpl");
    public final fcsu a;
    public final fcsu b;

    public ctie(fcsu fcsuVar, eygg eyggVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        eyggVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    @Override // defpackage.ctic
    public final ctid a() {
        return new ctid(this);
    }

    @Override // defpackage.ctic
    public final void b(Context context, efwo efwoVar, ConversationId conversationId, int i, List list, SelfIdentityId selfIdentityId) throws IOException {
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Recipient recipient = (Recipient) it.next();
            alqm alqmVarG = recipient.g();
            alqmVarG.getClass();
            String strA = aqbw.a() ? cssf.a(recipient.x(true)) : recipient.x(true);
            strA.getClass();
            arrayList.add(new ChipData(alqmVarG, strA, recipient.f().k, recipient.b(), true));
        }
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        fcva.aG(arrayList, arrayList2);
        ekrd ekrdVarI = c.i();
        ekrdVarI.X(cqnc.t, conversationId);
        ekrdVarI.X(new ekrz("state", Integer.class, false, false), Integer.valueOf(i));
        ((ekrd) ekrdVarI.h("com/google/android/apps/messaging/startchat/StartChatEntryPointImpl", "internalLaunchStartChatToAddPeople", 179, "StartChatEntryPointImpl.kt")).q("launch start chat to add people");
        ((ajoy) this.a.b()).h(Boolean.valueOf(!((Boolean) ctif.j.e()).booleanValue()));
        Bundle bundle = new Bundle(4);
        int iOrdinal = (((Boolean) ctif.b.e()).booleanValue() ? cueh.c : cueh.b).ordinal();
        if (i == 5) {
            iOrdinal = cueh.d.ordinal();
        } else if (i == 12) {
            iOrdinal = cueh.e.ordinal();
        } else if (i == 14) {
            iOrdinal = cueh.f.ordinal();
        }
        bundle.putInt("selection_mode", iOrdinal);
        bundle.putParcelable("conversation_mapi_id", conversationId);
        bundle.putParcelableArrayList("identities", arrayList2);
        bundle.putParcelable("self_identity_id", selfIdentityId);
        bundle.putInt("contact_picker_source", 2);
        Intent intent = new Intent(context, (Class<?>) StartChatActivity.class);
        intent.putExtras(bundle);
        efyp.c(intent, efwoVar);
        eiid.o(context, intent);
    }
}
