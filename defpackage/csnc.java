package defpackage;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csnc extends fcyz implements fdat {
    int a;
    final /* synthetic */ csne b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csnc(csne csneVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csneVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csnc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            csng csngVar = (csng) this.b.b.b();
            this.a = 1;
            obj = csngVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        csne csneVar = this.b;
        cghf cghfVarG = cghg.g();
        cghfVarG.b(true);
        cggh cgghVar = (cggh) cghfVarG;
        cgghVar.c = cgkm.e(csneVar.h(), false, Optional.empty(), Optional.empty());
        Context context = csneVar.a;
        String string = context.getString(R.string.safetycore_missing_notification_content);
        Optional optionalEmpty = Optional.empty();
        cggx cggxVar = new cggx();
        cggxVar.b(cgks.BIG_TEXT_STYLE);
        cggxVar.b = Optional.empty();
        cggxVar.c = Optional.empty();
        cggxVar.m = Optional.empty();
        cggxVar.o = Optional.empty();
        cggxVar.n = Optional.empty();
        cggxVar.f = Optional.of(string);
        cggxVar.p = optionalEmpty;
        cggxVar.l = Optional.empty();
        cggxVar.i = Optional.empty();
        cggxVar.d = Optional.empty();
        cggxVar.e = Optional.empty();
        cggxVar.j = Optional.empty();
        cggxVar.h = Optional.empty();
        cggxVar.k = Optional.empty();
        cggxVar.g = Optional.empty();
        cggxVar.d(context.getString(R.string.safetycore_missing_notification_title));
        cggxVar.b = Optional.ofNullable(context.getString(R.string.safetycore_missing_notification_content));
        cggxVar.a = IconCompat.h(context, R.drawable.gs_warning_vd_theme_24);
        cggxVar.c(context.getColor(R.color.primary_brand_icon_color));
        cggxVar.d = Optional.of(context.getString(R.string.safetycore_missing_notification_ticker));
        cgghVar.b = cggxVar.a();
        cgghVar.e = Optional.of(ekgb.r(cgis.o(cgit.NAT_INSTALL_SAFETYCORE, IconCompat.h(context, R.drawable.gs_warning_vd_theme_24), context.getString(R.string.safetycore_missing_notification_action_button_text), csneVar.h(), Optional.empty()).a()));
        return cghfVarG.a();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csnc(this.b, fcxyVar);
    }
}
