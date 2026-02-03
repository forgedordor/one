package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ameq implements anbi {
    public final alxs a;
    public final fcsu b;
    public final Context c;
    public final fcsu d;
    private final amtw e;
    private final ekgp f;
    private final boolean g;
    private final alxh h;
    private final Optional i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;

    public ameq(Context context, alxs alxsVar, fcsu fcsuVar, amtw amtwVar, ekgp ekgpVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, boolean z, alxh alxhVar, Optional optional) {
        this.c = context;
        this.a = alxsVar;
        this.b = fcsuVar;
        this.e = amtwVar;
        this.f = ekgpVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
        this.d = fcsuVar4;
        this.l = fcsuVar5;
        this.g = z;
        this.h = alxhVar;
        this.i = optional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c0 A[PHI: r20
      0x01c0: PHI (r20v4 alxs) = (r20v3 alxs), (r20v7 alxs) binds: [B:51:0x01be, B:48:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2 A[PHI: r20
      0x01c2: PHI (r20v6 alxs) = (r20v3 alxs), (r20v7 alxs) binds: [B:51:0x01be, B:48:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027d A[SYNTHETIC] */
    @Override // defpackage.anbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ekgb a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r32, defpackage.ekgb r33, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r34, defpackage.andw r35, final defpackage.ekgp r36, defpackage.ancl r37, final defpackage.ajts r38) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ameq.a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, ekgb, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, andw, ekgp, ancl, ajts):ekgb");
    }

    public final ekgb b(PartsTable.BindData[] bindDataArr, boolean z) {
        if (!this.g || bindDataArr.length < 2) {
            return ekgb.p(bindDataArr);
        }
        Comparator comparatorComparingInt = Comparator.CC.comparingInt(new ToIntFunction() { // from class: amem
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return Integer.parseInt(((PartsTable.BindData) obj).K());
            }
        });
        if (!z) {
            comparatorComparingInt = Comparator.EL.reversed(comparatorComparingInt);
        }
        Stream streamSorted = DesugarArrays.stream(bindDataArr).sorted(comparatorComparingInt);
        int i = ekgb.d;
        return (ekgb) streamSorted.collect(ekcv.a);
    }

    public final ajlt c(MessagesTable.BindData bindData, ConversationId conversationId, int i, ajts ajtsVar) {
        CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.E(), -1L);
        amej amejVar = amej.a;
        amtn amtnVar = new amtn(i);
        ancl anclVar = ancl.n;
        anpk anpkVar = new anpk(null);
        int i2 = ekgb.d;
        return this.a.a(coreBugleMessageId, conversationId, ajtsVar, bindData, amejVar, amtnVar, anclVar, null, anpkVar, false, ekoe.a, new amen());
    }
}
