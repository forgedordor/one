package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwaj extends fcyz implements fday {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    final /* synthetic */ cwam g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwaj(cwam cwamVar, fcxy fcxyVar) {
        super(7, fcxyVar);
        this.g = cwamVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cwam cwamVar = this.g;
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        dihq dihqVar = (dihq) obj5;
        dihq dihqVar2 = (dihq) obj3;
        return cwamVar.b(r1, (ekgb) obj2, cwamVar.b instanceof PenpalBotConversationId, dihqVar2, (dihq) obj4, dihqVar, (dihq) this.f);
    }

    @Override // defpackage.fday
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        cwaj cwajVar = new cwaj(this.g, (fcxy) obj7);
        cwajVar.a = (ajlk) obj;
        cwajVar.b = (ekgb) obj2;
        cwajVar.c = (dihq) obj3;
        cwajVar.d = (dihq) obj4;
        cwajVar.e = (dihq) obj5;
        cwajVar.f = (dihq) obj6;
        return cwajVar.b(fctx.a);
    }
}
