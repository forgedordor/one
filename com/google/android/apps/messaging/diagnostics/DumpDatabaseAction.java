package com.google.android.apps.messaging.diagnostics;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aazk;
import defpackage.aazm;
import defpackage.aazn;
import defpackage.apru;
import defpackage.cbpu;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cqjo;
import defpackage.cqjy;
import defpackage.dqom;
import defpackage.dqpo;
import defpackage.dqsy;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ekrg;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DumpDatabaseAction extends Action<Uri> implements Parcelable {
    public final aazm a;
    private final Context c;
    private final fcsu d;
    private final Map e;
    private final boolean f;
    private static final cqce b = cqce.g("BugleDataModel", "DumpDatabaseAction");
    public static final Parcelable.Creator<Action<Uri>> CREATOR = new aazk();

    /* compiled from: PG */
    public interface a {
        aazn G();
    }

    public DumpDatabaseAction(Context context, fcsu fcsuVar, Map map, Parcel parcel) {
        super(parcel, elgm.DUMP_DATABASE_ACTION);
        this.c = context;
        this.d = fcsuVar;
        this.e = map;
        if (!apru.a()) {
            this.f = parcel.readBoolean();
            this.a = aazm.REDACTED;
            return;
        }
        String string = parcel.readString();
        string.getClass();
        aazm aazmVar = aazm.REDACTED;
        aazm aazmVar2 = (aazm) Enum.valueOf(aazm.class, string);
        this.a = aazmVar2;
        this.f = aazmVar2 != aazm.NOT_REDACTED;
    }

    private final File h(Context context, String str) throws Throwable {
        int i;
        BufferedOutputStream bufferedOutputStream;
        File databasePath = context.getDatabasePath("bugle_db".concat(str));
        long length = 0;
        if (databasePath.exists() && databasePath.isFile()) {
            length = databasePath.length();
        }
        boolean z = this.f;
        StringBuilder sb = new StringBuilder("db_copy");
        sb.append(true != z ? "" : "_redacted");
        sb.append(str);
        File fileE = cbpu.e(context, sb.toString());
        int i2 = 0;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileE));
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(databasePath));
                    try {
                        byte[] bArr = new byte[16384];
                        i = 0;
                        while (true) {
                            try {
                                int i3 = bufferedInputStream.read(bArr);
                                if (i3 <= 0) {
                                    try {
                                        break;
                                    } catch (Throwable th) {
                                        th = th;
                                        i2 = i;
                                        try {
                                            bufferedOutputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                                bufferedOutputStream.write(bArr, 0, i3);
                                i += i3;
                            } catch (Throwable th3) {
                                th = th3;
                                i2 = i;
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                }
                                throw th;
                            }
                        }
                        bufferedInputStream.close();
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            bufferedOutputStream.close();
        } catch (IOException e2) {
            e = e2;
            i2 = i;
            cqbd cqbdVarE = b.e();
            cqbdVarE.I("Exception copying database file:");
            cqbdVarE.I("bugle_db");
            cqbdVarE.v(str);
            cqbdVarE.v("; destination may not be complete.");
            cqbdVarE.s(e);
            i = i2;
            ekrg ekrgVar = cqjy.a;
            cqjo.a(fileE);
            cqbd cqbdVarC = b.c();
            cqbdVarC.I("Dump complete.");
            cqbdVarC.z("originalSize", length);
            cqbdVarC.y("copy size", i);
            cqbdVarC.r();
            return fileE;
        } catch (Throwable th8) {
            th = th8;
            i2 = i;
            ekrg ekrgVar2 = cqjy.a;
            cqjo.a(fileE);
            cqbd cqbdVarC2 = b.c();
            cqbdVarC2.I("Dump complete.");
            cqbdVarC2.z("originalSize", length);
            cqbdVarC2.y("copy size", i2);
            cqbdVarC2.r();
            throw th;
        }
        ekrg ekrgVar3 = cqjy.a;
        cqjo.a(fileE);
        cqbd cqbdVarC3 = b.c();
        cqbdVarC3.I("Dump complete.");
        cqbdVarC3.z("originalSize", length);
        cqbdVarC3.y("copy size", i);
        cqbdVarC3.r();
        return fileE;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("DumpDatabaseAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() throws Throwable {
        Cursor cursorE = ((dqsy) this.d.b()).e("pragma wal_checkpoint(TRUNCATE)", null);
        try {
            cursorE.moveToFirst();
            cqbd cqbdVarC = b.c();
            cqbdVarC.B("checkpointed", cursorE.getLong(0) == 0);
            cqbdVarC.z("pages written", cursorE.getLong(2));
            cqbdVarC.r();
            if (cursorE != null) {
                cursorE.close();
            }
            Context context = this.c;
            File fileH = h(context, "");
            h(context, "-wal");
            if (this.f) {
                SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(fileH.getAbsolutePath(), null, 0);
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseOpenDatabase.rawQuery("PRAGMA secure_delete=1", null);
                    try {
                        if (!cursorRawQuery.moveToFirst()) {
                            Toast.makeText(context, "unable to set secure_delete -- failing", 1).show();
                        }
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        String str = ((dqom) ((dqsy) this.d.b()).j()).b;
                        for (Map.Entry entry : this.e.entrySet()) {
                            String str2 = (String) entry.getKey();
                            if (str2.startsWith(defpackage.a.x(str, "+"))) {
                                String strSubstring = str2.substring(str2.indexOf("+") + 1);
                                if (strSubstring.equals("sqlite_master")) {
                                    continue;
                                } else {
                                    String str3 = (String) DesugarArrays.stream((dqpo[]) entry.getValue()).filter(new Predicate() { // from class: aazg
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo538negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            dqpo dqpoVar = (dqpo) obj;
                                            Parcelable.Creator<Action<Uri>> creator = DumpDatabaseAction.CREATOR;
                                            return (((dqoh) dqpoVar.a).e || dqpoVar.g()) ? false : true;
                                        }
                                    }).filter(new Predicate() { // from class: aazh
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo538negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            Boolean boolValueOf;
                                            dqpo dqpoVar = (dqpo) obj;
                                            int i = ((dqoh) dqpoVar.a).j - 1;
                                            if (i == 0 || i == 1 || i == 2 || i == 5) {
                                                return false;
                                            }
                                            if (!apru.a()) {
                                                return true;
                                            }
                                            aazm aazmVar = this.a.a;
                                            int iOrdinal = aazmVar.ordinal();
                                            if (iOrdinal == 0) {
                                                boolValueOf = true;
                                            } else if (iOrdinal != 1) {
                                                ekgb ekgbVar = (ekgb) aazmVar.d.get(dqpoVar.e());
                                                boolValueOf = Boolean.valueOf(ekgbVar == null || !ekgbVar.contains(dqpoVar.d()));
                                            } else {
                                                boolValueOf = false;
                                            }
                                            return boolValueOf.booleanValue();
                                        }
                                    }).filter(new Predicate() { // from class: aazi
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo538negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            Parcelable.Creator<Action<Uri>> creator = DumpDatabaseAction.CREATOR;
                                            return ((dqpo) obj).d() != null;
                                        }
                                    }).map(new Function() { // from class: aazj
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            dqpo dqpoVar = (dqpo) obj;
                                            Parcelable.Creator<Action<Uri>> creator = DumpDatabaseAction.CREATOR;
                                            String strD = dqpoVar.d();
                                            String strSubstring2 = strD == null ? null : strD.substring(strD.indexOf(".") + 1);
                                            return String.valueOf(strSubstring2).concat(String.valueOf(String.format(Locale.ROOT, " = CASE (%s) WHEN (%s ISNULL) THEN NULL ELSE %s END", strSubstring2, strSubstring2, (dqpoVar.h() || ((dqoh) dqpoVar.a).d) ? String.format(Locale.ROOT, "('RED: ' || random() || ':' || length(%s))", strSubstring2) : String.format(Locale.ROOT, "('RED: ' || length(%s))", strSubstring2))));
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).collect(Collectors.joining(","));
                                    if (str3.isEmpty()) {
                                        continue;
                                    } else {
                                        try {
                                            sQLiteDatabaseOpenDatabase.execSQL(String.format(Locale.ROOT, "UPDATE %s SET %s", strSubstring, str3));
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                        if (sQLiteDatabaseOpenDatabase != null) {
                            sQLiteDatabaseOpenDatabase.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabaseOpenDatabase != null) {
                        try {
                            sQLiteDatabaseOpenDatabase.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            return cbpu.d(this.c, fileH.getName());
        } catch (Throwable th3) {
            if (cursorE != null) {
                try {
                    cursorE.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.DumpDatabase.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
        if (apru.a()) {
            parcel.writeString(this.a.name());
        } else {
            parcel.writeBoolean(this.f);
        }
    }

    public DumpDatabaseAction(Context context, fcsu fcsuVar, Map map, aazm aazmVar) {
        super(elgm.DUMP_DATABASE_ACTION);
        this.c = context;
        this.d = fcsuVar;
        this.e = map;
        this.a = aazmVar;
        this.f = aazmVar != aazm.NOT_REDACTED;
    }

    public DumpDatabaseAction(Context context, fcsu fcsuVar, Map map, boolean z) {
        super(elgm.DUMP_DATABASE_ACTION);
        this.c = context;
        this.d = fcsuVar;
        this.e = map;
        this.f = z;
        this.a = aazm.REDACTED;
    }
}
