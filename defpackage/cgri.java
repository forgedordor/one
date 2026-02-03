package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgri extends cghe {
    private final Context a;

    public cgri(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.cghe
    public final /* synthetic */ eiju b(Object obj) {
        cgrk cgrkVar = (cgrk) obj;
        cgrkVar.getClass();
        cghf cghfVarG = cghg.g();
        cghfVarG.b(true);
        Context context = this.a;
        cgkr cgkrVarT = cgkt.t();
        cgkrVarT.d(context.getString(R.string.share_pdu_notification_title));
        cggx cggxVar = (cggx) cgkrVarT;
        cggxVar.b = Optional.of(context.getString(R.string.share_pdu_share_prompt));
        cggxVar.a = IconCompat.h(context, R.drawable.notification_icon);
        cgkrVarT.c(context.getColor(R.color.primary_brand_icon_color));
        cggh cgghVar = (cggh) cghfVarG;
        cgghVar.b = cgkrVarT.a();
        kxc kxcVar = new kxc(context);
        kxcVar.c(context.getString(R.string.share_pdu_share_text));
        kxcVar.d("application/text");
        kxcVar.b(cbpu.d(context, cgrkVar.c));
        context.getString(R.string.share_pdu_share_prompt);
        Intent intentA = kxcVar.a();
        intentA.setFlags(268435457);
        cgghVar.c = cgkm.e(intentA, false, Optional.empty(), Optional.empty());
        eiju eijuVarE = eijx.e(cghfVarG.a());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cgiw
    public final cgkq c() {
        return new cgrh();
    }

    @Override // defpackage.cgiw
    public final cglf d() {
        return cglf.NT_SHARE_PDU;
    }

    @Override // defpackage.cgiw
    public final eiju e() {
        eiju eijuVarE = eijx.e(true);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cgiw
    public final String g() {
        return "err";
    }
}
