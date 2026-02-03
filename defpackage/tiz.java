package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tiz implements fdpm {
    final /* synthetic */ tjf a;

    public tiz(tjf tjfVar) {
        this.a = tjfVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ((Boolean) obj).booleanValue();
        tjf tjfVar = this.a;
        String string = tjfVar.a.getString(R.string.blocked_recipients_in_conversation_message);
        string.getClass();
        Object objA = tjfVar.d.a(new aafw(string, null, true, 0, null, 117), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
