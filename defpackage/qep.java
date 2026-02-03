package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qep {
    public final pzd a;
    public final qhx b;
    public final WorkDatabase c;
    public final qjn d;
    public final List e;
    public final Context f;
    public qcd g;
    public final qmg h;

    public qep(Context context, pzd pzdVar, qmg qmgVar, qhx qhxVar, WorkDatabase workDatabase, qjn qjnVar, List list) {
        context.getClass();
        workDatabase.getClass();
        this.a = pzdVar;
        this.h = qmgVar;
        this.b = qhxVar;
        this.c = workDatabase;
        this.d = qjnVar;
        this.e = list;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f = applicationContext;
        this.g = new qcd();
    }
}
