package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class peu {
    public Executor b;
    public pjs c;
    public boolean d;
    public boolean g;
    public fcyh h;
    private final fddy i;
    private final Context j;
    private final String k;
    private Executor m;
    public final List a = new ArrayList();
    private final List l = new ArrayList();
    private final pew n = new pew();
    public final Set e = new LinkedHashSet();
    private final Set o = new LinkedHashSet();
    private final List p = new ArrayList();
    public boolean f = true;

    public peu(Context context, Class cls, String str) {
        this.i = fdab.c(cls);
        this.j = context;
        this.k = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x041c, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pex a() {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.peu.a():pex");
    }

    public final void b(phj... phjVarArr) {
        int length;
        int i = 0;
        while (true) {
            length = phjVarArr.length;
            if (i >= length) {
                break;
            }
            phj phjVar = phjVarArr[0];
            Set set = this.o;
            set.add(Integer.valueOf(phjVar.a));
            set.add(Integer.valueOf(phjVar.b));
            i = 1;
        }
        pew pewVar = this.n;
        phj[] phjVarArr2 = (phj[]) Arrays.copyOf(phjVarArr, length);
        phjVarArr2.getClass();
        for (phj phjVar2 : phjVarArr2) {
            pewVar.a(phjVar2);
        }
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }

    public final void d(fcyh fcyhVar) {
        fcyhVar.getClass();
        if (this.m != null || this.b != null) {
            throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
        }
        if (fcyhVar.get(fcya.k) == null) {
            throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
        }
        this.h = fcyhVar;
    }

    public final void e(Executor executor) {
        if (this.h != null) {
            throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
        }
        this.m = executor;
    }
}
