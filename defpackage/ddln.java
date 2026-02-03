package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddln extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddln(Context context, int i) {
        super(context, "primes_example_store", (SQLiteDatabase.CursorFactory) null, i);
        int i2 = ddlp.b;
        ddlm ddlmVar = ddlk.a;
    }
}
