package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class echt {
    public static OutputStream a(echu echuVar, OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new ecgh("wrapForAppend not supported by ".concat(echuVar.c()));
    }
}
