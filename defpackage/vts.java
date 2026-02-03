package defpackage;

import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vts {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageCacheAccessor");
    private final ConcurrentMap b;

    public vts(ConcurrentMap concurrentMap) {
        concurrentMap.getClass();
        this.b = concurrentMap;
    }

    public final ekgp a() {
        return ekfv.e(this.b);
    }

    public final void b() {
        ekrw ekrwVarF = a.f();
        ekrwVarF.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageCacheAccessor", "clearCachedEmojiUsage", 21, "EmojiUsageCacheAccessor.kt")).q("EmojiUsageCacheAccessor clearing cached emoji usage.");
        this.b.clear();
    }
}
