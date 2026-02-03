package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alzg implements andi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds");
    public final fdap b;
    private final alyy c;
    private final eosc d;
    private final boolean e;

    public alzg(alyz alyzVar, eosc eoscVar, final alza alzaVar, boolean z) {
        this.c = alyzVar.a(z);
        this.d = eoscVar;
        this.b = new fdap() { // from class: alzd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ajlt ajltVar = (ajlt) obj;
                return alzaVar.ad(ajltVar.b(), ajltVar.o());
            }
        };
        this.e = z;
    }

    static final void e(boolean z, String str) {
        if (z) {
            return;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleMapi");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "checkConsistency", 329, "BuglePagingClipToBounds.java")).t("PagingClipToBounds check consistency failed: %s", str);
    }

    public static final ekgb f(ekgb ekgbVar, int i, int i2) {
        int iMin = Math.min(i2, ekgbVar.size());
        if (i < 0) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "subList", 303, "BuglePagingClipToBounds.java")).q("Correcting clip to bounds newStart, previously was out of bounds");
            i = 0;
        }
        ekrw ekrwVarH2 = a.h();
        ekrwVarH2.X(eksq.a, "BugleMapi");
        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "subList", 307, "BuglePagingClipToBounds.java")).I("clipping message list, newStart: %d, newEnd (exclusive) %d, list's size: %d", Integer.valueOf(i), Integer.valueOf(iMin), Integer.valueOf(ekgbVar.size()));
        return ekgbVar.subList(i, iMin);
    }

    public final boolean a(ekgb ekgbVar) {
        if (!this.e || ekgbVar.size() < 2) {
            return false;
        }
        return (((ajlt) ekgbVar.get(0)).b() instanceof CoreBuglePartialMessageId) || (((ajlt) ekis.j(ekgbVar)).b() instanceof CoreBuglePartialMessageId);
    }

    public final void b(andk andkVar, int i) {
        long j = andkVar.b;
        e(j >= 0, "PagingResults itemsBefore cannot be negative");
        long j2 = andkVar.c;
        e(j2 >= 0, "PagingResults itemsAfter cannot be negative");
        e(andkVar.a.size() >= i || j2 == 0 || j == 0, "PagingResults cannot have remaining items before and after if the returned list's size is less than the limit requested.");
    }

    public final eiju c(final ekgb ekgbVar, final int i, boolean z) {
        if (!a(ekgbVar)) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/api/messaging/message/BuglePagingClipToBounds", "clip", 61, "BuglePagingClipToBounds.java")).I("returning message list without clipping, offset: %d, limit %d, list's size: %d", 0, Integer.valueOf(i), Integer.valueOf(ekgbVar.size()));
            return eijx.e(ekgbVar);
        }
        ajlt ajltVar = (ajlt) ekgbVar.get(0);
        if (!(ajltVar.b() instanceof CoreBuglePartialMessageId)) {
            return eijx.e(f(ekgbVar, 0, i));
        }
        CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) ajltVar.b();
        return this.c.e((BugleConversationId) ajltVar.f(), coreBuglePartialMessageId.a, coreBuglePartialMessageId.b, ajltVar.o().toEpochMilli(), z).h(new ejvr() { // from class: alzf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Integer num = (Integer) obj;
                alzg.e(num.intValue() <= 0, "underlying data changed between queries");
                int i2 = -num.intValue();
                return alzg.f(ekgbVar, i2, i + i2);
            }
        }, this.d);
    }

    @Override // defpackage.andi
    public final eiju d(final andk andkVar, final int i, final int i2) {
        final ekgb ekgbVar = andkVar.a;
        if (!a(ekgbVar)) {
            b(andkVar, i2);
            return eijx.e(andkVar);
        }
        ajlt ajltVar = (ajlt) ekgbVar.get(0);
        if (!(ajltVar.b() instanceof CoreBuglePartialMessageId)) {
            andk andkVar2 = new andk(f(ekgbVar, 0, i2), andkVar.b, andkVar.c + Math.max(0, ekgbVar.size() - i2), this.b);
            b(andkVar2, i2);
            return eijx.e(andkVar2);
        }
        CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) ajltVar.b();
        return this.c.e((BugleConversationId) ajltVar.f(), coreBuglePartialMessageId.a, coreBuglePartialMessageId.b, ajltVar.o().toEpochMilli(), false).h(new ejvr() { // from class: alze
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                int i3 = i;
                alzg.e(i3 >= iIntValue, "underlying data changed between queries");
                int iIntValue2 = i3 - num.intValue();
                ekgb ekgbVar2 = ekgbVar;
                int i4 = i2;
                ekgb ekgbVarF = alzg.f(ekgbVar2, iIntValue2, i4 + iIntValue2);
                int size = ekgbVar2.size() - ekgbVarF.size();
                andk andkVar3 = andkVar;
                long j = andkVar3.c + size;
                alzg alzgVar = this.a;
                andk andkVar4 = new andk(ekgbVarF, andkVar3.b, j, alzgVar.b);
                alzgVar.b(andkVar4, i4);
                return andkVar4;
            }
        }, this.d);
    }
}
