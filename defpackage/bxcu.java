package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.Closeable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxcu implements bxam {
    static final cczv a = cdag.p(157142040);
    public static final /* synthetic */ int b = 0;
    private final fcsu c;
    private final Optional d;

    public bxcu(fcsu fcsuVar, Optional optional) {
        this.c = fcsuVar;
        this.d = optional;
    }

    @Override // defpackage.bxam
    public final int e(Exception exc, int i, dqtx dqtxVar) {
        if (!((Boolean) a.e()).booleanValue() || !(exc instanceof SQLiteFullException)) {
            return 1;
        }
        fcsu fcsuVar = this.c;
        ((ains) fcsuVar.b()).c("Bugle.Datamodel.DatabaseStorageExhausted.Counts");
        ((ains) fcsuVar.b()).a();
        this.d.ifPresent(new Consumer() { // from class: bxct
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                int i2 = bxcu.b;
                ((cmxa) ((fcsu) obj).b()).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        crrf.a();
        throw new IllegalStateException("exit returned");
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Closeable m(dqtx dqtxVar) {
        return null;
    }

    @Override // defpackage.bxam
    public final boolean o() {
        return ((Boolean) a.e()).booleanValue();
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final /* synthetic */ Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}
