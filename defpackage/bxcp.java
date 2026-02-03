package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxcp extends CursorWrapper {
    private boolean a;

    public bxcp(Cursor cursor) {
        super(cursor);
    }

    private final eifp a(String str) {
        return this.a ? new bxco() : eiiy.k(str);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        eifp eifpVarA = a("DatabaseWrapperSpanCursor#getCount");
        try {
            this.a = true;
            int count = getWrappedCursor().getCount();
            eifpVarA.close();
            return count;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(int i) {
        eifp eifpVarA = a("DatabaseWrapperSpanCursor#move");
        try {
            boolean zMove = getWrappedCursor().move(i);
            eifpVarA.close();
            return zMove;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        eifp eifpVarA = a("DatabaseWrapperSpanCursor#moveToFirst");
        try {
            boolean zMoveToFirst = getWrappedCursor().moveToFirst();
            eifpVarA.close();
            return zMoveToFirst;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        eifp eifpVarA = a("DatabaseWrapperSpanCursor#moveToLast");
        try {
            boolean zMoveToLast = getWrappedCursor().moveToLast();
            eifpVarA.close();
            return zMoveToLast;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        eifp eifpVarA = a("DatabaseWrapperSpanCursor#moveToNext");
        try {
            boolean zMoveToNext = getWrappedCursor().moveToNext();
            eifpVarA.close();
            return zMoveToNext;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        eifp eifpVarA = a("DatabaseWrapperSpanCursor#moveToPosition");
        try {
            boolean zMoveToPosition = getWrappedCursor().moveToPosition(i);
            eifpVarA.close();
            return zMoveToPosition;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        eifp eifpVarA = a("DatabaseWrapperSpanCursor#moveToPrevious");
        try {
            boolean zMoveToPrevious = getWrappedCursor().moveToPrevious();
            eifpVarA.close();
            return zMoveToPrevious;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
