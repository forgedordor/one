package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkgd extends dqwl {
    public bkgd(dqwv dqwvVar) {
        super(dqwvVar);
    }

    @Override // defpackage.dqwl
    public final /* synthetic */ dqqj a(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar) {
        return new bkgc(dqsyVar, cursor, strArr, dqxeVarArr, dqwjVar, dqtmVar, this);
    }

    @Override // defpackage.dqwl
    protected final Map b() {
        String[] strArr = bkgf.a;
        return new HashMap();
    }

    @Override // defpackage.dqwl
    protected final boolean c() {
        return true;
    }

    @Override // defpackage.dqwl
    protected final String[] d() {
        return new String[]{"messages._id", "message_replies.replied_to_message_id", "participants._id", "messages.sender_id", "parts.message_id", "messages._id", "link_preview.message_id", "messages._id"};
    }

    @Override // defpackage.dqwl
    protected final String[] e() {
        return new String[]{"messages", "message_replies", "participants", "messages", "parts", "messages", "link_preview", "messages"};
    }
}
