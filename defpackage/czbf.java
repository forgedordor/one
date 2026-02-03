package defpackage;

import android.content.Context;
import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czbf {
    private final fcsu a;
    private final fcsu b;

    public czbf(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
    }

    public final czbe a(Cursor cursor) {
        Context context = (Context) this.a.b();
        context.getClass();
        cqmz cqmzVar = (cqmz) this.b.b();
        cqmzVar.getClass();
        cursor.getClass();
        return new czbe(context, cqmzVar, cursor);
    }
}
