package androidx.work;

import defpackage.fcyh;
import defpackage.pzs;
import defpackage.qab;
import defpackage.qbx;
import defpackage.qcd;
import defpackage.qmg;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;
    public final pzs b;
    public final Set c;
    public final qcd d;
    public final int e;
    public final Executor f;
    public final fcyh g;
    public final qbx h;
    public final qab i;
    public final qmg j;

    public WorkerParameters(UUID uuid, pzs pzsVar, Collection collection, qcd qcdVar, int i, Executor executor, fcyh fcyhVar, qmg qmgVar, qbx qbxVar, qab qabVar) {
        this.a = uuid;
        this.b = pzsVar;
        this.c = new HashSet(collection);
        this.d = qcdVar;
        this.e = i;
        this.f = executor;
        this.g = fcyhVar;
        this.j = qmgVar;
        this.h = qbxVar;
        this.i = qabVar;
    }
}
