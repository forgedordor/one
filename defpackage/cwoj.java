package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwoj extends fcyz implements fdat {
    final /* synthetic */ cwom a;
    final /* synthetic */ Intent b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwoj(fcxy fcxyVar, cwom cwomVar, Intent intent) {
        super(2, fcxyVar);
        this.a = cwomVar;
        this.b = intent;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwoj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Intent flags = new Intent("android.intent.action.VIEW").setClassName(this.a.a, "com.google.android.apps.messaging.ui.conversation.rbm.OpenRbmDeepLinkActivity").setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        Intent intent = this.b;
        Intent data = flags.setData(intent.getData());
        data.getClass();
        data.putExtra("android.intent.extra.REFERRER", String.valueOf((Uri) (Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("android.intent.extra.REFERRER", Uri.class) : intent.getParcelableExtra("android.intent.extra.REFERRER"))));
        return ehsj.b(data);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cwoj cwojVar = new cwoj(fcxyVar, this.a, this.b);
        cwojVar.c = obj;
        return cwojVar;
    }
}
