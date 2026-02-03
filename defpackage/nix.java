package defpackage;

import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nix {
    public static final int a(int i) {
        return i == 7 ? 6 : 3;
    }

    public static final long b(niy niyVar) {
        Throwable cause = niyVar.a;
        if ((cause instanceof mby) || (cause instanceof FileNotFoundException) || (cause instanceof mie) || (cause instanceof njf)) {
            return -9223372036854775807L;
        }
        while (cause != null) {
            if ((cause instanceof mhp) && ((mhp) cause).a == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((niyVar.b - 1) * 1000, 5000);
    }
}
