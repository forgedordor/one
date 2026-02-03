package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctix implements fdpm {
    final /* synthetic */ ctiz a;

    public ctix(ctiz ctizVar) {
        this.a = ctizVar;
    }

    @Override // defpackage.fdpm
    public final /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        String string;
        ctiz ctizVar = this.a;
        Context context = ctizVar.a;
        cudx cudxVar = (cudx) obj;
        if (!cpga.g(context)) {
            return fctx.a;
        }
        ChipData chipData = cudxVar.b;
        if (chipData == null && cudxVar.c == null) {
            return fctx.a;
        }
        ChipData chipData2 = cudxVar.c;
        if (chipData2 != null) {
            string = context.getString(R.string.start_chat_talkback_remove_contact, chipData2.b);
        } else {
            chipData.getClass();
            string = context.getString(R.string.start_chat_talkback_add_contact, chipData.b);
        }
        string.getClass();
        ctizVar.c.a(string);
        return fctx.a;
    }
}
