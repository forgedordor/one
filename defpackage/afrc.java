package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afrc extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ int b;
    final /* synthetic */ afrd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afrc(afrd afrdVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = afrdVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        afrc afrcVar = new afrc(this.c, (fcxy) obj3);
        afrcVar.a = (String) obj;
        afrcVar.b = iIntValue;
        return afrcVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        afrd afrdVar = this.c;
        Context context = afrdVar.a;
        ?? r3 = this.a;
        int i = this.b;
        String string = context.getString(R.string.multi_share_bottom_compose_row_text_placeholder);
        string.getClass();
        return new djcv(afrdVar.h, r3, string, new Integer(i), 0, true, null, new djcu(afrdVar.e.a(), afrdVar.f.a()), 80);
    }
}
