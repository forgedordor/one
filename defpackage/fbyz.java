package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbyz {
    public final fbyq a;
    public final fbyy b = new fbyy(this);
    public final fbrg c;
    public final fbrk d;
    public volatile String e;
    final /* synthetic */ fbzb f;
    private final fbnc g;

    public fbyz(fbzb fbzbVar, fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, String str, fcmm fcmmVar) {
        this.f = fbzbVar;
        this.d = fbrkVar;
        this.c = fbrgVar;
        this.g = fbncVar;
        this.e = str;
        this.a = new fbyq(this, fbncVar, fcmmVar);
    }

    public final void a() {
        fbzb fbzbVar = this.f;
        synchronized (fbzbVar) {
            Set set = fbzbVar.j;
            boolean zRemove = set.remove(this);
            if (fcdy.j(this.g)) {
                fbzbVar.m.c(this, false);
            }
            if (set.isEmpty() && zRemove && fbzbVar.i) {
                fbzbVar.h();
            }
        }
    }
}
