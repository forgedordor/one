package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiFunction$CC;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtx implements dnhm {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger");
    private final Context b;
    private final ConcurrentMap c;
    private final airm d;

    public vtx(Context context, ConcurrentMap concurrentMap, airm airmVar) {
        context.getClass();
        concurrentMap.getClass();
        this.b = context;
        this.c = concurrentMap;
        this.d = airmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(int r9, defpackage.vtr r10, java.lang.Integer r11) {
        /*
            r8 = this;
            emop r0 = defpackage.emop.a
            evsf r0 = r0.createBuilder()
            emoo r0 = (defpackage.emoo) r0
            emnc r0 = defpackage.emnb.a(r0)
            int r1 = r10.b
            defpackage.vtz.b(r0, r1)
            boolean r10 = r10.a
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            defpackage.vtp.a(r0, r1, r10)
            emop r4 = r0.a()
            r10 = 0
            if (r11 == 0) goto L2a
            r11.intValue()
            r0 = 3
            if (r1 != r0) goto L28
            goto L2a
        L28:
            r6 = r11
            goto L2b
        L2a:
            r6 = r10
        L2b:
            airm r2 = r8.d
            r5 = 0
            r7 = 20
            r3 = r9
            defpackage.airm.b(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtx.d(int, vtr, java.lang.Integer):void");
    }

    @Override // defpackage.dnhm
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dnnp dnnpVar = (dnnp) obj;
        final vtr vtrVarA = vtq.a(dnnpVar, aiuw.a(this.b));
        ekrw ekrwVarF = a.f();
        ekrwVarF.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger", "onAddedToDraft", 34, "EmojiUsageLogger.kt")).t("EmojiUsageLogger.onAddedToDraft %s", vtrVarA);
        final fdat fdatVar = new fdat() { // from class: vtv
            @Override // defpackage.fdat
            public final Object a(Object obj2, Object obj3) {
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                num.getClass();
                num2.getClass();
                if (num.intValue() > 0) {
                    return Integer.valueOf(num.intValue() + num2.intValue());
                }
                throw new IllegalArgumentException("EmojiUsage added to draft but has non-positive cache value " + num + ": " + vtrVarA);
            }
        };
        ConcurrentMap.EL.merge(this.c, vtrVarA, 1, new BiFunction() { // from class: vtw
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                return fdatVar.a(obj2, obj3);
            }
        });
        d(2, vtrVarA, dnnpVar.c);
    }

    @Override // defpackage.dnhm
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        dnnp dnnpVar = (dnnp) obj;
        final vtr vtrVarA = vtq.a(dnnpVar, aiuw.a(this.b));
        ekrg ekrgVar = a;
        ekrw ekrwVarF = ekrgVar.f();
        ekrz ekrzVar = eksq.a;
        ekrwVarF.X(ekrzVar, "BugleComposeRow2");
        ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger", "onRemovedFromDraft", 47, "EmojiUsageLogger.kt")).t("EmojiUsageLogger.onRemovedFromDraft %s", vtrVarA);
        final fdce fdceVar = new fdce();
        final fdat fdatVar = new fdat() { // from class: vtt
            @Override // defpackage.fdat
            public final Object a(Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj3).intValue();
                if (iIntValue > 0) {
                    fdceVar.a = true;
                    Integer numValueOf = Integer.valueOf(iIntValue - 1);
                    if (numValueOf.intValue() > 0) {
                        return numValueOf;
                    }
                    return null;
                }
                throw new IllegalArgumentException("EmojiUsage removed from draft but has non-positive cache value " + iIntValue + ": " + vtrVarA);
            }
        };
        ConcurrentMap.EL.computeIfPresent(this.c, vtrVarA, new BiFunction() { // from class: vtu
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                return fdatVar.a(obj2, obj3);
            }
        });
        if (!fdceVar.a) {
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/EmojiUsageLogger", "onRemovedFromDraft", 58, "EmojiUsageLogger.kt")).t("EmojiUsage removed from draft but was not in cache: %s", vtrVarA);
        }
        d(4, vtrVarA, dnnpVar.c);
    }

    @Override // defpackage.dnhm
    public final void b(List list) {
    }
}
