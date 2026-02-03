package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgrf extends cghe {
    private final Context a;
    private final avmp b;

    public cgrf(Context context, avmp avmpVar) {
        context.getClass();
        avmpVar.getClass();
        this.a = context;
        this.b = avmpVar;
    }

    @Override // defpackage.cghe
    public final /* synthetic */ eiju b(Object obj) {
        cghf cghfVarG = cghg.g();
        cghfVarG.b(true);
        avmp avmpVar = this.b;
        Context context = this.a;
        Intent intentE = avmpVar.e(context);
        intentE.putExtra("via_notification", true);
        cgkm cgkmVarE = cgkm.e(intentE, true, Optional.empty(), Optional.empty());
        cggh cgghVar = (cggh) cghfVarG;
        cgghVar.c = cgkmVarE;
        cgkr cgkrVarT = cgkt.t();
        cgkrVarT.d(context.getString(R.string.secondary_user_notification_title));
        cggx cggxVar = (cggx) cgkrVarT;
        cggxVar.a = IconCompat.h(context, R.drawable.notification_icon);
        cgkrVarT.c(context.getColor(R.color.primary_brand_icon_color));
        cggxVar.d = Optional.of(context.getString(R.string.secondary_user_notification_ticker));
        cgghVar.b = cgkrVarT.a();
        eiju eijuVarE = eijx.e(cghfVarG.a());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cgiw
    public final cgkq c() {
        return new cgre();
    }

    @Override // defpackage.cgiw
    public final cglf d() {
        return cglf.NT_SECONDARY_USER;
    }

    @Override // defpackage.cgiw
    public final eiju e() {
        eiju eijuVarE = eijx.e(true);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cgiw
    public final String g() {
        return "msg";
    }
}
