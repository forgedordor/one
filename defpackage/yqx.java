package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yqx implements fdap {
    final /* synthetic */ fdis a;
    final /* synthetic */ yrg b;

    public yqx(fdis fdisVar, yrg yrgVar) {
        this.a = fdisVar;
        this.b = yrgVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
        ahat ahatVar = (ahat) obj;
        ahatVar.getClass();
        yqt yqtVar = new yqt(ahatVar);
        fdis fdisVar = this.a;
        fdisVar.d(yqtVar);
        Context context = this.b.b;
        String quantityString = context.getResources().getQuantityString(R.plurals.delete_message_confirmation_dialog_title, 1, 1);
        String string = context.getString(R.string.delete_message_confirmation_dialog_text);
        string.getClass();
        String string2 = context.getString(R.string.delete_message_confirmation_button);
        string2.getClass();
        dktq dktqVar = new dktq(string2, new yqu(fdisVar));
        String string3 = context.getString(android.R.string.cancel);
        string3.getClass();
        return new djmj(string, null, null, quantityString, false, false, dktqVar, new dktq(string3, new yqv(fdisVar)), new yqw(fdisVar), 54);
    }
}
