package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajpk {
    public final alqm a;
    public final String b;
    private final Resources c;
    private final int d;
    private final String e;

    public ajpk(Context context, alrj alrjVar, int i, String str) {
        this.c = context.getResources();
        this.d = i;
        this.e = null;
        alqm alqmVarN = alrjVar.n(str);
        this.a = alqmVarN;
        this.b = alqmVarN.F().toString();
    }

    public final String a() {
        int i = this.d;
        if (i == 0) {
            String str = this.e;
            if (str != null) {
                int iCharCount = 0;
                while (iCharCount < str.length()) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (!Character.isWhitespace(iCodePointAt)) {
                        return str;
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            i = 0;
        }
        return this.c.getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(i));
    }

    public ajpk(Context context, alrj alrjVar, int i, String str, String str2, String str3) {
        this.c = context.getResources();
        this.d = i;
        this.e = str;
        this.a = alrjVar.n(str2);
        this.b = str3;
    }
}
