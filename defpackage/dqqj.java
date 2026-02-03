package defpackage;

import android.database.Cursor;
import defpackage.dqpd;
import defpackage.dqpo;
import defpackage.dqqj;
import defpackage.dqwl;
import defpackage.dqws;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface dqqj<C extends dqqj<C, Q, B, D, CR>, Q extends dqwl<C, Q, B, D, CR>, B extends dqws<C, Q, B, D, CR>, D extends dqpd<C, Q, B, D, CR>, CR extends dqpo<CR>> extends Closeable {
    Cursor a();

    dqpd cQ();

    dqpd cS();

    dqpd cT();

    dqpd cU();

    dqqj cW(String str);

    ekgb cX();

    ekgb cY(dqqd dqqdVar);

    ekgb cZ(Supplier supplier);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    Stream da();

    String de(String str);

    void dh(dqtm dqtmVar, ekgb ekgbVar, boolean z);

    void di();

    boolean dk(String str);

    int getCount();

    int getPosition();

    boolean isAfterLast();

    boolean isBeforeFirst();

    boolean isClosed();

    boolean isFirst();

    boolean isLast();

    boolean moveToFirst();

    boolean moveToNext();

    boolean moveToPosition(int i);

    boolean moveToPrevious();
}
