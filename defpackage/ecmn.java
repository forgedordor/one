package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecmn implements Callable {
    volatile boolean a;
    final /* synthetic */ ecny b;
    final /* synthetic */ ecoa c;
    final /* synthetic */ ecmp d;

    public ecmn(ecmp ecmpVar, ecny ecnyVar, ecoa ecoaVar) {
        this.b = ecnyVar;
        this.c = ecoaVar;
        this.d = ecmpVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SQLiteDatabase sQLiteDatabase = this.d.a;
        ejwl.m(!sQLiteDatabase.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        sQLiteDatabase.beginTransactionWithListener(new ecmm(this));
        try {
            this.a = true;
            Object objA = this.b.a(this.c);
            ecoa.f();
            sQLiteDatabase.setTransactionSuccessful();
            this.a = false;
            return objA;
        } finally {
            this.d.a.endTransaction();
        }
    }
}
