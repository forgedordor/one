package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amsp implements cqto {
    final /* synthetic */ amsq a;

    public amsp(amsq amsqVar) {
        this.a = amsqVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        auap auapVar = new auap() { // from class: amsn
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                BugleConversationId bugleConversationId = new BugleConversationId(barn.b((String) obj));
                amsq amsqVar = this.a.a;
                return !amsqVar.e.equals(bugleConversationId) ? eijx.e(null) : amsqVar.d();
            }
        };
        amsq amsqVar = this.a;
        amsqVar.h = cqty.b(amsqVar.a.a(auapVar), amsqVar.f.a(new anpi() { // from class: amso
            @Override // defpackage.anpi
            public final eiju a() {
                return this.a.a.d();
            }
        }));
    }

    @Override // defpackage.cqto
    public final void fK() {
        amsq amsqVar = this.a;
        cquc cqucVar = amsqVar.h;
        cqucVar.getClass();
        cqucVar.a();
        amsqVar.h = null;
    }
}
