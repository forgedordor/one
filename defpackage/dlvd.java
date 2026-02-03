package defpackage;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvd implements Cursor {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/attachments/resolver/MetadataCursor");
    private static final Instant c;
    private static final Instant d;
    public final Cursor b;

    static {
        Instant instantPlus = Instant.EPOCH.plus(Duration.ofDays(1825L));
        instantPlus.getClass();
        c = instantPlus;
        Instant instantPlus2 = Instant.EPOCH.plus(Duration.ofDays(23725L));
        instantPlus2.getClass();
        d = instantPlus2;
    }

    public dlvd(Cursor cursor) {
        this.b = cursor;
    }

    private static final Instant f(long j) {
        try {
            Instant instant = c;
            long epochSecond = instant.getEpochSecond();
            Instant instant2 = d;
            if (j < instant2.getEpochSecond() && epochSecond <= j) {
                return Instant.ofEpochSecond(j);
            }
            long epochMilli = instant.toEpochMilli();
            if (j < instant2.toEpochMilli() && epochMilli <= j) {
                return Instant.ofEpochMilli(j);
            }
            long epochMilli2 = instant.toEpochMilli() * 1000;
            if (j >= instant2.toEpochMilli() * 1000 || epochMilli2 > j) {
                return null;
            }
            return Instant.ofEpochMilli(j / 1000);
        } catch (IllegalArgumentException unused) {
            ((ekrd) a.i().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursor", "getCorrectedValueAsInstant", 102, "MetadataCursor.kt")).s("Error parsing timestamp to Instant. Unable to infer unit of time of {%d}.", j);
            return null;
        }
    }

    public final Size a() {
        Cursor cursor;
        Integer numA;
        if (Build.VERSION.SDK_INT < 29 || (numA = dngj.a((cursor = this.b), "width")) == null) {
            return null;
        }
        int iIntValue = numA.intValue();
        Integer numA2 = dngj.a(cursor, "height");
        if (numA2 == null) {
            return null;
        }
        Size size = new Size(iIntValue, numA2.intValue());
        Integer numA3 = dngj.a(cursor, "orientation");
        if (numA3 != null) {
            return dngm.a(size, numA3.intValue());
        }
        return null;
    }

    public final Duration b() {
        String strC;
        if (Build.VERSION.SDK_INT < 29 || (strC = dngj.c(this.b, "duration")) == null) {
            return null;
        }
        return Duration.ofMillis(Long.parseLong(strC));
    }

    public final Instant c() {
        Instant instantF;
        Instant instantF2;
        Cursor cursor = this.b;
        Long lB = dngj.b(cursor, "date_added");
        if (lB == null || (instantF = f(lB.longValue())) == null) {
            instantF = Instant.EPOCH;
            instantF.getClass();
        }
        Long lB2 = dngj.b(cursor, "date_modified");
        if (lB2 == null || (instantF2 = f(lB2.longValue())) == null) {
            instantF2 = Instant.EPOCH;
            instantF2.getClass();
        }
        Comparable comparableC = fcxl.c(instantF, instantF2);
        if (((Instant) comparableC).compareTo(Instant.EPOCH) <= 0) {
            comparableC = null;
        }
        Instant instant = (Instant) comparableC;
        if (instant == null) {
            ((ekrd) a.j().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursor", "dateModified", 39, "MetadataCursor.kt")).q("Unable to obtain modified date from Content Resolver");
        }
        return instant;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.b.copyStringToBuffer(i, charArrayBuffer);
    }

    public final Long d() {
        Long lB = dngj.b(this.b, "_size");
        if (lB == null) {
            ((ekrd) a.j().h("com/google/android/libraries/compose/attachments/resolver/MetadataCursor", "sizeBytes", 77, "MetadataCursor.kt")).q("Unable to obtain size in bytes from Content Resolver");
        }
        return lB;
    }

    @Override // android.database.Cursor
    @fcsv
    public final void deactivate() {
        this.b.deactivate();
    }

    public final String e() {
        return dngj.c(this.b, "mime_type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlvd) && fdbq.f(this.b, ((dlvd) obj).b);
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i) {
        return this.b.getBlob(i);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.b.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        return this.b.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return this.b.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        return this.b.getColumnName(i);
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.b.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        return this.b.getCount();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        return this.b.getDouble(i);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.b.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        return this.b.getFloat(i);
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        return this.b.getInt(i);
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        return this.b.getLong(i);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.b.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.b.getPosition();
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        return this.b.getShort(i);
    }

    @Override // android.database.Cursor
    public final String getString(int i) {
        return this.b.getString(i);
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        return this.b.getType(i);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.b.getWantsAllOnMoveCalls();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return this.b.isAfterLast();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.b.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.b.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.b.isFirst();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.b.isLast();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        return this.b.isNull(i);
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return this.b.move(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return this.b.moveToFirst();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return this.b.moveToLast();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.b.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        return this.b.moveToPosition(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.b.moveToPrevious();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.b.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    @fcsv
    public final boolean requery() {
        return this.b.requery();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return this.b.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.b.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.b.setNotificationUri(contentResolver, uri);
    }

    public final String toString() {
        return "MetadataCursor(cursor=" + this.b + ")";
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.b.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.unregisterDataSetObserver(dataSetObserver);
    }
}
