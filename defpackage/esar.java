package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class esar {
    private final Bundle a;
    private final String b;
    private esbu c;
    private String d;

    protected esar(String str) {
        dclh.k(str);
        this.a = new Bundle();
        this.b = str;
    }

    private static Object[] j(Object[] objArr) {
        if (objArr.length < 100) {
            return objArr;
        }
        esbo.b("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(objArr, 100);
    }

    public final esal a() {
        Bundle bundle = new Bundle(this.a);
        esbu esbuVarA = this.c;
        if (esbuVarA == null) {
            esbuVarA = new esak().a();
        }
        return new Thing(bundle, esbuVarA, this.d, this.b);
    }

    public final void b(String... strArr) {
        d("keywords", strArr);
    }

    protected final void c(String str, esar... esarVarArr) {
        Thing[] thingArr = new Thing[1];
        esar esarVar = esarVarArr[0];
        if (esarVar == null) {
            esbo.b("Builder at 0 is null and is ignored by put method.");
        } else {
            thingArr[0] = (Thing) esarVar.a();
        }
        Bundle bundle = this.a;
        int i = 0;
        for (char c = 0; c <= 0; c = 1) {
            thingArr[i] = thingArr[0];
            if (thingArr[0] == null) {
                esbo.b("Thing at 0 is null and is ignored by put method.");
            } else {
                i++;
            }
        }
        if (i > 0) {
            bundle.putParcelableArray(str, (Parcelable[]) j((Thing[]) Arrays.copyOfRange(thingArr, 0, i)));
        }
    }

    public final void d(String str, String... strArr) {
        dclh.m(strArr);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            esbo.b("String array is empty and is ignored by put method.");
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < Math.min(strArr2.length, 100); i2++) {
            String str2 = strArr2[i2];
            strArr2[i] = str2;
            if (strArr2[i2] == null) {
                esbo.b(a.e(i2, "String at ", " is null and is ignored by put method."));
            } else {
                int i3 = 20000;
                if (str2.length() > 20000) {
                    esbo.b(a.e(i2, "String at ", " is too long, truncating string."));
                    String strSubstring = strArr2[i];
                    if (strSubstring.length() > 20000) {
                        if (Character.isHighSurrogate(strSubstring.charAt(19999)) && Character.isLowSurrogate(strSubstring.charAt(20000))) {
                            i3 = 19999;
                        }
                        strSubstring = strSubstring.substring(0, i3);
                    }
                    strArr2[i] = strSubstring;
                }
                i++;
            }
        }
        if (i > 0) {
            this.a.putStringArray(str, (String[]) j((String[]) Arrays.copyOfRange(strArr2, 0, i)));
        }
    }

    public final void e(esak esakVar) {
        dclh.i(this.c == null, "setMetadata may only be called once");
        this.c = esakVar.a();
    }

    public final void f(String str) {
        dclh.m(str);
        this.d = str;
    }

    public final void g(String str) {
        dclh.m(str);
        d("id", str);
    }

    public final void h(esar... esarVarArr) {
        c("isPartOf", esarVarArr);
    }

    public final void i(String str) {
        dclh.m(str);
        d("name", str);
    }
}
