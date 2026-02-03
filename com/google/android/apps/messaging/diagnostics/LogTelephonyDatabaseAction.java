package com.google.android.apps.messaging.diagnostics;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aazp;
import defpackage.aazr;
import defpackage.cbpu;
import defpackage.cdzz;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejxk;
import defpackage.elgm;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LogTelephonyDatabaseAction extends Action<Uri> implements Parcelable {
    private final Context c;
    private static final cqce a = cqce.g("Bugle", "LogTelephonyDatabaseAction");
    private static final String[] b = {"_id", "date", "message_count", "recipient_ids", "snippet", "snippet_cs", "read", "error", "has_attachment"};
    public static final Parcelable.Creator<Action<Uri>> CREATOR = new aazp();

    /* compiled from: PG */
    public interface a {
        aazr H();
    }

    public LogTelephonyDatabaseAction(Context context) {
        super(elgm.LOG_TELEPHONY_DATABASE_ACTION);
        this.c = context;
    }

    private static void h(String str, String str2, Uri uri, String str3, Context context, PrintWriter printWriter) {
        printWriter.printf("CREATE TABLE %s (%s);\n", str, str2);
        ArrayList arrayList = new ArrayList();
        for (String str4 : ejxk.b(',').g(str2)) {
            arrayList.add(str4.substring(0, str4.indexOf(" ")));
        }
        Cursor cursorC = cdzz.c(context.getContentResolver(), uri.buildUpon().appendQueryParameter("simple", "true").build(), null, null, null, null);
        while (true) {
            try {
                cursorC.getClass();
                if (!cursorC.moveToNext()) {
                    cursorC.close();
                    return;
                }
                printWriter.printf("INSERT INTO %s (", str);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                String[] columnNames = cursorC.getColumnNames();
                boolean z = false;
                for (int i = 0; i < columnNames.length; i++) {
                    if (arrayList.contains(columnNames[i])) {
                        if (z) {
                            sb.append(",");
                            sb2.append(",");
                        }
                        sb.append(columnNames[i]);
                        String string = cursorC.isNull(i) ? "" : cursorC.getString(i);
                        if (TextUtils.equals(str3, columnNames[i])) {
                            string = "redacted";
                        }
                        sb2.append(DatabaseUtils.sqlEscapeString(string));
                        z = true;
                    }
                }
                printWriter.printf("%s) VALUES(%s);\n", sb.toString(), sb2.toString());
            } finally {
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("LogTelephonyDatabaseAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() throws Throwable {
        PrintWriter printWriter;
        Throwable th;
        Context context = this.c;
        try {
            printWriter = new PrintWriter(new FileOutputStream(cbpu.e(context, "mmssms.db.txt")));
        } catch (Exception e) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Exception writing database file:");
            cqbdVarE.I("mmssms.db.txt");
            cqbdVarE.s(e);
        }
        try {
            cqce cqceVar = a;
            cqceVar.m("Dump of canonical_addresses table.");
            cqceVar.m("**********************************");
            Cursor cursorC = cdzz.c(context.getContentResolver(), Uri.parse("content://mms-sms/canonical-addresses"), null, null, null, null);
            int i = 1;
            int i2 = 0;
            if (cursorC != null) {
                while (cursorC.moveToNext()) {
                    try {
                        long j = cursorC.getLong(0);
                        String string = cursorC.getString(1);
                        cqbd cqbdVarA = cqceVar.a();
                        cqbdVarA.D("id", String.valueOf(j));
                        cqbdVarA.D("number", string);
                        cqbdVarA.r();
                    } finally {
                        cursorC.close();
                    }
                }
                cursorC.close();
            } else {
                cqceVar.r("null Cursor in content://mms-sms/canonical-addresses");
            }
            try {
                h("canonical_addresses", "_id INTEGER PRIMARY KEY AUTOINCREMENT,address TEXT", Uri.parse("content://mms-sms/canonical-addresses"), null, context, printWriter);
                Context context2 = this.c;
                cqce cqceVar2 = a;
                cqceVar2.m("Dump of threads table.");
                cqceVar2.m("**********************");
                cursorC = cdzz.c(context2.getContentResolver(), Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build(), b, null, null, "date ASC");
                while (true) {
                    try {
                        cursorC.getClass();
                        if (!cursorC.moveToNext()) {
                            break;
                        }
                        long j2 = cursorC.getLong(i2);
                        long j3 = cursorC.getLong(i);
                        int i3 = cursorC.getInt(2);
                        int i4 = cursorC.getInt(6);
                        String string2 = cursorC.getString(3);
                        int i5 = cursorC.getInt(7);
                        int i6 = cursorC.getInt(8);
                        cqbd cqbdVarA2 = cqceVar2.a();
                        cqce cqceVar3 = cqceVar2;
                        cqbdVarA2.D("threadId", String.valueOf(j2));
                        cqbdVarA2.D("date", String.valueOf(j3));
                        cqbdVarA2.D("message_count", String.valueOf(i3));
                        cqbdVarA2.D("snippet", cursorC.getString(4));
                        cqbdVarA2.D("read", String.valueOf(i4));
                        cqbdVarA2.D("error", String.valueOf(i5));
                        cqbdVarA2.D("has_attachment", String.valueOf(i6));
                        cqbdVarA2.D("recipient_ids", string2);
                        cqbdVarA2.r();
                        cqceVar2 = cqceVar3;
                        i = 1;
                        i2 = 0;
                    } finally {
                    }
                }
                cursorC.close();
                h("threads", "_id INTEGER PRIMARY KEY AUTOINCREMENT,date INTEGER DEFAULT 0,message_count INTEGER DEFAULT 0,recipient_ids TEXT,snippet TEXT,snippet_cs INTEGER DEFAULT 0,read INTEGER DEFAULT 1,archived INTEGER DEFAULT 0,type INTEGER DEFAULT 0,error INTEGER DEFAULT 0,has_attachment INTEGER DEFAULT 0", Telephony.Threads.CONTENT_URI, "snippet", context2, printWriter);
                Context context3 = this.c;
                h("sms", "_id INTEGER PRIMARY KEY,thread_id INTEGER,address TEXT,person INTEGER,date INTEGER,date_sent INTEGER DEFAULT 0,protocol INTEGER,read INTEGER DEFAULT 0,status INTEGER DEFAULT -1,type INTEGER,reply_path_present INTEGER,subject TEXT,body TEXT,service_center TEXT,locked INTEGER DEFAULT 0,sub_id INTEGER DEFAULT -1,error_code INTEGER DEFAULT 0,creator TEXT,seen INTEGER DEFAULT 0", Telephony.Sms.CONTENT_URI, null, context3, printWriter);
                h("pdu", "_id INTEGER PRIMARY KEY AUTOINCREMENT,thread_id INTEGER,date INTEGER,date_sent INTEGER DEFAULT 0,msg_box INTEGER,read INTEGER DEFAULT 0,m_id TEXT,sub TEXT,sub_cs INTEGER,ct_t TEXT,ct_l TEXT,exp INTEGER,m_cls TEXT,m_type INTEGER,v INTEGER,m_size INTEGER,pri INTEGER,rr INTEGER,rpt_a INTEGER,resp_st INTEGER,st INTEGER,tr_id TEXT,retr_st INTEGER,retr_txt TEXT,retr_txt_cs INTEGER,read_status INTEGER,ct_cls INTEGER,resp_txt TEXT,d_tm INTEGER,d_rpt INTEGER,locked INTEGER DEFAULT 0,sub_id INTEGER DEFAULT -1, seen INTEGER DEFAULT 0,creator TEXT,text_only INTEGER DEFAULT 0", Telephony.Mms.CONTENT_URI, null, context3, printWriter);
                h("part", "_id INTEGER PRIMARY KEY AUTOINCREMENT,mid INTEGER,seq INTEGER DEFAULT 0,ct TEXT,name TEXT,chset INTEGER,cd TEXT,fn TEXT,cid TEXT,cl TEXT,ctt_s INTEGER,ctt_t TEXT,_data TEXT,text TEXT", Uri.parse("content://mms/part"), null, context3, printWriter);
                printWriter.close();
                return cbpu.d(this.c, "mmssms.db.txt");
            } catch (Throwable th2) {
                th = th2;
                printWriter = printWriter;
                th = th;
                try {
                    printWriter.close();
                    throw th;
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            printWriter.close();
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.LogTelephonyDatabase.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public LogTelephonyDatabaseAction(Context context, Parcel parcel) {
        super(parcel, elgm.LOG_TELEPHONY_DATABASE_ACTION);
        this.c = context;
    }
}
