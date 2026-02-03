package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbyl extends dbya {
    public static final List m = new CopyOnWriteArrayList();
    public final List n;
    public final dbye o;

    public dbyl(Context context, String str, String str2) {
        this(context, str, str2, dcaa.a, null, new dcav(context), new dcbe(context), null, null);
    }

    public static dbyi h(Context context, String str) {
        dbyi dbyiVar = new dbyi(context, str);
        dbyiVar.a(dcaa.b);
        return dbyiVar;
    }

    public static dbyi i(Context context, String str) {
        dbyi dbyiVar = new dbyi(context, str);
        dbyiVar.a(dcaa.c);
        return dbyiVar;
    }

    public static dbyl l(Context context, String str) {
        return h(context, str).c();
    }

    public static dbyl m(Context context, String str) {
        return i(context, str).c();
    }

    @Deprecated
    public final dbyk j(evuh evuhVar) {
        dclh.m(evuhVar);
        return new dbyk(this, evuhVar);
    }

    public final dbyk k(evuh evuhVar, dbzz dbzzVar) {
        dclh.m(evuhVar);
        dbyk dbykVar = new dbyk(this, evuhVar);
        dbykVar.p = dbzzVar;
        return dbykVar;
    }

    public dbyl(Context context, String str, String str2, dcaa dcaaVar, eyek eyekVar, dbym dbymVar, dbzv dbzvVar, dbye dbyeVar, dbyu dbyuVar) {
        super(context, str, str2, dcaaVar, eyekVar, dbymVar, dbzvVar, dbyuVar);
        this.n = new CopyOnWriteArrayList();
        this.o = dbyeVar;
    }
}
