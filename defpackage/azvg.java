package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azvg {
    public static final int a(dqws dqwsVar, azwc azwcVar, long j, int i) {
        azwcVar.getClass();
        dqwsVar.n(azwcVar.b, "table_name");
        dqwsVar.n(new dqxl("$V", new Object[]{Long.valueOf(j)}), "status");
        return b(dqwsVar.b(), i);
    }

    public static final int b(dqxe dqxeVar, int i) throws SQLException {
        dqxeVar.getClass();
        String strJ = dqru.j(i);
        String[] strArr = bmkn.a;
        bmjt bmjtVar = bmkn.c;
        dqxl dqxlVar = new dqxl("INSERT $R INTO $V ($V,$V,$V,$V) SELECT backup_id, bugle_id, table_name, status FROM ($V)", new Object[]{strJ, "backup_id_map", bmjtVar.c.d(), bmjtVar.d.d(), bmjtVar.b.d(), bmjtVar.e.d(), dqxeVar});
        dqsy dqsyVarE = dqru.e("$primary");
        SQLiteStatement sQLiteStatementCompileStatement = dqsyVarE.h().compileStatement(dqxlVar.ai(new dqxp(null, dqwv.B().a(), true, null)));
        sQLiteStatementCompileStatement.getClass();
        return dqsyVarE.b(sQLiteStatementCompileStatement, new dqsb("BackupIdMapTable-insert"));
    }

    public static /* synthetic */ dqtr c(dqpo dqpoVar, final azwc azwcVar, String str, boolean z, int i) {
        azwcVar.getClass();
        String[] strArr = bmkn.a;
        bmki bmkiVar = new bmki(bmkn.a);
        if ((i & 8) != 0) {
            bmkiVar.c(bmkn.c.d);
        } else {
            bmkiVar.v();
        }
        if (z && ((i & 16) == 0)) {
            bmkiVar.d(new Function() { // from class: azvc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmkm bmkmVar = (bmkm) obj;
                    final azwc azwcVar2 = azwcVar;
                    bmkmVar.b(new Function() { // from class: azve
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bmkm bmkmVar2 = (bmkm) obj2;
                            bmkmVar2.f(azwcVar2.b);
                            return bmkmVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: azvf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bmkm bmkmVar2 = (bmkm) obj2;
                            bmkmVar2.h();
                            return bmkmVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return bmkmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            bmkiVar.d(new Function() { // from class: azvd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bmkm bmkmVar = (bmkm) obj;
                    bmkmVar.f(azwcVar.b);
                    return bmkmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        if ((i & 4) != 0) {
            str = null;
        }
        dqtr dqtrVarI = dqts.i(bmkiVar.b(), bmkn.c.c, dqpoVar);
        if (str != null) {
            ((dqos) dqtrVarI).e = str;
        }
        return dqtrVarI;
    }
}
