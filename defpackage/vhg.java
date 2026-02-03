package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vhg extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ vhr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhg(vhr vhrVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = vhrVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        vhg vhgVar = new vhg(this.d, (fcxy) obj4);
        vhgVar.a = (zqw) obj;
        vhgVar.b = (wac) obj2;
        vhgVar.c = (aoer) obj3;
        return vhgVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, wac] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aoer, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        final ?? r2 = this.b;
        final ?? r3 = this.c;
        final vhr vhrVar = this.d;
        if (vhrVar.c instanceof PenpalBotConversationId) {
            return null;
        }
        String string = vhrVar.b.getString(R.string.delete_message_action);
        string.getClass();
        final zqw zqwVar = (zqw) obj2;
        return new dihq(string, djrr.aG, false, false, false, false, null, false, null, new fdae() { // from class: vhe
            @Override // defpackage.fdae
            public final Object invoke() throws Resources.NotFoundException {
                List list = zqwVar.a;
                boolean zH = vhr.h(list, r2, r3);
                vhr vhrVar2 = vhrVar;
                vhrVar2.e(list, zH, new vhf(vhrVar2.f));
                return fctx.a;
            }
        }, 1020);
    }
}
