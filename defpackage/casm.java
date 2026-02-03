package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class casm {
    public final AtomicReference a;
    private final casl b;

    public casm(Context context, eigp eigpVar) {
        eigpVar.getClass();
        casl caslVar = new casl(this, eigpVar);
        this.b = caslVar;
        this.a = new AtomicReference();
        context.getContentResolver().registerContentObserver(Uri.parse(bace.m(context)), false, caslVar);
        context.getContentResolver().registerContentObserver(Uri.parse(bace.m(context).concat("participants")), true, caslVar);
        context.getContentResolver().registerContentObserver(bace.l(context), true, caslVar);
        context.getContentResolver().registerContentObserver(bace.i(context), false, caslVar);
    }
}
