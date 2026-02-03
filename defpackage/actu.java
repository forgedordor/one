package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class actu implements acto {
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/home/banner/HomeBannerDataServiceImpl");
    public final egyt c;
    public final eygg d;
    public final Set e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final egzh g;
    public final fcsu h;
    private final eosc i;

    public actu(eosc eoscVar, egyt egytVar, eygg eyggVar, Set set, egzh egzhVar, fcsu fcsuVar) {
        this.i = eoscVar;
        this.c = egytVar;
        this.d = eyggVar;
        this.e = set;
        this.g = egzhVar;
        this.h = fcsuVar;
    }

    public final eiju a(final ekgb ekgbVar, final int i) {
        return i >= ekgbVar.size() ? eijx.e(actn.m()) : ((acth) ekgbVar.get(i)).b().i(new eooz() { // from class: actp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ekgb ekgbVar2 = ekgbVar;
                int i2 = i;
                return zBooleanValue ? ((acth) ekgbVar2.get(i2)).a() : this.a.a(ekgbVar2, i2 + 1);
            }
        }, this.i);
    }
}
