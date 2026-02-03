package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.Telephony;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnsw implements cnss {
    public Cursor a;
    public Cursor b;
    public cmoa c;
    public cmoa d;
    private final int e;
    private final cmof f;

    public cnsw(Context context, aipo aipoVar, cmof cmofVar, cmqj cmqjVar, String str, String str2, int i) {
        this.e = i;
        this.a = null;
        this.b = null;
        this.f = cmofVar;
        try {
            cqce cqceVar = cnsx.a;
            cqbd cqbdVarD = cqceVar.d();
            cqbdVarD.I("Querying for remote SMS.");
            cqbdVarD.A("smsSelection", str);
            cqbdVarD.r();
            ainv ainvVarB = aipoVar.b("Bugle.Telephony.Query.Sms.Sync.Latency");
            Cursor cursorQuery = context.getContentResolver().query(Telephony.Sms.CONTENT_URI, cmoc.h(cmqjVar), str, null, "date DESC");
            this.a = cursorQuery;
            axie.l(cursorQuery);
            ainvVarB.c();
            if (this.a == null) {
                cqceVar.r("Remote SMS query returned null cursor; need to cancel sync");
                throw new RuntimeException("Null cursor from remote SMS query");
            }
            cqbd cqbdVarD2 = cqceVar.d();
            cqbdVarD2.I("Querying for remote MMS.");
            cqbdVarD2.A("mmsSelection", str2);
            cqbdVarD2.r();
            ainv ainvVarB2 = aipoVar.b("Bugle.Telephony.Query.Mms.Sync.Latency");
            Cursor cursorQuery2 = context.getContentResolver().query(Telephony.Mms.CONTENT_URI, cmny.n(), str2, null, "date DESC");
            this.b = cursorQuery2;
            axie.l(cursorQuery2);
            ainvVarB2.c();
            if (this.b == null) {
                cqceVar.r("Remote MMS query returned null cursor; need to cancel sync");
                throw new RuntimeException("Null cursor from remote MMS query");
            }
            this.c = b();
            this.d = a();
        } catch (SQLiteException e) {
            cqbd cqbdVarB = cnsx.a.b();
            cqbdVarB.I("failed to query remote messages");
            cqbdVarB.s(e);
            throw e;
        }
    }

    public final cmoa a() {
        Cursor cursor = this.b;
        if (cursor == null || !cursor.moveToNext()) {
            return null;
        }
        return cmny.h(this.b, this.e);
    }

    public final cmoa b() {
        Cursor cursor = this.a;
        if (cursor == null || !cursor.moveToNext()) {
            return null;
        }
        cmoc cmocVarA = this.f.a();
        cmocVarA.g(this.a, this.e);
        return cmocVarA;
    }
}
