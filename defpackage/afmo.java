package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afmo implements fdpm {
    final /* synthetic */ afmq a;

    public afmo(afmq afmqVar) {
        this.a = afmqVar;
    }

    @Override // defpackage.fdpm
    public final /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        String string;
        afmq afmqVar = this.a;
        Context context = afmqVar.a;
        afmy afmyVar = (afmy) obj;
        if (!cpga.g(context)) {
            return fctx.a;
        }
        if (afmyVar.a() == null && afmyVar.b() == null) {
            return fctx.a;
        }
        if (afmyVar.b() != null) {
            ChipData chipDataB = afmyVar.b();
            chipDataB.getClass();
            string = context.getString(R.string.multi_share_talkback_remove_recipient, chipDataB.b);
        } else {
            ChipData chipDataA = afmyVar.a();
            chipDataA.getClass();
            string = context.getString(R.string.multi_share_talkback_add_recipient, chipDataA.b);
        }
        string.getClass();
        afmqVar.c.a(string);
        return fctx.a;
    }
}
