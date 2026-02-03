package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxso extends cqdj {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean k;
    final /* synthetic */ cxsp l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxso(cxsp cxspVar, String str, String str2, boolean z, boolean z2) {
        super("Bugle.Async.Debug.createFakeTelephonyConversations.Duration", null);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.k = z2;
        this.l = cxspVar;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        String str = this.a;
        if (true == TextUtils.isEmpty(str)) {
            str = "5555550000";
        }
        String str2 = str;
        String str3 = this.b;
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "Test msg";
        }
        String str4 = str3;
        cxsp cxspVar = this.l;
        long epochMilli = cxspVar.f.f().toEpochMilli();
        boolean z = this.k;
        ContentValues contentValuesA = cxsp.a(str2, str4, epochMilli, cxspVar.g.e(str2), -1L, false, this.c, z);
        Uri uriInsert = cxspVar.h.getContentResolver().insert(Telephony.Sms.Inbox.CONTENT_URI, contentValuesA);
        cmqf cmqfVar = (cmqf) cxspVar.j.b();
        uriInsert.getClass();
        Object obj = contentValuesA.get("date");
        obj.getClass();
        cmqfVar.m(uriInsert, Instant.ofEpochMilli(((Long) obj).longValue()));
        return null;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        if (this.c || this.k) {
            this.l.k.j("Telephony DB populated. Now syncing...");
        } else {
            this.l.k.j("Notification should be posted soon, ensure notifications are enabled.");
        }
    }
}
