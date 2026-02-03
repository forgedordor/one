package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yrf implements fdap {
    final /* synthetic */ fdis a;
    final /* synthetic */ yrg b;

    public yrf(fdis fdisVar, yrg yrgVar) {
        this.a = fdisVar;
        this.b = yrgVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
        ahat ahatVar = (ahat) obj;
        ahatVar.getClass();
        yrb yrbVar = new yrb(ahatVar);
        fdis fdisVar = this.a;
        fdisVar.d(yrbVar);
        Context context = this.b.b;
        String string = context.getResources().getString(R.string.scheduled_message_overwrite_draft_message);
        string.getClass();
        String string2 = context.getResources().getString(R.string.scheduled_message_dialog_continue);
        string2.getClass();
        dktq dktqVar = new dktq(string2, new yrc(fdisVar));
        String string3 = context.getResources().getString(R.string.scheduled_message_dialog_back);
        string3.getClass();
        return new djmj(string, null, null, null, false, false, dktqVar, new dktq(string3, new yrd(fdisVar)), new yre(fdisVar), 62);
    }
}
