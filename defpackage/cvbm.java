package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvbm {
    public static final egyj a = new egyb("SwipeActionSettings");
    public static final egyj b = new egyb("SwipeLeftAction");
    public static final egyj c = new egyb("SwipeRightAction");
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final fcsu e;
    private final fcsu f;

    public cvbm(fcsu fcsuVar, fcsu fcsuVar2) {
        this.e = fcsuVar;
        this.f = fcsuVar2;
    }

    public static String a(Context context, cvbb cvbbVar) {
        int iOrdinal = cvbbVar.ordinal();
        if (iOrdinal == 0) {
            return context.getString(R.string.action_off);
        }
        if (iOrdinal == 1) {
            return context.getString(R.string.action_archive);
        }
        if (iOrdinal == 2) {
            return context.getString(R.string.action_delete);
        }
        if (iOrdinal == 3) {
            return context.getString(R.string.action_mark_as_read_or_unread);
        }
        throw new AssertionError("Encountered unknown swipe action value.");
    }

    public static final cvbb[] d() {
        return new cvbb[]{cvbb.ARCHIVE, cvbb.DELETE, cvbb.MARK_AS_READ_OR_UNREAD, cvbb.NONE};
    }

    public final void b() {
        ((egzh) this.f.b()).a(eijx.e(null), a);
    }

    public final void c(egyj egyjVar) {
        ((egzh) this.f.b()).a(eijx.e(null), egyjVar);
        b();
    }
}
