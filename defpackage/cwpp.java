package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwpp extends fcyz implements fdat {
    final /* synthetic */ cwpt a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwpp(fcxy fcxyVar, cwpt cwptVar, Uri uri) {
        super(2, fcxyVar);
        this.a = cwptVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwpp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Intent data = new Intent("android.intent.action.VIEW").setClassName(this.a.b, "com.google.android.apps.messaging.ui.conversation.LaunchConversationActivity").setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM).setData(this.b);
        data.getClass();
        return ehsj.b(data);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cwpp cwppVar = new cwpp(fcxyVar, this.a, this.b);
        cwppVar.c = obj;
        return cwppVar;
    }
}
