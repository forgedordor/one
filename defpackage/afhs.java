package defpackage;

import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afhs {
    public static final cqce a = cqce.g("BuglePlacesApiHelper", "PlacesApiHelper");
    public static final Object b = new Object();
    public final Optional e;
    public final eosc f;
    public final fcsu g;
    public final fcsu h;
    public volatile afhp i;
    public WeakReference c = new WeakReference(null);
    public final Object d = new Object();
    public volatile List j = new ArrayList();

    public afhs(Optional optional, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.e = optional;
        this.f = eoscVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
    }

    public final void a() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((afhp) it.next()).a();
        }
        this.j.clear();
    }
}
