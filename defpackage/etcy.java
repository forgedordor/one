package defpackage;

import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etcy {
    public static final boolean a;
    public static final esyw b;
    public static final esyw c;
    public static final esyw d;

    static {
        boolean z;
        esyw esywVar;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            int i = etcw.b;
            int i2 = etcx.b;
            b = SqlDateTypeAdapter.a;
            c = SqlTimeTypeAdapter.a;
            esywVar = SqlTimestampTypeAdapter.a;
        } else {
            esywVar = null;
            b = null;
            c = null;
        }
        d = esywVar;
    }
}
