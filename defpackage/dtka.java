package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtka implements kal {
    public static final dtka a = new dtka();
    public static final Paint b = new Paint();
    private static final Map c = new LinkedHashMap();

    private dtka() {
    }

    public static final File c(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // defpackage.kal
    public final Typeface a(Context context, kam kamVar) {
        context.getClass();
        kamVar.getClass();
        Objects.toString(kamVar);
        throw new IllegalStateException("GoogleFont only support async loading: ".concat(kamVar.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.kal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r19, defpackage.kam r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtka.b(android.content.Context, kam, fcxy):java.lang.Object");
    }
}
