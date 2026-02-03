package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aveg implements Iterator, AutoCloseable, fdcn {
    private final Cursor a;
    private final fdap b;
    private Object c;

    public aveg(Cursor cursor, fdap fdapVar) {
        fdapVar.getClass();
        this.a = cursor;
        this.b = fdapVar;
    }

    private final Object a() {
        Object objInvoke = this.c;
        if (objInvoke == null) {
            objInvoke = null;
            while (objInvoke == null) {
                Cursor cursor = this.a;
                if (!cursor.moveToNext()) {
                    break;
                }
                objInvoke = this.b.invoke(cursor);
            }
            this.c = objInvoke;
        }
        return objInvoke;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Cursor cursor = this.a;
        if (cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a() != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objA = a();
        if (objA != null) {
            this.c = null;
        } else {
            objA = null;
        }
        if (objA != null) {
            return objA;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
