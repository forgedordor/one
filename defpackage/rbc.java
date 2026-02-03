package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbc extends ContextWrapper {
    static final rbw a = new rau();
    public final rig b;
    public final rtv c;
    public final List d;
    public final Map e;
    public final rhh f;
    public final rbe g;
    public final int h;
    private final rvc i;
    private final rav j;
    private rtj k;

    public rbc(Context context, rig rigVar, rvc rvcVar, rtv rtvVar, rav ravVar, Map map, List list, rhh rhhVar, rbe rbeVar) {
        super(context.getApplicationContext());
        this.b = rigVar;
        this.c = rtvVar;
        this.j = ravVar;
        this.d = list;
        this.e = map;
        this.f = rhhVar;
        this.g = rbeVar;
        this.h = 4;
        this.i = new rvb(rvcVar);
    }

    public final rbn a() {
        return (rbn) this.i.a();
    }

    public final synchronized rtj b() {
        if (this.k == null) {
            rtj rtjVarA = this.j.a();
            rtjVarA.aj();
            this.k = rtjVarA;
        }
        return this.k;
    }
}
