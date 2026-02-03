package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkb implements Callable {
    final /* synthetic */ pff a;
    final /* synthetic */ qkk b;

    public qkb(qkk qkkVar, pff pffVar) {
        this.b = qkkVar;
        this.a = pffVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws IOException {
        boolean zValueOf;
        Cursor cursorA = phn.a(this.b.a, this.a, false);
        try {
            if (cursorA.moveToFirst()) {
                zValueOf = Boolean.valueOf(cursorA.getInt(0) != 0);
            } else {
                zValueOf = false;
            }
            return zValueOf;
        } finally {
            cursorA.close();
        }
    }

    protected final void finalize() {
        this.a.j();
    }
}
