package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import j$.util.function.Consumer$CC;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxej implements bxam {
    public static final cczi a = cdag.p(173131903);
    public static final ThreadLocal b = new ThreadLocal();
    public final bxei c;
    public StrictMode.ThreadPolicy d;
    private final ThreadLocal e = new ThreadLocal() { // from class: bxdb
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Object initialValue() {
            cczi ccziVar = bxej.a;
            return new ArrayDeque();
        }
    };

    public bxej(bxbi bxbiVar) {
        if (!craf.b) {
            this.c = new bxbj();
        } else {
            ((bxbf) bxbiVar.a.b()).getClass();
            this.c = new bxbh();
        }
    }

    private final ArrayDeque k() {
        return (ArrayDeque) this.e.get();
    }

    private final Consumer l() {
        ThreadLocal threadLocal = b;
        if (threadLocal.get() == null) {
            return new Consumer() { // from class: bxcv
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    cczi ccziVar = bxej.a;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            };
        }
        j(StrictMode.getThreadPolicy());
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy) threadLocal.get());
        final int iF = f();
        return new Consumer() { // from class: bxcw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ejwl.l(((Integer) obj).intValue() == iF);
                StrictMode.setThreadPolicy(this.a.g());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        };
    }

    @Override // defpackage.bxam
    public final Cursor a(Cursor cursor, dqtx dqtxVar) {
        return new bxeh(this, cursor);
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    public final int f() {
        return k().size();
    }

    public final StrictMode.ThreadPolicy g() {
        return (StrictMode.ThreadPolicy) k().pop();
    }

    public final Object h(Supplier supplier) {
        Consumer consumerL = l();
        try {
            return supplier.get();
        } finally {
            consumerL.accept(Integer.valueOf(f()));
        }
    }

    public final void i(Runnable runnable) {
        Consumer consumerL = l();
        try {
            runnable.run();
        } finally {
            consumerL.accept(Integer.valueOf(f()));
        }
    }

    public final void j(StrictMode.ThreadPolicy threadPolicy) {
        k().push(threadPolicy);
    }

    @Override // defpackage.bxam
    public final Closeable m(dqtx dqtxVar) {
        if (!((Boolean) a.e()).booleanValue()) {
            return null;
        }
        int iOrdinal = ((dqov) dqtxVar).b.ordinal();
        if (iOrdinal == 8) {
            final Consumer consumerL = l();
            return new Closeable() { // from class: bxcy
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    bxej bxejVar = this.a;
                    consumerL.accept(Integer.valueOf(bxejVar.f()));
                    StrictMode.setThreadPolicy(bxejVar.g());
                    ejwl.l(bxejVar.f() == 0);
                    bxej.b.remove();
                }
            };
        }
        if (iOrdinal == 12) {
            final Consumer consumerL2 = l();
            return new Closeable() { // from class: bxda
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    consumerL2.accept(Integer.valueOf(this.a.f()));
                }
            };
        }
        switch (iOrdinal) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                final Consumer consumerL3 = l();
                return new Closeable() { // from class: bxcz
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        consumerL3.accept(Integer.valueOf(this.a.f()));
                    }
                };
            case 6:
                b.set(StrictMode.getThreadPolicy());
                final Consumer consumerL4 = l();
                return new Closeable() { // from class: bxcx
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        bxej bxejVar = this.a;
                        consumerL4.accept(Integer.valueOf(bxejVar.f()));
                        if (bxejVar.d == null) {
                            bxejVar.d = bxejVar.c.a();
                        }
                        ejwl.l(bxejVar.f() == 0);
                        bxejVar.j((StrictMode.ThreadPolicy) bxej.b.get());
                        StrictMode.setThreadPolicy(bxejVar.d);
                    }
                };
            default:
                return null;
        }
    }

    @Override // defpackage.bxam
    public final boolean o() {
        if (((Boolean) a.e()).booleanValue() && !cqbe.a()) {
            return !(!cqbe.j() || cqbe.b() || cqbe.f() || cqbe.i()) || cqbe.c();
        }
        return false;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }
}
