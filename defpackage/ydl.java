package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ydl extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ int b;
    final /* synthetic */ yek c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydl(yek yekVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = yekVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        ydl ydlVar = new ydl(this.c, (fcxy) obj3);
        ydlVar.a = zBooleanValue;
        ydlVar.b = iIntValue;
        return ydlVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        int i = this.b;
        yek yekVar = this.c;
        Context context = yekVar.n;
        return dlbr.a(yekVar.L, z, qxq.b(context, R.string.conversation_scroll_to_bottom_button_content_description, "count", new Integer(i)), yek.a(i, context), null, 24);
    }
}
