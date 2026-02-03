package defpackage;

import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Bundle;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxeh extends CursorWrapper {
    final /* synthetic */ bxej a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxeh(bxej bxejVar, Cursor cursor) {
        super(cursor);
        this.a = bxejVar;
    }

    public final /* synthetic */ void A() {
        super.close();
    }

    public final /* synthetic */ void B(int i, CharArrayBuffer charArrayBuffer) {
        super.copyStringToBuffer(i, charArrayBuffer);
    }

    public final /* synthetic */ void C(Bundle bundle) {
        super.setExtras(bundle);
    }

    public final /* synthetic */ byte[] D(int i) {
        return super.getBlob(i);
    }

    public final /* synthetic */ String[] E() {
        return super.getColumnNames();
    }

    public final /* synthetic */ Bundle a() {
        return super.getExtras();
    }

    public final /* synthetic */ Boolean b() {
        return Boolean.valueOf(super.isAfterLast());
    }

    public final /* synthetic */ Boolean c() {
        return Boolean.valueOf(super.isBeforeFirst());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.i(new Runnable() { // from class: bxdm
            @Override // java.lang.Runnable
            public final void run() {
                this.a.A();
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final void copyStringToBuffer(final int i, final CharArrayBuffer charArrayBuffer) {
        this.a.i(new Runnable() { // from class: bxdq
            @Override // java.lang.Runnable
            public final void run() {
                this.a.B(i, charArrayBuffer);
            }
        });
    }

    public final /* synthetic */ Boolean d() {
        return Boolean.valueOf(super.isClosed());
    }

    public final /* synthetic */ Boolean e() {
        return Boolean.valueOf(super.isFirst());
    }

    public final /* synthetic */ Boolean f() {
        return Boolean.valueOf(super.isLast());
    }

    public final /* synthetic */ Boolean g(int i) {
        return Boolean.valueOf(super.isNull(i));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final byte[] getBlob(final int i) {
        return (byte[]) this.a.h(new Supplier() { // from class: bxea
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.D(i);
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getColumnCount() {
        return ((Integer) this.a.h(new Supplier() { // from class: bxde
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.p();
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getColumnIndex(final String str) {
        return ((Integer) this.a.h(new Supplier() { // from class: bxdj
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.q(str);
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getColumnIndexOrThrow(final String str) {
        return ((Integer) this.a.h(new Supplier() { // from class: bxdh
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.r(str);
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final String getColumnName(final int i) {
        return (String) this.a.h(new Supplier() { // from class: bxdz
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.y(i);
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final String[] getColumnNames() {
        return (String[]) this.a.h(new Supplier() { // from class: bxeb
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.E();
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        return ((Integer) this.a.h(new Supplier() { // from class: bxdn
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.s();
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final double getDouble(final int i) {
        return ((Double) this.a.h(new Supplier() { // from class: bxdl
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.n(i);
            }
        })).doubleValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final Bundle getExtras() {
        return (Bundle) this.a.h(new Supplier() { // from class: bxdg
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.a();
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final float getFloat(final int i) {
        return ((Float) this.a.h(new Supplier() { // from class: bxdk
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.o(i);
            }
        })).floatValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getInt(final int i) {
        return ((Integer) this.a.h(new Supplier() { // from class: bxdo
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.t(i);
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final long getLong(final int i) {
        return ((Long) this.a.h(new Supplier() { // from class: bxds
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.w(i);
            }
        })).longValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getPosition() {
        return ((Integer) this.a.h(new Supplier() { // from class: bxdf
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.u();
            }
        })).intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final short getShort(final int i) {
        return ((Short) this.a.h(new Supplier() { // from class: bxdt
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.x(i);
            }
        })).shortValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final String getString(final int i) {
        return (String) this.a.h(new Supplier() { // from class: bxdc
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.z(i);
            }
        });
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getType(final int i) {
        return ((Integer) this.a.h(new Supplier() { // from class: bxdw
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.v(i);
            }
        })).intValue();
    }

    public final /* synthetic */ Boolean h(int i) {
        return Boolean.valueOf(super.move(i));
    }

    public final /* synthetic */ Boolean i() {
        return Boolean.valueOf(super.moveToFirst());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isAfterLast() {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxdp
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.b();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isBeforeFirst() {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxec
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.c();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isClosed() {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.d();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isFirst() {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxdy
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.e();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isLast() {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxdx
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.f();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isNull(final int i) {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxdu
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.g(i);
            }
        })).booleanValue();
    }

    public final /* synthetic */ Boolean j() {
        return Boolean.valueOf(super.moveToLast());
    }

    public final /* synthetic */ Boolean k() {
        return Boolean.valueOf(super.moveToNext());
    }

    public final /* synthetic */ Boolean l(int i) {
        return Boolean.valueOf(super.moveToPosition(i));
    }

    public final /* synthetic */ Boolean m() {
        return Boolean.valueOf(super.moveToPrevious());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(final int i) {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxdi
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.h(i);
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxdr
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.i();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxef
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.j();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxeg
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.k();
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(final int i) {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxdv
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.l(i);
            }
        })).booleanValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        return ((Boolean) this.a.h(new Supplier() { // from class: bxed
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.m();
            }
        })).booleanValue();
    }

    public final /* synthetic */ Double n(int i) {
        return Double.valueOf(super.getDouble(i));
    }

    public final /* synthetic */ Float o(int i) {
        return Float.valueOf(super.getFloat(i));
    }

    public final /* synthetic */ Integer p() {
        return Integer.valueOf(super.getColumnCount());
    }

    public final /* synthetic */ Integer q(String str) {
        return Integer.valueOf(super.getColumnIndex(str));
    }

    public final /* synthetic */ Integer r(String str) {
        return Integer.valueOf(super.getColumnIndexOrThrow(str));
    }

    public final /* synthetic */ Integer s() {
        return Integer.valueOf(super.getCount());
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final void setExtras(final Bundle bundle) {
        this.a.i(new Runnable() { // from class: bxee
            @Override // java.lang.Runnable
            public final void run() {
                this.a.C(bundle);
            }
        });
    }

    public final /* synthetic */ Integer t(int i) {
        return Integer.valueOf(super.getInt(i));
    }

    public final /* synthetic */ Integer u() {
        return Integer.valueOf(super.getPosition());
    }

    public final /* synthetic */ Integer v(int i) {
        return Integer.valueOf(super.getType(i));
    }

    public final /* synthetic */ Long w(int i) {
        return Long.valueOf(super.getLong(i));
    }

    public final /* synthetic */ Short x(int i) {
        return Short.valueOf(super.getShort(i));
    }

    public final /* synthetic */ String y(int i) {
        return super.getColumnName(i);
    }

    public final /* synthetic */ String z(int i) {
        return super.getString(i);
    }
}
