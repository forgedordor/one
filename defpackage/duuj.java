package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duuj {
    public static SharedPreferences a(Context context, String str, ejwi ejwiVar) {
        return context.getSharedPreferences(d(str, ejwiVar), 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [evuh, java.lang.Object] */
    public static evuh b(String str, evuo evuoVar) throws evtj {
        try {
            byte[] bArrDecode = Base64.decode(str, 3);
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            return evuoVar.l(bArrDecode, evrr.a);
        } catch (IllegalArgumentException e) {
            throw new evtj("Unable to decode to byte array", new IOException(e));
        }
    }

    public static evuh c(SharedPreferences sharedPreferences, String str, evuo evuoVar) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return b(string, evuoVar);
        } catch (evtj unused) {
            return null;
        }
    }

    public static String d(String str, ejwi ejwiVar) {
        return (ejwiVar == null || !ejwiVar.g()) ? str : str.concat((String) ejwiVar.c());
    }

    public static String e(evuh evuhVar) {
        return Base64.encodeToString(evuhVar.toByteArray(), 3);
    }

    public static void f(SharedPreferences.Editor editor, String str) {
        editor.remove(str);
    }

    public static void g(SharedPreferences.Editor editor, String str, evuh evuhVar) {
        editor.putString(str, e(evuhVar));
    }

    public static boolean h(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    public static boolean i(SharedPreferences sharedPreferences, String str, evuh evuhVar) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        g(editorEdit, str, evuhVar);
        return editorEdit.commit();
    }
}
