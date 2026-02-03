package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxcr implements bxam {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/layer/SqliteExceptionPlugin");
    static final ejxr a = cdag.u(110154778);

    @Override // defpackage.bxam
    public final int e(Exception exc, int i, dqtx dqtxVar) {
        String message;
        if (((Boolean) ((cczi) a.get()).e()).booleanValue() && (exc instanceof SQLiteException) && !(exc instanceof SQLiteConstraintException) && (message = exc.getMessage()) != null && !message.equals("Test Exception")) {
            if (exc instanceof SQLiteBlobTooBigException) {
                dqov dqovVar = (dqov) dqtxVar;
                dqsy dqsyVar = dqovVar.c;
                dqwl dqwlVar = dqovVar.i;
                Context context = dqru.b;
                if (dqwlVar == null) {
                    Log.e("d26r", "in computeAndPrintIndividualProjectionsLengths sourceQuery is null");
                } else {
                    ArrayList arrayList = new ArrayList();
                    final ArrayList arrayList2 = new ArrayList();
                    dqox dqoxVar = new dqox(dqwlVar.e);
                    dqoxVar.i(true);
                    dqwv dqwvVarA = dqoxVar.a();
                    dqtm dqtmVar = dqwlVar.m;
                    String strH = dqwlVar.H(new dqxp(dqtmVar, dqwvVarA, false), false, arrayList);
                    DesugarArrays.stream(dqwlVar.X(new dqxp(dqtmVar, dqwvVarA))).forEachOrdered(new Consumer() { // from class: dqrf
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            Context context2 = dqru.b;
                            arrayList2.add((String) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    String str = String.format(Locale.US, "/*EXEMPT-FROM-QUERY-PLAN-CHECK*/ SELECT %s FROM (%s)", (String) Collection.EL.stream(arrayList2).map(new Function() { // from class: dqrg
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            int iLastIndexOf;
                            String str2 = (String) obj;
                            Context context2 = dqru.b;
                            int iIndexOf = str2.indexOf(" AS ");
                            return iIndexOf >= 0 ? str2.substring(iIndexOf + 4) : (str2.contains("group_concat") || (iLastIndexOf = str2.lastIndexOf(".")) == -1) ? str2 : str2.substring(iLastIndexOf + 1);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: dqrh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Context context2 = dqru.b;
                            return String.format(Locale.US, "length(CAST(%s AS BLOB))", (String) obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining(",")), strH);
                    if (str == null) {
                        Log.e("d26r", "in computeAndPrintIndividualProjectionsLengths sql is null");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        dqwu dqwuVarB = dqwv.B();
                        ((dqox) dqwuVarB).t = new dqsb("setQueryForColumnSizes");
                        dqwuVarB.i(true);
                        Cursor cursorF = dqsyVar.f(str, strArr, dqwuVarB.a());
                        try {
                            Log.e("d26r", String.format(Locale.US, "computeAndPrintIndividualProjectionsLengths for sql (%d rows): %s", Integer.valueOf(cursorF.getCount()), str));
                            while (cursorF.moveToNext()) {
                                int i2 = 0;
                                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                    int i4 = cursorF.isNull(i3) ? 1 : cursorF.getInt(i3);
                                    i2 += i4;
                                    sb.append((String) arrayList2.get(i3));
                                    sb.append(" = ");
                                    sb.append(i4);
                                    sb.append("; ");
                                }
                                if (i2 >= 10000 || cursorF.getPosition() <= 5) {
                                    Log.e("d26r", "row " + cursorF.getPosition() + "; size (approx) = " + i2);
                                    Log.e("d26r", sb.toString());
                                }
                            }
                            if (cursorF != null) {
                                cursorF.close();
                            }
                        } catch (Throwable th) {
                            if (cursorF != null) {
                                try {
                                    cursorF.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                }
            } else {
                dqtxVar.p();
                String strA = dqtxVar.p().a();
                if (!message.contains("no such column: participants.comparable_destination")) {
                    ekrw ekrwVarI = b.i();
                    ekrwVarI.X(eksq.a, "BugleDatabase");
                    ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/datamodel/layer/SqliteExceptionPlugin", "handleException", 100, "SqliteExceptionPlugin.java")).I("got SQLiteException (%s) for sql: %s; exception message is %s", exc.getClass().getName(), strA, message);
                }
            }
        }
        return 1;
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        return null;
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return ((Boolean) ((cczi) a.get()).e()).booleanValue();
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
