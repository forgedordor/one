package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vhk extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ vhr c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhk(vhr vhrVar, List list, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = vhrVar;
        this.d = list;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vhk vhkVar = new vhk(this.c, this.d, (fcxy) obj3);
        vhkVar.a = (wac) obj;
        vhkVar.b = (aoer) obj2;
        return vhkVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, wac] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r3 = this.a;
        ?? r0 = this.b;
        if (this.c.c instanceof PenpalBotConversationId) {
            return false;
        }
        return Boolean.valueOf(vhr.h(this.d, r3, r0));
    }
}
