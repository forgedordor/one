package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class asoj {
    public static final cqce a = cqce.g("Bugle", "RbmBusinessInfoUrlHelper");
    public final CronetEngine b;
    public final eosc c;
    public final crmx d;
    public final Context e;
    public final fcsu f;
    private final ewto g;
    private final ewto h;

    public asoj(CronetEngine cronetEngine, eosc eoscVar, crmx crmxVar, Context context, fcsu fcsuVar, ewto ewtoVar, ewto ewtoVar2) {
        this.b = cronetEngine;
        this.c = eoscVar;
        this.d = crmxVar;
        this.e = context;
        this.f = fcsuVar;
        this.g = ewtoVar;
        this.h = ewtoVar2;
    }

    public static aslc a(String str) {
        return new aslc((String) new eleo(elet.a()).b(str).orElse(str), new elep(elet.a()).b(str));
    }

    public final boolean b(String str) {
        return this.g.b.contains(str) || this.h.b.contains(str);
    }
}
