package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.provider.BlockedNumberContract;
import j$.util.Optional;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpio {
    private static final cqce b = cqce.g("BugleDataModel", "BlockedNumberWrapper");
    private final Context c;
    private final cmvy d;
    final Set a = new css();
    private boolean e = false;

    public cpio(Context context, cmvy cmvyVar) {
        this.c = context;
        this.d = cmvyVar;
    }

    public final Optional a(String str) {
        boolean z;
        if (this.d.h(str)) {
            cqbd cqbdVarD = b.d();
            cqbdVarD.I("Checking is blocked against the in memory alpha blocked list");
            cqbdVarD.k(str);
            cqbdVarD.r();
            Set set = this.a;
            synchronized (set) {
                synchronized (set) {
                    if (!this.e) {
                        b();
                    }
                    z = this.e;
                }
            }
            if (z) {
                return Optional.of(Boolean.valueOf(this.a.contains(str.toLowerCase(Locale.US))));
            }
        }
        try {
            return Optional.of(Boolean.valueOf(BlockedNumberContract.isBlocked(this.c, str)));
        } catch (Throwable th) {
            b.s(true != (th instanceof SecurityException) ? "This device appears to have a SystemBlockList, but its block list is not available at the URI content://com.android.blockednumber" : "Insufficient permissions to query BlockedNumberContract", th);
            return Optional.empty();
        }
    }

    public final void b() {
        Set set = this.a;
        synchronized (set) {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = this.c.getContentResolver().query(BlockedNumberContract.BlockedNumbers.CONTENT_URI, new String[]{"original_number"}, null, null, null);
                    set.clear();
                } catch (Exception e) {
                    b.o("Couldn't load blocked numbers", e);
                    if (cursorQuery != null) {
                    }
                }
                if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                    return;
                }
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    if (this.d.h(string)) {
                        set.add(string.toLowerCase(Locale.US));
                        cqbd cqbdVarD = b.d();
                        cqbdVarD.I("Loading blocked alpha short code sender in memory");
                        cqbdVarD.k(string);
                        cqbdVarD.r();
                    }
                }
                this.e = true;
                cursorQuery.close();
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
    }
}
