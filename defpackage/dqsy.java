package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface dqsy {
    @Deprecated
    void A(Uri uri, String str);

    void B(String str, Runnable runnable);

    void C(boolean z);

    void D(int i);

    @Deprecated
    boolean F();

    boolean G(dqqf dqqfVar);

    boolean H(dqqf dqqfVar);

    boolean I(dqqf dqqfVar);

    boolean J(dqqf dqqfVar, int i);

    boolean K(dqqf dqqfVar);

    dqxa M();

    dqsc N(dqsb dqsbVar);

    long O(String str, dqst dqstVar);

    long P(String str, dqst dqstVar);

    long Q(String str, dqst dqstVar, int i);

    void W(String str, Runnable runnable, dqss dqssVar);

    int X(String str, String str2, String[] strArr, dqtd dqtdVar);

    int Z(String str, ContentValues contentValues, String str2, String[] strArr, dqyh dqyhVar);

    int a(SQLiteStatement sQLiteStatement);

    int b(SQLiteStatement sQLiteStatement, dqsb dqsbVar);

    int c(dqqf dqqfVar);

    long d(String str, String str2, String[] strArr);

    Cursor e(String str, String[] strArr);

    Cursor f(String str, String[] strArr, dqwv dqwvVar);

    Cursor g(String str, String[] strArr, dqwv dqwvVar, CancellationSignal cancellationSignal);

    SQLiteDatabase h();

    dqrs j();

    eiju m();

    Object n(ejxr ejxrVar);

    @Deprecated
    Object o(ejxr ejxrVar);

    @Deprecated
    Object p(String str, ejxr ejxrVar);

    @Deprecated
    Object q(dqsb dqsbVar, ejxr ejxrVar, dqsx dqsxVar);

    void t();

    void v(String str);

    @Deprecated
    void w(String str, Runnable runnable);

    @Deprecated
    void z(Uri uri);
}
