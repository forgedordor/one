package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class echn {
    public static File a(echo echoVar, Uri uri) throws ecgh {
        throw new ecgh("Cannot convert uri to file " + echoVar.i() + " " + String.valueOf(uri));
    }

    public static Iterable b(echo echoVar) throws ecgh {
        throw new ecgh("children not supported by ".concat(echoVar.i()));
    }

    public static void c(echo echoVar) throws ecgh {
        throw new ecgh("createDirectory not supported by ".concat(echoVar.i()));
    }

    public static void d(echo echoVar) throws ecgh {
        throw new ecgh("deleteDirectory not supported by ".concat(echoVar.i()));
    }

    public static long e(echo echoVar) throws ecgh {
        throw new ecgh("fileSize not supported by ".concat(echoVar.i()));
    }

    public static OutputStream f(echo echoVar) throws ecgh {
        throw new ecgh("openForAppend not supported by ".concat(echoVar.i()));
    }
}
