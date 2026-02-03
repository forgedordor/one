package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxax implements bxam, cdfg {
    public static final cczv a = cdag.e(cdag.b, "d26r_max_history_length", 1);
    public final Set b;
    private final eosc e;
    public final Object d = new Object();
    public ekea c = new ekea(((Integer) a.e()).intValue());

    public bxax(eosc eoscVar, Set set) {
        this.e = eoscVar;
        this.b = set;
    }

    public static String f(AtomicLong atomicLong) {
        long j = atomicLong.get();
        return j == -1 ? "null" : String.valueOf(j);
    }

    public static void g(StringBuilder sb, String str, String str2) {
        sb.append("  ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        sb.append("\n");
    }

    @Override // defpackage.cdfg
    public final eiju b() {
        return eijx.g(new Callable() { // from class: bxav
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list;
                String strConcat;
                final bxax bxaxVar = this.a;
                synchronized (bxaxVar.d) {
                    list = (List) Collection.EL.stream(bxaxVar.c).collect(Collectors.toCollection(new Supplier() { // from class: bxau
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    }));
                }
                Collections.reverse(list);
                String str = String.format(Locale.US, "D26r history of %d items", Integer.valueOf(list.size())) + "tag=logging tag; op=operation category; tid=thread id; inflt=is inflight; et=elapsed time millis; tt=thread time millis; rows=row count returned; plan=query plan\n" + ((String) Collection.EL.stream(list).map(new Function() { // from class: bxat
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        dqxc dqxcVarP;
                        String strA;
                        String str2;
                        dqtx dqtxVar = (dqtx) obj;
                        StringBuilder sb = new StringBuilder();
                        sb.append("D26rHistoryItem:\n");
                        bxax.g(sb, "tag", dqtxVar.b().toString());
                        bxax.g(sb, "op", dqtxVar.d().toString());
                        bxax.g(sb, "tid", String.valueOf(Thread.currentThread().getId()));
                        bxax.g(sb, "inflt", dqtxVar.j().toString());
                        bxax.g(sb, "et", bxax.f(dqtxVar.l()));
                        bxax.g(sb, "tt", bxax.f(dqtxVar.m()));
                        bxax.g(sb, "rows", String.valueOf(dqtxVar.k().get()));
                        if ((dqtxVar.m().get() > 100 || dqtxVar.l().get() > 100) && (strA = (dqxcVarP = dqtxVar.p()).a()) != null) {
                            str2 = dqru.d(((bwzy) dqtxVar.c()).i(), strA, (String[]) dqxcVarP.b().toArray(new String[0]), bxaxVar.b).a;
                        } else {
                            str2 = "not computed";
                        }
                        bxax.g(sb, "plan", str2);
                        return sb.toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.joining("\n")));
                try {
                    String[] strArr = buei.a;
                    buef buefVar = new buef(buei.a);
                    buefVar.A("getStat1Table");
                    buefVar.s();
                    strConcat = (String) Collection.EL.stream(buefVar.b().z()).map(new Function() { // from class: bxaw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            budl budlVar = (budl) obj;
                            return String.format(Locale.US, "SqliteStat1 [tbl: %s, idx: %s, stat: %s]", String.valueOf(budlVar.a), String.valueOf(budlVar.b), String.valueOf(budlVar.c));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.joining("\n"));
                } catch (Throwable th) {
                    strConcat = "unable to read sqlite_stat1 table: ".concat(String.valueOf(th.getClass().getSimpleName()));
                }
                return a.q(strConcat, str, "\n");
            }
        }, this.e);
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju d() {
        return cdfd.d();
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        if (((dqov) dqtxVar).b.ordinal() == 1) {
            return null;
        }
        synchronized (this.d) {
            this.c.add(dqtxVar);
        }
        return null;
    }

    @Override // defpackage.bxam
    public final void n(SQLiteDatabase sQLiteDatabase) {
        this.c = new ekea(((Integer) a.e()).intValue());
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return true;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
