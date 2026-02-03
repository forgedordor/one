package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDiskIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxck extends CursorWrapper {
    final /* synthetic */ bxcl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxck(bxcl bxclVar, Cursor cursor) {
        super(cursor);
        this.a = bxclVar;
    }

    private final Object a(ejxr ejxrVar) {
        int i;
        SQLiteDiskIOException sQLiteDiskIOException = null;
        int i2 = 0;
        while (true) {
            try {
                Object obj = ejxrVar.get();
                if (i2 > 0) {
                    ((ains) this.a.e.b()).e("Bugle.Datamodel.CursorDiskIOExceptionRecovery.Counts", i2);
                }
                return obj;
            } catch (SQLiteDiskIOException e) {
                if (sQLiteDiskIOException != null) {
                    e.addSuppressed(sQLiteDiskIOException);
                }
                bxcl.a.s("got SQLiteDiskIOException", e);
                if (i2 == 0) {
                    ((ains) this.a.e.b()).c("Bugle.Datamodel.CursorDiskIOException.Counts");
                    i = 0;
                    i2 = 0;
                } else {
                    i = i2;
                }
                if (i2 >= ((Integer) ((cczi) bxcl.b.get()).e()).intValue()) {
                    throw new IllegalStateException("unable to perform cursor operation", e);
                }
                eote.c(((Long) ((cczi) bxcl.c.get()).e()).longValue(), TimeUnit.MILLISECONDS);
                i2 = i + 1;
                sQLiteDiskIOException = e;
            }
        }
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final void deactivate() {
        throw new IllegalStateException("deactivate is deprecated");
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        return ((Integer) a(new ejxr() { // from class: bxci
            @Override // defpackage.ejxr
            public final Object get() {
                return Integer.valueOf(this.a.getWrappedCursor().getCount());
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getPosition() {
        return ((Integer) a(new ejxr() { // from class: bxcg
            @Override // defpackage.ejxr
            public final Object get() {
                return Integer.valueOf(this.a.getWrappedCursor().getPosition());
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isAfterLast() {
        return ((Boolean) a(new ejxr() { // from class: bxcf
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(this.a.getWrappedCursor().isAfterLast());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isBeforeFirst() {
        return ((Boolean) a(new ejxr() { // from class: bxcj
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(this.a.getWrappedCursor().isBeforeFirst());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isFirst() {
        return ((Boolean) a(new ejxr() { // from class: bxcb
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(this.a.getWrappedCursor().isFirst());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isLast() {
        return ((Boolean) a(new ejxr() { // from class: bxcc
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(this.a.getWrappedCursor().isLast());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        return ((Boolean) a(new ejxr() { // from class: bxch
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(this.a.getWrappedCursor().moveToFirst());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        return ((Boolean) a(new ejxr() { // from class: bxce
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(this.a.getWrappedCursor().moveToLast());
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(final int i) {
        return ((Boolean) a(new ejxr() { // from class: bxcd
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(this.a.getWrappedCursor().moveToPosition(i));
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean requery() {
        throw new IllegalStateException("requery is deprecated");
    }
}
