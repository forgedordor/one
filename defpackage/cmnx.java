package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmnx {
    private final alrj a;
    private final fcsu b;

    public cmnx(alrj alrjVar, fcsu fcsuVar) {
        this.a = alrjVar;
        this.b = fcsuVar;
    }

    public final alqm a(Cursor cursor) {
        int i = cursor.getInt(1);
        String string = cursor.getString(0);
        if (string == null) {
            throw new cmnw();
        }
        String strA = cmod.a(cmod.b(string, 4), i);
        alrj alrjVar = this.a;
        return alrjVar.x(alrjVar.h(alrjVar.n(strA), strA));
    }
}
