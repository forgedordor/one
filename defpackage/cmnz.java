package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmnz {
    public static final String[] a = {"_id", "mid", "chset", "ct", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "name"};
    public String b;
    public long c;
    public long d;
    public String e;
    public String f;
    public int g;
    public long h;
    public String i;
    private final Context j;
    private final cqmz k;

    public cmnz(Context context, cqmz cqmzVar) {
        this.j = context;
        this.k = cqmzVar;
    }

    public final Uri a() {
        return Uri.parse("content://mms/part/" + this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.database.Cursor r20, boolean r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmnz.b(android.database.Cursor, boolean):void");
    }

    public final boolean c() {
        return le.p(this.e);
    }

    public final boolean d() {
        return RbmSpecificMessage.CONTENT_TYPE.equals(this.e);
    }

    public final boolean e() {
        return "text/plain".equals(this.e) || "text/html".equals(this.e) || "application/vnd.wap.xhtml+xml".equals(this.e);
    }
}
