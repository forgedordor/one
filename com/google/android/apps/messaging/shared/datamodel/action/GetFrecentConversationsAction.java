package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.chooser.ChooserTarget;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.ajsn;
import defpackage.ajso;
import defpackage.axgd;
import defpackage.axgi;
import defpackage.axpb;
import defpackage.aypf;
import defpackage.barn;
import defpackage.bvdi;
import defpackage.cphu;
import defpackage.dqsy;
import defpackage.ecem;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class GetFrecentConversationsAction extends Action<List<ChooserTarget>> {
    public static final Parcelable.Creator<Action<List<ChooserTarget>>> CREATOR = new axpb();
    private final fcsu a;
    private final cphu b;
    private final axgd c;

    /* compiled from: PG */
    public interface a {
        aypf aU();
    }

    public GetFrecentConversationsAction(fcsu fcsuVar, cphu cphuVar, axgd axgdVar) {
        super(elgm.GET_FRECENT_CONVERSATIONS_ACTION);
        this.a = fcsuVar;
        this.b = cphuVar;
        this.c = axgdVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("GetFrecentConversationsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        eieu eieuVarK = eiiy.k("GetFrecentConversationsAction#getConversationsByFrecency");
        try {
            ecem.b();
            dqsy dqsyVar = (dqsy) this.a.b();
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = dqsyVar.h().query("conversation_frecency_view", (String[]) axgi.c.toArray(new String[0]), null, null, null, null, null);
            if (cursorQuery != null) {
                int i = 1;
                while (cursorQuery.moveToNext()) {
                    try {
                        axgd axgdVar = this.c;
                        cphu cphuVar = this.b;
                        ConversationIdType conversationIdTypeB = barn.b(cursorQuery.getString(0));
                        String strD = axgdVar.c.d(cursorQuery.getString(1));
                        int i2 = cursorQuery.getInt(4);
                        Uri uri = Uri.parse(cursorQuery.getString(2));
                        boolean zB = bvdi.b(i2);
                        Context context = axgdVar.b;
                        int dimension = (int) context.getResources().getDimension(R.dimen.contact_icon_view_normal_size);
                        Bitmap bitmapB = cphuVar.b(context, uri, dimension, dimension, 0, !zB);
                        Icon iconCreateWithBitmap = bitmapB != null ? Icon.createWithBitmap(bitmapB) : null;
                        float f = (float) (1.0d / i);
                        Bundle bundle = new Bundle();
                        ConversationId conversationIdA = ((ajsn) axgdVar.d.b()).a(conversationIdTypeB, cursorQuery.getString(5), cursorQuery.getInt(6) > 0);
                        ajso.c(conversationIdA, bundle);
                        bundle.putBoolean("via_deep_link", true);
                        arrayList.add(new ChooserTarget(strD, iconCreateWithBitmap, f, axgdVar.a, bundle));
                        i++;
                    } finally {
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            eieuVarK.close();
            return arrayList;
        } finally {
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.GetFrecentConversations.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public GetFrecentConversationsAction(fcsu fcsuVar, cphu cphuVar, axgd axgdVar, Parcel parcel) {
        super(parcel, elgm.GET_FRECENT_CONVERSATIONS_ACTION);
        this.a = fcsuVar;
        this.b = cphuVar;
        this.c = axgdVar;
    }
}
