package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wyd implements fdap {
    final /* synthetic */ fdis a;
    final /* synthetic */ wyf b;

    public wyd(fdis fdisVar, wyf wyfVar) {
        this.a = fdisVar;
        this.b = wyfVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ahat ahatVar = (ahat) obj;
        ahatVar.getClass();
        wxz wxzVar = new wxz(ahatVar);
        fdis fdisVar = this.a;
        fdisVar.d(wxzVar);
        Context context = this.b.b;
        String string = context.getString(R.string.request_exact_alarm_permission);
        string.getClass();
        String string2 = context.getString(android.R.string.cancel);
        string2.getClass();
        dktq dktqVar = new dktq(string2, new wya(fdisVar));
        String string3 = context.getString(android.R.string.ok);
        string3.getClass();
        return new djmj(string, null, null, null, false, false, new dktq(string3, new wyb(fdisVar)), dktqVar, new wyc(fdisVar), 62);
    }
}
