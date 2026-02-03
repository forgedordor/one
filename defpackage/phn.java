package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import java.io.IOException;

/* loaded from: classes.dex */
public final class phn {
    public static final Cursor a(pex pexVar, pjv pjvVar, boolean z) throws IOException {
        int i = phx.a;
        pjvVar.getClass();
        pexVar.l();
        pexVar.m();
        Cursor cursorA = pexVar.e().b().a(pjvVar);
        if (z && (cursorA instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorA;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(cursorA.getColumnNames(), cursorA.getCount());
                    while (cursorA.moveToNext()) {
                        Object[] objArr = new Object[cursorA.getColumnCount()];
                        int columnCount = cursorA.getColumnCount();
                        for (int i2 = 0; i2 < columnCount; i2++) {
                            int type = cursorA.getType(i2);
                            if (type == 0) {
                                objArr[i2] = null;
                            } else if (type == 1) {
                                objArr[i2] = Long.valueOf(cursorA.getLong(i2));
                            } else if (type == 2) {
                                objArr[i2] = Double.valueOf(cursorA.getDouble(i2));
                            } else if (type == 3) {
                                objArr[i2] = cursorA.getString(i2);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i2] = cursorA.getBlob(i2);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    fczl.a(cursorA, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return cursorA;
    }
}
