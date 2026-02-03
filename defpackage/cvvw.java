package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvvw extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cvvx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvvw(cvvx cvvxVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = cvvxVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cvvw cvvwVar = new cvvw(this.d, (fcxy) obj4);
        cvvwVar.a = (ajlk) obj;
        cvvwVar.b = (cvvy) obj2;
        cvvwVar.c = (cvvy) obj3;
        return cvvwVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r4 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        if (!(this.d.c instanceof PenpalBotConversationId)) {
            return r4.c() == ajlj.GROUP ? obj3 : obj2;
        }
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        return new cvvy(ekgbVar);
    }
}
