package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aics extends dbcs {
    private static final ekrg h = ekrg.c("com/google/android/apps/messaging/restore/service/osmigration/SystemAppApiTargetServiceImpl");
    public final Context a;
    public final fcsu b;
    public final fcsu c;
    public final fcyh d;
    public File e;
    public ahwz f;
    public final ahzu g;
    private final fdjx i;

    public aics(ahzv ahzvVar, Context context, fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fcyh fcyhVar) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.i = fdjxVar;
        this.d = fcyhVar;
        this.g = ahzvVar.a(h, null, null);
    }

    @Override // defpackage.dbcs
    public final void b(dbco dbcoVar, fcsf fcsfVar) {
        auvw.k(this.i, null, null, new aicr(this, dbcoVar, fcsfVar, null), 3);
    }

    @Override // defpackage.dbcs
    public final void c(fcsf fcsfVar) {
        dbcf dbcfVar = (dbcf) dbcg.a.createBuilder();
        dbcfVar.getClass();
        fcsfVar.c(dbcfVar.build());
        fcsfVar.a();
    }

    @Override // defpackage.dbcs
    public final void d(fcsf fcsfVar) {
        dbcj dbcjVar = (dbcj) dbck.a.createBuilder();
        dbcjVar.getClass();
        fcsfVar.c(dbcjVar.build());
        fcsfVar.a();
    }
}
