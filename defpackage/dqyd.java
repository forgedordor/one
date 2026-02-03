package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteStatement;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dqyd {
    public final ContentValues a;
    protected final Map b;
    protected final String c;
    public final dqyh d;
    public ekgb e;
    protected final Map f;

    /* compiled from: PG */
    public interface a {
        Map fJ();
    }

    protected dqyd(String str, ContentValues contentValues, Map map, ekgb ekgbVar, dqyh dqyhVar) {
        this.c = str;
        this.a = new ContentValues(contentValues);
        this.b = map == null ? null : new HashMap(map);
        this.e = ekgbVar;
        this.d = dqyhVar;
        this.f = ((a) ehli.a(dqru.b, a.class)).fJ();
    }

    private final dqsy a() {
        return dqru.e(((dqpb) this.d).e);
    }

    private final boolean b() {
        Map map = this.b;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public static final void q(StringBuilder sb, dqyh dqyhVar) {
        sb.append("(");
        sb.append((String) Collection.EL.stream(((dqpc) ((dqpb) dqyhVar).h).b).map(new Function() { // from class: dqyc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dqpo) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(",")));
        sb.append(") = ");
    }

    public static final void r(StringBuilder sb, dqyg dqygVar) {
        sb.append("(SELECT ");
        dqpc dqpcVar = (dqpc) dqygVar;
        Cursor cursor = dqpcVar.a;
        sb.append((String) DesugarArrays.stream(cursor.getColumnNames()).skip(1L).collect(Collectors.joining(",")));
        sb.append(" FROM (");
        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToPosition(i);
            sb.append("SELECT ");
            for (int i2 = 0; i2 < cursor.getColumnCount(); i2++) {
                if (cursor.getType(i2) == 3) {
                    String string = cursor.getString(i2);
                    sb.append(string != null ? DatabaseUtils.sqlEscapeString(string) : "NULL");
                } else if (cursor.getType(i2) == 1) {
                    sb.append(cursor.getInt(i2));
                } else if (cursor.getType(i2) == 4) {
                    sb.append(dqru.i(cursor.getBlob(i2)));
                } else {
                    String string2 = cursor.getString(i2);
                    sb.append(string2 != null ? DatabaseUtils.sqlEscapeString(string2) : "NULL");
                }
                sb.append(" AS ");
                sb.append(cursor.getColumnName(i2));
                if (i2 < cursor.getColumnCount() - 1) {
                    sb.append(", ");
                }
            }
            if (i < cursor.getCount() - 1) {
                sb.append(" UNION ");
            }
        }
        sb.append(") AS _I WHERE ");
        sb.append(dqpcVar.c.ai(new dqxp(null, dqwv.B().a(), true, null)));
        sb.append(")");
    }

    protected static final String s(List list, String str, Object obj, String str2) {
        if (obj == null) {
            return defpackage.a.a(str, "(", " IS NULL)");
        }
        if (obj instanceof Boolean) {
            list.add(true != ((Boolean) obj).booleanValue() ? "0" : "1");
        } else {
            if (obj instanceof dqxe) {
                return "(" + str + " IS " + ((dqxe) obj).ai(dqxp.b()) + ")";
            }
            list.add(obj.toString());
        }
        return defpackage.a.d(str2, str, "(", " IS ", ")");
    }

    public final int e() {
        return f(a(), 0);
    }

    protected final int f(dqsy dqsyVar, int i) {
        return g(dqsyVar, i, dqxp.b());
    }

    protected final int g(dqsy dqsyVar, int i, dqxp dqxpVar) {
        int iB;
        if (i == 1) {
            throw new IllegalArgumentException("CONFLICT_ROLLBACK is not supported");
        }
        boolean zB = b();
        if (zB || this.a.size() != 0 || ((dqpb) this.d).h != null) {
            ArrayList arrayList = new ArrayList();
            String strJ = j(dqxpVar, arrayList);
            dqyh dqyhVar = this.d;
            dqpb dqpbVar = (dqpb) dqyhVar;
            if (dqpbVar.b && dqpbVar.h == null) {
                ContentValues contentValues = this.a;
                final ekhx ekhxVar = dqpbVar.f;
                if (!Collection.EL.stream(contentValues.keySet()).allMatch(new Predicate() { // from class: dqxx
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
                        return ekhxVar.contains((String) obj);
                    }
                }) || b()) {
                    strJ = strJ + " AND " + k(arrayList, "?");
                } else {
                    strJ = null;
                }
            }
            if (strJ != null) {
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                Context context = dqru.b;
                String str = this.c;
                dqtz dqtzVarB = dqua.a().b(dqsyVar, str, this);
                if (zB || dqpbVar.h != null) {
                    String str2 = strJ;
                    StringBuilder sb = new StringBuilder();
                    sb.append("UPDATE ");
                    if (i != 0) {
                        sb.append(dqru.j(i));
                        sb.append(" ");
                    }
                    sb.append(str);
                    sb.append(" SET ");
                    dqyg dqygVar = dqpbVar.h;
                    if (dqygVar != null) {
                        q(sb, dqyhVar);
                        r(sb, dqygVar);
                    } else {
                        sb.append(l(dqxpVar));
                    }
                    sb.append(" WHERE ");
                    sb.append(str2);
                    eieu eieuVarK = eiiy.k("UpdateBase#performUpdateWithSqlExpressions update");
                    try {
                        SQLiteStatement sQLiteStatementCompileStatement = dqsyVar.h().compileStatement(sb.toString());
                        sQLiteStatementCompileStatement.bindAllArgsAsStrings(strArr);
                        iB = dqsyVar.b(sQLiteStatementCompileStatement, ((dqpb) dqyhVar).d);
                        eieuVarK.close();
                    } finally {
                    }
                } else {
                    ContentValues contentValues2 = this.a;
                    dqpa dqpaVar = new dqpa(dqyhVar);
                    dqpaVar.c(i);
                    iB = dqsyVar.Z(str, contentValues2, strJ, strArr, dqpaVar.g());
                }
                dqtzVarB.a(iB > 0);
                return iB;
            }
        }
        return 0;
    }

    public final dqxe h() {
        ArrayList arrayList = new ArrayList();
        return new dqxl(k(arrayList, "$V"), arrayList.toArray(new Object[0]));
    }

    public final eiju i() {
        final dqsy dqsyVarA = a();
        return dqsyVarA.m().h(new ejvr() { // from class: dqxw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Integer.valueOf(this.a.f(dqsyVarA, 0));
            }
        }, (Executor) ((dqoj) dqru.c).h.get());
    }

    protected final String j(final dqxp dqxpVar, final List list) {
        if (!((dqpb) this.d).a) {
            Map map = this.f;
            String str = this.c;
            if (map.containsKey(str)) {
                ekfw ekfwVar = new ekfw();
                ekfwVar.j(this.e);
                ekfwVar.h(cdpj.a());
                this.e = ekfwVar.g();
            }
        }
        return this.e.isEmpty() ? "1" : new ejwc(" AND ").b(ekjz.g(this.e, new ejvr() { // from class: dqxv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dqyj) obj).b(dqxpVar, list);
            }
        }));
    }

    protected final String k(final List list, final String str) {
        StringBuilder sb = new StringBuilder();
        Stream streamSorted = Collection.EL.stream(this.a.keySet()).sorted();
        final ekhx ekhxVar = ((dqpb) this.d).f;
        Stream map = streamSorted.filter(new Predicate() { // from class: dqxy
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
                return !ekhxVar.contains((String) obj);
            }
        }).map(new Function() { // from class: dqxz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                return dqyd.s(list, str2, this.a.a.get(str2), str);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Map map2 = this.b;
        if (map2 != null) {
            map = Stream.CC.concat(map, Collection.EL.stream(map2.entrySet()).sorted(new Comparator() { // from class: dqya
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
                }
            }).map(new Function() { // from class: dqyb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    return dqyd.s(list, (String) entry.getKey(), entry.getValue(), str);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
        }
        sb.append((String) map.collect(Collectors.joining(" AND ")));
        return defpackage.a.a(sb.toString(), "(NOT (", "))");
    }

    public final String l(dqxp dqxpVar) {
        return dqru.k(this.a, this.b, dqxpVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(dqyi dqyiVar) {
        ekgb ekgbVar = this.e;
        int i = ((ekoe) ekgbVar).c;
        int i2 = 0;
        while (i2 < i) {
            boolean zF = ((dqyj) ekgbVar.get(i2)).f(dqyiVar);
            i2++;
            if (zF) {
                return;
            }
        }
    }

    public final boolean n(String str) {
        return this.a.containsKey(str);
    }

    public final boolean o() {
        return this.a.size() == 0;
    }

    @Deprecated
    public final String[] p() {
        return (String[]) this.a.keySet().toArray(new String[0]);
    }

    public final void t(int i) {
        f(a(), i);
    }
}
